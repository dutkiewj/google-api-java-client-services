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
 * Model definition for ListDataSourcesResponse.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Fitness API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ListDataSourcesResponse extends com.google.api.client.json.GenericJson {

  /**
   * A previously created data source.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<DataSource> dataSource;

  static {
    // hack to force ProGuard to consider DataSource used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(DataSource.class);
  }

  /**
   * A previously created data source.
   * @return value or {@code null} for none
   */
  public java.util.List<DataSource> getDataSource() {
    return dataSource;
  }

  /**
   * A previously created data source.
   * @param dataSource dataSource or {@code null} for none
   */
  public ListDataSourcesResponse setDataSource(java.util.List<DataSource> dataSource) {
    this.dataSource = dataSource;
    return this;
  }

  @Override
  public ListDataSourcesResponse set(String fieldName, Object value) {
    return (ListDataSourcesResponse) super.set(fieldName, value);
  }

  @Override
  public ListDataSourcesResponse clone() {
    return (ListDataSourcesResponse) super.clone();
  }

}
