// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/google/fhir/proto/stu3/resources.proto

package com.google.fhir.stu3.proto;

public interface EpisodeOfCareOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.fhir.stu3.proto.EpisodeOfCare)
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
   * Business Identifier(s) relevant for this EpisodeOfCare
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Identifier identifier = 9;</code>
   */
  java.util.List<com.google.fhir.stu3.proto.Identifier> 
      getIdentifierList();
  /**
   * <pre>
   * Business Identifier(s) relevant for this EpisodeOfCare
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Identifier identifier = 9;</code>
   */
  com.google.fhir.stu3.proto.Identifier getIdentifier(int index);
  /**
   * <pre>
   * Business Identifier(s) relevant for this EpisodeOfCare
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Identifier identifier = 9;</code>
   */
  int getIdentifierCount();
  /**
   * <pre>
   * Business Identifier(s) relevant for this EpisodeOfCare
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Identifier identifier = 9;</code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.IdentifierOrBuilder> 
      getIdentifierOrBuilderList();
  /**
   * <pre>
   * Business Identifier(s) relevant for this EpisodeOfCare
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Identifier identifier = 9;</code>
   */
  com.google.fhir.stu3.proto.IdentifierOrBuilder getIdentifierOrBuilder(
      int index);

  /**
   * <pre>
   * planned | waitlist | active | onhold | finished | cancelled |
   * entered-in-error
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.EpisodeOfCareStatusCode status = 10 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   * @return Whether the status field is set.
   */
  boolean hasStatus();
  /**
   * <pre>
   * planned | waitlist | active | onhold | finished | cancelled |
   * entered-in-error
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.EpisodeOfCareStatusCode status = 10 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   * @return The status.
   */
  com.google.fhir.stu3.proto.EpisodeOfCareStatusCode getStatus();
  /**
   * <pre>
   * planned | waitlist | active | onhold | finished | cancelled |
   * entered-in-error
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.EpisodeOfCareStatusCode status = 10 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   */
  com.google.fhir.stu3.proto.EpisodeOfCareStatusCodeOrBuilder getStatusOrBuilder();

  /**
   * <code>repeated .google.fhir.stu3.proto.EpisodeOfCare.StatusHistory status_history = 11;</code>
   */
  java.util.List<com.google.fhir.stu3.proto.EpisodeOfCare.StatusHistory> 
      getStatusHistoryList();
  /**
   * <code>repeated .google.fhir.stu3.proto.EpisodeOfCare.StatusHistory status_history = 11;</code>
   */
  com.google.fhir.stu3.proto.EpisodeOfCare.StatusHistory getStatusHistory(int index);
  /**
   * <code>repeated .google.fhir.stu3.proto.EpisodeOfCare.StatusHistory status_history = 11;</code>
   */
  int getStatusHistoryCount();
  /**
   * <code>repeated .google.fhir.stu3.proto.EpisodeOfCare.StatusHistory status_history = 11;</code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.EpisodeOfCare.StatusHistoryOrBuilder> 
      getStatusHistoryOrBuilderList();
  /**
   * <code>repeated .google.fhir.stu3.proto.EpisodeOfCare.StatusHistory status_history = 11;</code>
   */
  com.google.fhir.stu3.proto.EpisodeOfCare.StatusHistoryOrBuilder getStatusHistoryOrBuilder(
      int index);

  /**
   * <pre>
   * Type/class  - e.g. specialist referral, disease management
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.CodeableConcept type = 12;</code>
   */
  java.util.List<com.google.fhir.stu3.proto.CodeableConcept> 
      getTypeList();
  /**
   * <pre>
   * Type/class  - e.g. specialist referral, disease management
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.CodeableConcept type = 12;</code>
   */
  com.google.fhir.stu3.proto.CodeableConcept getType(int index);
  /**
   * <pre>
   * Type/class  - e.g. specialist referral, disease management
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.CodeableConcept type = 12;</code>
   */
  int getTypeCount();
  /**
   * <pre>
   * Type/class  - e.g. specialist referral, disease management
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.CodeableConcept type = 12;</code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.CodeableConceptOrBuilder> 
      getTypeOrBuilderList();
  /**
   * <pre>
   * Type/class  - e.g. specialist referral, disease management
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.CodeableConcept type = 12;</code>
   */
  com.google.fhir.stu3.proto.CodeableConceptOrBuilder getTypeOrBuilder(
      int index);

  /**
   * <code>repeated .google.fhir.stu3.proto.EpisodeOfCare.Diagnosis diagnosis = 13;</code>
   */
  java.util.List<com.google.fhir.stu3.proto.EpisodeOfCare.Diagnosis> 
      getDiagnosisList();
  /**
   * <code>repeated .google.fhir.stu3.proto.EpisodeOfCare.Diagnosis diagnosis = 13;</code>
   */
  com.google.fhir.stu3.proto.EpisodeOfCare.Diagnosis getDiagnosis(int index);
  /**
   * <code>repeated .google.fhir.stu3.proto.EpisodeOfCare.Diagnosis diagnosis = 13;</code>
   */
  int getDiagnosisCount();
  /**
   * <code>repeated .google.fhir.stu3.proto.EpisodeOfCare.Diagnosis diagnosis = 13;</code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.EpisodeOfCare.DiagnosisOrBuilder> 
      getDiagnosisOrBuilderList();
  /**
   * <code>repeated .google.fhir.stu3.proto.EpisodeOfCare.Diagnosis diagnosis = 13;</code>
   */
  com.google.fhir.stu3.proto.EpisodeOfCare.DiagnosisOrBuilder getDiagnosisOrBuilder(
      int index);

  /**
   * <pre>
   * The patient who is the focus of this episode of care
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Reference patient = 14 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR, (.google.fhir.proto.valid_reference_type) = "Patient"];</code>
   * @return Whether the patient field is set.
   */
  boolean hasPatient();
  /**
   * <pre>
   * The patient who is the focus of this episode of care
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Reference patient = 14 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR, (.google.fhir.proto.valid_reference_type) = "Patient"];</code>
   * @return The patient.
   */
  com.google.fhir.stu3.proto.Reference getPatient();
  /**
   * <pre>
   * The patient who is the focus of this episode of care
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Reference patient = 14 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR, (.google.fhir.proto.valid_reference_type) = "Patient"];</code>
   */
  com.google.fhir.stu3.proto.ReferenceOrBuilder getPatientOrBuilder();

  /**
   * <pre>
   * Organization that assumes care
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Reference managing_organization = 15 [(.google.fhir.proto.valid_reference_type) = "Organization"];</code>
   * @return Whether the managingOrganization field is set.
   */
  boolean hasManagingOrganization();
  /**
   * <pre>
   * Organization that assumes care
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Reference managing_organization = 15 [(.google.fhir.proto.valid_reference_type) = "Organization"];</code>
   * @return The managingOrganization.
   */
  com.google.fhir.stu3.proto.Reference getManagingOrganization();
  /**
   * <pre>
   * Organization that assumes care
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Reference managing_organization = 15 [(.google.fhir.proto.valid_reference_type) = "Organization"];</code>
   */
  com.google.fhir.stu3.proto.ReferenceOrBuilder getManagingOrganizationOrBuilder();

  /**
   * <pre>
   * Interval during responsibility is assumed
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Period period = 16;</code>
   * @return Whether the period field is set.
   */
  boolean hasPeriod();
  /**
   * <pre>
   * Interval during responsibility is assumed
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Period period = 16;</code>
   * @return The period.
   */
  com.google.fhir.stu3.proto.Period getPeriod();
  /**
   * <pre>
   * Interval during responsibility is assumed
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Period period = 16;</code>
   */
  com.google.fhir.stu3.proto.PeriodOrBuilder getPeriodOrBuilder();

  /**
   * <pre>
   * Originating Referral Request(s)
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Reference referral_request = 17 [(.google.fhir.proto.valid_reference_type) = "ReferralRequest"];</code>
   */
  java.util.List<com.google.fhir.stu3.proto.Reference> 
      getReferralRequestList();
  /**
   * <pre>
   * Originating Referral Request(s)
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Reference referral_request = 17 [(.google.fhir.proto.valid_reference_type) = "ReferralRequest"];</code>
   */
  com.google.fhir.stu3.proto.Reference getReferralRequest(int index);
  /**
   * <pre>
   * Originating Referral Request(s)
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Reference referral_request = 17 [(.google.fhir.proto.valid_reference_type) = "ReferralRequest"];</code>
   */
  int getReferralRequestCount();
  /**
   * <pre>
   * Originating Referral Request(s)
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Reference referral_request = 17 [(.google.fhir.proto.valid_reference_type) = "ReferralRequest"];</code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.ReferenceOrBuilder> 
      getReferralRequestOrBuilderList();
  /**
   * <pre>
   * Originating Referral Request(s)
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Reference referral_request = 17 [(.google.fhir.proto.valid_reference_type) = "ReferralRequest"];</code>
   */
  com.google.fhir.stu3.proto.ReferenceOrBuilder getReferralRequestOrBuilder(
      int index);

  /**
   * <pre>
   * Care manager/care co-ordinator for the patient
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Reference care_manager = 18 [(.google.fhir.proto.valid_reference_type) = "Practitioner"];</code>
   * @return Whether the careManager field is set.
   */
  boolean hasCareManager();
  /**
   * <pre>
   * Care manager/care co-ordinator for the patient
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Reference care_manager = 18 [(.google.fhir.proto.valid_reference_type) = "Practitioner"];</code>
   * @return The careManager.
   */
  com.google.fhir.stu3.proto.Reference getCareManager();
  /**
   * <pre>
   * Care manager/care co-ordinator for the patient
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Reference care_manager = 18 [(.google.fhir.proto.valid_reference_type) = "Practitioner"];</code>
   */
  com.google.fhir.stu3.proto.ReferenceOrBuilder getCareManagerOrBuilder();

  /**
   * <pre>
   * Other practitioners facilitating this episode of care
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Reference team = 19 [(.google.fhir.proto.valid_reference_type) = "CareTeam"];</code>
   */
  java.util.List<com.google.fhir.stu3.proto.Reference> 
      getTeamList();
  /**
   * <pre>
   * Other practitioners facilitating this episode of care
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Reference team = 19 [(.google.fhir.proto.valid_reference_type) = "CareTeam"];</code>
   */
  com.google.fhir.stu3.proto.Reference getTeam(int index);
  /**
   * <pre>
   * Other practitioners facilitating this episode of care
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Reference team = 19 [(.google.fhir.proto.valid_reference_type) = "CareTeam"];</code>
   */
  int getTeamCount();
  /**
   * <pre>
   * Other practitioners facilitating this episode of care
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Reference team = 19 [(.google.fhir.proto.valid_reference_type) = "CareTeam"];</code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.ReferenceOrBuilder> 
      getTeamOrBuilderList();
  /**
   * <pre>
   * Other practitioners facilitating this episode of care
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Reference team = 19 [(.google.fhir.proto.valid_reference_type) = "CareTeam"];</code>
   */
  com.google.fhir.stu3.proto.ReferenceOrBuilder getTeamOrBuilder(
      int index);

  /**
   * <pre>
   * The set of accounts that may be used for billing for this EpisodeOfCare
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Reference account = 20 [(.google.fhir.proto.valid_reference_type) = "Account"];</code>
   */
  java.util.List<com.google.fhir.stu3.proto.Reference> 
      getAccountList();
  /**
   * <pre>
   * The set of accounts that may be used for billing for this EpisodeOfCare
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Reference account = 20 [(.google.fhir.proto.valid_reference_type) = "Account"];</code>
   */
  com.google.fhir.stu3.proto.Reference getAccount(int index);
  /**
   * <pre>
   * The set of accounts that may be used for billing for this EpisodeOfCare
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Reference account = 20 [(.google.fhir.proto.valid_reference_type) = "Account"];</code>
   */
  int getAccountCount();
  /**
   * <pre>
   * The set of accounts that may be used for billing for this EpisodeOfCare
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Reference account = 20 [(.google.fhir.proto.valid_reference_type) = "Account"];</code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.ReferenceOrBuilder> 
      getAccountOrBuilderList();
  /**
   * <pre>
   * The set of accounts that may be used for billing for this EpisodeOfCare
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Reference account = 20 [(.google.fhir.proto.valid_reference_type) = "Account"];</code>
   */
  com.google.fhir.stu3.proto.ReferenceOrBuilder getAccountOrBuilder(
      int index);
}
