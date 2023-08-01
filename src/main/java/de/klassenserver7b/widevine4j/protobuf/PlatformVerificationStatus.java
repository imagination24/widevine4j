// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: wv_proto2.proto

package de.klassenserver7b.widevine4j.protobuf;

/**
 * Protobuf enum {@code PlatformVerificationStatus}
 */
public enum PlatformVerificationStatus
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * The platform is not verified.
   * </pre>
   *
   * <code>PLATFORM_UNVERIFIED = 0;</code>
   */
  PLATFORM_UNVERIFIED(0),
  /**
   * <pre>
   * Tampering detected on the platform.
   * </pre>
   *
   * <code>PLATFORM_TAMPERED = 1;</code>
   */
  PLATFORM_TAMPERED(1),
  /**
   * <pre>
   * The platform has been verified by means of software.
   * </pre>
   *
   * <code>PLATFORM_SOFTWARE_VERIFIED = 2;</code>
   */
  PLATFORM_SOFTWARE_VERIFIED(2),
  /**
   * <pre>
   * The platform has been verified by means of hardware (e.g. secure boot).
   * </pre>
   *
   * <code>PLATFORM_HARDWARE_VERIFIED = 3;</code>
   */
  PLATFORM_HARDWARE_VERIFIED(3),
  /**
   * <pre>
   * Platform verification was not performed.
   * </pre>
   *
   * <code>PLATFORM_NO_VERIFICATION = 4;</code>
   */
  PLATFORM_NO_VERIFICATION(4),
  /**
   * <pre>
   * Platform and secure storage capability have been verified by means of
   * software.
   * </pre>
   *
   * <code>PLATFORM_SECURE_STORAGE_SOFTWARE_VERIFIED = 5;</code>
   */
  PLATFORM_SECURE_STORAGE_SOFTWARE_VERIFIED(5),
  ;

  /**
   * <pre>
   * The platform is not verified.
   * </pre>
   *
   * <code>PLATFORM_UNVERIFIED = 0;</code>
   */
  public static final int PLATFORM_UNVERIFIED_VALUE = 0;
  /**
   * <pre>
   * Tampering detected on the platform.
   * </pre>
   *
   * <code>PLATFORM_TAMPERED = 1;</code>
   */
  public static final int PLATFORM_TAMPERED_VALUE = 1;
  /**
   * <pre>
   * The platform has been verified by means of software.
   * </pre>
   *
   * <code>PLATFORM_SOFTWARE_VERIFIED = 2;</code>
   */
  public static final int PLATFORM_SOFTWARE_VERIFIED_VALUE = 2;
  /**
   * <pre>
   * The platform has been verified by means of hardware (e.g. secure boot).
   * </pre>
   *
   * <code>PLATFORM_HARDWARE_VERIFIED = 3;</code>
   */
  public static final int PLATFORM_HARDWARE_VERIFIED_VALUE = 3;
  /**
   * <pre>
   * Platform verification was not performed.
   * </pre>
   *
   * <code>PLATFORM_NO_VERIFICATION = 4;</code>
   */
  public static final int PLATFORM_NO_VERIFICATION_VALUE = 4;
  /**
   * <pre>
   * Platform and secure storage capability have been verified by means of
   * software.
   * </pre>
   *
   * <code>PLATFORM_SECURE_STORAGE_SOFTWARE_VERIFIED = 5;</code>
   */
  public static final int PLATFORM_SECURE_STORAGE_SOFTWARE_VERIFIED_VALUE = 5;


  public final int getNumber() {
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static PlatformVerificationStatus valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static PlatformVerificationStatus forNumber(int value) {
    switch (value) {
      case 0: return PLATFORM_UNVERIFIED;
      case 1: return PLATFORM_TAMPERED;
      case 2: return PLATFORM_SOFTWARE_VERIFIED;
      case 3: return PLATFORM_HARDWARE_VERIFIED;
      case 4: return PLATFORM_NO_VERIFICATION;
      case 5: return PLATFORM_SECURE_STORAGE_SOFTWARE_VERIFIED;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<PlatformVerificationStatus>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      PlatformVerificationStatus> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<PlatformVerificationStatus>() {
          public PlatformVerificationStatus findValueByNumber(int number) {
            return PlatformVerificationStatus.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return de.klassenserver7b.widevine4j.protobuf.WvProto2.getDescriptor().getEnumTypes().get(1);
  }

  private static final PlatformVerificationStatus[] VALUES = values();

  public static PlatformVerificationStatus valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private PlatformVerificationStatus(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:PlatformVerificationStatus)
}

