// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/google/fhir/proto/stu3/resources.proto

package com.google.fhir.stu3.proto;

public interface CoverageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.fhir.stu3.proto.Coverage)
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
   * The primary coverage ID
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Identifier identifier = 9;</code>
   */
  java.util.List<com.google.fhir.stu3.proto.Identifier> 
      getIdentifierList();
  /**
   * <pre>
   * The primary coverage ID
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Identifier identifier = 9;</code>
   */
  com.google.fhir.stu3.proto.Identifier getIdentifier(int index);
  /**
   * <pre>
   * The primary coverage ID
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Identifier identifier = 9;</code>
   */
  int getIdentifierCount();
  /**
   * <pre>
   * The primary coverage ID
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Identifier identifier = 9;</code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.IdentifierOrBuilder> 
      getIdentifierOrBuilderList();
  /**
   * <pre>
   * The primary coverage ID
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Identifier identifier = 9;</code>
   */
  com.google.fhir.stu3.proto.IdentifierOrBuilder getIdentifierOrBuilder(
      int index);

  /**
   * <pre>
   * active | cancelled | draft | entered-in-error
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.FinancialResourceStatusCode status = 10;</code>
   * @return Whether the status field is set.
   */
  boolean hasStatus();
  /**
   * <pre>
   * active | cancelled | draft | entered-in-error
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.FinancialResourceStatusCode status = 10;</code>
   * @return The status.
   */
  com.google.fhir.stu3.proto.FinancialResourceStatusCode getStatus();
  /**
   * <pre>
   * active | cancelled | draft | entered-in-error
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.FinancialResourceStatusCode status = 10;</code>
   */
  com.google.fhir.stu3.proto.FinancialResourceStatusCodeOrBuilder getStatusOrBuilder();

  /**
   * <pre>
   * Type of coverage such as medical or accident
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.CodeableConcept type = 11;</code>
   * @return Whether the type field is set.
   */
  boolean hasType();
  /**
   * <pre>
   * Type of coverage such as medical or accident
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.CodeableConcept type = 11;</code>
   * @return The type.
   */
  com.google.fhir.stu3.proto.CodeableConcept getType();
  /**
   * <pre>
   * Type of coverage such as medical or accident
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.CodeableConcept type = 11;</code>
   */
  com.google.fhir.stu3.proto.CodeableConceptOrBuilder getTypeOrBuilder();

  /**
   * <pre>
   * Owner of the policy
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Reference policy_holder = 12 [(.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "RelatedPerson", (.google.fhir.proto.valid_reference_type) = "Organization"];</code>
   * @return Whether the policyHolder field is set.
   */
  boolean hasPolicyHolder();
  /**
   * <pre>
   * Owner of the policy
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Reference policy_holder = 12 [(.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "RelatedPerson", (.google.fhir.proto.valid_reference_type) = "Organization"];</code>
   * @return The policyHolder.
   */
  com.google.fhir.stu3.proto.Reference getPolicyHolder();
  /**
   * <pre>
   * Owner of the policy
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Reference policy_holder = 12 [(.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "RelatedPerson", (.google.fhir.proto.valid_reference_type) = "Organization"];</code>
   */
  com.google.fhir.stu3.proto.ReferenceOrBuilder getPolicyHolderOrBuilder();

  /**
   * <pre>
   * Subscriber to the policy
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Reference subscriber = 13 [(.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "RelatedPerson"];</code>
   * @return Whether the subscriber field is set.
   */
  boolean hasSubscriber();
  /**
   * <pre>
   * Subscriber to the policy
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Reference subscriber = 13 [(.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "RelatedPerson"];</code>
   * @return The subscriber.
   */
  com.google.fhir.stu3.proto.Reference getSubscriber();
  /**
   * <pre>
   * Subscriber to the policy
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Reference subscriber = 13 [(.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "RelatedPerson"];</code>
   */
  com.google.fhir.stu3.proto.ReferenceOrBuilder getSubscriberOrBuilder();

  /**
   * <pre>
   * ID assigned to the Subscriber
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.String subscriber_id = 14;</code>
   * @return Whether the subscriberId field is set.
   */
  boolean hasSubscriberId();
  /**
   * <pre>
   * ID assigned to the Subscriber
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.String subscriber_id = 14;</code>
   * @return The subscriberId.
   */
  com.google.fhir.stu3.proto.String getSubscriberId();
  /**
   * <pre>
   * ID assigned to the Subscriber
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.String subscriber_id = 14;</code>
   */
  com.google.fhir.stu3.proto.StringOrBuilder getSubscriberIdOrBuilder();

  /**
   * <pre>
   * Plan Beneficiary
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Reference beneficiary = 15 [(.google.fhir.proto.valid_reference_type) = "Patient"];</code>
   * @return Whether the beneficiary field is set.
   */
  boolean hasBeneficiary();
  /**
   * <pre>
   * Plan Beneficiary
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Reference beneficiary = 15 [(.google.fhir.proto.valid_reference_type) = "Patient"];</code>
   * @return The beneficiary.
   */
  com.google.fhir.stu3.proto.Reference getBeneficiary();
  /**
   * <pre>
   * Plan Beneficiary
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Reference beneficiary = 15 [(.google.fhir.proto.valid_reference_type) = "Patient"];</code>
   */
  com.google.fhir.stu3.proto.ReferenceOrBuilder getBeneficiaryOrBuilder();

  /**
   * <pre>
   * Beneficiary relationship to the Subscriber
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.CodeableConcept relationship = 16;</code>
   * @return Whether the relationship field is set.
   */
  boolean hasRelationship();
  /**
   * <pre>
   * Beneficiary relationship to the Subscriber
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.CodeableConcept relationship = 16;</code>
   * @return The relationship.
   */
  com.google.fhir.stu3.proto.CodeableConcept getRelationship();
  /**
   * <pre>
   * Beneficiary relationship to the Subscriber
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.CodeableConcept relationship = 16;</code>
   */
  com.google.fhir.stu3.proto.CodeableConceptOrBuilder getRelationshipOrBuilder();

  /**
   * <pre>
   * Coverage start and end dates
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Period period = 17;</code>
   * @return Whether the period field is set.
   */
  boolean hasPeriod();
  /**
   * <pre>
   * Coverage start and end dates
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Period period = 17;</code>
   * @return The period.
   */
  com.google.fhir.stu3.proto.Period getPeriod();
  /**
   * <pre>
   * Coverage start and end dates
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Period period = 17;</code>
   */
  com.google.fhir.stu3.proto.PeriodOrBuilder getPeriodOrBuilder();

  /**
   * <pre>
   * Identifier for the plan or agreement issuer
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Reference payor = 18 [(.google.fhir.proto.valid_reference_type) = "Organization", (.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "RelatedPerson"];</code>
   */
  java.util.List<com.google.fhir.stu3.proto.Reference> 
      getPayorList();
  /**
   * <pre>
   * Identifier for the plan or agreement issuer
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Reference payor = 18 [(.google.fhir.proto.valid_reference_type) = "Organization", (.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "RelatedPerson"];</code>
   */
  com.google.fhir.stu3.proto.Reference getPayor(int index);
  /**
   * <pre>
   * Identifier for the plan or agreement issuer
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Reference payor = 18 [(.google.fhir.proto.valid_reference_type) = "Organization", (.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "RelatedPerson"];</code>
   */
  int getPayorCount();
  /**
   * <pre>
   * Identifier for the plan or agreement issuer
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Reference payor = 18 [(.google.fhir.proto.valid_reference_type) = "Organization", (.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "RelatedPerson"];</code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.ReferenceOrBuilder> 
      getPayorOrBuilderList();
  /**
   * <pre>
   * Identifier for the plan or agreement issuer
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Reference payor = 18 [(.google.fhir.proto.valid_reference_type) = "Organization", (.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "RelatedPerson"];</code>
   */
  com.google.fhir.stu3.proto.ReferenceOrBuilder getPayorOrBuilder(
      int index);

  /**
   * <code>.google.fhir.stu3.proto.Coverage.Group grouping = 19;</code>
   * @return Whether the grouping field is set.
   */
  boolean hasGrouping();
  /**
   * <code>.google.fhir.stu3.proto.Coverage.Group grouping = 19;</code>
   * @return The grouping.
   */
  com.google.fhir.stu3.proto.Coverage.Group getGrouping();
  /**
   * <code>.google.fhir.stu3.proto.Coverage.Group grouping = 19;</code>
   */
  com.google.fhir.stu3.proto.Coverage.GroupOrBuilder getGroupingOrBuilder();

  /**
   * <pre>
   * Dependent number
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.String dependent = 20;</code>
   * @return Whether the dependent field is set.
   */
  boolean hasDependent();
  /**
   * <pre>
   * Dependent number
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.String dependent = 20;</code>
   * @return The dependent.
   */
  com.google.fhir.stu3.proto.String getDependent();
  /**
   * <pre>
   * Dependent number
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.String dependent = 20;</code>
   */
  com.google.fhir.stu3.proto.StringOrBuilder getDependentOrBuilder();

  /**
   * <pre>
   * The plan instance or sequence counter
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.String sequence = 21;</code>
   * @return Whether the sequence field is set.
   */
  boolean hasSequence();
  /**
   * <pre>
   * The plan instance or sequence counter
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.String sequence = 21;</code>
   * @return The sequence.
   */
  com.google.fhir.stu3.proto.String getSequence();
  /**
   * <pre>
   * The plan instance or sequence counter
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.String sequence = 21;</code>
   */
  com.google.fhir.stu3.proto.StringOrBuilder getSequenceOrBuilder();

  /**
   * <pre>
   * Relative order of the coverage
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.PositiveInt order = 22;</code>
   * @return Whether the order field is set.
   */
  boolean hasOrder();
  /**
   * <pre>
   * Relative order of the coverage
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.PositiveInt order = 22;</code>
   * @return The order.
   */
  com.google.fhir.stu3.proto.PositiveInt getOrder();
  /**
   * <pre>
   * Relative order of the coverage
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.PositiveInt order = 22;</code>
   */
  com.google.fhir.stu3.proto.PositiveIntOrBuilder getOrderOrBuilder();

  /**
   * <pre>
   * Insurer network
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.String network = 23;</code>
   * @return Whether the network field is set.
   */
  boolean hasNetwork();
  /**
   * <pre>
   * Insurer network
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.String network = 23;</code>
   * @return The network.
   */
  com.google.fhir.stu3.proto.String getNetwork();
  /**
   * <pre>
   * Insurer network
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.String network = 23;</code>
   */
  com.google.fhir.stu3.proto.StringOrBuilder getNetworkOrBuilder();

  /**
   * <pre>
   * Contract details
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Reference contract = 24 [(.google.fhir.proto.valid_reference_type) = "Contract"];</code>
   */
  java.util.List<com.google.fhir.stu3.proto.Reference> 
      getContractList();
  /**
   * <pre>
   * Contract details
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Reference contract = 24 [(.google.fhir.proto.valid_reference_type) = "Contract"];</code>
   */
  com.google.fhir.stu3.proto.Reference getContract(int index);
  /**
   * <pre>
   * Contract details
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Reference contract = 24 [(.google.fhir.proto.valid_reference_type) = "Contract"];</code>
   */
  int getContractCount();
  /**
   * <pre>
   * Contract details
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Reference contract = 24 [(.google.fhir.proto.valid_reference_type) = "Contract"];</code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.ReferenceOrBuilder> 
      getContractOrBuilderList();
  /**
   * <pre>
   * Contract details
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Reference contract = 24 [(.google.fhir.proto.valid_reference_type) = "Contract"];</code>
   */
  com.google.fhir.stu3.proto.ReferenceOrBuilder getContractOrBuilder(
      int index);
}
