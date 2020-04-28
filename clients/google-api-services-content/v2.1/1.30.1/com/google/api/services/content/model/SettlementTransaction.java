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

package com.google.api.services.content.model;

/**
 * Settlement transactions give a detailed breakdown of the  settlement report.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Content API for Shopping. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SettlementTransaction extends com.google.api.client.json.GenericJson {

  /**
   * The amount for the transaction.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SettlementTransactionAmount amount;

  /**
   * Identifiers of the transaction.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SettlementTransactionIdentifiers identifiers;

  /**
   * Identifies what kind of resource this is. Value: the fixed string
   * "`content#settlementTransaction`"
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Details of the transaction.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SettlementTransactionTransaction transaction;

  /**
   * The amount for the transaction.
   * @return value or {@code null} for none
   */
  public SettlementTransactionAmount getAmount() {
    return amount;
  }

  /**
   * The amount for the transaction.
   * @param amount amount or {@code null} for none
   */
  public SettlementTransaction setAmount(SettlementTransactionAmount amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Identifiers of the transaction.
   * @return value or {@code null} for none
   */
  public SettlementTransactionIdentifiers getIdentifiers() {
    return identifiers;
  }

  /**
   * Identifiers of the transaction.
   * @param identifiers identifiers or {@code null} for none
   */
  public SettlementTransaction setIdentifiers(SettlementTransactionIdentifiers identifiers) {
    this.identifiers = identifiers;
    return this;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string
   * "`content#settlementTransaction`"
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string
   * "`content#settlementTransaction`"
   * @param kind kind or {@code null} for none
   */
  public SettlementTransaction setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Details of the transaction.
   * @return value or {@code null} for none
   */
  public SettlementTransactionTransaction getTransaction() {
    return transaction;
  }

  /**
   * Details of the transaction.
   * @param transaction transaction or {@code null} for none
   */
  public SettlementTransaction setTransaction(SettlementTransactionTransaction transaction) {
    this.transaction = transaction;
    return this;
  }

  @Override
  public SettlementTransaction set(String fieldName, Object value) {
    return (SettlementTransaction) super.set(fieldName, value);
  }

  @Override
  public SettlementTransaction clone() {
    return (SettlementTransaction) super.clone();
  }

}