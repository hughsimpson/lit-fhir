// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/google/fhir/proto/r4/core/resources/coverage.proto

package com.google.fhir.r4.core;

public interface CoverageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.fhir.r4.core.Coverage)
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
   * Business Identifier for the coverage
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Identifier identifier = 10;</code>
   */
  java.util.List<com.google.fhir.r4.core.Identifier> 
      getIdentifierList();
  /**
   * <pre>
   * Business Identifier for the coverage
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Identifier identifier = 10;</code>
   */
  com.google.fhir.r4.core.Identifier getIdentifier(int index);
  /**
   * <pre>
   * Business Identifier for the coverage
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Identifier identifier = 10;</code>
   */
  int getIdentifierCount();
  /**
   * <pre>
   * Business Identifier for the coverage
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Identifier identifier = 10;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.IdentifierOrBuilder> 
      getIdentifierOrBuilderList();
  /**
   * <pre>
   * Business Identifier for the coverage
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Identifier identifier = 10;</code>
   */
  com.google.fhir.r4.core.IdentifierOrBuilder getIdentifierOrBuilder(
      int index);

  /**
   * <code>.google.fhir.r4.core.Coverage.StatusCode status = 11 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   * @return Whether the status field is set.
   */
  boolean hasStatus();
  /**
   * <code>.google.fhir.r4.core.Coverage.StatusCode status = 11 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   * @return The status.
   */
  com.google.fhir.r4.core.Coverage.StatusCode getStatus();
  /**
   * <code>.google.fhir.r4.core.Coverage.StatusCode status = 11 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   */
  com.google.fhir.r4.core.Coverage.StatusCodeOrBuilder getStatusOrBuilder();

  /**
   * <pre>
   * Coverage category such as medical or accident
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept type = 12;</code>
   * @return Whether the type field is set.
   */
  boolean hasType();
  /**
   * <pre>
   * Coverage category such as medical or accident
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept type = 12;</code>
   * @return The type.
   */
  com.google.fhir.r4.core.CodeableConcept getType();
  /**
   * <pre>
   * Coverage category such as medical or accident
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept type = 12;</code>
   */
  com.google.fhir.r4.core.CodeableConceptOrBuilder getTypeOrBuilder();

  /**
   * <pre>
   * Owner of the policy
   * </pre>
   *
   * <code>.google.fhir.r4.core.Reference policy_holder = 13 [(.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "RelatedPerson", (.google.fhir.proto.valid_reference_type) = "Organization"];</code>
   * @return Whether the policyHolder field is set.
   */
  boolean hasPolicyHolder();
  /**
   * <pre>
   * Owner of the policy
   * </pre>
   *
   * <code>.google.fhir.r4.core.Reference policy_holder = 13 [(.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "RelatedPerson", (.google.fhir.proto.valid_reference_type) = "Organization"];</code>
   * @return The policyHolder.
   */
  com.google.fhir.r4.core.Reference getPolicyHolder();
  /**
   * <pre>
   * Owner of the policy
   * </pre>
   *
   * <code>.google.fhir.r4.core.Reference policy_holder = 13 [(.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "RelatedPerson", (.google.fhir.proto.valid_reference_type) = "Organization"];</code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getPolicyHolderOrBuilder();

  /**
   * <pre>
   * Subscriber to the policy
   * </pre>
   *
   * <code>.google.fhir.r4.core.Reference subscriber = 14 [(.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "RelatedPerson"];</code>
   * @return Whether the subscriber field is set.
   */
  boolean hasSubscriber();
  /**
   * <pre>
   * Subscriber to the policy
   * </pre>
   *
   * <code>.google.fhir.r4.core.Reference subscriber = 14 [(.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "RelatedPerson"];</code>
   * @return The subscriber.
   */
  com.google.fhir.r4.core.Reference getSubscriber();
  /**
   * <pre>
   * Subscriber to the policy
   * </pre>
   *
   * <code>.google.fhir.r4.core.Reference subscriber = 14 [(.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "RelatedPerson"];</code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getSubscriberOrBuilder();

  /**
   * <pre>
   * ID assigned to the subscriber
   * </pre>
   *
   * <code>.google.fhir.r4.core.String subscriber_id = 15;</code>
   * @return Whether the subscriberId field is set.
   */
  boolean hasSubscriberId();
  /**
   * <pre>
   * ID assigned to the subscriber
   * </pre>
   *
   * <code>.google.fhir.r4.core.String subscriber_id = 15;</code>
   * @return The subscriberId.
   */
  com.google.fhir.r4.core.String getSubscriberId();
  /**
   * <pre>
   * ID assigned to the subscriber
   * </pre>
   *
   * <code>.google.fhir.r4.core.String subscriber_id = 15;</code>
   */
  com.google.fhir.r4.core.StringOrBuilder getSubscriberIdOrBuilder();

  /**
   * <pre>
   * Plan beneficiary
   * </pre>
   *
   * <code>.google.fhir.r4.core.Reference beneficiary = 16 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR, (.google.fhir.proto.valid_reference_type) = "Patient"];</code>
   * @return Whether the beneficiary field is set.
   */
  boolean hasBeneficiary();
  /**
   * <pre>
   * Plan beneficiary
   * </pre>
   *
   * <code>.google.fhir.r4.core.Reference beneficiary = 16 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR, (.google.fhir.proto.valid_reference_type) = "Patient"];</code>
   * @return The beneficiary.
   */
  com.google.fhir.r4.core.Reference getBeneficiary();
  /**
   * <pre>
   * Plan beneficiary
   * </pre>
   *
   * <code>.google.fhir.r4.core.Reference beneficiary = 16 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR, (.google.fhir.proto.valid_reference_type) = "Patient"];</code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getBeneficiaryOrBuilder();

  /**
   * <pre>
   * Dependent number
   * </pre>
   *
   * <code>.google.fhir.r4.core.String dependent = 17;</code>
   * @return Whether the dependent field is set.
   */
  boolean hasDependent();
  /**
   * <pre>
   * Dependent number
   * </pre>
   *
   * <code>.google.fhir.r4.core.String dependent = 17;</code>
   * @return The dependent.
   */
  com.google.fhir.r4.core.String getDependent();
  /**
   * <pre>
   * Dependent number
   * </pre>
   *
   * <code>.google.fhir.r4.core.String dependent = 17;</code>
   */
  com.google.fhir.r4.core.StringOrBuilder getDependentOrBuilder();

  /**
   * <pre>
   * Beneficiary relationship to the subscriber
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept relationship = 18;</code>
   * @return Whether the relationship field is set.
   */
  boolean hasRelationship();
  /**
   * <pre>
   * Beneficiary relationship to the subscriber
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept relationship = 18;</code>
   * @return The relationship.
   */
  com.google.fhir.r4.core.CodeableConcept getRelationship();
  /**
   * <pre>
   * Beneficiary relationship to the subscriber
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept relationship = 18;</code>
   */
  com.google.fhir.r4.core.CodeableConceptOrBuilder getRelationshipOrBuilder();

  /**
   * <pre>
   * Coverage start and end dates
   * </pre>
   *
   * <code>.google.fhir.r4.core.Period period = 19;</code>
   * @return Whether the period field is set.
   */
  boolean hasPeriod();
  /**
   * <pre>
   * Coverage start and end dates
   * </pre>
   *
   * <code>.google.fhir.r4.core.Period period = 19;</code>
   * @return The period.
   */
  com.google.fhir.r4.core.Period getPeriod();
  /**
   * <pre>
   * Coverage start and end dates
   * </pre>
   *
   * <code>.google.fhir.r4.core.Period period = 19;</code>
   */
  com.google.fhir.r4.core.PeriodOrBuilder getPeriodOrBuilder();

  /**
   * <pre>
   * Issuer of the policy
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Reference payor = 20 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR, (.google.fhir.proto.valid_reference_type) = "Organization", (.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "RelatedPerson"];</code>
   */
  java.util.List<com.google.fhir.r4.core.Reference> 
      getPayorList();
  /**
   * <pre>
   * Issuer of the policy
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Reference payor = 20 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR, (.google.fhir.proto.valid_reference_type) = "Organization", (.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "RelatedPerson"];</code>
   */
  com.google.fhir.r4.core.Reference getPayor(int index);
  /**
   * <pre>
   * Issuer of the policy
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Reference payor = 20 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR, (.google.fhir.proto.valid_reference_type) = "Organization", (.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "RelatedPerson"];</code>
   */
  int getPayorCount();
  /**
   * <pre>
   * Issuer of the policy
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Reference payor = 20 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR, (.google.fhir.proto.valid_reference_type) = "Organization", (.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "RelatedPerson"];</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.ReferenceOrBuilder> 
      getPayorOrBuilderList();
  /**
   * <pre>
   * Issuer of the policy
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Reference payor = 20 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR, (.google.fhir.proto.valid_reference_type) = "Organization", (.google.fhir.proto.valid_reference_type) = "Patient", (.google.fhir.proto.valid_reference_type) = "RelatedPerson"];</code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getPayorOrBuilder(
      int index);

  /**
   * <code>repeated .google.fhir.r4.core.Coverage.Class class_value = 21 [json_name = "class"];</code>
   */
  java.util.List<com.google.fhir.r4.core.Coverage.Class> 
      getClassValueList();
  /**
   * <code>repeated .google.fhir.r4.core.Coverage.Class class_value = 21 [json_name = "class"];</code>
   */
  com.google.fhir.r4.core.Coverage.Class getClassValue(int index);
  /**
   * <code>repeated .google.fhir.r4.core.Coverage.Class class_value = 21 [json_name = "class"];</code>
   */
  int getClassValueCount();
  /**
   * <code>repeated .google.fhir.r4.core.Coverage.Class class_value = 21 [json_name = "class"];</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.Coverage.ClassOrBuilder> 
      getClassValueOrBuilderList();
  /**
   * <code>repeated .google.fhir.r4.core.Coverage.Class class_value = 21 [json_name = "class"];</code>
   */
  com.google.fhir.r4.core.Coverage.ClassOrBuilder getClassValueOrBuilder(
      int index);

  /**
   * <pre>
   * Relative order of the coverage
   * </pre>
   *
   * <code>.google.fhir.r4.core.PositiveInt order = 22;</code>
   * @return Whether the order field is set.
   */
  boolean hasOrder();
  /**
   * <pre>
   * Relative order of the coverage
   * </pre>
   *
   * <code>.google.fhir.r4.core.PositiveInt order = 22;</code>
   * @return The order.
   */
  com.google.fhir.r4.core.PositiveInt getOrder();
  /**
   * <pre>
   * Relative order of the coverage
   * </pre>
   *
   * <code>.google.fhir.r4.core.PositiveInt order = 22;</code>
   */
  com.google.fhir.r4.core.PositiveIntOrBuilder getOrderOrBuilder();

  /**
   * <pre>
   * Insurer network
   * </pre>
   *
   * <code>.google.fhir.r4.core.String network = 23;</code>
   * @return Whether the network field is set.
   */
  boolean hasNetwork();
  /**
   * <pre>
   * Insurer network
   * </pre>
   *
   * <code>.google.fhir.r4.core.String network = 23;</code>
   * @return The network.
   */
  com.google.fhir.r4.core.String getNetwork();
  /**
   * <pre>
   * Insurer network
   * </pre>
   *
   * <code>.google.fhir.r4.core.String network = 23;</code>
   */
  com.google.fhir.r4.core.StringOrBuilder getNetworkOrBuilder();

  /**
   * <code>repeated .google.fhir.r4.core.Coverage.CostToBeneficiary cost_to_beneficiary = 24;</code>
   */
  java.util.List<com.google.fhir.r4.core.Coverage.CostToBeneficiary> 
      getCostToBeneficiaryList();
  /**
   * <code>repeated .google.fhir.r4.core.Coverage.CostToBeneficiary cost_to_beneficiary = 24;</code>
   */
  com.google.fhir.r4.core.Coverage.CostToBeneficiary getCostToBeneficiary(int index);
  /**
   * <code>repeated .google.fhir.r4.core.Coverage.CostToBeneficiary cost_to_beneficiary = 24;</code>
   */
  int getCostToBeneficiaryCount();
  /**
   * <code>repeated .google.fhir.r4.core.Coverage.CostToBeneficiary cost_to_beneficiary = 24;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.Coverage.CostToBeneficiaryOrBuilder> 
      getCostToBeneficiaryOrBuilderList();
  /**
   * <code>repeated .google.fhir.r4.core.Coverage.CostToBeneficiary cost_to_beneficiary = 24;</code>
   */
  com.google.fhir.r4.core.Coverage.CostToBeneficiaryOrBuilder getCostToBeneficiaryOrBuilder(
      int index);

  /**
   * <pre>
   * Reimbursement to insurer
   * </pre>
   *
   * <code>.google.fhir.r4.core.Boolean subrogation = 25;</code>
   * @return Whether the subrogation field is set.
   */
  boolean hasSubrogation();
  /**
   * <pre>
   * Reimbursement to insurer
   * </pre>
   *
   * <code>.google.fhir.r4.core.Boolean subrogation = 25;</code>
   * @return The subrogation.
   */
  com.google.fhir.r4.core.Boolean getSubrogation();
  /**
   * <pre>
   * Reimbursement to insurer
   * </pre>
   *
   * <code>.google.fhir.r4.core.Boolean subrogation = 25;</code>
   */
  com.google.fhir.r4.core.BooleanOrBuilder getSubrogationOrBuilder();

  /**
   * <pre>
   * Contract details
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Reference contract = 26 [(.google.fhir.proto.valid_reference_type) = "Contract"];</code>
   */
  java.util.List<com.google.fhir.r4.core.Reference> 
      getContractList();
  /**
   * <pre>
   * Contract details
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Reference contract = 26 [(.google.fhir.proto.valid_reference_type) = "Contract"];</code>
   */
  com.google.fhir.r4.core.Reference getContract(int index);
  /**
   * <pre>
   * Contract details
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Reference contract = 26 [(.google.fhir.proto.valid_reference_type) = "Contract"];</code>
   */
  int getContractCount();
  /**
   * <pre>
   * Contract details
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Reference contract = 26 [(.google.fhir.proto.valid_reference_type) = "Contract"];</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.ReferenceOrBuilder> 
      getContractOrBuilderList();
  /**
   * <pre>
   * Contract details
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Reference contract = 26 [(.google.fhir.proto.valid_reference_type) = "Contract"];</code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getContractOrBuilder(
      int index);
}
