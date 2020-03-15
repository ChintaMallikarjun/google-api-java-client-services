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
 * Represents an Image resource.
 *
 * You can use images to create boot disks for your VM instances. For more information, read Images.
 * (== resource_for {$api_version}.images ==)
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Image extends com.google.api.client.json.GenericJson {

  /**
   * Size of the image tar.gz archive stored in Google Cloud Storage (in bytes).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long archiveSizeBytes;

  /**
   * [Output Only] Creation timestamp in RFC3339 text format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String creationTimestamp;

  /**
   * The deprecation status associated with this image.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DeprecationStatus deprecated;

  /**
   * An optional description of this resource. Provide this property when you create the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Size of the image when restored onto a persistent disk (in GB).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long diskSizeGb;

  /**
   * The name of the image family to which this image belongs. You can create disks by specifying an
   * image family instead of a specific image name. The image family always returns its latest image
   * that is not deprecated. The name of the image family must comply with RFC1035.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String family;

  /**
   * A list of features to enable on the guest operating system. Applicable only for bootable
   * images. Read  Enabling guest operating system features to see a list of available options.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GuestOsFeature> guestOsFeatures;

  static {
    // hack to force ProGuard to consider GuestOsFeature used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GuestOsFeature.class);
  }

  /**
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.math.BigInteger id;

  /**
   * Encrypts the image using a customer-supplied encryption key.
   *
   * After you encrypt an image with a customer-supplied key, you must provide the same key if you
   * use the image later (e.g. to create a disk from the image).
   *
   * Customer-supplied encryption keys do not protect access to metadata of the disk.
   *
   * If you do not provide an encryption key when creating the image, then the disk will be
   * encrypted using an automatically generated key and you do not need to provide a key to use the
   * image later.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private CustomerEncryptionKey imageEncryptionKey;

  /**
   * [Output Only] Type of the resource. Always compute#image for images.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * A fingerprint for the labels being applied to this image, which is essentially a hash of the
   * labels used for optimistic locking. The fingerprint is initially generated by Compute Engine
   * and changes after every request to modify or update labels. You must always provide an up-to-
   * date fingerprint hash in order to update or change labels, otherwise the request will fail with
   * error 412 conditionNotMet.
   *
   * To see the latest fingerprint, make a get() request to retrieve an image.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String labelFingerprint;

  /**
   * Labels to apply to this image. These can be later modified by the setLabels method.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * Integer license codes indicating which licenses are attached to this image.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.util.List<java.lang.Long> licenseCodes;

  /**
   * Any applicable license URI.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> licenses;

  /**
   * Name of the resource; provided by the client when the resource is created. The name must be
   * 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   * long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   * character must be a lowercase letter, and all following characters must be a dash, lowercase
   * letter, or digit, except the last character, which cannot be a dash.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The parameters of the raw disk image.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private RawDisk rawDisk;

  /**
   * [Output Only] Server-defined URL for the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String selfLink;

  /**
   * Set the secure boot keys of shielded instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private InitialStateConfig shieldedInstanceInitialState;

  /**
   * URL of the source disk used to create this image. This can be a full or valid partial URL. You
   * must provide either this property or the rawDisk.source property but not both to create an
   * image. For example, the following are valid values: -
   * https://www.googleapis.com/compute/v1/projects/project/zones/zone/disks/disk  -
   * projects/project/zones/zone/disks/disk  - zones/zone/disks/disk
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sourceDisk;

  /**
   * The customer-supplied encryption key of the source disk. Required if the source disk is
   * protected by a customer-supplied encryption key.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private CustomerEncryptionKey sourceDiskEncryptionKey;

  /**
   * [Output Only] The ID value of the disk used to create this image. This value may be used to
   * determine whether the image was taken from the current or a previous instance of a given disk
   * name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sourceDiskId;

  /**
   * URL of the source image used to create this image. This can be a full or valid partial URL. You
   * must provide exactly one of: - this property, or   - the rawDisk.source property, or   - the
   * sourceDisk property   in order to create an image.
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
   * [Output Only] The ID value of the image used to create this image. This value may be used to
   * determine whether the image was taken from the current or a previous instance of a given image
   * name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sourceImageId;

  /**
   * URL of the source snapshot used to create this image. This can be a full or valid partial URL.
   * You must provide exactly one of: - this property, or   - the sourceImage property, or   - the
   * rawDisk.source property, or   - the sourceDisk property   in order to create an image.
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
   * [Output Only] The ID value of the snapshot used to create this image. This value may be used to
   * determine whether the snapshot was taken from the current or a previous instance of a given
   * snapshot name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sourceSnapshotId;

  /**
   * The type of the image used to create this disk. The default and only value is RAW
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sourceType;

  /**
   * [Output Only] The status of the image. An image can be used to create other resources, such as
   * instances, only after the image has been successfully created and the status is set to READY.
   * Possible values are FAILED, PENDING, or READY.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String status;

  /**
   * Cloud Storage bucket storage location of the image (regional or multi-regional).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> storageLocations;

  /**
   * Size of the image tar.gz archive stored in Google Cloud Storage (in bytes).
   * @return value or {@code null} for none
   */
  public java.lang.Long getArchiveSizeBytes() {
    return archiveSizeBytes;
  }

  /**
   * Size of the image tar.gz archive stored in Google Cloud Storage (in bytes).
   * @param archiveSizeBytes archiveSizeBytes or {@code null} for none
   */
  public Image setArchiveSizeBytes(java.lang.Long archiveSizeBytes) {
    this.archiveSizeBytes = archiveSizeBytes;
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
  public Image setCreationTimestamp(java.lang.String creationTimestamp) {
    this.creationTimestamp = creationTimestamp;
    return this;
  }

  /**
   * The deprecation status associated with this image.
   * @return value or {@code null} for none
   */
  public DeprecationStatus getDeprecated() {
    return deprecated;
  }

  /**
   * The deprecation status associated with this image.
   * @param deprecated deprecated or {@code null} for none
   */
  public Image setDeprecated(DeprecationStatus deprecated) {
    this.deprecated = deprecated;
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
  public Image setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Size of the image when restored onto a persistent disk (in GB).
   * @return value or {@code null} for none
   */
  public java.lang.Long getDiskSizeGb() {
    return diskSizeGb;
  }

  /**
   * Size of the image when restored onto a persistent disk (in GB).
   * @param diskSizeGb diskSizeGb or {@code null} for none
   */
  public Image setDiskSizeGb(java.lang.Long diskSizeGb) {
    this.diskSizeGb = diskSizeGb;
    return this;
  }

  /**
   * The name of the image family to which this image belongs. You can create disks by specifying an
   * image family instead of a specific image name. The image family always returns its latest image
   * that is not deprecated. The name of the image family must comply with RFC1035.
   * @return value or {@code null} for none
   */
  public java.lang.String getFamily() {
    return family;
  }

  /**
   * The name of the image family to which this image belongs. You can create disks by specifying an
   * image family instead of a specific image name. The image family always returns its latest image
   * that is not deprecated. The name of the image family must comply with RFC1035.
   * @param family family or {@code null} for none
   */
  public Image setFamily(java.lang.String family) {
    this.family = family;
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
  public Image setGuestOsFeatures(java.util.List<GuestOsFeature> guestOsFeatures) {
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
  public Image setId(java.math.BigInteger id) {
    this.id = id;
    return this;
  }

  /**
   * Encrypts the image using a customer-supplied encryption key.
   *
   * After you encrypt an image with a customer-supplied key, you must provide the same key if you
   * use the image later (e.g. to create a disk from the image).
   *
   * Customer-supplied encryption keys do not protect access to metadata of the disk.
   *
   * If you do not provide an encryption key when creating the image, then the disk will be
   * encrypted using an automatically generated key and you do not need to provide a key to use the
   * image later.
   * @return value or {@code null} for none
   */
  public CustomerEncryptionKey getImageEncryptionKey() {
    return imageEncryptionKey;
  }

  /**
   * Encrypts the image using a customer-supplied encryption key.
   *
   * After you encrypt an image with a customer-supplied key, you must provide the same key if you
   * use the image later (e.g. to create a disk from the image).
   *
   * Customer-supplied encryption keys do not protect access to metadata of the disk.
   *
   * If you do not provide an encryption key when creating the image, then the disk will be
   * encrypted using an automatically generated key and you do not need to provide a key to use the
   * image later.
   * @param imageEncryptionKey imageEncryptionKey or {@code null} for none
   */
  public Image setImageEncryptionKey(CustomerEncryptionKey imageEncryptionKey) {
    this.imageEncryptionKey = imageEncryptionKey;
    return this;
  }

  /**
   * [Output Only] Type of the resource. Always compute#image for images.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * [Output Only] Type of the resource. Always compute#image for images.
   * @param kind kind or {@code null} for none
   */
  public Image setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * A fingerprint for the labels being applied to this image, which is essentially a hash of the
   * labels used for optimistic locking. The fingerprint is initially generated by Compute Engine
   * and changes after every request to modify or update labels. You must always provide an up-to-
   * date fingerprint hash in order to update or change labels, otherwise the request will fail with
   * error 412 conditionNotMet.
   *
   * To see the latest fingerprint, make a get() request to retrieve an image.
   * @see #decodeLabelFingerprint()
   * @return value or {@code null} for none
   */
  public java.lang.String getLabelFingerprint() {
    return labelFingerprint;
  }

  /**
   * A fingerprint for the labels being applied to this image, which is essentially a hash of the
   * labels used for optimistic locking. The fingerprint is initially generated by Compute Engine
   * and changes after every request to modify or update labels. You must always provide an up-to-
   * date fingerprint hash in order to update or change labels, otherwise the request will fail with
   * error 412 conditionNotMet.
   *
   * To see the latest fingerprint, make a get() request to retrieve an image.
   * @see #getLabelFingerprint()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeLabelFingerprint() {
    return com.google.api.client.util.Base64.decodeBase64(labelFingerprint);
  }

  /**
   * A fingerprint for the labels being applied to this image, which is essentially a hash of the
   * labels used for optimistic locking. The fingerprint is initially generated by Compute Engine
   * and changes after every request to modify or update labels. You must always provide an up-to-
   * date fingerprint hash in order to update or change labels, otherwise the request will fail with
   * error 412 conditionNotMet.
   *
   * To see the latest fingerprint, make a get() request to retrieve an image.
   * @see #encodeLabelFingerprint()
   * @param labelFingerprint labelFingerprint or {@code null} for none
   */
  public Image setLabelFingerprint(java.lang.String labelFingerprint) {
    this.labelFingerprint = labelFingerprint;
    return this;
  }

  /**
   * A fingerprint for the labels being applied to this image, which is essentially a hash of the
   * labels used for optimistic locking. The fingerprint is initially generated by Compute Engine
   * and changes after every request to modify or update labels. You must always provide an up-to-
   * date fingerprint hash in order to update or change labels, otherwise the request will fail with
   * error 412 conditionNotMet.
   *
   * To see the latest fingerprint, make a get() request to retrieve an image.
   * @see #setLabelFingerprint()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public Image encodeLabelFingerprint(byte[] labelFingerprint) {
    this.labelFingerprint = com.google.api.client.util.Base64.encodeBase64URLSafeString(labelFingerprint);
    return this;
  }

  /**
   * Labels to apply to this image. These can be later modified by the setLabels method.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * Labels to apply to this image. These can be later modified by the setLabels method.
   * @param labels labels or {@code null} for none
   */
  public Image setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * Integer license codes indicating which licenses are attached to this image.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.Long> getLicenseCodes() {
    return licenseCodes;
  }

  /**
   * Integer license codes indicating which licenses are attached to this image.
   * @param licenseCodes licenseCodes or {@code null} for none
   */
  public Image setLicenseCodes(java.util.List<java.lang.Long> licenseCodes) {
    this.licenseCodes = licenseCodes;
    return this;
  }

  /**
   * Any applicable license URI.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getLicenses() {
    return licenses;
  }

  /**
   * Any applicable license URI.
   * @param licenses licenses or {@code null} for none
   */
  public Image setLicenses(java.util.List<java.lang.String> licenses) {
    this.licenses = licenses;
    return this;
  }

  /**
   * Name of the resource; provided by the client when the resource is created. The name must be
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
   * Name of the resource; provided by the client when the resource is created. The name must be
   * 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   * long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   * character must be a lowercase letter, and all following characters must be a dash, lowercase
   * letter, or digit, except the last character, which cannot be a dash.
   * @param name name or {@code null} for none
   */
  public Image setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The parameters of the raw disk image.
   * @return value or {@code null} for none
   */
  public RawDisk getRawDisk() {
    return rawDisk;
  }

  /**
   * The parameters of the raw disk image.
   * @param rawDisk rawDisk or {@code null} for none
   */
  public Image setRawDisk(RawDisk rawDisk) {
    this.rawDisk = rawDisk;
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
  public Image setSelfLink(java.lang.String selfLink) {
    this.selfLink = selfLink;
    return this;
  }

  /**
   * Set the secure boot keys of shielded instance.
   * @return value or {@code null} for none
   */
  public InitialStateConfig getShieldedInstanceInitialState() {
    return shieldedInstanceInitialState;
  }

  /**
   * Set the secure boot keys of shielded instance.
   * @param shieldedInstanceInitialState shieldedInstanceInitialState or {@code null} for none
   */
  public Image setShieldedInstanceInitialState(InitialStateConfig shieldedInstanceInitialState) {
    this.shieldedInstanceInitialState = shieldedInstanceInitialState;
    return this;
  }

  /**
   * URL of the source disk used to create this image. This can be a full or valid partial URL. You
   * must provide either this property or the rawDisk.source property but not both to create an
   * image. For example, the following are valid values: -
   * https://www.googleapis.com/compute/v1/projects/project/zones/zone/disks/disk  -
   * projects/project/zones/zone/disks/disk  - zones/zone/disks/disk
   * @return value or {@code null} for none
   */
  public java.lang.String getSourceDisk() {
    return sourceDisk;
  }

  /**
   * URL of the source disk used to create this image. This can be a full or valid partial URL. You
   * must provide either this property or the rawDisk.source property but not both to create an
   * image. For example, the following are valid values: -
   * https://www.googleapis.com/compute/v1/projects/project/zones/zone/disks/disk  -
   * projects/project/zones/zone/disks/disk  - zones/zone/disks/disk
   * @param sourceDisk sourceDisk or {@code null} for none
   */
  public Image setSourceDisk(java.lang.String sourceDisk) {
    this.sourceDisk = sourceDisk;
    return this;
  }

  /**
   * The customer-supplied encryption key of the source disk. Required if the source disk is
   * protected by a customer-supplied encryption key.
   * @return value or {@code null} for none
   */
  public CustomerEncryptionKey getSourceDiskEncryptionKey() {
    return sourceDiskEncryptionKey;
  }

  /**
   * The customer-supplied encryption key of the source disk. Required if the source disk is
   * protected by a customer-supplied encryption key.
   * @param sourceDiskEncryptionKey sourceDiskEncryptionKey or {@code null} for none
   */
  public Image setSourceDiskEncryptionKey(CustomerEncryptionKey sourceDiskEncryptionKey) {
    this.sourceDiskEncryptionKey = sourceDiskEncryptionKey;
    return this;
  }

  /**
   * [Output Only] The ID value of the disk used to create this image. This value may be used to
   * determine whether the image was taken from the current or a previous instance of a given disk
   * name.
   * @return value or {@code null} for none
   */
  public java.lang.String getSourceDiskId() {
    return sourceDiskId;
  }

  /**
   * [Output Only] The ID value of the disk used to create this image. This value may be used to
   * determine whether the image was taken from the current or a previous instance of a given disk
   * name.
   * @param sourceDiskId sourceDiskId or {@code null} for none
   */
  public Image setSourceDiskId(java.lang.String sourceDiskId) {
    this.sourceDiskId = sourceDiskId;
    return this;
  }

  /**
   * URL of the source image used to create this image. This can be a full or valid partial URL. You
   * must provide exactly one of: - this property, or   - the rawDisk.source property, or   - the
   * sourceDisk property   in order to create an image.
   * @return value or {@code null} for none
   */
  public java.lang.String getSourceImage() {
    return sourceImage;
  }

  /**
   * URL of the source image used to create this image. This can be a full or valid partial URL. You
   * must provide exactly one of: - this property, or   - the rawDisk.source property, or   - the
   * sourceDisk property   in order to create an image.
   * @param sourceImage sourceImage or {@code null} for none
   */
  public Image setSourceImage(java.lang.String sourceImage) {
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
  public Image setSourceImageEncryptionKey(CustomerEncryptionKey sourceImageEncryptionKey) {
    this.sourceImageEncryptionKey = sourceImageEncryptionKey;
    return this;
  }

  /**
   * [Output Only] The ID value of the image used to create this image. This value may be used to
   * determine whether the image was taken from the current or a previous instance of a given image
   * name.
   * @return value or {@code null} for none
   */
  public java.lang.String getSourceImageId() {
    return sourceImageId;
  }

  /**
   * [Output Only] The ID value of the image used to create this image. This value may be used to
   * determine whether the image was taken from the current or a previous instance of a given image
   * name.
   * @param sourceImageId sourceImageId or {@code null} for none
   */
  public Image setSourceImageId(java.lang.String sourceImageId) {
    this.sourceImageId = sourceImageId;
    return this;
  }

  /**
   * URL of the source snapshot used to create this image. This can be a full or valid partial URL.
   * You must provide exactly one of: - this property, or   - the sourceImage property, or   - the
   * rawDisk.source property, or   - the sourceDisk property   in order to create an image.
   * @return value or {@code null} for none
   */
  public java.lang.String getSourceSnapshot() {
    return sourceSnapshot;
  }

  /**
   * URL of the source snapshot used to create this image. This can be a full or valid partial URL.
   * You must provide exactly one of: - this property, or   - the sourceImage property, or   - the
   * rawDisk.source property, or   - the sourceDisk property   in order to create an image.
   * @param sourceSnapshot sourceSnapshot or {@code null} for none
   */
  public Image setSourceSnapshot(java.lang.String sourceSnapshot) {
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
  public Image setSourceSnapshotEncryptionKey(CustomerEncryptionKey sourceSnapshotEncryptionKey) {
    this.sourceSnapshotEncryptionKey = sourceSnapshotEncryptionKey;
    return this;
  }

  /**
   * [Output Only] The ID value of the snapshot used to create this image. This value may be used to
   * determine whether the snapshot was taken from the current or a previous instance of a given
   * snapshot name.
   * @return value or {@code null} for none
   */
  public java.lang.String getSourceSnapshotId() {
    return sourceSnapshotId;
  }

  /**
   * [Output Only] The ID value of the snapshot used to create this image. This value may be used to
   * determine whether the snapshot was taken from the current or a previous instance of a given
   * snapshot name.
   * @param sourceSnapshotId sourceSnapshotId or {@code null} for none
   */
  public Image setSourceSnapshotId(java.lang.String sourceSnapshotId) {
    this.sourceSnapshotId = sourceSnapshotId;
    return this;
  }

  /**
   * The type of the image used to create this disk. The default and only value is RAW
   * @return value or {@code null} for none
   */
  public java.lang.String getSourceType() {
    return sourceType;
  }

  /**
   * The type of the image used to create this disk. The default and only value is RAW
   * @param sourceType sourceType or {@code null} for none
   */
  public Image setSourceType(java.lang.String sourceType) {
    this.sourceType = sourceType;
    return this;
  }

  /**
   * [Output Only] The status of the image. An image can be used to create other resources, such as
   * instances, only after the image has been successfully created and the status is set to READY.
   * Possible values are FAILED, PENDING, or READY.
   * @return value or {@code null} for none
   */
  public java.lang.String getStatus() {
    return status;
  }

  /**
   * [Output Only] The status of the image. An image can be used to create other resources, such as
   * instances, only after the image has been successfully created and the status is set to READY.
   * Possible values are FAILED, PENDING, or READY.
   * @param status status or {@code null} for none
   */
  public Image setStatus(java.lang.String status) {
    this.status = status;
    return this;
  }

  /**
   * Cloud Storage bucket storage location of the image (regional or multi-regional).
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getStorageLocations() {
    return storageLocations;
  }

  /**
   * Cloud Storage bucket storage location of the image (regional or multi-regional).
   * @param storageLocations storageLocations or {@code null} for none
   */
  public Image setStorageLocations(java.util.List<java.lang.String> storageLocations) {
    this.storageLocations = storageLocations;
    return this;
  }

  @Override
  public Image set(String fieldName, Object value) {
    return (Image) super.set(fieldName, value);
  }

  @Override
  public Image clone() {
    return (Image) super.clone();
  }

  /**
   * The parameters of the raw disk image.
   */
  public static final class RawDisk extends com.google.api.client.json.GenericJson {

    /**
     * The format used to encode and transmit the block device, which should be TAR. This is just a
     * container and transmission format and not a runtime format. Provided by the client when the
     * disk image is created.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String containerType;

    /**
     * [Deprecated] This field is deprecated. An optional SHA1 checksum of the disk image before
     * unpackaging provided by the client when the disk image is created.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String sha1Checksum;

    /**
     * The full Google Cloud Storage URL where the disk image is stored. You must provide either this
     * property or the sourceDisk property but not both.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String source;

    /**
     * The format used to encode and transmit the block device, which should be TAR. This is just a
     * container and transmission format and not a runtime format. Provided by the client when the
     * disk image is created.
     * @return value or {@code null} for none
     */
    public java.lang.String getContainerType() {
      return containerType;
    }

    /**
     * The format used to encode and transmit the block device, which should be TAR. This is just a
     * container and transmission format and not a runtime format. Provided by the client when the
     * disk image is created.
     * @param containerType containerType or {@code null} for none
     */
    public RawDisk setContainerType(java.lang.String containerType) {
      this.containerType = containerType;
      return this;
    }

    /**
     * [Deprecated] This field is deprecated. An optional SHA1 checksum of the disk image before
     * unpackaging provided by the client when the disk image is created.
     * @return value or {@code null} for none
     */
    public java.lang.String getSha1Checksum() {
      return sha1Checksum;
    }

    /**
     * [Deprecated] This field is deprecated. An optional SHA1 checksum of the disk image before
     * unpackaging provided by the client when the disk image is created.
     * @param sha1Checksum sha1Checksum or {@code null} for none
     */
    public RawDisk setSha1Checksum(java.lang.String sha1Checksum) {
      this.sha1Checksum = sha1Checksum;
      return this;
    }

    /**
     * The full Google Cloud Storage URL where the disk image is stored. You must provide either this
     * property or the sourceDisk property but not both.
     * @return value or {@code null} for none
     */
    public java.lang.String getSource() {
      return source;
    }

    /**
     * The full Google Cloud Storage URL where the disk image is stored. You must provide either this
     * property or the sourceDisk property but not both.
     * @param source source or {@code null} for none
     */
    public RawDisk setSource(java.lang.String source) {
      this.source = source;
      return this;
    }

    @Override
    public RawDisk set(String fieldName, Object value) {
      return (RawDisk) super.set(fieldName, value);
    }

    @Override
    public RawDisk clone() {
      return (RawDisk) super.clone();
    }

  }

}
