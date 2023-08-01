// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: wv_proto2.proto

package de.klassenserver7b.widevine4j.protobuf;

public interface DrmCertificateOrBuilder extends
    // @@protoc_insertion_point(interface_extends:DrmCertificate)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Type of certificate. Required.
   * </pre>
   *
   * <code>optional .DrmCertificate.Type type = 1;</code>
   * @return Whether the type field is set.
   */
  boolean hasType();
  /**
   * <pre>
   * Type of certificate. Required.
   * </pre>
   *
   * <code>optional .DrmCertificate.Type type = 1;</code>
   * @return The type.
   */
  de.klassenserver7b.widevine4j.protobuf.DrmCertificate.Type getType();

  /**
   * <pre>
   * 128-bit globally unique serial number of certificate.
   * Value is 0 for root certificate. Required.
   * </pre>
   *
   * <code>optional bytes serial_number = 2;</code>
   * @return Whether the serialNumber field is set.
   */
  boolean hasSerialNumber();
  /**
   * <pre>
   * 128-bit globally unique serial number of certificate.
   * Value is 0 for root certificate. Required.
   * </pre>
   *
   * <code>optional bytes serial_number = 2;</code>
   * @return The serialNumber.
   */
  com.google.protobuf.ByteString getSerialNumber();

  /**
   * <pre>
   * POSIX time, in seconds, when the certificate was created. Required.
   * </pre>
   *
   * <code>optional uint32 creation_time_seconds = 3;</code>
   * @return Whether the creationTimeSeconds field is set.
   */
  boolean hasCreationTimeSeconds();
  /**
   * <pre>
   * POSIX time, in seconds, when the certificate was created. Required.
   * </pre>
   *
   * <code>optional uint32 creation_time_seconds = 3;</code>
   * @return The creationTimeSeconds.
   */
  int getCreationTimeSeconds();

  /**
   * <pre>
   * POSIX time, in seconds, when the certificate should expire. Value of zero
   * denotes indefinite expiry time. For more information on limited lifespan
   * DRM certificates see (go/limited-lifespan-drm-certificates).
   * </pre>
   *
   * <code>optional uint32 expiration_time_seconds = 12;</code>
   * @return Whether the expirationTimeSeconds field is set.
   */
  boolean hasExpirationTimeSeconds();
  /**
   * <pre>
   * POSIX time, in seconds, when the certificate should expire. Value of zero
   * denotes indefinite expiry time. For more information on limited lifespan
   * DRM certificates see (go/limited-lifespan-drm-certificates).
   * </pre>
   *
   * <code>optional uint32 expiration_time_seconds = 12;</code>
   * @return The expirationTimeSeconds.
   */
  int getExpirationTimeSeconds();

  /**
   * <pre>
   * Device public key. PKCS#1 ASN.1 DER-encoded. Required.
   * </pre>
   *
   * <code>optional bytes public_key = 4;</code>
   * @return Whether the publicKey field is set.
   */
  boolean hasPublicKey();
  /**
   * <pre>
   * Device public key. PKCS#1 ASN.1 DER-encoded. Required.
   * </pre>
   *
   * <code>optional bytes public_key = 4;</code>
   * @return The publicKey.
   */
  com.google.protobuf.ByteString getPublicKey();

  /**
   * <pre>
   * Widevine system ID for the device. Required for intermediate and
   * user device certificates.
   * </pre>
   *
   * <code>optional uint32 system_id = 5;</code>
   * @return Whether the systemId field is set.
   */
  boolean hasSystemId();
  /**
   * <pre>
   * Widevine system ID for the device. Required for intermediate and
   * user device certificates.
   * </pre>
   *
   * <code>optional uint32 system_id = 5;</code>
   * @return The systemId.
   */
  int getSystemId();

  /**
   * <pre>
   * Deprecated field, which used to indicate whether the device was a test
   * (non-production) device. The test_device field in ProvisionedDeviceInfo
   * below should be observed instead.
   * </pre>
   *
   * <code>optional bool test_device_deprecated = 6 [deprecated = true];</code>
   * @deprecated DrmCertificate.test_device_deprecated is deprecated.
   *     See wv_proto2.proto;l=598
   * @return Whether the testDeviceDeprecated field is set.
   */
  @java.lang.Deprecated boolean hasTestDeviceDeprecated();
  /**
   * <pre>
   * Deprecated field, which used to indicate whether the device was a test
   * (non-production) device. The test_device field in ProvisionedDeviceInfo
   * below should be observed instead.
   * </pre>
   *
   * <code>optional bool test_device_deprecated = 6 [deprecated = true];</code>
   * @deprecated DrmCertificate.test_device_deprecated is deprecated.
   *     See wv_proto2.proto;l=598
   * @return The testDeviceDeprecated.
   */
  @java.lang.Deprecated boolean getTestDeviceDeprecated();

  /**
   * <pre>
   * Service identifier (web origin) for the provider which owns the
   * certificate. Required for service and provisioner certificates.
   * </pre>
   *
   * <code>optional string provider_id = 7;</code>
   * @return Whether the providerId field is set.
   */
  boolean hasProviderId();
  /**
   * <pre>
   * Service identifier (web origin) for the provider which owns the
   * certificate. Required for service and provisioner certificates.
   * </pre>
   *
   * <code>optional string provider_id = 7;</code>
   * @return The providerId.
   */
  java.lang.String getProviderId();
  /**
   * <pre>
   * Service identifier (web origin) for the provider which owns the
   * certificate. Required for service and provisioner certificates.
   * </pre>
   *
   * <code>optional string provider_id = 7;</code>
   * @return The bytes for providerId.
   */
  com.google.protobuf.ByteString
      getProviderIdBytes();

  /**
   * <pre>
   * This field is used only when type = SERVICE to specify which SDK uses
   * service certificate. This repeated field is treated as a set. A certificate
   * may be used for the specified service SDK if the appropriate ServiceType
   * is specified in this field.
   * </pre>
   *
   * <code>repeated .DrmCertificate.ServiceType service_types = 8;</code>
   * @return A list containing the serviceTypes.
   */
  java.util.List<de.klassenserver7b.widevine4j.protobuf.DrmCertificate.ServiceType> getServiceTypesList();
  /**
   * <pre>
   * This field is used only when type = SERVICE to specify which SDK uses
   * service certificate. This repeated field is treated as a set. A certificate
   * may be used for the specified service SDK if the appropriate ServiceType
   * is specified in this field.
   * </pre>
   *
   * <code>repeated .DrmCertificate.ServiceType service_types = 8;</code>
   * @return The count of serviceTypes.
   */
  int getServiceTypesCount();
  /**
   * <pre>
   * This field is used only when type = SERVICE to specify which SDK uses
   * service certificate. This repeated field is treated as a set. A certificate
   * may be used for the specified service SDK if the appropriate ServiceType
   * is specified in this field.
   * </pre>
   *
   * <code>repeated .DrmCertificate.ServiceType service_types = 8;</code>
   * @param index The index of the element to return.
   * @return The serviceTypes at the given index.
   */
  de.klassenserver7b.widevine4j.protobuf.DrmCertificate.ServiceType getServiceTypes(int index);

  /**
   * <pre>
   * Required. The algorithm field contains the curve used to create the
   * |public_key| if algorithm is one of the ECC types.
   * The |algorithm| is used for both to determine the if the certificate is ECC
   * or RSA. The |algorithm| also specifies the parameters that were used to
   * create |public_key| and are used to create an ephemeral session key.
   * </pre>
   *
   * <code>optional .DrmCertificate.Algorithm algorithm = 9 [default = RSA];</code>
   * @return Whether the algorithm field is set.
   */
  boolean hasAlgorithm();
  /**
   * <pre>
   * Required. The algorithm field contains the curve used to create the
   * |public_key| if algorithm is one of the ECC types.
   * The |algorithm| is used for both to determine the if the certificate is ECC
   * or RSA. The |algorithm| also specifies the parameters that were used to
   * create |public_key| and are used to create an ephemeral session key.
   * </pre>
   *
   * <code>optional .DrmCertificate.Algorithm algorithm = 9 [default = RSA];</code>
   * @return The algorithm.
   */
  de.klassenserver7b.widevine4j.protobuf.DrmCertificate.Algorithm getAlgorithm();

  /**
   * <pre>
   * Optional. May be present in DEVICE certificate types. This is the root
   * of trust identifier that holds an encrypted value that identifies the
   * keybox or other root of trust that was used to provision a DEVICE drm
   * certificate.
   * </pre>
   *
   * <code>optional bytes rot_id = 10;</code>
   * @return Whether the rotId field is set.
   */
  boolean hasRotId();
  /**
   * <pre>
   * Optional. May be present in DEVICE certificate types. This is the root
   * of trust identifier that holds an encrypted value that identifies the
   * keybox or other root of trust that was used to provision a DEVICE drm
   * certificate.
   * </pre>
   *
   * <code>optional bytes rot_id = 10;</code>
   * @return The rotId.
   */
  com.google.protobuf.ByteString getRotId();

  /**
   * <pre>
   * Optional. May be present in devices that explicitly support dual keys. When
   * present the |public_key| is used for verification of received license
   * request messages.
   * </pre>
   *
   * <code>optional .DrmCertificate.EncryptionKey encryption_key = 11;</code>
   * @return Whether the encryptionKey field is set.
   */
  boolean hasEncryptionKey();
  /**
   * <pre>
   * Optional. May be present in devices that explicitly support dual keys. When
   * present the |public_key| is used for verification of received license
   * request messages.
   * </pre>
   *
   * <code>optional .DrmCertificate.EncryptionKey encryption_key = 11;</code>
   * @return The encryptionKey.
   */
  de.klassenserver7b.widevine4j.protobuf.DrmCertificate.EncryptionKey getEncryptionKey();
  /**
   * <pre>
   * Optional. May be present in devices that explicitly support dual keys. When
   * present the |public_key| is used for verification of received license
   * request messages.
   * </pre>
   *
   * <code>optional .DrmCertificate.EncryptionKey encryption_key = 11;</code>
   */
  de.klassenserver7b.widevine4j.protobuf.DrmCertificate.EncryptionKeyOrBuilder getEncryptionKeyOrBuilder();
}
