// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/google/fhir/proto/r4/core/resources/appointment_response.proto

package com.google.fhir.r4.core;

public interface AppointmentResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.fhir.r4.core.AppointmentResponse)
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
   * External Ids for this item
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Identifier identifier = 10;</code>
   */
  java.util.List<com.google.fhir.r4.core.Identifier> 
      getIdentifierList();
  /**
   * <pre>
   * External Ids for this item
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Identifier identifier = 10;</code>
   */
  com.google.fhir.r4.core.Identifier getIdentifier(int index);
  /**
   * <pre>
   * External Ids for this item
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Identifier identifier = 10;</code>
   */
  int getIdentifierCount();
  /**
   * <pre>
   * External Ids for this item
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Identifier identifier = 10;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.IdentifierOrBuilder> 
      getIdentifierOrBuilderList();
  /**
   * <pre>
   * External Ids for this item
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Identifier identifier = 10;</code>
   */
  com.google.fhir.r4.core.IdentifierOrBuilder getIdentifierOrBuilder(
      int index);

  /**
   * <pre>
   * Appointment this response relates to
   * </pre>
   *
   * <code>.google.fhir.r4.core.Reference appointment = 11 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR, (.google.fhir.proto.valid_reference_type) = "Appointment"];</code>
   * @return Whether the appointment field is set.
   */
  boolean hasAppointment();
  /**
   * <pre>
   * Appointment this response relates to
   * </pre>
   *
   * <code>.google.fhir.r4.core.Reference appointment = 11 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR, (.google.fhir.proto.valid_reference_type) = "Appointment"];</code>
   * @return The appointment.
   */
  com.google.fhir.r4.core.Reference getAppointment();
  /**
   * <pre>
   * Appointment this response relates to
   * </pre>
   *
   * <code>.google.fhir.r4.core.Reference appointment = 11 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR, (.google.fhir.proto.valid_reference_type) = "Appointment"];</code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getAppointmentOrBuilder();

  /**
   * <pre>
   * Time from appointment, or requested new start time
   * </pre>
   *
   * <code>.google.fhir.r4.core.Instant start = 12;</code>
   * @return Whether the start field is set.
   */
  boolean hasStart();
  /**
   * <pre>
   * Time from appointment, or requested new start time
   * </pre>
   *
   * <code>.google.fhir.r4.core.Instant start = 12;</code>
   * @return The start.
   */
  com.google.fhir.r4.core.Instant getStart();
  /**
   * <pre>
   * Time from appointment, or requested new start time
   * </pre>
   *
   * <code>.google.fhir.r4.core.Instant start = 12;</code>
   */
  com.google.fhir.r4.core.InstantOrBuilder getStartOrBuilder();

  /**
   * <pre>
   * Time from appointment, or requested new end time
   * </pre>
   *
   * <code>.google.fhir.r4.core.Instant end = 13;</code>
   * @return Whether the end field is set.
   */
  boolean hasEnd();
  /**
   * <pre>
   * Time from appointment, or requested new end time
   * </pre>
   *
   * <code>.google.fhir.r4.core.Instant end = 13;</code>
   * @return The end.
   */
  com.google.fhir.r4.core.Instant getEnd();
  /**
   * <pre>
   * Time from appointment, or requested new end time
   * </pre>
   *
   * <code>.google.fhir.r4.core.Instant end = 13;</code>
   */
  com.google.fhir.r4.core.InstantOrBuilder getEndOrBuilder();

  /**
   * <pre>
   * Role of participant in the appointment
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept participant_type = 14;</code>
   */
  java.util.List<com.google.fhir.r4.core.CodeableConcept> 
      getParticipantTypeList();
  /**
   * <pre>
   * Role of participant in the appointment
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept participant_type = 14;</code>
   */
  com.google.fhir.r4.core.CodeableConcept getParticipantType(int index);
  /**
   * <pre>
   * Role of participant in the appointment
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept participant_type = 14;</code>
   */
  int getParticipantTypeCount();
  /**
   * <pre>
   * Role of participant in the appointment
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept participant_type = 14;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.CodeableConceptOrBuilder> 
      getParticipantTypeOrBuilderList();
  /**
   * <pre>
   * Role of participant in the appointment
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept participant_type = 14;</code>
   */
  com.google.fhir.r4.core.CodeableConceptOrBuilder getParticipantTypeOrBuilder(
      int index);

  /**
   * <pre>
   * Person, Location, HealthcareService, or Device
   * </pre>
   *
   * <code>.google.fhir.r4.core.Reference actor = 15 [(.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "PractitionerRole", (.google.fhir.proto.valid_reference_type) = "RelatedPerson", (.google.fhir.proto.valid_reference_type) = "Device", (.google.fhir.proto.valid_reference_type) = "HealthcareService", (.google.fhir.proto.valid_reference_type) = "Location"];</code>
   * @return Whether the actor field is set.
   */
  boolean hasActor();
  /**
   * <pre>
   * Person, Location, HealthcareService, or Device
   * </pre>
   *
   * <code>.google.fhir.r4.core.Reference actor = 15 [(.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "PractitionerRole", (.google.fhir.proto.valid_reference_type) = "RelatedPerson", (.google.fhir.proto.valid_reference_type) = "Device", (.google.fhir.proto.valid_reference_type) = "HealthcareService", (.google.fhir.proto.valid_reference_type) = "Location"];</code>
   * @return The actor.
   */
  com.google.fhir.r4.core.Reference getActor();
  /**
   * <pre>
   * Person, Location, HealthcareService, or Device
   * </pre>
   *
   * <code>.google.fhir.r4.core.Reference actor = 15 [(.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "PractitionerRole", (.google.fhir.proto.valid_reference_type) = "RelatedPerson", (.google.fhir.proto.valid_reference_type) = "Device", (.google.fhir.proto.valid_reference_type) = "HealthcareService", (.google.fhir.proto.valid_reference_type) = "Location"];</code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getActorOrBuilder();

  /**
   * <code>.google.fhir.r4.core.AppointmentResponse.ParticipantStatusCode participant_status = 16 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   * @return Whether the participantStatus field is set.
   */
  boolean hasParticipantStatus();
  /**
   * <code>.google.fhir.r4.core.AppointmentResponse.ParticipantStatusCode participant_status = 16 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   * @return The participantStatus.
   */
  com.google.fhir.r4.core.AppointmentResponse.ParticipantStatusCode getParticipantStatus();
  /**
   * <code>.google.fhir.r4.core.AppointmentResponse.ParticipantStatusCode participant_status = 16 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   */
  com.google.fhir.r4.core.AppointmentResponse.ParticipantStatusCodeOrBuilder getParticipantStatusOrBuilder();

  /**
   * <pre>
   * Additional comments
   * </pre>
   *
   * <code>.google.fhir.r4.core.String comment = 17;</code>
   * @return Whether the comment field is set.
   */
  boolean hasComment();
  /**
   * <pre>
   * Additional comments
   * </pre>
   *
   * <code>.google.fhir.r4.core.String comment = 17;</code>
   * @return The comment.
   */
  com.google.fhir.r4.core.String getComment();
  /**
   * <pre>
   * Additional comments
   * </pre>
   *
   * <code>.google.fhir.r4.core.String comment = 17;</code>
   */
  com.google.fhir.r4.core.StringOrBuilder getCommentOrBuilder();
}
