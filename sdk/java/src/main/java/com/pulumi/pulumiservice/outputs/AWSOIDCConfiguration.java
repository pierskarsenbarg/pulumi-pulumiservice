// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pulumiservice.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AWSOIDCConfiguration {
    /**
     * @return Duration of the assume-role session in “XhYmZs” format
     * 
     */
    private @Nullable String duration;
    /**
     * @return Optional set of IAM policy ARNs that further restrict the assume-role session
     * 
     */
    private @Nullable List<String> policyARNs;
    /**
     * @return The ARN of the role to assume using the OIDC token.
     * 
     */
    private String roleARN;
    /**
     * @return The name of the assume-role session.
     * 
     */
    private String sessionName;

    private AWSOIDCConfiguration() {}
    /**
     * @return Duration of the assume-role session in “XhYmZs” format
     * 
     */
    public Optional<String> duration() {
        return Optional.ofNullable(this.duration);
    }
    /**
     * @return Optional set of IAM policy ARNs that further restrict the assume-role session
     * 
     */
    public List<String> policyARNs() {
        return this.policyARNs == null ? List.of() : this.policyARNs;
    }
    /**
     * @return The ARN of the role to assume using the OIDC token.
     * 
     */
    public String roleARN() {
        return this.roleARN;
    }
    /**
     * @return The name of the assume-role session.
     * 
     */
    public String sessionName() {
        return this.sessionName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AWSOIDCConfiguration defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String duration;
        private @Nullable List<String> policyARNs;
        private String roleARN;
        private String sessionName;
        public Builder() {}
        public Builder(AWSOIDCConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.duration = defaults.duration;
    	      this.policyARNs = defaults.policyARNs;
    	      this.roleARN = defaults.roleARN;
    	      this.sessionName = defaults.sessionName;
        }

        @CustomType.Setter
        public Builder duration(@Nullable String duration) {

            this.duration = duration;
            return this;
        }
        @CustomType.Setter
        public Builder policyARNs(@Nullable List<String> policyARNs) {

            this.policyARNs = policyARNs;
            return this;
        }
        public Builder policyARNs(String... policyARNs) {
            return policyARNs(List.of(policyARNs));
        }
        @CustomType.Setter
        public Builder roleARN(String roleARN) {
            if (roleARN == null) {
              throw new MissingRequiredPropertyException("AWSOIDCConfiguration", "roleARN");
            }
            this.roleARN = roleARN;
            return this;
        }
        @CustomType.Setter
        public Builder sessionName(String sessionName) {
            if (sessionName == null) {
              throw new MissingRequiredPropertyException("AWSOIDCConfiguration", "sessionName");
            }
            this.sessionName = sessionName;
            return this;
        }
        public AWSOIDCConfiguration build() {
            final var _resultValue = new AWSOIDCConfiguration();
            _resultValue.duration = duration;
            _resultValue.policyARNs = policyARNs;
            _resultValue.roleARN = roleARN;
            _resultValue.sessionName = sessionName;
            return _resultValue;
        }
    }
}