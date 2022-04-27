package provider

import (
	"context"
	"errors"
	"fmt"

	pbempty "github.com/golang/protobuf/ptypes/empty"
	"github.com/pulumi/pulumi-pulumiservice/provider/pkg/internal/pulumiapi"
	"github.com/pulumi/pulumi/sdk/v3/go/common/resource"
	"github.com/pulumi/pulumi/sdk/v3/go/common/resource/plugin"
	pulumirpc "github.com/pulumi/pulumi/sdk/v3/proto/go"
)

type PulumiServiceTeamResource struct {
	config PulumiServiceConfig
	client *pulumiapi.Client
}

type PulumiServiceTeamInput struct {
	Type             string
	Name             string
	DisplayName      string
	Description      string
	OrganizationName string
	Members          []string
}

func (i *PulumiServiceTeamInput) ToPropertyMap() resource.PropertyMap {
	pm := resource.PropertyMap{}
	pm["type"] = resource.NewPropertyValue(i.Type)
	pm["name"] = resource.NewPropertyValue(i.Name)
	pm["displayName"] = resource.NewPropertyValue(i.DisplayName)
	pm["description"] = resource.NewPropertyValue(i.Description)
	pm["members"] = resource.NewPropertyValue(i.Members)
	pm["organizationName"] = resource.NewPropertyValue(i.OrganizationName)
	return pm
}

func (t *PulumiServiceTeamResource) ToPulumiServiceTeamInput(inputMap resource.PropertyMap) PulumiServiceTeamInput {
	input := PulumiServiceTeamInput{}

	if inputMap["name"].HasValue() && inputMap["name"].IsString() {
		input.Name = inputMap["name"].StringValue()
	}

	if inputMap["type"].HasValue() && inputMap["type"].IsString() {
		input.Type = inputMap["type"].StringValue()
	}

	if inputMap["displayName"].HasValue() && inputMap["displayName"].IsString() {
		input.DisplayName = inputMap["displayName"].StringValue()
	}

	if inputMap["description"].HasValue() && inputMap["description"].IsString() {
		input.Description = inputMap["description"].StringValue()
	}

	if inputMap["members"].HasValue() && inputMap["members"].IsArray() {
		for _, m := range inputMap["members"].ArrayValue() {
			if m.HasValue() && m.IsString() {
				input.Members = append(input.Members, m.StringValue())
			}
		}
	}

	if inputMap["organizationName"].HasValue() && inputMap["organizationName"].IsString() {
		input.OrganizationName = inputMap["organizationName"].StringValue()
	}

	return input
}

func (t *PulumiServiceTeamResource) Name() string {
	return "pulumiservice:index:Team"
}

func (t *PulumiServiceTeamResource) Configure(config PulumiServiceConfig) {
	t.config = config
}

func (tr *PulumiServiceTeamResource) Check(req *pulumirpc.CheckRequest) (*pulumirpc.CheckResponse, error) {
	return &pulumirpc.CheckResponse{Inputs: req.News, Failures: nil}, nil
}

func (tr *PulumiServiceTeamResource) Delete(req *pulumirpc.DeleteRequest) (*pbempty.Empty, error) {
	err := tr.deleteTeam(context.Background(), req.Id)
	if err != nil {
		return &pbempty.Empty{}, err
	}

	return &pbempty.Empty{}, nil
}

func (tr *PulumiServiceTeamResource) Diff(req *pulumirpc.DiffRequest) (*pulumirpc.DiffResponse, error) {
	olds, err := plugin.UnmarshalProperties(req.GetOlds(), plugin.MarshalOptions{KeepUnknowns: false, SkipNulls: true})
	if err != nil {
		return nil, err
	}

	news, err := plugin.UnmarshalProperties(req.GetNews(), plugin.MarshalOptions{KeepUnknowns: true, SkipNulls: false})
	if err != nil {
		return nil, err
	}

	diffs := olds["__inputs"].ObjectValue().Diff(news)
	if diffs == nil {
		return &pulumirpc.DiffResponse{
			Changes:             pulumirpc.DiffResponse_DIFF_NONE,
			Replaces:            []string{},
			Stables:             []string{},
			DeleteBeforeReplace: false,
		}, nil
	}

	changes := pulumirpc.DiffResponse_DIFF_NONE
	if diffs.Changed("type") ||
		diffs.Changed("name") ||
		diffs.Changed("displayName") ||
		diffs.Changed("description") ||
		diffs.Changed("members") ||
		diffs.Changed("organizationName") {
		changes = pulumirpc.DiffResponse_DIFF_SOME
	}

	return &pulumirpc.DiffResponse{
		Changes:             changes,
		Replaces:            []string{},
		Stables:             []string{},
		DeleteBeforeReplace: false,
	}, nil
}

func (tr *PulumiServiceTeamResource) Read(req *pulumirpc.ReadRequest) (*pulumirpc.ReadResponse, error) {
	return nil, errors.New("Read construct is not yet implemented")
}

