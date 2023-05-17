// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pulumiservice.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.pulumiservice.inputs.AWSOIDCConfigurationArgs;
import com.pulumi.pulumiservice.inputs.AzureOIDCConfigurationArgs;
import com.pulumi.pulumiservice.inputs.GCPOIDCConfigurationArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OperationContextOIDCArgs extends com.pulumi.resources.ResourceArgs {

    public static final OperationContextOIDCArgs Empty = new OperationContextOIDCArgs();

    /**
     * AWS-specific OIDC configuration.
     * 
     */
    @Import(name="aws")
    private @Nullable Output<AWSOIDCConfigurationArgs> aws;

    /**
     * @return AWS-specific OIDC configuration.
     * 
     */
    public Optional<Output<AWSOIDCConfigurationArgs>> aws() {
        return Optional.ofNullable(this.aws);
    }

    /**
     * Azure-specific OIDC configuration.
     * 
     */
    @Import(name="azure")
    private @Nullable Output<AzureOIDCConfigurationArgs> azure;

    /**
     * @return Azure-specific OIDC configuration.
     * 
     */
    public Optional<Output<AzureOIDCConfigurationArgs>> azure() {
        return Optional.ofNullable(this.azure);
    }

    /**
     * GCP-specific OIDC configuration.
     * 
     */
    @Import(name="gcp")
    private @Nullable Output<GCPOIDCConfigurationArgs> gcp;

    /**
     * @return GCP-specific OIDC configuration.
     * 
     */
    public Optional<Output<GCPOIDCConfigurationArgs>> gcp() {
        return Optional.ofNullable(this.gcp);
    }

    private OperationContextOIDCArgs() {}

    private OperationContextOIDCArgs(OperationContextOIDCArgs $) {
        this.aws = $.aws;
        this.azure = $.azure;
        this.gcp = $.gcp;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OperationContextOIDCArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OperationContextOIDCArgs $;

        public Builder() {
            $ = new OperationContextOIDCArgs();
        }

        public Builder(OperationContextOIDCArgs defaults) {
            $ = new OperationContextOIDCArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param aws AWS-specific OIDC configuration.
         * 
         * @return builder
         * 
         */
        public Builder aws(@Nullable Output<AWSOIDCConfigurationArgs> aws) {
            $.aws = aws;
            return this;
        }

        /**
         * @param aws AWS-specific OIDC configuration.
         * 
         * @return builder
         * 
         */
        public Builder aws(AWSOIDCConfigurationArgs aws) {
            return aws(Output.of(aws));
        }

        /**
         * @param azure Azure-specific OIDC configuration.
         * 
         * @return builder
         * 
         */
        public Builder azure(@Nullable Output<AzureOIDCConfigurationArgs> azure) {
            $.azure = azure;
            return this;
        }

        /**
         * @param azure Azure-specific OIDC configuration.
         * 
         * @return builder
         * 
         */
        public Builder azure(AzureOIDCConfigurationArgs azure) {
            return azure(Output.of(azure));
        }

        /**
         * @param gcp GCP-specific OIDC configuration.
         * 
         * @return builder
         * 
         */
        public Builder gcp(@Nullable Output<GCPOIDCConfigurationArgs> gcp) {
            $.gcp = gcp;
            return this;
        }

        /**
         * @param gcp GCP-specific OIDC configuration.
         * 
         * @return builder
         * 
         */
        public Builder gcp(GCPOIDCConfigurationArgs gcp) {
            return gcp(Output.of(gcp));
        }

        public OperationContextOIDCArgs build() {
            return $;
        }
    }

}