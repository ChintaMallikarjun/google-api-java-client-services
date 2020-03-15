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

package com.google.api.services.compute.model;

/**
 * Represents a Cloud Armor Security Policy resource.
 *
 * Only external backend services that use load balancers can reference a Security Policy. For more
 * information, read  Cloud Armor Security Policy Concepts. (== resource_for
 * {$api_version}.securityPolicies ==)
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SecurityPolicy extends com.google.api.client.json.GenericJson {

  /**
   * A list of associations that belong to this policy.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<SecurityPolicyAssociation> associations;

  /**
   * [Output Only] Creation timestamp in RFC3339 text format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String creationTimestamp;

  /**
   * An optional description of this resource. Provide this property when you create the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * User-provided name of the Organization security plicy. The name should be unique in the
   * organization in which the security policy is created. This should only be used when
   * SecurityPolicyType is FIREWALL. The name must be 1-63 characters long, and comply with RFC1035.
   * Specifically, the name must be 1-63 characters long and match the regular expression
   * `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and
   * all following characters must be a dash, lowercase letter, or digit, except the last character,
   * which cannot be a dash.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * Specifies a fingerprint for this resource, which is essentially a hash of the metadata's
   * contents and used for optimistic locking. The fingerprint is initially generated by Compute
   * Engine and changes after every request to modify or update metadata. You must always provide an
   * up-to-date fingerprint hash in order to update or change metadata, otherwise the request will
   * fail with error 412 conditionNotMet.
   *
   * To see the latest fingerprint, make get() request to the security policy.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String fingerprint;

  /**
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.math.BigInteger id;

  /**
   * [Output only] Type of the resource. Always compute#securityPolicyfor security policies
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * A fingerprint for the labels being applied to this security policy, which is essentially a hash
   * of the labels set used for optimistic locking. The fingerprint is initially generated by
   * Compute Engine and changes after every request to modify or update labels. You must always
   * provide an up-to-date fingerprint hash in order to update or change labels.
   *
   * To see the latest fingerprint, make get() request to the security policy.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String labelFingerprint;

  /**
   * Labels to apply to this security policy resource. These can be later modified by the setLabels
   * method. Each label key/value must comply with RFC1035. Label values may be empty.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * Name of the resource. Provided by the client when the resource is created. The name must be
   * 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   * long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   * character must be a lowercase letter, and all following characters must be a dash, lowercase
   * letter, or digit, except the last character, which cannot be a dash.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * [Output Only] The parent of the security policy.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String parent;

  /**
   * [Output Only] Total count of all security policy rule tuples. A security policy can not exceed
   * a set number of tuples.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer ruleTupleCount;

  /**
   * A list of rules that belong to this policy. There must always be a default rule (rule with
   * priority 2147483647 and match "*"). If no rules are provided when creating a security policy, a
   * default rule with action "allow" will be added.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<SecurityPolicyRule> rules;

  /**
   * [Output Only] Server-defined URL for the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String selfLink;

  /**
   * [Output Only] Server-defined URL for this resource with the resource id.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String selfLinkWithId;

  /**
   * The type indicates the intended use of the security policy. CLOUD_ARMOR policies apply to
   * backend services. FIREWALL policies apply to organizations.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * A list of associations that belong to this policy.
   * @return value or {@code null} for none
   */
  public java.util.List<SecurityPolicyAssociation> getAssociations() {
    return associations;
  }

  /**
   * A list of associations that belong to this policy.
   * @param associations associations or {@code null} for none
   */
  public SecurityPolicy setAssociations(java.util.List<SecurityPolicyAssociation> associations) {
    this.associations = associations;
    return this;
  }

  /**
   * [Output Only] Creation timestamp in RFC3339 text format.
   * @return value or {@code null} for none
   */
  public java.lang.String getCreationTimestamp() {
    return creationTimestamp;
  }

  /**
   * [Output Only] Creation timestamp in RFC3339 text format.
   * @param creationTimestamp creationTimestamp or {@code null} for none
   */
  public SecurityPolicy setCreationTimestamp(java.lang.String creationTimestamp) {
    this.creationTimestamp = creationTimestamp;
    return this;
  }

  /**
   * An optional description of this resource. Provide this property when you create the resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * An optional description of this resource. Provide this property when you create the resource.
   * @param description description or {@code null} for none
   */
  public SecurityPolicy setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * User-provided name of the Organization security plicy. The name should be unique in the
   * organization in which the security policy is created. This should only be used when
   * SecurityPolicyType is FIREWALL. The name must be 1-63 characters long, and comply with RFC1035.
   * Specifically, the name must be 1-63 characters long and match the regular expression
   * `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and
   * all following characters must be a dash, lowercase letter, or digit, except the last character,
   * which cannot be a dash.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * User-provided name of the Organization security plicy. The name should be unique in the
   * organization in which the security policy is created. This should only be used when
   * SecurityPolicyType is FIREWALL. The name must be 1-63 characters long, and comply with RFC1035.
   * Specifically, the name must be 1-63 characters long and match the regular expression
   * `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and
   * all following characters must be a dash, lowercase letter, or digit, except the last character,
   * which cannot be a dash.
   * @param displayName displayName or {@code null} for none
   */
  public SecurityPolicy setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Specifies a fingerprint for this resource, which is essentially a hash of the metadata's
   * contents and used for optimistic locking. The fingerprint is initially generated by Compute
   * Engine and changes after every request to modify or update metadata. You must always provide an
   * up-to-date fingerprint hash in order to update or change metadata, otherwise the request will
   * fail with error 412 conditionNotMet.
   *
   * To see the latest fingerprint, make get() request to the security policy.
   * @see #decodeFingerprint()
   * @return value or {@code null} for none
   */
  public java.lang.String getFingerprint() {
    return fingerprint;
  }

  /**
   * Specifies a fingerprint for this resource, which is essentially a hash of the metadata's
   * contents and used for optimistic locking. The fingerprint is initially generated by Compute
   * Engine and changes after every request to modify or update metadata. You must always provide an
   * up-to-date fingerprint hash in order to update or change metadata, otherwise the request will
   * fail with error 412 conditionNotMet.
   *
   * To see the latest fingerprint, make get() request to the security policy.
   * @see #getFingerprint()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeFingerprint() {
    return com.google.api.client.util.Base64.decodeBase64(fingerprint);
  }

  /**
   * Specifies a fingerprint for this resource, which is essentially a hash of the metadata's
   * contents and used for optimistic locking. The fingerprint is initially generated by Compute
   * Engine and changes after every request to modify or update metadata. You must always provide an
   * up-to-date fingerprint hash in order to update or change metadata, otherwise the request will
   * fail with error 412 conditionNotMet.
   *
   * To see the latest fingerprint, make get() request to the security policy.
   * @see #encodeFingerprint()
   * @param fingerprint fingerprint or {@code null} for none
   */
  public SecurityPolicy setFingerprint(java.lang.String fingerprint) {
    this.fingerprint = fingerprint;
    return this;
  }

  /**
   * Specifies a fingerprint for this resource, which is essentially a hash of the metadata's
   * contents and used for optimistic locking. The fingerprint is initially generated by Compute
   * Engine and changes after every request to modify or update metadata. You must always provide an
   * up-to-date fingerprint hash in order to update or change metadata, otherwise the request will
   * fail with error 412 conditionNotMet.
   *
   * To see the latest fingerprint, make get() request to the security policy.
   * @see #setFingerprint()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public SecurityPolicy encodeFingerprint(byte[] fingerprint) {
    this.fingerprint = com.google.api.client.util.Base64.encodeBase64URLSafeString(fingerprint);
    return this;
  }

  /**
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * @return value or {@code null} for none
   */
  public java.math.BigInteger getId() {
    return id;
  }

  /**
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * @param id id or {@code null} for none
   */
  public SecurityPolicy setId(java.math.BigInteger id) {
    this.id = id;
    return this;
  }

  /**
   * [Output only] Type of the resource. Always compute#securityPolicyfor security policies
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * [Output only] Type of the resource. Always compute#securityPolicyfor security policies
   * @param kind kind or {@code null} for none
   */
  public SecurityPolicy setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * A fingerprint for the labels being applied to this security policy, which is essentially a hash
   * of the labels set used for optimistic locking. The fingerprint is initially generated by
   * Compute Engine and changes after every request to modify or update labels. You must always
   * provide an up-to-date fingerprint hash in order to update or change labels.
   *
   * To see the latest fingerprint, make get() request to the security policy.
   * @see #decodeLabelFingerprint()
   * @return value or {@code null} for none
   */
  public java.lang.String getLabelFingerprint() {
    return labelFingerprint;
  }

  /**
   * A fingerprint for the labels being applied to this security policy, which is essentially a hash
   * of the labels set used for optimistic locking. The fingerprint is initially generated by
   * Compute Engine and changes after every request to modify or update labels. You must always
   * provide an up-to-date fingerprint hash in order to update or change labels.
   *
   * To see the latest fingerprint, make get() request to the security policy.
   * @see #getLabelFingerprint()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeLabelFingerprint() {
    return com.google.api.client.util.Base64.decodeBase64(labelFingerprint);
  }

  /**
   * A fingerprint for the labels being applied to this security policy, which is essentially a hash
   * of the labels set used for optimistic locking. The fingerprint is initially generated by
   * Compute Engine and changes after every request to modify or update labels. You must always
   * provide an up-to-date fingerprint hash in order to update or change labels.
   *
   * To see the latest fingerprint, make get() request to the security policy.
   * @see #encodeLabelFingerprint()
   * @param labelFingerprint labelFingerprint or {@code null} for none
   */
  public SecurityPolicy setLabelFingerprint(java.lang.String labelFingerprint) {
    this.labelFingerprint = labelFingerprint;
    return this;
  }

  /**
   * A fingerprint for the labels being applied to this security policy, which is essentially a hash
   * of the labels set used for optimistic locking. The fingerprint is initially generated by
   * Compute Engine and changes after every request to modify or update labels. You must always
   * provide an up-to-date fingerprint hash in order to update or change labels.
   *
   * To see the latest fingerprint, make get() request to the security policy.
   * @see #setLabelFingerprint()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public SecurityPolicy encodeLabelFingerprint(byte[] labelFingerprint) {
    this.labelFingerprint = com.google.api.client.util.Base64.encodeBase64URLSafeString(labelFingerprint);
    return this;
  }

  /**
   * Labels to apply to this security policy resource. These can be later modified by the setLabels
   * method. Each label key/value must comply with RFC1035. Label values may be empty.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * Labels to apply to this security policy resource. These can be later modified by the setLabels
   * method. Each label key/value must comply with RFC1035. Label values may be empty.
   * @param labels labels or {@code null} for none
   */
  public SecurityPolicy setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * Name of the resource. Provided by the client when the resource is created. The name must be
   * 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   * long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   * character must be a lowercase letter, and all following characters must be a dash, lowercase
   * letter, or digit, except the last character, which cannot be a dash.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Name of the resource. Provided by the client when the resource is created. The name must be
   * 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   * long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   * character must be a lowercase letter, and all following characters must be a dash, lowercase
   * letter, or digit, except the last character, which cannot be a dash.
   * @param name name or {@code null} for none
   */
  public SecurityPolicy setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * [Output Only] The parent of the security policy.
   * @return value or {@code null} for none
   */
  public java.lang.String getParent() {
    return parent;
  }

  /**
   * [Output Only] The parent of the security policy.
   * @param parent parent or {@code null} for none
   */
  public SecurityPolicy setParent(java.lang.String parent) {
    this.parent = parent;
    return this;
  }

  /**
   * [Output Only] Total count of all security policy rule tuples. A security policy can not exceed
   * a set number of tuples.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getRuleTupleCount() {
    return ruleTupleCount;
  }

  /**
   * [Output Only] Total count of all security policy rule tuples. A security policy can not exceed
   * a set number of tuples.
   * @param ruleTupleCount ruleTupleCount or {@code null} for none
   */
  public SecurityPolicy setRuleTupleCount(java.lang.Integer ruleTupleCount) {
    this.ruleTupleCount = ruleTupleCount;
    return this;
  }

  /**
   * A list of rules that belong to this policy. There must always be a default rule (rule with
   * priority 2147483647 and match "*"). If no rules are provided when creating a security policy, a
   * default rule with action "allow" will be added.
   * @return value or {@code null} for none
   */
  public java.util.List<SecurityPolicyRule> getRules() {
    return rules;
  }

  /**
   * A list of rules that belong to this policy. There must always be a default rule (rule with
   * priority 2147483647 and match "*"). If no rules are provided when creating a security policy, a
   * default rule with action "allow" will be added.
   * @param rules rules or {@code null} for none
   */
  public SecurityPolicy setRules(java.util.List<SecurityPolicyRule> rules) {
    this.rules = rules;
    return this;
  }

  /**
   * [Output Only] Server-defined URL for the resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getSelfLink() {
    return selfLink;
  }

  /**
   * [Output Only] Server-defined URL for the resource.
   * @param selfLink selfLink or {@code null} for none
   */
  public SecurityPolicy setSelfLink(java.lang.String selfLink) {
    this.selfLink = selfLink;
    return this;
  }

  /**
   * [Output Only] Server-defined URL for this resource with the resource id.
   * @return value or {@code null} for none
   */
  public java.lang.String getSelfLinkWithId() {
    return selfLinkWithId;
  }

  /**
   * [Output Only] Server-defined URL for this resource with the resource id.
   * @param selfLinkWithId selfLinkWithId or {@code null} for none
   */
  public SecurityPolicy setSelfLinkWithId(java.lang.String selfLinkWithId) {
    this.selfLinkWithId = selfLinkWithId;
    return this;
  }

  /**
   * The type indicates the intended use of the security policy. CLOUD_ARMOR policies apply to
   * backend services. FIREWALL policies apply to organizations.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * The type indicates the intended use of the security policy. CLOUD_ARMOR policies apply to
   * backend services. FIREWALL policies apply to organizations.
   * @param type type or {@code null} for none
   */
  public SecurityPolicy setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  @Override
  public SecurityPolicy set(String fieldName, Object value) {
    return (SecurityPolicy) super.set(fieldName, value);
  }

  @Override
  public SecurityPolicy clone() {
    return (SecurityPolicy) super.clone();
  }

}
