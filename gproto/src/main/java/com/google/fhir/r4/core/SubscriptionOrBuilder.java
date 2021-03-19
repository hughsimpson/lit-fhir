// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/google/fhir/proto/r4/core/resources/subscription.proto

package com.google.fhir.r4.core;

public interface SubscriptionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.fhir.r4.core.Subscription)
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
   * <code>.google.fhir.r4.core.Subscription.StatusCode status = 10 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   * @return Whether the status field is set.
   */
  boolean hasStatus();
  /**
   * <code>.google.fhir.r4.core.Subscription.StatusCode status = 10 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   * @return The status.
   */
  com.google.fhir.r4.core.Subscription.StatusCode getStatus();
  /**
   * <code>.google.fhir.r4.core.Subscription.StatusCode status = 10 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   */
  com.google.fhir.r4.core.Subscription.StatusCodeOrBuilder getStatusOrBuilder();

  /**
   * <pre>
   * Contact details for source (e.g. troubleshooting)
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.ContactPoint contact = 11;</code>
   */
  java.util.List<com.google.fhir.r4.core.ContactPoint> 
      getContactList();
  /**
   * <pre>
   * Contact details for source (e.g. troubleshooting)
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.ContactPoint contact = 11;</code>
   */
  com.google.fhir.r4.core.ContactPoint getContact(int index);
  /**
   * <pre>
   * Contact details for source (e.g. troubleshooting)
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.ContactPoint contact = 11;</code>
   */
  int getContactCount();
  /**
   * <pre>
   * Contact details for source (e.g. troubleshooting)
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.ContactPoint contact = 11;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.ContactPointOrBuilder> 
      getContactOrBuilderList();
  /**
   * <pre>
   * Contact details for source (e.g. troubleshooting)
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.ContactPoint contact = 11;</code>
   */
  com.google.fhir.r4.core.ContactPointOrBuilder getContactOrBuilder(
      int index);

  /**
   * <pre>
   * When to automatically delete the subscription
   * </pre>
   *
   * <code>.google.fhir.r4.core.Instant end = 12;</code>
   * @return Whether the end field is set.
   */
  boolean hasEnd();
  /**
   * <pre>
   * When to automatically delete the subscription
   * </pre>
   *
   * <code>.google.fhir.r4.core.Instant end = 12;</code>
   * @return The end.
   */
  com.google.fhir.r4.core.Instant getEnd();
  /**
   * <pre>
   * When to automatically delete the subscription
   * </pre>
   *
   * <code>.google.fhir.r4.core.Instant end = 12;</code>
   */
  com.google.fhir.r4.core.InstantOrBuilder getEndOrBuilder();

  /**
   * <pre>
   * Description of why this subscription was created
   * </pre>
   *
   * <code>.google.fhir.r4.core.String reason = 13 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   * @return Whether the reason field is set.
   */
  boolean hasReason();
  /**
   * <pre>
   * Description of why this subscription was created
   * </pre>
   *
   * <code>.google.fhir.r4.core.String reason = 13 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   * @return The reason.
   */
  com.google.fhir.r4.core.String getReason();
  /**
   * <pre>
   * Description of why this subscription was created
   * </pre>
   *
   * <code>.google.fhir.r4.core.String reason = 13 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   */
  com.google.fhir.r4.core.StringOrBuilder getReasonOrBuilder();

  /**
   * <pre>
   * Rule for server push
   * </pre>
   *
   * <code>.google.fhir.r4.core.String criteria = 14 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   * @return Whether the criteria field is set.
   */
  boolean hasCriteria();
  /**
   * <pre>
   * Rule for server push
   * </pre>
   *
   * <code>.google.fhir.r4.core.String criteria = 14 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   * @return The criteria.
   */
  com.google.fhir.r4.core.String getCriteria();
  /**
   * <pre>
   * Rule for server push
   * </pre>
   *
   * <code>.google.fhir.r4.core.String criteria = 14 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   */
  com.google.fhir.r4.core.StringOrBuilder getCriteriaOrBuilder();

  /**
   * <pre>
   * Latest error note
   * </pre>
   *
   * <code>.google.fhir.r4.core.String error = 15;</code>
   * @return Whether the error field is set.
   */
  boolean hasError();
  /**
   * <pre>
   * Latest error note
   * </pre>
   *
   * <code>.google.fhir.r4.core.String error = 15;</code>
   * @return The error.
   */
  com.google.fhir.r4.core.String getError();
  /**
   * <pre>
   * Latest error note
   * </pre>
   *
   * <code>.google.fhir.r4.core.String error = 15;</code>
   */
  com.google.fhir.r4.core.StringOrBuilder getErrorOrBuilder();

  /**
   * <code>.google.fhir.r4.core.Subscription.Channel channel = 16 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   * @return Whether the channel field is set.
   */
  boolean hasChannel();
  /**
   * <code>.google.fhir.r4.core.Subscription.Channel channel = 16 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   * @return The channel.
   */
  com.google.fhir.r4.core.Subscription.Channel getChannel();
  /**
   * <code>.google.fhir.r4.core.Subscription.Channel channel = 16 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   */
  com.google.fhir.r4.core.Subscription.ChannelOrBuilder getChannelOrBuilder();
}
