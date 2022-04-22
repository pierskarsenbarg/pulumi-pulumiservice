# coding=utf-8
# *** WARNING: this file was generated by pulumigen. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['WebhookArgs', 'Webhook']

@pulumi.input_type
class WebhookArgs:
    def __init__(__self__, *,
                 active: Optional[pulumi.Input[bool]] = None,
                 display_name: Optional[pulumi.Input[str]] = None,
                 organization_name: Optional[pulumi.Input[str]] = None,
                 payload_url: Optional[pulumi.Input[str]] = None,
                 secret: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a Webhook resource.
        """
        if active is not None:
            pulumi.set(__self__, "active", active)
        if display_name is not None:
            pulumi.set(__self__, "display_name", display_name)
        if organization_name is not None:
            pulumi.set(__self__, "organization_name", organization_name)
        if payload_url is not None:
            pulumi.set(__self__, "payload_url", payload_url)
        if secret is not None:
            pulumi.set(__self__, "secret", secret)

    @property
    @pulumi.getter
    def active(self) -> Optional[pulumi.Input[bool]]:
        return pulumi.get(self, "active")

    @active.setter
    def active(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "active", value)

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "display_name")

    @display_name.setter
    def display_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "display_name", value)

    @property
    @pulumi.getter(name="organizationName")
    def organization_name(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "organization_name")

    @organization_name.setter
    def organization_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "organization_name", value)

    @property
    @pulumi.getter(name="payloadUrl")
    def payload_url(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "payload_url")

    @payload_url.setter
    def payload_url(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "payload_url", value)

    @property
    @pulumi.getter
    def secret(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "secret")

    @secret.setter
    def secret(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "secret", value)


class Webhook(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 active: Optional[pulumi.Input[bool]] = None,
                 display_name: Optional[pulumi.Input[str]] = None,
                 organization_name: Optional[pulumi.Input[str]] = None,
                 payload_url: Optional[pulumi.Input[str]] = None,
                 secret: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Create a Webhook resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[WebhookArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Create a Webhook resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param WebhookArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(WebhookArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 active: Optional[pulumi.Input[bool]] = None,
                 display_name: Optional[pulumi.Input[str]] = None,
                 organization_name: Optional[pulumi.Input[str]] = None,
                 payload_url: Optional[pulumi.Input[str]] = None,
                 secret: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = WebhookArgs.__new__(WebhookArgs)

            __props__.__dict__["active"] = active
            __props__.__dict__["display_name"] = display_name
            __props__.__dict__["organization_name"] = organization_name
            __props__.__dict__["payload_url"] = payload_url
            __props__.__dict__["secret"] = None if secret is None else pulumi.Output.secret(secret)
            __props__.__dict__["name"] = None
        secret_opts = pulumi.ResourceOptions(additional_secret_outputs=["secret"])
        opts = pulumi.ResourceOptions.merge(opts, secret_opts)
        super(Webhook, __self__).__init__(
            'pulumiservice:index:Webhook',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None) -> 'Webhook':
        """
        Get an existing Webhook resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = WebhookArgs.__new__(WebhookArgs)

        __props__.__dict__["active"] = None
        __props__.__dict__["display_name"] = None
        __props__.__dict__["name"] = None
        __props__.__dict__["organization_name"] = None
        __props__.__dict__["payload_url"] = None
        __props__.__dict__["secret"] = None
        return Webhook(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def active(self) -> pulumi.Output[Optional[bool]]:
        return pulumi.get(self, "active")

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> pulumi.Output[Optional[str]]:
        return pulumi.get(self, "display_name")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[Optional[str]]:
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="organizationName")
    def organization_name(self) -> pulumi.Output[Optional[str]]:
        return pulumi.get(self, "organization_name")

    @property
    @pulumi.getter(name="payloadUrl")
    def payload_url(self) -> pulumi.Output[Optional[str]]:
        return pulumi.get(self, "payload_url")

    @property
    @pulumi.getter
    def secret(self) -> pulumi.Output[Optional[str]]:
        return pulumi.get(self, "secret")
