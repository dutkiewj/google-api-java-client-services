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

package com.google.api.services.healthcare.v1.model;

/**
 * Specifies the configuration for importing data from Cloud Storage.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Healthcare API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudHealthcareV1DicomGcsSource extends com.google.api.client.json.GenericJson {

  /**
   * Points to a Cloud Storage URI containing file(s) with content only. The URI must be in the
   * following format: `gs://{bucket_id}/{object_id}`. The URI can include wildcards in `object_id`
   * and thus identify multiple files. Supported wildcards: '*' to match 0 or more non-separator
   * characters '**' to match 0 or more characters (including separators). Must be used at the end
   * of a path and with no other wildcards in the path. Can also be used with a file extension (such
   * as .dcm), which imports all files with the extension in the specified directory and its sub-
   * directories. For example, `gs://my-bucket/my-directory*.dcm` imports all files with .dcm
   * extensions in `my-directory/` and its sub-directories. '?' to match 1 character All other URI
   * formats are invalid. Files matching the wildcard are expected to contain content only, no
   * metadata.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String uri;

  /**
   * Points to a Cloud Storage URI containing file(s) with content only. The URI must be in the
   * following format: `gs://{bucket_id}/{object_id}`. The URI can include wildcards in `object_id`
   * and thus identify multiple files. Supported wildcards: '*' to match 0 or more non-separator
   * characters '**' to match 0 or more characters (including separators). Must be used at the end
   * of a path and with no other wildcards in the path. Can also be used with a file extension (such
   * as .dcm), which imports all files with the extension in the specified directory and its sub-
   * directories. For example, `gs://my-bucket/my-directory*.dcm` imports all files with .dcm
   * extensions in `my-directory/` and its sub-directories. '?' to match 1 character All other URI
   * formats are invalid. Files matching the wildcard are expected to contain content only, no
   * metadata.
   * @return value or {@code null} for none
   */
  public java.lang.String getUri() {
    return uri;
  }

  /**
   * Points to a Cloud Storage URI containing file(s) with content only. The URI must be in the
   * following format: `gs://{bucket_id}/{object_id}`. The URI can include wildcards in `object_id`
   * and thus identify multiple files. Supported wildcards: '*' to match 0 or more non-separator
   * characters '**' to match 0 or more characters (including separators). Must be used at the end
   * of a path and with no other wildcards in the path. Can also be used with a file extension (such
   * as .dcm), which imports all files with the extension in the specified directory and its sub-
   * directories. For example, `gs://my-bucket/my-directory*.dcm` imports all files with .dcm
   * extensions in `my-directory/` and its sub-directories. '?' to match 1 character All other URI
   * formats are invalid. Files matching the wildcard are expected to contain content only, no
   * metadata.
   * @param uri uri or {@code null} for none
   */
  public GoogleCloudHealthcareV1DicomGcsSource setUri(java.lang.String uri) {
    this.uri = uri;
    return this;
  }

  @Override
  public GoogleCloudHealthcareV1DicomGcsSource set(String fieldName, Object value) {
    return (GoogleCloudHealthcareV1DicomGcsSource) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudHealthcareV1DicomGcsSource clone() {
    return (GoogleCloudHealthcareV1DicomGcsSource) super.clone();
  }

}
