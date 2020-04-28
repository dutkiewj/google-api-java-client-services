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
 * Creative requirements configuration for the inventory source.
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
public final class CreativeConfig extends com.google.api.client.json.GenericJson {

  /**
   * The type of creative that can be assigned to the inventory source.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String creativeType;

  /**
   * The configuration for display creatives. Applicable when creative_type is
   * `CREATIVE_TYPE_STANDARD`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private InventorySourceDisplayCreativeConfig displayCreativeConfig;

  /**
   * The configuration for video creatives. Applicable when creative_type is `CREATIVE_TYPE_VIDEO`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private InventorySourceVideoCreativeConfig videoCreativeConfig;

  /**
   * The type of creative that can be assigned to the inventory source.
   * @return value or {@code null} for none
   */
  public java.lang.String getCreativeType() {
    return creativeType;
  }

  /**
   * The type of creative that can be assigned to the inventory source.
   * @param creativeType creativeType or {@code null} for none
   */
  public CreativeConfig setCreativeType(java.lang.String creativeType) {
    this.creativeType = creativeType;
    return this;
  }

  /**
   * The configuration for display creatives. Applicable when creative_type is
   * `CREATIVE_TYPE_STANDARD`.
   * @return value or {@code null} for none
   */
  public InventorySourceDisplayCreativeConfig getDisplayCreativeConfig() {
    return displayCreativeConfig;
  }

  /**
   * The configuration for display creatives. Applicable when creative_type is
   * `CREATIVE_TYPE_STANDARD`.
   * @param displayCreativeConfig displayCreativeConfig or {@code null} for none
   */
  public CreativeConfig setDisplayCreativeConfig(InventorySourceDisplayCreativeConfig displayCreativeConfig) {
    this.displayCreativeConfig = displayCreativeConfig;
    return this;
  }

  /**
   * The configuration for video creatives. Applicable when creative_type is `CREATIVE_TYPE_VIDEO`.
   * @return value or {@code null} for none
   */
  public InventorySourceVideoCreativeConfig getVideoCreativeConfig() {
    return videoCreativeConfig;
  }

  /**
   * The configuration for video creatives. Applicable when creative_type is `CREATIVE_TYPE_VIDEO`.
   * @param videoCreativeConfig videoCreativeConfig or {@code null} for none
   */
  public CreativeConfig setVideoCreativeConfig(InventorySourceVideoCreativeConfig videoCreativeConfig) {
    this.videoCreativeConfig = videoCreativeConfig;
    return this;
  }

  @Override
  public CreativeConfig set(String fieldName, Object value) {
    return (CreativeConfig) super.set(fieldName, value);
  }

  @Override
  public CreativeConfig clone() {
    return (CreativeConfig) super.clone();
  }

}