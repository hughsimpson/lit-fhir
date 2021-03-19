// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/google/fhir/proto/stu3/extensions.proto

package com.google.fhir.stu3.proto;

public interface AllergyIntoleranceSubstanceExposureRiskOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.fhir.stu3.proto.AllergyIntoleranceSubstanceExposureRisk)
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
   * Substance (or pharmaceutical product)
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.CodeableConcept substance = 4 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   * @return Whether the substance field is set.
   */
  boolean hasSubstance();
  /**
   * <pre>
   * Substance (or pharmaceutical product)
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.CodeableConcept substance = 4 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   * @return The substance.
   */
  com.google.fhir.stu3.proto.CodeableConcept getSubstance();
  /**
   * <pre>
   * Substance (or pharmaceutical product)
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.CodeableConcept substance = 4 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   */
  com.google.fhir.stu3.proto.CodeableConceptOrBuilder getSubstanceOrBuilder();

  /**
   * <pre>
   * known-reaction-risk | no-known-reaction-risk
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.CodeableConcept exposure_risk = 5 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   * @return Whether the exposureRisk field is set.
   */
  boolean hasExposureRisk();
  /**
   * <pre>
   * known-reaction-risk | no-known-reaction-risk
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.CodeableConcept exposure_risk = 5 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   * @return The exposureRisk.
   */
  com.google.fhir.stu3.proto.CodeableConcept getExposureRisk();
  /**
   * <pre>
   * known-reaction-risk | no-known-reaction-risk
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.CodeableConcept exposure_risk = 5 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   */
  com.google.fhir.stu3.proto.CodeableConceptOrBuilder getExposureRiskOrBuilder();
}
