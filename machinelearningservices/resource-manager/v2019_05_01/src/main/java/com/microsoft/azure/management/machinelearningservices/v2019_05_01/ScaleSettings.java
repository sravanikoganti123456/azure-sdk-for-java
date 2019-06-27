/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.machinelearningservices.v2019_05_01;

import org.joda.time.Period;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * scale settings for AML Compute.
 */
public class ScaleSettings {
    /**
     * Max number of nodes to use.
     */
    @JsonProperty(value = "maxNodeCount", required = true)
    private int maxNodeCount;

    /**
     * Min number of nodes to use.
     */
    @JsonProperty(value = "minNodeCount")
    private Integer minNodeCount;

    /**
     * Node Idle Time before scaling down amlCompute.
     */
    @JsonProperty(value = "nodeIdleTimeBeforeScaleDown")
    private Period nodeIdleTimeBeforeScaleDown;

    /**
     * Get max number of nodes to use.
     *
     * @return the maxNodeCount value
     */
    public int maxNodeCount() {
        return this.maxNodeCount;
    }

    /**
     * Set max number of nodes to use.
     *
     * @param maxNodeCount the maxNodeCount value to set
     * @return the ScaleSettings object itself.
     */
    public ScaleSettings withMaxNodeCount(int maxNodeCount) {
        this.maxNodeCount = maxNodeCount;
        return this;
    }

    /**
     * Get min number of nodes to use.
     *
     * @return the minNodeCount value
     */
    public Integer minNodeCount() {
        return this.minNodeCount;
    }

    /**
     * Set min number of nodes to use.
     *
     * @param minNodeCount the minNodeCount value to set
     * @return the ScaleSettings object itself.
     */
    public ScaleSettings withMinNodeCount(Integer minNodeCount) {
        this.minNodeCount = minNodeCount;
        return this;
    }

    /**
     * Get node Idle Time before scaling down amlCompute.
     *
     * @return the nodeIdleTimeBeforeScaleDown value
     */
    public Period nodeIdleTimeBeforeScaleDown() {
        return this.nodeIdleTimeBeforeScaleDown;
    }

    /**
     * Set node Idle Time before scaling down amlCompute.
     *
     * @param nodeIdleTimeBeforeScaleDown the nodeIdleTimeBeforeScaleDown value to set
     * @return the ScaleSettings object itself.
     */
    public ScaleSettings withNodeIdleTimeBeforeScaleDown(Period nodeIdleTimeBeforeScaleDown) {
        this.nodeIdleTimeBeforeScaleDown = nodeIdleTimeBeforeScaleDown;
        return this;
    }

}
