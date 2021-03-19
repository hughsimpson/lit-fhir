// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/google/fhir/proto/stu3/profiles.proto

package com.google.fhir.stu3.proto;

public interface ClinicaldocumentOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.fhir.stu3.proto.Clinicaldocument)
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
   * Logical identifier of composition (version-independent)
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Identifier identifier = 9;</code>
   * @return Whether the identifier field is set.
   */
  boolean hasIdentifier();
  /**
   * <pre>
   * Logical identifier of composition (version-independent)
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Identifier identifier = 9;</code>
   * @return The identifier.
   */
  com.google.fhir.stu3.proto.Identifier getIdentifier();
  /**
   * <pre>
   * Logical identifier of composition (version-independent)
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Identifier identifier = 9;</code>
   */
  com.google.fhir.stu3.proto.IdentifierOrBuilder getIdentifierOrBuilder();

  /**
   * <pre>
   * preliminary | final | amended | entered-in-error
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.CompositionStatusCode status = 10 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   * @return Whether the status field is set.
   */
  boolean hasStatus();
  /**
   * <pre>
   * preliminary | final | amended | entered-in-error
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.CompositionStatusCode status = 10 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   * @return The status.
   */
  com.google.fhir.stu3.proto.CompositionStatusCode getStatus();
  /**
   * <pre>
   * preliminary | final | amended | entered-in-error
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.CompositionStatusCode status = 10 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   */
  com.google.fhir.stu3.proto.CompositionStatusCodeOrBuilder getStatusOrBuilder();

  /**
   * <pre>
   * Kind of composition (LOINC if possible)
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.CodeableConcept type = 11 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   * @return Whether the type field is set.
   */
  boolean hasType();
  /**
   * <pre>
   * Kind of composition (LOINC if possible)
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.CodeableConcept type = 11 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   * @return The type.
   */
  com.google.fhir.stu3.proto.CodeableConcept getType();
  /**
   * <pre>
   * Kind of composition (LOINC if possible)
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.CodeableConcept type = 11 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   */
  com.google.fhir.stu3.proto.CodeableConceptOrBuilder getTypeOrBuilder();

  /**
   * <pre>
   * Categorization of Composition
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.CodeableConcept class_value = 12 [json_name = "class"];</code>
   * @return Whether the classValue field is set.
   */
  boolean hasClassValue();
  /**
   * <pre>
   * Categorization of Composition
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.CodeableConcept class_value = 12 [json_name = "class"];</code>
   * @return The classValue.
   */
  com.google.fhir.stu3.proto.CodeableConcept getClassValue();
  /**
   * <pre>
   * Categorization of Composition
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.CodeableConcept class_value = 12 [json_name = "class"];</code>
   */
  com.google.fhir.stu3.proto.CodeableConceptOrBuilder getClassValueOrBuilder();

  /**
   * <pre>
   * Who and/or what the composition is about
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Reference subject = 13 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR, (.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "Group", (.google.fhir.proto.valid_reference_type) = "Device", (.google.fhir.proto.valid_reference_type) = "Location"];</code>
   * @return Whether the subject field is set.
   */
  boolean hasSubject();
  /**
   * <pre>
   * Who and/or what the composition is about
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Reference subject = 13 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR, (.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "Group", (.google.fhir.proto.valid_reference_type) = "Device", (.google.fhir.proto.valid_reference_type) = "Location"];</code>
   * @return The subject.
   */
  com.google.fhir.stu3.proto.Reference getSubject();
  /**
   * <pre>
   * Who and/or what the composition is about
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Reference subject = 13 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR, (.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "Group", (.google.fhir.proto.valid_reference_type) = "Device", (.google.fhir.proto.valid_reference_type) = "Location"];</code>
   */
  com.google.fhir.stu3.proto.ReferenceOrBuilder getSubjectOrBuilder();

  /**
   * <pre>
   * Context of the Composition
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Reference encounter = 14 [(.google.fhir.proto.valid_reference_type) = "Encounter"];</code>
   * @return Whether the encounter field is set.
   */
  boolean hasEncounter();
  /**
   * <pre>
   * Context of the Composition
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Reference encounter = 14 [(.google.fhir.proto.valid_reference_type) = "Encounter"];</code>
   * @return The encounter.
   */
  com.google.fhir.stu3.proto.Reference getEncounter();
  /**
   * <pre>
   * Context of the Composition
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Reference encounter = 14 [(.google.fhir.proto.valid_reference_type) = "Encounter"];</code>
   */
  com.google.fhir.stu3.proto.ReferenceOrBuilder getEncounterOrBuilder();

  /**
   * <pre>
   * Composition editing time
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.DateTime date = 15 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   * @return Whether the date field is set.
   */
  boolean hasDate();
  /**
   * <pre>
   * Composition editing time
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.DateTime date = 15 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   * @return The date.
   */
  com.google.fhir.stu3.proto.DateTime getDate();
  /**
   * <pre>
   * Composition editing time
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.DateTime date = 15 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   */
  com.google.fhir.stu3.proto.DateTimeOrBuilder getDateOrBuilder();

  /**
   * <pre>
   * Who and/or what authored the composition
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Reference author = 16 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR, (.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "Device", (.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "RelatedPerson"];</code>
   */
  java.util.List<com.google.fhir.stu3.proto.Reference> 
      getAuthorList();
  /**
   * <pre>
   * Who and/or what authored the composition
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Reference author = 16 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR, (.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "Device", (.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "RelatedPerson"];</code>
   */
  com.google.fhir.stu3.proto.Reference getAuthor(int index);
  /**
   * <pre>
   * Who and/or what authored the composition
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Reference author = 16 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR, (.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "Device", (.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "RelatedPerson"];</code>
   */
  int getAuthorCount();
  /**
   * <pre>
   * Who and/or what authored the composition
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Reference author = 16 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR, (.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "Device", (.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "RelatedPerson"];</code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.ReferenceOrBuilder> 
      getAuthorOrBuilderList();
  /**
   * <pre>
   * Who and/or what authored the composition
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Reference author = 16 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR, (.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "Device", (.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "RelatedPerson"];</code>
   */
  com.google.fhir.stu3.proto.ReferenceOrBuilder getAuthorOrBuilder(
      int index);

  /**
   * <pre>
   * Human Readable name/title
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.String title = 17 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   * @return Whether the title field is set.
   */
  boolean hasTitle();
  /**
   * <pre>
   * Human Readable name/title
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.String title = 17 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   * @return The title.
   */
  com.google.fhir.stu3.proto.String getTitle();
  /**
   * <pre>
   * Human Readable name/title
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.String title = 17 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   */
  com.google.fhir.stu3.proto.StringOrBuilder getTitleOrBuilder();

  /**
   * <pre>
   * As defined by affinity domain
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.ConfidentialityClassificationCode confidentiality = 18;</code>
   * @return Whether the confidentiality field is set.
   */
  boolean hasConfidentiality();
  /**
   * <pre>
   * As defined by affinity domain
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.ConfidentialityClassificationCode confidentiality = 18;</code>
   * @return The confidentiality.
   */
  com.google.fhir.stu3.proto.ConfidentialityClassificationCode getConfidentiality();
  /**
   * <pre>
   * As defined by affinity domain
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.ConfidentialityClassificationCode confidentiality = 18;</code>
   */
  com.google.fhir.stu3.proto.ConfidentialityClassificationCodeOrBuilder getConfidentialityOrBuilder();

  /**
   * <code>repeated .google.fhir.stu3.proto.Clinicaldocument.Attester attester = 19;</code>
   */
  java.util.List<com.google.fhir.stu3.proto.Clinicaldocument.Attester> 
      getAttesterList();
  /**
   * <code>repeated .google.fhir.stu3.proto.Clinicaldocument.Attester attester = 19;</code>
   */
  com.google.fhir.stu3.proto.Clinicaldocument.Attester getAttester(int index);
  /**
   * <code>repeated .google.fhir.stu3.proto.Clinicaldocument.Attester attester = 19;</code>
   */
  int getAttesterCount();
  /**
   * <code>repeated .google.fhir.stu3.proto.Clinicaldocument.Attester attester = 19;</code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.Clinicaldocument.AttesterOrBuilder> 
      getAttesterOrBuilderList();
  /**
   * <code>repeated .google.fhir.stu3.proto.Clinicaldocument.Attester attester = 19;</code>
   */
  com.google.fhir.stu3.proto.Clinicaldocument.AttesterOrBuilder getAttesterOrBuilder(
      int index);

  /**
   * <pre>
   * Organization which maintains the composition
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Reference custodian = 20 [(.google.fhir.proto.valid_reference_type) = "Organization"];</code>
   * @return Whether the custodian field is set.
   */
  boolean hasCustodian();
  /**
   * <pre>
   * Organization which maintains the composition
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Reference custodian = 20 [(.google.fhir.proto.valid_reference_type) = "Organization"];</code>
   * @return The custodian.
   */
  com.google.fhir.stu3.proto.Reference getCustodian();
  /**
   * <pre>
   * Organization which maintains the composition
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Reference custodian = 20 [(.google.fhir.proto.valid_reference_type) = "Organization"];</code>
   */
  com.google.fhir.stu3.proto.ReferenceOrBuilder getCustodianOrBuilder();

  /**
   * <code>repeated .google.fhir.stu3.proto.Clinicaldocument.RelatesTo relates_to = 21;</code>
   */
  java.util.List<com.google.fhir.stu3.proto.Clinicaldocument.RelatesTo> 
      getRelatesToList();
  /**
   * <code>repeated .google.fhir.stu3.proto.Clinicaldocument.RelatesTo relates_to = 21;</code>
   */
  com.google.fhir.stu3.proto.Clinicaldocument.RelatesTo getRelatesTo(int index);
  /**
   * <code>repeated .google.fhir.stu3.proto.Clinicaldocument.RelatesTo relates_to = 21;</code>
   */
  int getRelatesToCount();
  /**
   * <code>repeated .google.fhir.stu3.proto.Clinicaldocument.RelatesTo relates_to = 21;</code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.Clinicaldocument.RelatesToOrBuilder> 
      getRelatesToOrBuilderList();
  /**
   * <code>repeated .google.fhir.stu3.proto.Clinicaldocument.RelatesTo relates_to = 21;</code>
   */
  com.google.fhir.stu3.proto.Clinicaldocument.RelatesToOrBuilder getRelatesToOrBuilder(
      int index);

  /**
   * <code>repeated .google.fhir.stu3.proto.Clinicaldocument.Event event = 22;</code>
   */
  java.util.List<com.google.fhir.stu3.proto.Clinicaldocument.Event> 
      getEventList();
  /**
   * <code>repeated .google.fhir.stu3.proto.Clinicaldocument.Event event = 22;</code>
   */
  com.google.fhir.stu3.proto.Clinicaldocument.Event getEvent(int index);
  /**
   * <code>repeated .google.fhir.stu3.proto.Clinicaldocument.Event event = 22;</code>
   */
  int getEventCount();
  /**
   * <code>repeated .google.fhir.stu3.proto.Clinicaldocument.Event event = 22;</code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.Clinicaldocument.EventOrBuilder> 
      getEventOrBuilderList();
  /**
   * <code>repeated .google.fhir.stu3.proto.Clinicaldocument.Event event = 22;</code>
   */
  com.google.fhir.stu3.proto.Clinicaldocument.EventOrBuilder getEventOrBuilder(
      int index);

  /**
   * <code>repeated .google.fhir.stu3.proto.Clinicaldocument.Section section = 23 [(.google.fhir.proto.fhir_path_constraint) = "text.exists() or entry.exists() or section.exists()", (.google.fhir.proto.fhir_path_constraint) = "emptyReason.empty() or entry.empty()"];</code>
   */
  java.util.List<com.google.fhir.stu3.proto.Clinicaldocument.Section> 
      getSectionList();
  /**
   * <code>repeated .google.fhir.stu3.proto.Clinicaldocument.Section section = 23 [(.google.fhir.proto.fhir_path_constraint) = "text.exists() or entry.exists() or section.exists()", (.google.fhir.proto.fhir_path_constraint) = "emptyReason.empty() or entry.empty()"];</code>
   */
  com.google.fhir.stu3.proto.Clinicaldocument.Section getSection(int index);
  /**
   * <code>repeated .google.fhir.stu3.proto.Clinicaldocument.Section section = 23 [(.google.fhir.proto.fhir_path_constraint) = "text.exists() or entry.exists() or section.exists()", (.google.fhir.proto.fhir_path_constraint) = "emptyReason.empty() or entry.empty()"];</code>
   */
  int getSectionCount();
  /**
   * <code>repeated .google.fhir.stu3.proto.Clinicaldocument.Section section = 23 [(.google.fhir.proto.fhir_path_constraint) = "text.exists() or entry.exists() or section.exists()", (.google.fhir.proto.fhir_path_constraint) = "emptyReason.empty() or entry.empty()"];</code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.Clinicaldocument.SectionOrBuilder> 
      getSectionOrBuilderList();
  /**
   * <code>repeated .google.fhir.stu3.proto.Clinicaldocument.Section section = 23 [(.google.fhir.proto.fhir_path_constraint) = "text.exists() or entry.exists() or section.exists()", (.google.fhir.proto.fhir_path_constraint) = "emptyReason.empty() or entry.empty()"];</code>
   */
  com.google.fhir.stu3.proto.Clinicaldocument.SectionOrBuilder getSectionOrBuilder(
      int index);
}
