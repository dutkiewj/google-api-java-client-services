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

package com.google.api.services.displayvideo.v1.model;

/**
 * Describes a first or third party audience list used for targeting. First party audiences are
 * created via usage of client data. Third party audiences are provided by Third Party data
 * providers and can only be licensed to customers.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Display & Video 360 API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class FirstAndThirdPartyAudience extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The display name of the first and third party audience. .
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * Output only. The unique ID of the first and third party audience. Assigned by the system.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long firstAndThirdPartyAudienceId;

  /**
   * Output only. Whether the audience is a first or third party audience. .
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String firstAndThirdPartyAudienceType;

  /**
   * Output only. The resource name of the first and third party audience.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. The display name of the first and third party audience. .
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * Output only. The display name of the first and third party audience. .
   * @param displayName displayName or {@code null} for none
   */
  public FirstAndThirdPartyAudience setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Output only. The unique ID of the first and third party audience. Assigned by the system.
   * @return value or {@code null} for none
   */
  public java.lang.Long getFirstAndThirdPartyAudienceId() {
    return firstAndThirdPartyAudienceId;
  }

  /**
   * Output only. The unique ID of the first and third party audience. Assigned by the system.
   * @param firstAndThirdPartyAudienceId firstAndThirdPartyAudienceId or {@code null} for none
   */
  public FirstAndThirdPartyAudience setFirstAndThirdPartyAudienceId(java.lang.Long firstAndThirdPartyAudienceId) {
    this.firstAndThirdPartyAudienceId = firstAndThirdPartyAudienceId;
    return this;
  }

  /**
   * Output only. Whether the audience is a first or third party audience. .
   * @return value or {@code null} for none
   */
  public java.lang.String getFirstAndThirdPartyAudienceType() {
    return firstAndThirdPartyAudienceType;
  }

  /**
   * Output only. Whether the audience is a first or third party audience. .
   * @param firstAndThirdPartyAudienceType firstAndThirdPartyAudienceType or {@code null} for none
   */
  public FirstAndThirdPartyAudience setFirstAndThirdPartyAudienceType(java.lang.String firstAndThirdPartyAudienceType) {
    this.firstAndThirdPartyAudienceType = firstAndThirdPartyAudienceType;
    return this;
  }

  /**
   * Output only. The resource name of the first and third party audience.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. The resource name of the first and third party audience.
   * @param name name or {@code null} for none
   */
  public FirstAndThirdPartyAudience setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  @Override
  public FirstAndThirdPartyAudience set(String fieldName, Object value) {
    return (FirstAndThirdPartyAudience) super.set(fieldName, value);
  }

  @Override
  public FirstAndThirdPartyAudience clone() {
    return (FirstAndThirdPartyAudience) super.clone();
  }

}