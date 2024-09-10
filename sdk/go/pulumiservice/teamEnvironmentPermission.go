// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package pulumiservice

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-pulumiservice/sdk/go/pulumiservice/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// A permission for a team to use an environment.
type TeamEnvironmentPermission struct {
	pulumi.CustomResourceState

	// Which permission level to grant to the specified team.
	Permission EnvironmentPermissionPtrOutput `pulumi:"permission"`
}

// NewTeamEnvironmentPermission registers a new resource with the given unique name, arguments, and options.
func NewTeamEnvironmentPermission(ctx *pulumi.Context,
	name string, args *TeamEnvironmentPermissionArgs, opts ...pulumi.ResourceOption) (*TeamEnvironmentPermission, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Environment == nil {
		return nil, errors.New("invalid value for required argument 'Environment'")
	}
	if args.Organization == nil {
		return nil, errors.New("invalid value for required argument 'Organization'")
	}
	if args.Permission == nil {
		return nil, errors.New("invalid value for required argument 'Permission'")
	}
	if args.Team == nil {
		return nil, errors.New("invalid value for required argument 'Team'")
	}
	if args.Project == nil {
		args.Project = pulumi.StringPtr("default")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource TeamEnvironmentPermission
	err := ctx.RegisterResource("pulumiservice:index:TeamEnvironmentPermission", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetTeamEnvironmentPermission gets an existing TeamEnvironmentPermission resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetTeamEnvironmentPermission(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *TeamEnvironmentPermissionState, opts ...pulumi.ResourceOption) (*TeamEnvironmentPermission, error) {
	var resource TeamEnvironmentPermission
	err := ctx.ReadResource("pulumiservice:index:TeamEnvironmentPermission", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering TeamEnvironmentPermission resources.
type teamEnvironmentPermissionState struct {
}

type TeamEnvironmentPermissionState struct {
}

func (TeamEnvironmentPermissionState) ElementType() reflect.Type {
	return reflect.TypeOf((*teamEnvironmentPermissionState)(nil)).Elem()
}

type teamEnvironmentPermissionArgs struct {
	// Environment name.
	Environment string `pulumi:"environment"`
	// Organization name.
	Organization string `pulumi:"organization"`
	// Which permission level to grant to the specified team.
	Permission EnvironmentPermission `pulumi:"permission"`
	// Project name.
	Project *string `pulumi:"project"`
	// Team name.
	Team string `pulumi:"team"`
}

// The set of arguments for constructing a TeamEnvironmentPermission resource.
type TeamEnvironmentPermissionArgs struct {
	// Environment name.
	Environment pulumi.StringInput
	// Organization name.
	Organization pulumi.StringInput
	// Which permission level to grant to the specified team.
	Permission EnvironmentPermissionInput
	// Project name.
	Project pulumi.StringPtrInput
	// Team name.
	Team pulumi.StringInput
}

func (TeamEnvironmentPermissionArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*teamEnvironmentPermissionArgs)(nil)).Elem()
}

type TeamEnvironmentPermissionInput interface {
	pulumi.Input

	ToTeamEnvironmentPermissionOutput() TeamEnvironmentPermissionOutput
	ToTeamEnvironmentPermissionOutputWithContext(ctx context.Context) TeamEnvironmentPermissionOutput
}

func (*TeamEnvironmentPermission) ElementType() reflect.Type {
	return reflect.TypeOf((**TeamEnvironmentPermission)(nil)).Elem()
}

func (i *TeamEnvironmentPermission) ToTeamEnvironmentPermissionOutput() TeamEnvironmentPermissionOutput {
	return i.ToTeamEnvironmentPermissionOutputWithContext(context.Background())
}

func (i *TeamEnvironmentPermission) ToTeamEnvironmentPermissionOutputWithContext(ctx context.Context) TeamEnvironmentPermissionOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TeamEnvironmentPermissionOutput)
}

// TeamEnvironmentPermissionArrayInput is an input type that accepts TeamEnvironmentPermissionArray and TeamEnvironmentPermissionArrayOutput values.
// You can construct a concrete instance of `TeamEnvironmentPermissionArrayInput` via:
//
//	TeamEnvironmentPermissionArray{ TeamEnvironmentPermissionArgs{...} }
type TeamEnvironmentPermissionArrayInput interface {
	pulumi.Input

	ToTeamEnvironmentPermissionArrayOutput() TeamEnvironmentPermissionArrayOutput
	ToTeamEnvironmentPermissionArrayOutputWithContext(context.Context) TeamEnvironmentPermissionArrayOutput
}

type TeamEnvironmentPermissionArray []TeamEnvironmentPermissionInput

func (TeamEnvironmentPermissionArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*TeamEnvironmentPermission)(nil)).Elem()
}

func (i TeamEnvironmentPermissionArray) ToTeamEnvironmentPermissionArrayOutput() TeamEnvironmentPermissionArrayOutput {
	return i.ToTeamEnvironmentPermissionArrayOutputWithContext(context.Background())
}

