// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.PulumiService
{
    /// <summary>
    /// The Pulumi Cloud offers role-based access control (RBAC) using teams. Teams allow organization admins to assign a set of stack permissions to a group of users.
    /// </summary>
    [PulumiServiceResourceType("pulumiservice:index:Team")]
    public partial class Team : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Optional. Team description.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// Optional. Team display name.
        /// </summary>
        [Output("displayName")]
        public Output<string?> DisplayName { get; private set; } = null!;

        /// <summary>
        /// The GitHub ID of the team to mirror. This is the only required parameter when creating a GitHub team -- all other parameters are taken from GitHub directly. Must be in the same GitHub organization that the Pulumi org is backed by.
        /// </summary>
        [Output("githubTeamID")]
        public Output<double?> GithubTeamID { get; private set; } = null!;

        /// <summary>
        /// List of team members.
        /// </summary>
        [Output("members")]
        public Output<ImmutableArray<string>> Members { get; private set; } = null!;

        /// <summary>
        /// The team name.
        /// </summary>
        [Output("name")]
        public Output<string?> Name { get; private set; } = null!;

        /// <summary>
        /// The name of the Pulumi organization the team belongs to.
        /// </summary>
        [Output("organizationName")]
        public Output<string?> OrganizationName { get; private set; } = null!;

        /// <summary>
        /// The type of team. Must be either `pulumi` or `github`.
        /// </summary>
        [Output("teamType")]
        public Output<string?> TeamType { get; private set; } = null!;


        /// <summary>
        /// Create a Team resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Team(string name, TeamArgs args, CustomResourceOptions? options = null)
            : base("pulumiservice:index:Team", name, args ?? new TeamArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Team(string name, Input<string> id, CustomResourceOptions? options = null)
            : base("pulumiservice:index:Team", name, null, MakeResourceOptions(options, id))
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
        /// Get an existing Team resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Team Get(string name, Input<string> id, CustomResourceOptions? options = null)
        {
            return new Team(name, id, options);
        }
    }

    public sealed class TeamArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Optional. Team description.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Optional. Team display name.
        /// </summary>
        [Input("displayName")]
        public Input<string>? DisplayName { get; set; }

        /// <summary>
        /// The GitHub ID of the team to mirror. This is the only required parameter when creating a GitHub team -- all other parameters are taken from GitHub directly. Must be in the same GitHub organization that the Pulumi org is backed by.
        /// </summary>
        [Input("githubTeamID")]
        public Input<double>? GithubTeamID { get; set; }

        [Input("members")]
        private InputList<string>? _members;

        /// <summary>
        /// List of team members.
        /// </summary>
        public InputList<string> Members
        {
            get => _members ?? (_members = new InputList<string>());
            set => _members = value;
        }

        /// <summary>
        /// The team name. Required for "pulumi" teams.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The name of the Pulumi organization the team belongs to.
        /// </summary>
        [Input("organizationName", required: true)]
        public Input<string> OrganizationName { get; set; } = null!;

        /// <summary>
        /// The type of team. Must be either `pulumi` or `github`.
        /// </summary>
        [Input("teamType", required: true)]
        public Input<string> TeamType { get; set; } = null!;

        public TeamArgs()
        {
        }
        public static new TeamArgs Empty => new TeamArgs();
    }
}
