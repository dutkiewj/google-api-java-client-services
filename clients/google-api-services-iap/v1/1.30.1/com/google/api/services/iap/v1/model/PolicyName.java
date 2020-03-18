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

package com.google.api.services.iap.v1.model;

/**
 * Model definition for PolicyName.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Identity-Aware Proxy API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PolicyName extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * For Cloud IAM: The location of the Policy. Must be empty or "global" for Policies owned by
   * global IAM.  Must name a region from prodspec/cloud-iam-cloudspec for Regional IAM Policies,
   * see http://go/iam-faq#where-is-iam-currently-deployed.
   *
   * For Local IAM: This field should be set to "local".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String region;

  /**
   * Valid values for type might be 'gce', 'gcs', 'project', 'account' etc.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * @param id id or {@code null} for none
   */
  public PolicyName setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * For Cloud IAM: The location of the Policy. Must be empty or "global" for Policies owned by
   * global IAM.  Must name a region from prodspec/cloud-iam-cloudspec for Regional IAM Policies,
   * see http://go/iam-faq#where-is-iam-currently-deployed.
   *
   * For Local IAM: This field should be set to "local".
   * @return value or {@code null} for none
   */
  public java.lang.String getRegion() {
    return region;
  }

  /**
   * For Cloud IAM: The location of the Policy. Must be empty or "global" for Policies owned by
   * global IAM.  Must name a region from prodspec/cloud-iam-cloudspec for Regional IAM Policies,
   * see http://go/iam-faq#where-is-iam-currently-deployed.
   *
   * For Local IAM: This field should be set to "local".
   * @param region region or {@code null} for none
   */
  public PolicyName setRegion(java.lang.String region) {
    this.region = region;
    return this;
  }

  /**
   * Valid values for type might be 'gce', 'gcs', 'project', 'account' etc.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * Valid values for type might be 'gce', 'gcs', 'project', 'account' etc.
   * @param type type or {@code null} for none
   */
  public PolicyName setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  @Override
  public PolicyName set(String fieldName, Object value) {
    return (PolicyName) super.set(fieldName, value);
  }

  @Override
  public PolicyName clone() {
    return (PolicyName) super.clone();
  }

}