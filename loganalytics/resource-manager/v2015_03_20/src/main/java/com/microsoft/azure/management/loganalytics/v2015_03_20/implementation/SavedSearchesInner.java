/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.loganalytics.v2015_03_20.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.CloudException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.Validator;
import java.io.IOException;
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
 * in SavedSearches.
 */
public class SavedSearchesInner {
    /** The Retrofit service to perform REST calls. */
    private SavedSearchesService service;
    /** The service client containing this operation class. */
    private OperationalInsightsManagementClientImpl client;

    /**
     * Initializes an instance of SavedSearchesInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public SavedSearchesInner(Retrofit retrofit, OperationalInsightsManagementClientImpl client) {
        this.service = retrofit.create(SavedSearchesService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for SavedSearches to be
     * used by Retrofit to perform actually REST calls.
     */
    interface SavedSearchesService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.loganalytics.v2015_03_20.SavedSearches delete" })
        @HTTP(path = "subscriptions/{subscriptionId}/resourcegroups/{resourceGroupName}/providers/Microsoft.OperationalInsights/workspaces/{workspaceName}/savedSearches/{savedSearchId}", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> delete(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("workspaceName") String workspaceName, @Path("savedSearchId") String savedSearchId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.loganalytics.v2015_03_20.SavedSearches createOrUpdate" })
        @PUT("subscriptions/{subscriptionId}/resourcegroups/{resourceGroupName}/providers/Microsoft.OperationalInsights/workspaces/{workspaceName}/savedSearches/{savedSearchId}")
        Observable<Response<ResponseBody>> createOrUpdate(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("workspaceName") String workspaceName, @Path("savedSearchId") String savedSearchId, @Query("api-version") String apiVersion, @Body SavedSearchInner parameters, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.loganalytics.v2015_03_20.SavedSearches get" })
        @GET("subscriptions/{subscriptionId}/resourcegroups/{resourceGroupName}/providers/Microsoft.OperationalInsights/workspaces/{workspaceName}/savedSearches/{savedSearchId}")
        Observable<Response<ResponseBody>> get(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("workspaceName") String workspaceName, @Path("savedSearchId") String savedSearchId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.loganalytics.v2015_03_20.SavedSearches listByWorkspace" })
        @GET("subscriptions/{subscriptionId}/resourcegroups/{resourceGroupName}/providers/Microsoft.OperationalInsights/workspaces/{workspaceName}/savedSearches")
        Observable<Response<ResponseBody>> listByWorkspace(@Path("resourceGroupName") String resourceGroupName, @Path("workspaceName") String workspaceName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.loganalytics.v2015_03_20.SavedSearches getResults" })
        @GET("subscriptions/{subscriptionId}/resourcegroups/{resourceGroupName}/providers/Microsoft.OperationalInsights/workspaces/{workspaceName}/savedSearches/{savedSearchId}/results")
        Observable<Response<ResponseBody>> getResults(@Path("resourceGroupName") String resourceGroupName, @Path("workspaceName") String workspaceName, @Path("savedSearchId") String savedSearchId, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Deletes the specified saved search in a given workspace.
     *
     * @param resourceGroupName The Resource Group name.
     * @param workspaceName The Log Analytics Workspace name.
     * @param savedSearchId The id of the saved search.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void delete(String resourceGroupName, String workspaceName, String savedSearchId) {
        deleteWithServiceResponseAsync(resourceGroupName, workspaceName, savedSearchId).toBlocking().single().body();
    }

    /**
     * Deletes the specified saved search in a given workspace.
     *
     * @param resourceGroupName The Resource Group name.
     * @param workspaceName The Log Analytics Workspace name.
     * @param savedSearchId The id of the saved search.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> deleteAsync(String resourceGroupName, String workspaceName, String savedSearchId, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(deleteWithServiceResponseAsync(resourceGroupName, workspaceName, savedSearchId), serviceCallback);
    }

    /**
     * Deletes the specified saved search in a given workspace.
     *
     * @param resourceGroupName The Resource Group name.
     * @param workspaceName The Log Analytics Workspace name.
     * @param savedSearchId The id of the saved search.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> deleteAsync(String resourceGroupName, String workspaceName, String savedSearchId) {
        return deleteWithServiceResponseAsync(resourceGroupName, workspaceName, savedSearchId).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Deletes the specified saved search in a given workspace.
     *
     * @param resourceGroupName The Resource Group name.
     * @param workspaceName The Log Analytics Workspace name.
     * @param savedSearchId The id of the saved search.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> deleteWithServiceResponseAsync(String resourceGroupName, String workspaceName, String savedSearchId) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (workspaceName == null) {
            throw new IllegalArgumentException("Parameter workspaceName is required and cannot be null.");
        }
        if (savedSearchId == null) {
            throw new IllegalArgumentException("Parameter savedSearchId is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.delete(this.client.subscriptionId(), resourceGroupName, workspaceName, savedSearchId, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
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

    private ServiceResponse<Void> deleteDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Void, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Creates or updates a saved search for a given workspace.
     *
     * @param resourceGroupName The Resource Group name.
     * @param workspaceName The Log Analytics Workspace name.
     * @param savedSearchId The id of the saved search.
     * @param parameters The parameters required to save a search.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the SavedSearchInner object if successful.
     */
    public SavedSearchInner createOrUpdate(String resourceGroupName, String workspaceName, String savedSearchId, SavedSearchInner parameters) {
        return createOrUpdateWithServiceResponseAsync(resourceGroupName, workspaceName, savedSearchId, parameters).toBlocking().single().body();
    }

    /**
     * Creates or updates a saved search for a given workspace.
     *
     * @param resourceGroupName The Resource Group name.
     * @param workspaceName The Log Analytics Workspace name.
     * @param savedSearchId The id of the saved search.
     * @param parameters The parameters required to save a search.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<SavedSearchInner> createOrUpdateAsync(String resourceGroupName, String workspaceName, String savedSearchId, SavedSearchInner parameters, final ServiceCallback<SavedSearchInner> serviceCallback) {
        return ServiceFuture.fromResponse(createOrUpdateWithServiceResponseAsync(resourceGroupName, workspaceName, savedSearchId, parameters), serviceCallback);
    }

    /**
     * Creates or updates a saved search for a given workspace.
     *
     * @param resourceGroupName The Resource Group name.
     * @param workspaceName The Log Analytics Workspace name.
     * @param savedSearchId The id of the saved search.
     * @param parameters The parameters required to save a search.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SavedSearchInner object
     */
    public Observable<SavedSearchInner> createOrUpdateAsync(String resourceGroupName, String workspaceName, String savedSearchId, SavedSearchInner parameters) {
        return createOrUpdateWithServiceResponseAsync(resourceGroupName, workspaceName, savedSearchId, parameters).map(new Func1<ServiceResponse<SavedSearchInner>, SavedSearchInner>() {
            @Override
            public SavedSearchInner call(ServiceResponse<SavedSearchInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Creates or updates a saved search for a given workspace.
     *
     * @param resourceGroupName The Resource Group name.
     * @param workspaceName The Log Analytics Workspace name.
     * @param savedSearchId The id of the saved search.
     * @param parameters The parameters required to save a search.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SavedSearchInner object
     */
    public Observable<ServiceResponse<SavedSearchInner>> createOrUpdateWithServiceResponseAsync(String resourceGroupName, String workspaceName, String savedSearchId, SavedSearchInner parameters) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (workspaceName == null) {
            throw new IllegalArgumentException("Parameter workspaceName is required and cannot be null.");
        }
        if (savedSearchId == null) {
            throw new IllegalArgumentException("Parameter savedSearchId is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        if (parameters == null) {
            throw new IllegalArgumentException("Parameter parameters is required and cannot be null.");
        }
        Validator.validate(parameters);
        return service.createOrUpdate(this.client.subscriptionId(), resourceGroupName, workspaceName, savedSearchId, this.client.apiVersion(), parameters, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<SavedSearchInner>>>() {
                @Override
                public Observable<ServiceResponse<SavedSearchInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<SavedSearchInner> clientResponse = createOrUpdateDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<SavedSearchInner> createOrUpdateDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<SavedSearchInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<SavedSearchInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets the specified saved search for a given workspace.
     *
     * @param resourceGroupName The Resource Group name.
     * @param workspaceName The Log Analytics Workspace name.
     * @param savedSearchId The id of the saved search.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the SavedSearchInner object if successful.
     */
    public SavedSearchInner get(String resourceGroupName, String workspaceName, String savedSearchId) {
        return getWithServiceResponseAsync(resourceGroupName, workspaceName, savedSearchId).toBlocking().single().body();
    }

    /**
     * Gets the specified saved search for a given workspace.
     *
     * @param resourceGroupName The Resource Group name.
     * @param workspaceName The Log Analytics Workspace name.
     * @param savedSearchId The id of the saved search.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<SavedSearchInner> getAsync(String resourceGroupName, String workspaceName, String savedSearchId, final ServiceCallback<SavedSearchInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(resourceGroupName, workspaceName, savedSearchId), serviceCallback);
    }

    /**
     * Gets the specified saved search for a given workspace.
     *
     * @param resourceGroupName The Resource Group name.
     * @param workspaceName The Log Analytics Workspace name.
     * @param savedSearchId The id of the saved search.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SavedSearchInner object
     */
    public Observable<SavedSearchInner> getAsync(String resourceGroupName, String workspaceName, String savedSearchId) {
        return getWithServiceResponseAsync(resourceGroupName, workspaceName, savedSearchId).map(new Func1<ServiceResponse<SavedSearchInner>, SavedSearchInner>() {
            @Override
            public SavedSearchInner call(ServiceResponse<SavedSearchInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets the specified saved search for a given workspace.
     *
     * @param resourceGroupName The Resource Group name.
     * @param workspaceName The Log Analytics Workspace name.
     * @param savedSearchId The id of the saved search.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SavedSearchInner object
     */
    public Observable<ServiceResponse<SavedSearchInner>> getWithServiceResponseAsync(String resourceGroupName, String workspaceName, String savedSearchId) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (workspaceName == null) {
            throw new IllegalArgumentException("Parameter workspaceName is required and cannot be null.");
        }
        if (savedSearchId == null) {
            throw new IllegalArgumentException("Parameter savedSearchId is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.get(this.client.subscriptionId(), resourceGroupName, workspaceName, savedSearchId, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<SavedSearchInner>>>() {
                @Override
                public Observable<ServiceResponse<SavedSearchInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<SavedSearchInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<SavedSearchInner> getDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<SavedSearchInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<SavedSearchInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets the saved searches for a given Log Analytics Workspace.
     *
     * @param resourceGroupName The Resource Group name.
     * @param workspaceName The Log Analytics Workspace name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the SavedSearchesListResultInner object if successful.
     */
    public SavedSearchesListResultInner listByWorkspace(String resourceGroupName, String workspaceName) {
        return listByWorkspaceWithServiceResponseAsync(resourceGroupName, workspaceName).toBlocking().single().body();
    }

    /**
     * Gets the saved searches for a given Log Analytics Workspace.
     *
     * @param resourceGroupName The Resource Group name.
     * @param workspaceName The Log Analytics Workspace name.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<SavedSearchesListResultInner> listByWorkspaceAsync(String resourceGroupName, String workspaceName, final ServiceCallback<SavedSearchesListResultInner> serviceCallback) {
        return ServiceFuture.fromResponse(listByWorkspaceWithServiceResponseAsync(resourceGroupName, workspaceName), serviceCallback);
    }

    /**
     * Gets the saved searches for a given Log Analytics Workspace.
     *
     * @param resourceGroupName The Resource Group name.
     * @param workspaceName The Log Analytics Workspace name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SavedSearchesListResultInner object
     */
    public Observable<SavedSearchesListResultInner> listByWorkspaceAsync(String resourceGroupName, String workspaceName) {
        return listByWorkspaceWithServiceResponseAsync(resourceGroupName, workspaceName).map(new Func1<ServiceResponse<SavedSearchesListResultInner>, SavedSearchesListResultInner>() {
            @Override
            public SavedSearchesListResultInner call(ServiceResponse<SavedSearchesListResultInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets the saved searches for a given Log Analytics Workspace.
     *
     * @param resourceGroupName The Resource Group name.
     * @param workspaceName The Log Analytics Workspace name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SavedSearchesListResultInner object
     */
    public Observable<ServiceResponse<SavedSearchesListResultInner>> listByWorkspaceWithServiceResponseAsync(String resourceGroupName, String workspaceName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (workspaceName == null) {
            throw new IllegalArgumentException("Parameter workspaceName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.listByWorkspace(resourceGroupName, workspaceName, this.client.subscriptionId(), this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<SavedSearchesListResultInner>>>() {
                @Override
                public Observable<ServiceResponse<SavedSearchesListResultInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<SavedSearchesListResultInner> clientResponse = listByWorkspaceDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<SavedSearchesListResultInner> listByWorkspaceDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<SavedSearchesListResultInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<SavedSearchesListResultInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets the results from a saved search for a given workspace.
     *
     * @param resourceGroupName The Resource Group name.
     * @param workspaceName The Log Analytics Workspace name.
     * @param savedSearchId The id of the saved search.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the SearchResultsResponseInner object if successful.
     */
    public SearchResultsResponseInner getResults(String resourceGroupName, String workspaceName, String savedSearchId) {
        return getResultsWithServiceResponseAsync(resourceGroupName, workspaceName, savedSearchId).toBlocking().single().body();
    }

    /**
     * Gets the results from a saved search for a given workspace.
     *
     * @param resourceGroupName The Resource Group name.
     * @param workspaceName The Log Analytics Workspace name.
     * @param savedSearchId The id of the saved search.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<SearchResultsResponseInner> getResultsAsync(String resourceGroupName, String workspaceName, String savedSearchId, final ServiceCallback<SearchResultsResponseInner> serviceCallback) {
        return ServiceFuture.fromResponse(getResultsWithServiceResponseAsync(resourceGroupName, workspaceName, savedSearchId), serviceCallback);
    }

    /**
     * Gets the results from a saved search for a given workspace.
     *
     * @param resourceGroupName The Resource Group name.
     * @param workspaceName The Log Analytics Workspace name.
     * @param savedSearchId The id of the saved search.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SearchResultsResponseInner object
     */
    public Observable<SearchResultsResponseInner> getResultsAsync(String resourceGroupName, String workspaceName, String savedSearchId) {
        return getResultsWithServiceResponseAsync(resourceGroupName, workspaceName, savedSearchId).map(new Func1<ServiceResponse<SearchResultsResponseInner>, SearchResultsResponseInner>() {
            @Override
            public SearchResultsResponseInner call(ServiceResponse<SearchResultsResponseInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets the results from a saved search for a given workspace.
     *
     * @param resourceGroupName The Resource Group name.
     * @param workspaceName The Log Analytics Workspace name.
     * @param savedSearchId The id of the saved search.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SearchResultsResponseInner object
     */
    public Observable<ServiceResponse<SearchResultsResponseInner>> getResultsWithServiceResponseAsync(String resourceGroupName, String workspaceName, String savedSearchId) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (workspaceName == null) {
            throw new IllegalArgumentException("Parameter workspaceName is required and cannot be null.");
        }
        if (savedSearchId == null) {
            throw new IllegalArgumentException("Parameter savedSearchId is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.getResults(resourceGroupName, workspaceName, savedSearchId, this.client.subscriptionId(), this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<SearchResultsResponseInner>>>() {
                @Override
                public Observable<ServiceResponse<SearchResultsResponseInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<SearchResultsResponseInner> clientResponse = getResultsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<SearchResultsResponseInner> getResultsDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<SearchResultsResponseInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<SearchResultsResponseInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
