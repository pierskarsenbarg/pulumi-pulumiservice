# coding=utf-8
# *** WARNING: this file was generated by pulumi-language-python. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from ._enums import *

__all__ = [
    'AWSOIDCConfigurationArgs',
    'AzureOIDCConfigurationArgs',
    'DeploymentSettingsExecutorContextArgs',
    'DeploymentSettingsGitAuthBasicAuthArgs',
    'DeploymentSettingsGitAuthSSHAuthArgs',
    'DeploymentSettingsGitSourceGitAuthArgs',
    'DeploymentSettingsGitSourceArgs',
    'DeploymentSettingsGithubArgs',
    'DeploymentSettingsOperationContextArgs',
    'DeploymentSettingsSourceContextArgs',
    'GCPOIDCConfigurationArgs',
    'OperationContextOIDCArgs',
    'OperationContextOptionsArgs',
    'TemplateSourceDestinationArgs',
]

@pulumi.input_type
class AWSOIDCConfigurationArgs:
    def __init__(__self__, *,
                 role_arn: pulumi.Input[str],
                 session_name: pulumi.Input[str],
                 duration: Optional[pulumi.Input[str]] = None,
                 policy_arns: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None):
        """
        :param pulumi.Input[str] role_arn: The ARN of the role to assume using the OIDC token.
        :param pulumi.Input[str] session_name: The name of the assume-role session.
        :param pulumi.Input[str] duration: Duration of the assume-role session in “XhYmZs” format
        :param pulumi.Input[Sequence[pulumi.Input[str]]] policy_arns: Optional set of IAM policy ARNs that further restrict the assume-role session
        """
        pulumi.set(__self__, "role_arn", role_arn)
        pulumi.set(__self__, "session_name", session_name)
        if duration is not None:
            pulumi.set(__self__, "duration", duration)
        if policy_arns is not None:
            pulumi.set(__self__, "policy_arns", policy_arns)

    @property
    @pulumi.getter(name="roleARN")
    def role_arn(self) -> pulumi.Input[str]:
        """
        The ARN of the role to assume using the OIDC token.
        """
        return pulumi.get(self, "role_arn")

    @role_arn.setter
    def role_arn(self, value: pulumi.Input[str]):
        pulumi.set(self, "role_arn", value)

    @property
    @pulumi.getter(name="sessionName")
    def session_name(self) -> pulumi.Input[str]:
        """
        The name of the assume-role session.
        """
        return pulumi.get(self, "session_name")

    @session_name.setter
    def session_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "session_name", value)

    @property
    @pulumi.getter
    def duration(self) -> Optional[pulumi.Input[str]]:
        """
        Duration of the assume-role session in “XhYmZs” format
        """
        return pulumi.get(self, "duration")

    @duration.setter
    def duration(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "duration", value)

    @property
    @pulumi.getter(name="policyARNs")
    def policy_arns(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        Optional set of IAM policy ARNs that further restrict the assume-role session
        """
        return pulumi.get(self, "policy_arns")

    @policy_arns.setter
    def policy_arns(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "policy_arns", value)


@pulumi.input_type
class AzureOIDCConfigurationArgs:
    def __init__(__self__, *,
                 client_id: pulumi.Input[str],
                 subscription_id: pulumi.Input[str],
                 tenant_id: pulumi.Input[str]):
        """
        :param pulumi.Input[str] client_id: The client ID of the federated workload identity.
        :param pulumi.Input[str] subscription_id: The subscription ID of the federated workload identity.
        :param pulumi.Input[str] tenant_id: The tenant ID of the federated workload identity.
        """
        pulumi.set(__self__, "client_id", client_id)
        pulumi.set(__self__, "subscription_id", subscription_id)
        pulumi.set(__self__, "tenant_id", tenant_id)

    @property
    @pulumi.getter(name="clientId")
    def client_id(self) -> pulumi.Input[str]:
        """
        The client ID of the federated workload identity.
        """
        return pulumi.get(self, "client_id")

    @client_id.setter
    def client_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "client_id", value)

    @property
    @pulumi.getter(name="subscriptionId")
    def subscription_id(self) -> pulumi.Input[str]:
        """
        The subscription ID of the federated workload identity.
        """
        return pulumi.get(self, "subscription_id")

    @subscription_id.setter
    def subscription_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "subscription_id", value)

    @property
    @pulumi.getter(name="tenantId")
    def tenant_id(self) -> pulumi.Input[str]:
        """
        The tenant ID of the federated workload identity.
        """
        return pulumi.get(self, "tenant_id")

    @tenant_id.setter
    def tenant_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "tenant_id", value)


@pulumi.input_type
class DeploymentSettingsExecutorContextArgs:
    def __init__(__self__, *,
                 executor_image: pulumi.Input[str]):
        """
        The executor context defines information about the executor where the deployment is executed. If unspecified, the default 'pulumi/pulumi' image is used.
        :param pulumi.Input[str] executor_image: Allows overriding the default executor image with a custom image. E.g. 'pulumi/pulumi-nodejs:latest'
        """
        pulumi.set(__self__, "executor_image", executor_image)

    @property
    @pulumi.getter(name="executorImage")
    def executor_image(self) -> pulumi.Input[str]:
        """
        Allows overriding the default executor image with a custom image. E.g. 'pulumi/pulumi-nodejs:latest'
        """
        return pulumi.get(self, "executor_image")

    @executor_image.setter
    def executor_image(self, value: pulumi.Input[str]):
        pulumi.set(self, "executor_image", value)


@pulumi.input_type
class DeploymentSettingsGitAuthBasicAuthArgs:
    def __init__(__self__, *,
                 password: pulumi.Input[str],
                 username: pulumi.Input[str]):
        """
        Git source settings for a deployment.
        :param pulumi.Input[str] password: Password for git basic authentication.
        :param pulumi.Input[str] username: User name for git basic authentication.
        """
        pulumi.set(__self__, "password", password)
        pulumi.set(__self__, "username", username)

    @property
    @pulumi.getter
    def password(self) -> pulumi.Input[str]:
        """
        Password for git basic authentication.
        """
        return pulumi.get(self, "password")

    @password.setter
    def password(self, value: pulumi.Input[str]):
        pulumi.set(self, "password", value)

    @property
    @pulumi.getter
    def username(self) -> pulumi.Input[str]:
        """
        User name for git basic authentication.
        """
        return pulumi.get(self, "username")

    @username.setter
    def username(self, value: pulumi.Input[str]):
        pulumi.set(self, "username", value)


@pulumi.input_type
class DeploymentSettingsGitAuthSSHAuthArgs:
    def __init__(__self__, *,
                 ssh_private_key: pulumi.Input[str],
                 password: Optional[pulumi.Input[str]] = None):
        """
        Git source settings for a deployment.
        :param pulumi.Input[str] ssh_private_key: SSH private key.
        :param pulumi.Input[str] password: Optional password for SSH authentication.
        """
        pulumi.set(__self__, "ssh_private_key", ssh_private_key)
        if password is not None:
            pulumi.set(__self__, "password", password)

    @property
    @pulumi.getter(name="sshPrivateKey")
    def ssh_private_key(self) -> pulumi.Input[str]:
        """
        SSH private key.
        """
        return pulumi.get(self, "ssh_private_key")

    @ssh_private_key.setter
    def ssh_private_key(self, value: pulumi.Input[str]):
        pulumi.set(self, "ssh_private_key", value)

    @property
    @pulumi.getter
    def password(self) -> Optional[pulumi.Input[str]]:
        """
        Optional password for SSH authentication.
        """
        return pulumi.get(self, "password")

    @password.setter
    def password(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "password", value)


@pulumi.input_type
class DeploymentSettingsGitSourceGitAuthArgs:
    def __init__(__self__, *,
                 basic_auth: Optional[pulumi.Input['DeploymentSettingsGitAuthBasicAuthArgs']] = None,
                 ssh_auth: Optional[pulumi.Input['DeploymentSettingsGitAuthSSHAuthArgs']] = None):
        """
        Git source settings for a deployment.
        :param pulumi.Input['DeploymentSettingsGitAuthBasicAuthArgs'] basic_auth: Basic auth for git authentication. Only one of `personalAccessToken`, `sshAuth`, or `basicAuth` must be defined.
        :param pulumi.Input['DeploymentSettingsGitAuthSSHAuthArgs'] ssh_auth: SSH auth for git authentication. Only one of `personalAccessToken`, `sshAuth`, or `basicAuth` must be defined.
        """
        if basic_auth is not None:
            pulumi.set(__self__, "basic_auth", basic_auth)
        if ssh_auth is not None:
            pulumi.set(__self__, "ssh_auth", ssh_auth)

    @property
    @pulumi.getter(name="basicAuth")
    def basic_auth(self) -> Optional[pulumi.Input['DeploymentSettingsGitAuthBasicAuthArgs']]:
        """
        Basic auth for git authentication. Only one of `personalAccessToken`, `sshAuth`, or `basicAuth` must be defined.
        """
        return pulumi.get(self, "basic_auth")

    @basic_auth.setter
    def basic_auth(self, value: Optional[pulumi.Input['DeploymentSettingsGitAuthBasicAuthArgs']]):
        pulumi.set(self, "basic_auth", value)

    @property
    @pulumi.getter(name="sshAuth")
    def ssh_auth(self) -> Optional[pulumi.Input['DeploymentSettingsGitAuthSSHAuthArgs']]:
        """
        SSH auth for git authentication. Only one of `personalAccessToken`, `sshAuth`, or `basicAuth` must be defined.
        """
        return pulumi.get(self, "ssh_auth")

    @ssh_auth.setter
    def ssh_auth(self, value: Optional[pulumi.Input['DeploymentSettingsGitAuthSSHAuthArgs']]):
        pulumi.set(self, "ssh_auth", value)


@pulumi.input_type
class DeploymentSettingsGitSourceArgs:
    def __init__(__self__, *,
                 branch: Optional[pulumi.Input[str]] = None,
                 commit: Optional[pulumi.Input[str]] = None,
                 git_auth: Optional[pulumi.Input['DeploymentSettingsGitSourceGitAuthArgs']] = None,
                 repo_dir: Optional[pulumi.Input[str]] = None,
                 repo_url: Optional[pulumi.Input[str]] = None):
        """
        Git source settings for a deployment.
        :param pulumi.Input[str] branch: The branch to deploy. One of either `branch` or `commit` must be specified.
        :param pulumi.Input[str] commit: The commit to deploy. One of either `branch` or `commit` must be specified.
        :param pulumi.Input['DeploymentSettingsGitSourceGitAuthArgs'] git_auth: Git authentication configuration for this deployment. Should not be specified if there are `gitHub` settings for this deployment.
        :param pulumi.Input[str] repo_dir: The directory within the repository where the Pulumi.yaml is located.
        :param pulumi.Input[str] repo_url: The repository URL to use for git settings. Should not be specified if there are `gitHub` settings for this deployment.
        """
        if branch is not None:
            pulumi.set(__self__, "branch", branch)
        if commit is not None:
            pulumi.set(__self__, "commit", commit)
        if git_auth is not None:
            pulumi.set(__self__, "git_auth", git_auth)
        if repo_dir is not None:
            pulumi.set(__self__, "repo_dir", repo_dir)
        if repo_url is not None:
            pulumi.set(__self__, "repo_url", repo_url)

    @property
    @pulumi.getter
    def branch(self) -> Optional[pulumi.Input[str]]:
        """
        The branch to deploy. One of either `branch` or `commit` must be specified.
        """
        return pulumi.get(self, "branch")

    @branch.setter
    def branch(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "branch", value)

    @property
    @pulumi.getter
    def commit(self) -> Optional[pulumi.Input[str]]:
        """
        The commit to deploy. One of either `branch` or `commit` must be specified.
        """
        return pulumi.get(self, "commit")

    @commit.setter
    def commit(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "commit", value)

    @property
    @pulumi.getter(name="gitAuth")
    def git_auth(self) -> Optional[pulumi.Input['DeploymentSettingsGitSourceGitAuthArgs']]:
        """
        Git authentication configuration for this deployment. Should not be specified if there are `gitHub` settings for this deployment.
        """
        return pulumi.get(self, "git_auth")

    @git_auth.setter
    def git_auth(self, value: Optional[pulumi.Input['DeploymentSettingsGitSourceGitAuthArgs']]):
        pulumi.set(self, "git_auth", value)

    @property
    @pulumi.getter(name="repoDir")
    def repo_dir(self) -> Optional[pulumi.Input[str]]:
        """
        The directory within the repository where the Pulumi.yaml is located.
        """
        return pulumi.get(self, "repo_dir")

    @repo_dir.setter
    def repo_dir(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "repo_dir", value)

    @property
    @pulumi.getter(name="repoUrl")
    def repo_url(self) -> Optional[pulumi.Input[str]]:
        """
        The repository URL to use for git settings. Should not be specified if there are `gitHub` settings for this deployment.
        """
        return pulumi.get(self, "repo_url")

    @repo_url.setter
    def repo_url(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "repo_url", value)


@pulumi.input_type
class DeploymentSettingsGithubArgs:
    def __init__(__self__, *,
                 deploy_commits: Optional[pulumi.Input[bool]] = None,
                 paths: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 preview_pull_requests: Optional[pulumi.Input[bool]] = None,
                 pull_request_template: Optional[pulumi.Input[bool]] = None,
                 repository: Optional[pulumi.Input[str]] = None):
        """
        GitHub settings for the deployment.
        :param pulumi.Input[bool] deploy_commits: Trigger a deployment running `pulumi up` on commit.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] paths: The paths within the repo that deployments should be filtered to.
        :param pulumi.Input[bool] preview_pull_requests: Trigger a deployment running `pulumi preview` when a PR is opened.
        :param pulumi.Input[bool] pull_request_template: Use this stack as a template for pull request review stacks.
        :param pulumi.Input[str] repository: The GitHub repository in the format org/repo.
        """
        if deploy_commits is None:
            deploy_commits = True
        if deploy_commits is not None:
            pulumi.set(__self__, "deploy_commits", deploy_commits)
        if paths is not None:
            pulumi.set(__self__, "paths", paths)
        if preview_pull_requests is None:
            preview_pull_requests = True
        if preview_pull_requests is not None:
            pulumi.set(__self__, "preview_pull_requests", preview_pull_requests)
        if pull_request_template is None:
            pull_request_template = False
        if pull_request_template is not None:
            pulumi.set(__self__, "pull_request_template", pull_request_template)
        if repository is not None:
            pulumi.set(__self__, "repository", repository)

    @property
    @pulumi.getter(name="deployCommits")
    def deploy_commits(self) -> Optional[pulumi.Input[bool]]:
        """
        Trigger a deployment running `pulumi up` on commit.
        """
        return pulumi.get(self, "deploy_commits")

    @deploy_commits.setter
    def deploy_commits(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "deploy_commits", value)

    @property
    @pulumi.getter
    def paths(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        The paths within the repo that deployments should be filtered to.
        """
        return pulumi.get(self, "paths")

    @paths.setter
    def paths(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "paths", value)

    @property
    @pulumi.getter(name="previewPullRequests")
    def preview_pull_requests(self) -> Optional[pulumi.Input[bool]]:
        """
        Trigger a deployment running `pulumi preview` when a PR is opened.
        """
        return pulumi.get(self, "preview_pull_requests")

    @preview_pull_requests.setter
    def preview_pull_requests(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "preview_pull_requests", value)

    @property
    @pulumi.getter(name="pullRequestTemplate")
    def pull_request_template(self) -> Optional[pulumi.Input[bool]]:
        """
        Use this stack as a template for pull request review stacks.
        """
        return pulumi.get(self, "pull_request_template")

    @pull_request_template.setter
    def pull_request_template(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "pull_request_template", value)

    @property
    @pulumi.getter
    def repository(self) -> Optional[pulumi.Input[str]]:
        """
        The GitHub repository in the format org/repo.
        """
        return pulumi.get(self, "repository")

    @repository.setter
    def repository(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "repository", value)


