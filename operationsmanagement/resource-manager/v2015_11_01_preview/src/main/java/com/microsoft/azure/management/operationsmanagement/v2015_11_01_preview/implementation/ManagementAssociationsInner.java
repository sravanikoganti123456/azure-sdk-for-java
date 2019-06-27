/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.operationsmanagement.v2015_11_01_preview.implementation;

import com.microsoft.azure.arm.collection.InnerSupportsDelete;
import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.management.operationsmanagement.v2015_11_01_preview.CodeMessageErrorException;
import com.microsoft.azure.Page;
import com.microsoft.azure.PagedList;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.Validator;
import java.io.IOException;
import java.util.List;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.HTTP;
import retrofit2.http.Path;
import retrofit2.http.PUT;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in ManagementAssociations.
 */
public class ManagementAssociationsInner implements InnerSupportsDelete<Void> {
    /** The Retrofit service to perform REST calls. */
    private ManagementAssociationsService service;
    /** The service client containing this operation class. */
    private OperationsManagementClientImpl client;

    /**
     * Initializes an instance of ManagementAssociationsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public ManagementAssociationsInner(Retrofit retrofit, OperationsManagementClientImpl client) {
        this.service = retrofit.create(ManagementAssociationsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for ManagementAssociations to be
     * used by Retrofit to perform actually REST calls.
     */
    interface ManagementAssociationsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.operationsmanagement.v2015_11_01_preview.ManagementAssociations list" })
        @GET("subscriptions/{subscriptionId}/providers/Microsoft.OperationsManagement/ManagementAssociations")
        Observable<Response<ResponseBody>> list(@Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.operationsmanagement.v2015_11_01_preview.ManagementAssociations createOrUpdate" })
        @PUT("subscriptions/{subscriptionId}/resourcegroups/{resourceGroupName}/providers/{providerName}/{resourceType}/{resourceName}/providers/Microsoft.OperationsManagement/ManagementAssociations/{managementAssociationName}")
        Observable<Response<ResponseBody>> createOrUpdate(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("providerName") String providerName, @Path("resourceType") String resourceType, @Path("resourceName") String resourceName, @Path("managementAssociationName") String managementAssociationName, @Query("api-version") String apiVersion, @Body ManagementAssociationInner parameters, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.operationsmanagement.v2015_11_01_preview.ManagementAssociations delete" })
        @HTTP(path = "subscriptions/{subscriptionId}/resourcegroups/{resourceGroupName}/providers/{providerName}/{resourceType}/{resourceName}/providers/Microsoft.OperationsManagement/ManagementAssociations/{managementAssociationName}", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> delete(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("providerName") String providerName, @Path("resourceType") String resourceType, @Path("resourceName") String resourceName, @Path("managementAssociationName") String managementAssociationName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.operationsmanagement.v2015_11_01_preview.ManagementAssociations get" })
        @GET("subscriptions/{subscriptionId}/resourcegroups/{resourceGroupName}/providers/{providerName}/{resourceType}/{resourceName}/providers/Microsoft.OperationsManagement/ManagementAssociations/{managementAssociationName}")
        Observable<Response<ResponseBody>> get(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("providerName") String providerName, @Path("resourceType") String resourceType, @Path("resourceName") String resourceName, @Path("managementAssociationName") String managementAssociationName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Retrieves the ManagementAssociations list for the subscription.
     * Retrieves the ManagementAssociations list.
     *
     * @return the PagedList<ManagementAssociationInner> object if successful.
     */
    public PagedList<ManagementAssociationInner> list() {
        PageImpl<ManagementAssociationInner> page = new PageImpl<>();
        page.setItems(listWithServiceResponseAsync().toBlocking().single().body());
        page.setNextPageLink(null);
        return new PagedList<ManagementAssociationInner>(page) {
            @Override
            public Page<ManagementAssociationInner> nextPage(String nextPageLink) {
                return null;
            }
        };
    }

    /**
     * Retrieves the ManagementAssociations list for the subscription.
     * Retrieves the ManagementAssociations list.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<ManagementAssociationInner>> listAsync(final ServiceCallback<List<ManagementAssociationInner>> serviceCallback) {
        return ServiceFuture.fromResponse(listWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Retrieves the ManagementAssociations list for the subscription.
     * Retrieves the ManagementAssociations list.
     *
     * @return the observable to the List&lt;ManagementAssociationInner&gt; object
     */
    public Observable<Page<ManagementAssociationInner>> listAsync() {
        return listWithServiceResponseAsync().map(new Func1<ServiceResponse<List<ManagementAssociationInner>>, Page<ManagementAssociationInner>>() {
            @Override
            public Page<ManagementAssociationInner> call(ServiceResponse<List<ManagementAssociationInner>> response) {
                PageImpl<ManagementAssociationInner> page = new PageImpl<>();
                page.setItems(response.body());
                return page;
            }
        });
    }

    /**
     * Retrieves the ManagementAssociations list for the subscription.
     * Retrieves the ManagementAssociations list.
     *
     * @return the observable to the List&lt;ManagementAssociationInner&gt; object
     */
    public Observable<ServiceResponse<List<ManagementAssociationInner>>> listWithServiceResponseAsync() {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.list(this.client.subscriptionId(), this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<List<ManagementAssociationInner>>>>() {
                @Override
                public Observable<ServiceResponse<List<ManagementAssociationInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<ManagementAssociationInner>> result = listDelegate(response);
                        List<ManagementAssociationInner> items = null;
                        if (result.body() != null) {
                            items = result.body().items();
                        }
                        ServiceResponse<List<ManagementAssociationInner>> clientResponse = new ServiceResponse<List<ManagementAssociationInner>>(items, result.response());
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<ManagementAssociationInner>> listDelegate(Response<ResponseBody> response) throws CodeMessageErrorException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<ManagementAssociationInner>, CodeMessageErrorException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<ManagementAssociationInner>>() { }.getType())
                .registerError(CodeMessageErrorException.class)
                .build(response);
    }

    /**
     * Create/Update ManagementAssociation.
     * Creates or updates the ManagementAssociation.
     *
     * @param resourceGroupName The name of the resource group to get. The name is case insensitive.
     * @param managementAssociationName User ManagementAssociation Name.
     * @param parameters The parameters required to create ManagementAssociation extension.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CodeMessageErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ManagementAssociationInner object if successful.
     */
    public ManagementAssociationInner createOrUpdate(String resourceGroupName, String managementAssociationName, ManagementAssociationInner parameters) {
        return createOrUpdateWithServiceResponseAsync(resourceGroupName, managementAssociationName, parameters).toBlocking().single().body();
    }

    /**
     * Create/Update ManagementAssociation.
     * Creates or updates the ManagementAssociation.
     *
     * @param resourceGroupName The name of the resource group to get. The name is case insensitive.
     * @param managementAssociationName User ManagementAssociation Name.
     * @param parameters The parameters required to create ManagementAssociation extension.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ManagementAssociationInner> createOrUpdateAsync(String resourceGroupName, String managementAssociationName, ManagementAssociationInner parameters, final ServiceCallback<ManagementAssociationInner> serviceCallback) {
        return ServiceFuture.fromResponse(createOrUpdateWithServiceResponseAsync(resourceGroupName, managementAssociationName, parameters), serviceCallback);
    }

    /**
     * Create/Update ManagementAssociation.
     * Creates or updates the ManagementAssociation.
     *
     * @param resourceGroupName The name of the resource group to get. The name is case insensitive.
     * @param managementAssociationName User ManagementAssociation Name.
     * @param parameters The parameters required to create ManagementAssociation extension.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ManagementAssociationInner object
     */
    public Observable<ManagementAssociationInner> createOrUpdateAsync(String resourceGroupName, String managementAssociationName, ManagementAssociationInner parameters) {
        return createOrUpdateWithServiceResponseAsync(resourceGroupName, managementAssociationName, parameters).map(new Func1<ServiceResponse<ManagementAssociationInner>, ManagementAssociationInner>() {
            @Override
            public ManagementAssociationInner call(ServiceResponse<ManagementAssociationInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Create/Update ManagementAssociation.
     * Creates or updates the ManagementAssociation.
     *
     * @param resourceGroupName The name of the resource group to get. The name is case insensitive.
     * @param managementAssociationName User ManagementAssociation Name.
     * @param parameters The parameters required to create ManagementAssociation extension.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ManagementAssociationInner object
     */
    public Observable<ServiceResponse<ManagementAssociationInner>> createOrUpdateWithServiceResponseAsync(String resourceGroupName, String managementAssociationName, ManagementAssociationInner parameters) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (this.client.providerName() == null) {
            throw new IllegalArgumentException("Parameter this.client.providerName() is required and cannot be null.");
        }
        if (this.client.resourceType() == null) {
            throw new IllegalArgumentException("Parameter this.client.resourceType() is required and cannot be null.");
        }
        if (this.client.resourceName() == null) {
            throw new IllegalArgumentException("Parameter this.client.resourceName() is required and cannot be null.");
        }
        if (managementAssociationName == null) {
            throw new IllegalArgumentException("Parameter managementAssociationName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        if (parameters == null) {
            throw new IllegalArgumentException("Parameter parameters is required and cannot be null.");
        }
        Validator.validate(parameters);
        return service.createOrUpdate(this.client.subscriptionId(), resourceGroupName, this.client.providerName(), this.client.resourceType(), this.client.resourceName(), managementAssociationName, this.client.apiVersion(), parameters, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ManagementAssociationInner>>>() {
                @Override
                public Observable<ServiceResponse<ManagementAssociationInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ManagementAssociationInner> clientResponse = createOrUpdateDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ManagementAssociationInner> createOrUpdateDelegate(Response<ResponseBody> response) throws CodeMessageErrorException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<ManagementAssociationInner, CodeMessageErrorException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<ManagementAssociationInner>() { }.getType())
                .registerError(CodeMessageErrorException.class)
                .build(response);
    }

    /**
     * Deletes the ManagementAssociation.
     * Deletes the ManagementAssociation in the subscription.
     *
     * @param resourceGroupName The name of the resource group to get. The name is case insensitive.
     * @param managementAssociationName User ManagementAssociation Name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CodeMessageErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void delete(String resourceGroupName, String managementAssociationName) {
        deleteWithServiceResponseAsync(resourceGroupName, managementAssociationName).toBlocking().single().body();
    }

    /**
     * Deletes the ManagementAssociation.
     * Deletes the ManagementAssociation in the subscription.
     *
     * @param resourceGroupName The name of the resource group to get. The name is case insensitive.
     * @param managementAssociationName User ManagementAssociation Name.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> deleteAsync(String resourceGroupName, String managementAssociationName, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(deleteWithServiceResponseAsync(resourceGroupName, managementAssociationName), serviceCallback);
    }

    /**
     * Deletes the ManagementAssociation.
     * Deletes the ManagementAssociation in the subscription.
     *
     * @param resourceGroupName The name of the resource group to get. The name is case insensitive.
     * @param managementAssociationName User ManagementAssociation Name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> deleteAsync(String resourceGroupName, String managementAssociationName) {
        return deleteWithServiceResponseAsync(resourceGroupName, managementAssociationName).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Deletes the ManagementAssociation.
     * Deletes the ManagementAssociation in the subscription.
     *
     * @param resourceGroupName The name of the resource group to get. The name is case insensitive.
     * @param managementAssociationName User ManagementAssociation Name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> deleteWithServiceResponseAsync(String resourceGroupName, String managementAssociationName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (this.client.providerName() == null) {
            throw new IllegalArgumentException("Parameter this.client.providerName() is required and cannot be null.");
        }
        if (this.client.resourceType() == null) {
            throw new IllegalArgumentException("Parameter this.client.resourceType() is required and cannot be null.");
        }
        if (this.client.resourceName() == null) {
            throw new IllegalArgumentException("Parameter this.client.resourceName() is required and cannot be null.");
        }
        if (managementAssociationName == null) {
            throw new IllegalArgumentException("Parameter managementAssociationName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.delete(this.client.subscriptionId(), resourceGroupName, this.client.providerName(), this.client.resourceType(), this.client.resourceName(), managementAssociationName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = deleteDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> deleteDelegate(Response<ResponseBody> response) throws CodeMessageErrorException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Void, CodeMessageErrorException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(CodeMessageErrorException.class)
                .build(response);
    }

    /**
     * Retrieve ManagementAssociation.
     * Retrieves the user ManagementAssociation.
     *
     * @param resourceGroupName The name of the resource group to get. The name is case insensitive.
     * @param managementAssociationName User ManagementAssociation Name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CodeMessageErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ManagementAssociationInner object if successful.
     */
    public ManagementAssociationInner get(String resourceGroupName, String managementAssociationName) {
        return getWithServiceResponseAsync(resourceGroupName, managementAssociationName).toBlocking().single().body();
    }

    /**
     * Retrieve ManagementAssociation.
     * Retrieves the user ManagementAssociation.
     *
     * @param resourceGroupName The name of the resource group to get. The name is case insensitive.
     * @param managementAssociationName User ManagementAssociation Name.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ManagementAssociationInner> getAsync(String resourceGroupName, String managementAssociationName, final ServiceCallback<ManagementAssociationInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(resourceGroupName, managementAssociationName), serviceCallback);
    }

    /**
     * Retrieve ManagementAssociation.
     * Retrieves the user ManagementAssociation.
     *
     * @param resourceGroupName The name of the resource group to get. The name is case insensitive.
     * @param managementAssociationName User ManagementAssociation Name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ManagementAssociationInner object
     */
    public Observable<ManagementAssociationInner> getAsync(String resourceGroupName, String managementAssociationName) {
        return getWithServiceResponseAsync(resourceGroupName, managementAssociationName).map(new Func1<ServiceResponse<ManagementAssociationInner>, ManagementAssociationInner>() {
            @Override
            public ManagementAssociationInner call(ServiceResponse<ManagementAssociationInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Retrieve ManagementAssociation.
     * Retrieves the user ManagementAssociation.
     *
     * @param resourceGroupName The name of the resource group to get. The name is case insensitive.
     * @param managementAssociationName User ManagementAssociation Name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ManagementAssociationInner object
     */
    public Observable<ServiceResponse<ManagementAssociationInner>> getWithServiceResponseAsync(String resourceGroupName, String managementAssociationName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (this.client.providerName() == null) {
            throw new IllegalArgumentException("Parameter this.client.providerName() is required and cannot be null.");
        }
        if (this.client.resourceType() == null) {
            throw new IllegalArgumentException("Parameter this.client.resourceType() is required and cannot be null.");
        }
        if (this.client.resourceName() == null) {
            throw new IllegalArgumentException("Parameter this.client.resourceName() is required and cannot be null.");
        }
        if (managementAssociationName == null) {
            throw new IllegalArgumentException("Parameter managementAssociationName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.get(this.client.subscriptionId(), resourceGroupName, this.client.providerName(), this.client.resourceType(), this.client.resourceName(), managementAssociationName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ManagementAssociationInner>>>() {
                @Override
                public Observable<ServiceResponse<ManagementAssociationInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ManagementAssociationInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ManagementAssociationInner> getDelegate(Response<ResponseBody> response) throws CodeMessageErrorException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<ManagementAssociationInner, CodeMessageErrorException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<ManagementAssociationInner>() { }.getType())
                .registerError(CodeMessageErrorException.class)
                .build(response);
    }

}
