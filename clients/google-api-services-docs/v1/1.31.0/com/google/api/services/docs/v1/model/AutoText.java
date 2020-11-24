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

package com.google.api.services.docs.v1.model;

/**
 * A ParagraphElement representing a spot in the text that is dynamically replaced with content that
 * can change over time, like a page number.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Docs API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AutoText extends com.google.api.client.json.GenericJson {

  /**
   * The suggested deletion IDs. If empty, then there are no suggested deletions of this content.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> suggestedDeletionIds;

  /**
   * The suggested insertion IDs. An AutoText may have multiple insertion IDs if it is a nested
   * suggested change. If empty, then this is not a suggested insertion.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> suggestedInsertionIds;

  /**
   * The suggested text style changes to this AutoText, keyed by suggestion ID.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, SuggestedTextStyle> suggestedTextStyleChanges;

  /**
   * The text style of this AutoText.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TextStyle textStyle;

  /**
   * The type of this auto text.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * The suggested deletion IDs. If empty, then there are no suggested deletions of this content.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getSuggestedDeletionIds() {
    return suggestedDeletionIds;
  }

  /**
   * The suggested deletion IDs. If empty, then there are no suggested deletions of this content.
   * @param suggestedDeletionIds suggestedDeletionIds or {@code null} for none
   */
  public AutoText setSuggestedDeletionIds(java.util.List<java.lang.String> suggestedDeletionIds) {
    this.suggestedDeletionIds = suggestedDeletionIds;
    return this;
  }

  /**
   * The suggested insertion IDs. An AutoText may have multiple insertion IDs if it is a nested
   * suggested change. If empty, then this is not a suggested insertion.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getSuggestedInsertionIds() {
    return suggestedInsertionIds;
  }

  /**
   * The suggested insertion IDs. An AutoText may have multiple insertion IDs if it is a nested
   * suggested change. If empty, then this is not a suggested insertion.
   * @param suggestedInsertionIds suggestedInsertionIds or {@code null} for none
   */
  public AutoText setSuggestedInsertionIds(java.util.List<java.lang.String> suggestedInsertionIds) {
    this.suggestedInsertionIds = suggestedInsertionIds;
    return this;
  }

  /**
   * The suggested text style changes to this AutoText, keyed by suggestion ID.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, SuggestedTextStyle> getSuggestedTextStyleChanges() {
    return suggestedTextStyleChanges;
  }

  /**
   * The suggested text style changes to this AutoText, keyed by suggestion ID.
   * @param suggestedTextStyleChanges suggestedTextStyleChanges or {@code null} for none
   */
  public AutoText setSuggestedTextStyleChanges(java.util.Map<String, SuggestedTextStyle> suggestedTextStyleChanges) {
    this.suggestedTextStyleChanges = suggestedTextStyleChanges;
    return this;
  }

  /**
   * The text style of this AutoText.
   * @return value or {@code null} for none
   */
  public TextStyle getTextStyle() {
    return textStyle;
  }

  /**
   * The text style of this AutoText.
   * @param textStyle textStyle or {@code null} for none
   */
  public AutoText setTextStyle(TextStyle textStyle) {
    this.textStyle = textStyle;
    return this;
  }

  /**
   * The type of this auto text.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * The type of this auto text.
   * @param type type or {@code null} for none
   */
  public AutoText setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  @Override
  public AutoText set(String fieldName, Object value) {
    return (AutoText) super.set(fieldName, value);
  }

  @Override
  public AutoText clone() {
    return (AutoText) super.clone();
  }

}
