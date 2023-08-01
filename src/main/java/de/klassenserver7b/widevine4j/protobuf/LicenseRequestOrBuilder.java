// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: wv_proto2.proto

package de.klassenserver7b.widevine4j.protobuf;

public interface LicenseRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:LicenseRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The client_id provides information authenticating the calling device.  It
   * contains the Widevine keybox token that was installed on the device at the
   * factory.  This field or encrypted_client_id below is required for a valid
   * license request, but both should never be present in the same request.
   * </pre>
   *
   * <code>optional .ClientIdentification client_id = 1;</code>
   * @return Whether the clientId field is set.
   */
  boolean hasClientId();
  /**
   * <pre>
   * The client_id provides information authenticating the calling device.  It
   * contains the Widevine keybox token that was installed on the device at the
   * factory.  This field or encrypted_client_id below is required for a valid
   * license request, but both should never be present in the same request.
   * </pre>
   *
   * <code>optional .ClientIdentification client_id = 1;</code>
   * @return The clientId.
   */
  de.klassenserver7b.widevine4j.protobuf.ClientIdentification getClientId();
  /**
   * <pre>
   * The client_id provides information authenticating the calling device.  It
   * contains the Widevine keybox token that was installed on the device at the
   * factory.  This field or encrypted_client_id below is required for a valid
   * license request, but both should never be present in the same request.
   * </pre>
   *
   * <code>optional .ClientIdentification client_id = 1;</code>
   */
  de.klassenserver7b.widevine4j.protobuf.ClientIdentificationOrBuilder getClientIdOrBuilder();

  /**
   * <code>optional .LicenseRequest.ContentIdentification content_id = 2;</code>
   * @return Whether the contentId field is set.
   */
  boolean hasContentId();
  /**
   * <code>optional .LicenseRequest.ContentIdentification content_id = 2;</code>
   * @return The contentId.
   */
  de.klassenserver7b.widevine4j.protobuf.LicenseRequest.ContentIdentification getContentId();
  /**
   * <code>optional .LicenseRequest.ContentIdentification content_id = 2;</code>
   */
  de.klassenserver7b.widevine4j.protobuf.LicenseRequest.ContentIdentificationOrBuilder getContentIdOrBuilder();

  /**
   * <code>optional .LicenseRequest.RequestType type = 3;</code>
   * @return Whether the type field is set.
   */
  boolean hasType();
  /**
   * <code>optional .LicenseRequest.RequestType type = 3;</code>
   * @return The type.
   */
  de.klassenserver7b.widevine4j.protobuf.LicenseRequest.RequestType getType();

  /**
   * <pre>
   * Time of the request in seconds (UTC) as set by the client.
   * </pre>
   *
   * <code>optional int64 request_time = 4;</code>
   * @return Whether the requestTime field is set.
   */
  boolean hasRequestTime();
  /**
   * <pre>
   * Time of the request in seconds (UTC) as set by the client.
   * </pre>
   *
   * <code>optional int64 request_time = 4;</code>
   * @return The requestTime.
   */
  long getRequestTime();

  /**
   * <pre>
   * Old-style decimal-encoded string key control nonce.
   * </pre>
   *
   * <code>optional bytes key_control_nonce_deprecated = 5;</code>
   * @return Whether the keyControlNonceDeprecated field is set.
   */
  boolean hasKeyControlNonceDeprecated();
  /**
   * <pre>
   * Old-style decimal-encoded string key control nonce.
   * </pre>
   *
   * <code>optional bytes key_control_nonce_deprecated = 5;</code>
   * @return The keyControlNonceDeprecated.
   */
  com.google.protobuf.ByteString getKeyControlNonceDeprecated();

  /**
   * <code>optional .ProtocolVersion protocol_version = 6 [default = VERSION_2_0];</code>
   * @return Whether the protocolVersion field is set.
   */
  boolean hasProtocolVersion();
  /**
   * <code>optional .ProtocolVersion protocol_version = 6 [default = VERSION_2_0];</code>
   * @return The protocolVersion.
   */
  de.klassenserver7b.widevine4j.protobuf.ProtocolVersion getProtocolVersion();

  /**
   * <pre>
   * New-style uint32 key control nonce, please use instead of
   * key_control_nonce_deprecated.
   * </pre>
   *
   * <code>optional uint32 key_control_nonce = 7;</code>
   * @return Whether the keyControlNonce field is set.
   */
  boolean hasKeyControlNonce();
  /**
   * <pre>
   * New-style uint32 key control nonce, please use instead of
   * key_control_nonce_deprecated.
   * </pre>
   *
   * <code>optional uint32 key_control_nonce = 7;</code>
   * @return The keyControlNonce.
   */
  int getKeyControlNonce();

  /**
   * <pre>
   * Encrypted ClientIdentification message, used for privacy purposes.
   * </pre>
   *
   * <code>optional .EncryptedClientIdentification encrypted_client_id = 8;</code>
   * @return Whether the encryptedClientId field is set.
   */
  boolean hasEncryptedClientId();
  /**
   * <pre>
   * Encrypted ClientIdentification message, used for privacy purposes.
   * </pre>
   *
   * <code>optional .EncryptedClientIdentification encrypted_client_id = 8;</code>
   * @return The encryptedClientId.
   */
  de.klassenserver7b.widevine4j.protobuf.EncryptedClientIdentification getEncryptedClientId();
  /**
   * <pre>
   * Encrypted ClientIdentification message, used for privacy purposes.
   * </pre>
   *
   * <code>optional .EncryptedClientIdentification encrypted_client_id = 8;</code>
   */
  de.klassenserver7b.widevine4j.protobuf.EncryptedClientIdentificationOrBuilder getEncryptedClientIdOrBuilder();
}
