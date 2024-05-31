package provider

import (
	"context"
	"fmt"
	"path"

	pbempty "google.golang.org/protobuf/types/known/emptypb"

	esc_client "github.com/pulumi/esc/cmd/esc/cli/client"
	"github.com/pulumi/pulumi-pulumiservice/provider/pkg/internal/serde"
	"github.com/pulumi/pulumi/sdk/v3/go/common/resource"
	"github.com/pulumi/pulumi/sdk/v3/go/common/resource/plugin"
	pulumirpc "github.com/pulumi/pulumi/sdk/v3/proto/go"
)

type PulumiServiceEnvironmentVersionTagResource struct {
	client esc_client.Client
}

type PulumiServiceEnvironmentVersionTagInput struct {
	Organization string `pulumi:"organization"`
	Environment  string `pulumi:"environment"`
	TagName      string `pulumi:"tagName"`
	Revision     int    `pulumi:"revision"`
}

func (i *PulumiServiceEnvironmentVersionTagInput) ToPropertyMap() resource.PropertyMap {
	return serde.ToPropertyMap(*i, structTagKey)
}

func (evt *PulumiServiceEnvironmentVersionTagResource) ToPulumiServiceEnvironmentVersionTagInput(inputMap resource.PropertyMap) PulumiServiceEnvironmentVersionTagInput {
	input := PulumiServiceEnvironmentVersionTagInput{}
	serde.FromPropertyMap(inputMap, structTagKey, &input)
	return input
}

func (evt *PulumiServiceEnvironmentVersionTagResource) Name() string {
	return "pulumiservice:index:EnvironmentVersionTag"
}

func (evt *PulumiServiceEnvironmentVersionTagResource) Diff(req *pulumirpc.DiffRequest) (*pulumirpc.DiffResponse, error) {
	olds, err := plugin.UnmarshalProperties(req.GetOlds(), plugin.MarshalOptions{KeepUnknowns: false, SkipNulls: true})
	if err != nil {
		return nil, err
	}

	news, err := plugin.UnmarshalProperties(req.GetNews(), plugin.MarshalOptions{KeepUnknowns: true, SkipNulls: true})
	if err != nil {
		return nil, err
	}

	diffs := olds.Diff(news)
	if diffs == nil {
		return &pulumirpc.DiffResponse{
			Changes: pulumirpc.DiffResponse_DIFF_NONE,
		}, nil
	}

	dd := plugin.NewDetailedDiffFromObjectDiff(diffs, false)

	detailedDiffs := map[string]*pulumirpc.PropertyDiff{}
	replaces := []string(nil)
	replaceProperties := map[string]bool{
		"organization": true,
		"environment":  true,
		"tagName":      true,
	}
	for k, v := range dd {
		if _, ok := replaceProperties[k]; ok {
			v.Kind = v.Kind.AsReplace()
			replaces = append(replaces, k)
		}
		detailedDiffs[k] = &pulumirpc.PropertyDiff{
			Kind:      pulumirpc.PropertyDiff_Kind(v.Kind),
			InputDiff: v.InputDiff,
		}
	}

	return &pulumirpc.DiffResponse{
		Changes:             pulumirpc.DiffResponse_DIFF_SOME,
		Replaces:            replaces,
		DetailedDiff:        detailedDiffs,
		HasDetailedDiff:     true,
		DeleteBeforeReplace: len(replaces) > 0,
	}, nil
}

func (evt *PulumiServiceEnvironmentVersionTagResource) Delete(req *pulumirpc.DeleteRequest) (*pbempty.Empty, error) {
	ctx := context.Background()
	var input PulumiServiceEnvironmentVersionTagInput
	err := serde.FromProperties(req.GetProperties(), structTagKey, &input)
	if err != nil {
		return nil, err
	}
	err = evt.client.DeleteEnvironmentRevisionTag(ctx, input.Organization, input.Environment, input.TagName)
	if err != nil {
		return nil, err
	}
	return &pbempty.Empty{}, nil
}

func (evt *PulumiServiceEnvironmentVersionTagResource) Create(req *pulumirpc.CreateRequest) (*pulumirpc.CreateResponse, error) {
	ctx := context.Background()
	var input PulumiServiceEnvironmentVersionTagInput
	err := serde.FromProperties(req.GetProperties(), structTagKey, &input)
	if err != nil {
		return nil, err
	}
	err = evt.client.CreateEnvironmentRevisionTag(ctx, input.Organization, input.Environment, input.TagName, &input.Revision)
	if err != nil {
		return nil, err
	}
	return &pulumirpc.CreateResponse{
		Id:         path.Join(input.Organization, input.Environment, input.TagName),
		Properties: req.GetProperties(),
	}, nil
}

func (evt *PulumiServiceEnvironmentVersionTagResource) Check(req *pulumirpc.CheckRequest) (*pulumirpc.CheckResponse, error) {
	inputMap, err := plugin.UnmarshalProperties(req.GetNews(), plugin.MarshalOptions{KeepUnknowns: true, SkipNulls: true})
	if err != nil {
		return nil, err
	}

	var failures []*pulumirpc.CheckFailure
	for _, p := range []resource.PropertyKey{"organization", "environment", "tagName", "revision"} {
		if !inputMap[(p)].HasValue() {
			failures = append(failures, &pulumirpc.CheckFailure{
				Reason:   fmt.Sprintf("missing required property '%s'", p),
				Property: string(p),
			})
		}
	}

	return &pulumirpc.CheckResponse{Inputs: req.GetNews(), Failures: failures}, nil
}

func (evt *PulumiServiceEnvironmentVersionTagResource) Update(req *pulumirpc.UpdateRequest) (*pulumirpc.UpdateResponse, error) {
	ctx := context.Background()
	var input PulumiServiceEnvironmentVersionTagInput
	err := serde.FromProperties(req.GetNews(), structTagKey, &input)
	if err != nil {
		return nil, err
	}

	err = evt.client.UpdateEnvironmentRevisionTag(ctx, input.Organization, input.Environment, input.TagName, &input.Revision)
	if err != nil {
		return nil, err
	}

	return &pulumirpc.UpdateResponse{
		Properties: req.GetNews(),
	}, nil
}

func (evt *PulumiServiceEnvironmentVersionTagResource) Read(req *pulumirpc.ReadRequest) (*pulumirpc.ReadResponse, error) {
	ctx := context.Background()
	var input PulumiServiceEnvironmentVersionTagInput
	err := serde.FromProperties(req.GetProperties(), structTagKey, &input)
	if err != nil {
		return nil, err
	}

	tag, err := evt.client.GetEnvironmentRevisionTag(ctx, input.Organization, input.Environment, input.TagName)
	if err != nil {
		return nil, fmt.Errorf("failed to read StackTag (%q): %w", req.Id, err)
	}
	if tag == nil {
		// if the tag doesn't exist, then return empty response
		return &pulumirpc.ReadResponse{}, nil
	}
	if tag.Revision != input.Revision {
		// if the tag revision doesn't match, then return empty response
		return &pulumirpc.ReadResponse{}, nil
	}

	props, err := serde.ToProperties(input, structTagKey)
	if err != nil {
		return nil, fmt.Errorf("failed to marshal input to properties: %w", err)
	}
	return &pulumirpc.ReadResponse{
		Id:         req.Id,
		Properties: props,
		Inputs:     props,
	}, nil
}

func (evt *PulumiServiceEnvironmentVersionTagResource) Configure(_ PulumiServiceConfig) {
}
