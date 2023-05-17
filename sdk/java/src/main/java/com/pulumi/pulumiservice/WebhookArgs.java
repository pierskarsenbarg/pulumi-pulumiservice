// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pulumiservice;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.pulumiservice.enums.WebhookFilters;
import com.pulumi.pulumiservice.enums.WebhookFormat;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WebhookArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebhookArgs Empty = new WebhookArgs();

    /**
     * Indicates whether this webhook is enabled or not.
     * 
     */
    @Import(name="active", required=true)
    private Output<Boolean> active;

    /**
     * @return Indicates whether this webhook is enabled or not.
     * 
     */
    public Output<Boolean> active() {
        return this.active;
    }

    /**
     * The friendly name displayed in the Pulumi Service.
     * 
     */
    @Import(name="displayName", required=true)
    private Output<String> displayName;

    /**
     * @return The friendly name displayed in the Pulumi Service.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }

    /**
     * Optional set of filters to apply to the webhook. See [webhook docs](https://www.pulumi.com/docs/intro/pulumi-service/webhooks/#filters) for more information.
     * 
     */
    @Import(name="filters")
    private @Nullable Output<List<WebhookFilters>> filters;

    /**
     * @return Optional set of filters to apply to the webhook. See [webhook docs](https://www.pulumi.com/docs/intro/pulumi-service/webhooks/#filters) for more information.
     * 
     */
    public Optional<Output<List<WebhookFilters>>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * Format of the webhook payload. Can be either `raw` or `slack`. Defaults to `raw`.
     * 
     */
    @Import(name="format")
    private @Nullable Output<WebhookFormat> format;

    /**
     * @return Format of the webhook payload. Can be either `raw` or `slack`. Defaults to `raw`.
     * 
     */
    public Optional<Output<WebhookFormat>> format() {
        return Optional.ofNullable(this.format);
    }

    /**
     * Name of the organization.
     * 
     */
    @Import(name="organizationName", required=true)
    private Output<String> organizationName;

    /**
     * @return Name of the organization.
     * 
     */
    public Output<String> organizationName() {
        return this.organizationName;
    }

    /**
     * URL to send request to.
     * 
     */
    @Import(name="payloadUrl", required=true)
    private Output<String> payloadUrl;

    /**
     * @return URL to send request to.
     * 
     */
    public Output<String> payloadUrl() {
        return this.payloadUrl;
    }

    /**
     * Name of the project. Only needed if this is a stack webhook.
     * 
     */
    @Import(name="projectName")
    private @Nullable Output<String> projectName;

    /**
     * @return Name of the project. Only needed if this is a stack webhook.
     * 
     */
    public Optional<Output<String>> projectName() {
        return Optional.ofNullable(this.projectName);
    }

    /**
     * Optional. secret used as the HMAC key. See [webhook docs](https://www.pulumi.com/docs/intro/pulumi-service/webhooks/#headers) for more information.
     * 
     */
    @Import(name="secret")
    private @Nullable Output<String> secret;

    /**
     * @return Optional. secret used as the HMAC key. See [webhook docs](https://www.pulumi.com/docs/intro/pulumi-service/webhooks/#headers) for more information.
     * 
     */
    public Optional<Output<String>> secret() {
        return Optional.ofNullable(this.secret);
    }

    /**
     * Name of the stack. Only needed if this is a stack webhook.
     * 
     */
    @Import(name="stackName")
    private @Nullable Output<String> stackName;

    /**
     * @return Name of the stack. Only needed if this is a stack webhook.
     * 
     */
    public Optional<Output<String>> stackName() {
        return Optional.ofNullable(this.stackName);
    }

    private WebhookArgs() {}

    private WebhookArgs(WebhookArgs $) {
        this.active = $.active;
        this.displayName = $.displayName;
        this.filters = $.filters;
        this.format = $.format;
        this.organizationName = $.organizationName;
        this.payloadUrl = $.payloadUrl;
        this.projectName = $.projectName;
        this.secret = $.secret;
        this.stackName = $.stackName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebhookArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebhookArgs $;

        public Builder() {
            $ = new WebhookArgs();
        }

        public Builder(WebhookArgs defaults) {
            $ = new WebhookArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param active Indicates whether this webhook is enabled or not.
         * 
         * @return builder
         * 
         */
        public Builder active(Output<Boolean> active) {
            $.active = active;
            return this;
        }

        /**
         * @param active Indicates whether this webhook is enabled or not.
         * 
         * @return builder
         * 
         */
        public Builder active(Boolean active) {
            return active(Output.of(active));
        }

        /**
         * @param displayName The friendly name displayed in the Pulumi Service.
         * 
         * @return builder
         * 
         */
        public Builder displayName(Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName The friendly name displayed in the Pulumi Service.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param filters Optional set of filters to apply to the webhook. See [webhook docs](https://www.pulumi.com/docs/intro/pulumi-service/webhooks/#filters) for more information.
         * 
         * @return builder
         * 
         */
        public Builder filters(@Nullable Output<List<WebhookFilters>> filters) {
            $.filters = filters;
            return this;
        }

        /**
         * @param filters Optional set of filters to apply to the webhook. See [webhook docs](https://www.pulumi.com/docs/intro/pulumi-service/webhooks/#filters) for more information.
         * 
         * @return builder
         * 
         */
        public Builder filters(List<WebhookFilters> filters) {
            return filters(Output.of(filters));
        }

        /**
         * @param filters Optional set of filters to apply to the webhook. See [webhook docs](https://www.pulumi.com/docs/intro/pulumi-service/webhooks/#filters) for more information.
         * 
         * @return builder
         * 
         */
        public Builder filters(WebhookFilters... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param format Format of the webhook payload. Can be either `raw` or `slack`. Defaults to `raw`.
         * 
         * @return builder
         * 
         */
        public Builder format(@Nullable Output<WebhookFormat> format) {
            $.format = format;
            return this;
        }

        /**
         * @param format Format of the webhook payload. Can be either `raw` or `slack`. Defaults to `raw`.
         * 
         * @return builder
         * 
         */
        public Builder format(WebhookFormat format) {
            return format(Output.of(format));
        }

        /**
         * @param organizationName Name of the organization.
         * 
         * @return builder
         * 
         */
        public Builder organizationName(Output<String> organizationName) {
            $.organizationName = organizationName;
            return this;
        }

        /**
         * @param organizationName Name of the organization.
         * 
         * @return builder
         * 
         */
        public Builder organizationName(String organizationName) {
            return organizationName(Output.of(organizationName));
        }

        /**
         * @param payloadUrl URL to send request to.
         * 
         * @return builder
         * 
         */
        public Builder payloadUrl(Output<String> payloadUrl) {
            $.payloadUrl = payloadUrl;
            return this;
        }

        /**
         * @param payloadUrl URL to send request to.
         * 
         * @return builder
         * 
         */
        public Builder payloadUrl(String payloadUrl) {
            return payloadUrl(Output.of(payloadUrl));
        }

        /**
         * @param projectName Name of the project. Only needed if this is a stack webhook.
         * 
         * @return builder
         * 
         */
        public Builder projectName(@Nullable Output<String> projectName) {
            $.projectName = projectName;
            return this;
        }

        /**
         * @param projectName Name of the project. Only needed if this is a stack webhook.
         * 
         * @return builder
         * 
         */
        public Builder projectName(String projectName) {
            return projectName(Output.of(projectName));
        }

        /**
         * @param secret Optional. secret used as the HMAC key. See [webhook docs](https://www.pulumi.com/docs/intro/pulumi-service/webhooks/#headers) for more information.
         * 
         * @return builder
         * 
         */
        public Builder secret(@Nullable Output<String> secret) {
            $.secret = secret;
            return this;
        }

        /**
         * @param secret Optional. secret used as the HMAC key. See [webhook docs](https://www.pulumi.com/docs/intro/pulumi-service/webhooks/#headers) for more information.
         * 
         * @return builder
         * 
         */
        public Builder secret(String secret) {
            return secret(Output.of(secret));
        }

        /**
         * @param stackName Name of the stack. Only needed if this is a stack webhook.
         * 
         * @return builder
         * 
         */
        public Builder stackName(@Nullable Output<String> stackName) {
            $.stackName = stackName;
            return this;
        }

        /**
         * @param stackName Name of the stack. Only needed if this is a stack webhook.
         * 
         * @return builder
         * 
         */
        public Builder stackName(String stackName) {
            return stackName(Output.of(stackName));
        }

        public WebhookArgs build() {
            $.active = Objects.requireNonNull($.active, "expected parameter 'active' to be non-null");
            $.displayName = Objects.requireNonNull($.displayName, "expected parameter 'displayName' to be non-null");
            $.format = Codegen.objectProp("format", WebhookFormat.class).output().arg($.format).def(WebhookFormat.Raw).getNullable();
            $.organizationName = Objects.requireNonNull($.organizationName, "expected parameter 'organizationName' to be non-null");
            $.payloadUrl = Objects.requireNonNull($.payloadUrl, "expected parameter 'payloadUrl' to be non-null");
            return $;
        }
    }

}
