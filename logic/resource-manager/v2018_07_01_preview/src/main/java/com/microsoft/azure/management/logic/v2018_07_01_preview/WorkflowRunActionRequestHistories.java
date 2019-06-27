/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic.v2018_07_01_preview;

import rx.Observable;
import com.microsoft.azure.management.logic.v2018_07_01_preview.implementation.WorkflowRunActionRequestHistoriesInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing WorkflowRunActionRequestHistories.
 */
public interface WorkflowRunActionRequestHistories extends HasInner<WorkflowRunActionRequestHistoriesInner> {
    /**
     * Gets a workflow run request history.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param runName The workflow run name.
     * @param actionName The workflow action name.
     * @param requestHistoryName The request history name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ActionRunWorkflowRequestHistory> getAsync(String resourceGroupName, String workflowName, String runName, String actionName, String requestHistoryName);

    /**
     * List a workflow run request history.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param runName The workflow run name.
     * @param actionName The workflow action name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ActionRunWorkflowRequestHistory> listAsync(final String resourceGroupName, final String workflowName, final String runName, final String actionName);

}
