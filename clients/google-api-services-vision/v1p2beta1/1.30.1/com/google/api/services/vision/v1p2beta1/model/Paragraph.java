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

package com.google.api.services.vision.v1p2beta1.model;

/**
 * Structural unit of text representing a number of words in certain order.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Vision API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Paragraph extends com.google.api.client.json.GenericJson {

  /**
   * The bounding box for the paragraph. The vertices are in the order of top-left, top-right,
   * bottom-right, bottom-left. When a rotation of the bounding box is detected the rotation is
   * represented as around the top-left corner as defined when the text is read in the 'natural'
   * orientation. For example: * when the text is horizontal it might look like: 0----1 | | 3----2 *
   * when it's rotated 180 degrees around the top-left corner it becomes: 2----3 | | 1----0 and the
   * vertex order will still be (0, 1, 2, 3).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private BoundingPoly boundingBox;

  /**
   * Confidence of the OCR results for the paragraph. Range [0, 1].
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float confidence;

  /**
   * Additional information detected for the paragraph.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TextProperty property;

  /**
   * List of all words in this paragraph.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Word> words;

  /**
   * The bounding box for the paragraph. The vertices are in the order of top-left, top-right,
   * bottom-right, bottom-left. When a rotation of the bounding box is detected the rotation is
   * represented as around the top-left corner as defined when the text is read in the 'natural'
   * orientation. For example: * when the text is horizontal it might look like: 0----1 | | 3----2 *
   * when it's rotated 180 degrees around the top-left corner it becomes: 2----3 | | 1----0 and the
   * vertex order will still be (0, 1, 2, 3).
   * @return value or {@code null} for none
   */
  public BoundingPoly getBoundingBox() {
    return boundingBox;
  }

  /**
   * The bounding box for the paragraph. The vertices are in the order of top-left, top-right,
   * bottom-right, bottom-left. When a rotation of the bounding box is detected the rotation is
   * represented as around the top-left corner as defined when the text is read in the 'natural'
   * orientation. For example: * when the text is horizontal it might look like: 0----1 | | 3----2 *
   * when it's rotated 180 degrees around the top-left corner it becomes: 2----3 | | 1----0 and the
   * vertex order will still be (0, 1, 2, 3).
   * @param boundingBox boundingBox or {@code null} for none
   */
  public Paragraph setBoundingBox(BoundingPoly boundingBox) {
    this.boundingBox = boundingBox;
    return this;
  }

  /**
   * Confidence of the OCR results for the paragraph. Range [0, 1].
   * @return value or {@code null} for none
   */
  public java.lang.Float getConfidence() {
    return confidence;
  }

  /**
   * Confidence of the OCR results for the paragraph. Range [0, 1].
   * @param confidence confidence or {@code null} for none
   */
  public Paragraph setConfidence(java.lang.Float confidence) {
    this.confidence = confidence;
    return this;
  }

  /**
   * Additional information detected for the paragraph.
   * @return value or {@code null} for none
   */
  public TextProperty getProperty() {
    return property;
  }

  /**
   * Additional information detected for the paragraph.
   * @param property property or {@code null} for none
   */
  public Paragraph setProperty(TextProperty property) {
    this.property = property;
    return this;
  }

  /**
   * List of all words in this paragraph.
   * @return value or {@code null} for none
   */
  public java.util.List<Word> getWords() {
    return words;
  }

  /**
   * List of all words in this paragraph.
   * @param words words or {@code null} for none
   */
  public Paragraph setWords(java.util.List<Word> words) {
    this.words = words;
    return this;
  }

  @Override
  public Paragraph set(String fieldName, Object value) {
    return (Paragraph) super.set(fieldName, value);
  }

  @Override
  public Paragraph clone() {
    return (Paragraph) super.clone();
  }

}
