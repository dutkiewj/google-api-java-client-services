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

package com.google.api.services.sheets.v4.model;

/**
 * Updates properties of the supplied banded range.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Sheets API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class UpdateBandingRequest extends com.google.api.client.json.GenericJson {

  /**
   * The banded range to update with the new properties.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private BandedRange bandedRange;

  /**
   * The fields that should be updated. At least one field must be specified. The root `bandedRange`
   * is implied and should not be specified. A single `"*"` can be used as short-hand for listing
   * every field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String fields;

  /**
   * The banded range to update with the new properties.
   * @return value or {@code null} for none
   */
  public BandedRange getBandedRange() {
    return bandedRange;
  }

  /**
   * The banded range to update with the new properties.
   * @param bandedRange bandedRange or {@code null} for none
   */
  public UpdateBandingRequest setBandedRange(BandedRange bandedRange) {
    this.bandedRange = bandedRange;
    return this;
  }

  /**
   * The fields that should be updated. At least one field must be specified. The root `bandedRange`
   * is implied and should not be specified. A single `"*"` can be used as short-hand for listing
   * every field.
   * @return value or {@code null} for none
   */
  public String getFields() {
    return fields;
  }

  /**
   * The fields that should be updated. At least one field must be specified. The root `bandedRange`
   * is implied and should not be specified. A single `"*"` can be used as short-hand for listing
   * every field.
   * @param fields fields or {@code null} for none
   */
  public UpdateBandingRequest setFields(String fields) {
    this.fields = fields;
    return this;
  }

  @Override
  public UpdateBandingRequest set(String fieldName, Object value) {
    return (UpdateBandingRequest) super.set(fieldName, value);
  }

  @Override
  public UpdateBandingRequest clone() {
    return (UpdateBandingRequest) super.clone();
  }

}
