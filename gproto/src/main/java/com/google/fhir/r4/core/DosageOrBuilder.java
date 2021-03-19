// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/google/fhir/proto/r4/core/datatypes.proto

package com.google.fhir.r4.core;

public interface DosageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.fhir.r4.core.Dosage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Unique id for inter-element referencing
   * </pre>
   *
   * <code>.google.fhir.r4.core.String id = 1;</code>
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   * <pre>
   * Unique id for inter-element referencing
   * </pre>
   *
   * <code>.google.fhir.r4.core.String id = 1;</code>
   * @return The id.
   */
  com.google.fhir.r4.core.String getId();
  /**
   * <pre>
   * Unique id for inter-element referencing
   * </pre>
   *
   * <code>.google.fhir.r4.core.String id = 1;</code>
   */
  com.google.fhir.r4.core.StringOrBuilder getIdOrBuilder();

  /**
   * <pre>
   * Additional content defined by implementations
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Extension extension = 2;</code>
   */
  java.util.List<com.google.fhir.r4.core.Extension> 
      getExtensionList();
  /**
   * <pre>
   * Additional content defined by implementations
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Extension extension = 2;</code>
   */
  com.google.fhir.r4.core.Extension getExtension(int index);
  /**
   * <pre>
   * Additional content defined by implementations
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Extension extension = 2;</code>
   */
  int getExtensionCount();
  /**
   * <pre>
   * Additional content defined by implementations
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Extension extension = 2;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.ExtensionOrBuilder> 
      getExtensionOrBuilderList();
  /**
   * <pre>
   * Additional content defined by implementations
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Extension extension = 2;</code>
   */
  com.google.fhir.r4.core.ExtensionOrBuilder getExtensionOrBuilder(
      int index);

  /**
   * <pre>
   * Extensions that cannot be ignored even if unrecognized
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Extension modifier_extension = 3;</code>
   */
  java.util.List<com.google.fhir.r4.core.Extension> 
      getModifierExtensionList();
  /**
   * <pre>
   * Extensions that cannot be ignored even if unrecognized
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Extension modifier_extension = 3;</code>
   */
  com.google.fhir.r4.core.Extension getModifierExtension(int index);
  /**
   * <pre>
   * Extensions that cannot be ignored even if unrecognized
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Extension modifier_extension = 3;</code>
   */
  int getModifierExtensionCount();
  /**
   * <pre>
   * Extensions that cannot be ignored even if unrecognized
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Extension modifier_extension = 3;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.ExtensionOrBuilder> 
      getModifierExtensionOrBuilderList();
  /**
   * <pre>
   * Extensions that cannot be ignored even if unrecognized
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Extension modifier_extension = 3;</code>
   */
  com.google.fhir.r4.core.ExtensionOrBuilder getModifierExtensionOrBuilder(
      int index);

  /**
   * <pre>
   * The order of the dosage instructions
   * </pre>
   *
   * <code>.google.fhir.r4.core.Integer sequence = 4;</code>
   * @return Whether the sequence field is set.
   */
  boolean hasSequence();
  /**
   * <pre>
   * The order of the dosage instructions
   * </pre>
   *
   * <code>.google.fhir.r4.core.Integer sequence = 4;</code>
   * @return The sequence.
   */
  com.google.fhir.r4.core.Integer getSequence();
  /**
   * <pre>
   * The order of the dosage instructions
   * </pre>
   *
   * <code>.google.fhir.r4.core.Integer sequence = 4;</code>
   */
  com.google.fhir.r4.core.IntegerOrBuilder getSequenceOrBuilder();

  /**
   * <pre>
   * Free text dosage instructions e.g. SIG
   * </pre>
   *
   * <code>.google.fhir.r4.core.String text = 5;</code>
   * @return Whether the text field is set.
   */
  boolean hasText();
  /**
   * <pre>
   * Free text dosage instructions e.g. SIG
   * </pre>
   *
   * <code>.google.fhir.r4.core.String text = 5;</code>
   * @return The text.
   */
  com.google.fhir.r4.core.String getText();
  /**
   * <pre>
   * Free text dosage instructions e.g. SIG
   * </pre>
   *
   * <code>.google.fhir.r4.core.String text = 5;</code>
   */
  com.google.fhir.r4.core.StringOrBuilder getTextOrBuilder();

  /**
   * <pre>
   * Supplemental instruction or warnings to the patient - e.g. "with meals",
   * "may cause drowsiness"
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept additional_instruction = 6;</code>
   */
  java.util.List<com.google.fhir.r4.core.CodeableConcept> 
      getAdditionalInstructionList();
  /**
   * <pre>
   * Supplemental instruction or warnings to the patient - e.g. "with meals",
   * "may cause drowsiness"
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept additional_instruction = 6;</code>
   */
  com.google.fhir.r4.core.CodeableConcept getAdditionalInstruction(int index);
  /**
   * <pre>
   * Supplemental instruction or warnings to the patient - e.g. "with meals",
   * "may cause drowsiness"
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept additional_instruction = 6;</code>
   */
  int getAdditionalInstructionCount();
  /**
   * <pre>
   * Supplemental instruction or warnings to the patient - e.g. "with meals",
   * "may cause drowsiness"
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept additional_instruction = 6;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.CodeableConceptOrBuilder> 
      getAdditionalInstructionOrBuilderList();
  /**
   * <pre>
   * Supplemental instruction or warnings to the patient - e.g. "with meals",
   * "may cause drowsiness"
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.CodeableConcept additional_instruction = 6;</code>
   */
  com.google.fhir.r4.core.CodeableConceptOrBuilder getAdditionalInstructionOrBuilder(
      int index);

  /**
   * <pre>
   * Patient or consumer oriented instructions
   * </pre>
   *
   * <code>.google.fhir.r4.core.String patient_instruction = 7;</code>
   * @return Whether the patientInstruction field is set.
   */
  boolean hasPatientInstruction();
  /**
   * <pre>
   * Patient or consumer oriented instructions
   * </pre>
   *
   * <code>.google.fhir.r4.core.String patient_instruction = 7;</code>
   * @return The patientInstruction.
   */
  com.google.fhir.r4.core.String getPatientInstruction();
  /**
   * <pre>
   * Patient or consumer oriented instructions
   * </pre>
   *
   * <code>.google.fhir.r4.core.String patient_instruction = 7;</code>
   */
  com.google.fhir.r4.core.StringOrBuilder getPatientInstructionOrBuilder();

  /**
   * <pre>
   * When medication should be administered
   * </pre>
   *
   * <code>.google.fhir.r4.core.Timing timing = 8;</code>
   * @return Whether the timing field is set.
   */
  boolean hasTiming();
  /**
   * <pre>
   * When medication should be administered
   * </pre>
   *
   * <code>.google.fhir.r4.core.Timing timing = 8;</code>
   * @return The timing.
   */
  com.google.fhir.r4.core.Timing getTiming();
  /**
   * <pre>
   * When medication should be administered
   * </pre>
   *
   * <code>.google.fhir.r4.core.Timing timing = 8;</code>
   */
  com.google.fhir.r4.core.TimingOrBuilder getTimingOrBuilder();

  /**
   * <code>.google.fhir.r4.core.Dosage.AsNeededX as_needed = 9;</code>
   * @return Whether the asNeeded field is set.
   */
  boolean hasAsNeeded();
  /**
   * <code>.google.fhir.r4.core.Dosage.AsNeededX as_needed = 9;</code>
   * @return The asNeeded.
   */
  com.google.fhir.r4.core.Dosage.AsNeededX getAsNeeded();
  /**
   * <code>.google.fhir.r4.core.Dosage.AsNeededX as_needed = 9;</code>
   */
  com.google.fhir.r4.core.Dosage.AsNeededXOrBuilder getAsNeededOrBuilder();

  /**
   * <pre>
   * Body site to administer to
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept site = 10;</code>
   * @return Whether the site field is set.
   */
  boolean hasSite();
  /**
   * <pre>
   * Body site to administer to
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept site = 10;</code>
   * @return The site.
   */
  com.google.fhir.r4.core.CodeableConcept getSite();
  /**
   * <pre>
   * Body site to administer to
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept site = 10;</code>
   */
  com.google.fhir.r4.core.CodeableConceptOrBuilder getSiteOrBuilder();

  /**
   * <pre>
   * How drug should enter body
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept route = 11;</code>
   * @return Whether the route field is set.
   */
  boolean hasRoute();
  /**
   * <pre>
   * How drug should enter body
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept route = 11;</code>
   * @return The route.
   */
  com.google.fhir.r4.core.CodeableConcept getRoute();
  /**
   * <pre>
   * How drug should enter body
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept route = 11;</code>
   */
  com.google.fhir.r4.core.CodeableConceptOrBuilder getRouteOrBuilder();

  /**
   * <pre>
   * Technique for administering medication
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept method = 12;</code>
   * @return Whether the method field is set.
   */
  boolean hasMethod();
  /**
   * <pre>
   * Technique for administering medication
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept method = 12;</code>
   * @return The method.
   */
  com.google.fhir.r4.core.CodeableConcept getMethod();
  /**
   * <pre>
   * Technique for administering medication
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept method = 12;</code>
   */
  com.google.fhir.r4.core.CodeableConceptOrBuilder getMethodOrBuilder();

  /**
   * <code>repeated .google.fhir.r4.core.Dosage.DoseAndRate dose_and_rate = 13;</code>
   */
  java.util.List<com.google.fhir.r4.core.Dosage.DoseAndRate> 
      getDoseAndRateList();
  /**
   * <code>repeated .google.fhir.r4.core.Dosage.DoseAndRate dose_and_rate = 13;</code>
   */
  com.google.fhir.r4.core.Dosage.DoseAndRate getDoseAndRate(int index);
  /**
   * <code>repeated .google.fhir.r4.core.Dosage.DoseAndRate dose_and_rate = 13;</code>
   */
  int getDoseAndRateCount();
  /**
   * <code>repeated .google.fhir.r4.core.Dosage.DoseAndRate dose_and_rate = 13;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.Dosage.DoseAndRateOrBuilder> 
      getDoseAndRateOrBuilderList();
  /**
   * <code>repeated .google.fhir.r4.core.Dosage.DoseAndRate dose_and_rate = 13;</code>
   */
  com.google.fhir.r4.core.Dosage.DoseAndRateOrBuilder getDoseAndRateOrBuilder(
      int index);

  /**
   * <pre>
   * Upper limit on medication per unit of time
   * </pre>
   *
   * <code>.google.fhir.r4.core.Ratio max_dose_per_period = 14;</code>
   * @return Whether the maxDosePerPeriod field is set.
   */
  boolean hasMaxDosePerPeriod();
  /**
   * <pre>
   * Upper limit on medication per unit of time
   * </pre>
   *
   * <code>.google.fhir.r4.core.Ratio max_dose_per_period = 14;</code>
   * @return The maxDosePerPeriod.
   */
  com.google.fhir.r4.core.Ratio getMaxDosePerPeriod();
  /**
   * <pre>
   * Upper limit on medication per unit of time
   * </pre>
   *
   * <code>.google.fhir.r4.core.Ratio max_dose_per_period = 14;</code>
   */
  com.google.fhir.r4.core.RatioOrBuilder getMaxDosePerPeriodOrBuilder();

  /**
   * <pre>
   * Upper limit on medication per administration
   * </pre>
   *
   * <code>.google.fhir.r4.core.SimpleQuantity max_dose_per_administration = 15;</code>
   * @return Whether the maxDosePerAdministration field is set.
   */
  boolean hasMaxDosePerAdministration();
  /**
   * <pre>
   * Upper limit on medication per administration
   * </pre>
   *
   * <code>.google.fhir.r4.core.SimpleQuantity max_dose_per_administration = 15;</code>
   * @return The maxDosePerAdministration.
   */
  com.google.fhir.r4.core.SimpleQuantity getMaxDosePerAdministration();
  /**
   * <pre>
   * Upper limit on medication per administration
   * </pre>
   *
   * <code>.google.fhir.r4.core.SimpleQuantity max_dose_per_administration = 15;</code>
   */
  com.google.fhir.r4.core.SimpleQuantityOrBuilder getMaxDosePerAdministrationOrBuilder();

  /**
   * <pre>
   * Upper limit on medication per lifetime of the patient
   * </pre>
   *
   * <code>.google.fhir.r4.core.SimpleQuantity max_dose_per_lifetime = 16;</code>
   * @return Whether the maxDosePerLifetime field is set.
   */
  boolean hasMaxDosePerLifetime();
  /**
   * <pre>
   * Upper limit on medication per lifetime of the patient
   * </pre>
   *
   * <code>.google.fhir.r4.core.SimpleQuantity max_dose_per_lifetime = 16;</code>
   * @return The maxDosePerLifetime.
   */
  com.google.fhir.r4.core.SimpleQuantity getMaxDosePerLifetime();
  /**
   * <pre>
   * Upper limit on medication per lifetime of the patient
   * </pre>
   *
   * <code>.google.fhir.r4.core.SimpleQuantity max_dose_per_lifetime = 16;</code>
   */
  com.google.fhir.r4.core.SimpleQuantityOrBuilder getMaxDosePerLifetimeOrBuilder();
}
