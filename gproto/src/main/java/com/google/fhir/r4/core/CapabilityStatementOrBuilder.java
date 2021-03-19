// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/google/fhir/proto/r4/core/resources/capability_statement.proto

package com.google.fhir.r4.core;

public interface CapabilityStatementOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.fhir.r4.core.CapabilityStatement)
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
   * Canonical identifier for this capability statement, represented as a URI
   * (globally unique)
   * </pre>
   *
   * <code>.google.fhir.r4.core.Uri url = 10;</code>
   * @return Whether the url field is set.
   */
  boolean hasUrl();
  /**
   * <pre>
   * Canonical identifier for this capability statement, represented as a URI
   * (globally unique)
   * </pre>
   *
   * <code>.google.fhir.r4.core.Uri url = 10;</code>
   * @return The url.
   */
  com.google.fhir.r4.core.Uri getUrl();
  /**
   * <pre>
   * Canonical identifier for this capability statement, represented as a URI
   * (globally unique)
   * </pre>
   *
   * <code>.google.fhir.r4.core.Uri url = 10;</code>
   */
  com.google.fhir.r4.core.UriOrBuilder getUrlOrBuilder();

  /**
   * <pre>
   * Business version of the capability statement
   * </pre>
   *
   * <code>.google.fhir.r4.core.String version = 11;</code>
   * @return Whether the version field is set.
   */
  boolean hasVersion();
  /**
   * <pre>
   * Business version of the capability statement
   * </pre>
   *
   * <code>.google.fhir.r4.core.String version = 11;</code>
   * @return The version.
   */
  com.google.fhir.r4.core.String getVersion();
  /**
   * <pre>
   * Business version of the capability statement
   * </pre>
   *
   * <code>.google.fhir.r4.core.String version = 11;</code>
   */
  com.google.fhir.r4.core.StringOrBuilder getVersionOrBuilder();

  /**
   * <pre>
   * Name for this capability statement (computer friendly)
   * </pre>
   *
   * <code>.google.fhir.r4.core.String name = 12;</code>
   * @return Whether the name field is set.
   */
  boolean hasName();
  /**
   * <pre>
   * Name for this capability statement (computer friendly)
   * </pre>
   *
   * <code>.google.fhir.r4.core.String name = 12;</code>
   * @return The name.
   */
  com.google.fhir.r4.core.String getName();
  /**
   * <pre>
   * Name for this capability statement (computer friendly)
   * </pre>
   *
   * <code>.google.fhir.r4.core.String name = 12;</code>
   */
  com.google.fhir.r4.core.StringOrBuilder getNameOrBuilder();

  /**
   * <pre>
   * Name for this capability statement (human friendly)
   * </pre>
   *
   * <code>.google.fhir.r4.core.String title = 13;</code>
   * @return Whether the title field is set.
   */
  boolean hasTitle();
  /**
   * <pre>
   * Name for this capability statement (human friendly)
   * </pre>
   *
   * <code>.google.fhir.r4.core.String title = 13;</code>
   * @return The title.
   */
  com.google.fhir.r4.core.String getTitle();
  /**
   * <pre>
   * Name for this capability statement (human friendly)
   * </pre>
   *
   * <code>.google.fhir.r4.core.String title = 13;</code>
   */
  com.google.fhir.r4.core.StringOrBuilder getTitleOrBuilder();

  /**
   * <code>.google.fhir.r4.core.CapabilityStatement.StatusCode status = 14 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   * @return Whether the status field is set.
   */
  boolean hasStatus();
  /**
   * <code>.google.fhir.r4.core.CapabilityStatement.StatusCode status = 14 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   * @return The status.
   */
  com.google.fhir.r4.core.CapabilityStatement.StatusCode getStatus();
  /**
   * <code>.google.fhir.r4.core.CapabilityStatement.StatusCode status = 14 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   */
  com.google.fhir.r4.core.CapabilityStatement.StatusCodeOrBuilder getStatusOrBuilder();

  /**
   * <pre>
   * For testing purposes, not real usage
   * </pre>
   *
   * <code>.google.fhir.r4.core.Boolean experimental = 15;</code>
   * @return Whether the experimental field is set.
   */
  boolean hasExperimental();
  /**
   * <pre>
   * For testing purposes, not real usage
   * </pre>
   *
   * <code>.google.fhir.r4.core.Boolean experimental = 15;</code>
   * @return The experimental.
   */
  com.google.fhir.r4.core.Boolean getExperimental();
  /**
   * <pre>
   * For testing purposes, not real usage
   * </pre>
   *
   * <code>.google.fhir.r4.core.Boolean experimental = 15;</code>
   */
  com.google.fhir.r4.core.BooleanOrBuilder getExperimentalOrBuilder();

  /**
   * <pre>
   * Date last changed
   * </pre>
   *
   * <code>.google.fhir.r4.core.DateTime date = 16 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   * @return Whether the date field is set.
   */
  boolean hasDate();
  /**
   * <pre>
   * Date last changed
   * </pre>
   *
   * <code>.google.fhir.r4.core.DateTime date = 16 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   * @return The date.
   */
  com.google.fhir.r4.core.DateTime getDate();
  /**
   * <pre>
   * Date last changed
   * </pre>
   *
   * <code>.google.fhir.r4.core.DateTime date = 16 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   */
  com.google.fhir.r4.core.DateTimeOrBuilder getDateOrBuilder();

  /**
   * <pre>
   * Name of the publisher (organization or individual)
   * </pre>
   *
   * <code>.google.fhir.r4.core.String publisher = 17;</code>
   * @return Whether the publisher field is set.
   */
  boolean hasPublisher();
  /**
   * <pre>
   * Name of the publisher (organization or individual)
   * </pre>
   *
   * <code>.google.fhir.r4.core.String publisher = 17;</code>
   * @return The publisher.
   */
  com.google.fhir.r4.core.String getPublisher();
  /**
   * <pre>
   * Name of the publisher (organization or individual)
   * </pre>
   *
   * <code>.google.fhir.r4.core.String publisher = 17;</code>
   */
  com.google.fhir.r4.core.StringOrBuilder getPublisherOrBuilder();

  /**
   * <pre>
   * Contact details for the publisher
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.ContactDetail contact = 18;</code>
   */
  java.util.List<com.google.fhir.r4.core.ContactDetail> 
      getContactList();
  /**
   * <pre>
   * Contact details for the publisher
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.ContactDetail contact = 18;</code>
   */
  com.google.fhir.r4.core.ContactDetail getContact(int index);
  /**
   * <pre>
   * Contact details for the publisher
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.ContactDetail contact = 18;</code>
   */
  int getContactCount();
  /**
   * <pre>
   * Contact details for the publisher
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.ContactDetail contact = 18;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.ContactDetailOrBuilder> 
      getContactOrBuilderList();
  /**
   * <pre>
   * Contact details for the publisher
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.ContactDetail contact = 18;</code>
   */
  com.google.fhir.r4.core.ContactDetailOrBuilder getContactOrBuilder(
      int index);

  /**
   * <pre>
   * Natural language description of the capability statement
   * </pre>
   *
   * <code>.google.fhir.r4.core.Markdown description = 19;</code>
   * @return Whether the description field is set.
   */
  boolean hasDescription();
  /**
   * <pre>
   * Natural language description of the capability statement
   * </pre>
   *
   * <code>.google.fhir.r4.core.Markdown description = 19;</code>
   * @return The description.
   */
  com.google.fhir.r4.core.Markdown getDescription();
  /**
   * <pre>
   * Natural language description of the capability statement
   * </pre>
   *
   * <code>.google.fhir.r4.core.Markdown description = 19;</code>
   */
  com.google.fhir.r4.core.MarkdownOrBuilder getDescriptionOrBuilder();

  /**
   * <pre>
   * The context that the content is intended to support
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.UsageContext use_context = 20;</code>
   */
  java.util.List<com.google.fhir.r4.core.UsageContext> 
      getUseContextList();
  /**
   * <pre>
   * The context that the content is intended to support
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.UsageContext use_context = 20;</code>
   */
  com.google.fhir.r4.core.UsageContext getUseContext(int index);
  /**
   * <pre>
   * The context that the content is intended to support
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.UsageContext use_context = 20;</code>
   */
  int getUseContextCount();
  /**
   * <pre>
   * The context that the content is intended to support
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.UsageContext use_context = 20;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.UsageContextOrBuilder> 
      getUseContextOrBuilderList();
  /**
   * <pre>
   * The context that the content is intended to support
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.UsageContext use_context = 20;</code>
   */
  com.google.fhir.r4.core.UsageContextOrBuilder getUseContextOrBuilder(
      int index);

  /**
   * <pre>
   * Intended jurisdiction for capability statement (if applicable)
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept jurisdiction = 21;</code>
   */
  java.util.List<com.google.fhir.r4.core.CodeableConcept> 
      getJurisdictionList();
  /**
   * <pre>
   * Intended jurisdiction for capability statement (if applicable)
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept jurisdiction = 21;</code>
   */
  com.google.fhir.r4.core.CodeableConcept getJurisdiction(int index);
  /**
   * <pre>
   * Intended jurisdiction for capability statement (if applicable)
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept jurisdiction = 21;</code>
   */
  int getJurisdictionCount();
  /**
   * <pre>
   * Intended jurisdiction for capability statement (if applicable)
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept jurisdiction = 21;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.CodeableConceptOrBuilder> 
      getJurisdictionOrBuilderList();
  /**
   * <pre>
   * Intended jurisdiction for capability statement (if applicable)
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept jurisdiction = 21;</code>
   */
  com.google.fhir.r4.core.CodeableConceptOrBuilder getJurisdictionOrBuilder(
      int index);

  /**
   * <pre>
   * Why this capability statement is defined
   * </pre>
   *
   * <code>.google.fhir.r4.core.Markdown purpose = 22;</code>
   * @return Whether the purpose field is set.
   */
  boolean hasPurpose();
  /**
   * <pre>
   * Why this capability statement is defined
   * </pre>
   *
   * <code>.google.fhir.r4.core.Markdown purpose = 22;</code>
   * @return The purpose.
   */
  com.google.fhir.r4.core.Markdown getPurpose();
  /**
   * <pre>
   * Why this capability statement is defined
   * </pre>
   *
   * <code>.google.fhir.r4.core.Markdown purpose = 22;</code>
   */
  com.google.fhir.r4.core.MarkdownOrBuilder getPurposeOrBuilder();

  /**
   * <pre>
   * Use and/or publishing restrictions
   * </pre>
   *
   * <code>.google.fhir.r4.core.Markdown copyright = 23;</code>
   * @return Whether the copyright field is set.
   */
  boolean hasCopyright();
  /**
   * <pre>
   * Use and/or publishing restrictions
   * </pre>
   *
   * <code>.google.fhir.r4.core.Markdown copyright = 23;</code>
   * @return The copyright.
   */
  com.google.fhir.r4.core.Markdown getCopyright();
  /**
   * <pre>
   * Use and/or publishing restrictions
   * </pre>
   *
   * <code>.google.fhir.r4.core.Markdown copyright = 23;</code>
   */
  com.google.fhir.r4.core.MarkdownOrBuilder getCopyrightOrBuilder();

  /**
   * <code>.google.fhir.r4.core.CapabilityStatement.KindCode kind = 24 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   * @return Whether the kind field is set.
   */
  boolean hasKind();
  /**
   * <code>.google.fhir.r4.core.CapabilityStatement.KindCode kind = 24 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   * @return The kind.
   */
  com.google.fhir.r4.core.CapabilityStatement.KindCode getKind();
  /**
   * <code>.google.fhir.r4.core.CapabilityStatement.KindCode kind = 24 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   */
  com.google.fhir.r4.core.CapabilityStatement.KindCodeOrBuilder getKindOrBuilder();

  /**
   * <pre>
   * Canonical URL of another capability statement this implements
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Canonical instantiates = 25;</code>
   */
  java.util.List<com.google.fhir.r4.core.Canonical> 
      getInstantiatesList();
  /**
   * <pre>
   * Canonical URL of another capability statement this implements
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Canonical instantiates = 25;</code>
   */
  com.google.fhir.r4.core.Canonical getInstantiates(int index);
  /**
   * <pre>
   * Canonical URL of another capability statement this implements
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Canonical instantiates = 25;</code>
   */
  int getInstantiatesCount();
  /**
   * <pre>
   * Canonical URL of another capability statement this implements
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Canonical instantiates = 25;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.CanonicalOrBuilder> 
      getInstantiatesOrBuilderList();
  /**
   * <pre>
   * Canonical URL of another capability statement this implements
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Canonical instantiates = 25;</code>
   */
  com.google.fhir.r4.core.CanonicalOrBuilder getInstantiatesOrBuilder(
      int index);

  /**
   * <pre>
   * Canonical URL of another capability statement this adds to
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Canonical imports = 26;</code>
   */
  java.util.List<com.google.fhir.r4.core.Canonical> 
      getImportsList();
  /**
   * <pre>
   * Canonical URL of another capability statement this adds to
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Canonical imports = 26;</code>
   */
  com.google.fhir.r4.core.Canonical getImports(int index);
  /**
   * <pre>
   * Canonical URL of another capability statement this adds to
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Canonical imports = 26;</code>
   */
  int getImportsCount();
  /**
   * <pre>
   * Canonical URL of another capability statement this adds to
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Canonical imports = 26;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.CanonicalOrBuilder> 
      getImportsOrBuilderList();
  /**
   * <pre>
   * Canonical URL of another capability statement this adds to
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Canonical imports = 26;</code>
   */
  com.google.fhir.r4.core.CanonicalOrBuilder getImportsOrBuilder(
      int index);

  /**
   * <code>.google.fhir.r4.core.CapabilityStatement.Software software = 27;</code>
   * @return Whether the software field is set.
   */
  boolean hasSoftware();
  /**
   * <code>.google.fhir.r4.core.CapabilityStatement.Software software = 27;</code>
   * @return The software.
   */
  com.google.fhir.r4.core.CapabilityStatement.Software getSoftware();
  /**
   * <code>.google.fhir.r4.core.CapabilityStatement.Software software = 27;</code>
   */
  com.google.fhir.r4.core.CapabilityStatement.SoftwareOrBuilder getSoftwareOrBuilder();

  /**
   * <code>.google.fhir.r4.core.CapabilityStatement.Implementation implementation = 28;</code>
   * @return Whether the implementation field is set.
   */
  boolean hasImplementation();
  /**
   * <code>.google.fhir.r4.core.CapabilityStatement.Implementation implementation = 28;</code>
   * @return The implementation.
   */
  com.google.fhir.r4.core.CapabilityStatement.Implementation getImplementation();
  /**
   * <code>.google.fhir.r4.core.CapabilityStatement.Implementation implementation = 28;</code>
   */
  com.google.fhir.r4.core.CapabilityStatement.ImplementationOrBuilder getImplementationOrBuilder();

  /**
   * <code>.google.fhir.r4.core.CapabilityStatement.FhirVersionCode fhir_version = 29 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   * @return Whether the fhirVersion field is set.
   */
  boolean hasFhirVersion();
  /**
   * <code>.google.fhir.r4.core.CapabilityStatement.FhirVersionCode fhir_version = 29 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   * @return The fhirVersion.
   */
  com.google.fhir.r4.core.CapabilityStatement.FhirVersionCode getFhirVersion();
  /**
   * <code>.google.fhir.r4.core.CapabilityStatement.FhirVersionCode fhir_version = 29 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   */
  com.google.fhir.r4.core.CapabilityStatement.FhirVersionCodeOrBuilder getFhirVersionOrBuilder();

  /**
   * <code>repeated .google.fhir.r4.core.CapabilityStatement.FormatCode format = 30 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   */
  java.util.List<com.google.fhir.r4.core.CapabilityStatement.FormatCode> 
      getFormatList();
  /**
   * <code>repeated .google.fhir.r4.core.CapabilityStatement.FormatCode format = 30 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   */
  com.google.fhir.r4.core.CapabilityStatement.FormatCode getFormat(int index);
  /**
   * <code>repeated .google.fhir.r4.core.CapabilityStatement.FormatCode format = 30 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   */
  int getFormatCount();
  /**
   * <code>repeated .google.fhir.r4.core.CapabilityStatement.FormatCode format = 30 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.CapabilityStatement.FormatCodeOrBuilder> 
      getFormatOrBuilderList();
  /**
   * <code>repeated .google.fhir.r4.core.CapabilityStatement.FormatCode format = 30 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   */
  com.google.fhir.r4.core.CapabilityStatement.FormatCodeOrBuilder getFormatOrBuilder(
      int index);

  /**
   * <code>repeated .google.fhir.r4.core.CapabilityStatement.PatchFormatCode patch_format = 31;</code>
   */
  java.util.List<com.google.fhir.r4.core.CapabilityStatement.PatchFormatCode> 
      getPatchFormatList();
  /**
   * <code>repeated .google.fhir.r4.core.CapabilityStatement.PatchFormatCode patch_format = 31;</code>
   */
  com.google.fhir.r4.core.CapabilityStatement.PatchFormatCode getPatchFormat(int index);
  /**
   * <code>repeated .google.fhir.r4.core.CapabilityStatement.PatchFormatCode patch_format = 31;</code>
   */
  int getPatchFormatCount();
  /**
   * <code>repeated .google.fhir.r4.core.CapabilityStatement.PatchFormatCode patch_format = 31;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.CapabilityStatement.PatchFormatCodeOrBuilder> 
      getPatchFormatOrBuilderList();
  /**
   * <code>repeated .google.fhir.r4.core.CapabilityStatement.PatchFormatCode patch_format = 31;</code>
   */
  com.google.fhir.r4.core.CapabilityStatement.PatchFormatCodeOrBuilder getPatchFormatOrBuilder(
      int index);

  /**
   * <pre>
   * Implementation guides supported
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Canonical implementation_guide = 32;</code>
   */
  java.util.List<com.google.fhir.r4.core.Canonical> 
      getImplementationGuideList();
  /**
   * <pre>
   * Implementation guides supported
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Canonical implementation_guide = 32;</code>
   */
  com.google.fhir.r4.core.Canonical getImplementationGuide(int index);
  /**
   * <pre>
   * Implementation guides supported
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Canonical implementation_guide = 32;</code>
   */
  int getImplementationGuideCount();
  /**
   * <pre>
   * Implementation guides supported
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Canonical implementation_guide = 32;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.CanonicalOrBuilder> 
      getImplementationGuideOrBuilderList();
  /**
   * <pre>
   * Implementation guides supported
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Canonical implementation_guide = 32;</code>
   */
  com.google.fhir.r4.core.CanonicalOrBuilder getImplementationGuideOrBuilder(
      int index);

  /**
   * <code>repeated .google.fhir.r4.core.CapabilityStatement.Rest rest = 33;</code>
   */
  java.util.List<com.google.fhir.r4.core.CapabilityStatement.Rest> 
      getRestList();
  /**
   * <code>repeated .google.fhir.r4.core.CapabilityStatement.Rest rest = 33;</code>
   */
  com.google.fhir.r4.core.CapabilityStatement.Rest getRest(int index);
  /**
   * <code>repeated .google.fhir.r4.core.CapabilityStatement.Rest rest = 33;</code>
   */
  int getRestCount();
  /**
   * <code>repeated .google.fhir.r4.core.CapabilityStatement.Rest rest = 33;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.CapabilityStatement.RestOrBuilder> 
      getRestOrBuilderList();
  /**
   * <code>repeated .google.fhir.r4.core.CapabilityStatement.Rest rest = 33;</code>
   */
  com.google.fhir.r4.core.CapabilityStatement.RestOrBuilder getRestOrBuilder(
      int index);

  /**
   * <code>repeated .google.fhir.r4.core.CapabilityStatement.Messaging messaging = 34;</code>
   */
  java.util.List<com.google.fhir.r4.core.CapabilityStatement.Messaging> 
      getMessagingList();
  /**
   * <code>repeated .google.fhir.r4.core.CapabilityStatement.Messaging messaging = 34;</code>
   */
  com.google.fhir.r4.core.CapabilityStatement.Messaging getMessaging(int index);
  /**
   * <code>repeated .google.fhir.r4.core.CapabilityStatement.Messaging messaging = 34;</code>
   */
  int getMessagingCount();
  /**
   * <code>repeated .google.fhir.r4.core.CapabilityStatement.Messaging messaging = 34;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.CapabilityStatement.MessagingOrBuilder> 
      getMessagingOrBuilderList();
  /**
   * <code>repeated .google.fhir.r4.core.CapabilityStatement.Messaging messaging = 34;</code>
   */
  com.google.fhir.r4.core.CapabilityStatement.MessagingOrBuilder getMessagingOrBuilder(
      int index);

  /**
   * <code>repeated .google.fhir.r4.core.CapabilityStatement.Document document = 35;</code>
   */
  java.util.List<com.google.fhir.r4.core.CapabilityStatement.Document> 
      getDocumentList();
  /**
   * <code>repeated .google.fhir.r4.core.CapabilityStatement.Document document = 35;</code>
   */
  com.google.fhir.r4.core.CapabilityStatement.Document getDocument(int index);
  /**
   * <code>repeated .google.fhir.r4.core.CapabilityStatement.Document document = 35;</code>
   */
  int getDocumentCount();
  /**
   * <code>repeated .google.fhir.r4.core.CapabilityStatement.Document document = 35;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.CapabilityStatement.DocumentOrBuilder> 
      getDocumentOrBuilderList();
  /**
   * <code>repeated .google.fhir.r4.core.CapabilityStatement.Document document = 35;</code>
   */
  com.google.fhir.r4.core.CapabilityStatement.DocumentOrBuilder getDocumentOrBuilder(
      int index);
}
