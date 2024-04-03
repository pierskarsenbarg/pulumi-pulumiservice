// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pulumiservice;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AgentPoolArgs extends com.pulumi.resources.ResourceArgs {

    public static final AgentPoolArgs Empty = new AgentPoolArgs();

    /**
     * Description of the agent pool.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Description of the agent pool.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Name of the agent pool.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Name of the agent pool.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The organization&#39;s name.
     * 
     */
    @Import(name="organizationName", required=true)
    private Output<String> organizationName;

    /**
     * @return The organization&#39;s name.
     * 
     */
    public Output<String> organizationName() {
        return this.organizationName;
    }

    private AgentPoolArgs() {}

    private AgentPoolArgs(AgentPoolArgs $) {
        this.description = $.description;
        this.name = $.name;
        this.organizationName = $.organizationName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AgentPoolArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AgentPoolArgs $;

        public Builder() {
            $ = new AgentPoolArgs();
        }

        public Builder(AgentPoolArgs defaults) {
            $ = new AgentPoolArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description Description of the agent pool.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description of the agent pool.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param name Name of the agent pool.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the agent pool.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param organizationName The organization&#39;s name.
         * 
         * @return builder
         * 
         */
        public Builder organizationName(Output<String> organizationName) {
            $.organizationName = organizationName;
            return this;
        }

        /**
         * @param organizationName The organization&#39;s name.
         * 
         * @return builder
         * 
         */
        public Builder organizationName(String organizationName) {
            return organizationName(Output.of(organizationName));
        }

        public AgentPoolArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("AgentPoolArgs", "name");
            }
            if ($.organizationName == null) {
                throw new MissingRequiredPropertyException("AgentPoolArgs", "organizationName");
            }
            return $;
        }
    }

}
