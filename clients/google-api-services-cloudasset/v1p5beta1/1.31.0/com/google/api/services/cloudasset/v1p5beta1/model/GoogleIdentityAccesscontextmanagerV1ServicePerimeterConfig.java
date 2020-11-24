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

package com.google.api.services.cloudasset.v1p5beta1.model;

/**
 * `ServicePerimeterConfig` specifies a set of Google Cloud resources that describe specific Service
 * Perimeter configuration.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Asset API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleIdentityAccesscontextmanagerV1ServicePerimeterConfig extends com.google.api.client.json.GenericJson {

  /**
   * A list of `AccessLevel` resource names that allow resources within the `ServicePerimeter` to be
   * accessed from the internet. `AccessLevels` listed must be in the same policy as this
   * `ServicePerimeter`. Referencing a nonexistent `AccessLevel` is a syntax error. If no
   * `AccessLevel` names are listed, resources within the perimeter can only be accessed via Google
   * Cloud calls with request origins within the perimeter. Example:
   * `"accessPolicies/MY_POLICY/accessLevels/MY_LEVEL"`. For Service Perimeter Bridge, must be
   * empty.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> accessLevels;

  /**
   * A list of Google Cloud resources that are inside of the service perimeter. Currently only
   * projects are allowed. Format: `projects/{project_number}`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> resources;

  /**
   * Google Cloud services that are subject to the Service Perimeter restrictions. For example, if
   * `storage.googleapis.com` is specified, access to the storage buckets inside the perimeter must
   * meet the perimeter's access restrictions.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> restrictedServices;

  /**
   * Configuration for APIs allowed within Perimeter.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleIdentityAccesscontextmanagerV1VpcAccessibleServices vpcAccessibleServices;

  /**
   * A list of `AccessLevel` resource names that allow resources within the `ServicePerimeter` to be
   * accessed from the internet. `AccessLevels` listed must be in the same policy as this
   * `ServicePerimeter`. Referencing a nonexistent `AccessLevel` is a syntax error. If no
   * `AccessLevel` names are listed, resources within the perimeter can only be accessed via Google
   * Cloud calls with request origins within the perimeter. Example:
   * `"accessPolicies/MY_POLICY/accessLevels/MY_LEVEL"`. For Service Perimeter Bridge, must be
   * empty.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getAccessLevels() {
    return accessLevels;
  }

  /**
   * A list of `AccessLevel` resource names that allow resources within the `ServicePerimeter` to be
   * accessed from the internet. `AccessLevels` listed must be in the same policy as this
   * `ServicePerimeter`. Referencing a nonexistent `AccessLevel` is a syntax error. If no
   * `AccessLevel` names are listed, resources within the perimeter can only be accessed via Google
   * Cloud calls with request origins within the perimeter. Example:
   * `"accessPolicies/MY_POLICY/accessLevels/MY_LEVEL"`. For Service Perimeter Bridge, must be
   * empty.
   * @param accessLevels accessLevels or {@code null} for none
   */
  public GoogleIdentityAccesscontextmanagerV1ServicePerimeterConfig setAccessLevels(java.util.List<java.lang.String> accessLevels) {
    this.accessLevels = accessLevels;
    return this;
  }

  /**
   * A list of Google Cloud resources that are inside of the service perimeter. Currently only
   * projects are allowed. Format: `projects/{project_number}`
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getResources() {
    return resources;
  }

  /**
   * A list of Google Cloud resources that are inside of the service perimeter. Currently only
   * projects are allowed. Format: `projects/{project_number}`
   * @param resources resources or {@code null} for none
   */
  public GoogleIdentityAccesscontextmanagerV1ServicePerimeterConfig setResources(java.util.List<java.lang.String> resources) {
    this.resources = resources;
    return this;
  }

  /**
   * Google Cloud services that are subject to the Service Perimeter restrictions. For example, if
   * `storage.googleapis.com` is specified, access to the storage buckets inside the perimeter must
   * meet the perimeter's access restrictions.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getRestrictedServices() {
    return restrictedServices;
  }

  /**
   * Google Cloud services that are subject to the Service Perimeter restrictions. For example, if
   * `storage.googleapis.com` is specified, access to the storage buckets inside the perimeter must
   * meet the perimeter's access restrictions.
   * @param restrictedServices restrictedServices or {@code null} for none
   */
  public GoogleIdentityAccesscontextmanagerV1ServicePerimeterConfig setRestrictedServices(java.util.List<java.lang.String> restrictedServices) {
    this.restrictedServices = restrictedServices;
    return this;
  }

  /**
   * Configuration for APIs allowed within Perimeter.
   * @return value or {@code null} for none
   */
  public GoogleIdentityAccesscontextmanagerV1VpcAccessibleServices getVpcAccessibleServices() {
    return vpcAccessibleServices;
  }

  /**
   * Configuration for APIs allowed within Perimeter.
   * @param vpcAccessibleServices vpcAccessibleServices or {@code null} for none
   */
  public GoogleIdentityAccesscontextmanagerV1ServicePerimeterConfig setVpcAccessibleServices(GoogleIdentityAccesscontextmanagerV1VpcAccessibleServices vpcAccessibleServices) {
    this.vpcAccessibleServices = vpcAccessibleServices;
    return this;
  }

  @Override
  public GoogleIdentityAccesscontextmanagerV1ServicePerimeterConfig set(String fieldName, Object value) {
    return (GoogleIdentityAccesscontextmanagerV1ServicePerimeterConfig) super.set(fieldName, value);
  }

  @Override
  public GoogleIdentityAccesscontextmanagerV1ServicePerimeterConfig clone() {
    return (GoogleIdentityAccesscontextmanagerV1ServicePerimeterConfig) super.clone();
  }

}
