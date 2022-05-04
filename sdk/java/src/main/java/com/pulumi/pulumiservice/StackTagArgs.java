// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pulumiservice;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class StackTagArgs extends com.pulumi.resources.ResourceArgs {

    public static final StackTagArgs Empty = new StackTagArgs();

    /**
     * Name of the tag. The &#39;key&#39; part of the key=value pair
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the tag. The &#39;key&#39; part of the key=value pair
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Organization name.
     * 
     */
    @Import(name="organization")
    private @Nullable Output<String> organization;

    /**
     * @return Organization name.
     * 
     */
    public Optional<Output<String>> organization() {
        return Optional.ofNullable(this.organization);
    }

    /**
     * Project name.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return Project name.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * Stack name.
     * 
     */
    @Import(name="stack")
    private @Nullable Output<String> stack;

    /**
     * @return Stack name.
     * 
     */
    public Optional<Output<String>> stack() {
        return Optional.ofNullable(this.stack);
    }

    /**
     * Value of the tag. The &#39;value&#39; part of the key=value pair
     * 
     */
    @Import(name="value")
    private @Nullable Output<String> value;

    /**
     * @return Value of the tag. The &#39;value&#39; part of the key=value pair
     * 
     */
    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    private StackTagArgs() {}

    private StackTagArgs(StackTagArgs $) {
        this.name = $.name;
        this.organization = $.organization;
        this.project = $.project;
        this.stack = $.stack;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StackTagArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StackTagArgs $;

        public Builder() {
            $ = new StackTagArgs();
        }

        public Builder(StackTagArgs defaults) {
            $ = new StackTagArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Name of the tag. The &#39;key&#39; part of the key=value pair
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the tag. The &#39;key&#39; part of the key=value pair
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param organization Organization name.
         * 
         * @return builder
         * 
         */
        public Builder organization(@Nullable Output<String> organization) {
            $.organization = organization;
            return this;
        }

        /**
         * @param organization Organization name.
         * 
         * @return builder
         * 
         */
        public Builder organization(String organization) {
            return organization(Output.of(organization));
        }

        /**
         * @param project Project name.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project Project name.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param stack Stack name.
         * 
         * @return builder
         * 
         */
        public Builder stack(@Nullable Output<String> stack) {
            $.stack = stack;
            return this;
        }

        /**
         * @param stack Stack name.
         * 
         * @return builder
         * 
         */
        public Builder stack(String stack) {
            return stack(Output.of(stack));
        }

        /**
         * @param value Value of the tag. The &#39;value&#39; part of the key=value pair
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value Value of the tag. The &#39;value&#39; part of the key=value pair
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public StackTagArgs build() {
            return $;
        }
    }

}
