// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/google/fhir/proto/stu3/resources.proto

package com.google.fhir.stu3.proto;

public interface ReferralRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.fhir.stu3.proto.ReferralRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Logical id of this artifact
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Id id = 1;</code>
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   * <pre>
   * Logical id of this artifact
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Id id = 1;</code>
   * @return The id.
   */
  com.google.fhir.stu3.proto.Id getId();
  /**
   * <pre>
   * Logical id of this artifact
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Id id = 1;</code>
   */
  com.google.fhir.stu3.proto.IdOrBuilder getIdOrBuilder();

  /**
   * <pre>
   * Metadata about the resource
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Meta meta = 2;</code>
   * @return Whether the meta field is set.
   */
  boolean hasMeta();
  /**
   * <pre>
   * Metadata about the resource
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Meta meta = 2;</code>
   * @return The meta.
   */
  com.google.fhir.stu3.proto.Meta getMeta();
  /**
   * <pre>
   * Metadata about the resource
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Meta meta = 2;</code>
   */
  com.google.fhir.stu3.proto.MetaOrBuilder getMetaOrBuilder();

  /**
   * <pre>
   * A set of rules under which this content was created
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Uri implicit_rules = 3;</code>
   * @return Whether the implicitRules field is set.
   */
  boolean hasImplicitRules();
  /**
   * <pre>
   * A set of rules under which this content was created
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Uri implicit_rules = 3;</code>
   * @return The implicitRules.
   */
  com.google.fhir.stu3.proto.Uri getImplicitRules();
  /**
   * <pre>
   * A set of rules under which this content was created
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Uri implicit_rules = 3;</code>
   */
  com.google.fhir.stu3.proto.UriOrBuilder getImplicitRulesOrBuilder();

  /**
   * <pre>
   * Language of the resource content
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.LanguageCode language = 4;</code>
   * @return Whether the language field is set.
   */
  boolean hasLanguage();
  /**
   * <pre>
   * Language of the resource content
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.LanguageCode language = 4;</code>
   * @return The language.
   */
  com.google.fhir.stu3.proto.LanguageCode getLanguage();
  /**
   * <pre>
   * Language of the resource content
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.LanguageCode language = 4;</code>
   */
  com.google.fhir.stu3.proto.LanguageCodeOrBuilder getLanguageOrBuilder();

  /**
   * <pre>
   * Text summary of the resource, for human interpretation
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Narrative text = 5;</code>
   * @return Whether the text field is set.
   */
  boolean hasText();
  /**
   * <pre>
   * Text summary of the resource, for human interpretation
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Narrative text = 5;</code>
   * @return The text.
   */
  com.google.fhir.stu3.proto.Narrative getText();
  /**
   * <pre>
   * Text summary of the resource, for human interpretation
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Narrative text = 5;</code>
   */
  com.google.fhir.stu3.proto.NarrativeOrBuilder getTextOrBuilder();

  /**
   * <pre>
   * Contained, inline Resources
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.ContainedResource contained = 6;</code>
   */
  java.util.List<com.google.fhir.stu3.proto.ContainedResource> 
      getContainedList();
  /**
   * <pre>
   * Contained, inline Resources
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.ContainedResource contained = 6;</code>
   */
  com.google.fhir.stu3.proto.ContainedResource getContained(int index);
  /**
   * <pre>
   * Contained, inline Resources
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.ContainedResource contained = 6;</code>
   */
  int getContainedCount();
  /**
   * <pre>
   * Contained, inline Resources
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.ContainedResource contained = 6;</code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.ContainedResourceOrBuilder> 
      getContainedOrBuilderList();
  /**
   * <pre>
   * Contained, inline Resources
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.ContainedResource contained = 6;</code>
   */
  com.google.fhir.stu3.proto.ContainedResourceOrBuilder getContainedOrBuilder(
      int index);

  /**
   * <pre>
   * Additional Content defined by implementations
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Extension extension = 7;</code>
   */
  java.util.List<com.google.fhir.stu3.proto.Extension> 
      getExtensionList();
  /**
   * <pre>
   * Additional Content defined by implementations
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Extension extension = 7;</code>
   */
  com.google.fhir.stu3.proto.Extension getExtension(int index);
  /**
   * <pre>
   * Additional Content defined by implementations
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Extension extension = 7;</code>
   */
  int getExtensionCount();
  /**
   * <pre>
   * Additional Content defined by implementations
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Extension extension = 7;</code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.ExtensionOrBuilder> 
      getExtensionOrBuilderList();
  /**
   * <pre>
   * Additional Content defined by implementations
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Extension extension = 7;</code>
   */
  com.google.fhir.stu3.proto.ExtensionOrBuilder getExtensionOrBuilder(
      int index);

  /**
   * <pre>
   * Extensions that cannot be ignored
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Extension modifier_extension = 8;</code>
   */
  java.util.List<com.google.fhir.stu3.proto.Extension> 
      getModifierExtensionList();
  /**
   * <pre>
   * Extensions that cannot be ignored
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Extension modifier_extension = 8;</code>
   */
  com.google.fhir.stu3.proto.Extension getModifierExtension(int index);
  /**
   * <pre>
   * Extensions that cannot be ignored
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Extension modifier_extension = 8;</code>
   */
  int getModifierExtensionCount();
  /**
   * <pre>
   * Extensions that cannot be ignored
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Extension modifier_extension = 8;</code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.ExtensionOrBuilder> 
      getModifierExtensionOrBuilderList();
  /**
   * <pre>
   * Extensions that cannot be ignored
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Extension modifier_extension = 8;</code>
   */
  com.google.fhir.stu3.proto.ExtensionOrBuilder getModifierExtensionOrBuilder(
      int index);

  /**
   * <pre>
   * Business identifier
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Identifier identifier = 9;</code>
   */
  java.util.List<com.google.fhir.stu3.proto.Identifier> 
      getIdentifierList();
  /**
   * <pre>
   * Business identifier
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Identifier identifier = 9;</code>
   */
  com.google.fhir.stu3.proto.Identifier getIdentifier(int index);
  /**
   * <pre>
   * Business identifier
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Identifier identifier = 9;</code>
   */
  int getIdentifierCount();
  /**
   * <pre>
   * Business identifier
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Identifier identifier = 9;</code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.IdentifierOrBuilder> 
      getIdentifierOrBuilderList();
  /**
   * <pre>
   * Business identifier
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Identifier identifier = 9;</code>
   */
  com.google.fhir.stu3.proto.IdentifierOrBuilder getIdentifierOrBuilder(
      int index);

  /**
   * <pre>
   * Instantiates protocol or definition
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Reference definition = 10 [(.google.fhir.proto.valid_reference_type) = "ActivityDefinition", (.google.fhir.proto.valid_reference_type) = "PlanDefinition"];</code>
   */
  java.util.List<com.google.fhir.stu3.proto.Reference> 
      getDefinitionList();
  /**
   * <pre>
   * Instantiates protocol or definition
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Reference definition = 10 [(.google.fhir.proto.valid_reference_type) = "ActivityDefinition", (.google.fhir.proto.valid_reference_type) = "PlanDefinition"];</code>
   */
  com.google.fhir.stu3.proto.Reference getDefinition(int index);
  /**
   * <pre>
   * Instantiates protocol or definition
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Reference definition = 10 [(.google.fhir.proto.valid_reference_type) = "ActivityDefinition", (.google.fhir.proto.valid_reference_type) = "PlanDefinition"];</code>
   */
  int getDefinitionCount();
  /**
   * <pre>
   * Instantiates protocol or definition
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Reference definition = 10 [(.google.fhir.proto.valid_reference_type) = "ActivityDefinition", (.google.fhir.proto.valid_reference_type) = "PlanDefinition"];</code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.ReferenceOrBuilder> 
      getDefinitionOrBuilderList();
  /**
   * <pre>
   * Instantiates protocol or definition
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Reference definition = 10 [(.google.fhir.proto.valid_reference_type) = "ActivityDefinition", (.google.fhir.proto.valid_reference_type) = "PlanDefinition"];</code>
   */
  com.google.fhir.stu3.proto.ReferenceOrBuilder getDefinitionOrBuilder(
      int index);

  /**
   * <pre>
   * Request fulfilled by this request
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Reference based_on = 11 [(.google.fhir.proto.valid_reference_type) = "ReferralRequest", (.google.fhir.proto.valid_reference_type) = "CarePlan", (.google.fhir.proto.valid_reference_type) = "ProcedureRequest"];</code>
   */
  java.util.List<com.google.fhir.stu3.proto.Reference> 
      getBasedOnList();
  /**
   * <pre>
   * Request fulfilled by this request
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Reference based_on = 11 [(.google.fhir.proto.valid_reference_type) = "ReferralRequest", (.google.fhir.proto.valid_reference_type) = "CarePlan", (.google.fhir.proto.valid_reference_type) = "ProcedureRequest"];</code>
   */
  com.google.fhir.stu3.proto.Reference getBasedOn(int index);
  /**
   * <pre>
   * Request fulfilled by this request
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Reference based_on = 11 [(.google.fhir.proto.valid_reference_type) = "ReferralRequest", (.google.fhir.proto.valid_reference_type) = "CarePlan", (.google.fhir.proto.valid_reference_type) = "ProcedureRequest"];</code>
   */
  int getBasedOnCount();
  /**
   * <pre>
   * Request fulfilled by this request
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Reference based_on = 11 [(.google.fhir.proto.valid_reference_type) = "ReferralRequest", (.google.fhir.proto.valid_reference_type) = "CarePlan", (.google.fhir.proto.valid_reference_type) = "ProcedureRequest"];</code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.ReferenceOrBuilder> 
      getBasedOnOrBuilderList();
  /**
   * <pre>
   * Request fulfilled by this request
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Reference based_on = 11 [(.google.fhir.proto.valid_reference_type) = "ReferralRequest", (.google.fhir.proto.valid_reference_type) = "CarePlan", (.google.fhir.proto.valid_reference_type) = "ProcedureRequest"];</code>
   */
  com.google.fhir.stu3.proto.ReferenceOrBuilder getBasedOnOrBuilder(
      int index);

  /**
   * <pre>
   * Request(s) replaced by this request
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Reference replaces = 12 [(.google.fhir.proto.valid_reference_type) = "ReferralRequest"];</code>
   */
  java.util.List<com.google.fhir.stu3.proto.Reference> 
      getReplacesList();
  /**
   * <pre>
   * Request(s) replaced by this request
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Reference replaces = 12 [(.google.fhir.proto.valid_reference_type) = "ReferralRequest"];</code>
   */
  com.google.fhir.stu3.proto.Reference getReplaces(int index);
  /**
   * <pre>
   * Request(s) replaced by this request
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Reference replaces = 12 [(.google.fhir.proto.valid_reference_type) = "ReferralRequest"];</code>
   */
  int getReplacesCount();
  /**
   * <pre>
   * Request(s) replaced by this request
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Reference replaces = 12 [(.google.fhir.proto.valid_reference_type) = "ReferralRequest"];</code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.ReferenceOrBuilder> 
      getReplacesOrBuilderList();
  /**
   * <pre>
   * Request(s) replaced by this request
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Reference replaces = 12 [(.google.fhir.proto.valid_reference_type) = "ReferralRequest"];</code>
   */
  com.google.fhir.stu3.proto.ReferenceOrBuilder getReplacesOrBuilder(
      int index);

  /**
   * <pre>
   * Composite request this is part of
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Identifier group_identifier = 13;</code>
   * @return Whether the groupIdentifier field is set.
   */
  boolean hasGroupIdentifier();
  /**
   * <pre>
   * Composite request this is part of
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Identifier group_identifier = 13;</code>
   * @return The groupIdentifier.
   */
  com.google.fhir.stu3.proto.Identifier getGroupIdentifier();
  /**
   * <pre>
   * Composite request this is part of
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Identifier group_identifier = 13;</code>
   */
  com.google.fhir.stu3.proto.IdentifierOrBuilder getGroupIdentifierOrBuilder();

  /**
   * <pre>
   * draft | active | suspended | cancelled | completed | entered-in-error |
   * unknown
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.RequestStatusCode status = 14 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   * @return Whether the status field is set.
   */
  boolean hasStatus();
  /**
   * <pre>
   * draft | active | suspended | cancelled | completed | entered-in-error |
   * unknown
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.RequestStatusCode status = 14 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   * @return The status.
   */
  com.google.fhir.stu3.proto.RequestStatusCode getStatus();
  /**
   * <pre>
   * draft | active | suspended | cancelled | completed | entered-in-error |
   * unknown
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.RequestStatusCode status = 14 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   */
  com.google.fhir.stu3.proto.RequestStatusCodeOrBuilder getStatusOrBuilder();

  /**
   * <pre>
   * proposal | plan | order
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.RequestIntentCode intent = 15 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   * @return Whether the intent field is set.
   */
  boolean hasIntent();
  /**
   * <pre>
   * proposal | plan | order
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.RequestIntentCode intent = 15 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   * @return The intent.
   */
  com.google.fhir.stu3.proto.RequestIntentCode getIntent();
  /**
   * <pre>
   * proposal | plan | order
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.RequestIntentCode intent = 15 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   */
  com.google.fhir.stu3.proto.RequestIntentCodeOrBuilder getIntentOrBuilder();

  /**
   * <pre>
   * Referral/Transition of care request type
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.CodeableConcept type = 16;</code>
   * @return Whether the type field is set.
   */
  boolean hasType();
  /**
   * <pre>
   * Referral/Transition of care request type
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.CodeableConcept type = 16;</code>
   * @return The type.
   */
  com.google.fhir.stu3.proto.CodeableConcept getType();
  /**
   * <pre>
   * Referral/Transition of care request type
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.CodeableConcept type = 16;</code>
   */
  com.google.fhir.stu3.proto.CodeableConceptOrBuilder getTypeOrBuilder();

  /**
   * <pre>
   * Urgency of referral / transfer of care request
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.RequestPriorityCode priority = 17;</code>
   * @return Whether the priority field is set.
   */
  boolean hasPriority();
  /**
   * <pre>
   * Urgency of referral / transfer of care request
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.RequestPriorityCode priority = 17;</code>
   * @return The priority.
   */
  com.google.fhir.stu3.proto.RequestPriorityCode getPriority();
  /**
   * <pre>
   * Urgency of referral / transfer of care request
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.RequestPriorityCode priority = 17;</code>
   */
  com.google.fhir.stu3.proto.RequestPriorityCodeOrBuilder getPriorityOrBuilder();

  /**
   * <pre>
   * Actions requested as part of the referral
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.CodeableConcept service_requested = 18;</code>
   */
  java.util.List<com.google.fhir.stu3.proto.CodeableConcept> 
      getServiceRequestedList();
  /**
   * <pre>
   * Actions requested as part of the referral
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.CodeableConcept service_requested = 18;</code>
   */
  com.google.fhir.stu3.proto.CodeableConcept getServiceRequested(int index);
  /**
   * <pre>
   * Actions requested as part of the referral
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.CodeableConcept service_requested = 18;</code>
   */
  int getServiceRequestedCount();
  /**
   * <pre>
   * Actions requested as part of the referral
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.CodeableConcept service_requested = 18;</code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.CodeableConceptOrBuilder> 
      getServiceRequestedOrBuilderList();
  /**
   * <pre>
   * Actions requested as part of the referral
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.CodeableConcept service_requested = 18;</code>
   */
  com.google.fhir.stu3.proto.CodeableConceptOrBuilder getServiceRequestedOrBuilder(
      int index);

  /**
   * <pre>
   * Patient referred to care or transfer
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Reference subject = 19 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR, (.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "Group"];</code>
   * @return Whether the subject field is set.
   */
  boolean hasSubject();
  /**
   * <pre>
   * Patient referred to care or transfer
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Reference subject = 19 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR, (.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "Group"];</code>
   * @return The subject.
   */
  com.google.fhir.stu3.proto.Reference getSubject();
  /**
   * <pre>
   * Patient referred to care or transfer
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Reference subject = 19 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR, (.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "Group"];</code>
   */
  com.google.fhir.stu3.proto.ReferenceOrBuilder getSubjectOrBuilder();

  /**
   * <pre>
   * Originating encounter
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Reference context = 20 [(.google.fhir.proto.valid_reference_type) = "Encounter", (.google.fhir.proto.valid_reference_type) = "EpisodeOfCare"];</code>
   * @return Whether the context field is set.
   */
  boolean hasContext();
  /**
   * <pre>
   * Originating encounter
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Reference context = 20 [(.google.fhir.proto.valid_reference_type) = "Encounter", (.google.fhir.proto.valid_reference_type) = "EpisodeOfCare"];</code>
   * @return The context.
   */
  com.google.fhir.stu3.proto.Reference getContext();
  /**
   * <pre>
   * Originating encounter
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Reference context = 20 [(.google.fhir.proto.valid_reference_type) = "Encounter", (.google.fhir.proto.valid_reference_type) = "EpisodeOfCare"];</code>
   */
  com.google.fhir.stu3.proto.ReferenceOrBuilder getContextOrBuilder();

  /**
   * <code>.google.fhir.stu3.proto.ReferralRequest.Occurrence occurrence = 21;</code>
   * @return Whether the occurrence field is set.
   */
  boolean hasOccurrence();
  /**
   * <code>.google.fhir.stu3.proto.ReferralRequest.Occurrence occurrence = 21;</code>
   * @return The occurrence.
   */
  com.google.fhir.stu3.proto.ReferralRequest.Occurrence getOccurrence();
  /**
   * <code>.google.fhir.stu3.proto.ReferralRequest.Occurrence occurrence = 21;</code>
   */
  com.google.fhir.stu3.proto.ReferralRequest.OccurrenceOrBuilder getOccurrenceOrBuilder();

  /**
   * <pre>
   * Date of creation/activation
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.DateTime authored_on = 22;</code>
   * @return Whether the authoredOn field is set.
   */
  boolean hasAuthoredOn();
  /**
   * <pre>
   * Date of creation/activation
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.DateTime authored_on = 22;</code>
   * @return The authoredOn.
   */
  com.google.fhir.stu3.proto.DateTime getAuthoredOn();
  /**
   * <pre>
   * Date of creation/activation
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.DateTime authored_on = 22;</code>
   */
  com.google.fhir.stu3.proto.DateTimeOrBuilder getAuthoredOnOrBuilder();

  /**
   * <code>.google.fhir.stu3.proto.ReferralRequest.Requester requester = 23 [(.google.fhir.proto.fhir_path_constraint) = "(agent.resolve() is Device) or (agent.resolve() is Practitioner) or onBehalfOf.exists().not()"];</code>
   * @return Whether the requester field is set.
   */
  boolean hasRequester();
  /**
   * <code>.google.fhir.stu3.proto.ReferralRequest.Requester requester = 23 [(.google.fhir.proto.fhir_path_constraint) = "(agent.resolve() is Device) or (agent.resolve() is Practitioner) or onBehalfOf.exists().not()"];</code>
   * @return The requester.
   */
  com.google.fhir.stu3.proto.ReferralRequest.Requester getRequester();
  /**
   * <code>.google.fhir.stu3.proto.ReferralRequest.Requester requester = 23 [(.google.fhir.proto.fhir_path_constraint) = "(agent.resolve() is Device) or (agent.resolve() is Practitioner) or onBehalfOf.exists().not()"];</code>
   */
  com.google.fhir.stu3.proto.ReferralRequest.RequesterOrBuilder getRequesterOrBuilder();

  /**
   * <pre>
   * The clinical specialty (discipline) that the referral is requested for
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.CodeableConcept specialty = 24;</code>
   * @return Whether the specialty field is set.
   */
  boolean hasSpecialty();
  /**
   * <pre>
   * The clinical specialty (discipline) that the referral is requested for
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.CodeableConcept specialty = 24;</code>
   * @return The specialty.
   */
  com.google.fhir.stu3.proto.CodeableConcept getSpecialty();
  /**
   * <pre>
   * The clinical specialty (discipline) that the referral is requested for
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.CodeableConcept specialty = 24;</code>
   */
  com.google.fhir.stu3.proto.CodeableConceptOrBuilder getSpecialtyOrBuilder();

  /**
   * <pre>
   * Receiver of referral / transfer of care request
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Reference recipient = 25 [(.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "Organization", (.google.fhir.proto.valid_reference_type) = "HealthcareService"];</code>
   */
  java.util.List<com.google.fhir.stu3.proto.Reference> 
      getRecipientList();
  /**
   * <pre>
   * Receiver of referral / transfer of care request
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Reference recipient = 25 [(.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "Organization", (.google.fhir.proto.valid_reference_type) = "HealthcareService"];</code>
   */
  com.google.fhir.stu3.proto.Reference getRecipient(int index);
  /**
   * <pre>
   * Receiver of referral / transfer of care request
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Reference recipient = 25 [(.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "Organization", (.google.fhir.proto.valid_reference_type) = "HealthcareService"];</code>
   */
  int getRecipientCount();
  /**
   * <pre>
   * Receiver of referral / transfer of care request
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Reference recipient = 25 [(.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "Organization", (.google.fhir.proto.valid_reference_type) = "HealthcareService"];</code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.ReferenceOrBuilder> 
      getRecipientOrBuilderList();
  /**
   * <pre>
   * Receiver of referral / transfer of care request
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Reference recipient = 25 [(.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "Organization", (.google.fhir.proto.valid_reference_type) = "HealthcareService"];</code>
   */
  com.google.fhir.stu3.proto.ReferenceOrBuilder getRecipientOrBuilder(
      int index);

  /**
   * <pre>
   * Reason for referral / transfer of care request
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.CodeableConcept reason_code = 26;</code>
   */
  java.util.List<com.google.fhir.stu3.proto.CodeableConcept> 
      getReasonCodeList();
  /**
   * <pre>
   * Reason for referral / transfer of care request
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.CodeableConcept reason_code = 26;</code>
   */
  com.google.fhir.stu3.proto.CodeableConcept getReasonCode(int index);
  /**
   * <pre>
   * Reason for referral / transfer of care request
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.CodeableConcept reason_code = 26;</code>
   */
  int getReasonCodeCount();
  /**
   * <pre>
   * Reason for referral / transfer of care request
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.CodeableConcept reason_code = 26;</code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.CodeableConceptOrBuilder> 
      getReasonCodeOrBuilderList();
  /**
   * <pre>
   * Reason for referral / transfer of care request
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.CodeableConcept reason_code = 26;</code>
   */
  com.google.fhir.stu3.proto.CodeableConceptOrBuilder getReasonCodeOrBuilder(
      int index);

  /**
   * <pre>
   * Why is service needed?
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Reference reason_reference = 27 [(.google.fhir.proto.valid_reference_type) = "Condition", (.google.fhir.proto.valid_reference_type) = "Observation"];</code>
   */
  java.util.List<com.google.fhir.stu3.proto.Reference> 
      getReasonReferenceList();
  /**
   * <pre>
   * Why is service needed?
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Reference reason_reference = 27 [(.google.fhir.proto.valid_reference_type) = "Condition", (.google.fhir.proto.valid_reference_type) = "Observation"];</code>
   */
  com.google.fhir.stu3.proto.Reference getReasonReference(int index);
  /**
   * <pre>
   * Why is service needed?
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Reference reason_reference = 27 [(.google.fhir.proto.valid_reference_type) = "Condition", (.google.fhir.proto.valid_reference_type) = "Observation"];</code>
   */
  int getReasonReferenceCount();
  /**
   * <pre>
   * Why is service needed?
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Reference reason_reference = 27 [(.google.fhir.proto.valid_reference_type) = "Condition", (.google.fhir.proto.valid_reference_type) = "Observation"];</code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.ReferenceOrBuilder> 
      getReasonReferenceOrBuilderList();
  /**
   * <pre>
   * Why is service needed?
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Reference reason_reference = 27 [(.google.fhir.proto.valid_reference_type) = "Condition", (.google.fhir.proto.valid_reference_type) = "Observation"];</code>
   */
  com.google.fhir.stu3.proto.ReferenceOrBuilder getReasonReferenceOrBuilder(
      int index);

  /**
   * <pre>
   * A textual description of the referral
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.String description = 28;</code>
   * @return Whether the description field is set.
   */
  boolean hasDescription();
  /**
   * <pre>
   * A textual description of the referral
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.String description = 28;</code>
   * @return The description.
   */
  com.google.fhir.stu3.proto.String getDescription();
  /**
   * <pre>
   * A textual description of the referral
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.String description = 28;</code>
   */
  com.google.fhir.stu3.proto.StringOrBuilder getDescriptionOrBuilder();

  /**
   * <pre>
   * Additonal information to support referral or transfer of care request
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Reference supporting_info = 29 [(.google.fhir.proto.valid_reference_type) = "Resource"];</code>
   */
  java.util.List<com.google.fhir.stu3.proto.Reference> 
      getSupportingInfoList();
  /**
   * <pre>
   * Additonal information to support referral or transfer of care request
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Reference supporting_info = 29 [(.google.fhir.proto.valid_reference_type) = "Resource"];</code>
   */
  com.google.fhir.stu3.proto.Reference getSupportingInfo(int index);
  /**
   * <pre>
   * Additonal information to support referral or transfer of care request
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Reference supporting_info = 29 [(.google.fhir.proto.valid_reference_type) = "Resource"];</code>
   */
  int getSupportingInfoCount();
  /**
   * <pre>
   * Additonal information to support referral or transfer of care request
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Reference supporting_info = 29 [(.google.fhir.proto.valid_reference_type) = "Resource"];</code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.ReferenceOrBuilder> 
      getSupportingInfoOrBuilderList();
  /**
   * <pre>
   * Additonal information to support referral or transfer of care request
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Reference supporting_info = 29 [(.google.fhir.proto.valid_reference_type) = "Resource"];</code>
   */
  com.google.fhir.stu3.proto.ReferenceOrBuilder getSupportingInfoOrBuilder(
      int index);

  /**
   * <pre>
   * Comments made about referral request
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Annotation note = 30;</code>
   */
  java.util.List<com.google.fhir.stu3.proto.Annotation> 
      getNoteList();
  /**
   * <pre>
   * Comments made about referral request
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Annotation note = 30;</code>
   */
  com.google.fhir.stu3.proto.Annotation getNote(int index);
  /**
   * <pre>
   * Comments made about referral request
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Annotation note = 30;</code>
   */
  int getNoteCount();
  /**
   * <pre>
   * Comments made about referral request
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Annotation note = 30;</code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.AnnotationOrBuilder> 
      getNoteOrBuilderList();
  /**
   * <pre>
   * Comments made about referral request
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Annotation note = 30;</code>
   */
  com.google.fhir.stu3.proto.AnnotationOrBuilder getNoteOrBuilder(
      int index);

  /**
   * <pre>
   * Key events in history of request
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Reference relevant_history = 31 [(.google.fhir.proto.valid_reference_type) = "Provenance"];</code>
   */
  java.util.List<com.google.fhir.stu3.proto.Reference> 
      getRelevantHistoryList();
  /**
   * <pre>
   * Key events in history of request
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Reference relevant_history = 31 [(.google.fhir.proto.valid_reference_type) = "Provenance"];</code>
   */
  com.google.fhir.stu3.proto.Reference getRelevantHistory(int index);
  /**
   * <pre>
   * Key events in history of request
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Reference relevant_history = 31 [(.google.fhir.proto.valid_reference_type) = "Provenance"];</code>
   */
  int getRelevantHistoryCount();
  /**
   * <pre>
   * Key events in history of request
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Reference relevant_history = 31 [(.google.fhir.proto.valid_reference_type) = "Provenance"];</code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.ReferenceOrBuilder> 
      getRelevantHistoryOrBuilderList();
  /**
   * <pre>
   * Key events in history of request
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Reference relevant_history = 31 [(.google.fhir.proto.valid_reference_type) = "Provenance"];</code>
   */
  com.google.fhir.stu3.proto.ReferenceOrBuilder getRelevantHistoryOrBuilder(
      int index);
}
