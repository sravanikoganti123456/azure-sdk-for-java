/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventhubs.v2018_01_01_preview.implementation;

import com.microsoft.azure.management.eventhubs.v2018_01_01_preview.ClusterQuotaConfigurationProperties;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import java.util.Map;

class ClusterQuotaConfigurationPropertiesImpl extends WrapperImpl<ClusterQuotaConfigurationPropertiesInner> implements ClusterQuotaConfigurationProperties {
    private final EventHubsManager manager;
    ClusterQuotaConfigurationPropertiesImpl(ClusterQuotaConfigurationPropertiesInner inner, EventHubsManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public EventHubsManager manager() {
        return this.manager;
    }

    @Override
    public Map<String, String> settings() {
        return this.inner().settings();
    }

}
