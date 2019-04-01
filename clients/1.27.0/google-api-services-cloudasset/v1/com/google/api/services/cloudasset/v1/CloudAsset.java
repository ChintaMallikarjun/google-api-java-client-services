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

package com.google.api.services.cloudasset.v1;

/**
 * Service definition for CloudAsset (v1).
 *
 * <p>
 * The cloud asset API manages the history and inventory of cloud resources.
 * </p>
 *
 * <p>
 * For more information about this service, see the
 * <a href="https://cloud.google.com/resource-manager/docs/cloud-asset-inventory/quickstart-cloud-asset-inventory" target="_blank">API Documentation</a>
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
        com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION >= 15,
        "You are currently running with version %s of google-api-client. " +
        "You need at least version 1.15 of google-api-client to run version " +
        "1.27.0 of the Cloud Asset API library.", com.google.api.client.googleapis.GoogleUtils.VERSION);
  }

  /**
   * The default encoded root URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_ROOT_URL = "https://cloudasset.googleapis.com/";

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
   * An accessor for creating requests from the Operations collection.
   *
   * <p>The typical use is:</p>
   * <pre>
   *   {@code CloudAsset cloudasset = new CloudAsset(...);}
   *   {@code CloudAsset.Operations.List request = cloudasset.operations().list(parameters ...)}
   * </pre>
   *
   * @return the resource collection
   */
  public Operations operations() {
    return new Operations();
  }

  /**
   * The "operations" collection of methods.
   */
  public class Operations {

    /**
     * Gets the latest state of a long-running operation.  Clients can use this method to poll the
     * operation result at intervals as recommended by the API service.
     *
     * Create a request for the method "operations.get".
     *
     * This request holds the parameters needed by the cloudasset server.  After setting any optional
     * parameters, call the {@link Get#execute()} method to invoke the remote operation.
     *
     * @param name The name of the operation resource.
     * @return the request
     */
    public Get get(java.lang.String name) throws java.io.IOException {
      Get result = new Get(name);
      initialize(result);
      return result;
    }

    public class Get extends CloudAssetRequest<com.google.api.services.cloudasset.v1.model.Operation> {

      private static final String REST_PATH = "v1/{+name}";

      private final java.util.regex.Pattern NAME_PATTERN =
          java.util.regex.Pattern.compile("^[^/]+/[^/]+/operations/[^/]+/.+$");

      /**
       * Gets the latest state of a long-running operation.  Clients can use this method to poll the
       * operation result at intervals as recommended by the API service.
       *
       * Create a request for the method "operations.get".
       *
       * This request holds the parameters needed by the the cloudasset server.  After setting any
       * optional parameters, call the {@link Get#execute()} method to invoke the remote operation. <p>
       * {@link Get#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
       * must be called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @param name The name of the operation resource.
       * @since 1.13
       */
      protected Get(java.lang.String name) {
        super(CloudAsset.this, "GET", REST_PATH, null, com.google.api.services.cloudasset.v1.model.Operation.class);
        this.name = com.google.api.client.util.Preconditions.checkNotNull(name, "Required parameter name must be specified.");
        if (!getSuppressPatternChecks()) {
          com.google.api.client.util.Preconditions.checkArgument(NAME_PATTERN.matcher(name).matches(),
              "Parameter name must conform to the pattern " +
              "^[^/]+/[^/]+/operations/[^/]+/.+$");
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
      public Get set$Xgafv(java.lang.String $Xgafv) {
        return (Get) super.set$Xgafv($Xgafv);
      }

      @Override
      public Get setAccessToken(java.lang.String accessToken) {
        return (Get) super.setAccessToken(accessToken);
      }

      @Override
      public Get setAlt(java.lang.String alt) {
        return (Get) super.setAlt(alt);
      }

      @Override
      public Get setCallback(java.lang.String callback) {
        return (Get) super.setCallback(callback);
      }

      @Override
      public Get setFields(java.lang.String fields) {
        return (Get) super.setFields(fields);
      }

      @Override
      public Get setKey(java.lang.String key) {
        return (Get) super.setKey(key);
      }

      @Override
      public Get setOauthToken(java.lang.String oauthToken) {
        return (Get) super.setOauthToken(oauthToken);
      }

      @Override
      public Get setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (Get) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public Get setQuotaUser(java.lang.String quotaUser) {
        return (Get) super.setQuotaUser(quotaUser);
      }

      @Override
      public Get setUploadType(java.lang.String uploadType) {
        return (Get) super.setUploadType(uploadType);
      }

      @Override
      public Get setUploadProtocol(java.lang.String uploadProtocol) {
        return (Get) super.setUploadProtocol(uploadProtocol);
      }

      /** The name of the operation resource. */
      @com.google.api.client.util.Key
      private java.lang.String name;

      /** The name of the operation resource.
       */
      public java.lang.String getName() {
        return name;
      }

      /** The name of the operation resource. */
      public Get setName(java.lang.String name) {
        if (!getSuppressPatternChecks()) {
          com.google.api.client.util.Preconditions.checkArgument(NAME_PATTERN.matcher(name).matches(),
              "Parameter name must conform to the pattern " +
              "^[^/]+/[^/]+/operations/[^/]+/.+$");
        }
        this.name = name;
        return this;
      }

      @Override
      public Get set(String parameterName, Object value) {
        return (Get) super.set(parameterName, value);
      }
    }

  }

  /**
   * An accessor for creating requests from the V1 collection.
   *
   * <p>The typical use is:</p>
   * <pre>
   *   {@code CloudAsset cloudasset = new CloudAsset(...);}
   *   {@code CloudAsset.V1.List request = cloudasset.v1().list(parameters ...)}
   * </pre>
   *
   * @return the resource collection
   */
  public V1 v1() {
    return new V1();
  }

  /**
   * The "v1" collection of methods.
   */
  public class V1 {

    /**
     * Batch gets the update history of assets that overlap a time window. For RESOURCE content, this
     * API outputs history with asset in both non-delete or deleted status. For IAM_POLICY content, this
     * API outputs history when the asset and its attached IAM POLICY both exist. This can create gaps
     * in the output history. If a specified asset does not exist, this API returns an INVALID_ARGUMENT
     * error.
     *
     * Create a request for the method "v1.batchGetAssetsHistory".
     *
     * This request holds the parameters needed by the cloudasset server.  After setting any optional
     * parameters, call the {@link BatchGetAssetsHistory#execute()} method to invoke the remote
     * operation.
     *
     * @param parent Required. The relative name of the root asset. It can only be an
    organization number (such as
     *        "organizations/123"), a project ID (such as
    "projects/my-project-id")", or a project
     *        number (such as "projects/12345").
     * @return the request
     */
    public BatchGetAssetsHistory batchGetAssetsHistory(java.lang.String parent) throws java.io.IOException {
      BatchGetAssetsHistory result = new BatchGetAssetsHistory(parent);
      initialize(result);
      return result;
    }

    public class BatchGetAssetsHistory extends CloudAssetRequest<com.google.api.services.cloudasset.v1.model.BatchGetAssetsHistoryResponse> {

      private static final String REST_PATH = "v1/{+parent}:batchGetAssetsHistory";

      private final java.util.regex.Pattern PARENT_PATTERN =
          java.util.regex.Pattern.compile("^[^/]+/[^/]+$");

      /**
       * Batch gets the update history of assets that overlap a time window. For RESOURCE content, this
       * API outputs history with asset in both non-delete or deleted status. For IAM_POLICY content,
       * this API outputs history when the asset and its attached IAM POLICY both exist. This can create
       * gaps in the output history. If a specified asset does not exist, this API returns an
       * INVALID_ARGUMENT error.
       *
       * Create a request for the method "v1.batchGetAssetsHistory".
       *
       * This request holds the parameters needed by the the cloudasset server.  After setting any
       * optional parameters, call the {@link BatchGetAssetsHistory#execute()} method to invoke the
       * remote operation. <p> {@link BatchGetAssetsHistory#initialize(com.google.api.client.googleapis.
       * services.AbstractGoogleClientRequest)} must be called to initialize this instance immediately
       * after invoking the constructor. </p>
       *
       * @param parent Required. The relative name of the root asset. It can only be an
    organization number (such as
     *        "organizations/123"), a project ID (such as
    "projects/my-project-id")", or a project
     *        number (such as "projects/12345").
       * @since 1.13
       */
      protected BatchGetAssetsHistory(java.lang.String parent) {
        super(CloudAsset.this, "GET", REST_PATH, null, com.google.api.services.cloudasset.v1.model.BatchGetAssetsHistoryResponse.class);
        this.parent = com.google.api.client.util.Preconditions.checkNotNull(parent, "Required parameter parent must be specified.");
        if (!getSuppressPatternChecks()) {
          com.google.api.client.util.Preconditions.checkArgument(PARENT_PATTERN.matcher(parent).matches(),
              "Parameter parent must conform to the pattern " +
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
      public BatchGetAssetsHistory set$Xgafv(java.lang.String $Xgafv) {
        return (BatchGetAssetsHistory) super.set$Xgafv($Xgafv);
      }

      @Override
      public BatchGetAssetsHistory setAccessToken(java.lang.String accessToken) {
        return (BatchGetAssetsHistory) super.setAccessToken(accessToken);
      }

      @Override
      public BatchGetAssetsHistory setAlt(java.lang.String alt) {
        return (BatchGetAssetsHistory) super.setAlt(alt);
      }

      @Override
      public BatchGetAssetsHistory setCallback(java.lang.String callback) {
        return (BatchGetAssetsHistory) super.setCallback(callback);
      }

      @Override
      public BatchGetAssetsHistory setFields(java.lang.String fields) {
        return (BatchGetAssetsHistory) super.setFields(fields);
      }

      @Override
      public BatchGetAssetsHistory setKey(java.lang.String key) {
        return (BatchGetAssetsHistory) super.setKey(key);
      }

      @Override
      public BatchGetAssetsHistory setOauthToken(java.lang.String oauthToken) {
        return (BatchGetAssetsHistory) super.setOauthToken(oauthToken);
      }

      @Override
      public BatchGetAssetsHistory setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (BatchGetAssetsHistory) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public BatchGetAssetsHistory setQuotaUser(java.lang.String quotaUser) {
        return (BatchGetAssetsHistory) super.setQuotaUser(quotaUser);
      }

      @Override
      public BatchGetAssetsHistory setUploadType(java.lang.String uploadType) {
        return (BatchGetAssetsHistory) super.setUploadType(uploadType);
      }

      @Override
      public BatchGetAssetsHistory setUploadProtocol(java.lang.String uploadProtocol) {
        return (BatchGetAssetsHistory) super.setUploadProtocol(uploadProtocol);
      }

      /**
       * Required. The relative name of the root asset. It can only be an organization number (such
       * as "organizations/123"), a project ID (such as "projects/my-project-id")", or a project
       * number (such as "projects/12345").
       */
      @com.google.api.client.util.Key
      private java.lang.String parent;

      /** Required. The relative name of the root asset. It can only be an organization number (such as
     "organizations/123"), a project ID (such as "projects/my-project-id")", or a project number (such
     as "projects/12345").
       */
      public java.lang.String getParent() {
        return parent;
      }

      /**
       * Required. The relative name of the root asset. It can only be an organization number (such
       * as "organizations/123"), a project ID (such as "projects/my-project-id")", or a project
       * number (such as "projects/12345").
       */
      public BatchGetAssetsHistory setParent(java.lang.String parent) {
        if (!getSuppressPatternChecks()) {
          com.google.api.client.util.Preconditions.checkArgument(PARENT_PATTERN.matcher(parent).matches(),
              "Parameter parent must conform to the pattern " +
              "^[^/]+/[^/]+$");
        }
        this.parent = parent;
        return this;
      }

      /**
       * A list of the full names of the assets. For example:
       * `//compute.googleapis.com/projects/my_project_123/zones/zone1/instances/instance1`. See
       * [Resource Names](https://cloud.google.com/apis/design/resource_names#full_resource_name)
       * and [Resource Name Format](https://cloud.google.com/resource-manager/docs/cloud-asset-
       * inventory/resource-name-format) for more info.
       *
       * The request becomes a no-op if the asset name list is empty, and the max size of the asset
       * name list is 100 in one request.
       */
      @com.google.api.client.util.Key
      private java.util.List<java.lang.String> assetNames;

      /** A list of the full names of the assets. For example:
     `//compute.googleapis.com/projects/my_project_123/zones/zone1/instances/instance1`. See [Resource
     Names](https://cloud.google.com/apis/design/resource_names#full_resource_name) and [Resource Name
     Format](https://cloud.google.com/resource-manager/docs/cloud-asset-inventory/resource-name-format)
     for more info.

     The request becomes a no-op if the asset name list is empty, and the max size of the asset name
     list is 100 in one request.
       */
      public java.util.List<java.lang.String> getAssetNames() {
        return assetNames;
      }

      /**
       * A list of the full names of the assets. For example:
       * `//compute.googleapis.com/projects/my_project_123/zones/zone1/instances/instance1`. See
       * [Resource Names](https://cloud.google.com/apis/design/resource_names#full_resource_name)
       * and [Resource Name Format](https://cloud.google.com/resource-manager/docs/cloud-asset-
       * inventory/resource-name-format) for more info.
       *
       * The request becomes a no-op if the asset name list is empty, and the max size of the asset
       * name list is 100 in one request.
       */
      public BatchGetAssetsHistory setAssetNames(java.util.List<java.lang.String> assetNames) {
        this.assetNames = assetNames;
        return this;
      }

      /** Required. The content type. */
      @com.google.api.client.util.Key
      private java.lang.String contentType;

      /** Required. The content type.
       */
      public java.lang.String getContentType() {
        return contentType;
      }

      /** Required. The content type. */
      public BatchGetAssetsHistory setContentType(java.lang.String contentType) {
        this.contentType = contentType;
        return this;
      }

      /**
       * End time of the time window (inclusive). Current timestamp if not specified.
       */
      @com.google.api.client.util.Key("readTimeWindow.endTime")
      private String readTimeWindowEndTime;

      /** End time of the time window (inclusive). Current timestamp if not specified.
       */
      public String getReadTimeWindowEndTime() {
        return readTimeWindowEndTime;
      }

      /**
       * End time of the time window (inclusive). Current timestamp if not specified.
       */
      public BatchGetAssetsHistory setReadTimeWindowEndTime(String readTimeWindowEndTime) {
        this.readTimeWindowEndTime = readTimeWindowEndTime;
        return this;
      }

      /** Start time of the time window (exclusive). */
      @com.google.api.client.util.Key("readTimeWindow.startTime")
      private String readTimeWindowStartTime;

      /** Start time of the time window (exclusive).
       */
      public String getReadTimeWindowStartTime() {
        return readTimeWindowStartTime;
      }

      /** Start time of the time window (exclusive). */
      public BatchGetAssetsHistory setReadTimeWindowStartTime(String readTimeWindowStartTime) {
        this.readTimeWindowStartTime = readTimeWindowStartTime;
        return this;
      }

      @Override
      public BatchGetAssetsHistory set(String parameterName, Object value) {
        return (BatchGetAssetsHistory) super.set(parameterName, value);
      }
    }
    /**
     * Exports assets with time and resource types to a given Cloud Storage location. The output format
     * is newline-delimited JSON. This API implements the google.longrunning.Operation API allowing you
     * to keep track of the export.
     *
     * Create a request for the method "v1.exportAssets".
     *
     * This request holds the parameters needed by the cloudasset server.  After setting any optional
     * parameters, call the {@link ExportAssets#execute()} method to invoke the remote operation.
     *
     * @param parent Required. The relative name of the root asset. This can only be an
    organization number (such as
     *        "organizations/123"), a project ID (such as
    "projects/my-project-id"), or a project number
     *        (such as "projects/12345"),
    or a folder number (such as "folders/123").
     * @param content the {@link com.google.api.services.cloudasset.v1.model.ExportAssetsRequest}
     * @return the request
     */
    public ExportAssets exportAssets(java.lang.String parent, com.google.api.services.cloudasset.v1.model.ExportAssetsRequest content) throws java.io.IOException {
      ExportAssets result = new ExportAssets(parent, content);
      initialize(result);
      return result;
    }

    public class ExportAssets extends CloudAssetRequest<com.google.api.services.cloudasset.v1.model.Operation> {

      private static final String REST_PATH = "v1/{+parent}:exportAssets";

      private final java.util.regex.Pattern PARENT_PATTERN =
          java.util.regex.Pattern.compile("^[^/]+/[^/]+$");

      /**
       * Exports assets with time and resource types to a given Cloud Storage location. The output
       * format is newline-delimited JSON. This API implements the google.longrunning.Operation API
       * allowing you to keep track of the export.
       *
       * Create a request for the method "v1.exportAssets".
       *
       * This request holds the parameters needed by the the cloudasset server.  After setting any
       * optional parameters, call the {@link ExportAssets#execute()} method to invoke the remote
       * operation. <p> {@link
       * ExportAssets#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
       * must be called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @param parent Required. The relative name of the root asset. This can only be an
    organization number (such as
     *        "organizations/123"), a project ID (such as
    "projects/my-project-id"), or a project number
     *        (such as "projects/12345"),
    or a folder number (such as "folders/123").
       * @param content the {@link com.google.api.services.cloudasset.v1.model.ExportAssetsRequest}
       * @since 1.13
       */
      protected ExportAssets(java.lang.String parent, com.google.api.services.cloudasset.v1.model.ExportAssetsRequest content) {
        super(CloudAsset.this, "POST", REST_PATH, content, com.google.api.services.cloudasset.v1.model.Operation.class);
        this.parent = com.google.api.client.util.Preconditions.checkNotNull(parent, "Required parameter parent must be specified.");
        if (!getSuppressPatternChecks()) {
          com.google.api.client.util.Preconditions.checkArgument(PARENT_PATTERN.matcher(parent).matches(),
              "Parameter parent must conform to the pattern " +
              "^[^/]+/[^/]+$");
        }
      }

      @Override
      public ExportAssets set$Xgafv(java.lang.String $Xgafv) {
        return (ExportAssets) super.set$Xgafv($Xgafv);
      }

      @Override
      public ExportAssets setAccessToken(java.lang.String accessToken) {
        return (ExportAssets) super.setAccessToken(accessToken);
      }

      @Override
      public ExportAssets setAlt(java.lang.String alt) {
        return (ExportAssets) super.setAlt(alt);
      }

      @Override
      public ExportAssets setCallback(java.lang.String callback) {
        return (ExportAssets) super.setCallback(callback);
      }

      @Override
      public ExportAssets setFields(java.lang.String fields) {
        return (ExportAssets) super.setFields(fields);
      }

      @Override
      public ExportAssets setKey(java.lang.String key) {
        return (ExportAssets) super.setKey(key);
      }

      @Override
      public ExportAssets setOauthToken(java.lang.String oauthToken) {
        return (ExportAssets) super.setOauthToken(oauthToken);
      }

      @Override
      public ExportAssets setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (ExportAssets) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public ExportAssets setQuotaUser(java.lang.String quotaUser) {
        return (ExportAssets) super.setQuotaUser(quotaUser);
      }

      @Override
      public ExportAssets setUploadType(java.lang.String uploadType) {
        return (ExportAssets) super.setUploadType(uploadType);
      }

      @Override
      public ExportAssets setUploadProtocol(java.lang.String uploadProtocol) {
        return (ExportAssets) super.setUploadProtocol(uploadProtocol);
      }

      /**
       * Required. The relative name of the root asset. This can only be an organization number
       * (such as "organizations/123"), a project ID (such as "projects/my-project-id"), or a
       * project number (such as "projects/12345"), or a folder number (such as "folders/123").
       */
      @com.google.api.client.util.Key
      private java.lang.String parent;

      /** Required. The relative name of the root asset. This can only be an organization number (such as
     "organizations/123"), a project ID (such as "projects/my-project-id"), or a project number (such as
     "projects/12345"), or a folder number (such as "folders/123").
       */
      public java.lang.String getParent() {
        return parent;
      }

      /**
       * Required. The relative name of the root asset. This can only be an organization number
       * (such as "organizations/123"), a project ID (such as "projects/my-project-id"), or a
       * project number (such as "projects/12345"), or a folder number (such as "folders/123").
       */
      public ExportAssets setParent(java.lang.String parent) {
        if (!getSuppressPatternChecks()) {
          com.google.api.client.util.Preconditions.checkArgument(PARENT_PATTERN.matcher(parent).matches(),
              "Parameter parent must conform to the pattern " +
              "^[^/]+/[^/]+$");
        }
        this.parent = parent;
        return this;
      }

      @Override
      public ExportAssets set(String parameterName, Object value) {
        return (ExportAssets) super.set(parameterName, value);
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
          DEFAULT_ROOT_URL,
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
