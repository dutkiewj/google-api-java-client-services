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
 * Location at the end of a body, header, footer or footnote. The location is immediately before the
 * last newline in the document segment.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Docs API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class EndOfSegmentLocation extends com.google.api.client.json.GenericJson {

  /**
   * The ID of the header, footer or footnote the location is in. An empty segment ID signifies the
   * document's body.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String segmentId;

  /**
   * The ID of the header, footer or footnote the location is in. An empty segment ID signifies the
   * document's body.
   * @return value or {@code null} for none
   */
  public java.lang.String getSegmentId() {
    return segmentId;
  }

  /**
   * The ID of the header, footer or footnote the location is in. An empty segment ID signifies the
   * document's body.
   * @param segmentId segmentId or {@code null} for none
   */
  public EndOfSegmentLocation setSegmentId(java.lang.String segmentId) {
    this.segmentId = segmentId;
    return this;
  }

  @Override
  public EndOfSegmentLocation set(String fieldName, Object value) {
    return (EndOfSegmentLocation) super.set(fieldName, value);
  }

  @Override
  public EndOfSegmentLocation clone() {
    return (EndOfSegmentLocation) super.clone();
  }

}
