// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pulumiservice;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.pulumiservice.TemplateSourceArgs;
import com.pulumi.pulumiservice.Utilities;
import com.pulumi.pulumiservice.outputs.TemplateSourceDestination;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * A source for Pulumi templates
 * 
 */
@ResourceType(type="pulumiservice:index:TemplateSource")
public class TemplateSource extends com.pulumi.resources.CustomResource {
    /**
     * The default destination for projects using templates from this source.
     * 
     */
    @Export(name="destination", refs={TemplateSourceDestination.class}, tree="[0]")
    private Output</* @Nullable */ TemplateSourceDestination> destination;

    /**
     * @return The default destination for projects using templates from this source.
     * 
     */
    public Output<Optional<TemplateSourceDestination>> destination() {
        return Codegen.optional(this.destination);
    }
    /**
     * Organization name.
     * 
     */
    @Export(name="organizationName", refs={String.class}, tree="[0]")
    private Output<String> organizationName;

    /**
     * @return Organization name.
     * 
     */
    public Output<String> organizationName() {
        return this.organizationName;
    }
    /**
     * Source name.
     * 
     */
    @Export(name="sourceName", refs={String.class}, tree="[0]")
    private Output<String> sourceName;

    /**
     * @return Source name.
     * 
     */
    public Output<String> sourceName() {
        return this.sourceName;
    }
    /**
     * Github URL of the repository from which to grab templates.
     * 
     */
    @Export(name="sourceURL", refs={String.class}, tree="[0]")
    private Output<String> sourceURL;

    /**
     * @return Github URL of the repository from which to grab templates.
     * 
     */
    public Output<String> sourceURL() {
        return this.sourceURL;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public TemplateSource(String name) {
        this(name, TemplateSourceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public TemplateSource(String name, TemplateSourceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TemplateSource(String name, TemplateSourceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("pulumiservice:index:TemplateSource", name, args == null ? TemplateSourceArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private TemplateSource(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("pulumiservice:index:TemplateSource", name, null, makeResourceOptions(options, id));
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
    public static TemplateSource get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new TemplateSource(name, id, options);
    }
}
