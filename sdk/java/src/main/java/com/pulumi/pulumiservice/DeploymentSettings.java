// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pulumiservice;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.pulumiservice.DeploymentSettingsArgs;
import com.pulumi.pulumiservice.Utilities;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Deployment settings configure Pulumi Deployments for a stack.
 * 
 * ### Import
 * 
 * Deployment settings can be imported using the `id`, which for deployment settings is `{org}/{project}/{stack}` e.g.,
 * 
 * ```sh
 *  $ pulumi import pulumiservice:index:DeploymentSettings my_settings my-org/my-project/my-stack
 * ```
 * 
 */
@ResourceType(type="pulumiservice:index:DeploymentSettings")
public class DeploymentSettings extends com.pulumi.resources.CustomResource {
    /**
     * Organization name.
     * 
     */
    @Export(name="organization", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> organization;

    /**
     * @return Organization name.
     * 
     */
    public Output<Optional<String>> organization() {
        return Codegen.optional(this.organization);
    }
    /**
     * Project name.
     * 
     */
    @Export(name="project", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> project;

    /**
     * @return Project name.
     * 
     */
    public Output<Optional<String>> project() {
        return Codegen.optional(this.project);
    }
    /**
     * Stack name.
     * 
     */
    @Export(name="stack", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> stack;

    /**
     * @return Stack name.
     * 
     */
    public Output<Optional<String>> stack() {
        return Codegen.optional(this.stack);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DeploymentSettings(String name) {
        this(name, DeploymentSettingsArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DeploymentSettings(String name, DeploymentSettingsArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DeploymentSettings(String name, DeploymentSettingsArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("pulumiservice:index:DeploymentSettings", name, args == null ? DeploymentSettingsArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DeploymentSettings(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("pulumiservice:index:DeploymentSettings", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
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
    public static DeploymentSettings get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DeploymentSettings(name, id, options);
    }
}
