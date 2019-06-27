/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storageimportexport.v2016_11_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Contains information about the package being shipped by the customer to the
 * Microsoft data center.
 */
public class PackageInfomation {
    /**
     * The name of the carrier that is used to ship the import or export
     * drives.
     */
    @JsonProperty(value = "carrierName", required = true)
    private String carrierName;

    /**
     * The tracking number of the package.
     */
    @JsonProperty(value = "trackingNumber", required = true)
    private String trackingNumber;

    /**
     * The number of drives included in the package.
     */
    @JsonProperty(value = "driveCount", required = true)
    private int driveCount;

    /**
     * The date when the package is shipped.
     */
    @JsonProperty(value = "shipDate", required = true)
    private String shipDate;

    /**
     * Get the name of the carrier that is used to ship the import or export drives.
     *
     * @return the carrierName value
     */
    public String carrierName() {
        return this.carrierName;
    }

    /**
     * Set the name of the carrier that is used to ship the import or export drives.
     *
     * @param carrierName the carrierName value to set
     * @return the PackageInfomation object itself.
     */
    public PackageInfomation withCarrierName(String carrierName) {
        this.carrierName = carrierName;
        return this;
    }

    /**
     * Get the tracking number of the package.
     *
     * @return the trackingNumber value
     */
    public String trackingNumber() {
        return this.trackingNumber;
    }

    /**
     * Set the tracking number of the package.
     *
     * @param trackingNumber the trackingNumber value to set
     * @return the PackageInfomation object itself.
     */
    public PackageInfomation withTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
        return this;
    }

    /**
     * Get the number of drives included in the package.
     *
     * @return the driveCount value
     */
    public int driveCount() {
        return this.driveCount;
    }

    /**
     * Set the number of drives included in the package.
     *
     * @param driveCount the driveCount value to set
     * @return the PackageInfomation object itself.
     */
    public PackageInfomation withDriveCount(int driveCount) {
        this.driveCount = driveCount;
        return this;
    }

    /**
     * Get the date when the package is shipped.
     *
     * @return the shipDate value
     */
    public String shipDate() {
        return this.shipDate;
    }

    /**
     * Set the date when the package is shipped.
     *
     * @param shipDate the shipDate value to set
     * @return the PackageInfomation object itself.
     */
    public PackageInfomation withShipDate(String shipDate) {
        this.shipDate = shipDate;
        return this;
    }

}
