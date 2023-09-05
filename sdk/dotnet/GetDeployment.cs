// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.PulumiService
{
    public static class GetDeployment
    {
        /// <summary>
        /// Gets information about a deployment.
        /// </summary>
        public static Task<GetDeploymentResult> InvokeAsync(GetDeploymentArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetDeploymentResult>("pulumiservice:index:GetDeployment", args ?? new GetDeploymentArgs(), options.WithDefaults());

        /// <summary>
        /// Gets information about a deployment.
        /// </summary>
        public static Output<GetDeploymentResult> Invoke(GetDeploymentInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetDeploymentResult>("pulumiservice:index:GetDeployment", args ?? new GetDeploymentInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetDeploymentArgs : global::Pulumi.InvokeArgs
    {
        [Input("deploymentId")]
        public string? DeploymentId { get; set; }

        [Input("organization", required: true)]
        public string Organization { get; set; } = null!;

        [Input("project", required: true)]
        public string Project { get; set; } = null!;

        [Input("stack", required: true)]
        public string Stack { get; set; } = null!;

        [Input("version")]
        public double? Version { get; set; }

        public GetDeploymentArgs()
        {
        }
        public static new GetDeploymentArgs Empty => new GetDeploymentArgs();
    }

    public sealed class GetDeploymentInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("deploymentId")]
        public Input<string>? DeploymentId { get; set; }

        [Input("organization", required: true)]
        public Input<string> Organization { get; set; } = null!;

        [Input("project", required: true)]
        public Input<string> Project { get; set; } = null!;

        [Input("stack", required: true)]
        public Input<string> Stack { get; set; } = null!;

        [Input("version")]
        public Input<double>? Version { get; set; }

        public GetDeploymentInvokeArgs()
        {
        }
        public static new GetDeploymentInvokeArgs Empty => new GetDeploymentInvokeArgs();
    }


    [OutputType]
    public sealed class GetDeploymentResult
    {
        public readonly Pulumi.PulumiService.DeploymentStatus? Status;

        [OutputConstructor]
        private GetDeploymentResult(Pulumi.PulumiService.DeploymentStatus? status)
        {
            Status = status;
        }
    }
}
