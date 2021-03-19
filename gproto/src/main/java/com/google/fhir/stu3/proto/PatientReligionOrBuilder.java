// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/google/fhir/proto/stu3/extensions.proto

package com.google.fhir.stu3.proto;

public interface PatientReligionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.fhir.stu3.proto.PatientReligion)
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
   * <code>.google.fhir.stu3.proto.CodeableConcept value_codeable_concept = 3;</code>
   * @return Whether the valueCodeableConcept field is set.
   */
  boolean hasValueCodeableConcept();
  /**
   * <pre>
   * Value of extension
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.CodeableConcept value_codeable_concept = 3;</code>
   * @return The valueCodeableConcept.
   */
  com.google.fhir.stu3.proto.CodeableConcept getValueCodeableConcept();
  /**
   * <pre>
   * Value of extension
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.CodeableConcept value_codeable_concept = 3;</code>
   */
  com.google.fhir.stu3.proto.CodeableConceptOrBuilder getValueCodeableConceptOrBuilder();
}
