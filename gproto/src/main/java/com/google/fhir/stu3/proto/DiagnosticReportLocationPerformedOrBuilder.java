// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/google/fhir/proto/stu3/extensions.proto

package com.google.fhir.stu3.proto;

public interface DiagnosticReportLocationPerformedOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.fhir.stu3.proto.DiagnosticReportLocationPerformed)
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
   * <code>.google.fhir.stu3.proto.Reference value_reference = 3 [(.google.fhir.proto.valid_reference_type) = "Location"];</code>
   * @return Whether the valueReference field is set.
   */
  boolean hasValueReference();
  /**
   * <pre>
   * Value of extension
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Reference value_reference = 3 [(.google.fhir.proto.valid_reference_type) = "Location"];</code>
   * @return The valueReference.
   */
  com.google.fhir.stu3.proto.Reference getValueReference();
  /**
   * <pre>
   * Value of extension
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Reference value_reference = 3 [(.google.fhir.proto.valid_reference_type) = "Location"];</code>
   */
  com.google.fhir.stu3.proto.ReferenceOrBuilder getValueReferenceOrBuilder();
}
