# coding=utf-8
# *** WARNING: this file was generated by pulumi-language-python. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import sys
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
if sys.version_info >= (3, 11):
    from typing import NotRequired, TypedDict, TypeAlias
else:
    from typing_extensions import NotRequired, TypedDict, TypeAlias
from . import _utilities
from ._enums import *

__all__ = ['DeploymentScheduleArgs', 'DeploymentSchedule']

@pulumi.input_type
class DeploymentScheduleArgs:
    def __init__(__self__, *,
                 organization: pulumi.Input[str],
                 project: pulumi.Input[str],
                 pulumi_operation: pulumi.Input['PulumiOperation'],
                 stack: pulumi.Input[str],
                 schedule_cron: Optional[pulumi.Input[str]] = None,
                 timestamp: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a DeploymentSchedule resource.
        :param pulumi.Input[str] organization: Organization name.
        :param pulumi.Input[str] project: Project name.
        :param pulumi.Input['PulumiOperation'] pulumi_operation: Which command to run.
        :param pulumi.Input[str] stack: Stack name.
        :param pulumi.Input[str] schedule_cron: Cron expression for recurring scheduled runs. If you are supplying this, do not supply timestamp.
        :param pulumi.Input[str] timestamp: The time at which the schedule should run, in ISO 8601 format. Eg: 2020-01-01T00:00:00Z. If you are supplying this, do not supply scheduleCron.
        """
        pulumi.set(__self__, "organization", organization)
        pulumi.set(__self__, "project", project)
        pulumi.set(__self__, "pulumi_operation", pulumi_operation)
        pulumi.set(__self__, "stack", stack)
        if schedule_cron is not None:
            pulumi.set(__self__, "schedule_cron", schedule_cron)
        if timestamp is not None:
            pulumi.set(__self__, "timestamp", timestamp)

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
    @pulumi.getter(name="pulumiOperation")
    def pulumi_operation(self) -> pulumi.Input['PulumiOperation']:
        """
        Which command to run.
        """
        return pulumi.get(self, "pulumi_operation")

    @pulumi_operation.setter
    def pulumi_operation(self, value: pulumi.Input['PulumiOperation']):
        pulumi.set(self, "pulumi_operation", value)

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
    @pulumi.getter(name="scheduleCron")
    def schedule_cron(self) -> Optional[pulumi.Input[str]]:
        """
        Cron expression for recurring scheduled runs. If you are supplying this, do not supply timestamp.
        """
        return pulumi.get(self, "schedule_cron")

    @schedule_cron.setter
    def schedule_cron(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "schedule_cron", value)

    @property
    @pulumi.getter
    def timestamp(self) -> Optional[pulumi.Input[str]]:
        """
        The time at which the schedule should run, in ISO 8601 format. Eg: 2020-01-01T00:00:00Z. If you are supplying this, do not supply scheduleCron.
        """
        return pulumi.get(self, "timestamp")

    @timestamp.setter
    def timestamp(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "timestamp", value)


class DeploymentSchedule(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 organization: Optional[pulumi.Input[str]] = None,
                 project: Optional[pulumi.Input[str]] = None,
                 pulumi_operation: Optional[pulumi.Input['PulumiOperation']] = None,
                 schedule_cron: Optional[pulumi.Input[str]] = None,
                 stack: Optional[pulumi.Input[str]] = None,
                 timestamp: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        A scheduled recurring or single time run of a pulumi command.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] organization: Organization name.
        :param pulumi.Input[str] project: Project name.
        :param pulumi.Input['PulumiOperation'] pulumi_operation: Which command to run.
        :param pulumi.Input[str] schedule_cron: Cron expression for recurring scheduled runs. If you are supplying this, do not supply timestamp.
        :param pulumi.Input[str] stack: Stack name.
        :param pulumi.Input[str] timestamp: The time at which the schedule should run, in ISO 8601 format. Eg: 2020-01-01T00:00:00Z. If you are supplying this, do not supply scheduleCron.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: DeploymentScheduleArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        A scheduled recurring or single time run of a pulumi command.

        :param str resource_name: The name of the resource.
        :param DeploymentScheduleArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(DeploymentScheduleArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 organization: Optional[pulumi.Input[str]] = None,
                 project: Optional[pulumi.Input[str]] = None,
                 pulumi_operation: Optional[pulumi.Input['PulumiOperation']] = None,
                 schedule_cron: Optional[pulumi.Input[str]] = None,
                 stack: Optional[pulumi.Input[str]] = None,
                 timestamp: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = DeploymentScheduleArgs.__new__(DeploymentScheduleArgs)

            if organization is None and not opts.urn:
                raise TypeError("Missing required property 'organization'")
            __props__.__dict__["organization"] = organization
            if project is None and not opts.urn:
                raise TypeError("Missing required property 'project'")
            __props__.__dict__["project"] = project
            if pulumi_operation is None and not opts.urn:
                raise TypeError("Missing required property 'pulumi_operation'")
            __props__.__dict__["pulumi_operation"] = pulumi_operation
            __props__.__dict__["schedule_cron"] = schedule_cron
            if stack is None and not opts.urn:
                raise TypeError("Missing required property 'stack'")
            __props__.__dict__["stack"] = stack
            __props__.__dict__["timestamp"] = timestamp
            __props__.__dict__["schedule_id"] = None
        super(DeploymentSchedule, __self__).__init__(
            'pulumiservice:index:DeploymentSchedule',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None) -> 'DeploymentSchedule':
        """
        Get an existing DeploymentSchedule resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = DeploymentScheduleArgs.__new__(DeploymentScheduleArgs)

        __props__.__dict__["organization"] = None
        __props__.__dict__["project"] = None
        __props__.__dict__["pulumi_operation"] = None
        __props__.__dict__["schedule_cron"] = None
        __props__.__dict__["schedule_id"] = None
        __props__.__dict__["stack"] = None
        __props__.__dict__["timestamp"] = None
        return DeploymentSchedule(resource_name, opts=opts, __props__=__props__)

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
    @pulumi.getter(name="pulumiOperation")
    def pulumi_operation(self) -> pulumi.Output['PulumiOperation']:
        """
        Which operation to run.
        """
        return pulumi.get(self, "pulumi_operation")

    @property
    @pulumi.getter(name="scheduleCron")
    def schedule_cron(self) -> pulumi.Output[Optional[str]]:
        """
        Cron expression for recurring scheduled runs. If you are supplying this, do not supply timestamp.
        """
        return pulumi.get(self, "schedule_cron")

    @property
    @pulumi.getter(name="scheduleId")
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
    def timestamp(self) -> pulumi.Output[Optional[str]]:
        """
        The time at which the schedule should run, in ISO 8601 format. Eg: 2020-01-01T00:00:00Z. If you are supplying this, do not supply scheduleCron.
        """
        return pulumi.get(self, "timestamp")

