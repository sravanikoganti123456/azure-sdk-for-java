/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.costmanagement.v2018_05_31;

import rx.Observable;

/**
 * Type representing BillingAccountDimensions.
 */
public interface BillingAccountDimensions {
    /**
     * Lists the dimensions by billingAccount Id.
     *
     * @param billingAccountId BillingAccount ID
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Dimension> listAsync(String billingAccountId);

}
