// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pulumiservice;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.pulumiservice.TeamAccessTokenArgs;
import com.pulumi.pulumiservice.Utilities;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * The Pulumi Cloud allows users to create access tokens scoped to team. Team access tokens is a resource to create them and assign them to a team
 * 
 */
@ResourceType(type="pulumiservice:index:TeamAccessToken")
public class TeamAccessToken extends com.pulumi.resources.CustomResource {
    /**
     * Optional. Description for the token.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return Optional. Description for the token.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The name for the token. This must be unique amongst all machine tokens within your organization.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name for the token. This must be unique amongst all machine tokens within your organization.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The organization&#39;s name.
     * 
     */
    @Export(name="organizationName", refs={String.class}, tree="[0]")
    private Output<String> organizationName;

    /**
     * @return The organization&#39;s name.
     * 
     */
    public Output<String> organizationName() {
        return this.organizationName;
    }
    /**
     * The team name.
     * 
     */
    @Export(name="teamName", refs={String.class}, tree="[0]")
    private Output<String> teamName;

    /**
     * @return The team name.
     * 
     */
    public Output<String> teamName() {
        return this.teamName;
    }
    /**
     * The token&#39;s value.
     * 
     */
    @Export(name="value", refs={String.class}, tree="[0]")
    private Output<String> value;

    /**
     * @return The token&#39;s value.
     * 
     */
    public Output<String> value() {
        return this.value;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public TeamAccessToken(java.lang.String name) {
        this(name, TeamAccessTokenArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public TeamAccessToken(java.lang.String name, TeamAccessTokenArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TeamAccessToken(java.lang.String name, TeamAccessTokenArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("pulumiservice:index:TeamAccessToken", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private TeamAccessToken(java.lang.String name, Output<java.lang.String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("pulumiservice:index:TeamAccessToken", name, null, makeResourceOptions(options, id), false);
    }

    private static TeamAccessTokenArgs makeArgs(TeamAccessTokenArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? TeamAccessTokenArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "value"
            ))
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static TeamAccessToken get(java.lang.String name, Output<java.lang.String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new TeamAccessToken(name, id, options);
    }
}
