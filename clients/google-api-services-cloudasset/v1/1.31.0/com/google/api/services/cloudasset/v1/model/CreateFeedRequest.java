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

package com.google.api.services.cloudasset.v1.model;

/**
 * Create asset feed request.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Asset API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CreateFeedRequest extends com.google.api.client.json.GenericJson {

  /**
   * Required. The feed details. The field `name` must be empty and it will be generated in the
   * format of: projects/project_number/feeds/feed_id folders/folder_number/feeds/feed_id
   * organizations/organization_number/feeds/feed_id
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Feed feed;

  /**
   * Required. This is the client-assigned asset feed identifier and it needs to be unique under a
   * specific parent project/folder/organization.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String feedId;

  /**
   * Required. The feed details. The field `name` must be empty and it will be generated in the
   * format of: projects/project_number/feeds/feed_id folders/folder_number/feeds/feed_id
   * organizations/organization_number/feeds/feed_id
   * @return value or {@code null} for none
   */
  public Feed getFeed() {
    return feed;
  }

  /**
   * Required. The feed details. The field `name` must be empty and it will be generated in the
   * format of: projects/project_number/feeds/feed_id folders/folder_number/feeds/feed_id
   * organizations/organization_number/feeds/feed_id
   * @param feed feed or {@code null} for none
   */
  public CreateFeedRequest setFeed(Feed feed) {
    this.feed = feed;
    return this;
  }

  /**
   * Required. This is the client-assigned asset feed identifier and it needs to be unique under a
   * specific parent project/folder/organization.
   * @return value or {@code null} for none
   */
  public java.lang.String getFeedId() {
    return feedId;
  }

  /**
   * Required. This is the client-assigned asset feed identifier and it needs to be unique under a
   * specific parent project/folder/organization.
   * @param feedId feedId or {@code null} for none
   */
  public CreateFeedRequest setFeedId(java.lang.String feedId) {
    this.feedId = feedId;
    return this;
  }

  @Override
  public CreateFeedRequest set(String fieldName, Object value) {
    return (CreateFeedRequest) super.set(fieldName, value);
  }

  @Override
  public CreateFeedRequest clone() {
    return (CreateFeedRequest) super.clone();
  }

}
