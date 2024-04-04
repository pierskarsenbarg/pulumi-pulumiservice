// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pulumiservice.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.pulumiservice.inputs.DeploymentSettingsGitAuthBasicAuthArgs;
import com.pulumi.pulumiservice.inputs.DeploymentSettingsGitAuthSSHAuthArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Git source settings for a deployment.
 * 
 */
public final class DeploymentSettingsGitSourceGitAuthArgs extends com.pulumi.resources.ResourceArgs {

    public static final DeploymentSettingsGitSourceGitAuthArgs Empty = new DeploymentSettingsGitSourceGitAuthArgs();

    /**
     * Basic auth for git authentication. Only one of `personalAccessToken`, `sshAuth`, or `basicAuth` must be defined.
     * 
     */
    @Import(name="basicAuth")
    private @Nullable Output<DeploymentSettingsGitAuthBasicAuthArgs> basicAuth;

    /**
     * @return Basic auth for git authentication. Only one of `personalAccessToken`, `sshAuth`, or `basicAuth` must be defined.
     * 
     */
    public Optional<Output<DeploymentSettingsGitAuthBasicAuthArgs>> basicAuth() {
        return Optional.ofNullable(this.basicAuth);
    }

    /**
     * SSH auth for git authentication. Only one of `personalAccessToken`, `sshAuth`, or `basicAuth` must be defined.
     * 
     */
    @Import(name="sshAuth")
    private @Nullable Output<DeploymentSettingsGitAuthSSHAuthArgs> sshAuth;

    /**
     * @return SSH auth for git authentication. Only one of `personalAccessToken`, `sshAuth`, or `basicAuth` must be defined.
     * 
     */
    public Optional<Output<DeploymentSettingsGitAuthSSHAuthArgs>> sshAuth() {
        return Optional.ofNullable(this.sshAuth);
    }

    private DeploymentSettingsGitSourceGitAuthArgs() {}

    private DeploymentSettingsGitSourceGitAuthArgs(DeploymentSettingsGitSourceGitAuthArgs $) {
        this.basicAuth = $.basicAuth;
        this.sshAuth = $.sshAuth;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeploymentSettingsGitSourceGitAuthArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeploymentSettingsGitSourceGitAuthArgs $;

        public Builder() {
            $ = new DeploymentSettingsGitSourceGitAuthArgs();
        }

        public Builder(DeploymentSettingsGitSourceGitAuthArgs defaults) {
            $ = new DeploymentSettingsGitSourceGitAuthArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param basicAuth Basic auth for git authentication. Only one of `personalAccessToken`, `sshAuth`, or `basicAuth` must be defined.
         * 
         * @return builder
         * 
         */
        public Builder basicAuth(@Nullable Output<DeploymentSettingsGitAuthBasicAuthArgs> basicAuth) {
            $.basicAuth = basicAuth;
            return this;
        }

        /**
         * @param basicAuth Basic auth for git authentication. Only one of `personalAccessToken`, `sshAuth`, or `basicAuth` must be defined.
         * 
         * @return builder
         * 
         */
        public Builder basicAuth(DeploymentSettingsGitAuthBasicAuthArgs basicAuth) {
            return basicAuth(Output.of(basicAuth));
        }

        /**
         * @param sshAuth SSH auth for git authentication. Only one of `personalAccessToken`, `sshAuth`, or `basicAuth` must be defined.
         * 
         * @return builder
         * 
         */
        public Builder sshAuth(@Nullable Output<DeploymentSettingsGitAuthSSHAuthArgs> sshAuth) {
            $.sshAuth = sshAuth;
            return this;
        }

        /**
         * @param sshAuth SSH auth for git authentication. Only one of `personalAccessToken`, `sshAuth`, or `basicAuth` must be defined.
         * 
         * @return builder
         * 
         */
        public Builder sshAuth(DeploymentSettingsGitAuthSSHAuthArgs sshAuth) {
            return sshAuth(Output.of(sshAuth));
        }

        public DeploymentSettingsGitSourceGitAuthArgs build() {
            return $;
        }
    }

}
