// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.PulumiService.Outputs
{

    /// <summary>
    /// Dependency cache settings for the deployment
    /// </summary>
    [OutputType]
    public sealed class DeploymentSettingsCacheOptions
    {
        /// <summary>
        /// Enable dependency caching
        /// </summary>
        public readonly bool? Enable;

        [OutputConstructor]
        private DeploymentSettingsCacheOptions(bool? enable)
        {
            Enable = enable;
        }
    }
}
