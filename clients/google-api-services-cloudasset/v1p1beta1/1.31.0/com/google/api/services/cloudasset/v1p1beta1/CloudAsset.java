/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.cloudasset.v1p1beta1;

/**
 * Service definition for CloudAsset (v1p1beta1).
 *
 * <p>
 * The cloud asset API manages the history and inventory of cloud resources.
 * </p>
 *
 * <p>
 * For more information about this service, see the
 * <a href="https://cloud.google.com/asset-inventory/docs/quickstart" target="_blank">API Documentation</a>
 * </p>
 *
 * <p>
 * This service uses {@link CloudAssetRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * @since 1.3
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class CloudAsset extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient {

  // Note: Leave this static initializer at the top of the file.
  static {
    com.google.api.client.util.Preconditions.checkState(
        com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION == 1 &&
        (com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION >= 32 ||
        (com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION == 31 &&
        com.google.api.client.googleapis.GoogleUtils.BUGFIX_VERSION >= 1)),
        "You are currently running with version %s of google-api-client. " +
        "You need at least version 1.31.1 of google-api-client to run version " +
        "1.31.0 of the Cloud Asset API library.", com.google.api.client.googleapis.GoogleUtils.VERSION);
  }

  /**
   * The default encoded root URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_ROOT_URL = "https://cloudasset.googleapis.com/";

  /**
   * The default encoded mTLS root URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   *
   * @since 1.31
   */
  public static final String DEFAULT_MTLS_ROOT_URL = "https://cloudasset.mtls.googleapis.com/";

  /**
   * The default encoded service path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_SERVICE_PATH = "";

  /**
   * The default encoded batch path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.23
   */
  public static final String DEFAULT_BATCH_PATH = "batch";

  /**
   * The default encoded base URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   */
  public static final String DEFAULT_BASE_URL = DEFAULT_ROOT_URL + DEFAULT_SERVICE_PATH;

  /**
   * Constructor.
   *
   * <p>
   * Use {@link Builder} if you need to specify any of the optional parameters.
   * </p>
   *
   * @param transport HTTP transport, which should normally be:
   *        <ul>
   *        <li>Google App Engine:
   *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
   *        <li>Android: {@code newCompatibleTransport} from
   *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
   *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
   *        </li>
   *        </ul>
   * @param jsonFactory JSON factory, which may be:
   *        <ul>
   *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
   *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
   *        <li>Android Honeycomb or higher:
   *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
   *        </ul>
   * @param httpRequestInitializer HTTP request initializer or {@code null} for none
   * @since 1.7
   */
  public CloudAsset(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
      com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
    this(new Builder(transport, jsonFactory, httpRequestInitializer));
  }

  /**
   * @param builder builder
   */
  CloudAsset(Builder builder) {
    super(builder);
  }

  @Override
  protected void initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
    super.initialize(httpClientRequest);
  }

  /**
   * An accessor for creating requests from the IamPolicies collection.
   *
   * <p>The typical use is:</p>
   * <pre>
   *   {@code CloudAsset cloudasset = new CloudAsset(...);}
   *   {@code CloudAsset.IamPolicies.List request = cloudasset.iamPolicies().list(parameters ...)}
   * </pre>
   *
   * @return the resource collection
   */
  public IamPolicies iamPolicies() {
    return new IamPolicies();
  }

  /**
   * The "iamPolicies" collection of methods.
   */
  public class IamPolicies {

    /**
     * Searches all the IAM policies within a given accessible CRM scope (project/folder/organization).
     * This RPC gives callers especially administrators the ability to search all the IAM policies
     * within a scope, even if they don't have `.getIamPolicy` permission of all the IAM policies.
     * Callers should have `cloud.assets.SearchAllIamPolicies` permission on the requested scope,
     * otherwise the request will be rejected.
     *
     * Create a request for the method "iamPolicies.searchAll".
     *
     * This request holds the parameters needed by the cloudasset server.  After setting any optional
     * parameters, call the {@link SearchAll#execute()} method to invoke the remote operation.
     *
     * @param scope Required. The relative name of an asset. The search is limited to the resources within the `scope`.
     *        The allowed value must be: * Organization number (such as "organizations/123") * Folder
     *        number(such as "folders/1234") * Project number (such as "projects/12345") * Project id
     *        (such as "projects/abc")
     * @return the request
     */
    public SearchAll searchAll(java.lang.String scope) throws java.io.IOException {
      SearchAll result = new SearchAll(scope);
      initialize(result);
      return result;
    }

    public class SearchAll extends CloudAssetRequest<com.google.api.services.cloudasset.v1p1beta1.model.SearchAllIamPoliciesResponse> {

      private static final String REST_PATH = "v1p1beta1/{+scope}/iamPolicies:searchAll";

      private final java.util.regex.Pattern SCOPE_PATTERN =
          java.util.regex.Pattern.compile("^[^/]+/[^/]+$");

      /**
       * Searches all the IAM policies within a given accessible CRM scope
       * (project/folder/organization). This RPC gives callers especially administrators the ability to
       * search all the IAM policies within a scope, even if they don't have `.getIamPolicy` permission
       * of all the IAM policies. Callers should have `cloud.assets.SearchAllIamPolicies` permission on
       * the requested scope, otherwise the request will be rejected.
       *
       * Create a request for the method "iamPolicies.searchAll".
       *
       * This request holds the parameters needed by the the cloudasset server.  After setting any
       * optional parameters, call the {@link SearchAll#execute()} method to invoke the remote
       * operation. <p> {@link
       * SearchAll#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
       * must be called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @param scope Required. The relative name of an asset. The search is limited to the resources within the `scope`.
     *        The allowed value must be: * Organization number (such as "organizations/123") * Folder
     *        number(such as "folders/1234") * Project number (such as "projects/12345") * Project id
     *        (such as "projects/abc")
       * @since 1.13
       */
      protected SearchAll(java.lang.String scope) {
        super(CloudAsset.this, "GET", REST_PATH, null, com.google.api.services.cloudasset.v1p1beta1.model.SearchAllIamPoliciesResponse.class);
        this.scope = com.google.api.client.util.Preconditions.checkNotNull(scope, "Required parameter scope must be specified.");
        if (!getSuppressPatternChecks()) {
          com.google.api.client.util.Preconditions.checkArgument(SCOPE_PATTERN.matcher(scope).matches(),
              "Parameter scope must conform to the pattern " +
              "^[^/]+/[^/]+$");
        }
      }

      @Override
      public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
        return super.executeUsingHead();
      }

      @Override
      public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
        return super.buildHttpRequestUsingHead();
      }

      @Override
      public SearchAll set$Xgafv(java.lang.String $Xgafv) {
        return (SearchAll) super.set$Xgafv($Xgafv);
      }

      @Override
      public SearchAll setAccessToken(java.lang.String accessToken) {
        return (SearchAll) super.setAccessToken(accessToken);
      }

      @Override
      public SearchAll setAlt(java.lang.String alt) {
        return (SearchAll) super.setAlt(alt);
      }

      @Override
      public SearchAll setCallback(java.lang.String callback) {
        return (SearchAll) super.setCallback(callback);
      }

      @Override
      public SearchAll setFields(java.lang.String fields) {
        return (SearchAll) super.setFields(fields);
      }

      @Override
      public SearchAll setKey(java.lang.String key) {
        return (SearchAll) super.setKey(key);
      }

      @Override
      public SearchAll setOauthToken(java.lang.String oauthToken) {
        return (SearchAll) super.setOauthToken(oauthToken);
      }

      @Override
      public SearchAll setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (SearchAll) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public SearchAll setQuotaUser(java.lang.String quotaUser) {
        return (SearchAll) super.setQuotaUser(quotaUser);
      }

      @Override
      public SearchAll setUploadType(java.lang.String uploadType) {
        return (SearchAll) super.setUploadType(uploadType);
      }

      @Override
      public SearchAll setUploadProtocol(java.lang.String uploadProtocol) {
        return (SearchAll) super.setUploadProtocol(uploadProtocol);
      }

      /**
       * Required. The relative name of an asset. The search is limited to the resources within the
       * `scope`. The allowed value must be: * Organization number (such as "organizations/123") *
       * Folder number(such as "folders/1234") * Project number (such as "projects/12345") * Project
       * id (such as "projects/abc")
       */
      @com.google.api.client.util.Key
      private java.lang.String scope;

      /** Required. The relative name of an asset. The search is limited to the resources within the `scope`.
     The allowed value must be: * Organization number (such as "organizations/123") * Folder number(such
     as "folders/1234") * Project number (such as "projects/12345") * Project id (such as
     "projects/abc")
       */
      public java.lang.String getScope() {
        return scope;
      }

      /**
       * Required. The relative name of an asset. The search is limited to the resources within the
       * `scope`. The allowed value must be: * Organization number (such as "organizations/123") *
       * Folder number(such as "folders/1234") * Project number (such as "projects/12345") * Project
       * id (such as "projects/abc")
       */
      public SearchAll setScope(java.lang.String scope) {
        if (!getSuppressPatternChecks()) {
          com.google.api.client.util.Preconditions.checkArgument(SCOPE_PATTERN.matcher(scope).matches(),
              "Parameter scope must conform to the pattern " +
              "^[^/]+/[^/]+$");
        }
        this.scope = scope;
        return this;
      }

      /**
       * Optional. The page size for search result pagination. Page size is capped at 500 even if a
       * larger value is given. If set to zero, server will pick an appropriate default. Returned
       * results may be fewer than requested. When this happens, there could be more results as long
       * as `next_page_token` is returned.
       */
      @com.google.api.client.util.Key
      private java.lang.Integer pageSize;

      /** Optional. The page size for search result pagination. Page size is capped at 500 even if a larger
     value is given. If set to zero, server will pick an appropriate default. Returned results may be
     fewer than requested. When this happens, there could be more results as long as `next_page_token`
     is returned.
       */
      public java.lang.Integer getPageSize() {
        return pageSize;
      }

      /**
       * Optional. The page size for search result pagination. Page size is capped at 500 even if a
       * larger value is given. If set to zero, server will pick an appropriate default. Returned
       * results may be fewer than requested. When this happens, there could be more results as long
       * as `next_page_token` is returned.
       */
      public SearchAll setPageSize(java.lang.Integer pageSize) {
        this.pageSize = pageSize;
        return this;
      }

      /**
       * Optional. If present, retrieve the next batch of results from the preceding call to this
       * method. `page_token` must be the value of `next_page_token` from the previous response. The
       * values of all other method parameters must be identical to those in the previous call.
       */
      @com.google.api.client.util.Key
      private java.lang.String pageToken;

      /** Optional. If present, retrieve the next batch of results from the preceding call to this method.
     `page_token` must be the value of `next_page_token` from the previous response. The values of all
     other method parameters must be identical to those in the previous call.
       */
      public java.lang.String getPageToken() {
        return pageToken;
      }

      /**
       * Optional. If present, retrieve the next batch of results from the preceding call to this
       * method. `page_token` must be the value of `next_page_token` from the previous response. The
       * values of all other method parameters must be identical to those in the previous call.
       */
      public SearchAll setPageToken(java.lang.String pageToken) {
        this.pageToken = pageToken;
        return this;
      }

      /**
       * Optional. The query statement. Examples: * "policy:myuser@mydomain.com" *
       * "policy:(myuser@mydomain.com viewer)"
       */
      @com.google.api.client.util.Key
      private java.lang.String query;

      /** Optional. The query statement. Examples: * "policy:myuser@mydomain.com" *
     "policy:(myuser@mydomain.com viewer)"
       */
      public java.lang.String getQuery() {
        return query;
      }

      /**
       * Optional. The query statement. Examples: * "policy:myuser@mydomain.com" *
       * "policy:(myuser@mydomain.com viewer)"
       */
      public SearchAll setQuery(java.lang.String query) {
        this.query = query;
        return this;
      }

      @Override
      public SearchAll set(String parameterName, Object value) {
        return (SearchAll) super.set(parameterName, value);
      }
    }

  }

  /**
   * An accessor for creating requests from the Resources collection.
   *
   * <p>The typical use is:</p>
   * <pre>
   *   {@code CloudAsset cloudasset = new CloudAsset(...);}
   *   {@code CloudAsset.Resources.List request = cloudasset.resources().list(parameters ...)}
   * </pre>
   *
   * @return the resource collection
   */
  public Resources resources() {
    return new Resources();
  }

  /**
   * The "resources" collection of methods.
   */
  public class Resources {

    /**
     * Searches all the resources within a given accessible CRM scope (project/folder/organization).
     * This RPC gives callers especially administrators the ability to search all the resources within a
     * scope, even if they don't have `.get` permission of all the resources. Callers should have
     * `cloud.assets.SearchAllResources` permission on the requested scope, otherwise the request will
     * be rejected.
     *
     * Create a request for the method "resources.searchAll".
     *
     * This request holds the parameters needed by the cloudasset server.  After setting any optional
     * parameters, call the {@link SearchAll#execute()} method to invoke the remote operation.
     *
     * @param scope Required. The relative name of an asset. The search is limited to the resources within the `scope`.
     *        The allowed value must be: * Organization number (such as "organizations/123") * Folder
     *        number(such as "folders/1234") * Project number (such as "projects/12345") * Project id
     *        (such as "projects/abc")
     * @return the request
     */
    public SearchAll searchAll(java.lang.String scope) throws java.io.IOException {
      SearchAll result = new SearchAll(scope);
      initialize(result);
      return result;
    }

    public class SearchAll extends CloudAssetRequest<com.google.api.services.cloudasset.v1p1beta1.model.SearchAllResourcesResponse> {

      private static final String REST_PATH = "v1p1beta1/{+scope}/resources:searchAll";

      private final java.util.regex.Pattern SCOPE_PATTERN =
          java.util.regex.Pattern.compile("^[^/]+/[^/]+$");

      /**
       * Searches all the resources within a given accessible CRM scope (project/folder/organization).
       * This RPC gives callers especially administrators the ability to search all the resources within
       * a scope, even if they don't have `.get` permission of all the resources. Callers should have
       * `cloud.assets.SearchAllResources` permission on the requested scope, otherwise the request will
       * be rejected.
       *
       * Create a request for the method "resources.searchAll".
       *
       * This request holds the parameters needed by the the cloudasset server.  After setting any
       * optional parameters, call the {@link SearchAll#execute()} method to invoke the remote
       * operation. <p> {@link
       * SearchAll#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
       * must be called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @param scope Required. The relative name of an asset. The search is limited to the resources within the `scope`.
     *        The allowed value must be: * Organization number (such as "organizations/123") * Folder
     *        number(such as "folders/1234") * Project number (such as "projects/12345") * Project id
     *        (such as "projects/abc")
       * @since 1.13
       */
      protected SearchAll(java.lang.String scope) {
        super(CloudAsset.this, "GET", REST_PATH, null, com.google.api.services.cloudasset.v1p1beta1.model.SearchAllResourcesResponse.class);
        this.scope = com.google.api.client.util.Preconditions.checkNotNull(scope, "Required parameter scope must be specified.");
        if (!getSuppressPatternChecks()) {
          com.google.api.client.util.Preconditions.checkArgument(SCOPE_PATTERN.matcher(scope).matches(),
              "Parameter scope must conform to the pattern " +
              "^[^/]+/[^/]+$");
        }
      }

      @Override
      public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
        return super.executeUsingHead();
      }

      @Override
      public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
        return super.buildHttpRequestUsingHead();
      }

      @Override
      public SearchAll set$Xgafv(java.lang.String $Xgafv) {
        return (SearchAll) super.set$Xgafv($Xgafv);
      }

      @Override
      public SearchAll setAccessToken(java.lang.String accessToken) {
        return (SearchAll) super.setAccessToken(accessToken);
      }

      @Override
      public SearchAll setAlt(java.lang.String alt) {
        return (SearchAll) super.setAlt(alt);
      }

      @Override
      public SearchAll setCallback(java.lang.String callback) {
        return (SearchAll) super.setCallback(callback);
      }

      @Override
      public SearchAll setFields(java.lang.String fields) {
        return (SearchAll) super.setFields(fields);
      }

      @Override
      public SearchAll setKey(java.lang.String key) {
        return (SearchAll) super.setKey(key);
      }

      @Override
      public SearchAll setOauthToken(java.lang.String oauthToken) {
        return (SearchAll) super.setOauthToken(oauthToken);
      }

      @Override
      public SearchAll setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (SearchAll) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public SearchAll setQuotaUser(java.lang.String quotaUser) {
        return (SearchAll) super.setQuotaUser(quotaUser);
      }

      @Override
      public SearchAll setUploadType(java.lang.String uploadType) {
        return (SearchAll) super.setUploadType(uploadType);
      }

      @Override
      public SearchAll setUploadProtocol(java.lang.String uploadProtocol) {
        return (SearchAll) super.setUploadProtocol(uploadProtocol);
      }

      /**
       * Required. The relative name of an asset. The search is limited to the resources within the
       * `scope`. The allowed value must be: * Organization number (such as "organizations/123") *
       * Folder number(such as "folders/1234") * Project number (such as "projects/12345") * Project
       * id (such as "projects/abc")
       */
      @com.google.api.client.util.Key
      private java.lang.String scope;

      /** Required. The relative name of an asset. The search is limited to the resources within the `scope`.
     The allowed value must be: * Organization number (such as "organizations/123") * Folder number(such
     as "folders/1234") * Project number (such as "projects/12345") * Project id (such as
     "projects/abc")
       */
      public java.lang.String getScope() {
        return scope;
      }

      /**
       * Required. The relative name of an asset. The search is limited to the resources within the
       * `scope`. The allowed value must be: * Organization number (such as "organizations/123") *
       * Folder number(such as "folders/1234") * Project number (such as "projects/12345") * Project
       * id (such as "projects/abc")
       */
      public SearchAll setScope(java.lang.String scope) {
        if (!getSuppressPatternChecks()) {
          com.google.api.client.util.Preconditions.checkArgument(SCOPE_PATTERN.matcher(scope).matches(),
              "Parameter scope must conform to the pattern " +
              "^[^/]+/[^/]+$");
        }
        this.scope = scope;
        return this;
      }

      /**
       * Optional. A list of asset types that this request searches for. If empty, it will search
       * all the supported asset types.
       */
      @com.google.api.client.util.Key
      private java.util.List<java.lang.String> assetTypes;

      /** Optional. A list of asset types that this request searches for. If empty, it will search all the
     supported asset types.
       */
      public java.util.List<java.lang.String> getAssetTypes() {
        return assetTypes;
      }

      /**
       * Optional. A list of asset types that this request searches for. If empty, it will search
       * all the supported asset types.
       */
      public SearchAll setAssetTypes(java.util.List<java.lang.String> assetTypes) {
        this.assetTypes = assetTypes;
        return this;
      }

      /**
       * Optional. A comma separated list of fields specifying the sorting order of the results. The
       * default order is ascending. Add ` DESC` after the field name to indicate descending order.
       * Redundant space characters are ignored. For example, ` location DESC , name `.
       */
      @com.google.api.client.util.Key
      private java.lang.String orderBy;

      /** Optional. A comma separated list of fields specifying the sorting order of the results. The default
     order is ascending. Add ` DESC` after the field name to indicate descending order. Redundant space
     characters are ignored. For example, ` location DESC , name `.
       */
      public java.lang.String getOrderBy() {
        return orderBy;
      }

      /**
       * Optional. A comma separated list of fields specifying the sorting order of the results. The
       * default order is ascending. Add ` DESC` after the field name to indicate descending order.
       * Redundant space characters are ignored. For example, ` location DESC , name `.
       */
      public SearchAll setOrderBy(java.lang.String orderBy) {
        this.orderBy = orderBy;
        return this;
      }

      /**
       * Optional. The page size for search result pagination. Page size is capped at 500 even if a
       * larger value is given. If set to zero, server will pick an appropriate default. Returned
       * results may be fewer than requested. When this happens, there could be more results as long
       * as `next_page_token` is returned.
       */
      @com.google.api.client.util.Key
      private java.lang.Integer pageSize;

      /** Optional. The page size for search result pagination. Page size is capped at 500 even if a larger
     value is given. If set to zero, server will pick an appropriate default. Returned results may be
     fewer than requested. When this happens, there could be more results as long as `next_page_token`
     is returned.
       */
      public java.lang.Integer getPageSize() {
        return pageSize;
      }

      /**
       * Optional. The page size for search result pagination. Page size is capped at 500 even if a
       * larger value is given. If set to zero, server will pick an appropriate default. Returned
       * results may be fewer than requested. When this happens, there could be more results as long
       * as `next_page_token` is returned.
       */
      public SearchAll setPageSize(java.lang.Integer pageSize) {
        this.pageSize = pageSize;
        return this;
      }

      /**
       * Optional. If present, then retrieve the next batch of results from the preceding call to
       * this method. `page_token` must be the value of `next_page_token` from the previous
       * response. The values of all other method parameters, must be identical to those in the
       * previous call.
       */
      @com.google.api.client.util.Key
      private java.lang.String pageToken;

      /** Optional. If present, then retrieve the next batch of results from the preceding call to this
     method. `page_token` must be the value of `next_page_token` from the previous response. The values
     of all other method parameters, must be identical to those in the previous call.
       */
      public java.lang.String getPageToken() {
        return pageToken;
      }

      /**
       * Optional. If present, then retrieve the next batch of results from the preceding call to
       * this method. `page_token` must be the value of `next_page_token` from the previous
       * response. The values of all other method parameters, must be identical to those in the
       * previous call.
       */
      public SearchAll setPageToken(java.lang.String pageToken) {
        this.pageToken = pageToken;
        return this;
      }

      /** Optional. The query statement. */
      @com.google.api.client.util.Key
      private java.lang.String query;

      /** Optional. The query statement.
       */
      public java.lang.String getQuery() {
        return query;
      }

      /** Optional. The query statement. */
      public SearchAll setQuery(java.lang.String query) {
        this.query = query;
        return this;
      }

      @Override
      public SearchAll set(String parameterName, Object value) {
        return (SearchAll) super.set(parameterName, value);
      }
    }

  }

  /**
   * Builder for {@link CloudAsset}.
   *
   * <p>
   * Implementation is not thread-safe.
   * </p>
   *
   * @since 1.3.0
   */
  public static final class Builder extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder {

    private static String chooseEndpoint(com.google.api.client.http.HttpTransport transport) {
      // If the GOOGLE_API_USE_MTLS_ENDPOINT environment variable value is "always", use mTLS endpoint.
      // If the env variable is "auto", use mTLS endpoint if and only if the transport is mTLS.
      // Use the regular endpoint for all other cases.
      String useMtlsEndpoint = System.getenv("GOOGLE_API_USE_MTLS_ENDPOINT");
      useMtlsEndpoint = useMtlsEndpoint == null ? "auto" : useMtlsEndpoint;
      if ("always".equals(useMtlsEndpoint) || ("auto".equals(useMtlsEndpoint) && transport != null && transport.isMtls())) {
        return DEFAULT_MTLS_ROOT_URL;
      }
      return DEFAULT_ROOT_URL;
    }

    /**
     * Returns an instance of a new builder.
     *
     * @param transport HTTP transport, which should normally be:
     *        <ul>
     *        <li>Google App Engine:
     *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
     *        <li>Android: {@code newCompatibleTransport} from
     *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
     *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
     *        </li>
     *        </ul>
     * @param jsonFactory JSON factory, which may be:
     *        <ul>
     *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
     *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
     *        <li>Android Honeycomb or higher:
     *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
     *        </ul>
     * @param httpRequestInitializer HTTP request initializer or {@code null} for none
     * @since 1.7
     */
    public Builder(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
        com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      super(
          transport,
          jsonFactory,
          Builder.chooseEndpoint(transport),
          DEFAULT_SERVICE_PATH,
          httpRequestInitializer,
          false);
      setBatchPath(DEFAULT_BATCH_PATH);
    }

    /** Builds a new instance of {@link CloudAsset}. */
    @Override
    public CloudAsset build() {
      return new CloudAsset(this);
    }

    @Override
    public Builder setRootUrl(String rootUrl) {
      return (Builder) super.setRootUrl(rootUrl);
    }

    @Override
    public Builder setServicePath(String servicePath) {
      return (Builder) super.setServicePath(servicePath);
    }

    @Override
    public Builder setBatchPath(String batchPath) {
      return (Builder) super.setBatchPath(batchPath);
    }

    @Override
    public Builder setHttpRequestInitializer(com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      return (Builder) super.setHttpRequestInitializer(httpRequestInitializer);
    }

    @Override
    public Builder setApplicationName(String applicationName) {
      return (Builder) super.setApplicationName(applicationName);
    }

    @Override
    public Builder setSuppressPatternChecks(boolean suppressPatternChecks) {
      return (Builder) super.setSuppressPatternChecks(suppressPatternChecks);
    }

    @Override
    public Builder setSuppressRequiredParameterChecks(boolean suppressRequiredParameterChecks) {
      return (Builder) super.setSuppressRequiredParameterChecks(suppressRequiredParameterChecks);
    }

    @Override
    public Builder setSuppressAllChecks(boolean suppressAllChecks) {
      return (Builder) super.setSuppressAllChecks(suppressAllChecks);
    }

    /**
     * Set the {@link CloudAssetRequestInitializer}.
     *
     * @since 1.12
     */
    public Builder setCloudAssetRequestInitializer(
        CloudAssetRequestInitializer cloudassetRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(cloudassetRequestInitializer);
    }

    @Override
    public Builder setGoogleClientRequestInitializer(
        com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
    }
  }
}
