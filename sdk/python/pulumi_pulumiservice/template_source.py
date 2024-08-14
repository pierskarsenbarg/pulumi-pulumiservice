# coding=utf-8
# *** WARNING: this file was generated by pulumi-language-python. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs
from ._inputs import *

__all__ = ['TemplateSourceArgs', 'TemplateSource']

@pulumi.input_type
class TemplateSourceArgs:
    def __init__(__self__, *,
                 organization_name: pulumi.Input[str],
                 source_name: pulumi.Input[str],
                 source_url: pulumi.Input[str],
                 destination: Optional[pulumi.Input['TemplateSourceDestinationArgs']] = None):
        """
        The set of arguments for constructing a TemplateSource resource.
        :param pulumi.Input[str] organization_name: Organization name.
        :param pulumi.Input[str] source_name: Source name.
        :param pulumi.Input[str] source_url: Github URL of the repository from which to grab templates.
        :param pulumi.Input['TemplateSourceDestinationArgs'] destination: Settings that get filled in on new project creation.
        """
        pulumi.set(__self__, "organization_name", organization_name)
        pulumi.set(__self__, "source_name", source_name)
        pulumi.set(__self__, "source_url", source_url)
        if destination is not None:
            pulumi.set(__self__, "destination", destination)

    @property
    @pulumi.getter(name="organizationName")
    def organization_name(self) -> pulumi.Input[str]:
        """
        Organization name.
        """
        return pulumi.get(self, "organization_name")

    @organization_name.setter
    def organization_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "organization_name", value)

    @property
    @pulumi.getter(name="sourceName")
    def source_name(self) -> pulumi.Input[str]:
        """
        Source name.
        """
        return pulumi.get(self, "source_name")

    @source_name.setter
    def source_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "source_name", value)

    @property
    @pulumi.getter(name="sourceURL")
    def source_url(self) -> pulumi.Input[str]:
        """
        Github URL of the repository from which to grab templates.
        """
        return pulumi.get(self, "source_url")

    @source_url.setter
    def source_url(self, value: pulumi.Input[str]):
        pulumi.set(self, "source_url", value)

    @property
    @pulumi.getter
    def destination(self) -> Optional[pulumi.Input['TemplateSourceDestinationArgs']]:
        """
        Settings that get filled in on new project creation.
        """
        return pulumi.get(self, "destination")

    @destination.setter
    def destination(self, value: Optional[pulumi.Input['TemplateSourceDestinationArgs']]):
        pulumi.set(self, "destination", value)


class TemplateSource(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 destination: Optional[pulumi.Input[pulumi.InputType['TemplateSourceDestinationArgs']]] = None,
                 organization_name: Optional[pulumi.Input[str]] = None,
                 source_name: Optional[pulumi.Input[str]] = None,
                 source_url: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        A source for Pulumi templates

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[pulumi.InputType['TemplateSourceDestinationArgs']] destination: Settings that get filled in on new project creation.
        :param pulumi.Input[str] organization_name: Organization name.
        :param pulumi.Input[str] source_name: Source name.
        :param pulumi.Input[str] source_url: Github URL of the repository from which to grab templates.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: TemplateSourceArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        A source for Pulumi templates

        :param str resource_name: The name of the resource.
        :param TemplateSourceArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(TemplateSourceArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 destination: Optional[pulumi.Input[pulumi.InputType['TemplateSourceDestinationArgs']]] = None,
                 organization_name: Optional[pulumi.Input[str]] = None,
                 source_name: Optional[pulumi.Input[str]] = None,
                 source_url: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = TemplateSourceArgs.__new__(TemplateSourceArgs)

            __props__.__dict__["destination"] = destination
            if organization_name is None and not opts.urn:
                raise TypeError("Missing required property 'organization_name'")
            __props__.__dict__["organization_name"] = organization_name
            if source_name is None and not opts.urn:
                raise TypeError("Missing required property 'source_name'")
            __props__.__dict__["source_name"] = source_name
            if source_url is None and not opts.urn:
                raise TypeError("Missing required property 'source_url'")
            __props__.__dict__["source_url"] = source_url
        super(TemplateSource, __self__).__init__(
            'pulumiservice:index:TemplateSource',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None) -> 'TemplateSource':
        """
        Get an existing TemplateSource resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = TemplateSourceArgs.__new__(TemplateSourceArgs)

        __props__.__dict__["destination"] = None
        __props__.__dict__["organization_name"] = None
        __props__.__dict__["source_name"] = None
        __props__.__dict__["source_url"] = None
        return TemplateSource(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def destination(self) -> pulumi.Output[Optional['outputs.TemplateSourceDestination']]:
        """
        Settings that get filled in on new project creation.
        """
        return pulumi.get(self, "destination")

    @property
    @pulumi.getter(name="organizationName")
    def organization_name(self) -> pulumi.Output[str]:
        """
        Organization name.
        """
        return pulumi.get(self, "organization_name")

    @property
    @pulumi.getter(name="sourceName")
    def source_name(self) -> pulumi.Output[str]:
        """
        Source name.
        """
        return pulumi.get(self, "source_name")

    @property
    @pulumi.getter(name="sourceURL")
    def source_url(self) -> pulumi.Output[str]:
        """
        Github URL of the repository from which to grab templates.
        """
        return pulumi.get(self, "source_url")

