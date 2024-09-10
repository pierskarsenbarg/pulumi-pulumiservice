// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pulumiservice;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.pulumiservice.DeploymentScheduleArgs;
import com.pulumi.pulumiservice.Utilities;
import com.pulumi.pulumiservice.enums.PulumiOperation;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * A scheduled recurring or single time run of a pulumi command.
 * 
 */
@ResourceType(type="pulumiservice:index:DeploymentSchedule")
public class DeploymentSchedule extends com.pulumi.resources.CustomResource {
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
     * Which operation to run.
     * 
     */
    @Export(name="pulumiOperation", refs={PulumiOperation.class}, tree="[0]")
    private Output<PulumiOperation> pulumiOperation;

    /**
     * @return Which operation to run.
     * 
     */
    public Output<PulumiOperation> pulumiOperation() {
        return this.pulumiOperation;
    }
    /**
     * Cron expression for recurring scheduled runs. If you are supplying this, do not supply timestamp.
     * 
     */
    @Export(name="scheduleCron", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> scheduleCron;

    /**
     * @return Cron expression for recurring scheduled runs. If you are supplying this, do not supply timestamp.
     * 
     */
    public Output<Optional<String>> scheduleCron() {
        return Codegen.optional(this.scheduleCron);
    }
    /**
     * Schedule ID of the created schedule, assigned by Pulumi Cloud.
     * 
     */
    @Export(name="scheduleId", refs={String.class}, tree="[0]")
    private Output<String> scheduleId;

    /**
     * @return Schedule ID of the created schedule, assigned by Pulumi Cloud.
     * 
     */
    public Output<String> scheduleId() {
        return this.scheduleId;
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
     * The time at which the schedule should run, in ISO 8601 format. Eg: 2020-01-01T00:00:00Z. If you are supplying this, do not supply scheduleCron.
     * 
     */
    @Export(name="timestamp", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> timestamp;

    /**
     * @return The time at which the schedule should run, in ISO 8601 format. Eg: 2020-01-01T00:00:00Z. If you are supplying this, do not supply scheduleCron.
     * 
     */
    public Output<Optional<String>> timestamp() {
        return Codegen.optional(this.timestamp);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DeploymentSchedule(java.lang.String name) {
        this(name, DeploymentScheduleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DeploymentSchedule(java.lang.String name, DeploymentScheduleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DeploymentSchedule(java.lang.String name, DeploymentScheduleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("pulumiservice:index:DeploymentSchedule", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private DeploymentSchedule(java.lang.String name, Output<java.lang.String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("pulumiservice:index:DeploymentSchedule", name, null, makeResourceOptions(options, id), false);
    }

    private static DeploymentScheduleArgs makeArgs(DeploymentScheduleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? DeploymentScheduleArgs.Empty : args;
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
    public static DeploymentSchedule get(java.lang.String name, Output<java.lang.String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DeploymentSchedule(name, id, options);
    }
}
