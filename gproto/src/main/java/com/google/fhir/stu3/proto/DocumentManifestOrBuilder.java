// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/google/fhir/proto/stu3/resources.proto

package com.google.fhir.stu3.proto;

public interface DocumentManifestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.fhir.stu3.proto.DocumentManifest)
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
   * Unique Identifier for the set of documents
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Identifier master_identifier = 9;</code>
   * @return Whether the masterIdentifier field is set.
   */
  boolean hasMasterIdentifier();
  /**
   * <pre>
   * Unique Identifier for the set of documents
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Identifier master_identifier = 9;</code>
   * @return The masterIdentifier.
   */
  com.google.fhir.stu3.proto.Identifier getMasterIdentifier();
  /**
   * <pre>
   * Unique Identifier for the set of documents
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Identifier master_identifier = 9;</code>
   */
  com.google.fhir.stu3.proto.IdentifierOrBuilder getMasterIdentifierOrBuilder();

  /**
   * <pre>
   * Other identifiers for the manifest
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Identifier identifier = 10;</code>
   */
  java.util.List<com.google.fhir.stu3.proto.Identifier> 
      getIdentifierList();
  /**
   * <pre>
   * Other identifiers for the manifest
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Identifier identifier = 10;</code>
   */
  com.google.fhir.stu3.proto.Identifier getIdentifier(int index);
  /**
   * <pre>
   * Other identifiers for the manifest
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Identifier identifier = 10;</code>
   */
  int getIdentifierCount();
  /**
   * <pre>
   * Other identifiers for the manifest
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Identifier identifier = 10;</code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.IdentifierOrBuilder> 
      getIdentifierOrBuilderList();
  /**
   * <pre>
   * Other identifiers for the manifest
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Identifier identifier = 10;</code>
   */
  com.google.fhir.stu3.proto.IdentifierOrBuilder getIdentifierOrBuilder(
      int index);

  /**
   * <pre>
   * current | superseded | entered-in-error
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.DocumentReferenceStatusCode status = 11 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   * @return Whether the status field is set.
   */
  boolean hasStatus();
  /**
   * <pre>
   * current | superseded | entered-in-error
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.DocumentReferenceStatusCode status = 11 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   * @return The status.
   */
  com.google.fhir.stu3.proto.DocumentReferenceStatusCode getStatus();
  /**
   * <pre>
   * current | superseded | entered-in-error
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.DocumentReferenceStatusCode status = 11 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   */
  com.google.fhir.stu3.proto.DocumentReferenceStatusCodeOrBuilder getStatusOrBuilder();

  /**
   * <pre>
   * Kind of document set
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.CodeableConcept type = 12;</code>
   * @return Whether the type field is set.
   */
  boolean hasType();
  /**
   * <pre>
   * Kind of document set
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.CodeableConcept type = 12;</code>
   * @return The type.
   */
  com.google.fhir.stu3.proto.CodeableConcept getType();
  /**
   * <pre>
   * Kind of document set
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.CodeableConcept type = 12;</code>
   */
  com.google.fhir.stu3.proto.CodeableConceptOrBuilder getTypeOrBuilder();

  /**
   * <pre>
   * The subject of the set of documents
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Reference subject = 13 [(.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "Group", (.google.fhir.proto.valid_reference_type) = "Device"];</code>
   * @return Whether the subject field is set.
   */
  boolean hasSubject();
  /**
   * <pre>
   * The subject of the set of documents
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Reference subject = 13 [(.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "Group", (.google.fhir.proto.valid_reference_type) = "Device"];</code>
   * @return The subject.
   */
  com.google.fhir.stu3.proto.Reference getSubject();
  /**
   * <pre>
   * The subject of the set of documents
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Reference subject = 13 [(.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "Group", (.google.fhir.proto.valid_reference_type) = "Device"];</code>
   */
  com.google.fhir.stu3.proto.ReferenceOrBuilder getSubjectOrBuilder();

  /**
   * <pre>
   * When this document manifest created
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.DateTime created = 14;</code>
   * @return Whether the created field is set.
   */
  boolean hasCreated();
  /**
   * <pre>
   * When this document manifest created
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.DateTime created = 14;</code>
   * @return The created.
   */
  com.google.fhir.stu3.proto.DateTime getCreated();
  /**
   * <pre>
   * When this document manifest created
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.DateTime created = 14;</code>
   */
  com.google.fhir.stu3.proto.DateTimeOrBuilder getCreatedOrBuilder();

  /**
   * <pre>
   * Who and/or what authored the manifest
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Reference author = 15 [(.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "Organization", (.google.fhir.proto.valid_reference_type) = "Device", (.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "RelatedPerson"];</code>
   */
  java.util.List<com.google.fhir.stu3.proto.Reference> 
      getAuthorList();
  /**
   * <pre>
   * Who and/or what authored the manifest
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Reference author = 15 [(.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "Organization", (.google.fhir.proto.valid_reference_type) = "Device", (.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "RelatedPerson"];</code>
   */
  com.google.fhir.stu3.proto.Reference getAuthor(int index);
  /**
   * <pre>
   * Who and/or what authored the manifest
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Reference author = 15 [(.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "Organization", (.google.fhir.proto.valid_reference_type) = "Device", (.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "RelatedPerson"];</code>
   */
  int getAuthorCount();
  /**
   * <pre>
   * Who and/or what authored the manifest
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Reference author = 15 [(.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "Organization", (.google.fhir.proto.valid_reference_type) = "Device", (.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "RelatedPerson"];</code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.ReferenceOrBuilder> 
      getAuthorOrBuilderList();
  /**
   * <pre>
   * Who and/or what authored the manifest
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Reference author = 15 [(.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "Organization", (.google.fhir.proto.valid_reference_type) = "Device", (.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "RelatedPerson"];</code>
   */
  com.google.fhir.stu3.proto.ReferenceOrBuilder getAuthorOrBuilder(
      int index);

  /**
   * <pre>
   * Intended to get notified about this set of documents
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Reference recipient = 16 [(.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "RelatedPerson", (.google.fhir.proto.valid_reference_type) = "Organization"];</code>
   */
  java.util.List<com.google.fhir.stu3.proto.Reference> 
      getRecipientList();
  /**
   * <pre>
   * Intended to get notified about this set of documents
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Reference recipient = 16 [(.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "RelatedPerson", (.google.fhir.proto.valid_reference_type) = "Organization"];</code>
   */
  com.google.fhir.stu3.proto.Reference getRecipient(int index);
  /**
   * <pre>
   * Intended to get notified about this set of documents
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Reference recipient = 16 [(.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "RelatedPerson", (.google.fhir.proto.valid_reference_type) = "Organization"];</code>
   */
  int getRecipientCount();
  /**
   * <pre>
   * Intended to get notified about this set of documents
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Reference recipient = 16 [(.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "RelatedPerson", (.google.fhir.proto.valid_reference_type) = "Organization"];</code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.ReferenceOrBuilder> 
      getRecipientOrBuilderList();
  /**
   * <pre>
   * Intended to get notified about this set of documents
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Reference recipient = 16 [(.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "RelatedPerson", (.google.fhir.proto.valid_reference_type) = "Organization"];</code>
   */
  com.google.fhir.stu3.proto.ReferenceOrBuilder getRecipientOrBuilder(
      int index);

  /**
   * <pre>
   * The source system/application/software
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Uri source = 17;</code>
   * @return Whether the source field is set.
   */
  boolean hasSource();
  /**
   * <pre>
   * The source system/application/software
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Uri source = 17;</code>
   * @return The source.
   */
  com.google.fhir.stu3.proto.Uri getSource();
  /**
   * <pre>
   * The source system/application/software
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Uri source = 17;</code>
   */
  com.google.fhir.stu3.proto.UriOrBuilder getSourceOrBuilder();

  /**
   * <pre>
   * Human-readable description (title)
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.String description = 18;</code>
   * @return Whether the description field is set.
   */
  boolean hasDescription();
  /**
   * <pre>
   * Human-readable description (title)
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.String description = 18;</code>
   * @return The description.
   */
  com.google.fhir.stu3.proto.String getDescription();
  /**
   * <pre>
   * Human-readable description (title)
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.String description = 18;</code>
   */
  com.google.fhir.stu3.proto.StringOrBuilder getDescriptionOrBuilder();

  /**
   * <code>repeated .google.fhir.stu3.proto.DocumentManifest.Content content = 19 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   */
  java.util.List<com.google.fhir.stu3.proto.DocumentManifest.Content> 
      getContentList();
  /**
   * <code>repeated .google.fhir.stu3.proto.DocumentManifest.Content content = 19 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   */
  com.google.fhir.stu3.proto.DocumentManifest.Content getContent(int index);
  /**
   * <code>repeated .google.fhir.stu3.proto.DocumentManifest.Content content = 19 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   */
  int getContentCount();
  /**
   * <code>repeated .google.fhir.stu3.proto.DocumentManifest.Content content = 19 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.DocumentManifest.ContentOrBuilder> 
      getContentOrBuilderList();
  /**
   * <code>repeated .google.fhir.stu3.proto.DocumentManifest.Content content = 19 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   */
  com.google.fhir.stu3.proto.DocumentManifest.ContentOrBuilder getContentOrBuilder(
      int index);

  /**
   * <code>repeated .google.fhir.stu3.proto.DocumentManifest.Related related = 20;</code>
   */
  java.util.List<com.google.fhir.stu3.proto.DocumentManifest.Related> 
      getRelatedList();
  /**
   * <code>repeated .google.fhir.stu3.proto.DocumentManifest.Related related = 20;</code>
   */
  com.google.fhir.stu3.proto.DocumentManifest.Related getRelated(int index);
  /**
   * <code>repeated .google.fhir.stu3.proto.DocumentManifest.Related related = 20;</code>
   */
  int getRelatedCount();
  /**
   * <code>repeated .google.fhir.stu3.proto.DocumentManifest.Related related = 20;</code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.DocumentManifest.RelatedOrBuilder> 
      getRelatedOrBuilderList();
  /**
   * <code>repeated .google.fhir.stu3.proto.DocumentManifest.Related related = 20;</code>
   */
  com.google.fhir.stu3.proto.DocumentManifest.RelatedOrBuilder getRelatedOrBuilder(
      int index);
}
