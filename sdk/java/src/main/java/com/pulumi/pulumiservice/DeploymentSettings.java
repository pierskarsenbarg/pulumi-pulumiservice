// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pulumiservice;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.pulumiservice.DeploymentSettingsArgs;
import com.pulumi.pulumiservice.Utilities;
import com.pulumi.pulumiservice.outputs.DeploymentSettingsCacheOptions;
import com.pulumi.pulumiservice.outputs.DeploymentSettingsExecutorContext;
import com.pulumi.pulumiservice.outputs.DeploymentSettingsGithub;
import com.pulumi.pulumiservice.outputs.DeploymentSettingsOperationContext;
import com.pulumi.pulumiservice.outputs.DeploymentSettingsSourceContext;
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
     * The agent pool identifier to use for the deployment.
     * 
     */
    @Export(name="agentPoolId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> agentPoolId;

    /**
     * @return The agent pool identifier to use for the deployment.
     * 
     */
    public Output<Optional<String>> agentPoolId() {
        return Codegen.optional(this.agentPoolId);
    }
    /**
     * Dependency cache settings for the deployment
     * 
     */
    @Export(name="cacheOptions", refs={DeploymentSettingsCacheOptions.class}, tree="[0]")
    private Output</* @Nullable */ DeploymentSettingsCacheOptions> cacheOptions;

    /**
     * @return Dependency cache settings for the deployment
     * 
     */
    public Output<Optional<DeploymentSettingsCacheOptions>> cacheOptions() {
        return Codegen.optional(this.cacheOptions);
    }
    /**
     * Settings related to the deployment executor.
     * 
     */
    @Export(name="executorContext", refs={DeploymentSettingsExecutorContext.class}, tree="[0]")
    private Output</* @Nullable */ DeploymentSettingsExecutorContext> executorContext;

    /**
     * @return Settings related to the deployment executor.
     * 
     */
    public Output<Optional<DeploymentSettingsExecutorContext>> executorContext() {
        return Codegen.optional(this.executorContext);
    }
    /**
     * GitHub settings for the deployment.
     * 
     */
    @Export(name="github", refs={DeploymentSettingsGithub.class}, tree="[0]")
    private Output</* @Nullable */ DeploymentSettingsGithub> github;

    /**
     * @return GitHub settings for the deployment.
     * 
     */
    public Output<Optional<DeploymentSettingsGithub>> github() {
        return Codegen.optional(this.github);
    }
    /**
     * Settings related to the Pulumi operation environment during the deployment.
     * 
     */
    @Export(name="operationContext", refs={DeploymentSettingsOperationContext.class}, tree="[0]")
    private Output</* @Nullable */ DeploymentSettingsOperationContext> operationContext;

    /**
     * @return Settings related to the Pulumi operation environment during the deployment.
     * 
     */
    public Output<Optional<DeploymentSettingsOperationContext>> operationContext() {
        return Codegen.optional(this.operationContext);
    }
    /**
     * Organization name.
     * 
     */
    @Export(name="organization", refs={String.class}, tree="[0]")
    private Output<String> organization;

    /**
     * @return Organization name.
     * 
     */
    public Output<String> organization() {
        return this.organization;
    }
    /**
     * Project name.
     * 
     */
    @Export(name="project", refs={String.class}, tree="[0]")
    private Output<String> project;

    /**
     * @return Project name.
     * 
     */
    public Output<String> project() {
        return this.project;
    }
    /**
     * Settings related to the source of the deployment.
     * 
     */
    @Export(name="sourceContext", refs={DeploymentSettingsSourceContext.class}, tree="[0]")
    private Output</* @Nullable */ DeploymentSettingsSourceContext> sourceContext;

    /**
     * @return Settings related to the source of the deployment.
     * 
     */
    public Output<Optional<DeploymentSettingsSourceContext>> sourceContext() {
        return Codegen.optional(this.sourceContext);
    }
    /**
     * Stack name.
     * 
     */
    @Export(name="stack", refs={String.class}, tree="[0]")
    private Output<String> stack;

    /**
     * @return Stack name.
     * 
     */
    public Output<String> stack() {
        return this.stack;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DeploymentSettings(java.lang.String name) {
        this(name, DeploymentSettingsArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DeploymentSettings(java.lang.String name, DeploymentSettingsArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DeploymentSettings(java.lang.String name, DeploymentSettingsArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("pulumiservice:index:DeploymentSettings", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private DeploymentSettings(java.lang.String name, Output<java.lang.String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("pulumiservice:index:DeploymentSettings", name, null, makeResourceOptions(options, id), false);
    }

    private static DeploymentSettingsArgs makeArgs(DeploymentSettingsArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? DeploymentSettingsArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
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
    public static DeploymentSettings get(java.lang.String name, Output<java.lang.String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DeploymentSettings(name, id, options);
    }
}
