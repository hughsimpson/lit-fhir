// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/google/fhir/proto/stu3/extensions.proto

package com.google.fhir.stu3.proto;

public interface FamilyMemberHistoryParentOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.fhir.stu3.proto.FamilyMemberHistoryParent)
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
   * Additional Content defined by implementations
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Extension extension = 2;</code>
   */
  java.util.List<com.google.fhir.stu3.proto.Extension> 
      getExtensionList();
  /**
   * <pre>
   * Additional Content defined by implementations
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Extension extension = 2;</code>
   */
  com.google.fhir.stu3.proto.Extension getExtension(int index);
  /**
   * <pre>
   * Additional Content defined by implementations
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Extension extension = 2;</code>
   */
  int getExtensionCount();
  /**
   * <pre>
   * Additional Content defined by implementations
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Extension extension = 2;</code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.ExtensionOrBuilder> 
      getExtensionOrBuilderList();
  /**
   * <pre>
   * Additional Content defined by implementations
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Extension extension = 2;</code>
   */
  com.google.fhir.stu3.proto.ExtensionOrBuilder getExtensionOrBuilder(
      int index);

  /**
   * <pre>
   * mother | father | adoptive mother | etc.
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.CodeableConcept type = 4 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   * @return Whether the type field is set.
   */
  boolean hasType();
  /**
   * <pre>
   * mother | father | adoptive mother | etc.
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.CodeableConcept type = 4 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   * @return The type.
   */
  com.google.fhir.stu3.proto.CodeableConcept getType();
  /**
   * <pre>
   * mother | father | adoptive mother | etc.
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.CodeableConcept type = 4 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   */
  com.google.fhir.stu3.proto.CodeableConceptOrBuilder getTypeOrBuilder();

  /**
   * <pre>
   * Link to parent relative(s)
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Reference reference = 5 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   * @return Whether the reference field is set.
   */
  boolean hasReference();
  /**
   * <pre>
   * Link to parent relative(s)
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Reference reference = 5 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   * @return The reference.
   */
  com.google.fhir.stu3.proto.Reference getReference();
  /**
   * <pre>
   * Link to parent relative(s)
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Reference reference = 5 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   */
  com.google.fhir.stu3.proto.ReferenceOrBuilder getReferenceOrBuilder();
}
