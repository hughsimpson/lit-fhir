// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/google/fhir/proto/stu3/extensions.proto

package com.google.fhir.stu3.proto;

public interface ElementDefinitionObjectClassPropertyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.fhir.stu3.proto.ElementDefinitionObjectClassProperty)
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
   * <code>.google.fhir.stu3.proto.Coding value_coding = 3;</code>
   * @return Whether the valueCoding field is set.
   */
  boolean hasValueCoding();
  /**
   * <pre>
   * Value of extension
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Coding value_coding = 3;</code>
   * @return The valueCoding.
   */
  com.google.fhir.stu3.proto.Coding getValueCoding();
  /**
   * <pre>
   * Value of extension
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Coding value_coding = 3;</code>
   */
  com.google.fhir.stu3.proto.CodingOrBuilder getValueCodingOrBuilder();
}
