// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/google/fhir/proto/r4/core/profiles/ldl_cholesterol.proto

package com.google.fhir.r4.core;

public interface LdlCholesterolOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.fhir.r4.core.LdlCholesterol)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Logical id of this artifact
   * </pre>
   *
   * <code>.google.fhir.r4.core.Id id = 1;</code>
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   * <pre>
   * Logical id of this artifact
   * </pre>
   *
   * <code>.google.fhir.r4.core.Id id = 1;</code>
   * @return The id.
   */
  com.google.fhir.r4.core.Id getId();
  /**
   * <pre>
   * Logical id of this artifact
   * </pre>
   *
   * <code>.google.fhir.r4.core.Id id = 1;</code>
   */
  com.google.fhir.r4.core.IdOrBuilder getIdOrBuilder();

  /**
   * <pre>
   * Metadata about the resource
   * </pre>
   *
   * <code>.google.fhir.r4.core.Meta meta = 2;</code>
   * @return Whether the meta field is set.
   */
  boolean hasMeta();
  /**
   * <pre>
   * Metadata about the resource
   * </pre>
   *
   * <code>.google.fhir.r4.core.Meta meta = 2;</code>
   * @return The meta.
   */
  com.google.fhir.r4.core.Meta getMeta();
  /**
   * <pre>
   * Metadata about the resource
   * </pre>
   *
   * <code>.google.fhir.r4.core.Meta meta = 2;</code>
   */
  com.google.fhir.r4.core.MetaOrBuilder getMetaOrBuilder();

  /**
   * <pre>
   * A set of rules under which this content was created
   * </pre>
   *
   * <code>.google.fhir.r4.core.Uri implicit_rules = 3;</code>
   * @return Whether the implicitRules field is set.
   */
  boolean hasImplicitRules();
  /**
   * <pre>
   * A set of rules under which this content was created
   * </pre>
   *
   * <code>.google.fhir.r4.core.Uri implicit_rules = 3;</code>
   * @return The implicitRules.
   */
  com.google.fhir.r4.core.Uri getImplicitRules();
  /**
   * <pre>
   * A set of rules under which this content was created
   * </pre>
   *
   * <code>.google.fhir.r4.core.Uri implicit_rules = 3;</code>
   */
  com.google.fhir.r4.core.UriOrBuilder getImplicitRulesOrBuilder();

  /**
   * <pre>
   * Language of the resource content
   * </pre>
   *
   * <code>.google.fhir.r4.core.Code language = 4;</code>
   * @return Whether the language field is set.
   */
  boolean hasLanguage();
  /**
   * <pre>
   * Language of the resource content
   * </pre>
   *
   * <code>.google.fhir.r4.core.Code language = 4;</code>
   * @return The language.
   */
  com.google.fhir.r4.core.Code getLanguage();
  /**
   * <pre>
   * Language of the resource content
   * </pre>
   *
   * <code>.google.fhir.r4.core.Code language = 4;</code>
   */
  com.google.fhir.r4.core.CodeOrBuilder getLanguageOrBuilder();

  /**
   * <pre>
   * Text summary of the resource, for human interpretation
   * </pre>
   *
   * <code>.google.fhir.r4.core.Narrative text = 5;</code>
   * @return Whether the text field is set.
   */
  boolean hasText();
  /**
   * <pre>
   * Text summary of the resource, for human interpretation
   * </pre>
   *
   * <code>.google.fhir.r4.core.Narrative text = 5;</code>
   * @return The text.
   */
  com.google.fhir.r4.core.Narrative getText();
  /**
   * <pre>
   * Text summary of the resource, for human interpretation
   * </pre>
   *
   * <code>.google.fhir.r4.core.Narrative text = 5;</code>
   */
  com.google.fhir.r4.core.NarrativeOrBuilder getTextOrBuilder();

  /**
   * <pre>
   * Contained, inline Resources
   * </pre>
   *
   * <code>repeated .google.protobuf.Any contained = 6;</code>
   */
  java.util.List<com.google.protobuf.Any> 
      getContainedList();
  /**
   * <pre>
   * Contained, inline Resources
   * </pre>
   *
   * <code>repeated .google.protobuf.Any contained = 6;</code>
   */
  com.google.protobuf.Any getContained(int index);
  /**
   * <pre>
   * Contained, inline Resources
   * </pre>
   *
   * <code>repeated .google.protobuf.Any contained = 6;</code>
   */
  int getContainedCount();
  /**
   * <pre>
   * Contained, inline Resources
   * </pre>
   *
   * <code>repeated .google.protobuf.Any contained = 6;</code>
   */
  java.util.List<? extends com.google.protobuf.AnyOrBuilder> 
      getContainedOrBuilderList();
  /**
   * <pre>
   * Contained, inline Resources
   * </pre>
   *
   * <code>repeated .google.protobuf.Any contained = 6;</code>
   */
  com.google.protobuf.AnyOrBuilder getContainedOrBuilder(
      int index);

  /**
   * <pre>
   * Additional content defined by implementations
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Extension extension = 8;</code>
   */
  java.util.List<com.google.fhir.r4.core.Extension> 
      getExtensionList();
  /**
   * <pre>
   * Additional content defined by implementations
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Extension extension = 8;</code>
   */
  com.google.fhir.r4.core.Extension getExtension(int index);
  /**
   * <pre>
   * Additional content defined by implementations
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Extension extension = 8;</code>
   */
  int getExtensionCount();
  /**
   * <pre>
   * Additional content defined by implementations
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Extension extension = 8;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.ExtensionOrBuilder> 
      getExtensionOrBuilderList();
  /**
   * <pre>
   * Additional content defined by implementations
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Extension extension = 8;</code>
   */
  com.google.fhir.r4.core.ExtensionOrBuilder getExtensionOrBuilder(
      int index);

  /**
   * <pre>
   * Extensions that cannot be ignored
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Extension modifier_extension = 9;</code>
   */
  java.util.List<com.google.fhir.r4.core.Extension> 
      getModifierExtensionList();
  /**
   * <pre>
   * Extensions that cannot be ignored
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Extension modifier_extension = 9;</code>
   */
  com.google.fhir.r4.core.Extension getModifierExtension(int index);
  /**
   * <pre>
   * Extensions that cannot be ignored
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Extension modifier_extension = 9;</code>
   */
  int getModifierExtensionCount();
  /**
   * <pre>
   * Extensions that cannot be ignored
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Extension modifier_extension = 9;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.ExtensionOrBuilder> 
      getModifierExtensionOrBuilderList();
  /**
   * <pre>
   * Extensions that cannot be ignored
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Extension modifier_extension = 9;</code>
   */
  com.google.fhir.r4.core.ExtensionOrBuilder getModifierExtensionOrBuilder(
      int index);

  /**
   * <pre>
   * Business Identifier for observation
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Identifier identifier = 10;</code>
   */
  java.util.List<com.google.fhir.r4.core.Identifier> 
      getIdentifierList();
  /**
   * <pre>
   * Business Identifier for observation
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Identifier identifier = 10;</code>
   */
  com.google.fhir.r4.core.Identifier getIdentifier(int index);
  /**
   * <pre>
   * Business Identifier for observation
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Identifier identifier = 10;</code>
   */
  int getIdentifierCount();
  /**
   * <pre>
   * Business Identifier for observation
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Identifier identifier = 10;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.IdentifierOrBuilder> 
      getIdentifierOrBuilderList();
  /**
   * <pre>
   * Business Identifier for observation
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Identifier identifier = 10;</code>
   */
  com.google.fhir.r4.core.IdentifierOrBuilder getIdentifierOrBuilder(
      int index);

  /**
   * <pre>
   * Fulfills plan, proposal or order
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Reference based_on = 11 [(.google.fhir.proto.valid_reference_type) = "CarePlan", (.google.fhir.proto.valid_reference_type) = "DeviceRequest", (.google.fhir.proto.valid_reference_type) = "ImmunizationRecommendation", (.google.fhir.proto.valid_reference_type) = "MedicationRequest", (.google.fhir.proto.valid_reference_type) = "NutritionOrder", (.google.fhir.proto.valid_reference_type) = "ServiceRequest"];</code>
   */
  java.util.List<com.google.fhir.r4.core.Reference> 
      getBasedOnList();
  /**
   * <pre>
   * Fulfills plan, proposal or order
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Reference based_on = 11 [(.google.fhir.proto.valid_reference_type) = "CarePlan", (.google.fhir.proto.valid_reference_type) = "DeviceRequest", (.google.fhir.proto.valid_reference_type) = "ImmunizationRecommendation", (.google.fhir.proto.valid_reference_type) = "MedicationRequest", (.google.fhir.proto.valid_reference_type) = "NutritionOrder", (.google.fhir.proto.valid_reference_type) = "ServiceRequest"];</code>
   */
  com.google.fhir.r4.core.Reference getBasedOn(int index);
  /**
   * <pre>
   * Fulfills plan, proposal or order
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Reference based_on = 11 [(.google.fhir.proto.valid_reference_type) = "CarePlan", (.google.fhir.proto.valid_reference_type) = "DeviceRequest", (.google.fhir.proto.valid_reference_type) = "ImmunizationRecommendation", (.google.fhir.proto.valid_reference_type) = "MedicationRequest", (.google.fhir.proto.valid_reference_type) = "NutritionOrder", (.google.fhir.proto.valid_reference_type) = "ServiceRequest"];</code>
   */
  int getBasedOnCount();
  /**
   * <pre>
   * Fulfills plan, proposal or order
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Reference based_on = 11 [(.google.fhir.proto.valid_reference_type) = "CarePlan", (.google.fhir.proto.valid_reference_type) = "DeviceRequest", (.google.fhir.proto.valid_reference_type) = "ImmunizationRecommendation", (.google.fhir.proto.valid_reference_type) = "MedicationRequest", (.google.fhir.proto.valid_reference_type) = "NutritionOrder", (.google.fhir.proto.valid_reference_type) = "ServiceRequest"];</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.ReferenceOrBuilder> 
      getBasedOnOrBuilderList();
  /**
   * <pre>
   * Fulfills plan, proposal or order
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Reference based_on = 11 [(.google.fhir.proto.valid_reference_type) = "CarePlan", (.google.fhir.proto.valid_reference_type) = "DeviceRequest", (.google.fhir.proto.valid_reference_type) = "ImmunizationRecommendation", (.google.fhir.proto.valid_reference_type) = "MedicationRequest", (.google.fhir.proto.valid_reference_type) = "NutritionOrder", (.google.fhir.proto.valid_reference_type) = "ServiceRequest"];</code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getBasedOnOrBuilder(
      int index);

  /**
   * <pre>
   * Part of referenced event
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Reference part_of = 12 [(.google.fhir.proto.valid_reference_type) = "MedicationAdministration", (.google.fhir.proto.valid_reference_type) = "MedicationDispense", (.google.fhir.proto.valid_reference_type) = "MedicationStatement", (.google.fhir.proto.valid_reference_type) = "Procedure", (.google.fhir.proto.valid_reference_type) = "Immunization", (.google.fhir.proto.valid_reference_type) = "ImagingStudy"];</code>
   */
  java.util.List<com.google.fhir.r4.core.Reference> 
      getPartOfList();
  /**
   * <pre>
   * Part of referenced event
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Reference part_of = 12 [(.google.fhir.proto.valid_reference_type) = "MedicationAdministration", (.google.fhir.proto.valid_reference_type) = "MedicationDispense", (.google.fhir.proto.valid_reference_type) = "MedicationStatement", (.google.fhir.proto.valid_reference_type) = "Procedure", (.google.fhir.proto.valid_reference_type) = "Immunization", (.google.fhir.proto.valid_reference_type) = "ImagingStudy"];</code>
   */
  com.google.fhir.r4.core.Reference getPartOf(int index);
  /**
   * <pre>
   * Part of referenced event
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Reference part_of = 12 [(.google.fhir.proto.valid_reference_type) = "MedicationAdministration", (.google.fhir.proto.valid_reference_type) = "MedicationDispense", (.google.fhir.proto.valid_reference_type) = "MedicationStatement", (.google.fhir.proto.valid_reference_type) = "Procedure", (.google.fhir.proto.valid_reference_type) = "Immunization", (.google.fhir.proto.valid_reference_type) = "ImagingStudy"];</code>
   */
  int getPartOfCount();
  /**
   * <pre>
   * Part of referenced event
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Reference part_of = 12 [(.google.fhir.proto.valid_reference_type) = "MedicationAdministration", (.google.fhir.proto.valid_reference_type) = "MedicationDispense", (.google.fhir.proto.valid_reference_type) = "MedicationStatement", (.google.fhir.proto.valid_reference_type) = "Procedure", (.google.fhir.proto.valid_reference_type) = "Immunization", (.google.fhir.proto.valid_reference_type) = "ImagingStudy"];</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.ReferenceOrBuilder> 
      getPartOfOrBuilderList();
  /**
   * <pre>
   * Part of referenced event
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Reference part_of = 12 [(.google.fhir.proto.valid_reference_type) = "MedicationAdministration", (.google.fhir.proto.valid_reference_type) = "MedicationDispense", (.google.fhir.proto.valid_reference_type) = "MedicationStatement", (.google.fhir.proto.valid_reference_type) = "Procedure", (.google.fhir.proto.valid_reference_type) = "Immunization", (.google.fhir.proto.valid_reference_type) = "ImagingStudy"];</code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getPartOfOrBuilder(
      int index);

  /**
   * <code>.google.fhir.r4.core.LdlCholesterol.StatusCode status = 13 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   * @return Whether the status field is set.
   */
  boolean hasStatus();
  /**
   * <code>.google.fhir.r4.core.LdlCholesterol.StatusCode status = 13 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   * @return The status.
   */
  com.google.fhir.r4.core.LdlCholesterol.StatusCode getStatus();
  /**
   * <code>.google.fhir.r4.core.LdlCholesterol.StatusCode status = 13 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   */
  com.google.fhir.r4.core.LdlCholesterol.StatusCodeOrBuilder getStatusOrBuilder();

  /**
   * <pre>
   * Classification of  type of observation
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept category = 14;</code>
   */
  java.util.List<com.google.fhir.r4.core.CodeableConcept> 
      getCategoryList();
  /**
   * <pre>
   * Classification of  type of observation
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept category = 14;</code>
   */
  com.google.fhir.r4.core.CodeableConcept getCategory(int index);
  /**
   * <pre>
   * Classification of  type of observation
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept category = 14;</code>
   */
  int getCategoryCount();
  /**
   * <pre>
   * Classification of  type of observation
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept category = 14;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.CodeableConceptOrBuilder> 
      getCategoryOrBuilderList();
  /**
   * <pre>
   * Classification of  type of observation
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept category = 14;</code>
   */
  com.google.fhir.r4.core.CodeableConceptOrBuilder getCategoryOrBuilder(
      int index);

  /**
   * <pre>
   * LDL Cholesterol -measured or calculated per code
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept code = 15 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   * @return Whether the code field is set.
   */
  boolean hasCode();
  /**
   * <pre>
   * LDL Cholesterol -measured or calculated per code
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept code = 15 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   * @return The code.
   */
  com.google.fhir.r4.core.CodeableConcept getCode();
  /**
   * <pre>
   * LDL Cholesterol -measured or calculated per code
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept code = 15 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   */
  com.google.fhir.r4.core.CodeableConceptOrBuilder getCodeOrBuilder();

  /**
   * <pre>
   * Who and/or what the observation is about
   * </pre>
   *
   * <code>.google.fhir.r4.core.Reference subject = 16 [(.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "Group", (.google.fhir.proto.valid_reference_type) = "Device", (.google.fhir.proto.valid_reference_type) = "Location"];</code>
   * @return Whether the subject field is set.
   */
  boolean hasSubject();
  /**
   * <pre>
   * Who and/or what the observation is about
   * </pre>
   *
   * <code>.google.fhir.r4.core.Reference subject = 16 [(.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "Group", (.google.fhir.proto.valid_reference_type) = "Device", (.google.fhir.proto.valid_reference_type) = "Location"];</code>
   * @return The subject.
   */
  com.google.fhir.r4.core.Reference getSubject();
  /**
   * <pre>
   * Who and/or what the observation is about
   * </pre>
   *
   * <code>.google.fhir.r4.core.Reference subject = 16 [(.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "Group", (.google.fhir.proto.valid_reference_type) = "Device", (.google.fhir.proto.valid_reference_type) = "Location"];</code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getSubjectOrBuilder();

  /**
   * <pre>
   * What the observation is about, when it is not about the subject of record
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Reference focus = 17 [(.google.fhir.proto.valid_reference_type) = "Resource"];</code>
   */
  java.util.List<com.google.fhir.r4.core.Reference> 
      getFocusList();
  /**
   * <pre>
   * What the observation is about, when it is not about the subject of record
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Reference focus = 17 [(.google.fhir.proto.valid_reference_type) = "Resource"];</code>
   */
  com.google.fhir.r4.core.Reference getFocus(int index);
  /**
   * <pre>
   * What the observation is about, when it is not about the subject of record
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Reference focus = 17 [(.google.fhir.proto.valid_reference_type) = "Resource"];</code>
   */
  int getFocusCount();
  /**
   * <pre>
   * What the observation is about, when it is not about the subject of record
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Reference focus = 17 [(.google.fhir.proto.valid_reference_type) = "Resource"];</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.ReferenceOrBuilder> 
      getFocusOrBuilderList();
  /**
   * <pre>
   * What the observation is about, when it is not about the subject of record
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Reference focus = 17 [(.google.fhir.proto.valid_reference_type) = "Resource"];</code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getFocusOrBuilder(
      int index);

  /**
   * <pre>
   * Healthcare event during which this observation is made
   * </pre>
   *
   * <code>.google.fhir.r4.core.Reference encounter = 18 [(.google.fhir.proto.valid_reference_type) = "Encounter"];</code>
   * @return Whether the encounter field is set.
   */
  boolean hasEncounter();
  /**
   * <pre>
   * Healthcare event during which this observation is made
   * </pre>
   *
   * <code>.google.fhir.r4.core.Reference encounter = 18 [(.google.fhir.proto.valid_reference_type) = "Encounter"];</code>
   * @return The encounter.
   */
  com.google.fhir.r4.core.Reference getEncounter();
  /**
   * <pre>
   * Healthcare event during which this observation is made
   * </pre>
   *
   * <code>.google.fhir.r4.core.Reference encounter = 18 [(.google.fhir.proto.valid_reference_type) = "Encounter"];</code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getEncounterOrBuilder();

  /**
   * <code>.google.fhir.r4.core.LdlCholesterol.EffectiveX effective = 19;</code>
   * @return Whether the effective field is set.
   */
  boolean hasEffective();
  /**
   * <code>.google.fhir.r4.core.LdlCholesterol.EffectiveX effective = 19;</code>
   * @return The effective.
   */
  com.google.fhir.r4.core.LdlCholesterol.EffectiveX getEffective();
  /**
   * <code>.google.fhir.r4.core.LdlCholesterol.EffectiveX effective = 19;</code>
   */
  com.google.fhir.r4.core.LdlCholesterol.EffectiveXOrBuilder getEffectiveOrBuilder();

  /**
   * <pre>
   * Date/Time this version was made available
   * </pre>
   *
   * <code>.google.fhir.r4.core.Instant issued = 20;</code>
   * @return Whether the issued field is set.
   */
  boolean hasIssued();
  /**
   * <pre>
   * Date/Time this version was made available
   * </pre>
   *
   * <code>.google.fhir.r4.core.Instant issued = 20;</code>
   * @return The issued.
   */
  com.google.fhir.r4.core.Instant getIssued();
  /**
   * <pre>
   * Date/Time this version was made available
   * </pre>
   *
   * <code>.google.fhir.r4.core.Instant issued = 20;</code>
   */
  com.google.fhir.r4.core.InstantOrBuilder getIssuedOrBuilder();

  /**
   * <pre>
   * Who is responsible for the observation
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Reference performer = 21 [(.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "PractitionerRole", (.google.fhir.proto.valid_reference_type) = "Organization", (.google.fhir.proto.valid_reference_type) = "CareTeam", (.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "RelatedPerson"];</code>
   */
  java.util.List<com.google.fhir.r4.core.Reference> 
      getPerformerList();
  /**
   * <pre>
   * Who is responsible for the observation
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Reference performer = 21 [(.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "PractitionerRole", (.google.fhir.proto.valid_reference_type) = "Organization", (.google.fhir.proto.valid_reference_type) = "CareTeam", (.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "RelatedPerson"];</code>
   */
  com.google.fhir.r4.core.Reference getPerformer(int index);
  /**
   * <pre>
   * Who is responsible for the observation
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Reference performer = 21 [(.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "PractitionerRole", (.google.fhir.proto.valid_reference_type) = "Organization", (.google.fhir.proto.valid_reference_type) = "CareTeam", (.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "RelatedPerson"];</code>
   */
  int getPerformerCount();
  /**
   * <pre>
   * Who is responsible for the observation
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Reference performer = 21 [(.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "PractitionerRole", (.google.fhir.proto.valid_reference_type) = "Organization", (.google.fhir.proto.valid_reference_type) = "CareTeam", (.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "RelatedPerson"];</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.ReferenceOrBuilder> 
      getPerformerOrBuilderList();
  /**
   * <pre>
   * Who is responsible for the observation
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Reference performer = 21 [(.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "PractitionerRole", (.google.fhir.proto.valid_reference_type) = "Organization", (.google.fhir.proto.valid_reference_type) = "CareTeam", (.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "RelatedPerson"];</code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getPerformerOrBuilder(
      int index);

  /**
   * <code>.google.fhir.r4.core.LdlCholesterol.ValueX value = 22;</code>
   * @return Whether the value field is set.
   */
  boolean hasValue();
  /**
   * <code>.google.fhir.r4.core.LdlCholesterol.ValueX value = 22;</code>
   * @return The value.
   */
  com.google.fhir.r4.core.LdlCholesterol.ValueX getValue();
  /**
   * <code>.google.fhir.r4.core.LdlCholesterol.ValueX value = 22;</code>
   */
  com.google.fhir.r4.core.LdlCholesterol.ValueXOrBuilder getValueOrBuilder();

  /**
   * <pre>
   * Why the result is missing
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept data_absent_reason = 23;</code>
   * @return Whether the dataAbsentReason field is set.
   */
  boolean hasDataAbsentReason();
  /**
   * <pre>
   * Why the result is missing
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept data_absent_reason = 23;</code>
   * @return The dataAbsentReason.
   */
  com.google.fhir.r4.core.CodeableConcept getDataAbsentReason();
  /**
   * <pre>
   * Why the result is missing
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept data_absent_reason = 23;</code>
   */
  com.google.fhir.r4.core.CodeableConceptOrBuilder getDataAbsentReasonOrBuilder();

  /**
   * <pre>
   * + | ++ | +++ | - | -- | ---
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept interpretation = 24;</code>
   * @return Whether the interpretation field is set.
   */
  boolean hasInterpretation();
  /**
   * <pre>
   * + | ++ | +++ | - | -- | ---
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept interpretation = 24;</code>
   * @return The interpretation.
   */
  com.google.fhir.r4.core.CodeableConcept getInterpretation();
  /**
   * <pre>
   * + | ++ | +++ | - | -- | ---
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept interpretation = 24;</code>
   */
  com.google.fhir.r4.core.CodeableConceptOrBuilder getInterpretationOrBuilder();

  /**
   * <pre>
   * Comments about result
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Annotation note = 25;</code>
   */
  java.util.List<com.google.fhir.r4.core.Annotation> 
      getNoteList();
  /**
   * <pre>
   * Comments about result
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Annotation note = 25;</code>
   */
  com.google.fhir.r4.core.Annotation getNote(int index);
  /**
   * <pre>
   * Comments about result
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Annotation note = 25;</code>
   */
  int getNoteCount();
  /**
   * <pre>
   * Comments about result
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Annotation note = 25;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.AnnotationOrBuilder> 
      getNoteOrBuilderList();
  /**
   * <pre>
   * Comments about result
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Annotation note = 25;</code>
   */
  com.google.fhir.r4.core.AnnotationOrBuilder getNoteOrBuilder(
      int index);

  /**
   * <pre>
   * Observed body part
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept body_site = 26;</code>
   * @return Whether the bodySite field is set.
   */
  boolean hasBodySite();
  /**
   * <pre>
   * Observed body part
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept body_site = 26;</code>
   * @return The bodySite.
   */
  com.google.fhir.r4.core.CodeableConcept getBodySite();
  /**
   * <pre>
   * Observed body part
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept body_site = 26;</code>
   */
  com.google.fhir.r4.core.CodeableConceptOrBuilder getBodySiteOrBuilder();

  /**
   * <pre>
   * How it was done
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept method = 27;</code>
   * @return Whether the method field is set.
   */
  boolean hasMethod();
  /**
   * <pre>
   * How it was done
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept method = 27;</code>
   * @return The method.
   */
  com.google.fhir.r4.core.CodeableConcept getMethod();
  /**
   * <pre>
   * How it was done
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept method = 27;</code>
   */
  com.google.fhir.r4.core.CodeableConceptOrBuilder getMethodOrBuilder();

  /**
   * <pre>
   * Specimen used for this observation
   * </pre>
   *
   * <code>.google.fhir.r4.core.Reference specimen = 28 [(.google.fhir.proto.valid_reference_type) = "Specimen"];</code>
   * @return Whether the specimen field is set.
   */
  boolean hasSpecimen();
  /**
   * <pre>
   * Specimen used for this observation
   * </pre>
   *
   * <code>.google.fhir.r4.core.Reference specimen = 28 [(.google.fhir.proto.valid_reference_type) = "Specimen"];</code>
   * @return The specimen.
   */
  com.google.fhir.r4.core.Reference getSpecimen();
  /**
   * <pre>
   * Specimen used for this observation
   * </pre>
   *
   * <code>.google.fhir.r4.core.Reference specimen = 28 [(.google.fhir.proto.valid_reference_type) = "Specimen"];</code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getSpecimenOrBuilder();

  /**
   * <pre>
   * (Measurement) Device
   * </pre>
   *
   * <code>.google.fhir.r4.core.Reference device = 29 [(.google.fhir.proto.valid_reference_type) = "Device", (.google.fhir.proto.valid_reference_type) = "DeviceMetric"];</code>
   * @return Whether the device field is set.
   */
  boolean hasDevice();
  /**
   * <pre>
   * (Measurement) Device
   * </pre>
   *
   * <code>.google.fhir.r4.core.Reference device = 29 [(.google.fhir.proto.valid_reference_type) = "Device", (.google.fhir.proto.valid_reference_type) = "DeviceMetric"];</code>
   * @return The device.
   */
  com.google.fhir.r4.core.Reference getDevice();
  /**
   * <pre>
   * (Measurement) Device
   * </pre>
   *
   * <code>.google.fhir.r4.core.Reference device = 29 [(.google.fhir.proto.valid_reference_type) = "Device", (.google.fhir.proto.valid_reference_type) = "DeviceMetric"];</code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getDeviceOrBuilder();

  /**
   * <code>.google.fhir.r4.core.LdlCholesterol.ReferenceRange reference_range = 30 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   * @return Whether the referenceRange field is set.
   */
  boolean hasReferenceRange();
  /**
   * <code>.google.fhir.r4.core.LdlCholesterol.ReferenceRange reference_range = 30 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   * @return The referenceRange.
   */
  com.google.fhir.r4.core.LdlCholesterol.ReferenceRange getReferenceRange();
  /**
   * <code>.google.fhir.r4.core.LdlCholesterol.ReferenceRange reference_range = 30 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   */
  com.google.fhir.r4.core.LdlCholesterol.ReferenceRangeOrBuilder getReferenceRangeOrBuilder();

  /**
   * <code>repeated .google.fhir.r4.core.LdlCholesterol.Component component = 33;</code>
   */
  java.util.List<com.google.fhir.r4.core.LdlCholesterol.Component> 
      getComponentList();
  /**
   * <code>repeated .google.fhir.r4.core.LdlCholesterol.Component component = 33;</code>
   */
  com.google.fhir.r4.core.LdlCholesterol.Component getComponent(int index);
  /**
   * <code>repeated .google.fhir.r4.core.LdlCholesterol.Component component = 33;</code>
   */
  int getComponentCount();
  /**
   * <code>repeated .google.fhir.r4.core.LdlCholesterol.Component component = 33;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.LdlCholesterol.ComponentOrBuilder> 
      getComponentOrBuilderList();
  /**
   * <code>repeated .google.fhir.r4.core.LdlCholesterol.Component component = 33;</code>
   */
  com.google.fhir.r4.core.LdlCholesterol.ComponentOrBuilder getComponentOrBuilder(
      int index);
}
