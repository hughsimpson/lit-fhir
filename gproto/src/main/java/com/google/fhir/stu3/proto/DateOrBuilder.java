// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/google/fhir/proto/stu3/datatypes.proto

package com.google.fhir.stu3.proto;

public interface DateOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.fhir.stu3.proto.Date)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Primitive value for date
   * </pre>
   *
   * <code>int64 value_us = 1;</code>
   * @return The valueUs.
   */
  long getValueUs();

  /**
   * <code>string timezone = 2;</code>
   * @return The timezone.
   */
  java.lang.String getTimezone();
  /**
   * <code>string timezone = 2;</code>
   * @return The bytes for timezone.
   */
  com.google.protobuf.ByteString
      getTimezoneBytes();

  /**
   * <code>.google.fhir.stu3.proto.Date.Precision precision = 3;</code>
   * @return The enum numeric value on the wire for precision.
   */
  int getPrecisionValue();
  /**
   * <code>.google.fhir.stu3.proto.Date.Precision precision = 3;</code>
   * @return The precision.
   */
  com.google.fhir.stu3.proto.Date.Precision getPrecision();

  /**
   * <pre>
   * xml:id (or equivalent in JSON)
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.String id = 4;</code>
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   * <pre>
   * xml:id (or equivalent in JSON)
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.String id = 4;</code>
   * @return The id.
   */
  com.google.fhir.stu3.proto.String getId();
  /**
   * <pre>
   * xml:id (or equivalent in JSON)
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.String id = 4;</code>
   */
  com.google.fhir.stu3.proto.StringOrBuilder getIdOrBuilder();

  /**
   * <pre>
   * Additional Content defined by implementations
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Extension extension = 5;</code>
   */
  java.util.List<com.google.fhir.stu3.proto.Extension> 
      getExtensionList();
  /**
   * <pre>
   * Additional Content defined by implementations
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Extension extension = 5;</code>
   */
  com.google.fhir.stu3.proto.Extension getExtension(int index);
  /**
   * <pre>
   * Additional Content defined by implementations
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Extension extension = 5;</code>
   */
  int getExtensionCount();
  /**
   * <pre>
   * Additional Content defined by implementations
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Extension extension = 5;</code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.ExtensionOrBuilder> 
      getExtensionOrBuilderList();
  /**
   * <pre>
   * Additional Content defined by implementations
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Extension extension = 5;</code>
   */
  com.google.fhir.stu3.proto.ExtensionOrBuilder getExtensionOrBuilder(
      int index);
}
