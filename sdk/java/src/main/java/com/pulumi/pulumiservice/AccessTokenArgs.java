// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pulumiservice;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class AccessTokenArgs extends com.pulumi.resources.ResourceArgs {

    public static final AccessTokenArgs Empty = new AccessTokenArgs();

    /**
     * Description of the access token.
     * 
     */
    @Import(name="description", required=true)
    private Output<String> description;

    /**
     * @return Description of the access token.
     * 
     */
    public Output<String> description() {
        return this.description;
    }

    private AccessTokenArgs() {}

    private AccessTokenArgs(AccessTokenArgs $) {
        this.description = $.description;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccessTokenArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccessTokenArgs $;

        public Builder() {
            $ = new AccessTokenArgs();
        }

        public Builder(AccessTokenArgs defaults) {
            $ = new AccessTokenArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description Description of the access token.
         * 
         * @return builder
         * 
         */
        public Builder description(Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description of the access token.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        public AccessTokenArgs build() {
            if ($.description == null) {
                throw new MissingRequiredPropertyException("AccessTokenArgs", "description");
            }
            return $;
        }
    }

}