func (i TeamEnvironmentPermissionArray) ToTeamEnvironmentPermissionArrayOutputWithContext(ctx context.Context) TeamEnvironmentPermissionArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TeamEnvironmentPermissionArrayOutput)
}

// TeamEnvironmentPermissionMapInput is an input type that accepts TeamEnvironmentPermissionMap and TeamEnvironmentPermissionMapOutput values.
// You can construct a concrete instance of `TeamEnvironmentPermissionMapInput` via:
//
//	TeamEnvironmentPermissionMap{ "key": TeamEnvironmentPermissionArgs{...} }
type TeamEnvironmentPermissionMapInput interface {
	pulumi.Input

	ToTeamEnvironmentPermissionMapOutput() TeamEnvironmentPermissionMapOutput
	ToTeamEnvironmentPermissionMapOutputWithContext(context.Context) TeamEnvironmentPermissionMapOutput
}

type TeamEnvironmentPermissionMap map[string]TeamEnvironmentPermissionInput

func (TeamEnvironmentPermissionMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*TeamEnvironmentPermission)(nil)).Elem()
}

func (i TeamEnvironmentPermissionMap) ToTeamEnvironmentPermissionMapOutput() TeamEnvironmentPermissionMapOutput {
	return i.ToTeamEnvironmentPermissionMapOutputWithContext(context.Background())
}

func (i TeamEnvironmentPermissionMap) ToTeamEnvironmentPermissionMapOutputWithContext(ctx context.Context) TeamEnvironmentPermissionMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TeamEnvironmentPermissionMapOutput)
}

type TeamEnvironmentPermissionOutput struct{ *pulumi.OutputState }

func (TeamEnvironmentPermissionOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**TeamEnvironmentPermission)(nil)).Elem()
}

func (o TeamEnvironmentPermissionOutput) ToTeamEnvironmentPermissionOutput() TeamEnvironmentPermissionOutput {
	return o
}

func (o TeamEnvironmentPermissionOutput) ToTeamEnvironmentPermissionOutputWithContext(ctx context.Context) TeamEnvironmentPermissionOutput {
	return o
}

// Which permission level to grant to the specified team.
func (o TeamEnvironmentPermissionOutput) Permission() EnvironmentPermissionPtrOutput {
	return o.ApplyT(func(v *TeamEnvironmentPermission) EnvironmentPermissionPtrOutput { return v.Permission }).(EnvironmentPermissionPtrOutput)
}

type TeamEnvironmentPermissionArrayOutput struct{ *pulumi.OutputState }

func (TeamEnvironmentPermissionArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*TeamEnvironmentPermission)(nil)).Elem()
}

func (o TeamEnvironmentPermissionArrayOutput) ToTeamEnvironmentPermissionArrayOutput() TeamEnvironmentPermissionArrayOutput {
	return o
}

func (o TeamEnvironmentPermissionArrayOutput) ToTeamEnvironmentPermissionArrayOutputWithContext(ctx context.Context) TeamEnvironmentPermissionArrayOutput {
	return o
}

func (o TeamEnvironmentPermissionArrayOutput) Index(i pulumi.IntInput) TeamEnvironmentPermissionOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *TeamEnvironmentPermission {
		return vs[0].([]*TeamEnvironmentPermission)[vs[1].(int)]
	}).(TeamEnvironmentPermissionOutput)
}

type TeamEnvironmentPermissionMapOutput struct{ *pulumi.OutputState }

func (TeamEnvironmentPermissionMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*TeamEnvironmentPermission)(nil)).Elem()
}

func (o TeamEnvironmentPermissionMapOutput) ToTeamEnvironmentPermissionMapOutput() TeamEnvironmentPermissionMapOutput {
	return o
}

func (o TeamEnvironmentPermissionMapOutput) ToTeamEnvironmentPermissionMapOutputWithContext(ctx context.Context) TeamEnvironmentPermissionMapOutput {
	return o
}

func (o TeamEnvironmentPermissionMapOutput) MapIndex(k pulumi.StringInput) TeamEnvironmentPermissionOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *TeamEnvironmentPermission {
		return vs[0].(map[string]*TeamEnvironmentPermission)[vs[1].(string)]
	}).(TeamEnvironmentPermissionOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*TeamEnvironmentPermissionInput)(nil)).Elem(), &TeamEnvironmentPermission{})
	pulumi.RegisterInputType(reflect.TypeOf((*TeamEnvironmentPermissionArrayInput)(nil)).Elem(), TeamEnvironmentPermissionArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*TeamEnvironmentPermissionMapInput)(nil)).Elem(), TeamEnvironmentPermissionMap{})
	pulumi.RegisterOutputType(TeamEnvironmentPermissionOutput{})
	pulumi.RegisterOutputType(TeamEnvironmentPermissionArrayOutput{})
	pulumi.RegisterOutputType(TeamEnvironmentPermissionMapOutput{})
}
