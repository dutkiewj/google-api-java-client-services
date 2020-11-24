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

package com.google.api.services.recommender.v1.model;

/**
 * Reference to an associated insight.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Recommender API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudRecommenderV1RecommendationInsightReference extends com.google.api.client.json.GenericJson {

  /**
   * Insight resource name, e.g. projects/[PROJECT_NUMBER]/locations/[LOCATION]/insightTypes/[INSIGH
   * T_TYPE_ID]/insights/[INSIGHT_ID]
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String insight;

  /**
   * Insight resource name, e.g. projects/[PROJECT_NUMBER]/locations/[LOCATION]/insightTypes/[INSIGH
   * T_TYPE_ID]/insights/[INSIGHT_ID]
   * @return value or {@code null} for none
   */
  public java.lang.String getInsight() {
    return insight;
  }

  /**
   * Insight resource name, e.g. projects/[PROJECT_NUMBER]/locations/[LOCATION]/insightTypes/[INSIGH
   * T_TYPE_ID]/insights/[INSIGHT_ID]
   * @param insight insight or {@code null} for none
   */
  public GoogleCloudRecommenderV1RecommendationInsightReference setInsight(java.lang.String insight) {
    this.insight = insight;
    return this;
  }

  @Override
  public GoogleCloudRecommenderV1RecommendationInsightReference set(String fieldName, Object value) {
    return (GoogleCloudRecommenderV1RecommendationInsightReference) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudRecommenderV1RecommendationInsightReference clone() {
    return (GoogleCloudRecommenderV1RecommendationInsightReference) super.clone();
  }

}