@pulumi.input_type
class DeploymentSettingsOperationContextArgs:
    def __init__(__self__, *,
                 environment_variables: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 oidc: Optional[pulumi.Input['OperationContextOIDCArgs']] = None,
                 options: Optional[pulumi.Input['OperationContextOptionsArgs']] = None,
                 pre_run_commands: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None):
        """
        Settings related to the Pulumi operation environment during the deployment.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] environment_variables: Environment variables to set for the deployment.
        :param pulumi.Input['OperationContextOIDCArgs'] oidc: OIDC configuration to use during the deployment.
        :param pulumi.Input['OperationContextOptionsArgs'] options: Options to override default behavior during the deployment.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] pre_run_commands: Shell commands to run before the Pulumi operation executes.
        """
        if environment_variables is not None:
            pulumi.set(__self__, "environment_variables", environment_variables)
        if oidc is not None:
            pulumi.set(__self__, "oidc", oidc)
        if options is not None:
            pulumi.set(__self__, "options", options)
        if pre_run_commands is not None:
            pulumi.set(__self__, "pre_run_commands", pre_run_commands)

    @property
    @pulumi.getter(name="environmentVariables")
    def environment_variables(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Environment variables to set for the deployment.
        """
        return pulumi.get(self, "environment_variables")

    @environment_variables.setter
    def environment_variables(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "environment_variables", value)

    @property
    @pulumi.getter
    def oidc(self) -> Optional[pulumi.Input['OperationContextOIDCArgs']]:
        """
        OIDC configuration to use during the deployment.
        """
        return pulumi.get(self, "oidc")

    @oidc.setter
    def oidc(self, value: Optional[pulumi.Input['OperationContextOIDCArgs']]):
        pulumi.set(self, "oidc", value)

    @property
    @pulumi.getter
    def options(self) -> Optional[pulumi.Input['OperationContextOptionsArgs']]:
        """
        Options to override default behavior during the deployment.
        """
        return pulumi.get(self, "options")

    @options.setter
    def options(self, value: Optional[pulumi.Input['OperationContextOptionsArgs']]):
        pulumi.set(self, "options", value)

    @property
    @pulumi.getter(name="preRunCommands")
    def pre_run_commands(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        Shell commands to run before the Pulumi operation executes.
        """
        return pulumi.get(self, "pre_run_commands")

    @pre_run_commands.setter
    def pre_run_commands(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "pre_run_commands", value)


@pulumi.input_type
class DeploymentSettingsSourceContextArgs:
    def __init__(__self__, *,
                 git: Optional[pulumi.Input['DeploymentSettingsGitSourceArgs']] = None):
        """
        Settings related to the source of the deployment.
        :param pulumi.Input['DeploymentSettingsGitSourceArgs'] git: Git source settings for a deployment.
        """
        if git is not None:
            pulumi.set(__self__, "git", git)

    @property
    @pulumi.getter
    def git(self) -> Optional[pulumi.Input['DeploymentSettingsGitSourceArgs']]:
        """
        Git source settings for a deployment.
        """
        return pulumi.get(self, "git")

    @git.setter
    def git(self, value: Optional[pulumi.Input['DeploymentSettingsGitSourceArgs']]):
        pulumi.set(self, "git", value)


@pulumi.input_type
class GCPOIDCConfigurationArgs:
    def __init__(__self__, *,
                 project_id: pulumi.Input[str],
                 provider_id: pulumi.Input[str],
                 service_account: pulumi.Input[str],
                 workload_pool_id: pulumi.Input[str],
                 region: Optional[pulumi.Input[str]] = None,
                 token_lifetime: Optional[pulumi.Input[str]] = None):
        """
        :param pulumi.Input[str] project_id: The numerical ID of the GCP project.
        :param pulumi.Input[str] provider_id: The ID of the identity provider associated with the workload pool.
        :param pulumi.Input[str] service_account: The email address of the service account to use.
        :param pulumi.Input[str] workload_pool_id: The ID of the workload pool to use.
        :param pulumi.Input[str] region: The region of the GCP project.
        :param pulumi.Input[str] token_lifetime: The lifetime of the temporary credentials in “XhYmZs” format.
        """
        pulumi.set(__self__, "project_id", project_id)
        pulumi.set(__self__, "provider_id", provider_id)
        pulumi.set(__self__, "service_account", service_account)
        pulumi.set(__self__, "workload_pool_id", workload_pool_id)
        if region is not None:
            pulumi.set(__self__, "region", region)
        if token_lifetime is not None:
            pulumi.set(__self__, "token_lifetime", token_lifetime)

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> pulumi.Input[str]:
        """
        The numerical ID of the GCP project.
        """
        return pulumi.get(self, "project_id")

    @project_id.setter
    def project_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "project_id", value)

    @property
    @pulumi.getter(name="providerId")
    def provider_id(self) -> pulumi.Input[str]:
        """
        The ID of the identity provider associated with the workload pool.
        """
        return pulumi.get(self, "provider_id")

    @provider_id.setter
    def provider_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "provider_id", value)

    @property
    @pulumi.getter(name="serviceAccount")
    def service_account(self) -> pulumi.Input[str]:
        """
        The email address of the service account to use.
        """
        return pulumi.get(self, "service_account")

    @service_account.setter
    def service_account(self, value: pulumi.Input[str]):
        pulumi.set(self, "service_account", value)

    @property
    @pulumi.getter(name="workloadPoolId")
    def workload_pool_id(self) -> pulumi.Input[str]:
        """
        The ID of the workload pool to use.
        """
        return pulumi.get(self, "workload_pool_id")

    @workload_pool_id.setter
    def workload_pool_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "workload_pool_id", value)

    @property
    @pulumi.getter
    def region(self) -> Optional[pulumi.Input[str]]:
        """
        The region of the GCP project.
        """
        return pulumi.get(self, "region")

    @region.setter
    def region(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "region", value)

    @property
    @pulumi.getter(name="tokenLifetime")
    def token_lifetime(self) -> Optional[pulumi.Input[str]]:
        """
        The lifetime of the temporary credentials in “XhYmZs” format.
        """
        return pulumi.get(self, "token_lifetime")

    @token_lifetime.setter
    def token_lifetime(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "token_lifetime", value)


