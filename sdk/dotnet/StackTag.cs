// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.PulumiService
{
    /// <summary>
    /// Stacks have associated metadata in the form of tags. Each tag consists of a name and value.
    /// </summary>
    [PulumiServiceResourceType("pulumiservice:index:StackTag")]
    public partial class StackTag : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Name of the tag. The 'key' part of the key=value pair
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Organization name.
        /// </summary>
        [Output("organization")]
        public Output<string> Organization { get; private set; } = null!;

        /// <summary>
        /// Project name.
        /// </summary>
        [Output("project")]
        public Output<string> Project { get; private set; } = null!;

        /// <summary>
        /// Stack name.
        /// </summary>
        [Output("stack")]
        public Output<string> Stack { get; private set; } = null!;

        /// <summary>
        /// Value of the tag. The 'value' part of the key=value pair
        /// </summary>
        [Output("value")]
        public Output<string> Value { get; private set; } = null!;


        /// <summary>
        /// Create a StackTag resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public StackTag(string name, StackTagArgs args, CustomResourceOptions? options = null)
            : base("pulumiservice:index:StackTag", name, args ?? new StackTagArgs(), MakeResourceOptions(options, ""))
        {
        }

        private StackTag(string name, Input<string> id, CustomResourceOptions? options = null)
            : base("pulumiservice:index:StackTag", name, null, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing StackTag resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static StackTag Get(string name, Input<string> id, CustomResourceOptions? options = null)
        {
            return new StackTag(name, id, options);
        }
    }

    public sealed class StackTagArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Name of the tag. The 'key' part of the key=value pair
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// Organization name.
        /// </summary>
        [Input("organization", required: true)]
        public Input<string> Organization { get; set; } = null!;

        /// <summary>
        /// Project name.
        /// </summary>
        [Input("project", required: true)]
        public Input<string> Project { get; set; } = null!;

        /// <summary>
        /// Stack name.
        /// </summary>
        [Input("stack", required: true)]
        public Input<string> Stack { get; set; } = null!;

        /// <summary>
        /// Value of the tag. The 'value' part of the key=value pair
        /// </summary>
        [Input("value", required: true)]
        public Input<string> Value { get; set; } = null!;

        public StackTagArgs()
        {
        }
        public static new StackTagArgs Empty => new StackTagArgs();
    }
}
