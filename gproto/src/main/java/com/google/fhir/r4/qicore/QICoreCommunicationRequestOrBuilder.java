// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/google/fhir/proto/r4/qicore/qicore.proto

package com.google.fhir.r4.qicore;

public interface QICoreCommunicationRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.fhir.r4.qicore.QICoreCommunicationRequest)
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
   * Unique identifier
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Identifier identifier = 10;</code>
   */
  java.util.List<com.google.fhir.r4.core.Identifier> 
      getIdentifierList();
  /**
   * <pre>
   * Unique identifier
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Identifier identifier = 10;</code>
   */
  com.google.fhir.r4.core.Identifier getIdentifier(int index);
  /**
   * <pre>
   * Unique identifier
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Identifier identifier = 10;</code>
   */
  int getIdentifierCount();
  /**
   * <pre>
   * Unique identifier
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Identifier identifier = 10;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.IdentifierOrBuilder> 
      getIdentifierOrBuilderList();
  /**
   * <pre>
   * Unique identifier
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Identifier identifier = 10;</code>
   */
  com.google.fhir.r4.core.IdentifierOrBuilder getIdentifierOrBuilder(
      int index);

  /**
   * <pre>
   * Fulfills plan or proposal
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Reference based_on = 11 [(.google.fhir.proto.valid_reference_type) = "Resource"];</code>
   */
  java.util.List<com.google.fhir.r4.core.Reference> 
      getBasedOnList();
  /**
   * <pre>
   * Fulfills plan or proposal
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Reference based_on = 11 [(.google.fhir.proto.valid_reference_type) = "Resource"];</code>
   */
  com.google.fhir.r4.core.Reference getBasedOn(int index);
  /**
   * <pre>
   * Fulfills plan or proposal
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Reference based_on = 11 [(.google.fhir.proto.valid_reference_type) = "Resource"];</code>
   */
  int getBasedOnCount();
  /**
   * <pre>
   * Fulfills plan or proposal
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Reference based_on = 11 [(.google.fhir.proto.valid_reference_type) = "Resource"];</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.ReferenceOrBuilder> 
      getBasedOnOrBuilderList();
  /**
   * <pre>
   * Fulfills plan or proposal
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Reference based_on = 11 [(.google.fhir.proto.valid_reference_type) = "Resource"];</code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getBasedOnOrBuilder(
      int index);

  /**
   * <pre>
   * Request(s) replaced by this request
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Reference replaces = 12 [(.google.fhir.proto.valid_reference_type) = "CommunicationRequest"];</code>
   */
  java.util.List<com.google.fhir.r4.core.Reference> 
      getReplacesList();
  /**
   * <pre>
   * Request(s) replaced by this request
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Reference replaces = 12 [(.google.fhir.proto.valid_reference_type) = "CommunicationRequest"];</code>
   */
  com.google.fhir.r4.core.Reference getReplaces(int index);
  /**
   * <pre>
   * Request(s) replaced by this request
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Reference replaces = 12 [(.google.fhir.proto.valid_reference_type) = "CommunicationRequest"];</code>
   */
  int getReplacesCount();
  /**
   * <pre>
   * Request(s) replaced by this request
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Reference replaces = 12 [(.google.fhir.proto.valid_reference_type) = "CommunicationRequest"];</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.ReferenceOrBuilder> 
      getReplacesOrBuilderList();
  /**
   * <pre>
   * Request(s) replaced by this request
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Reference replaces = 12 [(.google.fhir.proto.valid_reference_type) = "CommunicationRequest"];</code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getReplacesOrBuilder(
      int index);

  /**
   * <pre>
   * Composite request this is part of
   * </pre>
   *
   * <code>.google.fhir.r4.core.Identifier group_identifier = 13;</code>
   * @return Whether the groupIdentifier field is set.
   */
  boolean hasGroupIdentifier();
  /**
   * <pre>
   * Composite request this is part of
   * </pre>
   *
   * <code>.google.fhir.r4.core.Identifier group_identifier = 13;</code>
   * @return The groupIdentifier.
   */
  com.google.fhir.r4.core.Identifier getGroupIdentifier();
  /**
   * <pre>
   * Composite request this is part of
   * </pre>
   *
   * <code>.google.fhir.r4.core.Identifier group_identifier = 13;</code>
   */
  com.google.fhir.r4.core.IdentifierOrBuilder getGroupIdentifierOrBuilder();

  /**
   * <code>.google.fhir.r4.qicore.QICoreCommunicationRequest.StatusCode status = 14 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   * @return Whether the status field is set.
   */
  boolean hasStatus();
  /**
   * <code>.google.fhir.r4.qicore.QICoreCommunicationRequest.StatusCode status = 14 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   * @return The status.
   */
  com.google.fhir.r4.qicore.QICoreCommunicationRequest.StatusCode getStatus();
  /**
   * <code>.google.fhir.r4.qicore.QICoreCommunicationRequest.StatusCode status = 14 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   */
  com.google.fhir.r4.qicore.QICoreCommunicationRequest.StatusCodeOrBuilder getStatusOrBuilder();

  /**
   * <pre>
   * Reason for current status
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept status_reason = 15;</code>
   * @return Whether the statusReason field is set.
   */
  boolean hasStatusReason();
  /**
   * <pre>
   * Reason for current status
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept status_reason = 15;</code>
   * @return The statusReason.
   */
  com.google.fhir.r4.core.CodeableConcept getStatusReason();
  /**
   * <pre>
   * Reason for current status
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept status_reason = 15;</code>
   */
  com.google.fhir.r4.core.CodeableConceptOrBuilder getStatusReasonOrBuilder();

  /**
   * <pre>
   * Message category
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept category = 16;</code>
   */
  java.util.List<com.google.fhir.r4.core.CodeableConcept> 
      getCategoryList();
  /**
   * <pre>
   * Message category
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept category = 16;</code>
   */
  com.google.fhir.r4.core.CodeableConcept getCategory(int index);
  /**
   * <pre>
   * Message category
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept category = 16;</code>
   */
  int getCategoryCount();
  /**
   * <pre>
   * Message category
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept category = 16;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.CodeableConceptOrBuilder> 
      getCategoryOrBuilderList();
  /**
   * <pre>
   * Message category
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept category = 16;</code>
   */
  com.google.fhir.r4.core.CodeableConceptOrBuilder getCategoryOrBuilder(
      int index);

  /**
   * <code>.google.fhir.r4.qicore.QICoreCommunicationRequest.PriorityCode priority = 17;</code>
   * @return Whether the priority field is set.
   */
  boolean hasPriority();
  /**
   * <code>.google.fhir.r4.qicore.QICoreCommunicationRequest.PriorityCode priority = 17;</code>
   * @return The priority.
   */
  com.google.fhir.r4.qicore.QICoreCommunicationRequest.PriorityCode getPriority();
  /**
   * <code>.google.fhir.r4.qicore.QICoreCommunicationRequest.PriorityCode priority = 17;</code>
   */
  com.google.fhir.r4.qicore.QICoreCommunicationRequest.PriorityCodeOrBuilder getPriorityOrBuilder();

  /**
   * <pre>
   * True if request is prohibiting action
   * </pre>
   *
   * <code>.google.fhir.r4.core.Boolean do_not_perform = 18;</code>
   * @return Whether the doNotPerform field is set.
   */
  boolean hasDoNotPerform();
  /**
   * <pre>
   * True if request is prohibiting action
   * </pre>
   *
   * <code>.google.fhir.r4.core.Boolean do_not_perform = 18;</code>
   * @return The doNotPerform.
   */
  com.google.fhir.r4.core.Boolean getDoNotPerform();
  /**
   * <pre>
   * True if request is prohibiting action
   * </pre>
   *
   * <code>.google.fhir.r4.core.Boolean do_not_perform = 18;</code>
   */
  com.google.fhir.r4.core.BooleanOrBuilder getDoNotPerformOrBuilder();

  /**
   * <pre>
   * A channel of communication
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept medium = 19;</code>
   */
  java.util.List<com.google.fhir.r4.core.CodeableConcept> 
      getMediumList();
  /**
   * <pre>
   * A channel of communication
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept medium = 19;</code>
   */
  com.google.fhir.r4.core.CodeableConcept getMedium(int index);
  /**
   * <pre>
   * A channel of communication
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept medium = 19;</code>
   */
  int getMediumCount();
  /**
   * <pre>
   * A channel of communication
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept medium = 19;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.CodeableConceptOrBuilder> 
      getMediumOrBuilderList();
  /**
   * <pre>
   * A channel of communication
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept medium = 19;</code>
   */
  com.google.fhir.r4.core.CodeableConceptOrBuilder getMediumOrBuilder(
      int index);

  /**
   * <pre>
   * Focus of message
   * </pre>
   *
   * <code>.google.fhir.r4.core.Reference subject = 20 [(.google.fhir.proto.valid_reference_type) = "Patient"];</code>
   * @return Whether the subject field is set.
   */
  boolean hasSubject();
  /**
   * <pre>
   * Focus of message
   * </pre>
   *
   * <code>.google.fhir.r4.core.Reference subject = 20 [(.google.fhir.proto.valid_reference_type) = "Patient"];</code>
   * @return The subject.
   */
  com.google.fhir.r4.core.Reference getSubject();
  /**
   * <pre>
   * Focus of message
   * </pre>
   *
   * <code>.google.fhir.r4.core.Reference subject = 20 [(.google.fhir.proto.valid_reference_type) = "Patient"];</code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getSubjectOrBuilder();

  /**
   * <pre>
   * Resources that pertain to this communication request
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Reference about = 21 [(.google.fhir.proto.valid_reference_type) = "Resource"];</code>
   */
  java.util.List<com.google.fhir.r4.core.Reference> 
      getAboutList();
  /**
   * <pre>
   * Resources that pertain to this communication request
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Reference about = 21 [(.google.fhir.proto.valid_reference_type) = "Resource"];</code>
   */
  com.google.fhir.r4.core.Reference getAbout(int index);
  /**
   * <pre>
   * Resources that pertain to this communication request
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Reference about = 21 [(.google.fhir.proto.valid_reference_type) = "Resource"];</code>
   */
  int getAboutCount();
  /**
   * <pre>
   * Resources that pertain to this communication request
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Reference about = 21 [(.google.fhir.proto.valid_reference_type) = "Resource"];</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.ReferenceOrBuilder> 
      getAboutOrBuilderList();
  /**
   * <pre>
   * Resources that pertain to this communication request
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Reference about = 21 [(.google.fhir.proto.valid_reference_type) = "Resource"];</code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getAboutOrBuilder(
      int index);

  /**
   * <pre>
   * Encounter created as part of
   * </pre>
   *
   * <code>.google.fhir.r4.core.Reference encounter = 22 [(.google.fhir.proto.valid_reference_type) = "Encounter"];</code>
   * @return Whether the encounter field is set.
   */
  boolean hasEncounter();
  /**
   * <pre>
   * Encounter created as part of
   * </pre>
   *
   * <code>.google.fhir.r4.core.Reference encounter = 22 [(.google.fhir.proto.valid_reference_type) = "Encounter"];</code>
   * @return The encounter.
   */
  com.google.fhir.r4.core.Reference getEncounter();
  /**
   * <pre>
   * Encounter created as part of
   * </pre>
   *
   * <code>.google.fhir.r4.core.Reference encounter = 22 [(.google.fhir.proto.valid_reference_type) = "Encounter"];</code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getEncounterOrBuilder();

  /**
   * <code>repeated .google.fhir.r4.qicore.QICoreCommunicationRequest.Payload payload = 23 [(.google.fhir.proto.fhir_path_constraint) = "hasValue() or (children().count() &gt; id.count())"];</code>
   */
  java.util.List<com.google.fhir.r4.qicore.QICoreCommunicationRequest.Payload> 
      getPayloadList();
  /**
   * <code>repeated .google.fhir.r4.qicore.QICoreCommunicationRequest.Payload payload = 23 [(.google.fhir.proto.fhir_path_constraint) = "hasValue() or (children().count() &gt; id.count())"];</code>
   */
  com.google.fhir.r4.qicore.QICoreCommunicationRequest.Payload getPayload(int index);
  /**
   * <code>repeated .google.fhir.r4.qicore.QICoreCommunicationRequest.Payload payload = 23 [(.google.fhir.proto.fhir_path_constraint) = "hasValue() or (children().count() &gt; id.count())"];</code>
   */
  int getPayloadCount();
  /**
   * <code>repeated .google.fhir.r4.qicore.QICoreCommunicationRequest.Payload payload = 23 [(.google.fhir.proto.fhir_path_constraint) = "hasValue() or (children().count() &gt; id.count())"];</code>
   */
  java.util.List<? extends com.google.fhir.r4.qicore.QICoreCommunicationRequest.PayloadOrBuilder> 
      getPayloadOrBuilderList();
  /**
   * <code>repeated .google.fhir.r4.qicore.QICoreCommunicationRequest.Payload payload = 23 [(.google.fhir.proto.fhir_path_constraint) = "hasValue() or (children().count() &gt; id.count())"];</code>
   */
  com.google.fhir.r4.qicore.QICoreCommunicationRequest.PayloadOrBuilder getPayloadOrBuilder(
      int index);

  /**
   * <code>.google.fhir.r4.qicore.QICoreCommunicationRequest.OccurrenceX occurrence = 24;</code>
   * @return Whether the occurrence field is set.
   */
  boolean hasOccurrence();
  /**
   * <code>.google.fhir.r4.qicore.QICoreCommunicationRequest.OccurrenceX occurrence = 24;</code>
   * @return The occurrence.
   */
  com.google.fhir.r4.qicore.QICoreCommunicationRequest.OccurrenceX getOccurrence();
  /**
   * <code>.google.fhir.r4.qicore.QICoreCommunicationRequest.OccurrenceX occurrence = 24;</code>
   */
  com.google.fhir.r4.qicore.QICoreCommunicationRequest.OccurrenceXOrBuilder getOccurrenceOrBuilder();

  /**
   * <pre>
   * When request transitioned to being actionable
   * </pre>
   *
   * <code>.google.fhir.r4.core.DateTime authored_on = 25;</code>
   * @return Whether the authoredOn field is set.
   */
  boolean hasAuthoredOn();
  /**
   * <pre>
   * When request transitioned to being actionable
   * </pre>
   *
   * <code>.google.fhir.r4.core.DateTime authored_on = 25;</code>
   * @return The authoredOn.
   */
  com.google.fhir.r4.core.DateTime getAuthoredOn();
  /**
   * <pre>
   * When request transitioned to being actionable
   * </pre>
   *
   * <code>.google.fhir.r4.core.DateTime authored_on = 25;</code>
   */
  com.google.fhir.r4.core.DateTimeOrBuilder getAuthoredOnOrBuilder();

  /**
   * <pre>
   * Who/what is requesting service
   * </pre>
   *
   * <code>.google.fhir.r4.core.Reference requester = 26 [(.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "PractitionerRole", (.google.fhir.proto.valid_reference_type) = "Organization", (.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "RelatedPerson", (.google.fhir.proto.valid_reference_type) = "Device"];</code>
   * @return Whether the requester field is set.
   */
  boolean hasRequester();
  /**
   * <pre>
   * Who/what is requesting service
   * </pre>
   *
   * <code>.google.fhir.r4.core.Reference requester = 26 [(.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "PractitionerRole", (.google.fhir.proto.valid_reference_type) = "Organization", (.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "RelatedPerson", (.google.fhir.proto.valid_reference_type) = "Device"];</code>
   * @return The requester.
   */
  com.google.fhir.r4.core.Reference getRequester();
  /**
   * <pre>
   * Who/what is requesting service
   * </pre>
   *
   * <code>.google.fhir.r4.core.Reference requester = 26 [(.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "PractitionerRole", (.google.fhir.proto.valid_reference_type) = "Organization", (.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "RelatedPerson", (.google.fhir.proto.valid_reference_type) = "Device"];</code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getRequesterOrBuilder();

  /**
   * <pre>
   * Message recipient
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Reference recipient = 27 [(.google.fhir.proto.valid_reference_type) = "Device", (.google.fhir.proto.valid_reference_type) = "Organization", (.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "RelatedPerson", (.google.fhir.proto.valid_reference_type) = "Group", (.google.fhir.proto.valid_reference_type) = "CareTeam"];</code>
   */
  java.util.List<com.google.fhir.r4.core.Reference> 
      getRecipientList();
  /**
   * <pre>
   * Message recipient
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Reference recipient = 27 [(.google.fhir.proto.valid_reference_type) = "Device", (.google.fhir.proto.valid_reference_type) = "Organization", (.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "RelatedPerson", (.google.fhir.proto.valid_reference_type) = "Group", (.google.fhir.proto.valid_reference_type) = "CareTeam"];</code>
   */
  com.google.fhir.r4.core.Reference getRecipient(int index);
  /**
   * <pre>
   * Message recipient
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Reference recipient = 27 [(.google.fhir.proto.valid_reference_type) = "Device", (.google.fhir.proto.valid_reference_type) = "Organization", (.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "RelatedPerson", (.google.fhir.proto.valid_reference_type) = "Group", (.google.fhir.proto.valid_reference_type) = "CareTeam"];</code>
   */
  int getRecipientCount();
  /**
   * <pre>
   * Message recipient
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Reference recipient = 27 [(.google.fhir.proto.valid_reference_type) = "Device", (.google.fhir.proto.valid_reference_type) = "Organization", (.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "RelatedPerson", (.google.fhir.proto.valid_reference_type) = "Group", (.google.fhir.proto.valid_reference_type) = "CareTeam"];</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.ReferenceOrBuilder> 
      getRecipientOrBuilderList();
  /**
   * <pre>
   * Message recipient
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Reference recipient = 27 [(.google.fhir.proto.valid_reference_type) = "Device", (.google.fhir.proto.valid_reference_type) = "Organization", (.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "RelatedPerson", (.google.fhir.proto.valid_reference_type) = "Group", (.google.fhir.proto.valid_reference_type) = "CareTeam"];</code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getRecipientOrBuilder(
      int index);

  /**
   * <pre>
   * Message sender
   * </pre>
   *
   * <code>.google.fhir.r4.core.Reference sender = 28 [(.google.fhir.proto.valid_reference_type) = "Device", (.google.fhir.proto.valid_reference_type) = "Organization", (.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "RelatedPerson"];</code>
   * @return Whether the sender field is set.
   */
  boolean hasSender();
  /**
   * <pre>
   * Message sender
   * </pre>
   *
   * <code>.google.fhir.r4.core.Reference sender = 28 [(.google.fhir.proto.valid_reference_type) = "Device", (.google.fhir.proto.valid_reference_type) = "Organization", (.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "RelatedPerson"];</code>
   * @return The sender.
   */
  com.google.fhir.r4.core.Reference getSender();
  /**
   * <pre>
   * Message sender
   * </pre>
   *
   * <code>.google.fhir.r4.core.Reference sender = 28 [(.google.fhir.proto.valid_reference_type) = "Device", (.google.fhir.proto.valid_reference_type) = "Organization", (.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "RelatedPerson"];</code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getSenderOrBuilder();

  /**
   * <pre>
   * Why is communication needed?
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept reason_code = 29;</code>
   */
  java.util.List<com.google.fhir.r4.core.CodeableConcept> 
      getReasonCodeList();
  /**
   * <pre>
   * Why is communication needed?
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept reason_code = 29;</code>
   */
  com.google.fhir.r4.core.CodeableConcept getReasonCode(int index);
  /**
   * <pre>
   * Why is communication needed?
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept reason_code = 29;</code>
   */
  int getReasonCodeCount();
  /**
   * <pre>
   * Why is communication needed?
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept reason_code = 29;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.CodeableConceptOrBuilder> 
      getReasonCodeOrBuilderList();
  /**
   * <pre>
   * Why is communication needed?
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept reason_code = 29;</code>
   */
  com.google.fhir.r4.core.CodeableConceptOrBuilder getReasonCodeOrBuilder(
      int index);

  /**
   * <pre>
   * Why is communication needed?
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Reference reason_reference = 30 [(.google.fhir.proto.valid_reference_type) = "Condition", (.google.fhir.proto.valid_reference_type) = "Observation", (.google.fhir.proto.valid_reference_type) = "DiagnosticReport", (.google.fhir.proto.valid_reference_type) = "DocumentReference"];</code>
   */
  java.util.List<com.google.fhir.r4.core.Reference> 
      getReasonReferenceList();
  /**
   * <pre>
   * Why is communication needed?
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Reference reason_reference = 30 [(.google.fhir.proto.valid_reference_type) = "Condition", (.google.fhir.proto.valid_reference_type) = "Observation", (.google.fhir.proto.valid_reference_type) = "DiagnosticReport", (.google.fhir.proto.valid_reference_type) = "DocumentReference"];</code>
   */
  com.google.fhir.r4.core.Reference getReasonReference(int index);
  /**
   * <pre>
   * Why is communication needed?
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Reference reason_reference = 30 [(.google.fhir.proto.valid_reference_type) = "Condition", (.google.fhir.proto.valid_reference_type) = "Observation", (.google.fhir.proto.valid_reference_type) = "DiagnosticReport", (.google.fhir.proto.valid_reference_type) = "DocumentReference"];</code>
   */
  int getReasonReferenceCount();
  /**
   * <pre>
   * Why is communication needed?
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Reference reason_reference = 30 [(.google.fhir.proto.valid_reference_type) = "Condition", (.google.fhir.proto.valid_reference_type) = "Observation", (.google.fhir.proto.valid_reference_type) = "DiagnosticReport", (.google.fhir.proto.valid_reference_type) = "DocumentReference"];</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.ReferenceOrBuilder> 
      getReasonReferenceOrBuilderList();
  /**
   * <pre>
   * Why is communication needed?
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Reference reason_reference = 30 [(.google.fhir.proto.valid_reference_type) = "Condition", (.google.fhir.proto.valid_reference_type) = "Observation", (.google.fhir.proto.valid_reference_type) = "DiagnosticReport", (.google.fhir.proto.valid_reference_type) = "DocumentReference"];</code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getReasonReferenceOrBuilder(
      int index);

  /**
   * <pre>
   * Comments made about communication request
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Annotation note = 31;</code>
   */
  java.util.List<com.google.fhir.r4.core.Annotation> 
      getNoteList();
  /**
   * <pre>
   * Comments made about communication request
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Annotation note = 31;</code>
   */
  com.google.fhir.r4.core.Annotation getNote(int index);
  /**
   * <pre>
   * Comments made about communication request
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Annotation note = 31;</code>
   */
  int getNoteCount();
  /**
   * <pre>
   * Comments made about communication request
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Annotation note = 31;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.AnnotationOrBuilder> 
      getNoteOrBuilderList();
  /**
   * <pre>
   * Comments made about communication request
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Annotation note = 31;</code>
   */
  com.google.fhir.r4.core.AnnotationOrBuilder getNoteOrBuilder(
      int index);
}