@pulumi.input_type
class OperationContextOIDCArgs:
    def __init__(__self__, *,
                 aws: Optional[pulumi.Input['AWSOIDCConfigurationArgs']] = None,
                 azure: Optional[pulumi.Input['AzureOIDCConfigurationArgs']] = None,
                 gcp: Optional[pulumi.Input['GCPOIDCConfigurationArgs']] = None):
        """
        :param pulumi.Input['AWSOIDCConfigurationArgs'] aws: AWS-specific OIDC configuration.
        :param pulumi.Input['AzureOIDCConfigurationArgs'] azure: Azure-specific OIDC configuration.
        :param pulumi.Input['GCPOIDCConfigurationArgs'] gcp: GCP-specific OIDC configuration.
        """
        if aws is not None:
            pulumi.set(__self__, "aws", aws)
        if azure is not None:
            pulumi.set(__self__, "azure", azure)
        if gcp is not None:
            pulumi.set(__self__, "gcp", gcp)

    @property
    @pulumi.getter
    def aws(self) -> Optional[pulumi.Input['AWSOIDCConfigurationArgs']]:
        """
        AWS-specific OIDC configuration.
        """
        return pulumi.get(self, "aws")

    @aws.setter
    def aws(self, value: Optional[pulumi.Input['AWSOIDCConfigurationArgs']]):
        pulumi.set(self, "aws", value)

    @property
    @pulumi.getter
    def azure(self) -> Optional[pulumi.Input['AzureOIDCConfigurationArgs']]:
        """
        Azure-specific OIDC configuration.
        """
        return pulumi.get(self, "azure")

    @azure.setter
    def azure(self, value: Optional[pulumi.Input['AzureOIDCConfigurationArgs']]):
        pulumi.set(self, "azure", value)

    @property
    @pulumi.getter
    def gcp(self) -> Optional[pulumi.Input['GCPOIDCConfigurationArgs']]:
        """
        GCP-specific OIDC configuration.
        """
        return pulumi.get(self, "gcp")

    @gcp.setter
    def gcp(self, value: Optional[pulumi.Input['GCPOIDCConfigurationArgs']]):
        pulumi.set(self, "gcp", value)


