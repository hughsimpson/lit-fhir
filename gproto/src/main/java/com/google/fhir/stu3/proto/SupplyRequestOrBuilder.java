// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/google/fhir/proto/stu3/resources.proto

package com.google.fhir.stu3.proto;

public interface SupplyRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.fhir.stu3.proto.SupplyRequest)
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
   * Unique identifier
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Identifier identifier = 9;</code>
   * @return Whether the identifier field is set.
   */
  boolean hasIdentifier();
  /**
   * <pre>
   * Unique identifier
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Identifier identifier = 9;</code>
   * @return The identifier.
   */
  com.google.fhir.stu3.proto.Identifier getIdentifier();
  /**
   * <pre>
   * Unique identifier
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Identifier identifier = 9;</code>
   */
  com.google.fhir.stu3.proto.IdentifierOrBuilder getIdentifierOrBuilder();

  /**
   * <pre>
   * draft | active | suspended +
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.SupplyRequestStatusCode status = 10;</code>
   * @return Whether the status field is set.
   */
  boolean hasStatus();
  /**
   * <pre>
   * draft | active | suspended +
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.SupplyRequestStatusCode status = 10;</code>
   * @return The status.
   */
  com.google.fhir.stu3.proto.SupplyRequestStatusCode getStatus();
  /**
   * <pre>
   * draft | active | suspended +
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.SupplyRequestStatusCode status = 10;</code>
   */
  com.google.fhir.stu3.proto.SupplyRequestStatusCodeOrBuilder getStatusOrBuilder();

  /**
   * <pre>
   * The kind of supply (central, non-stock, etc.)
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.CodeableConcept category = 11;</code>
   * @return Whether the category field is set.
   */
  boolean hasCategory();
  /**
   * <pre>
   * The kind of supply (central, non-stock, etc.)
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.CodeableConcept category = 11;</code>
   * @return The category.
   */
  com.google.fhir.stu3.proto.CodeableConcept getCategory();
  /**
   * <pre>
   * The kind of supply (central, non-stock, etc.)
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.CodeableConcept category = 11;</code>
   */
  com.google.fhir.stu3.proto.CodeableConceptOrBuilder getCategoryOrBuilder();

  /**
   * <pre>
   * routine | urgent | asap | stat
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.RequestPriorityCode priority = 12;</code>
   * @return Whether the priority field is set.
   */
  boolean hasPriority();
  /**
   * <pre>
   * routine | urgent | asap | stat
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.RequestPriorityCode priority = 12;</code>
   * @return The priority.
   */
  com.google.fhir.stu3.proto.RequestPriorityCode getPriority();
  /**
   * <pre>
   * routine | urgent | asap | stat
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.RequestPriorityCode priority = 12;</code>
   */
  com.google.fhir.stu3.proto.RequestPriorityCodeOrBuilder getPriorityOrBuilder();

  /**
   * <code>.google.fhir.stu3.proto.SupplyRequest.OrderedItem ordered_item = 13;</code>
   * @return Whether the orderedItem field is set.
   */
  boolean hasOrderedItem();
  /**
   * <code>.google.fhir.stu3.proto.SupplyRequest.OrderedItem ordered_item = 13;</code>
   * @return The orderedItem.
   */
  com.google.fhir.stu3.proto.SupplyRequest.OrderedItem getOrderedItem();
  /**
   * <code>.google.fhir.stu3.proto.SupplyRequest.OrderedItem ordered_item = 13;</code>
   */
  com.google.fhir.stu3.proto.SupplyRequest.OrderedItemOrBuilder getOrderedItemOrBuilder();

  /**
   * <code>.google.fhir.stu3.proto.SupplyRequest.Occurrence occurrence = 14;</code>
   * @return Whether the occurrence field is set.
   */
  boolean hasOccurrence();
  /**
   * <code>.google.fhir.stu3.proto.SupplyRequest.Occurrence occurrence = 14;</code>
   * @return The occurrence.
   */
  com.google.fhir.stu3.proto.SupplyRequest.Occurrence getOccurrence();
  /**
   * <code>.google.fhir.stu3.proto.SupplyRequest.Occurrence occurrence = 14;</code>
   */
  com.google.fhir.stu3.proto.SupplyRequest.OccurrenceOrBuilder getOccurrenceOrBuilder();

  /**
   * <pre>
   * When the request was made
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.DateTime authored_on = 15;</code>
   * @return Whether the authoredOn field is set.
   */
  boolean hasAuthoredOn();
  /**
   * <pre>
   * When the request was made
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.DateTime authored_on = 15;</code>
   * @return The authoredOn.
   */
  com.google.fhir.stu3.proto.DateTime getAuthoredOn();
  /**
   * <pre>
   * When the request was made
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.DateTime authored_on = 15;</code>
   */
  com.google.fhir.stu3.proto.DateTimeOrBuilder getAuthoredOnOrBuilder();

  /**
   * <code>.google.fhir.stu3.proto.SupplyRequest.Requester requester = 16;</code>
   * @return Whether the requester field is set.
   */
  boolean hasRequester();
  /**
   * <code>.google.fhir.stu3.proto.SupplyRequest.Requester requester = 16;</code>
   * @return The requester.
   */
  com.google.fhir.stu3.proto.SupplyRequest.Requester getRequester();
  /**
   * <code>.google.fhir.stu3.proto.SupplyRequest.Requester requester = 16;</code>
   */
  com.google.fhir.stu3.proto.SupplyRequest.RequesterOrBuilder getRequesterOrBuilder();

  /**
   * <pre>
   * Who is intended to fulfill the request
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Reference supplier = 17 [(.google.fhir.proto.valid_reference_type) = "Organization"];</code>
   */
  java.util.List<com.google.fhir.stu3.proto.Reference> 
      getSupplierList();
  /**
   * <pre>
   * Who is intended to fulfill the request
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Reference supplier = 17 [(.google.fhir.proto.valid_reference_type) = "Organization"];</code>
   */
  com.google.fhir.stu3.proto.Reference getSupplier(int index);
  /**
   * <pre>
   * Who is intended to fulfill the request
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Reference supplier = 17 [(.google.fhir.proto.valid_reference_type) = "Organization"];</code>
   */
  int getSupplierCount();
  /**
   * <pre>
   * Who is intended to fulfill the request
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Reference supplier = 17 [(.google.fhir.proto.valid_reference_type) = "Organization"];</code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.ReferenceOrBuilder> 
      getSupplierOrBuilderList();
  /**
   * <pre>
   * Who is intended to fulfill the request
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Reference supplier = 17 [(.google.fhir.proto.valid_reference_type) = "Organization"];</code>
   */
  com.google.fhir.stu3.proto.ReferenceOrBuilder getSupplierOrBuilder(
      int index);

  /**
   * <code>.google.fhir.stu3.proto.SupplyRequest.Reason reason = 18;</code>
   * @return Whether the reason field is set.
   */
  boolean hasReason();
  /**
   * <code>.google.fhir.stu3.proto.SupplyRequest.Reason reason = 18;</code>
   * @return The reason.
   */
  com.google.fhir.stu3.proto.SupplyRequest.Reason getReason();
  /**
   * <code>.google.fhir.stu3.proto.SupplyRequest.Reason reason = 18;</code>
   */
  com.google.fhir.stu3.proto.SupplyRequest.ReasonOrBuilder getReasonOrBuilder();

  /**
   * <pre>
   * The origin of the supply
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Reference deliver_from = 19 [(.google.fhir.proto.valid_reference_type) = "Organization", (.google.fhir.proto.valid_reference_type) = "Location"];</code>
   * @return Whether the deliverFrom field is set.
   */
  boolean hasDeliverFrom();
  /**
   * <pre>
   * The origin of the supply
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Reference deliver_from = 19 [(.google.fhir.proto.valid_reference_type) = "Organization", (.google.fhir.proto.valid_reference_type) = "Location"];</code>
   * @return The deliverFrom.
   */
  com.google.fhir.stu3.proto.Reference getDeliverFrom();
  /**
   * <pre>
   * The origin of the supply
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Reference deliver_from = 19 [(.google.fhir.proto.valid_reference_type) = "Organization", (.google.fhir.proto.valid_reference_type) = "Location"];</code>
   */
  com.google.fhir.stu3.proto.ReferenceOrBuilder getDeliverFromOrBuilder();

  /**
   * <pre>
   * The destination of the supply
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Reference deliver_to = 20 [(.google.fhir.proto.valid_reference_type) = "Organization", (.google.fhir.proto.valid_reference_type) = "Location", (.google.fhir.proto.valid_reference_type) = "Patient"];</code>
   * @return Whether the deliverTo field is set.
   */
  boolean hasDeliverTo();
  /**
   * <pre>
   * The destination of the supply
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Reference deliver_to = 20 [(.google.fhir.proto.valid_reference_type) = "Organization", (.google.fhir.proto.valid_reference_type) = "Location", (.google.fhir.proto.valid_reference_type) = "Patient"];</code>
   * @return The deliverTo.
   */
  com.google.fhir.stu3.proto.Reference getDeliverTo();
  /**
   * <pre>
   * The destination of the supply
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Reference deliver_to = 20 [(.google.fhir.proto.valid_reference_type) = "Organization", (.google.fhir.proto.valid_reference_type) = "Location", (.google.fhir.proto.valid_reference_type) = "Patient"];</code>
   */
  com.google.fhir.stu3.proto.ReferenceOrBuilder getDeliverToOrBuilder();
}
