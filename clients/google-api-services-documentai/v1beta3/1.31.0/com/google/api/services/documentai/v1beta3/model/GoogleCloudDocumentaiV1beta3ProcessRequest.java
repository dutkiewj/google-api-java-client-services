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

package com.google.api.services.documentai.v1beta3.model;

/**
 * Request message for the process document method.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Document AI API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDocumentaiV1beta3ProcessRequest extends com.google.api.client.json.GenericJson {

  /**
   * The document payload, the [content] and [mime_type] fields must be set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDocumentaiV1beta3Document document;

  /**
   * An inline document proto.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDocumentaiV1beta3Document inlineDocument;

  /**
   * A raw document content (bytes).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDocumentaiV1beta3RawDocument rawDocument;

  /**
   * Whether Human Review feature should be skipped for this request. Default to false.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean skipHumanReview;

  /**
   * The document payload, the [content] and [mime_type] fields must be set.
   * @return value or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta3Document getDocument() {
    return document;
  }

  /**
   * The document payload, the [content] and [mime_type] fields must be set.
   * @param document document or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta3ProcessRequest setDocument(GoogleCloudDocumentaiV1beta3Document document) {
    this.document = document;
    return this;
  }

  /**
   * An inline document proto.
   * @return value or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta3Document getInlineDocument() {
    return inlineDocument;
  }

  /**
   * An inline document proto.
   * @param inlineDocument inlineDocument or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta3ProcessRequest setInlineDocument(GoogleCloudDocumentaiV1beta3Document inlineDocument) {
    this.inlineDocument = inlineDocument;
    return this;
  }

  /**
   * A raw document content (bytes).
   * @return value or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta3RawDocument getRawDocument() {
    return rawDocument;
  }

  /**
   * A raw document content (bytes).
   * @param rawDocument rawDocument or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta3ProcessRequest setRawDocument(GoogleCloudDocumentaiV1beta3RawDocument rawDocument) {
    this.rawDocument = rawDocument;
    return this;
  }

  /**
   * Whether Human Review feature should be skipped for this request. Default to false.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getSkipHumanReview() {
    return skipHumanReview;
  }

  /**
   * Whether Human Review feature should be skipped for this request. Default to false.
   * @param skipHumanReview skipHumanReview or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta3ProcessRequest setSkipHumanReview(java.lang.Boolean skipHumanReview) {
    this.skipHumanReview = skipHumanReview;
    return this;
  }

  @Override
  public GoogleCloudDocumentaiV1beta3ProcessRequest set(String fieldName, Object value) {
    return (GoogleCloudDocumentaiV1beta3ProcessRequest) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDocumentaiV1beta3ProcessRequest clone() {
    return (GoogleCloudDocumentaiV1beta3ProcessRequest) super.clone();
  }

}
