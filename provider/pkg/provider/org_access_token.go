package provider

import (
	"context"
	"fmt"
	"strings"

	pbempty "github.com/golang/protobuf/ptypes/empty"
	"github.com/pulumi/pulumi-pulumiservice/provider/pkg/internal/pulumiapi"
	"github.com/pulumi/pulumi/sdk/v3/go/common/resource"
	"github.com/pulumi/pulumi/sdk/v3/go/common/resource/plugin"
	pulumirpc "github.com/pulumi/pulumi/sdk/v3/proto/go"
)

type PulumiServiceOrgAccessTokenResource struct {
	client *pulumiapi.Client
}

type PulumiServiceOrgAccessTokenInput struct {
	OrgName     string
	Description string
	Name        string
	Admin       bool
}

func (i *PulumiServiceOrgAccessTokenInput) ToPropertyMap() resource.PropertyMap {
	pm := resource.PropertyMap{}
	pm["name"] = resource.NewPropertyValue(i.Name)
	pm["description"] = resource.NewPropertyValue(i.Description)
	pm["organizationName"] = resource.NewPropertyValue(i.OrgName)
	pm["admin"] = resource.NewPropertyValue(i.Admin)
	return pm
}

func (ot *PulumiServiceOrgAccessTokenResource) ToPulumiServiceOrgAccessTokenInput(inputMap resource.PropertyMap) PulumiServiceOrgAccessTokenInput {
	input := PulumiServiceOrgAccessTokenInput{}

	if inputMap["name"].HasValue() && inputMap["name"].IsString() {
		input.Name = inputMap["name"].StringValue()
	}

	if inputMap["description"].HasValue() && inputMap["description"].IsString() {
		input.Description = inputMap["description"].StringValue()
	}

	if inputMap["organizationName"].HasValue() && inputMap["organizationName"].IsString() {
		input.OrgName = inputMap["organizationName"].StringValue()
	}

	if inputMap["admin"].HasValue() && inputMap["admin"].IsBool() {
		input.Admin = inputMap["admin"].BoolValue()
	}

	return input
}

func (ot *PulumiServiceOrgAccessTokenResource) Name() string {
	return "pulumiservice:index:OrgAccessToken"
}

func (ot *PulumiServiceOrgAccessTokenResource) Diff(req *pulumirpc.DiffRequest) (*pulumirpc.DiffResponse, error) {
	return considerAllChangesReplaces(req)
}

func (ot *PulumiServiceOrgAccessTokenResource) Delete(req *pulumirpc.DeleteRequest) (*pbempty.Empty, error) {
	ctx := context.Background()
	err := ot.deleteOrgAccessToken(ctx, req.Id)

	if err != nil {
		return &pbempty.Empty{}, err
	}

	return &pbempty.Empty{}, nil
}

func (ot *PulumiServiceOrgAccessTokenResource) Create(req *pulumirpc.CreateRequest) (*pulumirpc.CreateResponse, error) {
	ctx := context.Background()
	inputs, err := plugin.UnmarshalProperties(req.GetProperties(), plugin.MarshalOptions{KeepUnknowns: true, SkipNulls: true})
	if err != nil {
		return nil, err
	}

	inputsAccessToken := ot.ToPulumiServiceOrgAccessTokenInput(inputs)

	accessToken, err := ot.createOrgAccessToken(ctx, inputsAccessToken)
	if err != nil {
		return nil, fmt.Errorf("error creating access token '%s': %s", inputsAccessToken.Name, err.Error())
	}

	outputStore := resource.PropertyMap{}
	outputStore["__inputs"] = resource.NewObjectProperty(inputs)
	outputStore["name"] = inputs["name"]
	outputStore["organizationName"] = inputs["organizationName"]
	outputStore["description"] = inputs["description"]
	outputStore["admin"] = inputs["admin"]
	outputStore["value"] = resource.NewPropertyValue(accessToken.TokenValue)

	outputProperties, err := plugin.MarshalProperties(
		outputStore,
		plugin.MarshalOptions{},
	)
	if err != nil {
		return nil, err
	}

	urn := fmt.Sprintf(inputsAccessToken.OrgName + "/" + inputsAccessToken.Name + "/" + accessToken.ID)

	return &pulumirpc.CreateResponse{
		Id:         urn,
		Properties: outputProperties,
	}, nil

}

func (ot *PulumiServiceOrgAccessTokenResource) Check(req *pulumirpc.CheckRequest) (*pulumirpc.CheckResponse, error) {
	return &pulumirpc.CheckResponse{Inputs: req.News, Failures: nil}, nil
}

func (ot *PulumiServiceOrgAccessTokenResource) Update(_ *pulumirpc.UpdateRequest) (*pulumirpc.UpdateResponse, error) {
	// all updates are destructive, so we just call Create.
	return nil, fmt.Errorf("unexpected call to update, expected create to be called instead")
}

func (ot *PulumiServiceOrgAccessTokenResource) Read(req *pulumirpc.ReadRequest) (*pulumirpc.ReadResponse, error) {
	ctx := context.Background()
	urn := req.GetId()

	orgName, _, tokenId, err := splitOrgAccessTokenId(urn)

	// the org access token is immutable; if we get nil it got deleted, otherwise all data is the same
	accessToken, err := ot.client.GetOrgAccessToken(ctx, tokenId, orgName)
	if err != nil {
		return nil, err
	}
	if accessToken == nil {
		return &pulumirpc.ReadResponse{}, nil
	}

	return &pulumirpc.ReadResponse{
		Id:         req.GetId(),
		Properties: req.GetProperties(),
	}, nil
}

func (ot *PulumiServiceOrgAccessTokenResource) Invoke(_ *pulumiserviceProvider, req *pulumirpc.InvokeRequest) (*pulumirpc.InvokeResponse, error) {
	return &pulumirpc.InvokeResponse{Return: nil}, fmt.Errorf("unknown function '%s'", req.Tok)
}

func (ot *PulumiServiceOrgAccessTokenResource) Configure(_ PulumiServiceConfig) {
}

func (ot *PulumiServiceOrgAccessTokenResource) createOrgAccessToken(ctx context.Context, input PulumiServiceOrgAccessTokenInput) (*pulumiapi.AccessToken, error) {

	accessToken, err := ot.client.CreateOrgAccessToken(ctx, input.Name, input.OrgName, input.Description, input.Admin)
	if err != nil {
		return nil, err
	}

	return accessToken, nil
}

func (ot *PulumiServiceOrgAccessTokenResource) deleteOrgAccessToken(ctx context.Context, id string) error {
	// we don't need the token name when we delete
	orgName, _, tokenId, err := splitOrgAccessTokenId(id)
	if err != nil {
		return err
	}
	return ot.client.DeleteOrgAccessToken(ctx, tokenId, orgName)

}

// FIXME: we can likely create a util that will work for all cases
func splitOrgAccessTokenId(id string) (string, string, string, error) {
	// format: organization/name/tokenId
	s := strings.Split(id, "/")
	if len(s) != 3 {
		return "", "", "", fmt.Errorf("%q is invalid, must contain a single slash ('/')", id)
	}
	return s[0], s[1], s[2], nil
}
