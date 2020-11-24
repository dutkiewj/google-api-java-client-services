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

package com.google.api.services.healthcare.v1beta1.model;

/**
 * Pseudonymization method that generates surrogates via cryptographic hashing. Uses SHA-256.
 * Outputs a base64-encoded representation of the hashed output. For example,
 * `L7k0BHmF1ha5U3NfGykjro4xWi1MPVQPjhMAZbSV9mM=`.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Healthcare API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CryptoHashConfig extends com.google.api.client.json.GenericJson {

  /**
   * An AES 128/192/256 bit key. Causes the hash to be computed based on this key. A default key is
   * generated for each Deidentify operation and is used wherever crypto_key is not specified.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String cryptoKey;

  /**
   * An AES 128/192/256 bit key. Causes the hash to be computed based on this key. A default key is
   * generated for each Deidentify operation and is used wherever crypto_key is not specified.
   * @see #decodeCryptoKey()
   * @return value or {@code null} for none
   */
  public java.lang.String getCryptoKey() {
    return cryptoKey;
  }

  /**
   * An AES 128/192/256 bit key. Causes the hash to be computed based on this key. A default key is
   * generated for each Deidentify operation and is used wherever crypto_key is not specified.
   * @see #getCryptoKey()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeCryptoKey() {
    return com.google.api.client.util.Base64.decodeBase64(cryptoKey);
  }

  /**
   * An AES 128/192/256 bit key. Causes the hash to be computed based on this key. A default key is
   * generated for each Deidentify operation and is used wherever crypto_key is not specified.
   * @see #encodeCryptoKey()
   * @param cryptoKey cryptoKey or {@code null} for none
   */
  public CryptoHashConfig setCryptoKey(java.lang.String cryptoKey) {
    this.cryptoKey = cryptoKey;
    return this;
  }

  /**
   * An AES 128/192/256 bit key. Causes the hash to be computed based on this key. A default key is
   * generated for each Deidentify operation and is used wherever crypto_key is not specified.
   * @see #setCryptoKey()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public CryptoHashConfig encodeCryptoKey(byte[] cryptoKey) {
    this.cryptoKey = com.google.api.client.util.Base64.encodeBase64URLSafeString(cryptoKey);
    return this;
  }

  @Override
  public CryptoHashConfig set(String fieldName, Object value) {
    return (CryptoHashConfig) super.set(fieldName, value);
  }

  @Override
  public CryptoHashConfig clone() {
    return (CryptoHashConfig) super.clone();
  }

}
