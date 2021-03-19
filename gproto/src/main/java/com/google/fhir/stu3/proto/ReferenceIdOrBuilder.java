// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/google/fhir/proto/stu3/datatypes.proto

package com.google.fhir.stu3.proto;

public interface ReferenceIdOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.fhir.stu3.proto.ReferenceId)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Primitive value for id
   * </pre>
   *
   * <code>string value = 1;</code>
   * @return The value.
   */
  java.lang.String getValue();
  /**
   * <pre>
   * Primitive value for id
   * </pre>
   *
   * <code>string value = 1;</code>
   * @return The bytes for value.
   */
  com.google.protobuf.ByteString
      getValueBytes();

  /**
   * <pre>
   * History version, if present.
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Id history = 2;</code>
   * @return Whether the history field is set.
   */
  boolean hasHistory();
  /**
   * <pre>
   * History version, if present.
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Id history = 2;</code>
   * @return The history.
   */
  com.google.fhir.stu3.proto.Id getHistory();
  /**
   * <pre>
   * History version, if present.
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Id history = 2;</code>
   */
  com.google.fhir.stu3.proto.IdOrBuilder getHistoryOrBuilder();

  /**
   * <pre>
   * xml:id (or equivalent in JSON)
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.String id = 3;</code>
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   * <pre>
   * xml:id (or equivalent in JSON)
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.String id = 3;</code>
   * @return The id.
   */
  com.google.fhir.stu3.proto.String getId();
  /**
   * <pre>
   * xml:id (or equivalent in JSON)
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.String id = 3;</code>
   */
  com.google.fhir.stu3.proto.StringOrBuilder getIdOrBuilder();

  /**
   * <pre>
   * Additional Content defined by implementations
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Extension extension = 4;</code>
   */
  java.util.List<com.google.fhir.stu3.proto.Extension> 
      getExtensionList();
  /**
   * <pre>
   * Additional Content defined by implementations
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Extension extension = 4;</code>
   */
  com.google.fhir.stu3.proto.Extension getExtension(int index);
  /**
   * <pre>
   * Additional Content defined by implementations
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Extension extension = 4;</code>
   */
  int getExtensionCount();
  /**
   * <pre>
   * Additional Content defined by implementations
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Extension extension = 4;</code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.ExtensionOrBuilder> 
      getExtensionOrBuilderList();
  /**
   * <pre>
   * Additional Content defined by implementations
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Extension extension = 4;</code>
   */
  com.google.fhir.stu3.proto.ExtensionOrBuilder getExtensionOrBuilder(
      int index);
}
