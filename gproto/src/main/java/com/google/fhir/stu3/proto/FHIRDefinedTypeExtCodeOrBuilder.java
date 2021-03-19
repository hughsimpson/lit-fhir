// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/google/fhir/proto/stu3/codes.proto

package com.google.fhir.stu3.proto;

public interface FHIRDefinedTypeExtCodeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.fhir.stu3.proto.FHIRDefinedTypeExtCode)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string value = 1;</code>
   * @return The value.
   */
  java.lang.String getValue();
  /**
   * <code>string value = 1;</code>
   * @return The bytes for value.
   */
  com.google.protobuf.ByteString
      getValueBytes();

  /**
   * <code>.google.fhir.stu3.proto.String id = 2;</code>
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   * <code>.google.fhir.stu3.proto.String id = 2;</code>
   * @return The id.
   */
  com.google.fhir.stu3.proto.String getId();
  /**
   * <code>.google.fhir.stu3.proto.String id = 2;</code>
   */
  com.google.fhir.stu3.proto.StringOrBuilder getIdOrBuilder();

  /**
   * <code>repeated .google.fhir.stu3.proto.Extension extension = 3;</code>
   */
  java.util.List<com.google.fhir.stu3.proto.Extension> 
      getExtensionList();
  /**
   * <code>repeated .google.fhir.stu3.proto.Extension extension = 3;</code>
   */
  com.google.fhir.stu3.proto.Extension getExtension(int index);
  /**
   * <code>repeated .google.fhir.stu3.proto.Extension extension = 3;</code>
   */
  int getExtensionCount();
  /**
   * <code>repeated .google.fhir.stu3.proto.Extension extension = 3;</code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.ExtensionOrBuilder> 
      getExtensionOrBuilderList();
  /**
   * <code>repeated .google.fhir.stu3.proto.Extension extension = 3;</code>
   */
  com.google.fhir.stu3.proto.ExtensionOrBuilder getExtensionOrBuilder(
      int index);
}
