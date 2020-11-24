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

package com.google.api.services.fitness.model;

/**
 * Model definition for DataType.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Fitness API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DataType extends com.google.api.client.json.GenericJson {

  /**
   * A field represents one dimension of a data type.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<DataTypeField> field;

  /**
   * Each data type has a unique, namespaced, name. All data types in the com.google namespace are
   * shared as part of the platform.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * A field represents one dimension of a data type.
   * @return value or {@code null} for none
   */
  public java.util.List<DataTypeField> getField() {
    return field;
  }

  /**
   * A field represents one dimension of a data type.
   * @param field field or {@code null} for none
   */
  public DataType setField(java.util.List<DataTypeField> field) {
    this.field = field;
    return this;
  }

  /**
   * Each data type has a unique, namespaced, name. All data types in the com.google namespace are
   * shared as part of the platform.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Each data type has a unique, namespaced, name. All data types in the com.google namespace are
   * shared as part of the platform.
   * @param name name or {@code null} for none
   */
  public DataType setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  @Override
  public DataType set(String fieldName, Object value) {
    return (DataType) super.set(fieldName, value);
  }

  @Override
  public DataType clone() {
    return (DataType) super.clone();
  }

}
