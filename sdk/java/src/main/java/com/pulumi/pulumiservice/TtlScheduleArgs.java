// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pulumiservice;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TtlScheduleArgs extends com.pulumi.resources.ResourceArgs {

    public static final TtlScheduleArgs Empty = new TtlScheduleArgs();

    /**
     * Whether the stack should be deleted after it is destroyed.
     * 
     */
    @Import(name="deleteAfterDestroy")
    private @Nullable Output<Boolean> deleteAfterDestroy;

    /**
     * @return Whether the stack should be deleted after it is destroyed.
     * 
     */
    public Optional<Output<Boolean>> deleteAfterDestroy() {
        return Optional.ofNullable(this.deleteAfterDestroy);
    }

    /**
     * Organization name.
     * 
     */
    @Import(name="organization", required=true)
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
    @Import(name="project", required=true)
    private Output<String> project;

    /**
     * @return Project name.
     * 
     */
    public Output<String> project() {
        return this.project;
    }

    /**
     * Stack name.
     * 
     */
    @Import(name="stack", required=true)
    private Output<String> stack;

    /**
     * @return Stack name.
     * 
     */
    public Output<String> stack() {
        return this.stack;
    }

    /**
     * When to run the destroy command, in ISO format like this 2020-01-01T00:00:00Z.
     * 
     */
    @Import(name="timestamp", required=true)
    private Output<String> timestamp;

    /**
     * @return When to run the destroy command, in ISO format like this 2020-01-01T00:00:00Z.
     * 
     */
    public Output<String> timestamp() {
        return this.timestamp;
    }

    private TtlScheduleArgs() {}

    private TtlScheduleArgs(TtlScheduleArgs $) {
        this.deleteAfterDestroy = $.deleteAfterDestroy;
        this.organization = $.organization;
        this.project = $.project;
        this.stack = $.stack;
        this.timestamp = $.timestamp;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TtlScheduleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TtlScheduleArgs $;

        public Builder() {
            $ = new TtlScheduleArgs();
        }

        public Builder(TtlScheduleArgs defaults) {
            $ = new TtlScheduleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param deleteAfterDestroy Whether the stack should be deleted after it is destroyed.
         * 
         * @return builder
         * 
         */
        public Builder deleteAfterDestroy(@Nullable Output<Boolean> deleteAfterDestroy) {
            $.deleteAfterDestroy = deleteAfterDestroy;
            return this;
        }

        /**
         * @param deleteAfterDestroy Whether the stack should be deleted after it is destroyed.
         * 
         * @return builder
         * 
         */
        public Builder deleteAfterDestroy(Boolean deleteAfterDestroy) {
            return deleteAfterDestroy(Output.of(deleteAfterDestroy));
        }

        /**
         * @param organization Organization name.
         * 
         * @return builder
         * 
         */
        public Builder organization(Output<String> organization) {
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
        public Builder project(Output<String> project) {
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
        public Builder stack(Output<String> stack) {
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
         * @param timestamp When to run the destroy command, in ISO format like this 2020-01-01T00:00:00Z.
         * 
         * @return builder
         * 
         */
        public Builder timestamp(Output<String> timestamp) {
            $.timestamp = timestamp;
            return this;
        }

        /**
         * @param timestamp When to run the destroy command, in ISO format like this 2020-01-01T00:00:00Z.
         * 
         * @return builder
         * 
         */
        public Builder timestamp(String timestamp) {
            return timestamp(Output.of(timestamp));
        }

        public TtlScheduleArgs build() {
            if ($.organization == null) {
                throw new MissingRequiredPropertyException("TtlScheduleArgs", "organization");
            }
            if ($.project == null) {
                throw new MissingRequiredPropertyException("TtlScheduleArgs", "project");
            }
            if ($.stack == null) {
                throw new MissingRequiredPropertyException("TtlScheduleArgs", "stack");
            }
            if ($.timestamp == null) {
                throw new MissingRequiredPropertyException("TtlScheduleArgs", "timestamp");
            }
            return $;
        }
    }

}
