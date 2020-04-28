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
 * Details of DoubleVerify star ratings settings.
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
public final class DoubleVerifyAppStarRating extends com.google.api.client.json.GenericJson {

  /**
   * Avoid bidding on apps with insufficient star ratings.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean avoidInsufficientStarRating;

  /**
   * Avoid bidding on apps with the star ratings.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String avoidedStarRating;

  /**
   * Avoid bidding on apps with insufficient star ratings.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getAvoidInsufficientStarRating() {
    return avoidInsufficientStarRating;
  }

  /**
   * Avoid bidding on apps with insufficient star ratings.
   * @param avoidInsufficientStarRating avoidInsufficientStarRating or {@code null} for none
   */
  public DoubleVerifyAppStarRating setAvoidInsufficientStarRating(java.lang.Boolean avoidInsufficientStarRating) {
    this.avoidInsufficientStarRating = avoidInsufficientStarRating;
    return this;
  }

  /**
   * Avoid bidding on apps with the star ratings.
   * @return value or {@code null} for none
   */
  public java.lang.String getAvoidedStarRating() {
    return avoidedStarRating;
  }

  /**
   * Avoid bidding on apps with the star ratings.
   * @param avoidedStarRating avoidedStarRating or {@code null} for none
   */
  public DoubleVerifyAppStarRating setAvoidedStarRating(java.lang.String avoidedStarRating) {
    this.avoidedStarRating = avoidedStarRating;
    return this;
  }

  @Override
  public DoubleVerifyAppStarRating set(String fieldName, Object value) {
    return (DoubleVerifyAppStarRating) super.set(fieldName, value);
  }

  @Override
  public DoubleVerifyAppStarRating clone() {
    return (DoubleVerifyAppStarRating) super.clone();
  }

}