// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pulumiservice.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    @EnumType
    public enum PulumiOperation {
        /**
         * Analogous to `pulumi up` command.
         * 
         */
        Update("update"),
        /**
         * Analogous to `pulumi preview` command.
         * 
         */
        Preview("preview"),
        /**
         * Analogous to `pulumi refresh` command.
         * 
         */
        Refresh("refresh"),
        /**
         * Analogous to `pulumi destroy` command.
         * 
         */
        Destroy("destroy");

        private final String value;

        PulumiOperation(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public java.lang.String toString() {
            return new StringJoiner(", ", "PulumiOperation[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
