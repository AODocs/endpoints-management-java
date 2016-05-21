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
 * This code was generated by https://github.com/google/apis-client-generator/
 * Modify at your own risk.
 */

package com.google.api.services.servicecontrol.v1.model;

/**
 * Billing related configuration of the service.
 *
 * The following example shows how to configure metrics for billing:
 *
 *     metrics:     - name: library.googleapis.com/read_calls       metric_kind: DELTA
 * value_type: INT64     - name: library.googleapis.com/write_calls       metric_kind: DELTA
 * value_type: INT64     billing:       metrics:       - library.googleapis.com/read_calls       -
 * library.googleapis.com/write_calls
 *
 * The next example shows how to enable billing status check and customize the check behavior. It
 * makes sure billing status check is included in the `Check` method of [Service Control
 * API](https://cloud.google.com/service-control/). In the example, "google.storage.Get" method can
 * be served when the billing status is either `current` or `delinquent`, while
 * "google.storage.Write" method can only be served when the billing status is `current`:
 *
 *     billing:       rules:       - selector: google.storage.Get         allowed_statuses:
 * - current         - delinquent       - selector: google.storage.Write         allowed_statuses:
 * current
 *
 * Mostly services should only allow `current` status when serving requests. In addition, services
 * can choose to allow both `current` and `delinquent` statuses when serving read-only requests to
 * resources. If there's no matching selector for operation, no billing status check will be
 * performed.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Service Control API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Billing extends com.google.api.client.json.GenericJson {

  /**
   * Per resource grouping for delta billing based resource configs.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<AreaUnderCurveParams> areaUnderCurveParams;

  static {
    // hack to force ProGuard to consider AreaUnderCurveParams used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(AreaUnderCurveParams.class);
  }

  /**
   * Names of the metrics to report to billing. Each name must be defined in Service.metrics
   * section.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> metrics;

  /**
   * A list of billing status rules for configuring billing status check.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<BillingStatusRule> rules;

  /**
   * Per resource grouping for delta billing based resource configs.
   * @return value or {@code null} for none
   */
  public java.util.List<AreaUnderCurveParams> getAreaUnderCurveParams() {
    return areaUnderCurveParams;
  }

  /**
   * Per resource grouping for delta billing based resource configs.
   * @param areaUnderCurveParams areaUnderCurveParams or {@code null} for none
   */
  public Billing setAreaUnderCurveParams(java.util.List<AreaUnderCurveParams> areaUnderCurveParams) {
    this.areaUnderCurveParams = areaUnderCurveParams;
    return this;
  }

  /**
   * Names of the metrics to report to billing. Each name must be defined in Service.metrics
   * section.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getMetrics() {
    return metrics;
  }

  /**
   * Names of the metrics to report to billing. Each name must be defined in Service.metrics
   * section.
   * @param metrics metrics or {@code null} for none
   */
  public Billing setMetrics(java.util.List<java.lang.String> metrics) {
    this.metrics = metrics;
    return this;
  }

  /**
   * A list of billing status rules for configuring billing status check.
   * @return value or {@code null} for none
   */
  public java.util.List<BillingStatusRule> getRules() {
    return rules;
  }

  /**
   * A list of billing status rules for configuring billing status check.
   * @param rules rules or {@code null} for none
   */
  public Billing setRules(java.util.List<BillingStatusRule> rules) {
    this.rules = rules;
    return this;
  }

  @Override
  public Billing set(String fieldName, Object value) {
    return (Billing) super.set(fieldName, value);
  }

  @Override
  public Billing clone() {
    return (Billing) super.clone();
  }

}