// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.PulumiService.Inputs
{

    public sealed class OperationContextOptionsArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The shell to use to run commands during the deployment. Defaults to 'bash'.
        /// </summary>
        [Input("shell")]
        public Input<string>? Shell { get; set; }

        /// <summary>
        /// Skip the default dependency installation step - use this to customize the dependency installation (e.g. if using yarn or poetry)
        /// </summary>
        [Input("skipInstallDependencies")]
        public Input<bool>? SkipInstallDependencies { get; set; }

        /// <summary>
        /// Skip duplicated queued operations (it will only execute the last deployment of the same type)
        /// </summary>
        [Input("skipIntermediateDeployments")]
        public Input<bool>? SkipIntermediateDeployments { get; set; }

        public OperationContextOptionsArgs()
        {
        }
        public static new OperationContextOptionsArgs Empty => new OperationContextOptionsArgs();
    }
}
