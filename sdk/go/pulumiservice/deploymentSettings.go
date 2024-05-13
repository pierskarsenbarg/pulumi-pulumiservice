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

// Deployment settings configure Pulumi Deployments for a stack.
//
// ### Import
//
// Deployment settings can be imported using the `id`, which for deployment settings is `{org}/{project}/{stack}` e.g.,
//
// ```sh
//
//	$ pulumi import pulumiservice:index:DeploymentSettings my_settings my-org/my-project/my-stack
//
// ```
type DeploymentSettings struct {
	pulumi.CustomResourceState

	// The agent pool identifier to use for the deployment.
	AgentPoolId pulumi.StringPtrOutput `pulumi:"agentPoolId"`
	// Settings related to the deployment executor.
	ExecutorContext DeploymentSettingsExecutorContextPtrOutput `pulumi:"executorContext"`
	// GitHub settings for the deployment.
	Github DeploymentSettingsGithubPtrOutput `pulumi:"github"`
	// Settings related to the Pulumi operation environment during the deployment.
	OperationContext DeploymentSettingsOperationContextPtrOutput `pulumi:"operationContext"`
	// Organization name.
	Organization pulumi.StringOutput `pulumi:"organization"`
	// Project name.
	Project pulumi.StringOutput `pulumi:"project"`
	// Settings related to the source of the deployment.
	SourceContext DeploymentSettingsSourceContextOutput `pulumi:"sourceContext"`
	// Stack name.
	Stack pulumi.StringOutput `pulumi:"stack"`
}

// NewDeploymentSettings registers a new resource with the given unique name, arguments, and options.
func NewDeploymentSettings(ctx *pulumi.Context,
	name string, args *DeploymentSettingsArgs, opts ...pulumi.ResourceOption) (*DeploymentSettings, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Organization == nil {
		return nil, errors.New("invalid value for required argument 'Organization'")
	}
	if args.Project == nil {
		return nil, errors.New("invalid value for required argument 'Project'")
	}
	if args.SourceContext == nil {
		return nil, errors.New("invalid value for required argument 'SourceContext'")
	}
	if args.Stack == nil {
		return nil, errors.New("invalid value for required argument 'Stack'")
	}
	if args.Github != nil {
		args.Github = args.Github.ToDeploymentSettingsGithubPtrOutput().ApplyT(func(v *DeploymentSettingsGithub) *DeploymentSettingsGithub { return v.Defaults() }).(DeploymentSettingsGithubPtrOutput)
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource DeploymentSettings
	err := ctx.RegisterResource("pulumiservice:index:DeploymentSettings", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetDeploymentSettings gets an existing DeploymentSettings resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetDeploymentSettings(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *DeploymentSettingsState, opts ...pulumi.ResourceOption) (*DeploymentSettings, error) {
	var resource DeploymentSettings
	err := ctx.ReadResource("pulumiservice:index:DeploymentSettings", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering DeploymentSettings resources.
type deploymentSettingsState struct {
}

type DeploymentSettingsState struct {
}

func (DeploymentSettingsState) ElementType() reflect.Type {
	return reflect.TypeOf((*deploymentSettingsState)(nil)).Elem()
}

type deploymentSettingsArgs struct {
	// The agent pool identifier to use for the deployment.
	AgentPoolId *string `pulumi:"agentPoolId"`
	// Settings related to the deployment executor.
	ExecutorContext *DeploymentSettingsExecutorContext `pulumi:"executorContext"`
	// GitHub settings for the deployment.
	Github *DeploymentSettingsGithub `pulumi:"github"`
	// Settings related to the Pulumi operation environment during the deployment.
	OperationContext *DeploymentSettingsOperationContext `pulumi:"operationContext"`
	// Organization name.
	Organization string `pulumi:"organization"`
	// Project name.
	Project string `pulumi:"project"`
	// Settings related to the source of the deployment.
	SourceContext DeploymentSettingsSourceContext `pulumi:"sourceContext"`
	// Stack name.
	Stack string `pulumi:"stack"`
}

// The set of arguments for constructing a DeploymentSettings resource.
type DeploymentSettingsArgs struct {
	// The agent pool identifier to use for the deployment.
	AgentPoolId pulumi.StringPtrInput
	// Settings related to the deployment executor.
	ExecutorContext DeploymentSettingsExecutorContextPtrInput
	// GitHub settings for the deployment.
	Github DeploymentSettingsGithubPtrInput
	// Settings related to the Pulumi operation environment during the deployment.
	OperationContext DeploymentSettingsOperationContextPtrInput
	// Organization name.
	Organization pulumi.StringInput
	// Project name.
	Project pulumi.StringInput
	// Settings related to the source of the deployment.
	SourceContext DeploymentSettingsSourceContextInput
	// Stack name.
	Stack pulumi.StringInput
}

func (DeploymentSettingsArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*deploymentSettingsArgs)(nil)).Elem()
}

type DeploymentSettingsInput interface {
	pulumi.Input

	ToDeploymentSettingsOutput() DeploymentSettingsOutput
	ToDeploymentSettingsOutputWithContext(ctx context.Context) DeploymentSettingsOutput
}

func (*DeploymentSettings) ElementType() reflect.Type {
	return reflect.TypeOf((**DeploymentSettings)(nil)).Elem()
}

func (i *DeploymentSettings) ToDeploymentSettingsOutput() DeploymentSettingsOutput {
	return i.ToDeploymentSettingsOutputWithContext(context.Background())
}

func (i *DeploymentSettings) ToDeploymentSettingsOutputWithContext(ctx context.Context) DeploymentSettingsOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DeploymentSettingsOutput)
}

// DeploymentSettingsArrayInput is an input type that accepts DeploymentSettingsArray and DeploymentSettingsArrayOutput values.
// You can construct a concrete instance of `DeploymentSettingsArrayInput` via:
//
//	DeploymentSettingsArray{ DeploymentSettingsArgs{...} }
type DeploymentSettingsArrayInput interface {
	pulumi.Input

	ToDeploymentSettingsArrayOutput() DeploymentSettingsArrayOutput
	ToDeploymentSettingsArrayOutputWithContext(context.Context) DeploymentSettingsArrayOutput
}

type DeploymentSettingsArray []DeploymentSettingsInput

func (DeploymentSettingsArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DeploymentSettings)(nil)).Elem()
}

