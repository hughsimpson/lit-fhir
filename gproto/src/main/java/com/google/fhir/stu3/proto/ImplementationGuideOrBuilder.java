// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/google/fhir/proto/stu3/resources.proto

package com.google.fhir.stu3.proto;

public interface ImplementationGuideOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.fhir.stu3.proto.ImplementationGuide)
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
   * Logical URI to reference this implementation guide (globally unique)
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Uri url = 9 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   * @return Whether the url field is set.
   */
  boolean hasUrl();
  /**
   * <pre>
   * Logical URI to reference this implementation guide (globally unique)
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Uri url = 9 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   * @return The url.
   */
  com.google.fhir.stu3.proto.Uri getUrl();
  /**
   * <pre>
   * Logical URI to reference this implementation guide (globally unique)
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Uri url = 9 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   */
  com.google.fhir.stu3.proto.UriOrBuilder getUrlOrBuilder();

  /**
   * <pre>
   * Business version of the implementation guide
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.String version = 10;</code>
   * @return Whether the version field is set.
   */
  boolean hasVersion();
  /**
   * <pre>
   * Business version of the implementation guide
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.String version = 10;</code>
   * @return The version.
   */
  com.google.fhir.stu3.proto.String getVersion();
  /**
   * <pre>
   * Business version of the implementation guide
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.String version = 10;</code>
   */
  com.google.fhir.stu3.proto.StringOrBuilder getVersionOrBuilder();

  /**
   * <pre>
   * Name for this implementation guide (computer friendly)
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.String name = 11 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   * @return Whether the name field is set.
   */
  boolean hasName();
  /**
   * <pre>
   * Name for this implementation guide (computer friendly)
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.String name = 11 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   * @return The name.
   */
  com.google.fhir.stu3.proto.String getName();
  /**
   * <pre>
   * Name for this implementation guide (computer friendly)
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.String name = 11 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   */
  com.google.fhir.stu3.proto.StringOrBuilder getNameOrBuilder();

  /**
   * <pre>
   * draft | active | retired | unknown
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.PublicationStatusCode status = 12 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   * @return Whether the status field is set.
   */
  boolean hasStatus();
  /**
   * <pre>
   * draft | active | retired | unknown
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.PublicationStatusCode status = 12 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   * @return The status.
   */
  com.google.fhir.stu3.proto.PublicationStatusCode getStatus();
  /**
   * <pre>
   * draft | active | retired | unknown
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.PublicationStatusCode status = 12 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   */
  com.google.fhir.stu3.proto.PublicationStatusCodeOrBuilder getStatusOrBuilder();

  /**
   * <pre>
   * For testing purposes, not real usage
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Boolean experimental = 13;</code>
   * @return Whether the experimental field is set.
   */
  boolean hasExperimental();
  /**
   * <pre>
   * For testing purposes, not real usage
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Boolean experimental = 13;</code>
   * @return The experimental.
   */
  com.google.fhir.stu3.proto.Boolean getExperimental();
  /**
   * <pre>
   * For testing purposes, not real usage
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Boolean experimental = 13;</code>
   */
  com.google.fhir.stu3.proto.BooleanOrBuilder getExperimentalOrBuilder();

  /**
   * <pre>
   * Date this was last changed
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.DateTime date = 14;</code>
   * @return Whether the date field is set.
   */
  boolean hasDate();
  /**
   * <pre>
   * Date this was last changed
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.DateTime date = 14;</code>
   * @return The date.
   */
  com.google.fhir.stu3.proto.DateTime getDate();
  /**
   * <pre>
   * Date this was last changed
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.DateTime date = 14;</code>
   */
  com.google.fhir.stu3.proto.DateTimeOrBuilder getDateOrBuilder();

  /**
   * <pre>
   * Name of the publisher (organization or individual)
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.String publisher = 15;</code>
   * @return Whether the publisher field is set.
   */
  boolean hasPublisher();
  /**
   * <pre>
   * Name of the publisher (organization or individual)
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.String publisher = 15;</code>
   * @return The publisher.
   */
  com.google.fhir.stu3.proto.String getPublisher();
  /**
   * <pre>
   * Name of the publisher (organization or individual)
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.String publisher = 15;</code>
   */
  com.google.fhir.stu3.proto.StringOrBuilder getPublisherOrBuilder();

  /**
   * <pre>
   * Contact details for the publisher
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.ContactDetail contact = 16;</code>
   */
  java.util.List<com.google.fhir.stu3.proto.ContactDetail> 
      getContactList();
  /**
   * <pre>
   * Contact details for the publisher
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.ContactDetail contact = 16;</code>
   */
  com.google.fhir.stu3.proto.ContactDetail getContact(int index);
  /**
   * <pre>
   * Contact details for the publisher
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.ContactDetail contact = 16;</code>
   */
  int getContactCount();
  /**
   * <pre>
   * Contact details for the publisher
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.ContactDetail contact = 16;</code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.ContactDetailOrBuilder> 
      getContactOrBuilderList();
  /**
   * <pre>
   * Contact details for the publisher
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.ContactDetail contact = 16;</code>
   */
  com.google.fhir.stu3.proto.ContactDetailOrBuilder getContactOrBuilder(
      int index);

  /**
   * <pre>
   * Natural language description of the implementation guide
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Markdown description = 17;</code>
   * @return Whether the description field is set.
   */
  boolean hasDescription();
  /**
   * <pre>
   * Natural language description of the implementation guide
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Markdown description = 17;</code>
   * @return The description.
   */
  com.google.fhir.stu3.proto.Markdown getDescription();
  /**
   * <pre>
   * Natural language description of the implementation guide
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Markdown description = 17;</code>
   */
  com.google.fhir.stu3.proto.MarkdownOrBuilder getDescriptionOrBuilder();

  /**
   * <pre>
   * Context the content is intended to support
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.UsageContext use_context = 18;</code>
   */
  java.util.List<com.google.fhir.stu3.proto.UsageContext> 
      getUseContextList();
  /**
   * <pre>
   * Context the content is intended to support
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.UsageContext use_context = 18;</code>
   */
  com.google.fhir.stu3.proto.UsageContext getUseContext(int index);
  /**
   * <pre>
   * Context the content is intended to support
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.UsageContext use_context = 18;</code>
   */
  int getUseContextCount();
  /**
   * <pre>
   * Context the content is intended to support
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.UsageContext use_context = 18;</code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.UsageContextOrBuilder> 
      getUseContextOrBuilderList();
  /**
   * <pre>
   * Context the content is intended to support
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.UsageContext use_context = 18;</code>
   */
  com.google.fhir.stu3.proto.UsageContextOrBuilder getUseContextOrBuilder(
      int index);

  /**
   * <pre>
   * Intended jurisdiction for implementation guide (if applicable)
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.CodeableConcept jurisdiction = 19;</code>
   */
  java.util.List<com.google.fhir.stu3.proto.CodeableConcept> 
      getJurisdictionList();
  /**
   * <pre>
   * Intended jurisdiction for implementation guide (if applicable)
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.CodeableConcept jurisdiction = 19;</code>
   */
  com.google.fhir.stu3.proto.CodeableConcept getJurisdiction(int index);
  /**
   * <pre>
   * Intended jurisdiction for implementation guide (if applicable)
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.CodeableConcept jurisdiction = 19;</code>
   */
  int getJurisdictionCount();
  /**
   * <pre>
   * Intended jurisdiction for implementation guide (if applicable)
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.CodeableConcept jurisdiction = 19;</code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.CodeableConceptOrBuilder> 
      getJurisdictionOrBuilderList();
  /**
   * <pre>
   * Intended jurisdiction for implementation guide (if applicable)
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.CodeableConcept jurisdiction = 19;</code>
   */
  com.google.fhir.stu3.proto.CodeableConceptOrBuilder getJurisdictionOrBuilder(
      int index);

  /**
   * <pre>
   * Use and/or publishing restrictions
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Markdown copyright = 20;</code>
   * @return Whether the copyright field is set.
   */
  boolean hasCopyright();
  /**
   * <pre>
   * Use and/or publishing restrictions
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Markdown copyright = 20;</code>
   * @return The copyright.
   */
  com.google.fhir.stu3.proto.Markdown getCopyright();
  /**
   * <pre>
   * Use and/or publishing restrictions
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Markdown copyright = 20;</code>
   */
  com.google.fhir.stu3.proto.MarkdownOrBuilder getCopyrightOrBuilder();

  /**
   * <pre>
   * FHIR Version this Implementation Guide targets
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Id fhir_version = 21;</code>
   * @return Whether the fhirVersion field is set.
   */
  boolean hasFhirVersion();
  /**
   * <pre>
   * FHIR Version this Implementation Guide targets
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Id fhir_version = 21;</code>
   * @return The fhirVersion.
   */
  com.google.fhir.stu3.proto.Id getFhirVersion();
  /**
   * <pre>
   * FHIR Version this Implementation Guide targets
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Id fhir_version = 21;</code>
   */
  com.google.fhir.stu3.proto.IdOrBuilder getFhirVersionOrBuilder();

  /**
   * <code>repeated .google.fhir.stu3.proto.ImplementationGuide.Dependency dependency = 22;</code>
   */
  java.util.List<com.google.fhir.stu3.proto.ImplementationGuide.Dependency> 
      getDependencyList();
  /**
   * <code>repeated .google.fhir.stu3.proto.ImplementationGuide.Dependency dependency = 22;</code>
   */
  com.google.fhir.stu3.proto.ImplementationGuide.Dependency getDependency(int index);
  /**
   * <code>repeated .google.fhir.stu3.proto.ImplementationGuide.Dependency dependency = 22;</code>
   */
  int getDependencyCount();
  /**
   * <code>repeated .google.fhir.stu3.proto.ImplementationGuide.Dependency dependency = 22;</code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.ImplementationGuide.DependencyOrBuilder> 
      getDependencyOrBuilderList();
  /**
   * <code>repeated .google.fhir.stu3.proto.ImplementationGuide.Dependency dependency = 22;</code>
   */
  com.google.fhir.stu3.proto.ImplementationGuide.DependencyOrBuilder getDependencyOrBuilder(
      int index);

  /**
   * <code>repeated .google.fhir.stu3.proto.ImplementationGuide.Package package_value = 23 [json_name = "package"];</code>
   */
  java.util.List<com.google.fhir.stu3.proto.ImplementationGuide.Package> 
      getPackageValueList();
  /**
   * <code>repeated .google.fhir.stu3.proto.ImplementationGuide.Package package_value = 23 [json_name = "package"];</code>
   */
  com.google.fhir.stu3.proto.ImplementationGuide.Package getPackageValue(int index);
  /**
   * <code>repeated .google.fhir.stu3.proto.ImplementationGuide.Package package_value = 23 [json_name = "package"];</code>
   */
  int getPackageValueCount();
  /**
   * <code>repeated .google.fhir.stu3.proto.ImplementationGuide.Package package_value = 23 [json_name = "package"];</code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.ImplementationGuide.PackageOrBuilder> 
      getPackageValueOrBuilderList();
  /**
   * <code>repeated .google.fhir.stu3.proto.ImplementationGuide.Package package_value = 23 [json_name = "package"];</code>
   */
  com.google.fhir.stu3.proto.ImplementationGuide.PackageOrBuilder getPackageValueOrBuilder(
      int index);

  /**
   * <code>repeated .google.fhir.stu3.proto.ImplementationGuide.Global global = 24;</code>
   */
  java.util.List<com.google.fhir.stu3.proto.ImplementationGuide.Global> 
      getGlobalList();
  /**
   * <code>repeated .google.fhir.stu3.proto.ImplementationGuide.Global global = 24;</code>
   */
  com.google.fhir.stu3.proto.ImplementationGuide.Global getGlobal(int index);
  /**
   * <code>repeated .google.fhir.stu3.proto.ImplementationGuide.Global global = 24;</code>
   */
  int getGlobalCount();
  /**
   * <code>repeated .google.fhir.stu3.proto.ImplementationGuide.Global global = 24;</code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.ImplementationGuide.GlobalOrBuilder> 
      getGlobalOrBuilderList();
  /**
   * <code>repeated .google.fhir.stu3.proto.ImplementationGuide.Global global = 24;</code>
   */
  com.google.fhir.stu3.proto.ImplementationGuide.GlobalOrBuilder getGlobalOrBuilder(
      int index);

  /**
   * <pre>
   * Image, css, script, etc.
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Uri binary = 25;</code>
   */
  java.util.List<com.google.fhir.stu3.proto.Uri> 
      getBinaryList();
  /**
   * <pre>
   * Image, css, script, etc.
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Uri binary = 25;</code>
   */
  com.google.fhir.stu3.proto.Uri getBinary(int index);
  /**
   * <pre>
   * Image, css, script, etc.
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Uri binary = 25;</code>
   */
  int getBinaryCount();
  /**
   * <pre>
   * Image, css, script, etc.
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Uri binary = 25;</code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.UriOrBuilder> 
      getBinaryOrBuilderList();
  /**
   * <pre>
   * Image, css, script, etc.
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Uri binary = 25;</code>
   */
  com.google.fhir.stu3.proto.UriOrBuilder getBinaryOrBuilder(
      int index);

  /**
   * <code>.google.fhir.stu3.proto.ImplementationGuide.Page page = 26;</code>
   * @return Whether the page field is set.
   */
  boolean hasPage();
  /**
   * <code>.google.fhir.stu3.proto.ImplementationGuide.Page page = 26;</code>
   * @return The page.
   */
  com.google.fhir.stu3.proto.ImplementationGuide.Page getPage();
  /**
   * <code>.google.fhir.stu3.proto.ImplementationGuide.Page page = 26;</code>
   */
  com.google.fhir.stu3.proto.ImplementationGuide.PageOrBuilder getPageOrBuilder();
}
