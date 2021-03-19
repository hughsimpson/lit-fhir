// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/google/fhir/proto/r4/core/resources/observation_definition.proto

package com.google.fhir.r4.core;

public interface ObservationDefinitionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.fhir.r4.core.ObservationDefinition)
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
   * Category of observation
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept category = 10;</code>
   */
  java.util.List<com.google.fhir.r4.core.CodeableConcept> 
      getCategoryList();
  /**
   * <pre>
   * Category of observation
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept category = 10;</code>
   */
  com.google.fhir.r4.core.CodeableConcept getCategory(int index);
  /**
   * <pre>
   * Category of observation
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept category = 10;</code>
   */
  int getCategoryCount();
  /**
   * <pre>
   * Category of observation
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept category = 10;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.CodeableConceptOrBuilder> 
      getCategoryOrBuilderList();
  /**
   * <pre>
   * Category of observation
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept category = 10;</code>
   */
  com.google.fhir.r4.core.CodeableConceptOrBuilder getCategoryOrBuilder(
      int index);

  /**
   * <pre>
   * Type of observation (code / type)
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept code = 11 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   * @return Whether the code field is set.
   */
  boolean hasCode();
  /**
   * <pre>
   * Type of observation (code / type)
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept code = 11 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   * @return The code.
   */
  com.google.fhir.r4.core.CodeableConcept getCode();
  /**
   * <pre>
   * Type of observation (code / type)
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept code = 11 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   */
  com.google.fhir.r4.core.CodeableConceptOrBuilder getCodeOrBuilder();

  /**
   * <pre>
   * Business identifier for this ObservationDefinition instance
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Identifier identifier = 12;</code>
   */
  java.util.List<com.google.fhir.r4.core.Identifier> 
      getIdentifierList();
  /**
   * <pre>
   * Business identifier for this ObservationDefinition instance
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Identifier identifier = 12;</code>
   */
  com.google.fhir.r4.core.Identifier getIdentifier(int index);
  /**
   * <pre>
   * Business identifier for this ObservationDefinition instance
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Identifier identifier = 12;</code>
   */
  int getIdentifierCount();
  /**
   * <pre>
   * Business identifier for this ObservationDefinition instance
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Identifier identifier = 12;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.IdentifierOrBuilder> 
      getIdentifierOrBuilderList();
  /**
   * <pre>
   * Business identifier for this ObservationDefinition instance
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Identifier identifier = 12;</code>
   */
  com.google.fhir.r4.core.IdentifierOrBuilder getIdentifierOrBuilder(
      int index);

  /**
   * <code>repeated .google.fhir.r4.core.ObservationDefinition.PermittedDataTypeCode permitted_data_type = 13;</code>
   */
  java.util.List<com.google.fhir.r4.core.ObservationDefinition.PermittedDataTypeCode> 
      getPermittedDataTypeList();
  /**
   * <code>repeated .google.fhir.r4.core.ObservationDefinition.PermittedDataTypeCode permitted_data_type = 13;</code>
   */
  com.google.fhir.r4.core.ObservationDefinition.PermittedDataTypeCode getPermittedDataType(int index);
  /**
   * <code>repeated .google.fhir.r4.core.ObservationDefinition.PermittedDataTypeCode permitted_data_type = 13;</code>
   */
  int getPermittedDataTypeCount();
  /**
   * <code>repeated .google.fhir.r4.core.ObservationDefinition.PermittedDataTypeCode permitted_data_type = 13;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.ObservationDefinition.PermittedDataTypeCodeOrBuilder> 
      getPermittedDataTypeOrBuilderList();
  /**
   * <code>repeated .google.fhir.r4.core.ObservationDefinition.PermittedDataTypeCode permitted_data_type = 13;</code>
   */
  com.google.fhir.r4.core.ObservationDefinition.PermittedDataTypeCodeOrBuilder getPermittedDataTypeOrBuilder(
      int index);

  /**
   * <pre>
   * Multiple results allowed
   * </pre>
   *
   * <code>.google.fhir.r4.core.Boolean multiple_results_allowed = 14;</code>
   * @return Whether the multipleResultsAllowed field is set.
   */
  boolean hasMultipleResultsAllowed();
  /**
   * <pre>
   * Multiple results allowed
   * </pre>
   *
   * <code>.google.fhir.r4.core.Boolean multiple_results_allowed = 14;</code>
   * @return The multipleResultsAllowed.
   */
  com.google.fhir.r4.core.Boolean getMultipleResultsAllowed();
  /**
   * <pre>
   * Multiple results allowed
   * </pre>
   *
   * <code>.google.fhir.r4.core.Boolean multiple_results_allowed = 14;</code>
   */
  com.google.fhir.r4.core.BooleanOrBuilder getMultipleResultsAllowedOrBuilder();

  /**
   * <pre>
   * Method used to produce the observation
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept method = 15;</code>
   * @return Whether the method field is set.
   */
  boolean hasMethod();
  /**
   * <pre>
   * Method used to produce the observation
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept method = 15;</code>
   * @return The method.
   */
  com.google.fhir.r4.core.CodeableConcept getMethod();
  /**
   * <pre>
   * Method used to produce the observation
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept method = 15;</code>
   */
  com.google.fhir.r4.core.CodeableConceptOrBuilder getMethodOrBuilder();

  /**
   * <pre>
   * Preferred report name
   * </pre>
   *
   * <code>.google.fhir.r4.core.String preferred_report_name = 16;</code>
   * @return Whether the preferredReportName field is set.
   */
  boolean hasPreferredReportName();
  /**
   * <pre>
   * Preferred report name
   * </pre>
   *
   * <code>.google.fhir.r4.core.String preferred_report_name = 16;</code>
   * @return The preferredReportName.
   */
  com.google.fhir.r4.core.String getPreferredReportName();
  /**
   * <pre>
   * Preferred report name
   * </pre>
   *
   * <code>.google.fhir.r4.core.String preferred_report_name = 16;</code>
   */
  com.google.fhir.r4.core.StringOrBuilder getPreferredReportNameOrBuilder();

  /**
   * <code>.google.fhir.r4.core.ObservationDefinition.QuantitativeDetails quantitative_details = 17;</code>
   * @return Whether the quantitativeDetails field is set.
   */
  boolean hasQuantitativeDetails();
  /**
   * <code>.google.fhir.r4.core.ObservationDefinition.QuantitativeDetails quantitative_details = 17;</code>
   * @return The quantitativeDetails.
   */
  com.google.fhir.r4.core.ObservationDefinition.QuantitativeDetails getQuantitativeDetails();
  /**
   * <code>.google.fhir.r4.core.ObservationDefinition.QuantitativeDetails quantitative_details = 17;</code>
   */
  com.google.fhir.r4.core.ObservationDefinition.QuantitativeDetailsOrBuilder getQuantitativeDetailsOrBuilder();

  /**
   * <code>repeated .google.fhir.r4.core.ObservationDefinition.QualifiedInterval qualified_interval = 18;</code>
   */
  java.util.List<com.google.fhir.r4.core.ObservationDefinition.QualifiedInterval> 
      getQualifiedIntervalList();
  /**
   * <code>repeated .google.fhir.r4.core.ObservationDefinition.QualifiedInterval qualified_interval = 18;</code>
   */
  com.google.fhir.r4.core.ObservationDefinition.QualifiedInterval getQualifiedInterval(int index);
  /**
   * <code>repeated .google.fhir.r4.core.ObservationDefinition.QualifiedInterval qualified_interval = 18;</code>
   */
  int getQualifiedIntervalCount();
  /**
   * <code>repeated .google.fhir.r4.core.ObservationDefinition.QualifiedInterval qualified_interval = 18;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.ObservationDefinition.QualifiedIntervalOrBuilder> 
      getQualifiedIntervalOrBuilderList();
  /**
   * <code>repeated .google.fhir.r4.core.ObservationDefinition.QualifiedInterval qualified_interval = 18;</code>
   */
  com.google.fhir.r4.core.ObservationDefinition.QualifiedIntervalOrBuilder getQualifiedIntervalOrBuilder(
      int index);

  /**
   * <pre>
   * Value set of valid coded values for the observations conforming to this
   * ObservationDefinition
   * </pre>
   *
   * <code>.google.fhir.r4.core.Reference valid_coded_value_set = 19 [(.google.fhir.proto.valid_reference_type) = "ValueSet"];</code>
   * @return Whether the validCodedValueSet field is set.
   */
  boolean hasValidCodedValueSet();
  /**
   * <pre>
   * Value set of valid coded values for the observations conforming to this
   * ObservationDefinition
   * </pre>
   *
   * <code>.google.fhir.r4.core.Reference valid_coded_value_set = 19 [(.google.fhir.proto.valid_reference_type) = "ValueSet"];</code>
   * @return The validCodedValueSet.
   */
  com.google.fhir.r4.core.Reference getValidCodedValueSet();
  /**
   * <pre>
   * Value set of valid coded values for the observations conforming to this
   * ObservationDefinition
   * </pre>
   *
   * <code>.google.fhir.r4.core.Reference valid_coded_value_set = 19 [(.google.fhir.proto.valid_reference_type) = "ValueSet"];</code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getValidCodedValueSetOrBuilder();

  /**
   * <pre>
   * Value set of normal coded values for the observations conforming to this
   * ObservationDefinition
   * </pre>
   *
   * <code>.google.fhir.r4.core.Reference normal_coded_value_set = 20 [(.google.fhir.proto.valid_reference_type) = "ValueSet"];</code>
   * @return Whether the normalCodedValueSet field is set.
   */
  boolean hasNormalCodedValueSet();
  /**
   * <pre>
   * Value set of normal coded values for the observations conforming to this
   * ObservationDefinition
   * </pre>
   *
   * <code>.google.fhir.r4.core.Reference normal_coded_value_set = 20 [(.google.fhir.proto.valid_reference_type) = "ValueSet"];</code>
   * @return The normalCodedValueSet.
   */
  com.google.fhir.r4.core.Reference getNormalCodedValueSet();
  /**
   * <pre>
   * Value set of normal coded values for the observations conforming to this
   * ObservationDefinition
   * </pre>
   *
   * <code>.google.fhir.r4.core.Reference normal_coded_value_set = 20 [(.google.fhir.proto.valid_reference_type) = "ValueSet"];</code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getNormalCodedValueSetOrBuilder();

  /**
   * <pre>
   * Value set of abnormal coded values for the observations conforming to this
   * ObservationDefinition
   * </pre>
   *
   * <code>.google.fhir.r4.core.Reference abnormal_coded_value_set = 21 [(.google.fhir.proto.valid_reference_type) = "ValueSet"];</code>
   * @return Whether the abnormalCodedValueSet field is set.
   */
  boolean hasAbnormalCodedValueSet();
  /**
   * <pre>
   * Value set of abnormal coded values for the observations conforming to this
   * ObservationDefinition
   * </pre>
   *
   * <code>.google.fhir.r4.core.Reference abnormal_coded_value_set = 21 [(.google.fhir.proto.valid_reference_type) = "ValueSet"];</code>
   * @return The abnormalCodedValueSet.
   */
  com.google.fhir.r4.core.Reference getAbnormalCodedValueSet();
  /**
   * <pre>
   * Value set of abnormal coded values for the observations conforming to this
   * ObservationDefinition
   * </pre>
   *
   * <code>.google.fhir.r4.core.Reference abnormal_coded_value_set = 21 [(.google.fhir.proto.valid_reference_type) = "ValueSet"];</code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getAbnormalCodedValueSetOrBuilder();

  /**
   * <pre>
   * Value set of critical coded values for the observations conforming to this
   * ObservationDefinition
   * </pre>
   *
   * <code>.google.fhir.r4.core.Reference critical_coded_value_set = 22 [(.google.fhir.proto.valid_reference_type) = "ValueSet"];</code>
   * @return Whether the criticalCodedValueSet field is set.
   */
  boolean hasCriticalCodedValueSet();
  /**
   * <pre>
   * Value set of critical coded values for the observations conforming to this
   * ObservationDefinition
   * </pre>
   *
   * <code>.google.fhir.r4.core.Reference critical_coded_value_set = 22 [(.google.fhir.proto.valid_reference_type) = "ValueSet"];</code>
   * @return The criticalCodedValueSet.
   */
  com.google.fhir.r4.core.Reference getCriticalCodedValueSet();
  /**
   * <pre>
   * Value set of critical coded values for the observations conforming to this
   * ObservationDefinition
   * </pre>
   *
   * <code>.google.fhir.r4.core.Reference critical_coded_value_set = 22 [(.google.fhir.proto.valid_reference_type) = "ValueSet"];</code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getCriticalCodedValueSetOrBuilder();
}
