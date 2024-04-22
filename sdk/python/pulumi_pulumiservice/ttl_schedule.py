# coding=utf-8
# *** WARNING: this file was generated by pulumi-language-python. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['TtlScheduleArgs', 'TtlSchedule']

@pulumi.input_type
class TtlScheduleArgs:
    def __init__(__self__, *,
                 organization: pulumi.Input[str],
                 project: pulumi.Input[str],
                 stack: pulumi.Input[str],
                 timestamp: pulumi.Input[str],
                 delete_after_destroy: Optional[pulumi.Input[bool]] = None):
        """
        The set of arguments for constructing a TtlSchedule resource.
        :param pulumi.Input[str] organization: Organization name.
        :param pulumi.Input[str] project: Project name.
        :param pulumi.Input[str] stack: Stack name.
        :param pulumi.Input[str] timestamp: When to run the destroy command, in ISO format like this 2020-01-01T00:00:00Z.
        :param pulumi.Input[bool] delete_after_destroy: Whether the stack should be deleted after it is destroyed.
        """
        pulumi.set(__self__, "organization", organization)
        pulumi.set(__self__, "project", project)
        pulumi.set(__self__, "stack", stack)
        pulumi.set(__self__, "timestamp", timestamp)
        if delete_after_destroy is not None:
            pulumi.set(__self__, "delete_after_destroy", delete_after_destroy)

    @property
    @pulumi.getter
    def organization(self) -> pulumi.Input[str]:
        """
        Organization name.
        """
        return pulumi.get(self, "organization")

    @organization.setter
    def organization(self, value: pulumi.Input[str]):
        pulumi.set(self, "organization", value)

    @property
    @pulumi.getter
    def project(self) -> pulumi.Input[str]:
        """
        Project name.
        """
        return pulumi.get(self, "project")

    @project.setter
    def project(self, value: pulumi.Input[str]):
        pulumi.set(self, "project", value)

    @property
    @pulumi.getter
    def stack(self) -> pulumi.Input[str]:
        """
        Stack name.
        """
        return pulumi.get(self, "stack")

    @stack.setter
    def stack(self, value: pulumi.Input[str]):
        pulumi.set(self, "stack", value)

    @property
    @pulumi.getter
    def timestamp(self) -> pulumi.Input[str]:
        """
        When to run the destroy command, in ISO format like this 2020-01-01T00:00:00Z.
        """
        return pulumi.get(self, "timestamp")

    @timestamp.setter
    def timestamp(self, value: pulumi.Input[str]):
        pulumi.set(self, "timestamp", value)

    @property
    @pulumi.getter(name="deleteAfterDestroy")
    def delete_after_destroy(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether the stack should be deleted after it is destroyed.
        """
        return pulumi.get(self, "delete_after_destroy")

    @delete_after_destroy.setter
    def delete_after_destroy(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "delete_after_destroy", value)


class TtlSchedule(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 delete_after_destroy: Optional[pulumi.Input[bool]] = None,
                 organization: Optional[pulumi.Input[str]] = None,
                 project: Optional[pulumi.Input[str]] = None,
                 stack: Optional[pulumi.Input[str]] = None,
                 timestamp: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        A scheduled stack destory run.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] delete_after_destroy: Whether the stack should be deleted after it is destroyed.
        :param pulumi.Input[str] organization: Organization name.
        :param pulumi.Input[str] project: Project name.
        :param pulumi.Input[str] stack: Stack name.
        :param pulumi.Input[str] timestamp: When to run the destroy command, in ISO format like this 2020-01-01T00:00:00Z.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: TtlScheduleArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        A scheduled stack destory run.

        :param str resource_name: The name of the resource.
        :param TtlScheduleArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(TtlScheduleArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 delete_after_destroy: Optional[pulumi.Input[bool]] = None,
                 organization: Optional[pulumi.Input[str]] = None,
                 project: Optional[pulumi.Input[str]] = None,
                 stack: Optional[pulumi.Input[str]] = None,
                 timestamp: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = TtlScheduleArgs.__new__(TtlScheduleArgs)

            __props__.__dict__["delete_after_destroy"] = delete_after_destroy
            if organization is None and not opts.urn:
                raise TypeError("Missing required property 'organization'")
            __props__.__dict__["organization"] = organization
            if project is None and not opts.urn:
                raise TypeError("Missing required property 'project'")
            __props__.__dict__["project"] = project
            if stack is None and not opts.urn:
                raise TypeError("Missing required property 'stack'")
            __props__.__dict__["stack"] = stack
            if timestamp is None and not opts.urn:
                raise TypeError("Missing required property 'timestamp'")
            __props__.__dict__["timestamp"] = timestamp
            __props__.__dict__["schedule_id"] = None
        super(TtlSchedule, __self__).__init__(
            'pulumiservice:index:TtlSchedule',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None) -> 'TtlSchedule':
        """
        Get an existing TtlSchedule resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = TtlScheduleArgs.__new__(TtlScheduleArgs)

        __props__.__dict__["organization"] = None
        __props__.__dict__["project"] = None
        __props__.__dict__["schedule_id"] = None
        __props__.__dict__["stack"] = None
        __props__.__dict__["timestamp"] = None
        return TtlSchedule(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def organization(self) -> pulumi.Output[str]:
        """
        Organization name.
        """
        return pulumi.get(self, "organization")

    @property
    @pulumi.getter
    def project(self) -> pulumi.Output[str]:
        """
        Project name.
        """
        return pulumi.get(self, "project")

    @property
    @pulumi.getter(name="scheduleID")
    def schedule_id(self) -> pulumi.Output[str]:
        """
        Schedule ID of the created schedule, assigned by Pulumi Cloud.
        """
        return pulumi.get(self, "schedule_id")

    @property
    @pulumi.getter
    def stack(self) -> pulumi.Output[str]:
        """
        Stack name.
        """
        return pulumi.get(self, "stack")

    @property
    @pulumi.getter
    def timestamp(self) -> pulumi.Output[str]:
        """
        When to run the destroy command, in ISO format like this 2020-01-01T00:00:00Z.
        """
        return pulumi.get(self, "timestamp")

