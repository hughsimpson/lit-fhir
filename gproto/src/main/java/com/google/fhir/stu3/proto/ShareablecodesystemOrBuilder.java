// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/google/fhir/proto/stu3/profiles.proto

package com.google.fhir.stu3.proto;

public interface ShareablecodesystemOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.fhir.stu3.proto.Shareablecodesystem)
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
   * Logical URI to reference this code system (globally unique) (Coding.system)
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Uri url = 9 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   * @return Whether the url field is set.
   */
  boolean hasUrl();
  /**
   * <pre>
   * Logical URI to reference this code system (globally unique) (Coding.system)
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Uri url = 9 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   * @return The url.
   */
  com.google.fhir.stu3.proto.Uri getUrl();
  /**
   * <pre>
   * Logical URI to reference this code system (globally unique) (Coding.system)
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Uri url = 9 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   */
  com.google.fhir.stu3.proto.UriOrBuilder getUrlOrBuilder();

  /**
   * <pre>
   * Additional identifier for the code system
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Identifier identifier = 10;</code>
   * @return Whether the identifier field is set.
   */
  boolean hasIdentifier();
  /**
   * <pre>
   * Additional identifier for the code system
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Identifier identifier = 10;</code>
   * @return The identifier.
   */
  com.google.fhir.stu3.proto.Identifier getIdentifier();
  /**
   * <pre>
   * Additional identifier for the code system
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Identifier identifier = 10;</code>
   */
  com.google.fhir.stu3.proto.IdentifierOrBuilder getIdentifierOrBuilder();

  /**
   * <pre>
   * Business version of the code system (Coding.version)
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.String version = 11 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   * @return Whether the version field is set.
   */
  boolean hasVersion();
  /**
   * <pre>
   * Business version of the code system (Coding.version)
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.String version = 11 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   * @return The version.
   */
  com.google.fhir.stu3.proto.String getVersion();
  /**
   * <pre>
   * Business version of the code system (Coding.version)
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.String version = 11 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   */
  com.google.fhir.stu3.proto.StringOrBuilder getVersionOrBuilder();

  /**
   * <pre>
   * Name for this code system (computer friendly)
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.String name = 12 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   * @return Whether the name field is set.
   */
  boolean hasName();
  /**
   * <pre>
   * Name for this code system (computer friendly)
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.String name = 12 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   * @return The name.
   */
  com.google.fhir.stu3.proto.String getName();
  /**
   * <pre>
   * Name for this code system (computer friendly)
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.String name = 12 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   */
  com.google.fhir.stu3.proto.StringOrBuilder getNameOrBuilder();

  /**
   * <pre>
   * Name for this code system (human friendly)
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.String title = 13;</code>
   * @return Whether the title field is set.
   */
  boolean hasTitle();
  /**
   * <pre>
   * Name for this code system (human friendly)
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.String title = 13;</code>
   * @return The title.
   */
  com.google.fhir.stu3.proto.String getTitle();
  /**
   * <pre>
   * Name for this code system (human friendly)
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.String title = 13;</code>
   */
  com.google.fhir.stu3.proto.StringOrBuilder getTitleOrBuilder();

  /**
   * <pre>
   * draft | active | retired | unknown
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.PublicationStatusCode status = 14 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   * @return Whether the status field is set.
   */
  boolean hasStatus();
  /**
   * <pre>
   * draft | active | retired | unknown
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.PublicationStatusCode status = 14 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   * @return The status.
   */
  com.google.fhir.stu3.proto.PublicationStatusCode getStatus();
  /**
   * <pre>
   * draft | active | retired | unknown
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.PublicationStatusCode status = 14 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   */
  com.google.fhir.stu3.proto.PublicationStatusCodeOrBuilder getStatusOrBuilder();

  /**
   * <pre>
   * For testing purposes, not real usage
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Boolean experimental = 15 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   * @return Whether the experimental field is set.
   */
  boolean hasExperimental();
  /**
   * <pre>
   * For testing purposes, not real usage
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Boolean experimental = 15 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   * @return The experimental.
   */
  com.google.fhir.stu3.proto.Boolean getExperimental();
  /**
   * <pre>
   * For testing purposes, not real usage
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Boolean experimental = 15 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   */
  com.google.fhir.stu3.proto.BooleanOrBuilder getExperimentalOrBuilder();

  /**
   * <pre>
   * Date this was last changed
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.DateTime date = 16;</code>
   * @return Whether the date field is set.
   */
  boolean hasDate();
  /**
   * <pre>
   * Date this was last changed
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.DateTime date = 16;</code>
   * @return The date.
   */
  com.google.fhir.stu3.proto.DateTime getDate();
  /**
   * <pre>
   * Date this was last changed
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.DateTime date = 16;</code>
   */
  com.google.fhir.stu3.proto.DateTimeOrBuilder getDateOrBuilder();

  /**
   * <pre>
   * Name of the publisher (organization or individual)
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.String publisher = 17 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   * @return Whether the publisher field is set.
   */
  boolean hasPublisher();
  /**
   * <pre>
   * Name of the publisher (organization or individual)
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.String publisher = 17 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   * @return The publisher.
   */
  com.google.fhir.stu3.proto.String getPublisher();
  /**
   * <pre>
   * Name of the publisher (organization or individual)
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.String publisher = 17 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   */
  com.google.fhir.stu3.proto.StringOrBuilder getPublisherOrBuilder();

  /**
   * <pre>
   * Contact details for the publisher
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.ContactDetail contact = 18;</code>
   */
  java.util.List<com.google.fhir.stu3.proto.ContactDetail> 
      getContactList();
  /**
   * <pre>
   * Contact details for the publisher
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.ContactDetail contact = 18;</code>
   */
  com.google.fhir.stu3.proto.ContactDetail getContact(int index);
  /**
   * <pre>
   * Contact details for the publisher
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.ContactDetail contact = 18;</code>
   */
  int getContactCount();
  /**
   * <pre>
   * Contact details for the publisher
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.ContactDetail contact = 18;</code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.ContactDetailOrBuilder> 
      getContactOrBuilderList();
  /**
   * <pre>
   * Contact details for the publisher
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.ContactDetail contact = 18;</code>
   */
  com.google.fhir.stu3.proto.ContactDetailOrBuilder getContactOrBuilder(
      int index);

  /**
   * <pre>
   * Natural language description of the code system
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Markdown description = 19 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   * @return Whether the description field is set.
   */
  boolean hasDescription();
  /**
   * <pre>
   * Natural language description of the code system
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Markdown description = 19 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   * @return The description.
   */
  com.google.fhir.stu3.proto.Markdown getDescription();
  /**
   * <pre>
   * Natural language description of the code system
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Markdown description = 19 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   */
  com.google.fhir.stu3.proto.MarkdownOrBuilder getDescriptionOrBuilder();

  /**
   * <pre>
   * Context the content is intended to support
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.UsageContext use_context = 20;</code>
   */
  java.util.List<com.google.fhir.stu3.proto.UsageContext> 
      getUseContextList();
  /**
   * <pre>
   * Context the content is intended to support
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.UsageContext use_context = 20;</code>
   */
  com.google.fhir.stu3.proto.UsageContext getUseContext(int index);
  /**
   * <pre>
   * Context the content is intended to support
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.UsageContext use_context = 20;</code>
   */
  int getUseContextCount();
  /**
   * <pre>
   * Context the content is intended to support
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.UsageContext use_context = 20;</code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.UsageContextOrBuilder> 
      getUseContextOrBuilderList();
  /**
   * <pre>
   * Context the content is intended to support
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.UsageContext use_context = 20;</code>
   */
  com.google.fhir.stu3.proto.UsageContextOrBuilder getUseContextOrBuilder(
      int index);

  /**
   * <pre>
   * Intended jurisdiction for code system (if applicable)
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.CodeableConcept jurisdiction = 21;</code>
   */
  java.util.List<com.google.fhir.stu3.proto.CodeableConcept> 
      getJurisdictionList();
  /**
   * <pre>
   * Intended jurisdiction for code system (if applicable)
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.CodeableConcept jurisdiction = 21;</code>
   */
  com.google.fhir.stu3.proto.CodeableConcept getJurisdiction(int index);
  /**
   * <pre>
   * Intended jurisdiction for code system (if applicable)
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.CodeableConcept jurisdiction = 21;</code>
   */
  int getJurisdictionCount();
  /**
   * <pre>
   * Intended jurisdiction for code system (if applicable)
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.CodeableConcept jurisdiction = 21;</code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.CodeableConceptOrBuilder> 
      getJurisdictionOrBuilderList();
  /**
   * <pre>
   * Intended jurisdiction for code system (if applicable)
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.CodeableConcept jurisdiction = 21;</code>
   */
  com.google.fhir.stu3.proto.CodeableConceptOrBuilder getJurisdictionOrBuilder(
      int index);

  /**
   * <pre>
   * Why this code system is defined
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Markdown purpose = 22;</code>
   * @return Whether the purpose field is set.
   */
  boolean hasPurpose();
  /**
   * <pre>
   * Why this code system is defined
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Markdown purpose = 22;</code>
   * @return The purpose.
   */
  com.google.fhir.stu3.proto.Markdown getPurpose();
  /**
   * <pre>
   * Why this code system is defined
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Markdown purpose = 22;</code>
   */
  com.google.fhir.stu3.proto.MarkdownOrBuilder getPurposeOrBuilder();

  /**
   * <pre>
   * Use and/or publishing restrictions
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Markdown copyright = 23;</code>
   * @return Whether the copyright field is set.
   */
  boolean hasCopyright();
  /**
   * <pre>
   * Use and/or publishing restrictions
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Markdown copyright = 23;</code>
   * @return The copyright.
   */
  com.google.fhir.stu3.proto.Markdown getCopyright();
  /**
   * <pre>
   * Use and/or publishing restrictions
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Markdown copyright = 23;</code>
   */
  com.google.fhir.stu3.proto.MarkdownOrBuilder getCopyrightOrBuilder();

  /**
   * <pre>
   * If code comparison is case sensitive
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Boolean case_sensitive = 24 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   * @return Whether the caseSensitive field is set.
   */
  boolean hasCaseSensitive();
  /**
   * <pre>
   * If code comparison is case sensitive
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Boolean case_sensitive = 24 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   * @return The caseSensitive.
   */
  com.google.fhir.stu3.proto.Boolean getCaseSensitive();
  /**
   * <pre>
   * If code comparison is case sensitive
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Boolean case_sensitive = 24 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   */
  com.google.fhir.stu3.proto.BooleanOrBuilder getCaseSensitiveOrBuilder();

  /**
   * <pre>
   * Canonical URL for value set with entire code system
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Uri value_set = 25;</code>
   * @return Whether the valueSet field is set.
   */
  boolean hasValueSet();
  /**
   * <pre>
   * Canonical URL for value set with entire code system
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Uri value_set = 25;</code>
   * @return The valueSet.
   */
  com.google.fhir.stu3.proto.Uri getValueSet();
  /**
   * <pre>
   * Canonical URL for value set with entire code system
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Uri value_set = 25;</code>
   */
  com.google.fhir.stu3.proto.UriOrBuilder getValueSetOrBuilder();

  /**
   * <pre>
   * grouped-by | is-a | part-of | classified-with
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.CodeSystemHierarchyMeaningCode hierarchy_meaning = 26;</code>
   * @return Whether the hierarchyMeaning field is set.
   */
  boolean hasHierarchyMeaning();
  /**
   * <pre>
   * grouped-by | is-a | part-of | classified-with
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.CodeSystemHierarchyMeaningCode hierarchy_meaning = 26;</code>
   * @return The hierarchyMeaning.
   */
  com.google.fhir.stu3.proto.CodeSystemHierarchyMeaningCode getHierarchyMeaning();
  /**
   * <pre>
   * grouped-by | is-a | part-of | classified-with
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.CodeSystemHierarchyMeaningCode hierarchy_meaning = 26;</code>
   */
  com.google.fhir.stu3.proto.CodeSystemHierarchyMeaningCodeOrBuilder getHierarchyMeaningOrBuilder();

  /**
   * <pre>
   * If code system defines a post-composition grammar
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Boolean compositional = 27;</code>
   * @return Whether the compositional field is set.
   */
  boolean hasCompositional();
  /**
   * <pre>
   * If code system defines a post-composition grammar
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Boolean compositional = 27;</code>
   * @return The compositional.
   */
  com.google.fhir.stu3.proto.Boolean getCompositional();
  /**
   * <pre>
   * If code system defines a post-composition grammar
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Boolean compositional = 27;</code>
   */
  com.google.fhir.stu3.proto.BooleanOrBuilder getCompositionalOrBuilder();

  /**
   * <pre>
   * If definitions are not stable
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Boolean version_needed = 28;</code>
   * @return Whether the versionNeeded field is set.
   */
  boolean hasVersionNeeded();
  /**
   * <pre>
   * If definitions are not stable
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Boolean version_needed = 28;</code>
   * @return The versionNeeded.
   */
  com.google.fhir.stu3.proto.Boolean getVersionNeeded();
  /**
   * <pre>
   * If definitions are not stable
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Boolean version_needed = 28;</code>
   */
  com.google.fhir.stu3.proto.BooleanOrBuilder getVersionNeededOrBuilder();

  /**
   * <pre>
   * not-present | example | fragment | complete
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.CodeSystemContentModeCode content = 29 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   * @return Whether the content field is set.
   */
  boolean hasContent();
  /**
   * <pre>
   * not-present | example | fragment | complete
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.CodeSystemContentModeCode content = 29 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   * @return The content.
   */
  com.google.fhir.stu3.proto.CodeSystemContentModeCode getContent();
  /**
   * <pre>
   * not-present | example | fragment | complete
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.CodeSystemContentModeCode content = 29 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   */
  com.google.fhir.stu3.proto.CodeSystemContentModeCodeOrBuilder getContentOrBuilder();

  /**
   * <pre>
   * Total concepts in the code system
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.UnsignedInt count = 30;</code>
   * @return Whether the count field is set.
   */
  boolean hasCount();
  /**
   * <pre>
   * Total concepts in the code system
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.UnsignedInt count = 30;</code>
   * @return The count.
   */
  com.google.fhir.stu3.proto.UnsignedInt getCount();
  /**
   * <pre>
   * Total concepts in the code system
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.UnsignedInt count = 30;</code>
   */
  com.google.fhir.stu3.proto.UnsignedIntOrBuilder getCountOrBuilder();

  /**
   * <code>repeated .google.fhir.stu3.proto.Shareablecodesystem.Filter filter = 31;</code>
   */
  java.util.List<com.google.fhir.stu3.proto.Shareablecodesystem.Filter> 
      getFilterList();
  /**
   * <code>repeated .google.fhir.stu3.proto.Shareablecodesystem.Filter filter = 31;</code>
   */
  com.google.fhir.stu3.proto.Shareablecodesystem.Filter getFilter(int index);
  /**
   * <code>repeated .google.fhir.stu3.proto.Shareablecodesystem.Filter filter = 31;</code>
   */
  int getFilterCount();
  /**
   * <code>repeated .google.fhir.stu3.proto.Shareablecodesystem.Filter filter = 31;</code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.Shareablecodesystem.FilterOrBuilder> 
      getFilterOrBuilderList();
  /**
   * <code>repeated .google.fhir.stu3.proto.Shareablecodesystem.Filter filter = 31;</code>
   */
  com.google.fhir.stu3.proto.Shareablecodesystem.FilterOrBuilder getFilterOrBuilder(
      int index);

  /**
   * <code>repeated .google.fhir.stu3.proto.Shareablecodesystem.Property property = 32;</code>
   */
  java.util.List<com.google.fhir.stu3.proto.Shareablecodesystem.Property> 
      getPropertyList();
  /**
   * <code>repeated .google.fhir.stu3.proto.Shareablecodesystem.Property property = 32;</code>
   */
  com.google.fhir.stu3.proto.Shareablecodesystem.Property getProperty(int index);
  /**
   * <code>repeated .google.fhir.stu3.proto.Shareablecodesystem.Property property = 32;</code>
   */
  int getPropertyCount();
  /**
   * <code>repeated .google.fhir.stu3.proto.Shareablecodesystem.Property property = 32;</code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.Shareablecodesystem.PropertyOrBuilder> 
      getPropertyOrBuilderList();
  /**
   * <code>repeated .google.fhir.stu3.proto.Shareablecodesystem.Property property = 32;</code>
   */
  com.google.fhir.stu3.proto.Shareablecodesystem.PropertyOrBuilder getPropertyOrBuilder(
      int index);

  /**
   * <code>repeated .google.fhir.stu3.proto.Shareablecodesystem.ConceptDefinition concept = 33 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   */
  java.util.List<com.google.fhir.stu3.proto.Shareablecodesystem.ConceptDefinition> 
      getConceptList();
  /**
   * <code>repeated .google.fhir.stu3.proto.Shareablecodesystem.ConceptDefinition concept = 33 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   */
  com.google.fhir.stu3.proto.Shareablecodesystem.ConceptDefinition getConcept(int index);
  /**
   * <code>repeated .google.fhir.stu3.proto.Shareablecodesystem.ConceptDefinition concept = 33 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   */
  int getConceptCount();
  /**
   * <code>repeated .google.fhir.stu3.proto.Shareablecodesystem.ConceptDefinition concept = 33 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.Shareablecodesystem.ConceptDefinitionOrBuilder> 
      getConceptOrBuilderList();
  /**
   * <code>repeated .google.fhir.stu3.proto.Shareablecodesystem.ConceptDefinition concept = 33 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   */
  com.google.fhir.stu3.proto.Shareablecodesystem.ConceptDefinitionOrBuilder getConceptOrBuilder(
      int index);
}
