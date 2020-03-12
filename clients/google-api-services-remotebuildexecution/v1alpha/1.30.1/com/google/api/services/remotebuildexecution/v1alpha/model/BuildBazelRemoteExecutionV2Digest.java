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

package com.google.api.services.remotebuildexecution.v1alpha.model;

/**
 * A content digest. A digest for a given blob consists of the size of the blob and its hash. The
 * hash algorithm to use is defined by the server.
 *
 * The size is considered to be an integral part of the digest and cannot be separated. That is,
 * even if the `hash` field is correctly specified but `size_bytes` is not, the server MUST reject
 * the request.
 *
 * The reason for including the size in the digest is as follows: in a great many cases, the server
 * needs to know the size of the blob it is about to work with prior to starting an operation with
 * it, such as flattening Merkle tree structures or streaming it to a worker. Technically, the
 * server could implement a separate metadata store, but this results in a significantly more
 * complicated implementation as opposed to having the client specify the size up-front (or storing
 * the size along with the digest in every message where digests are embedded). This does mean that
 * the API leaks some implementation details of (what we consider to be) a reasonable server
 * implementation, but we consider this to be a worthwhile tradeoff.
 *
 * When a `Digest` is used to refer to a proto message, it always refers to the message in binary
 * encoded form. To ensure consistent hashing, clients and servers MUST ensure that they serialize
 * messages according to the following rules, even if there are alternate valid encodings for the
 * same message:
 *
 * * Fields are serialized in tag order. * There are no unknown fields. * There are no duplicate
 * fields. * Fields are serialized according to the default semantics for their type.
 *
 * Most protocol buffer implementations will always follow these rules when serializing, but care
 * should be taken to avoid shortcuts. For instance, concatenating two messages to merge them may
 * produce duplicate fields.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Remote Build Execution API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class BuildBazelRemoteExecutionV2Digest extends com.google.api.client.json.GenericJson {

  /**
   * The hash. In the case of SHA-256, it will always be a lowercase hex string exactly 64
   * characters long.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String hash;

  /**
   * The size of the blob, in bytes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long sizeBytes;

  /**
   * The hash. In the case of SHA-256, it will always be a lowercase hex string exactly 64
   * characters long.
   * @return value or {@code null} for none
   */
  public java.lang.String getHash() {
    return hash;
  }

  /**
   * The hash. In the case of SHA-256, it will always be a lowercase hex string exactly 64
   * characters long.
   * @param hash hash or {@code null} for none
   */
  public BuildBazelRemoteExecutionV2Digest setHash(java.lang.String hash) {
    this.hash = hash;
    return this;
  }

  /**
   * The size of the blob, in bytes.
   * @return value or {@code null} for none
   */
  public java.lang.Long getSizeBytes() {
    return sizeBytes;
  }

  /**
   * The size of the blob, in bytes.
   * @param sizeBytes sizeBytes or {@code null} for none
   */
  public BuildBazelRemoteExecutionV2Digest setSizeBytes(java.lang.Long sizeBytes) {
    this.sizeBytes = sizeBytes;
    return this;
  }

  @Override
  public BuildBazelRemoteExecutionV2Digest set(String fieldName, Object value) {
    return (BuildBazelRemoteExecutionV2Digest) super.set(fieldName, value);
  }

  @Override
  public BuildBazelRemoteExecutionV2Digest clone() {
    return (BuildBazelRemoteExecutionV2Digest) super.clone();
  }

}
