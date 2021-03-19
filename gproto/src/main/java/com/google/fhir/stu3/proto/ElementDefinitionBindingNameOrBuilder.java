// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/google/fhir/proto/stu3/extensions.proto

package com.google.fhir.stu3.proto;

public interface ElementDefinitionBindingNameOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.fhir.stu3.proto.ElementDefinitionBindingName)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * xml:id (or equivalent in JSON)
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.String id = 1;</code>
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   * <pre>
   * xml:id (or equivalent in JSON)
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.String id = 1;</code>
   * @return The id.
   */
  com.google.fhir.stu3.proto.String getId();
  /**
   * <pre>
   * xml:id (or equivalent in JSON)
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.String id = 1;</code>
   */
  com.google.fhir.stu3.proto.StringOrBuilder getIdOrBuilder();

  /**
   * <pre>
   * Value of extension
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.String value_string = 3;</code>
   * @return Whether the valueString field is set.
   */
  boolean hasValueString();
  /**
   * <pre>
   * Value of extension
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.String value_string = 3;</code>
   * @return The valueString.
   */
  com.google.fhir.stu3.proto.String getValueString();
  /**
   * <pre>
   * Value of extension
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.String value_string = 3;</code>
   */
  com.google.fhir.stu3.proto.StringOrBuilder getValueStringOrBuilder();
}
