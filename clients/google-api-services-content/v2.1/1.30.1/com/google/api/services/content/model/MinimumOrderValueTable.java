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
 * Model definition for MinimumOrderValueTable.
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
public final class MinimumOrderValueTable extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<MinimumOrderValueTableStoreCodeSetWithMov> storeCodeSetWithMovs;

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<MinimumOrderValueTableStoreCodeSetWithMov> getStoreCodeSetWithMovs() {
    return storeCodeSetWithMovs;
  }

  /**
   * @param storeCodeSetWithMovs storeCodeSetWithMovs or {@code null} for none
   */
  public MinimumOrderValueTable setStoreCodeSetWithMovs(java.util.List<MinimumOrderValueTableStoreCodeSetWithMov> storeCodeSetWithMovs) {
    this.storeCodeSetWithMovs = storeCodeSetWithMovs;
    return this;
  }

  @Override
  public MinimumOrderValueTable set(String fieldName, Object value) {
    return (MinimumOrderValueTable) super.set(fieldName, value);
  }

  @Override
  public MinimumOrderValueTable clone() {
    return (MinimumOrderValueTable) super.clone();
  }

}