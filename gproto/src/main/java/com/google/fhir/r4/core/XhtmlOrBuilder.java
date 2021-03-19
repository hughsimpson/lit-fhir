// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/google/fhir/proto/r4/core/datatypes.proto

package com.google.fhir.r4.core;

public interface XhtmlOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.fhir.r4.core.Xhtml)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Actual xhtml
   * </pre>
   *
   * <code>string value = 1 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   * @return The value.
   */
  java.lang.String getValue();
  /**
   * <pre>
   * Actual xhtml
   * </pre>
   *
   * <code>string value = 1 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   * @return The bytes for value.
   */
  com.google.protobuf.ByteString
      getValueBytes();

  /**
   * <pre>
   * xml:id (or equivalent in JSON)
   * </pre>
   *
   * <code>.google.fhir.r4.core.String id = 2;</code>
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   * <pre>
   * xml:id (or equivalent in JSON)
   * </pre>
   *
   * <code>.google.fhir.r4.core.String id = 2;</code>
   * @return The id.
   */
  com.google.fhir.r4.core.String getId();
  /**
   * <pre>
   * xml:id (or equivalent in JSON)
   * </pre>
   *
   * <code>.google.fhir.r4.core.String id = 2;</code>
   */
  com.google.fhir.r4.core.StringOrBuilder getIdOrBuilder();
}
