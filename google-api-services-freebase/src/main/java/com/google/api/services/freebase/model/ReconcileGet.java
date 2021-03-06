/*
 * Copyright 2010 Google Inc.
 *
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
 * This code was generated by https://code.google.com/p/google-apis-client-generator/
 * (build: 2013-09-16 16:01:30 UTC)
 * on 2013-10-15 at 04:12:07 UTC 
 * Modify at your own risk.
 */

package com.google.api.services.freebase.model;

/**
 * Model definition for ReconcileGet.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Freebase Search. For a detailed explanation see:
 * <a href="http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ReconcileGet extends com.google.api.client.json.GenericJson {

  /**
   * If filled, then the listed candidates are potential matches, and such should be evaluated by a
   * more discerning algorithm or human. The matches are ordered by confidence.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ReconcileCandidate> candidate;

  static {
    // hack to force ProGuard to consider ReconcileCandidate used, since otherwise it would be stripped out
    // see http://code.google.com/p/google-api-java-client/issues/detail?id=528
    com.google.api.client.util.Data.nullOf(ReconcileCandidate.class);
  }

  /**
   * Server costs for reconciling.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Costs costs;

  /**
   * If filled, this entity is guaranteed to match at requested confidence probability (default
   * 99%).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ReconcileCandidate match;

  /**
   * If filled, then there were recoverable problems that affected the request. For example, some of
   * the properties were ignored because they either are not valid Freebase predicates or are not
   * indexed for reconciliation. The candidates returned should be considered valid results, with
   * the caveat that sections of the request were ignored as specified by the warning text.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Warning> warning;

  static {
    // hack to force ProGuard to consider Warning used, since otherwise it would be stripped out
    // see http://code.google.com/p/google-api-java-client/issues/detail?id=528
    com.google.api.client.util.Data.nullOf(Warning.class);
  }

  /**
   * If filled, then the listed candidates are potential matches, and such should be evaluated by a
   * more discerning algorithm or human. The matches are ordered by confidence.
   * @return value or {@code null} for none
   */
  public java.util.List<ReconcileCandidate> getCandidate() {
    return candidate;
  }

  /**
   * If filled, then the listed candidates are potential matches, and such should be evaluated by a
   * more discerning algorithm or human. The matches are ordered by confidence.
   * @param candidate candidate or {@code null} for none
   */
  public ReconcileGet setCandidate(java.util.List<ReconcileCandidate> candidate) {
    this.candidate = candidate;
    return this;
  }

  /**
   * Server costs for reconciling.
   * @return value or {@code null} for none
   */
  public Costs getCosts() {
    return costs;
  }

  /**
   * Server costs for reconciling.
   * @param costs costs or {@code null} for none
   */
  public ReconcileGet setCosts(Costs costs) {
    this.costs = costs;
    return this;
  }

  /**
   * If filled, this entity is guaranteed to match at requested confidence probability (default
   * 99%).
   * @return value or {@code null} for none
   */
  public ReconcileCandidate getMatch() {
    return match;
  }

  /**
   * If filled, this entity is guaranteed to match at requested confidence probability (default
   * 99%).
   * @param match match or {@code null} for none
   */
  public ReconcileGet setMatch(ReconcileCandidate match) {
    this.match = match;
    return this;
  }

  /**
   * If filled, then there were recoverable problems that affected the request. For example, some of
   * the properties were ignored because they either are not valid Freebase predicates or are not
   * indexed for reconciliation. The candidates returned should be considered valid results, with
   * the caveat that sections of the request were ignored as specified by the warning text.
   * @return value or {@code null} for none
   */
  public java.util.List<Warning> getWarning() {
    return warning;
  }

  /**
   * If filled, then there were recoverable problems that affected the request. For example, some of
   * the properties were ignored because they either are not valid Freebase predicates or are not
   * indexed for reconciliation. The candidates returned should be considered valid results, with
   * the caveat that sections of the request were ignored as specified by the warning text.
   * @param warning warning or {@code null} for none
   */
  public ReconcileGet setWarning(java.util.List<Warning> warning) {
    this.warning = warning;
    return this;
  }

  @Override
  public ReconcileGet set(String fieldName, Object value) {
    return (ReconcileGet) super.set(fieldName, value);
  }

  @Override
  public ReconcileGet clone() {
    return (ReconcileGet) super.clone();
  }

  /**
   * Server costs for reconciling.
   */
  public static final class Costs extends com.google.api.client.json.GenericJson {

    /**
     * Total number of hits found.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Integer hits;

    /**
     * Total milliseconds spent.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Integer ms;

    /**
     * Total number of hits found.
     * @return value or {@code null} for none
     */
    public java.lang.Integer getHits() {
      return hits;
    }

    /**
     * Total number of hits found.
     * @param hits hits or {@code null} for none
     */
    public Costs setHits(java.lang.Integer hits) {
      this.hits = hits;
      return this;
    }

    /**
     * Total milliseconds spent.
     * @return value or {@code null} for none
     */
    public java.lang.Integer getMs() {
      return ms;
    }

    /**
     * Total milliseconds spent.
     * @param ms ms or {@code null} for none
     */
    public Costs setMs(java.lang.Integer ms) {
      this.ms = ms;
      return this;
    }

    @Override
    public Costs set(String fieldName, Object value) {
      return (Costs) super.set(fieldName, value);
    }

    @Override
    public Costs clone() {
      return (Costs) super.clone();
    }

  }

  /**
   * Model definition for ReconcileGetWarning.
   */
  public static final class Warning extends com.google.api.client.json.GenericJson {

    /**
     * Location of warning in the request e.g. invalid predicate.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String location;

    /**
     * Warning message to display to the user.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String message;

    /**
     * Code for identifying classes of warnings.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String reason;

    /**
     * Location of warning in the request e.g. invalid predicate.
     * @return value or {@code null} for none
     */
    public java.lang.String getLocation() {
      return location;
    }

    /**
     * Location of warning in the request e.g. invalid predicate.
     * @param location location or {@code null} for none
     */
    public Warning setLocation(java.lang.String location) {
      this.location = location;
      return this;
    }

    /**
     * Warning message to display to the user.
     * @return value or {@code null} for none
     */
    public java.lang.String getMessage() {
      return message;
    }

    /**
     * Warning message to display to the user.
     * @param message message or {@code null} for none
     */
    public Warning setMessage(java.lang.String message) {
      this.message = message;
      return this;
    }

    /**
     * Code for identifying classes of warnings.
     * @return value or {@code null} for none
     */
    public java.lang.String getReason() {
      return reason;
    }

    /**
     * Code for identifying classes of warnings.
     * @param reason reason or {@code null} for none
     */
    public Warning setReason(java.lang.String reason) {
      this.reason = reason;
      return this;
    }

    @Override
    public Warning set(String fieldName, Object value) {
      return (Warning) super.set(fieldName, value);
    }

    @Override
    public Warning clone() {
      return (Warning) super.clone();
    }

  }

}
