// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/google/fhir/proto/r4/uscore.proto

package com.google.fhir.r4.uscore;

public interface USCoreGoalProfileOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.fhir.r4.uscore.USCoreGoalProfile)
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
   * External Ids for this goal
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Identifier identifier = 10;</code>
   */
  java.util.List<com.google.fhir.r4.core.Identifier> 
      getIdentifierList();
  /**
   * <pre>
   * External Ids for this goal
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Identifier identifier = 10;</code>
   */
  com.google.fhir.r4.core.Identifier getIdentifier(int index);
  /**
   * <pre>
   * External Ids for this goal
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Identifier identifier = 10;</code>
   */
  int getIdentifierCount();
  /**
   * <pre>
   * External Ids for this goal
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Identifier identifier = 10;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.IdentifierOrBuilder> 
      getIdentifierOrBuilderList();
  /**
   * <pre>
   * External Ids for this goal
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Identifier identifier = 10;</code>
   */
  com.google.fhir.r4.core.IdentifierOrBuilder getIdentifierOrBuilder(
      int index);

  /**
   * <code>.google.fhir.r4.uscore.USCoreGoalProfile.LifecycleStatusCode lifecycle_status = 11 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   * @return Whether the lifecycleStatus field is set.
   */
  boolean hasLifecycleStatus();
  /**
   * <code>.google.fhir.r4.uscore.USCoreGoalProfile.LifecycleStatusCode lifecycle_status = 11 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   * @return The lifecycleStatus.
   */
  com.google.fhir.r4.uscore.USCoreGoalProfile.LifecycleStatusCode getLifecycleStatus();
  /**
   * <code>.google.fhir.r4.uscore.USCoreGoalProfile.LifecycleStatusCode lifecycle_status = 11 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   */
  com.google.fhir.r4.uscore.USCoreGoalProfile.LifecycleStatusCodeOrBuilder getLifecycleStatusOrBuilder();

  /**
   * <pre>
   * in-progress | improving | worsening | no-change | achieved | sustaining |
   * not-achieved | no-progress | not-attainable
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept achievement_status = 12;</code>
   * @return Whether the achievementStatus field is set.
   */
  boolean hasAchievementStatus();
  /**
   * <pre>
   * in-progress | improving | worsening | no-change | achieved | sustaining |
   * not-achieved | no-progress | not-attainable
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept achievement_status = 12;</code>
   * @return The achievementStatus.
   */
  com.google.fhir.r4.core.CodeableConcept getAchievementStatus();
  /**
   * <pre>
   * in-progress | improving | worsening | no-change | achieved | sustaining |
   * not-achieved | no-progress | not-attainable
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept achievement_status = 12;</code>
   */
  com.google.fhir.r4.core.CodeableConceptOrBuilder getAchievementStatusOrBuilder();

  /**
   * <pre>
   * E.g. Treatment, dietary, behavioral, etc.
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept category = 13;</code>
   */
  java.util.List<com.google.fhir.r4.core.CodeableConcept> 
      getCategoryList();
  /**
   * <pre>
   * E.g. Treatment, dietary, behavioral, etc.
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept category = 13;</code>
   */
  com.google.fhir.r4.core.CodeableConcept getCategory(int index);
  /**
   * <pre>
   * E.g. Treatment, dietary, behavioral, etc.
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept category = 13;</code>
   */
  int getCategoryCount();
  /**
   * <pre>
   * E.g. Treatment, dietary, behavioral, etc.
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept category = 13;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.CodeableConceptOrBuilder> 
      getCategoryOrBuilderList();
  /**
   * <pre>
   * E.g. Treatment, dietary, behavioral, etc.
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept category = 13;</code>
   */
  com.google.fhir.r4.core.CodeableConceptOrBuilder getCategoryOrBuilder(
      int index);

  /**
   * <pre>
   * high-priority | medium-priority | low-priority
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept priority = 14;</code>
   * @return Whether the priority field is set.
   */
  boolean hasPriority();
  /**
   * <pre>
   * high-priority | medium-priority | low-priority
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept priority = 14;</code>
   * @return The priority.
   */
  com.google.fhir.r4.core.CodeableConcept getPriority();
  /**
   * <pre>
   * high-priority | medium-priority | low-priority
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept priority = 14;</code>
   */
  com.google.fhir.r4.core.CodeableConceptOrBuilder getPriorityOrBuilder();

  /**
   * <pre>
   * Code or text describing goal
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept description = 15 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   * @return Whether the description field is set.
   */
  boolean hasDescription();
  /**
   * <pre>
   * Code or text describing goal
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept description = 15 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   * @return The description.
   */
  com.google.fhir.r4.core.CodeableConcept getDescription();
  /**
   * <pre>
   * Code or text describing goal
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept description = 15 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   */
  com.google.fhir.r4.core.CodeableConceptOrBuilder getDescriptionOrBuilder();

  /**
   * <pre>
   * Who this goal is intended for
   * </pre>
   *
   * <code>.google.fhir.r4.core.Reference subject = 16 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR, (.google.fhir.proto.valid_reference_type) = "Patient"];</code>
   * @return Whether the subject field is set.
   */
  boolean hasSubject();
  /**
   * <pre>
   * Who this goal is intended for
   * </pre>
   *
   * <code>.google.fhir.r4.core.Reference subject = 16 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR, (.google.fhir.proto.valid_reference_type) = "Patient"];</code>
   * @return The subject.
   */
  com.google.fhir.r4.core.Reference getSubject();
  /**
   * <pre>
   * Who this goal is intended for
   * </pre>
   *
   * <code>.google.fhir.r4.core.Reference subject = 16 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR, (.google.fhir.proto.valid_reference_type) = "Patient"];</code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getSubjectOrBuilder();

  /**
   * <code>.google.fhir.r4.uscore.USCoreGoalProfile.StartX start = 17;</code>
   * @return Whether the start field is set.
   */
  boolean hasStart();
  /**
   * <code>.google.fhir.r4.uscore.USCoreGoalProfile.StartX start = 17;</code>
   * @return The start.
   */
  com.google.fhir.r4.uscore.USCoreGoalProfile.StartX getStart();
  /**
   * <code>.google.fhir.r4.uscore.USCoreGoalProfile.StartX start = 17;</code>
   */
  com.google.fhir.r4.uscore.USCoreGoalProfile.StartXOrBuilder getStartOrBuilder();

  /**
   * <code>repeated .google.fhir.r4.uscore.USCoreGoalProfile.Target target = 18;</code>
   */
  java.util.List<com.google.fhir.r4.uscore.USCoreGoalProfile.Target> 
      getTargetList();
  /**
   * <code>repeated .google.fhir.r4.uscore.USCoreGoalProfile.Target target = 18;</code>
   */
  com.google.fhir.r4.uscore.USCoreGoalProfile.Target getTarget(int index);
  /**
   * <code>repeated .google.fhir.r4.uscore.USCoreGoalProfile.Target target = 18;</code>
   */
  int getTargetCount();
  /**
   * <code>repeated .google.fhir.r4.uscore.USCoreGoalProfile.Target target = 18;</code>
   */
  java.util.List<? extends com.google.fhir.r4.uscore.USCoreGoalProfile.TargetOrBuilder> 
      getTargetOrBuilderList();
  /**
   * <code>repeated .google.fhir.r4.uscore.USCoreGoalProfile.Target target = 18;</code>
   */
  com.google.fhir.r4.uscore.USCoreGoalProfile.TargetOrBuilder getTargetOrBuilder(
      int index);

  /**
   * <pre>
   * When goal status took effect
   * </pre>
   *
   * <code>.google.fhir.r4.core.Date status_date = 19;</code>
   * @return Whether the statusDate field is set.
   */
  boolean hasStatusDate();
  /**
   * <pre>
   * When goal status took effect
   * </pre>
   *
   * <code>.google.fhir.r4.core.Date status_date = 19;</code>
   * @return The statusDate.
   */
  com.google.fhir.r4.core.Date getStatusDate();
  /**
   * <pre>
   * When goal status took effect
   * </pre>
   *
   * <code>.google.fhir.r4.core.Date status_date = 19;</code>
   */
  com.google.fhir.r4.core.DateOrBuilder getStatusDateOrBuilder();

  /**
   * <pre>
   * Reason for current status
   * </pre>
   *
   * <code>.google.fhir.r4.core.String status_reason = 20;</code>
   * @return Whether the statusReason field is set.
   */
  boolean hasStatusReason();
  /**
   * <pre>
   * Reason for current status
   * </pre>
   *
   * <code>.google.fhir.r4.core.String status_reason = 20;</code>
   * @return The statusReason.
   */
  com.google.fhir.r4.core.String getStatusReason();
  /**
   * <pre>
   * Reason for current status
   * </pre>
   *
   * <code>.google.fhir.r4.core.String status_reason = 20;</code>
   */
  com.google.fhir.r4.core.StringOrBuilder getStatusReasonOrBuilder();

  /**
   * <pre>
   * Who's responsible for creating Goal?
   * </pre>
   *
   * <code>.google.fhir.r4.core.Reference expressed_by = 21 [(.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "PractitionerRole", (.google.fhir.proto.valid_reference_type) = "RelatedPerson"];</code>
   * @return Whether the expressedBy field is set.
   */
  boolean hasExpressedBy();
  /**
   * <pre>
   * Who's responsible for creating Goal?
   * </pre>
   *
   * <code>.google.fhir.r4.core.Reference expressed_by = 21 [(.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "PractitionerRole", (.google.fhir.proto.valid_reference_type) = "RelatedPerson"];</code>
   * @return The expressedBy.
   */
  com.google.fhir.r4.core.Reference getExpressedBy();
  /**
   * <pre>
   * Who's responsible for creating Goal?
   * </pre>
   *
   * <code>.google.fhir.r4.core.Reference expressed_by = 21 [(.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "PractitionerRole", (.google.fhir.proto.valid_reference_type) = "RelatedPerson"];</code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getExpressedByOrBuilder();

  /**
   * <pre>
   * Issues addressed by this goal
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Reference addresses = 22 [(.google.fhir.proto.valid_reference_type) = "Condition", (.google.fhir.proto.valid_reference_type) = "Observation", (.google.fhir.proto.valid_reference_type) = "MedicationStatement", (.google.fhir.proto.valid_reference_type) = "NutritionOrder", (.google.fhir.proto.valid_reference_type) = "ServiceRequest", (.google.fhir.proto.valid_reference_type) = "RiskAssessment"];</code>
   */
  java.util.List<com.google.fhir.r4.core.Reference> 
      getAddressesList();
  /**
   * <pre>
   * Issues addressed by this goal
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Reference addresses = 22 [(.google.fhir.proto.valid_reference_type) = "Condition", (.google.fhir.proto.valid_reference_type) = "Observation", (.google.fhir.proto.valid_reference_type) = "MedicationStatement", (.google.fhir.proto.valid_reference_type) = "NutritionOrder", (.google.fhir.proto.valid_reference_type) = "ServiceRequest", (.google.fhir.proto.valid_reference_type) = "RiskAssessment"];</code>
   */
  com.google.fhir.r4.core.Reference getAddresses(int index);
  /**
   * <pre>
   * Issues addressed by this goal
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Reference addresses = 22 [(.google.fhir.proto.valid_reference_type) = "Condition", (.google.fhir.proto.valid_reference_type) = "Observation", (.google.fhir.proto.valid_reference_type) = "MedicationStatement", (.google.fhir.proto.valid_reference_type) = "NutritionOrder", (.google.fhir.proto.valid_reference_type) = "ServiceRequest", (.google.fhir.proto.valid_reference_type) = "RiskAssessment"];</code>
   */
  int getAddressesCount();
  /**
   * <pre>
   * Issues addressed by this goal
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Reference addresses = 22 [(.google.fhir.proto.valid_reference_type) = "Condition", (.google.fhir.proto.valid_reference_type) = "Observation", (.google.fhir.proto.valid_reference_type) = "MedicationStatement", (.google.fhir.proto.valid_reference_type) = "NutritionOrder", (.google.fhir.proto.valid_reference_type) = "ServiceRequest", (.google.fhir.proto.valid_reference_type) = "RiskAssessment"];</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.ReferenceOrBuilder> 
      getAddressesOrBuilderList();
  /**
   * <pre>
   * Issues addressed by this goal
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Reference addresses = 22 [(.google.fhir.proto.valid_reference_type) = "Condition", (.google.fhir.proto.valid_reference_type) = "Observation", (.google.fhir.proto.valid_reference_type) = "MedicationStatement", (.google.fhir.proto.valid_reference_type) = "NutritionOrder", (.google.fhir.proto.valid_reference_type) = "ServiceRequest", (.google.fhir.proto.valid_reference_type) = "RiskAssessment"];</code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getAddressesOrBuilder(
      int index);

  /**
   * <pre>
   * Comments about the goal
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Annotation note = 23;</code>
   */
  java.util.List<com.google.fhir.r4.core.Annotation> 
      getNoteList();
  /**
   * <pre>
   * Comments about the goal
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Annotation note = 23;</code>
   */
  com.google.fhir.r4.core.Annotation getNote(int index);
  /**
   * <pre>
   * Comments about the goal
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Annotation note = 23;</code>
   */
  int getNoteCount();
  /**
   * <pre>
   * Comments about the goal
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Annotation note = 23;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.AnnotationOrBuilder> 
      getNoteOrBuilderList();
  /**
   * <pre>
   * Comments about the goal
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Annotation note = 23;</code>
   */
  com.google.fhir.r4.core.AnnotationOrBuilder getNoteOrBuilder(
      int index);

  /**
   * <pre>
   * What result was achieved regarding the goal?
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept outcome_code = 24;</code>
   */
  java.util.List<com.google.fhir.r4.core.CodeableConcept> 
      getOutcomeCodeList();
  /**
   * <pre>
   * What result was achieved regarding the goal?
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept outcome_code = 24;</code>
   */
  com.google.fhir.r4.core.CodeableConcept getOutcomeCode(int index);
  /**
   * <pre>
   * What result was achieved regarding the goal?
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept outcome_code = 24;</code>
   */
  int getOutcomeCodeCount();
  /**
   * <pre>
   * What result was achieved regarding the goal?
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept outcome_code = 24;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.CodeableConceptOrBuilder> 
      getOutcomeCodeOrBuilderList();
  /**
   * <pre>
   * What result was achieved regarding the goal?
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept outcome_code = 24;</code>
   */
  com.google.fhir.r4.core.CodeableConceptOrBuilder getOutcomeCodeOrBuilder(
      int index);

  /**
   * <pre>
   * Observation that resulted from goal
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Reference outcome_reference = 25 [(.google.fhir.proto.valid_reference_type) = "Observation"];</code>
   */
  java.util.List<com.google.fhir.r4.core.Reference> 
      getOutcomeReferenceList();
  /**
   * <pre>
   * Observation that resulted from goal
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Reference outcome_reference = 25 [(.google.fhir.proto.valid_reference_type) = "Observation"];</code>
   */
  com.google.fhir.r4.core.Reference getOutcomeReference(int index);
  /**
   * <pre>
   * Observation that resulted from goal
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Reference outcome_reference = 25 [(.google.fhir.proto.valid_reference_type) = "Observation"];</code>
   */
  int getOutcomeReferenceCount();
  /**
   * <pre>
   * Observation that resulted from goal
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Reference outcome_reference = 25 [(.google.fhir.proto.valid_reference_type) = "Observation"];</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.ReferenceOrBuilder> 
      getOutcomeReferenceOrBuilderList();
  /**
   * <pre>
   * Observation that resulted from goal
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Reference outcome_reference = 25 [(.google.fhir.proto.valid_reference_type) = "Observation"];</code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getOutcomeReferenceOrBuilder(
      int index);
}
