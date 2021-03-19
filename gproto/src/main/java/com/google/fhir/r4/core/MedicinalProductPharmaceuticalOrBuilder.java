// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/google/fhir/proto/r4/core/resources/medicinal_product_pharmaceutical.proto

package com.google.fhir.r4.core;

public interface MedicinalProductPharmaceuticalOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.fhir.r4.core.MedicinalProductPharmaceutical)
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
   * An identifier for the pharmaceutical medicinal product
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Identifier identifier = 10;</code>
   */
  java.util.List<com.google.fhir.r4.core.Identifier> 
      getIdentifierList();
  /**
   * <pre>
   * An identifier for the pharmaceutical medicinal product
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Identifier identifier = 10;</code>
   */
  com.google.fhir.r4.core.Identifier getIdentifier(int index);
  /**
   * <pre>
   * An identifier for the pharmaceutical medicinal product
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Identifier identifier = 10;</code>
   */
  int getIdentifierCount();
  /**
   * <pre>
   * An identifier for the pharmaceutical medicinal product
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Identifier identifier = 10;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.IdentifierOrBuilder> 
      getIdentifierOrBuilderList();
  /**
   * <pre>
   * An identifier for the pharmaceutical medicinal product
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Identifier identifier = 10;</code>
   */
  com.google.fhir.r4.core.IdentifierOrBuilder getIdentifierOrBuilder(
      int index);

  /**
   * <pre>
   * The administrable dose form, after necessary reconstitution
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept administrable_dose_form = 11 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   * @return Whether the administrableDoseForm field is set.
   */
  boolean hasAdministrableDoseForm();
  /**
   * <pre>
   * The administrable dose form, after necessary reconstitution
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept administrable_dose_form = 11 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   * @return The administrableDoseForm.
   */
  com.google.fhir.r4.core.CodeableConcept getAdministrableDoseForm();
  /**
   * <pre>
   * The administrable dose form, after necessary reconstitution
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept administrable_dose_form = 11 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   */
  com.google.fhir.r4.core.CodeableConceptOrBuilder getAdministrableDoseFormOrBuilder();

  /**
   * <pre>
   * Todo
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept unit_of_presentation = 12;</code>
   * @return Whether the unitOfPresentation field is set.
   */
  boolean hasUnitOfPresentation();
  /**
   * <pre>
   * Todo
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept unit_of_presentation = 12;</code>
   * @return The unitOfPresentation.
   */
  com.google.fhir.r4.core.CodeableConcept getUnitOfPresentation();
  /**
   * <pre>
   * Todo
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept unit_of_presentation = 12;</code>
   */
  com.google.fhir.r4.core.CodeableConceptOrBuilder getUnitOfPresentationOrBuilder();

  /**
   * <pre>
   * Ingredient
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Reference ingredient = 13 [(.google.fhir.proto.valid_reference_type) = "MedicinalProductIngredient"];</code>
   */
  java.util.List<com.google.fhir.r4.core.Reference> 
      getIngredientList();
  /**
   * <pre>
   * Ingredient
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Reference ingredient = 13 [(.google.fhir.proto.valid_reference_type) = "MedicinalProductIngredient"];</code>
   */
  com.google.fhir.r4.core.Reference getIngredient(int index);
  /**
   * <pre>
   * Ingredient
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Reference ingredient = 13 [(.google.fhir.proto.valid_reference_type) = "MedicinalProductIngredient"];</code>
   */
  int getIngredientCount();
  /**
   * <pre>
   * Ingredient
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Reference ingredient = 13 [(.google.fhir.proto.valid_reference_type) = "MedicinalProductIngredient"];</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.ReferenceOrBuilder> 
      getIngredientOrBuilderList();
  /**
   * <pre>
   * Ingredient
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Reference ingredient = 13 [(.google.fhir.proto.valid_reference_type) = "MedicinalProductIngredient"];</code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getIngredientOrBuilder(
      int index);

  /**
   * <pre>
   * Accompanying device
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Reference device = 14 [(.google.fhir.proto.valid_reference_type) = "DeviceDefinition"];</code>
   */
  java.util.List<com.google.fhir.r4.core.Reference> 
      getDeviceList();
  /**
   * <pre>
   * Accompanying device
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Reference device = 14 [(.google.fhir.proto.valid_reference_type) = "DeviceDefinition"];</code>
   */
  com.google.fhir.r4.core.Reference getDevice(int index);
  /**
   * <pre>
   * Accompanying device
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Reference device = 14 [(.google.fhir.proto.valid_reference_type) = "DeviceDefinition"];</code>
   */
  int getDeviceCount();
  /**
   * <pre>
   * Accompanying device
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Reference device = 14 [(.google.fhir.proto.valid_reference_type) = "DeviceDefinition"];</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.ReferenceOrBuilder> 
      getDeviceOrBuilderList();
  /**
   * <pre>
   * Accompanying device
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Reference device = 14 [(.google.fhir.proto.valid_reference_type) = "DeviceDefinition"];</code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getDeviceOrBuilder(
      int index);

  /**
   * <code>repeated .google.fhir.r4.core.MedicinalProductPharmaceutical.Characteristics characteristics = 15;</code>
   */
  java.util.List<com.google.fhir.r4.core.MedicinalProductPharmaceutical.Characteristics> 
      getCharacteristicsList();
  /**
   * <code>repeated .google.fhir.r4.core.MedicinalProductPharmaceutical.Characteristics characteristics = 15;</code>
   */
  com.google.fhir.r4.core.MedicinalProductPharmaceutical.Characteristics getCharacteristics(int index);
  /**
   * <code>repeated .google.fhir.r4.core.MedicinalProductPharmaceutical.Characteristics characteristics = 15;</code>
   */
  int getCharacteristicsCount();
  /**
   * <code>repeated .google.fhir.r4.core.MedicinalProductPharmaceutical.Characteristics characteristics = 15;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.MedicinalProductPharmaceutical.CharacteristicsOrBuilder> 
      getCharacteristicsOrBuilderList();
  /**
   * <code>repeated .google.fhir.r4.core.MedicinalProductPharmaceutical.Characteristics characteristics = 15;</code>
   */
  com.google.fhir.r4.core.MedicinalProductPharmaceutical.CharacteristicsOrBuilder getCharacteristicsOrBuilder(
      int index);

  /**
   * <code>repeated .google.fhir.r4.core.MedicinalProductPharmaceutical.RouteOfAdministration route_of_administration = 16 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   */
  java.util.List<com.google.fhir.r4.core.MedicinalProductPharmaceutical.RouteOfAdministration> 
      getRouteOfAdministrationList();
  /**
   * <code>repeated .google.fhir.r4.core.MedicinalProductPharmaceutical.RouteOfAdministration route_of_administration = 16 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   */
  com.google.fhir.r4.core.MedicinalProductPharmaceutical.RouteOfAdministration getRouteOfAdministration(int index);
  /**
   * <code>repeated .google.fhir.r4.core.MedicinalProductPharmaceutical.RouteOfAdministration route_of_administration = 16 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   */
  int getRouteOfAdministrationCount();
  /**
   * <code>repeated .google.fhir.r4.core.MedicinalProductPharmaceutical.RouteOfAdministration route_of_administration = 16 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.MedicinalProductPharmaceutical.RouteOfAdministrationOrBuilder> 
      getRouteOfAdministrationOrBuilderList();
  /**
   * <code>repeated .google.fhir.r4.core.MedicinalProductPharmaceutical.RouteOfAdministration route_of_administration = 16 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   */
  com.google.fhir.r4.core.MedicinalProductPharmaceutical.RouteOfAdministrationOrBuilder getRouteOfAdministrationOrBuilder(
      int index);
}
