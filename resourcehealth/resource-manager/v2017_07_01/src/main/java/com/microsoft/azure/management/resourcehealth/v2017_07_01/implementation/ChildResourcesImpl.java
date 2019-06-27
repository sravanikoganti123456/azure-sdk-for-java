/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.resourcehealth.v2017_07_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.resourcehealth.v2017_07_01.ChildResources;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.resourcehealth.v2017_07_01.AvailabilityStatus;

class ChildResourcesImpl extends WrapperImpl<ChildResourcesInner> implements ChildResources {
    private final ResourceHealthManager manager;

    ChildResourcesImpl(ResourceHealthManager manager) {
        super(manager.inner().childResources());
        this.manager = manager;
    }

    public ResourceHealthManager manager() {
        return this.manager;
    }

    @Override
    public Observable<AvailabilityStatus> listAsync(final String resourceUri) {
        ChildResourcesInner client = this.inner();
        return client.listAsync(resourceUri)
        .flatMapIterable(new Func1<Page<AvailabilityStatusInner>, Iterable<AvailabilityStatusInner>>() {
            @Override
            public Iterable<AvailabilityStatusInner> call(Page<AvailabilityStatusInner> page) {
                return page.items();
            }
        })
        .map(new Func1<AvailabilityStatusInner, AvailabilityStatus>() {
            @Override
            public AvailabilityStatus call(AvailabilityStatusInner inner) {
                return new AvailabilityStatusImpl(inner, manager());
            }
        });
    }

}
