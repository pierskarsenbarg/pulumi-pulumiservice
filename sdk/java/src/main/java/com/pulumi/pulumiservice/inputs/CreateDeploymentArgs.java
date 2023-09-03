// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pulumiservice.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CreateDeploymentArgs extends com.pulumi.resources.InvokeArgs {

    public static final CreateDeploymentArgs Empty = new CreateDeploymentArgs();

    @Import(name="inheritSettings")
    private @Nullable Output<Boolean> inheritSettings;

    public Optional<Output<Boolean>> inheritSettings() {
        return Optional.ofNullable(this.inheritSettings);
    }

    @Import(name="operation")
    private @Nullable Output<String> operation;

    public Optional<Output<String>> operation() {
        return Optional.ofNullable(this.operation);
    }

    @Import(name="organization", required=true)
    private Output<String> organization;

    public Output<String> organization() {
        return this.organization;
    }

    @Import(name="project", required=true)
    private Output<String> project;

    public Output<String> project() {
        return this.project;
    }

    @Import(name="stack", required=true)
    private Output<String> stack;

    public Output<String> stack() {
        return this.stack;
    }

    private CreateDeploymentArgs() {}

    private CreateDeploymentArgs(CreateDeploymentArgs $) {
        this.inheritSettings = $.inheritSettings;
        this.operation = $.operation;
        this.organization = $.organization;
        this.project = $.project;
        this.stack = $.stack;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CreateDeploymentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CreateDeploymentArgs $;

        public Builder() {
            $ = new CreateDeploymentArgs();
        }

        public Builder(CreateDeploymentArgs defaults) {
            $ = new CreateDeploymentArgs(Objects.requireNonNull(defaults));
        }

        public Builder inheritSettings(@Nullable Output<Boolean> inheritSettings) {
            $.inheritSettings = inheritSettings;
            return this;
        }

        public Builder inheritSettings(Boolean inheritSettings) {
            return inheritSettings(Output.of(inheritSettings));
        }

        public Builder operation(@Nullable Output<String> operation) {
            $.operation = operation;
            return this;
        }

        public Builder operation(String operation) {
            return operation(Output.of(operation));
        }

        public Builder organization(Output<String> organization) {
            $.organization = organization;
            return this;
        }

        public Builder organization(String organization) {
            return organization(Output.of(organization));
        }

        public Builder project(Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder stack(Output<String> stack) {
            $.stack = stack;
            return this;
        }

        public Builder stack(String stack) {
            return stack(Output.of(stack));
        }

        public CreateDeploymentArgs build() {
            $.inheritSettings = Codegen.booleanProp("inheritSettings").output().arg($.inheritSettings).def(true).getNullable();
            $.operation = Codegen.stringProp("operation").output().arg($.operation).def("update").getNullable();
            $.organization = Objects.requireNonNull($.organization, "expected parameter 'organization' to be non-null");
            $.project = Objects.requireNonNull($.project, "expected parameter 'project' to be non-null");
            $.stack = Objects.requireNonNull($.stack, "expected parameter 'stack' to be non-null");
            return $;
        }
    }

}
