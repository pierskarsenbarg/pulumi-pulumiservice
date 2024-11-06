// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as enums from "./types/enums";
import * as utilities from "./utilities";

/**
 * Deployment settings configure Pulumi Deployments for a stack.
 *
 * ### Import
 *
 * Deployment settings can be imported using the `id`, which for deployment settings is `{org}/{project}/{stack}` e.g.,
 *
 * ```sh
 *  $ pulumi import pulumiservice:index:DeploymentSettings my_settings my-org/my-project/my-stack
 * ```
 */
export class DeploymentSettings extends pulumi.CustomResource {
    /**
     * Get an existing DeploymentSettings resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, opts?: pulumi.CustomResourceOptions): DeploymentSettings {
        return new DeploymentSettings(name, undefined as any, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'pulumiservice:index:DeploymentSettings';

    /**
     * Returns true if the given object is an instance of DeploymentSettings.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is DeploymentSettings {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === DeploymentSettings.__pulumiType;
    }

    /**
     * The agent pool identifier to use for the deployment.
     */
    public readonly agentPoolId!: pulumi.Output<string | undefined>;
    /**
     * Dependency cache settings for the deployment
     */
    public readonly cacheOptions!: pulumi.Output<outputs.DeploymentSettingsCacheOptions | undefined>;
    /**
     * Settings related to the deployment executor.
     */
    public readonly executorContext!: pulumi.Output<outputs.DeploymentSettingsExecutorContext | undefined>;
    /**
     * GitHub settings for the deployment.
     */
    public readonly github!: pulumi.Output<outputs.DeploymentSettingsGithub | undefined>;
    /**
     * Settings related to the Pulumi operation environment during the deployment.
     */
    public readonly operationContext!: pulumi.Output<outputs.DeploymentSettingsOperationContext | undefined>;
    /**
     * Organization name.
     */
    public readonly organization!: pulumi.Output<string>;
    /**
     * Project name.
     */
    public readonly project!: pulumi.Output<string>;
    /**
     * Settings related to the source of the deployment.
     */
    public readonly sourceContext!: pulumi.Output<outputs.DeploymentSettingsSourceContext | undefined>;
    /**
     * Stack name.
     */
    public readonly stack!: pulumi.Output<string>;

    /**
     * Create a DeploymentSettings resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: DeploymentSettingsArgs, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (!opts.id) {
            if ((!args || args.organization === undefined) && !opts.urn) {
                throw new Error("Missing required property 'organization'");
            }
            if ((!args || args.project === undefined) && !opts.urn) {
                throw new Error("Missing required property 'project'");
            }
            if ((!args || args.stack === undefined) && !opts.urn) {
                throw new Error("Missing required property 'stack'");
            }
            resourceInputs["agentPoolId"] = args ? args.agentPoolId : undefined;
            resourceInputs["cacheOptions"] = args ? (args.cacheOptions ? pulumi.output(args.cacheOptions).apply(inputs.deploymentSettingsCacheOptionsArgsProvideDefaults) : undefined) : undefined;
            resourceInputs["executorContext"] = args ? args.executorContext : undefined;
            resourceInputs["github"] = args ? (args.github ? pulumi.output(args.github).apply(inputs.deploymentSettingsGithubArgsProvideDefaults) : undefined) : undefined;
            resourceInputs["operationContext"] = args ? args.operationContext : undefined;
            resourceInputs["organization"] = args ? args.organization : undefined;
            resourceInputs["project"] = args ? args.project : undefined;
            resourceInputs["sourceContext"] = args ? args.sourceContext : undefined;
            resourceInputs["stack"] = args ? args.stack : undefined;
        } else {
            resourceInputs["agentPoolId"] = undefined /*out*/;
            resourceInputs["cacheOptions"] = undefined /*out*/;
            resourceInputs["executorContext"] = undefined /*out*/;
            resourceInputs["github"] = undefined /*out*/;
            resourceInputs["operationContext"] = undefined /*out*/;
            resourceInputs["organization"] = undefined /*out*/;
            resourceInputs["project"] = undefined /*out*/;
            resourceInputs["sourceContext"] = undefined /*out*/;
            resourceInputs["stack"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(DeploymentSettings.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * The set of arguments for constructing a DeploymentSettings resource.
 */
export interface DeploymentSettingsArgs {
    /**
     * The agent pool identifier to use for the deployment.
     */
    agentPoolId?: pulumi.Input<string>;
    /**
     * Dependency cache settings for the deployment
     */
    cacheOptions?: pulumi.Input<inputs.DeploymentSettingsCacheOptionsArgs>;
    /**
     * Settings related to the deployment executor.
     */
    executorContext?: pulumi.Input<inputs.DeploymentSettingsExecutorContextArgs>;
    /**
     * GitHub settings for the deployment.
     */
    github?: pulumi.Input<inputs.DeploymentSettingsGithubArgs>;
    /**
     * Settings related to the Pulumi operation environment during the deployment.
     */
    operationContext?: pulumi.Input<inputs.DeploymentSettingsOperationContextArgs>;
    /**
     * Organization name.
     */
    organization: pulumi.Input<string>;
    /**
     * Project name.
     */
    project: pulumi.Input<string>;
    /**
     * Settings related to the source of the deployment.
     */
    sourceContext?: pulumi.Input<inputs.DeploymentSettingsSourceContextArgs>;
    /**
     * Stack name.
     */
    stack: pulumi.Input<string>;
}
