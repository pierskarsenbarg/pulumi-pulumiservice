// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pulumiservice.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DeploymentSettingsGithub {
    /**
     * @return Trigger a deployment running `pulumi up` on commit.
     * 
     */
    private @Nullable Boolean deployCommits;
    /**
     * @return The paths within the repo that deployments should be filtered to.
     * 
     */
    private @Nullable List<String> paths;
    /**
     * @return Trigger a deployment running `pulumi preview` when a PR is opened.
     * 
     */
    private @Nullable Boolean previewPullRequests;
    /**
     * @return Use this stack as a template for pull request review stacks.
     * 
     */
    private @Nullable Boolean pullRequestTemplate;
    /**
     * @return The GitHub repository in the format org/repo.
     * 
     */
    private @Nullable String repository;

    private DeploymentSettingsGithub() {}
    /**
     * @return Trigger a deployment running `pulumi up` on commit.
     * 
     */
    public Optional<Boolean> deployCommits() {
        return Optional.ofNullable(this.deployCommits);
    }
    /**
     * @return The paths within the repo that deployments should be filtered to.
     * 
     */
    public List<String> paths() {
        return this.paths == null ? List.of() : this.paths;
    }
    /**
     * @return Trigger a deployment running `pulumi preview` when a PR is opened.
     * 
     */
    public Optional<Boolean> previewPullRequests() {
        return Optional.ofNullable(this.previewPullRequests);
    }
    /**
     * @return Use this stack as a template for pull request review stacks.
     * 
     */
    public Optional<Boolean> pullRequestTemplate() {
        return Optional.ofNullable(this.pullRequestTemplate);
    }
    /**
     * @return The GitHub repository in the format org/repo.
     * 
     */
    public Optional<String> repository() {
        return Optional.ofNullable(this.repository);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentSettingsGithub defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean deployCommits;
        private @Nullable List<String> paths;
        private @Nullable Boolean previewPullRequests;
        private @Nullable Boolean pullRequestTemplate;
        private @Nullable String repository;
        public Builder() {}
        public Builder(DeploymentSettingsGithub defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deployCommits = defaults.deployCommits;
    	      this.paths = defaults.paths;
    	      this.previewPullRequests = defaults.previewPullRequests;
    	      this.pullRequestTemplate = defaults.pullRequestTemplate;
    	      this.repository = defaults.repository;
        }

        @CustomType.Setter
        public Builder deployCommits(@Nullable Boolean deployCommits) {

            this.deployCommits = deployCommits;
            return this;
        }
        @CustomType.Setter
        public Builder paths(@Nullable List<String> paths) {

            this.paths = paths;
            return this;
        }
        public Builder paths(String... paths) {
            return paths(List.of(paths));
        }
        @CustomType.Setter
        public Builder previewPullRequests(@Nullable Boolean previewPullRequests) {

            this.previewPullRequests = previewPullRequests;
            return this;
        }
        @CustomType.Setter
        public Builder pullRequestTemplate(@Nullable Boolean pullRequestTemplate) {

            this.pullRequestTemplate = pullRequestTemplate;
            return this;
        }
        @CustomType.Setter
        public Builder repository(@Nullable String repository) {

            this.repository = repository;
            return this;
        }
        public DeploymentSettingsGithub build() {
            final var _resultValue = new DeploymentSettingsGithub();
            _resultValue.deployCommits = deployCommits;
            _resultValue.paths = paths;
            _resultValue.previewPullRequests = previewPullRequests;
            _resultValue.pullRequestTemplate = pullRequestTemplate;
            _resultValue.repository = repository;
            return _resultValue;
        }
    }
}