@pulumi.input_type
class OperationContextOptionsArgs:
    def __init__(__self__, *,
                 delete_after_destroy: Optional[pulumi.Input[bool]] = None,
                 shell: Optional[pulumi.Input[str]] = None,
                 skip_install_dependencies: Optional[pulumi.Input[bool]] = None,
                 skip_intermediate_deployments: Optional[pulumi.Input[bool]] = None):
        """
        :param pulumi.Input[bool] delete_after_destroy: Whether the stack should be deleted after it is destroyed.
        :param pulumi.Input[str] shell: The shell to use to run commands during the deployment. Defaults to 'bash'.
        :param pulumi.Input[bool] skip_install_dependencies: Skip the default dependency installation step - use this to customize the dependency installation (e.g. if using yarn or poetry)
        :param pulumi.Input[bool] skip_intermediate_deployments: Skip intermediate deployments (Consolidate multiple deployments of the same type into one deployment)
        """
        if delete_after_destroy is not None:
            pulumi.set(__self__, "delete_after_destroy", delete_after_destroy)
        if shell is not None:
            pulumi.set(__self__, "shell", shell)
        if skip_install_dependencies is not None:
            pulumi.set(__self__, "skip_install_dependencies", skip_install_dependencies)
        if skip_intermediate_deployments is not None:
            pulumi.set(__self__, "skip_intermediate_deployments", skip_intermediate_deployments)

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

    @property
    @pulumi.getter
    def shell(self) -> Optional[pulumi.Input[str]]:
        """
        The shell to use to run commands during the deployment. Defaults to 'bash'.
        """
        return pulumi.get(self, "shell")

    @shell.setter
    def shell(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "shell", value)

    @property
    @pulumi.getter(name="skipInstallDependencies")
    def skip_install_dependencies(self) -> Optional[pulumi.Input[bool]]:
        """
        Skip the default dependency installation step - use this to customize the dependency installation (e.g. if using yarn or poetry)
        """
        return pulumi.get(self, "skip_install_dependencies")

    @skip_install_dependencies.setter
    def skip_install_dependencies(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "skip_install_dependencies", value)

    @property
    @pulumi.getter(name="skipIntermediateDeployments")
    def skip_intermediate_deployments(self) -> Optional[pulumi.Input[bool]]:
        """
        Skip intermediate deployments (Consolidate multiple deployments of the same type into one deployment)
        """
        return pulumi.get(self, "skip_intermediate_deployments")

    @skip_intermediate_deployments.setter
    def skip_intermediate_deployments(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "skip_intermediate_deployments", value)


@pulumi.input_type
class TemplateSourceDestinationArgs:
    def __init__(__self__, *,
                 url: Optional[pulumi.Input[str]] = None):
        """
        :param pulumi.Input[str] url: Destination URL that gets filled in on new project creation.
        """
        if url is not None:
            pulumi.set(__self__, "url", url)

    @property
    @pulumi.getter
    def url(self) -> Optional[pulumi.Input[str]]:
        """
        Destination URL that gets filled in on new project creation.
        """
        return pulumi.get(self, "url")

    @url.setter
    def url(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "url", value)


