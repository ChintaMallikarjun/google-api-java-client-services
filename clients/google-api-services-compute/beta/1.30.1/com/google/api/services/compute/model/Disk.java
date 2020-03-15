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
 * Represents a Persistent Disk resource.
 *
 * Google Compute Engine has two Disk resources:
 *
 * * [Global](/compute/docs/reference/rest/{$api_version}/disks) *
 * [Regional](/compute/docs/reference/rest/{$api_version}/regionDisks)
 *
 * Persistent disks are required for running your VM instances. Create both boot and non-boot (data)
 * persistent disks. For more information, read Persistent Disks. For more storage options, read
 * Storage options.
 *
 * The disks resource represents a zonal persistent disk. For more information, read Zonal
 * persistent disks.
 *
 * The regionDisks resource represents a regional persistent disk. For more information, read
 * Regional resources. (== resource_for {$api_version}.disks ==) (== resource_for
 * {$api_version}.regionDisks ==)
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Disk extends com.google.api.client.json.GenericJson {

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
   * Encrypts the disk using a customer-supplied encryption key.
   *
   * After you encrypt a disk with a customer-supplied key, you must provide the same key if you use
   * the disk later (e.g. to create a disk snapshot, to create a disk image, to create a machine
   * image, or to attach the disk to a virtual machine).
   *
   * Customer-supplied encryption keys do not protect access to metadata of the disk.
   *
   * If you do not provide an encryption key when creating the disk, then the disk will be encrypted
   * using an automatically generated key and you do not need to provide a key to use the disk
   * later.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private CustomerEncryptionKey diskEncryptionKey;

  /**
   * Specifies whether the disk restored from a source snapshot should erase Windows specific VSS
   * signature.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean eraseWindowsVssSignature;

  /**
   * A list of features to enable on the guest operating system. Applicable only for bootable
   * images. Read  Enabling guest operating system features to see a list of available options.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GuestOsFeature> guestOsFeatures;

  /**
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.math.BigInteger id;

  /**
   * [Output Only] Type of the resource. Always compute#disk for disks.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * A fingerprint for the labels being applied to this disk, which is essentially a hash of the
   * labels set used for optimistic locking. The fingerprint is initially generated by Compute
   * Engine and changes after every request to modify or update labels. You must always provide an
   * up-to-date fingerprint hash in order to update or change labels, otherwise the request will
   * fail with error 412 conditionNotMet.
   *
   * To see the latest fingerprint, make a get() request to retrieve a disk.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String labelFingerprint;

  /**
   * Labels to apply to this disk. These can be later modified by the setLabels method.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * [Output Only] Last attach timestamp in RFC3339 text format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String lastAttachTimestamp;

  /**
   * [Output Only] Last detach timestamp in RFC3339 text format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String lastDetachTimestamp;

  /**
   * Integer license codes indicating which licenses are attached to this disk.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.util.List<java.lang.Long> licenseCodes;

  /**
   * A list of publicly visible licenses. Reserved for Google's use.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> licenses;

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
   * Internal use only.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String options;

  /**
   * Physical block size of the persistent disk, in bytes. If not present in a request, a default
   * value is used. Currently supported sizes are 4096 and 16384, other sizes may be added in the
   * future. If an unsupported value is requested, the error message will list the supported values
   * for the caller's project.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long physicalBlockSizeBytes;

  /**
   * [Output Only] URL of the region where the disk resides. Only applicable for regional resources.
   * You must specify this field as part of the HTTP request URL. It is not settable as a field in
   * the request body.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String region;

  /**
   * URLs of the zones where the disk should be replicated to. Only applicable for regional
   * resources.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> replicaZones;

  /**
   * Resource policies applied to this disk for automatic snapshot creations.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> resourcePolicies;

  /**
   * [Output Only] Server-defined fully-qualified URL for this resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String selfLink;

  /**
   * Size of the persistent disk, specified in GB. You can specify this field when creating a
   * persistent disk using the sourceImage or sourceSnapshot parameter, or specify it alone to
   * create an empty persistent disk.
   *
   * If you specify this field along with sourceImage or sourceSnapshot, the value of sizeGb must
   * not be less than the size of the sourceImage or the size of the snapshot. Acceptable values are
   * 1 to 65536, inclusive.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long sizeGb;

  /**
   * The source image used to create this disk. If the source image is deleted, this field will not
   * be set.
   *
   * To create a disk with one of the public operating system images, specify the image by its
   * family name. For example, specify family/debian-9 to use the latest Debian 9 image: projects
   * /debian-cloud/global/images/family/debian-9
   *
   * Alternatively, use a specific version of a public operating system image: projects/debian-
   * cloud/global/images/debian-9-stretch-vYYYYMMDD
   *
   * To create a disk with a custom image that you created, specify the image name in the following
   * format: global/images/my-custom-image
   *
   * You can also specify a custom image by its image family, which returns the latest version of
   * the image in that family. Replace the image name with family/family-name: global/images/family
   * /my-image-family
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sourceImage;

  /**
   * The customer-supplied encryption key of the source image. Required if the source image is
   * protected by a customer-supplied encryption key.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private CustomerEncryptionKey sourceImageEncryptionKey;

  /**
   * [Output Only] The ID value of the image used to create this disk. This value identifies the
   * exact image that was used to create this persistent disk. For example, if you created the
   * persistent disk from an image that was later deleted and recreated under the same name, the
   * source image ID would identify the exact version of the image that was used.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sourceImageId;

  /**
   * The source snapshot used to create this disk. You can provide this as a partial or full URL to
   * the resource. For example, the following are valid values: -
   * https://www.googleapis.com/compute/v1/projects/project/global/snapshots/snapshot  -
   * projects/project/global/snapshots/snapshot  - global/snapshots/snapshot
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sourceSnapshot;

  /**
   * The customer-supplied encryption key of the source snapshot. Required if the source snapshot is
   * protected by a customer-supplied encryption key.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private CustomerEncryptionKey sourceSnapshotEncryptionKey;

  /**
   * [Output Only] The unique ID of the snapshot used to create this disk. This value identifies the
   * exact snapshot that was used to create this persistent disk. For example, if you created the
   * persistent disk from a snapshot that was later deleted and recreated under the same name, the
   * source snapshot ID would identify the exact version of the snapshot that was used.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sourceSnapshotId;

  /**
   * [Output Only] The status of disk creation. CREATING: Disk is provisioning. RESTORING: Source
   * data is being copied into the disk. FAILED: Disk creation failed. READY: Disk is ready for use.
   * DELETING: Disk is deleting.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String status;

  /**
   * [Deprecated] Storage type of the persistent disk.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String storageType;

  /**
   * URL of the disk type resource describing which disk type to use to create the disk. Provide
   * this when creating the disk. For example: projects/project/zones/zone/diskTypes/pd-standard or
   * pd-ssd
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * [Output Only] Links to the users of the disk (attached instances) in form:
   * projects/project/zones/zone/instances/instance
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> users;

  /**
   * [Output Only] URL of the zone where the disk resides. You must specify this field as part of
   * the HTTP request URL. It is not settable as a field in the request body.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String zone;

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
  public Disk setCreationTimestamp(java.lang.String creationTimestamp) {
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
  public Disk setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Encrypts the disk using a customer-supplied encryption key.
   *
   * After you encrypt a disk with a customer-supplied key, you must provide the same key if you use
   * the disk later (e.g. to create a disk snapshot, to create a disk image, to create a machine
   * image, or to attach the disk to a virtual machine).
   *
   * Customer-supplied encryption keys do not protect access to metadata of the disk.
   *
   * If you do not provide an encryption key when creating the disk, then the disk will be encrypted
   * using an automatically generated key and you do not need to provide a key to use the disk
   * later.
   * @return value or {@code null} for none
   */
  public CustomerEncryptionKey getDiskEncryptionKey() {
    return diskEncryptionKey;
  }

  /**
   * Encrypts the disk using a customer-supplied encryption key.
   *
   * After you encrypt a disk with a customer-supplied key, you must provide the same key if you use
   * the disk later (e.g. to create a disk snapshot, to create a disk image, to create a machine
   * image, or to attach the disk to a virtual machine).
   *
   * Customer-supplied encryption keys do not protect access to metadata of the disk.
   *
   * If you do not provide an encryption key when creating the disk, then the disk will be encrypted
   * using an automatically generated key and you do not need to provide a key to use the disk
   * later.
   * @param diskEncryptionKey diskEncryptionKey or {@code null} for none
   */
  public Disk setDiskEncryptionKey(CustomerEncryptionKey diskEncryptionKey) {
    this.diskEncryptionKey = diskEncryptionKey;
    return this;
  }

  /**
   * Specifies whether the disk restored from a source snapshot should erase Windows specific VSS
   * signature.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEraseWindowsVssSignature() {
    return eraseWindowsVssSignature;
  }

  /**
   * Specifies whether the disk restored from a source snapshot should erase Windows specific VSS
   * signature.
   * @param eraseWindowsVssSignature eraseWindowsVssSignature or {@code null} for none
   */
  public Disk setEraseWindowsVssSignature(java.lang.Boolean eraseWindowsVssSignature) {
    this.eraseWindowsVssSignature = eraseWindowsVssSignature;
    return this;
  }

  /**
   * A list of features to enable on the guest operating system. Applicable only for bootable
   * images. Read  Enabling guest operating system features to see a list of available options.
   * @return value or {@code null} for none
   */
  public java.util.List<GuestOsFeature> getGuestOsFeatures() {
    return guestOsFeatures;
  }

  /**
   * A list of features to enable on the guest operating system. Applicable only for bootable
   * images. Read  Enabling guest operating system features to see a list of available options.
   * @param guestOsFeatures guestOsFeatures or {@code null} for none
   */
  public Disk setGuestOsFeatures(java.util.List<GuestOsFeature> guestOsFeatures) {
    this.guestOsFeatures = guestOsFeatures;
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
  public Disk setId(java.math.BigInteger id) {
    this.id = id;
    return this;
  }

  /**
   * [Output Only] Type of the resource. Always compute#disk for disks.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * [Output Only] Type of the resource. Always compute#disk for disks.
   * @param kind kind or {@code null} for none
   */
  public Disk setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * A fingerprint for the labels being applied to this disk, which is essentially a hash of the
   * labels set used for optimistic locking. The fingerprint is initially generated by Compute
   * Engine and changes after every request to modify or update labels. You must always provide an
   * up-to-date fingerprint hash in order to update or change labels, otherwise the request will
   * fail with error 412 conditionNotMet.
   *
   * To see the latest fingerprint, make a get() request to retrieve a disk.
   * @see #decodeLabelFingerprint()
   * @return value or {@code null} for none
   */
  public java.lang.String getLabelFingerprint() {
    return labelFingerprint;
  }

  /**
   * A fingerprint for the labels being applied to this disk, which is essentially a hash of the
   * labels set used for optimistic locking. The fingerprint is initially generated by Compute
   * Engine and changes after every request to modify or update labels. You must always provide an
   * up-to-date fingerprint hash in order to update or change labels, otherwise the request will
   * fail with error 412 conditionNotMet.
   *
   * To see the latest fingerprint, make a get() request to retrieve a disk.
   * @see #getLabelFingerprint()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeLabelFingerprint() {
    return com.google.api.client.util.Base64.decodeBase64(labelFingerprint);
  }

  /**
   * A fingerprint for the labels being applied to this disk, which is essentially a hash of the
   * labels set used for optimistic locking. The fingerprint is initially generated by Compute
   * Engine and changes after every request to modify or update labels. You must always provide an
   * up-to-date fingerprint hash in order to update or change labels, otherwise the request will
   * fail with error 412 conditionNotMet.
   *
   * To see the latest fingerprint, make a get() request to retrieve a disk.
   * @see #encodeLabelFingerprint()
   * @param labelFingerprint labelFingerprint or {@code null} for none
   */
  public Disk setLabelFingerprint(java.lang.String labelFingerprint) {
    this.labelFingerprint = labelFingerprint;
    return this;
  }

  /**
   * A fingerprint for the labels being applied to this disk, which is essentially a hash of the
   * labels set used for optimistic locking. The fingerprint is initially generated by Compute
   * Engine and changes after every request to modify or update labels. You must always provide an
   * up-to-date fingerprint hash in order to update or change labels, otherwise the request will
   * fail with error 412 conditionNotMet.
   *
   * To see the latest fingerprint, make a get() request to retrieve a disk.
   * @see #setLabelFingerprint()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public Disk encodeLabelFingerprint(byte[] labelFingerprint) {
    this.labelFingerprint = com.google.api.client.util.Base64.encodeBase64URLSafeString(labelFingerprint);
    return this;
  }

  /**
   * Labels to apply to this disk. These can be later modified by the setLabels method.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * Labels to apply to this disk. These can be later modified by the setLabels method.
   * @param labels labels or {@code null} for none
   */
  public Disk setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * [Output Only] Last attach timestamp in RFC3339 text format.
   * @return value or {@code null} for none
   */
  public java.lang.String getLastAttachTimestamp() {
    return lastAttachTimestamp;
  }

  /**
   * [Output Only] Last attach timestamp in RFC3339 text format.
   * @param lastAttachTimestamp lastAttachTimestamp or {@code null} for none
   */
  public Disk setLastAttachTimestamp(java.lang.String lastAttachTimestamp) {
    this.lastAttachTimestamp = lastAttachTimestamp;
    return this;
  }

  /**
   * [Output Only] Last detach timestamp in RFC3339 text format.
   * @return value or {@code null} for none
   */
  public java.lang.String getLastDetachTimestamp() {
    return lastDetachTimestamp;
  }

  /**
   * [Output Only] Last detach timestamp in RFC3339 text format.
   * @param lastDetachTimestamp lastDetachTimestamp or {@code null} for none
   */
  public Disk setLastDetachTimestamp(java.lang.String lastDetachTimestamp) {
    this.lastDetachTimestamp = lastDetachTimestamp;
    return this;
  }

  /**
   * Integer license codes indicating which licenses are attached to this disk.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.Long> getLicenseCodes() {
    return licenseCodes;
  }

  /**
   * Integer license codes indicating which licenses are attached to this disk.
   * @param licenseCodes licenseCodes or {@code null} for none
   */
  public Disk setLicenseCodes(java.util.List<java.lang.Long> licenseCodes) {
    this.licenseCodes = licenseCodes;
    return this;
  }

  /**
   * A list of publicly visible licenses. Reserved for Google's use.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getLicenses() {
    return licenses;
  }

  /**
   * A list of publicly visible licenses. Reserved for Google's use.
   * @param licenses licenses or {@code null} for none
   */
  public Disk setLicenses(java.util.List<java.lang.String> licenses) {
    this.licenses = licenses;
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
  public Disk setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Internal use only.
   * @return value or {@code null} for none
   */
  public java.lang.String getOptions() {
    return options;
  }

  /**
   * Internal use only.
   * @param options options or {@code null} for none
   */
  public Disk setOptions(java.lang.String options) {
    this.options = options;
    return this;
  }

  /**
   * Physical block size of the persistent disk, in bytes. If not present in a request, a default
   * value is used. Currently supported sizes are 4096 and 16384, other sizes may be added in the
   * future. If an unsupported value is requested, the error message will list the supported values
   * for the caller's project.
   * @return value or {@code null} for none
   */
  public java.lang.Long getPhysicalBlockSizeBytes() {
    return physicalBlockSizeBytes;
  }

  /**
   * Physical block size of the persistent disk, in bytes. If not present in a request, a default
   * value is used. Currently supported sizes are 4096 and 16384, other sizes may be added in the
   * future. If an unsupported value is requested, the error message will list the supported values
   * for the caller's project.
   * @param physicalBlockSizeBytes physicalBlockSizeBytes or {@code null} for none
   */
  public Disk setPhysicalBlockSizeBytes(java.lang.Long physicalBlockSizeBytes) {
    this.physicalBlockSizeBytes = physicalBlockSizeBytes;
    return this;
  }

  /**
   * [Output Only] URL of the region where the disk resides. Only applicable for regional resources.
   * You must specify this field as part of the HTTP request URL. It is not settable as a field in
   * the request body.
   * @return value or {@code null} for none
   */
  public java.lang.String getRegion() {
    return region;
  }

  /**
   * [Output Only] URL of the region where the disk resides. Only applicable for regional resources.
   * You must specify this field as part of the HTTP request URL. It is not settable as a field in
   * the request body.
   * @param region region or {@code null} for none
   */
  public Disk setRegion(java.lang.String region) {
    this.region = region;
    return this;
  }

  /**
   * URLs of the zones where the disk should be replicated to. Only applicable for regional
   * resources.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getReplicaZones() {
    return replicaZones;
  }

  /**
   * URLs of the zones where the disk should be replicated to. Only applicable for regional
   * resources.
   * @param replicaZones replicaZones or {@code null} for none
   */
  public Disk setReplicaZones(java.util.List<java.lang.String> replicaZones) {
    this.replicaZones = replicaZones;
    return this;
  }

  /**
   * Resource policies applied to this disk for automatic snapshot creations.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getResourcePolicies() {
    return resourcePolicies;
  }

  /**
   * Resource policies applied to this disk for automatic snapshot creations.
   * @param resourcePolicies resourcePolicies or {@code null} for none
   */
  public Disk setResourcePolicies(java.util.List<java.lang.String> resourcePolicies) {
    this.resourcePolicies = resourcePolicies;
    return this;
  }

  /**
   * [Output Only] Server-defined fully-qualified URL for this resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getSelfLink() {
    return selfLink;
  }

  /**
   * [Output Only] Server-defined fully-qualified URL for this resource.
   * @param selfLink selfLink or {@code null} for none
   */
  public Disk setSelfLink(java.lang.String selfLink) {
    this.selfLink = selfLink;
    return this;
  }

  /**
   * Size of the persistent disk, specified in GB. You can specify this field when creating a
   * persistent disk using the sourceImage or sourceSnapshot parameter, or specify it alone to
   * create an empty persistent disk.
   *
   * If you specify this field along with sourceImage or sourceSnapshot, the value of sizeGb must
   * not be less than the size of the sourceImage or the size of the snapshot. Acceptable values are
   * 1 to 65536, inclusive.
   * @return value or {@code null} for none
   */
  public java.lang.Long getSizeGb() {
    return sizeGb;
  }

  /**
   * Size of the persistent disk, specified in GB. You can specify this field when creating a
   * persistent disk using the sourceImage or sourceSnapshot parameter, or specify it alone to
   * create an empty persistent disk.
   *
   * If you specify this field along with sourceImage or sourceSnapshot, the value of sizeGb must
   * not be less than the size of the sourceImage or the size of the snapshot. Acceptable values are
   * 1 to 65536, inclusive.
   * @param sizeGb sizeGb or {@code null} for none
   */
  public Disk setSizeGb(java.lang.Long sizeGb) {
    this.sizeGb = sizeGb;
    return this;
  }

  /**
   * The source image used to create this disk. If the source image is deleted, this field will not
   * be set.
   *
   * To create a disk with one of the public operating system images, specify the image by its
   * family name. For example, specify family/debian-9 to use the latest Debian 9 image: projects
   * /debian-cloud/global/images/family/debian-9
   *
   * Alternatively, use a specific version of a public operating system image: projects/debian-
   * cloud/global/images/debian-9-stretch-vYYYYMMDD
   *
   * To create a disk with a custom image that you created, specify the image name in the following
   * format: global/images/my-custom-image
   *
   * You can also specify a custom image by its image family, which returns the latest version of
   * the image in that family. Replace the image name with family/family-name: global/images/family
   * /my-image-family
   * @return value or {@code null} for none
   */
  public java.lang.String getSourceImage() {
    return sourceImage;
  }

  /**
   * The source image used to create this disk. If the source image is deleted, this field will not
   * be set.
   *
   * To create a disk with one of the public operating system images, specify the image by its
   * family name. For example, specify family/debian-9 to use the latest Debian 9 image: projects
   * /debian-cloud/global/images/family/debian-9
   *
   * Alternatively, use a specific version of a public operating system image: projects/debian-
   * cloud/global/images/debian-9-stretch-vYYYYMMDD
   *
   * To create a disk with a custom image that you created, specify the image name in the following
   * format: global/images/my-custom-image
   *
   * You can also specify a custom image by its image family, which returns the latest version of
   * the image in that family. Replace the image name with family/family-name: global/images/family
   * /my-image-family
   * @param sourceImage sourceImage or {@code null} for none
   */
  public Disk setSourceImage(java.lang.String sourceImage) {
    this.sourceImage = sourceImage;
    return this;
  }

  /**
   * The customer-supplied encryption key of the source image. Required if the source image is
   * protected by a customer-supplied encryption key.
   * @return value or {@code null} for none
   */
  public CustomerEncryptionKey getSourceImageEncryptionKey() {
    return sourceImageEncryptionKey;
  }

  /**
   * The customer-supplied encryption key of the source image. Required if the source image is
   * protected by a customer-supplied encryption key.
   * @param sourceImageEncryptionKey sourceImageEncryptionKey or {@code null} for none
   */
  public Disk setSourceImageEncryptionKey(CustomerEncryptionKey sourceImageEncryptionKey) {
    this.sourceImageEncryptionKey = sourceImageEncryptionKey;
    return this;
  }

  /**
   * [Output Only] The ID value of the image used to create this disk. This value identifies the
   * exact image that was used to create this persistent disk. For example, if you created the
   * persistent disk from an image that was later deleted and recreated under the same name, the
   * source image ID would identify the exact version of the image that was used.
   * @return value or {@code null} for none
   */
  public java.lang.String getSourceImageId() {
    return sourceImageId;
  }

  /**
   * [Output Only] The ID value of the image used to create this disk. This value identifies the
   * exact image that was used to create this persistent disk. For example, if you created the
   * persistent disk from an image that was later deleted and recreated under the same name, the
   * source image ID would identify the exact version of the image that was used.
   * @param sourceImageId sourceImageId or {@code null} for none
   */
  public Disk setSourceImageId(java.lang.String sourceImageId) {
    this.sourceImageId = sourceImageId;
    return this;
  }

  /**
   * The source snapshot used to create this disk. You can provide this as a partial or full URL to
   * the resource. For example, the following are valid values: -
   * https://www.googleapis.com/compute/v1/projects/project/global/snapshots/snapshot  -
   * projects/project/global/snapshots/snapshot  - global/snapshots/snapshot
   * @return value or {@code null} for none
   */
  public java.lang.String getSourceSnapshot() {
    return sourceSnapshot;
  }

  /**
   * The source snapshot used to create this disk. You can provide this as a partial or full URL to
   * the resource. For example, the following are valid values: -
   * https://www.googleapis.com/compute/v1/projects/project/global/snapshots/snapshot  -
   * projects/project/global/snapshots/snapshot  - global/snapshots/snapshot
   * @param sourceSnapshot sourceSnapshot or {@code null} for none
   */
  public Disk setSourceSnapshot(java.lang.String sourceSnapshot) {
    this.sourceSnapshot = sourceSnapshot;
    return this;
  }

  /**
   * The customer-supplied encryption key of the source snapshot. Required if the source snapshot is
   * protected by a customer-supplied encryption key.
   * @return value or {@code null} for none
   */
  public CustomerEncryptionKey getSourceSnapshotEncryptionKey() {
    return sourceSnapshotEncryptionKey;
  }

  /**
   * The customer-supplied encryption key of the source snapshot. Required if the source snapshot is
   * protected by a customer-supplied encryption key.
   * @param sourceSnapshotEncryptionKey sourceSnapshotEncryptionKey or {@code null} for none
   */
  public Disk setSourceSnapshotEncryptionKey(CustomerEncryptionKey sourceSnapshotEncryptionKey) {
    this.sourceSnapshotEncryptionKey = sourceSnapshotEncryptionKey;
    return this;
  }

  /**
   * [Output Only] The unique ID of the snapshot used to create this disk. This value identifies the
   * exact snapshot that was used to create this persistent disk. For example, if you created the
   * persistent disk from a snapshot that was later deleted and recreated under the same name, the
   * source snapshot ID would identify the exact version of the snapshot that was used.
   * @return value or {@code null} for none
   */
  public java.lang.String getSourceSnapshotId() {
    return sourceSnapshotId;
  }

  /**
   * [Output Only] The unique ID of the snapshot used to create this disk. This value identifies the
   * exact snapshot that was used to create this persistent disk. For example, if you created the
   * persistent disk from a snapshot that was later deleted and recreated under the same name, the
   * source snapshot ID would identify the exact version of the snapshot that was used.
   * @param sourceSnapshotId sourceSnapshotId or {@code null} for none
   */
  public Disk setSourceSnapshotId(java.lang.String sourceSnapshotId) {
    this.sourceSnapshotId = sourceSnapshotId;
    return this;
  }

  /**
   * [Output Only] The status of disk creation. CREATING: Disk is provisioning. RESTORING: Source
   * data is being copied into the disk. FAILED: Disk creation failed. READY: Disk is ready for use.
   * DELETING: Disk is deleting.
   * @return value or {@code null} for none
   */
  public java.lang.String getStatus() {
    return status;
  }

  /**
   * [Output Only] The status of disk creation. CREATING: Disk is provisioning. RESTORING: Source
   * data is being copied into the disk. FAILED: Disk creation failed. READY: Disk is ready for use.
   * DELETING: Disk is deleting.
   * @param status status or {@code null} for none
   */
  public Disk setStatus(java.lang.String status) {
    this.status = status;
    return this;
  }

  /**
   * [Deprecated] Storage type of the persistent disk.
   * @return value or {@code null} for none
   */
  public java.lang.String getStorageType() {
    return storageType;
  }

  /**
   * [Deprecated] Storage type of the persistent disk.
   * @param storageType storageType or {@code null} for none
   */
  public Disk setStorageType(java.lang.String storageType) {
    this.storageType = storageType;
    return this;
  }

  /**
   * URL of the disk type resource describing which disk type to use to create the disk. Provide
   * this when creating the disk. For example: projects/project/zones/zone/diskTypes/pd-standard or
   * pd-ssd
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * URL of the disk type resource describing which disk type to use to create the disk. Provide
   * this when creating the disk. For example: projects/project/zones/zone/diskTypes/pd-standard or
   * pd-ssd
   * @param type type or {@code null} for none
   */
  public Disk setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  /**
   * [Output Only] Links to the users of the disk (attached instances) in form:
   * projects/project/zones/zone/instances/instance
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getUsers() {
    return users;
  }

  /**
   * [Output Only] Links to the users of the disk (attached instances) in form:
   * projects/project/zones/zone/instances/instance
   * @param users users or {@code null} for none
   */
  public Disk setUsers(java.util.List<java.lang.String> users) {
    this.users = users;
    return this;
  }

  /**
   * [Output Only] URL of the zone where the disk resides. You must specify this field as part of
   * the HTTP request URL. It is not settable as a field in the request body.
   * @return value or {@code null} for none
   */
  public java.lang.String getZone() {
    return zone;
  }

  /**
   * [Output Only] URL of the zone where the disk resides. You must specify this field as part of
   * the HTTP request URL. It is not settable as a field in the request body.
   * @param zone zone or {@code null} for none
   */
  public Disk setZone(java.lang.String zone) {
    this.zone = zone;
    return this;
  }

  @Override
  public Disk set(String fieldName, Object value) {
    return (Disk) super.set(fieldName, value);
  }

  @Override
  public Disk clone() {
    return (Disk) super.clone();
  }

}
