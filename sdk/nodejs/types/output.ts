// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";

import * as utilities from "../utilities";

export interface AWSOIDCConfiguration {
    /**
     * Duration of the assume-role session in “XhYmZs” format
     */
    duration?: string;
    /**
     * Optional set of IAM policy ARNs that further restrict the assume-role session
     */
    policyARNs?: string[];
    /**
     * The ARN of the role to assume using the OIDC token.
     */
    roleARN: string;
    /**
     * The name of the assume-role session.
     */
    sessionName: string;
}

export interface AzureOIDCConfiguration {
    /**
     * The client ID of the federated workload identity.
     */
    clientId: string;
    /**
     * The subscription ID of the federated workload identity.
     */
    subscriptionId: string;
    /**
     * The tenant ID of the federated workload identity.
     */
    tenantId: string;
}

/**
 * The executor context defines information about the executor where the deployment is executed. If unspecified, the default 'pulumi/pulumi' image is used.
 */
export interface DeploymentSettingsExecutorContext {
    /**
     * Allows overriding the default executor image with a custom image. E.g. 'pulumi/pulumi-nodejs:latest'
     */
    executorImage: string;
}

/**
 * Git source settings for a deployment.
 */
export interface DeploymentSettingsGitAuthBasicAuth {
    /**
     * Password for git basic authentication.
     */
    password: string;
    /**
     * User name for git basic authentication.
     */
    username: string;
}

/**
 * Git source settings for a deployment.
 */
export interface DeploymentSettingsGitAuthSSHAuth {
    /**
     * Optional password for SSH authentication.
     */
    password?: string;
    /**
     * SSH private key.
     */
    sshPrivateKey: string;
}

/**
 * Git source settings for a deployment.
 */
export interface DeploymentSettingsGitSource {
    /**
     * The branch to deploy. One of either `branch` or `commit` must be specified.
     */
    branch?: string;
    /**
     * The commit to deploy. One of either `branch` or `commit` must be specified.
     */
    commit?: string;
    /**
     * Git authentication configuration for this deployment. Should not be specified if there are `gitHub` settings for this deployment.
     */
    gitAuth?: outputs.DeploymentSettingsGitSourceGitAuth;
    /**
     * The directory within the repository where the Pulumi.yaml is located.
     */
    repoDir?: string;
    /**
     * The repository URL to use for git settings. Should not be specified if there are `gitHub` settings for this deployment.
     */
    repoUrl?: string;
}

/**
 * Git source settings for a deployment.
 */
export interface DeploymentSettingsGitSourceGitAuth {
    /**
     * Basic auth for git authentication. Only one of `personalAccessToken`, `sshAuth`, or `basicAuth` must be defined.
     */
    basicAuth?: outputs.DeploymentSettingsGitAuthBasicAuth;
    /**
     * SSH auth for git authentication. Only one of `personalAccessToken`, `sshAuth`, or `basicAuth` must be defined.
     */
    sshAuth?: outputs.DeploymentSettingsGitAuthSSHAuth;
}

/**
 * GitHub settings for the deployment.
 */
export interface DeploymentSettingsGithub {
    /**
     * Trigger a deployment running `pulumi up` on commit.
     */
    deployCommits?: boolean;
    /**
     * The paths within the repo that deployments should be filtered to.
     */
    paths?: string[];
    /**
     * Trigger a deployment running `pulumi preview` when a PR is opened.
     */
    previewPullRequests?: boolean;
    /**
     * Use this stack as a template for pull request review stacks.
     */
    pullRequestTemplate?: boolean;
    /**
     * The GitHub repository in the format org/repo.
     */
    repository?: string;
}
/**
 * deploymentSettingsGithubProvideDefaults sets the appropriate defaults for DeploymentSettingsGithub
 */
export function deploymentSettingsGithubProvideDefaults(val: DeploymentSettingsGithub): DeploymentSettingsGithub {
    return {
        ...val,
        deployCommits: (val.deployCommits) ?? true,
        previewPullRequests: (val.previewPullRequests) ?? true,
        pullRequestTemplate: (val.pullRequestTemplate) ?? false,
    };
}

/**
 * Settings related to the Pulumi operation environment during the deployment.
 */
export interface DeploymentSettingsOperationContext {
    /**
     * Environment variables to set for the deployment.
     */
    environmentVariables?: {[key: string]: string};
    /**
     * OIDC configuration to use during the deployment.
     */
    oidc?: outputs.OperationContextOIDC;
    /**
     * Options to override default behavior during the deployment.
     */
    options?: outputs.OperationContextOptions;
    /**
     * Shell commands to run before the Pulumi operation executes.
     */
    preRunCommands?: string[];
}

/**
 * Settings related to the source of the deployment.
 */
export interface DeploymentSettingsSourceContext {
    /**
     * Git source settings for a deployment.
     */
    git?: outputs.DeploymentSettingsGitSource;
}

export interface GCPOIDCConfiguration {
    /**
     * The numerical ID of the GCP project.
     */
    projectId: string;
    /**
     * The ID of the identity provider associated with the workload pool.
     */
    providerId: string;
    /**
     * The region of the GCP project.
     */
    region?: string;
    /**
     * The email address of the service account to use.
     */
    serviceAccount: string;
    /**
     * The lifetime of the temporary credentials in “XhYmZs” format.
     */
    tokenLifetime?: string;
    /**
     * The ID of the workload pool to use.
     */
    workloadPoolId: string;
}

export interface OperationContextOIDC {
    /**
     * AWS-specific OIDC configuration.
     */
    aws?: outputs.AWSOIDCConfiguration;
    /**
     * Azure-specific OIDC configuration.
     */
    azure?: outputs.AzureOIDCConfiguration;
    /**
     * GCP-specific OIDC configuration.
     */
    gcp?: outputs.GCPOIDCConfiguration;
}

export interface OperationContextOptions {
    /**
     * Whether the stack should be deleted after it is destroyed.
     */
    deleteAfterDestroy?: boolean;
    /**
     * The shell to use to run commands during the deployment. Defaults to 'bash'.
     */
    shell?: string;
    /**
     * Skip the default dependency installation step - use this to customize the dependency installation (e.g. if using yarn or poetry)
     */
    skipInstallDependencies?: boolean;
    /**
     * Skip intermediate deployments (Consolidate multiple deployments of the same type into one deployment)
     */
    skipIntermediateDeployments?: boolean;
}

export interface TemplateSourceDestination {
    /**
     * Destination URL that gets filled in on new project creation.
     */
    url?: string;
}

