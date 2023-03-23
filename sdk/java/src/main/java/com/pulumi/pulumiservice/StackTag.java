// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pulumiservice;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.pulumiservice.StackTagArgs;
import com.pulumi.pulumiservice.Utilities;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Stacks have associated metadata in the form of tags. Each tag consists of a name and value.
 * 
 */
@ResourceType(type="pulumiservice:index:StackTag")
public class StackTag extends com.pulumi.resources.CustomResource {
    /**
     * Name of the tag. The &#39;key&#39; part of the key=value pair
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> name;

    /**
     * @return Name of the tag. The &#39;key&#39; part of the key=value pair
     * 
     */
    public Output<Optional<String>> name() {
        return Codegen.optional(this.name);
    }
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
     * Value of the tag. The &#39;value&#39; part of the key=value pair
     * 
     */
    @Export(name="value", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> value;

    /**
     * @return Value of the tag. The &#39;value&#39; part of the key=value pair
     * 
     */
    public Output<Optional<String>> value() {
        return Codegen.optional(this.value);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public StackTag(String name) {
        this(name, StackTagArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public StackTag(String name, @Nullable StackTagArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public StackTag(String name, @Nullable StackTagArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("pulumiservice:index:StackTag", name, args == null ? StackTagArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private StackTag(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("pulumiservice:index:StackTag", name, null, makeResourceOptions(options, id));
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
    public static StackTag get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new StackTag(name, id, options);
    }
}
