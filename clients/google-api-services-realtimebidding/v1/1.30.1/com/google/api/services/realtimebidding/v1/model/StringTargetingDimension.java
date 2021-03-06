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

package com.google.api.services.realtimebidding.v1.model;

/**
 * Generic targeting with string values used in app, website and publisher targeting.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Real-time Bidding API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class StringTargetingDimension extends com.google.api.client.json.GenericJson {

  /**
   * How the items in this list should be targeted.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String targetingMode;

  /**
   * The values specified.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> values;

  /**
   * How the items in this list should be targeted.
   * @return value or {@code null} for none
   */
  public java.lang.String getTargetingMode() {
    return targetingMode;
  }

  /**
   * How the items in this list should be targeted.
   * @param targetingMode targetingMode or {@code null} for none
   */
  public StringTargetingDimension setTargetingMode(java.lang.String targetingMode) {
    this.targetingMode = targetingMode;
    return this;
  }

  /**
   * The values specified.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getValues() {
    return values;
  }

  /**
   * The values specified.
   * @param values values or {@code null} for none
   */
  public StringTargetingDimension setValues(java.util.List<java.lang.String> values) {
    this.values = values;
    return this;
  }

  @Override
  public StringTargetingDimension set(String fieldName, Object value) {
    return (StringTargetingDimension) super.set(fieldName, value);
  }

  @Override
  public StringTargetingDimension clone() {
    return (StringTargetingDimension) super.clone();
  }

}