func (i DeploymentSettingsArray) ToDeploymentSettingsArrayOutput() DeploymentSettingsArrayOutput {
	return i.ToDeploymentSettingsArrayOutputWithContext(context.Background())
}

func (i DeploymentSettingsArray) ToDeploymentSettingsArrayOutputWithContext(ctx context.Context) DeploymentSettingsArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DeploymentSettingsArrayOutput)
}

// DeploymentSettingsMapInput is an input type that accepts DeploymentSettingsMap and DeploymentSettingsMapOutput values.
// You can construct a concrete instance of `DeploymentSettingsMapInput` via:
//
//	DeploymentSettingsMap{ "key": DeploymentSettingsArgs{...} }
type DeploymentSettingsMapInput interface {
	pulumi.Input

	ToDeploymentSettingsMapOutput() DeploymentSettingsMapOutput
	ToDeploymentSettingsMapOutputWithContext(context.Context) DeploymentSettingsMapOutput
}

type DeploymentSettingsMap map[string]DeploymentSettingsInput

func (DeploymentSettingsMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DeploymentSettings)(nil)).Elem()
}

func (i DeploymentSettingsMap) ToDeploymentSettingsMapOutput() DeploymentSettingsMapOutput {
	return i.ToDeploymentSettingsMapOutputWithContext(context.Background())
}

func (i DeploymentSettingsMap) ToDeploymentSettingsMapOutputWithContext(ctx context.Context) DeploymentSettingsMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DeploymentSettingsMapOutput)
}

type DeploymentSettingsOutput struct{ *pulumi.OutputState }

func (DeploymentSettingsOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**DeploymentSettings)(nil)).Elem()
}

func (o DeploymentSettingsOutput) ToDeploymentSettingsOutput() DeploymentSettingsOutput {
	return o
}

func (o DeploymentSettingsOutput) ToDeploymentSettingsOutputWithContext(ctx context.Context) DeploymentSettingsOutput {
	return o
}

// The agent pool identifier to use for the deployment.
func (o DeploymentSettingsOutput) AgentPoolId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *DeploymentSettings) pulumi.StringPtrOutput { return v.AgentPoolId }).(pulumi.StringPtrOutput)
}

