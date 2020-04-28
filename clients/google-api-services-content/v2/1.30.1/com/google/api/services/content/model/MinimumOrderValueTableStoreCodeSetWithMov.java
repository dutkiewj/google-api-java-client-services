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

package com.google.api.services.content.model;

/**
 * A list of store code sets sharing the same minimum order value. At least two sets are required
 * and the last one must be empty, which signifies 'MOV for all other stores'. Each store code can
 * only appear once across all the sets. All prices within a service must have the same currency.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Content API for Shopping. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class MinimumOrderValueTableStoreCodeSetWithMov extends com.google.api.client.json.GenericJson {

  /**
   * A list of unique store codes or empty for the catch all.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> storeCodes;

  /**
   * The minimum order value for the given stores.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Price value;

  /**
   * A list of unique store codes or empty for the catch all.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getStoreCodes() {
    return storeCodes;
  }

  /**
   * A list of unique store codes or empty for the catch all.
   * @param storeCodes storeCodes or {@code null} for none
   */
  public MinimumOrderValueTableStoreCodeSetWithMov setStoreCodes(java.util.List<java.lang.String> storeCodes) {
    this.storeCodes = storeCodes;
    return this;
  }

  /**
   * The minimum order value for the given stores.
   * @return value or {@code null} for none
   */
  public Price getValue() {
    return value;
  }

  /**
   * The minimum order value for the given stores.
   * @param value value or {@code null} for none
   */
  public MinimumOrderValueTableStoreCodeSetWithMov setValue(Price value) {
    this.value = value;
    return this;
  }

  @Override
  public MinimumOrderValueTableStoreCodeSetWithMov set(String fieldName, Object value) {
    return (MinimumOrderValueTableStoreCodeSetWithMov) super.set(fieldName, value);
  }

  @Override
  public MinimumOrderValueTableStoreCodeSetWithMov clone() {
    return (MinimumOrderValueTableStoreCodeSetWithMov) super.clone();
  }

}