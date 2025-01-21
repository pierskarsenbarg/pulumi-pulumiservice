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

// An OIDC issuer registration with Pulumi.
type OidcIssuer struct {
	pulumi.CustomResourceState

	// The maximum duration of the Pulumi access token working after an exchange, specified in seconds.
	MaxExpirationSeconds pulumi.IntPtrOutput `pulumi:"maxExpirationSeconds"`
	// Issuer name.
	Name pulumi.StringOutput `pulumi:"name"`
	// Organization name.
	Organization pulumi.StringOutput `pulumi:"organization"`
	// The authorization policies for this Oidc Issuer.
	Policies AuthPolicyDefinitionArrayOutput `pulumi:"policies"`
	// The thumbprints of issuer's TLS certificates. By default, Pulumi will store the thumbprint of the certificate used to serve the OpenID configuration. If the provider uses multiple certificates to serve content, it is required to manually configure these.
	Thumbprints pulumi.StringArrayOutput `pulumi:"thumbprints"`
	// The OIDC issuer URL.
	Url pulumi.StringOutput `pulumi:"url"`
}

// NewOidcIssuer registers a new resource with the given unique name, arguments, and options.
func NewOidcIssuer(ctx *pulumi.Context,
	name string, args *OidcIssuerArgs, opts ...pulumi.ResourceOption) (*OidcIssuer, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Name == nil {
		return nil, errors.New("invalid value for required argument 'Name'")
	}
	if args.Organization == nil {
		return nil, errors.New("invalid value for required argument 'Organization'")
	}
	if args.Url == nil {
		return nil, errors.New("invalid value for required argument 'Url'")
	}
	replaceOnChanges := pulumi.ReplaceOnChanges([]string{
		"organization",
		"url",
	})
	opts = append(opts, replaceOnChanges)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource OidcIssuer
	err := ctx.RegisterResource("pulumiservice:index:OidcIssuer", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetOidcIssuer gets an existing OidcIssuer resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetOidcIssuer(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *OidcIssuerState, opts ...pulumi.ResourceOption) (*OidcIssuer, error) {
	var resource OidcIssuer
	err := ctx.ReadResource("pulumiservice:index:OidcIssuer", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering OidcIssuer resources.
type oidcIssuerState struct {
}

type OidcIssuerState struct {
}

func (OidcIssuerState) ElementType() reflect.Type {
	return reflect.TypeOf((*oidcIssuerState)(nil)).Elem()
}

type oidcIssuerArgs struct {
	// The maximum duration of the Pulumi access token working after an exchange, specified in seconds.
	MaxExpirationSeconds *int `pulumi:"maxExpirationSeconds"`
	// Issuer name.
	Name string `pulumi:"name"`
	// Organization name.
	Organization string `pulumi:"organization"`
	// The auth policies for this Oidc Issuer.
	Policies []AuthPolicyDefinition `pulumi:"policies"`
	// The thumbprints of issuer's TLS certificates. By default, Pulumi will store the thumbprint of the certificate used to serve the OpenID configuration. If the provider uses multiple certificates to serve content, it is required to manually configure these.
	Thumbprints []string `pulumi:"thumbprints"`
	// The OIDC issuer URL.
	Url string `pulumi:"url"`
}

// The set of arguments for constructing a OidcIssuer resource.
type OidcIssuerArgs struct {
	// The maximum duration of the Pulumi access token working after an exchange, specified in seconds.
	MaxExpirationSeconds pulumi.IntPtrInput
	// Issuer name.
	Name pulumi.StringInput
	// Organization name.
	Organization pulumi.StringInput
	// The auth policies for this Oidc Issuer.
	Policies AuthPolicyDefinitionArrayInput
	// The thumbprints of issuer's TLS certificates. By default, Pulumi will store the thumbprint of the certificate used to serve the OpenID configuration. If the provider uses multiple certificates to serve content, it is required to manually configure these.
	Thumbprints pulumi.StringArrayInput
	// The OIDC issuer URL.
	Url pulumi.StringInput
}

func (OidcIssuerArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*oidcIssuerArgs)(nil)).Elem()
}

type OidcIssuerInput interface {
	pulumi.Input

	ToOidcIssuerOutput() OidcIssuerOutput
	ToOidcIssuerOutputWithContext(ctx context.Context) OidcIssuerOutput
}

func (*OidcIssuer) ElementType() reflect.Type {
	return reflect.TypeOf((**OidcIssuer)(nil)).Elem()
}

func (i *OidcIssuer) ToOidcIssuerOutput() OidcIssuerOutput {
	return i.ToOidcIssuerOutputWithContext(context.Background())
}

func (i *OidcIssuer) ToOidcIssuerOutputWithContext(ctx context.Context) OidcIssuerOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OidcIssuerOutput)
}

// OidcIssuerArrayInput is an input type that accepts OidcIssuerArray and OidcIssuerArrayOutput values.
// You can construct a concrete instance of `OidcIssuerArrayInput` via:
//
//	OidcIssuerArray{ OidcIssuerArgs{...} }
type OidcIssuerArrayInput interface {
	pulumi.Input

	ToOidcIssuerArrayOutput() OidcIssuerArrayOutput
	ToOidcIssuerArrayOutputWithContext(context.Context) OidcIssuerArrayOutput
}

type OidcIssuerArray []OidcIssuerInput