func (tr *PulumiServiceTeamResource) Update(req *pulumirpc.UpdateRequest) (*pulumirpc.UpdateResponse, error) {
	ctx := context.Background()
	inputsOld, err := plugin.UnmarshalProperties(req.GetOlds(), plugin.MarshalOptions{KeepUnknowns: true, SkipNulls: true})
	if err != nil {
		return nil, err
	}
	inputsNew, err := plugin.UnmarshalProperties(req.GetNews(), plugin.MarshalOptions{KeepUnknowns: true, SkipNulls: true})
	if err != nil {
		return nil, err
	}

	teamOld := tr.ToPulumiServiceTeamInput(inputsOld["__inputs"].ObjectValue())
	teamNew := tr.ToPulumiServiceTeamInput(inputsNew)

	inputsChanged := teamOld
	if teamOld.Description != teamNew.Description || teamOld.DisplayName != teamNew.Description {

		inputsChanged.Description = teamNew.Description
		inputsChanged.DisplayName = teamNew.DisplayName

		tr.updateTeam(context.Background(), inputsChanged)
	}

	if !Equal(teamOld.Members, teamNew.Members) {
		inputsChanged.Members = teamNew.Members
		for _, usernameToDelete := range teamOld.Members {
			if !InSlice(usernameToDelete, teamNew.Members) {
				tr.deleteFromTeam(ctx, teamOld.OrganizationName, teamOld.Name, usernameToDelete)
			}
		}

		for _, usernameToAdd := range teamNew.Members {
			if !InSlice(usernameToAdd, teamOld.Members) {
				tr.addToTeam(ctx, teamOld.OrganizationName, teamOld.Name, usernameToAdd)
			}
		}
	}

	outputStore := resource.PropertyMap{}
	outputStore["__inputs"] = resource.NewObjectProperty(inputsChanged.ToPropertyMap())

	outputProperties, err := plugin.MarshalProperties(
		outputStore,
		plugin.MarshalOptions{},
	)
	if err != nil {
		return nil, err
	}
	return &pulumirpc.UpdateResponse{
		Properties: outputProperties,
	}, nil
}

func (tr *PulumiServiceTeamResource) Create(req *pulumirpc.CreateRequest) (*pulumirpc.CreateResponse, error) {
	ctx := context.Background()
	inputs, err := plugin.UnmarshalProperties(req.GetProperties(), plugin.MarshalOptions{KeepUnknowns: true, SkipNulls: true})
	if err != nil {
		return nil, err
	}

	inputsTeam := tr.ToPulumiServiceTeamInput(inputs)
	team, err := tr.createTeam(ctx, inputsTeam)
	if err != nil {
		return nil, fmt.Errorf("error creating team '%s': %s", inputsTeam.Name, err.Error())
	}

	for _, memberToAdd := range inputsTeam.Members {
		err = tr.addToTeam(ctx, inputsTeam.OrganizationName, inputsTeam.Name, memberToAdd)
		if err != nil {
			return nil, err
		}
	}

	outputStore := resource.PropertyMap{}
	outputStore["__inputs"] = resource.NewObjectProperty(inputs)

	outputProperties, err := plugin.MarshalProperties(
		outputStore,
		plugin.MarshalOptions{},
	)
	if err != nil {
		return nil, err
	}

	return &pulumirpc.CreateResponse{
		Id:         *team,
		Properties: outputProperties,
	}, nil
}

func (t *PulumiServiceTeamResource) updateTeam(ctx context.Context, input PulumiServiceTeamInput) error {
	err := t.client.UpdateTeam(ctx, input.OrganizationName, input.Name, input.DisplayName, input.Description)
	if err != nil {
		return err
	}
	return nil
}

func (t *PulumiServiceTeamResource) createTeam(ctx context.Context, input PulumiServiceTeamInput) (*string, error) {
	_, err := t.client.CreateTeam(ctx, input.OrganizationName, input.Name, input.Type, input.DisplayName, input.Description)
	if err != nil {
		return nil, err
	}

	teamUrn := fmt.Sprintf("%s/%s", input.OrganizationName, input.Name)
	return &teamUrn, nil
}

func (t *PulumiServiceTeamResource) deleteFromTeam(ctx context.Context, orgName string, teamName string, userName string) error {

	if len(orgName) == 0 {
		return errors.New("orgname must not be empty")
	}

	if len(teamName) == 0 {
		return errors.New("teamname must not be empty")
	}

	if len(userName) == 0 {
		return errors.New("username must not be empty")
	}

	return t.client.DeleteMemberFromTeam(ctx, orgName, teamName, userName)

}

func (t *PulumiServiceTeamResource) addToTeam(ctx context.Context, orgName string, teamName string, userName string) error {
	return t.client.AddMemberToTeam(ctx, orgName, teamName, userName)
}

func (t *PulumiServiceTeamResource) deleteTeam(ctx context.Context, id string) error {
	orgName, teamName, err := splitSingleSlashString(id)
	if err != nil {
		return err
	}
	err = t.client.DeleteTeam(ctx, orgName, teamName)
	if err != nil {
		return err
	}
	return nil
}
