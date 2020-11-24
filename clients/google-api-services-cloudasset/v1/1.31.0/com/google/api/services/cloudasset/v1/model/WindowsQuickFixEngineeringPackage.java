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
 * Information related to a Quick Fix Engineering package. Fields are taken from Windows
 * QuickFixEngineering Interface and match the source names: https://docs.microsoft.com/en-
 * us/windows/win32/cimwin32prov/win32-quickfixengineering
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Asset API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class WindowsQuickFixEngineeringPackage extends com.google.api.client.json.GenericJson {

  /**
   * A short textual description of the QFE update.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String caption;

  /**
   * A textual description of the QFE update.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Unique identifier associated with a particular QFE update.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String hotFixId;

  /**
   * Date that the QFE update was installed. Mapped from installed_on field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String installTime;

  /**
   * A short textual description of the QFE update.
   * @return value or {@code null} for none
   */
  public java.lang.String getCaption() {
    return caption;
  }

  /**
   * A short textual description of the QFE update.
   * @param caption caption or {@code null} for none
   */
  public WindowsQuickFixEngineeringPackage setCaption(java.lang.String caption) {
    this.caption = caption;
    return this;
  }

  /**
   * A textual description of the QFE update.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * A textual description of the QFE update.
   * @param description description or {@code null} for none
   */
  public WindowsQuickFixEngineeringPackage setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Unique identifier associated with a particular QFE update.
   * @return value or {@code null} for none
   */
  public java.lang.String getHotFixId() {
    return hotFixId;
  }

  /**
   * Unique identifier associated with a particular QFE update.
   * @param hotFixId hotFixId or {@code null} for none
   */
  public WindowsQuickFixEngineeringPackage setHotFixId(java.lang.String hotFixId) {
    this.hotFixId = hotFixId;
    return this;
  }

  /**
   * Date that the QFE update was installed. Mapped from installed_on field.
   * @return value or {@code null} for none
   */
  public String getInstallTime() {
    return installTime;
  }

  /**
   * Date that the QFE update was installed. Mapped from installed_on field.
   * @param installTime installTime or {@code null} for none
   */
  public WindowsQuickFixEngineeringPackage setInstallTime(String installTime) {
    this.installTime = installTime;
    return this;
  }

  @Override
  public WindowsQuickFixEngineeringPackage set(String fieldName, Object value) {
    return (WindowsQuickFixEngineeringPackage) super.set(fieldName, value);
  }

  @Override
  public WindowsQuickFixEngineeringPackage clone() {
    return (WindowsQuickFixEngineeringPackage) super.clone();
  }

}