func (OidcIssuerArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*OidcIssuer)(nil)).Elem()
}

func (i OidcIssuerArray) ToOidcIssuerArrayOutput() OidcIssuerArrayOutput {
	return i.ToOidcIssuerArrayOutputWithContext(context.Background())
}

func (i OidcIssuerArray) ToOidcIssuerArrayOutputWithContext(ctx context.Context) OidcIssuerArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OidcIssuerArrayOutput)
}

// OidcIssuerMapInput is an input type that accepts OidcIssuerMap and OidcIssuerMapOutput values.
// You can construct a concrete instance of `OidcIssuerMapInput` via:
//
//	OidcIssuerMap{ "key": OidcIssuerArgs{...} }
type OidcIssuerMapInput interface {
	pulumi.Input

	ToOidcIssuerMapOutput() OidcIssuerMapOutput
	ToOidcIssuerMapOutputWithContext(context.Context) OidcIssuerMapOutput
}

type OidcIssuerMap map[string]OidcIssuerInput

func (OidcIssuerMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*OidcIssuer)(nil)).Elem()
}

func (i OidcIssuerMap) ToOidcIssuerMapOutput() OidcIssuerMapOutput {
	return i.ToOidcIssuerMapOutputWithContext(context.Background())
}

func (i OidcIssuerMap) ToOidcIssuerMapOutputWithContext(ctx context.Context) OidcIssuerMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OidcIssuerMapOutput)
}

type OidcIssuerOutput struct{ *pulumi.OutputState }

func (OidcIssuerOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**OidcIssuer)(nil)).Elem()
}

func (o OidcIssuerOutput) ToOidcIssuerOutput() OidcIssuerOutput {
	return o
}

func (o OidcIssuerOutput) ToOidcIssuerOutputWithContext(ctx context.Context) OidcIssuerOutput {
	return o
}

// The maximum duration of the Pulumi access token working after an exchange, specified in seconds.
func (o OidcIssuerOutput) MaxExpirationSeconds() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *OidcIssuer) pulumi.IntPtrOutput { return v.MaxExpirationSeconds }).(pulumi.IntPtrOutput)
}

// Issuer name.
func (o OidcIssuerOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *OidcIssuer) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Organization name.
func (o OidcIssuerOutput) Organization() pulumi.StringOutput {
	return o.ApplyT(func(v *OidcIssuer) pulumi.StringOutput { return v.Organization }).(pulumi.StringOutput)
}

// The authorization policies for this Oidc Issuer.
func (o OidcIssuerOutput) Policies() AuthPolicyDefinitionArrayOutput {
	return o.ApplyT(func(v *OidcIssuer) AuthPolicyDefinitionArrayOutput { return v.Policies }).(AuthPolicyDefinitionArrayOutput)
}

// The thumbprints of issuer's TLS certificates. By default, Pulumi will store the thumbprint of the certificate used to serve the OpenID configuration. If the provider uses multiple certificates to serve content, it is required to manually configure these.
func (o OidcIssuerOutput) Thumbprints() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *OidcIssuer) pulumi.StringArrayOutput { return v.Thumbprints }).(pulumi.StringArrayOutput)
}

// The OIDC issuer URL.
func (o OidcIssuerOutput) Url() pulumi.StringOutput {
	return o.ApplyT(func(v *OidcIssuer) pulumi.StringOutput { return v.Url }).(pulumi.StringOutput)
}

type OidcIssuerArrayOutput struct{ *pulumi.OutputState }

func (OidcIssuerArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*OidcIssuer)(nil)).Elem()
}

func (o OidcIssuerArrayOutput) ToOidcIssuerArrayOutput() OidcIssuerArrayOutput {
	return o
}

func (o OidcIssuerArrayOutput) ToOidcIssuerArrayOutputWithContext(ctx context.Context) OidcIssuerArrayOutput {
	return o
}

func (o OidcIssuerArrayOutput) Index(i pulumi.IntInput) OidcIssuerOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *OidcIssuer {
		return vs[0].([]*OidcIssuer)[vs[1].(int)]
	}).(OidcIssuerOutput)
}

type OidcIssuerMapOutput struct{ *pulumi.OutputState }

func (OidcIssuerMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*OidcIssuer)(nil)).Elem()
}

func (o OidcIssuerMapOutput) ToOidcIssuerMapOutput() OidcIssuerMapOutput {
	return o
}

func (o OidcIssuerMapOutput) ToOidcIssuerMapOutputWithContext(ctx context.Context) OidcIssuerMapOutput {
	return o
}

func (o OidcIssuerMapOutput) MapIndex(k pulumi.StringInput) OidcIssuerOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *OidcIssuer {
		return vs[0].(map[string]*OidcIssuer)[vs[1].(string)]
	}).(OidcIssuerOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*OidcIssuerInput)(nil)).Elem(), &OidcIssuer{})
	pulumi.RegisterInputType(reflect.TypeOf((*OidcIssuerArrayInput)(nil)).Elem(), OidcIssuerArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*OidcIssuerMapInput)(nil)).Elem(), OidcIssuerMap{})
	pulumi.RegisterOutputType(OidcIssuerOutput{})
	pulumi.RegisterOutputType(OidcIssuerArrayOutput{})
	pulumi.RegisterOutputType(OidcIssuerMapOutput{})
}