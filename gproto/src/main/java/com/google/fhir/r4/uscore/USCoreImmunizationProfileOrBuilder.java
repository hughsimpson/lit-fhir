// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/google/fhir/proto/r4/uscore.proto

package com.google.fhir.r4.uscore;

public interface USCoreImmunizationProfileOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.fhir.r4.uscore.USCoreImmunizationProfile)
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
   * Business identifier
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Identifier identifier = 10;</code>
   */
  java.util.List<com.google.fhir.r4.core.Identifier> 
      getIdentifierList();
  /**
   * <pre>
   * Business identifier
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Identifier identifier = 10;</code>
   */
  com.google.fhir.r4.core.Identifier getIdentifier(int index);
  /**
   * <pre>
   * Business identifier
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Identifier identifier = 10;</code>
   */
  int getIdentifierCount();
  /**
   * <pre>
   * Business identifier
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Identifier identifier = 10;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.IdentifierOrBuilder> 
      getIdentifierOrBuilderList();
  /**
   * <pre>
   * Business identifier
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Identifier identifier = 10;</code>
   */
  com.google.fhir.r4.core.IdentifierOrBuilder getIdentifierOrBuilder(
      int index);

  /**
   * <code>.google.fhir.r4.uscore.USCoreImmunizationProfile.StatusCode status = 11 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   * @return Whether the status field is set.
   */
  boolean hasStatus();
  /**
   * <code>.google.fhir.r4.uscore.USCoreImmunizationProfile.StatusCode status = 11 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   * @return The status.
   */
  com.google.fhir.r4.uscore.USCoreImmunizationProfile.StatusCode getStatus();
  /**
   * <code>.google.fhir.r4.uscore.USCoreImmunizationProfile.StatusCode status = 11 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   */
  com.google.fhir.r4.uscore.USCoreImmunizationProfile.StatusCodeOrBuilder getStatusOrBuilder();

  /**
   * <pre>
   * Reason not done
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept status_reason = 12;</code>
   * @return Whether the statusReason field is set.
   */
  boolean hasStatusReason();
  /**
   * <pre>
   * Reason not done
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept status_reason = 12;</code>
   * @return The statusReason.
   */
  com.google.fhir.r4.core.CodeableConcept getStatusReason();
  /**
   * <pre>
   * Reason not done
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept status_reason = 12;</code>
   */
  com.google.fhir.r4.core.CodeableConceptOrBuilder getStatusReasonOrBuilder();

  /**
   * <pre>
   * Vaccine Product Type (bind to CVX)
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept vaccine_code = 13 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   * @return Whether the vaccineCode field is set.
   */
  boolean hasVaccineCode();
  /**
   * <pre>
   * Vaccine Product Type (bind to CVX)
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept vaccine_code = 13 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   * @return The vaccineCode.
   */
  com.google.fhir.r4.core.CodeableConcept getVaccineCode();
  /**
   * <pre>
   * Vaccine Product Type (bind to CVX)
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept vaccine_code = 13 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   */
  com.google.fhir.r4.core.CodeableConceptOrBuilder getVaccineCodeOrBuilder();

  /**
   * <pre>
   * Who was immunized
   * </pre>
   *
   * <code>.google.fhir.r4.core.Reference patient = 14 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR, (.google.fhir.proto.valid_reference_type) = "Patient"];</code>
   * @return Whether the patient field is set.
   */
  boolean hasPatient();
  /**
   * <pre>
   * Who was immunized
   * </pre>
   *
   * <code>.google.fhir.r4.core.Reference patient = 14 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR, (.google.fhir.proto.valid_reference_type) = "Patient"];</code>
   * @return The patient.
   */
  com.google.fhir.r4.core.Reference getPatient();
  /**
   * <pre>
   * Who was immunized
   * </pre>
   *
   * <code>.google.fhir.r4.core.Reference patient = 14 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR, (.google.fhir.proto.valid_reference_type) = "Patient"];</code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getPatientOrBuilder();

  /**
   * <pre>
   * Encounter immunization was part of
   * </pre>
   *
   * <code>.google.fhir.r4.core.Reference encounter = 15 [(.google.fhir.proto.valid_reference_type) = "Encounter"];</code>
   * @return Whether the encounter field is set.
   */
  boolean hasEncounter();
  /**
   * <pre>
   * Encounter immunization was part of
   * </pre>
   *
   * <code>.google.fhir.r4.core.Reference encounter = 15 [(.google.fhir.proto.valid_reference_type) = "Encounter"];</code>
   * @return The encounter.
   */
  com.google.fhir.r4.core.Reference getEncounter();
  /**
   * <pre>
   * Encounter immunization was part of
   * </pre>
   *
   * <code>.google.fhir.r4.core.Reference encounter = 15 [(.google.fhir.proto.valid_reference_type) = "Encounter"];</code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getEncounterOrBuilder();

  /**
   * <code>.google.fhir.r4.uscore.USCoreImmunizationProfile.OccurrenceX occurrence = 16 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   * @return Whether the occurrence field is set.
   */
  boolean hasOccurrence();
  /**
   * <code>.google.fhir.r4.uscore.USCoreImmunizationProfile.OccurrenceX occurrence = 16 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   * @return The occurrence.
   */
  com.google.fhir.r4.uscore.USCoreImmunizationProfile.OccurrenceX getOccurrence();
  /**
   * <code>.google.fhir.r4.uscore.USCoreImmunizationProfile.OccurrenceX occurrence = 16 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   */
  com.google.fhir.r4.uscore.USCoreImmunizationProfile.OccurrenceXOrBuilder getOccurrenceOrBuilder();

  /**
   * <pre>
   * When the immunization was first captured in the subject's record
   * </pre>
   *
   * <code>.google.fhir.r4.core.DateTime recorded = 17;</code>
   * @return Whether the recorded field is set.
   */
  boolean hasRecorded();
  /**
   * <pre>
   * When the immunization was first captured in the subject's record
   * </pre>
   *
   * <code>.google.fhir.r4.core.DateTime recorded = 17;</code>
   * @return The recorded.
   */
  com.google.fhir.r4.core.DateTime getRecorded();
  /**
   * <pre>
   * When the immunization was first captured in the subject's record
   * </pre>
   *
   * <code>.google.fhir.r4.core.DateTime recorded = 17;</code>
   */
  com.google.fhir.r4.core.DateTimeOrBuilder getRecordedOrBuilder();

  /**
   * <pre>
   * Indicates context the data was recorded in
   * </pre>
   *
   * <code>.google.fhir.r4.core.Boolean primary_source = 18 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   * @return Whether the primarySource field is set.
   */
  boolean hasPrimarySource();
  /**
   * <pre>
   * Indicates context the data was recorded in
   * </pre>
   *
   * <code>.google.fhir.r4.core.Boolean primary_source = 18 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   * @return The primarySource.
   */
  com.google.fhir.r4.core.Boolean getPrimarySource();
  /**
   * <pre>
   * Indicates context the data was recorded in
   * </pre>
   *
   * <code>.google.fhir.r4.core.Boolean primary_source = 18 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   */
  com.google.fhir.r4.core.BooleanOrBuilder getPrimarySourceOrBuilder();

  /**
   * <pre>
   * Indicates the source of a secondarily reported record
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept report_origin = 19;</code>
   * @return Whether the reportOrigin field is set.
   */
  boolean hasReportOrigin();
  /**
   * <pre>
   * Indicates the source of a secondarily reported record
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept report_origin = 19;</code>
   * @return The reportOrigin.
   */
  com.google.fhir.r4.core.CodeableConcept getReportOrigin();
  /**
   * <pre>
   * Indicates the source of a secondarily reported record
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept report_origin = 19;</code>
   */
  com.google.fhir.r4.core.CodeableConceptOrBuilder getReportOriginOrBuilder();

  /**
   * <pre>
   * Where immunization occurred
   * </pre>
   *
   * <code>.google.fhir.r4.core.Reference location = 20 [(.google.fhir.proto.valid_reference_type) = "Location"];</code>
   * @return Whether the location field is set.
   */
  boolean hasLocation();
  /**
   * <pre>
   * Where immunization occurred
   * </pre>
   *
   * <code>.google.fhir.r4.core.Reference location = 20 [(.google.fhir.proto.valid_reference_type) = "Location"];</code>
   * @return The location.
   */
  com.google.fhir.r4.core.Reference getLocation();
  /**
   * <pre>
   * Where immunization occurred
   * </pre>
   *
   * <code>.google.fhir.r4.core.Reference location = 20 [(.google.fhir.proto.valid_reference_type) = "Location"];</code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getLocationOrBuilder();

  /**
   * <pre>
   * Vaccine manufacturer
   * </pre>
   *
   * <code>.google.fhir.r4.core.Reference manufacturer = 21 [(.google.fhir.proto.valid_reference_type) = "Organization"];</code>
   * @return Whether the manufacturer field is set.
   */
  boolean hasManufacturer();
  /**
   * <pre>
   * Vaccine manufacturer
   * </pre>
   *
   * <code>.google.fhir.r4.core.Reference manufacturer = 21 [(.google.fhir.proto.valid_reference_type) = "Organization"];</code>
   * @return The manufacturer.
   */
  com.google.fhir.r4.core.Reference getManufacturer();
  /**
   * <pre>
   * Vaccine manufacturer
   * </pre>
   *
   * <code>.google.fhir.r4.core.Reference manufacturer = 21 [(.google.fhir.proto.valid_reference_type) = "Organization"];</code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getManufacturerOrBuilder();

  /**
   * <pre>
   * Vaccine lot number
   * </pre>
   *
   * <code>.google.fhir.r4.core.String lot_number = 22;</code>
   * @return Whether the lotNumber field is set.
   */
  boolean hasLotNumber();
  /**
   * <pre>
   * Vaccine lot number
   * </pre>
   *
   * <code>.google.fhir.r4.core.String lot_number = 22;</code>
   * @return The lotNumber.
   */
  com.google.fhir.r4.core.String getLotNumber();
  /**
   * <pre>
   * Vaccine lot number
   * </pre>
   *
   * <code>.google.fhir.r4.core.String lot_number = 22;</code>
   */
  com.google.fhir.r4.core.StringOrBuilder getLotNumberOrBuilder();

  /**
   * <pre>
   * Vaccine expiration date
   * </pre>
   *
   * <code>.google.fhir.r4.core.Date expiration_date = 23;</code>
   * @return Whether the expirationDate field is set.
   */
  boolean hasExpirationDate();
  /**
   * <pre>
   * Vaccine expiration date
   * </pre>
   *
   * <code>.google.fhir.r4.core.Date expiration_date = 23;</code>
   * @return The expirationDate.
   */
  com.google.fhir.r4.core.Date getExpirationDate();
  /**
   * <pre>
   * Vaccine expiration date
   * </pre>
   *
   * <code>.google.fhir.r4.core.Date expiration_date = 23;</code>
   */
  com.google.fhir.r4.core.DateOrBuilder getExpirationDateOrBuilder();

  /**
   * <pre>
   * Body site vaccine  was administered
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept site = 24;</code>
   * @return Whether the site field is set.
   */
  boolean hasSite();
  /**
   * <pre>
   * Body site vaccine  was administered
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept site = 24;</code>
   * @return The site.
   */
  com.google.fhir.r4.core.CodeableConcept getSite();
  /**
   * <pre>
   * Body site vaccine  was administered
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept site = 24;</code>
   */
  com.google.fhir.r4.core.CodeableConceptOrBuilder getSiteOrBuilder();

  /**
   * <pre>
   * How vaccine entered body
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept route = 25;</code>
   * @return Whether the route field is set.
   */
  boolean hasRoute();
  /**
   * <pre>
   * How vaccine entered body
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept route = 25;</code>
   * @return The route.
   */
  com.google.fhir.r4.core.CodeableConcept getRoute();
  /**
   * <pre>
   * How vaccine entered body
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept route = 25;</code>
   */
  com.google.fhir.r4.core.CodeableConceptOrBuilder getRouteOrBuilder();

  /**
   * <pre>
   * Amount of vaccine administered
   * </pre>
   *
   * <code>.google.fhir.r4.core.SimpleQuantity dose_quantity = 26;</code>
   * @return Whether the doseQuantity field is set.
   */
  boolean hasDoseQuantity();
  /**
   * <pre>
   * Amount of vaccine administered
   * </pre>
   *
   * <code>.google.fhir.r4.core.SimpleQuantity dose_quantity = 26;</code>
   * @return The doseQuantity.
   */
  com.google.fhir.r4.core.SimpleQuantity getDoseQuantity();
  /**
   * <pre>
   * Amount of vaccine administered
   * </pre>
   *
   * <code>.google.fhir.r4.core.SimpleQuantity dose_quantity = 26;</code>
   */
  com.google.fhir.r4.core.SimpleQuantityOrBuilder getDoseQuantityOrBuilder();

  /**
   * <code>repeated .google.fhir.r4.uscore.USCoreImmunizationProfile.Performer performer = 27;</code>
   */
  java.util.List<com.google.fhir.r4.uscore.USCoreImmunizationProfile.Performer> 
      getPerformerList();
  /**
   * <code>repeated .google.fhir.r4.uscore.USCoreImmunizationProfile.Performer performer = 27;</code>
   */
  com.google.fhir.r4.uscore.USCoreImmunizationProfile.Performer getPerformer(int index);
  /**
   * <code>repeated .google.fhir.r4.uscore.USCoreImmunizationProfile.Performer performer = 27;</code>
   */
  int getPerformerCount();
  /**
   * <code>repeated .google.fhir.r4.uscore.USCoreImmunizationProfile.Performer performer = 27;</code>
   */
  java.util.List<? extends com.google.fhir.r4.uscore.USCoreImmunizationProfile.PerformerOrBuilder> 
      getPerformerOrBuilderList();
  /**
   * <code>repeated .google.fhir.r4.uscore.USCoreImmunizationProfile.Performer performer = 27;</code>
   */
  com.google.fhir.r4.uscore.USCoreImmunizationProfile.PerformerOrBuilder getPerformerOrBuilder(
      int index);

  /**
   * <pre>
   * Additional immunization notes
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Annotation note = 28;</code>
   */
  java.util.List<com.google.fhir.r4.core.Annotation> 
      getNoteList();
  /**
   * <pre>
   * Additional immunization notes
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Annotation note = 28;</code>
   */
  com.google.fhir.r4.core.Annotation getNote(int index);
  /**
   * <pre>
   * Additional immunization notes
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Annotation note = 28;</code>
   */
  int getNoteCount();
  /**
   * <pre>
   * Additional immunization notes
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Annotation note = 28;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.AnnotationOrBuilder> 
      getNoteOrBuilderList();
  /**
   * <pre>
   * Additional immunization notes
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Annotation note = 28;</code>
   */
  com.google.fhir.r4.core.AnnotationOrBuilder getNoteOrBuilder(
      int index);

  /**
   * <pre>
   * Why immunization occurred
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept reason_code = 29;</code>
   */
  java.util.List<com.google.fhir.r4.core.CodeableConcept> 
      getReasonCodeList();
  /**
   * <pre>
   * Why immunization occurred
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept reason_code = 29;</code>
   */
  com.google.fhir.r4.core.CodeableConcept getReasonCode(int index);
  /**
   * <pre>
   * Why immunization occurred
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept reason_code = 29;</code>
   */
  int getReasonCodeCount();
  /**
   * <pre>
   * Why immunization occurred
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept reason_code = 29;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.CodeableConceptOrBuilder> 
      getReasonCodeOrBuilderList();
  /**
   * <pre>
   * Why immunization occurred
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept reason_code = 29;</code>
   */
  com.google.fhir.r4.core.CodeableConceptOrBuilder getReasonCodeOrBuilder(
      int index);

  /**
   * <pre>
   * Why immunization occurred
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Reference reason_reference = 30 [(.google.fhir.proto.valid_reference_type) = "Condition", (.google.fhir.proto.valid_reference_type) = "Observation", (.google.fhir.proto.valid_reference_type) = "DiagnosticReport"];</code>
   */
  java.util.List<com.google.fhir.r4.core.Reference> 
      getReasonReferenceList();
  /**
   * <pre>
   * Why immunization occurred
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Reference reason_reference = 30 [(.google.fhir.proto.valid_reference_type) = "Condition", (.google.fhir.proto.valid_reference_type) = "Observation", (.google.fhir.proto.valid_reference_type) = "DiagnosticReport"];</code>
   */
  com.google.fhir.r4.core.Reference getReasonReference(int index);
  /**
   * <pre>
   * Why immunization occurred
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Reference reason_reference = 30 [(.google.fhir.proto.valid_reference_type) = "Condition", (.google.fhir.proto.valid_reference_type) = "Observation", (.google.fhir.proto.valid_reference_type) = "DiagnosticReport"];</code>
   */
  int getReasonReferenceCount();
  /**
   * <pre>
   * Why immunization occurred
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Reference reason_reference = 30 [(.google.fhir.proto.valid_reference_type) = "Condition", (.google.fhir.proto.valid_reference_type) = "Observation", (.google.fhir.proto.valid_reference_type) = "DiagnosticReport"];</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.ReferenceOrBuilder> 
      getReasonReferenceOrBuilderList();
  /**
   * <pre>
   * Why immunization occurred
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Reference reason_reference = 30 [(.google.fhir.proto.valid_reference_type) = "Condition", (.google.fhir.proto.valid_reference_type) = "Observation", (.google.fhir.proto.valid_reference_type) = "DiagnosticReport"];</code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getReasonReferenceOrBuilder(
      int index);

  /**
   * <pre>
   * Dose potency
   * </pre>
   *
   * <code>.google.fhir.r4.core.Boolean is_subpotent = 31;</code>
   * @return Whether the isSubpotent field is set.
   */
  boolean hasIsSubpotent();
  /**
   * <pre>
   * Dose potency
   * </pre>
   *
   * <code>.google.fhir.r4.core.Boolean is_subpotent = 31;</code>
   * @return The isSubpotent.
   */
  com.google.fhir.r4.core.Boolean getIsSubpotent();
  /**
   * <pre>
   * Dose potency
   * </pre>
   *
   * <code>.google.fhir.r4.core.Boolean is_subpotent = 31;</code>
   */
  com.google.fhir.r4.core.BooleanOrBuilder getIsSubpotentOrBuilder();

  /**
   * <pre>
   * Reason for being subpotent
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept subpotent_reason = 32;</code>
   */
  java.util.List<com.google.fhir.r4.core.CodeableConcept> 
      getSubpotentReasonList();
  /**
   * <pre>
   * Reason for being subpotent
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept subpotent_reason = 32;</code>
   */
  com.google.fhir.r4.core.CodeableConcept getSubpotentReason(int index);
  /**
   * <pre>
   * Reason for being subpotent
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept subpotent_reason = 32;</code>
   */
  int getSubpotentReasonCount();
  /**
   * <pre>
   * Reason for being subpotent
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept subpotent_reason = 32;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.CodeableConceptOrBuilder> 
      getSubpotentReasonOrBuilderList();
  /**
   * <pre>
   * Reason for being subpotent
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept subpotent_reason = 32;</code>
   */
  com.google.fhir.r4.core.CodeableConceptOrBuilder getSubpotentReasonOrBuilder(
      int index);

  /**
   * <code>repeated .google.fhir.r4.uscore.USCoreImmunizationProfile.Education education = 33;</code>
   */
  java.util.List<com.google.fhir.r4.uscore.USCoreImmunizationProfile.Education> 
      getEducationList();
  /**
   * <code>repeated .google.fhir.r4.uscore.USCoreImmunizationProfile.Education education = 33;</code>
   */
  com.google.fhir.r4.uscore.USCoreImmunizationProfile.Education getEducation(int index);
  /**
   * <code>repeated .google.fhir.r4.uscore.USCoreImmunizationProfile.Education education = 33;</code>
   */
  int getEducationCount();
  /**
   * <code>repeated .google.fhir.r4.uscore.USCoreImmunizationProfile.Education education = 33;</code>
   */
  java.util.List<? extends com.google.fhir.r4.uscore.USCoreImmunizationProfile.EducationOrBuilder> 
      getEducationOrBuilderList();
  /**
   * <code>repeated .google.fhir.r4.uscore.USCoreImmunizationProfile.Education education = 33;</code>
   */
  com.google.fhir.r4.uscore.USCoreImmunizationProfile.EducationOrBuilder getEducationOrBuilder(
      int index);

  /**
   * <pre>
   * Patient eligibility for a vaccination program
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept program_eligibility = 34;</code>
   */
  java.util.List<com.google.fhir.r4.core.CodeableConcept> 
      getProgramEligibilityList();
  /**
   * <pre>
   * Patient eligibility for a vaccination program
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept program_eligibility = 34;</code>
   */
  com.google.fhir.r4.core.CodeableConcept getProgramEligibility(int index);
  /**
   * <pre>
   * Patient eligibility for a vaccination program
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept program_eligibility = 34;</code>
   */
  int getProgramEligibilityCount();
  /**
   * <pre>
   * Patient eligibility for a vaccination program
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept program_eligibility = 34;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.CodeableConceptOrBuilder> 
      getProgramEligibilityOrBuilderList();
  /**
   * <pre>
   * Patient eligibility for a vaccination program
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept program_eligibility = 34;</code>
   */
  com.google.fhir.r4.core.CodeableConceptOrBuilder getProgramEligibilityOrBuilder(
      int index);

  /**
   * <pre>
   * Funding source for the vaccine
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept funding_source = 35;</code>
   * @return Whether the fundingSource field is set.
   */
  boolean hasFundingSource();
  /**
   * <pre>
   * Funding source for the vaccine
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept funding_source = 35;</code>
   * @return The fundingSource.
   */
  com.google.fhir.r4.core.CodeableConcept getFundingSource();
  /**
   * <pre>
   * Funding source for the vaccine
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept funding_source = 35;</code>
   */
  com.google.fhir.r4.core.CodeableConceptOrBuilder getFundingSourceOrBuilder();

  /**
   * <code>repeated .google.fhir.r4.uscore.USCoreImmunizationProfile.Reaction reaction = 36;</code>
   */
  java.util.List<com.google.fhir.r4.uscore.USCoreImmunizationProfile.Reaction> 
      getReactionList();
  /**
   * <code>repeated .google.fhir.r4.uscore.USCoreImmunizationProfile.Reaction reaction = 36;</code>
   */
  com.google.fhir.r4.uscore.USCoreImmunizationProfile.Reaction getReaction(int index);
  /**
   * <code>repeated .google.fhir.r4.uscore.USCoreImmunizationProfile.Reaction reaction = 36;</code>
   */
  int getReactionCount();
  /**
   * <code>repeated .google.fhir.r4.uscore.USCoreImmunizationProfile.Reaction reaction = 36;</code>
   */
  java.util.List<? extends com.google.fhir.r4.uscore.USCoreImmunizationProfile.ReactionOrBuilder> 
      getReactionOrBuilderList();
  /**
   * <code>repeated .google.fhir.r4.uscore.USCoreImmunizationProfile.Reaction reaction = 36;</code>
   */
  com.google.fhir.r4.uscore.USCoreImmunizationProfile.ReactionOrBuilder getReactionOrBuilder(
      int index);

  /**
   * <code>repeated .google.fhir.r4.uscore.USCoreImmunizationProfile.ProtocolApplied protocol_applied = 37;</code>
   */
  java.util.List<com.google.fhir.r4.uscore.USCoreImmunizationProfile.ProtocolApplied> 
      getProtocolAppliedList();
  /**
   * <code>repeated .google.fhir.r4.uscore.USCoreImmunizationProfile.ProtocolApplied protocol_applied = 37;</code>
   */
  com.google.fhir.r4.uscore.USCoreImmunizationProfile.ProtocolApplied getProtocolApplied(int index);
  /**
   * <code>repeated .google.fhir.r4.uscore.USCoreImmunizationProfile.ProtocolApplied protocol_applied = 37;</code>
   */
  int getProtocolAppliedCount();
  /**
   * <code>repeated .google.fhir.r4.uscore.USCoreImmunizationProfile.ProtocolApplied protocol_applied = 37;</code>
   */
  java.util.List<? extends com.google.fhir.r4.uscore.USCoreImmunizationProfile.ProtocolAppliedOrBuilder> 
      getProtocolAppliedOrBuilderList();
  /**
   * <code>repeated .google.fhir.r4.uscore.USCoreImmunizationProfile.ProtocolApplied protocol_applied = 37;</code>
   */
  com.google.fhir.r4.uscore.USCoreImmunizationProfile.ProtocolAppliedOrBuilder getProtocolAppliedOrBuilder(
      int index);
}