// Settings related to the deployment executor.
func (o DeploymentSettingsOutput) ExecutorContext() DeploymentSettingsExecutorContextPtrOutput {
	return o.ApplyT(func(v *DeploymentSettings) DeploymentSettingsExecutorContextPtrOutput { return v.ExecutorContext }).(DeploymentSettingsExecutorContextPtrOutput)
}

// GitHub settings for the deployment.
func (o DeploymentSettingsOutput) Github() DeploymentSettingsGithubPtrOutput {
	return o.ApplyT(func(v *DeploymentSettings) DeploymentSettingsGithubPtrOutput { return v.Github }).(DeploymentSettingsGithubPtrOutput)
}

// Settings related to the Pulumi operation environment during the deployment.
func (o DeploymentSettingsOutput) OperationContext() DeploymentSettingsOperationContextPtrOutput {
	return o.ApplyT(func(v *DeploymentSettings) DeploymentSettingsOperationContextPtrOutput { return v.OperationContext }).(DeploymentSettingsOperationContextPtrOutput)
}

// Organization name.
func (o DeploymentSettingsOutput) Organization() pulumi.StringOutput {
	return o.ApplyT(func(v *DeploymentSettings) pulumi.StringOutput { return v.Organization }).(pulumi.StringOutput)
}

// Project name.
func (o DeploymentSettingsOutput) Project() pulumi.StringOutput {
	return o.ApplyT(func(v *DeploymentSettings) pulumi.StringOutput { return v.Project }).(pulumi.StringOutput)
}

// Settings related to the source of the deployment.
func (o DeploymentSettingsOutput) SourceContext() DeploymentSettingsSourceContextOutput {
	return o.ApplyT(func(v *DeploymentSettings) DeploymentSettingsSourceContextOutput { return v.SourceContext }).(DeploymentSettingsSourceContextOutput)
}

// Stack name.
func (o DeploymentSettingsOutput) Stack() pulumi.StringOutput {
	return o.ApplyT(func(v *DeploymentSettings) pulumi.StringOutput { return v.Stack }).(pulumi.StringOutput)
}

type DeploymentSettingsArrayOutput struct{ *pulumi.OutputState }

func (DeploymentSettingsArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DeploymentSettings)(nil)).Elem()
}

func (o DeploymentSettingsArrayOutput) ToDeploymentSettingsArrayOutput() DeploymentSettingsArrayOutput {
	return o
}

func (o DeploymentSettingsArrayOutput) ToDeploymentSettingsArrayOutputWithContext(ctx context.Context) DeploymentSettingsArrayOutput {
	return o
}

func (o DeploymentSettingsArrayOutput) Index(i pulumi.IntInput) DeploymentSettingsOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *DeploymentSettings {
		return vs[0].([]*DeploymentSettings)[vs[1].(int)]
	}).(DeploymentSettingsOutput)
}

type DeploymentSettingsMapOutput struct{ *pulumi.OutputState }

func (DeploymentSettingsMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DeploymentSettings)(nil)).Elem()
}

func (o DeploymentSettingsMapOutput) ToDeploymentSettingsMapOutput() DeploymentSettingsMapOutput {
	return o
}

func (o DeploymentSettingsMapOutput) ToDeploymentSettingsMapOutputWithContext(ctx context.Context) DeploymentSettingsMapOutput {
	return o
}

func (o DeploymentSettingsMapOutput) MapIndex(k pulumi.StringInput) DeploymentSettingsOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *DeploymentSettings {
		return vs[0].(map[string]*DeploymentSettings)[vs[1].(string)]
	}).(DeploymentSettingsOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*DeploymentSettingsInput)(nil)).Elem(), &DeploymentSettings{})
	pulumi.RegisterInputType(reflect.TypeOf((*DeploymentSettingsArrayInput)(nil)).Elem(), DeploymentSettingsArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*DeploymentSettingsMapInput)(nil)).Elem(), DeploymentSettingsMap{})
	pulumi.RegisterOutputType(DeploymentSettingsOutput{})
	pulumi.RegisterOutputType(DeploymentSettingsArrayOutput{})
	pulumi.RegisterOutputType(DeploymentSettingsMapOutput{})
}
