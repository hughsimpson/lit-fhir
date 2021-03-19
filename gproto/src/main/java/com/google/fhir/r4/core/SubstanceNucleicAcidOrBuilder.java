// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/google/fhir/proto/r4/core/resources/substance_nucleic_acid.proto

package com.google.fhir.r4.core;

public interface SubstanceNucleicAcidOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.fhir.r4.core.SubstanceNucleicAcid)
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
   * The type of the sequence shall be specified based on a controlled
   * vocabulary
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept sequence_type = 10;</code>
   * @return Whether the sequenceType field is set.
   */
  boolean hasSequenceType();
  /**
   * <pre>
   * The type of the sequence shall be specified based on a controlled
   * vocabulary
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept sequence_type = 10;</code>
   * @return The sequenceType.
   */
  com.google.fhir.r4.core.CodeableConcept getSequenceType();
  /**
   * <pre>
   * The type of the sequence shall be specified based on a controlled
   * vocabulary
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept sequence_type = 10;</code>
   */
  com.google.fhir.r4.core.CodeableConceptOrBuilder getSequenceTypeOrBuilder();

  /**
   * <pre>
   * The number of linear sequences of nucleotides linked through phosphodiester
   * bonds shall be described. Subunits would be strands of nucleic acids that
   * are tightly associated typically through Watson-Crick base pairing. NOTE:
   * If not specified in the reference source, the assumption is that there is 1
   * subunit
   * </pre>
   *
   * <code>.google.fhir.r4.core.Integer number_of_subunits = 11;</code>
   * @return Whether the numberOfSubunits field is set.
   */
  boolean hasNumberOfSubunits();
  /**
   * <pre>
   * The number of linear sequences of nucleotides linked through phosphodiester
   * bonds shall be described. Subunits would be strands of nucleic acids that
   * are tightly associated typically through Watson-Crick base pairing. NOTE:
   * If not specified in the reference source, the assumption is that there is 1
   * subunit
   * </pre>
   *
   * <code>.google.fhir.r4.core.Integer number_of_subunits = 11;</code>
   * @return The numberOfSubunits.
   */
  com.google.fhir.r4.core.Integer getNumberOfSubunits();
  /**
   * <pre>
   * The number of linear sequences of nucleotides linked through phosphodiester
   * bonds shall be described. Subunits would be strands of nucleic acids that
   * are tightly associated typically through Watson-Crick base pairing. NOTE:
   * If not specified in the reference source, the assumption is that there is 1
   * subunit
   * </pre>
   *
   * <code>.google.fhir.r4.core.Integer number_of_subunits = 11;</code>
   */
  com.google.fhir.r4.core.IntegerOrBuilder getNumberOfSubunitsOrBuilder();

  /**
   * <pre>
   * The area of hybridisation shall be described if applicable for double
   * stranded RNA or DNA. The number associated with the subunit followed by the
   * number associated to the residue shall be specified in increasing order.
   * The underscore “” shall be used as separator as follows: “Subunitnumber
   * Residue”
   * </pre>
   *
   * <code>.google.fhir.r4.core.String area_of_hybridisation = 12;</code>
   * @return Whether the areaOfHybridisation field is set.
   */
  boolean hasAreaOfHybridisation();
  /**
   * <pre>
   * The area of hybridisation shall be described if applicable for double
   * stranded RNA or DNA. The number associated with the subunit followed by the
   * number associated to the residue shall be specified in increasing order.
   * The underscore “” shall be used as separator as follows: “Subunitnumber
   * Residue”
   * </pre>
   *
   * <code>.google.fhir.r4.core.String area_of_hybridisation = 12;</code>
   * @return The areaOfHybridisation.
   */
  com.google.fhir.r4.core.String getAreaOfHybridisation();
  /**
   * <pre>
   * The area of hybridisation shall be described if applicable for double
   * stranded RNA or DNA. The number associated with the subunit followed by the
   * number associated to the residue shall be specified in increasing order.
   * The underscore “” shall be used as separator as follows: “Subunitnumber
   * Residue”
   * </pre>
   *
   * <code>.google.fhir.r4.core.String area_of_hybridisation = 12;</code>
   */
  com.google.fhir.r4.core.StringOrBuilder getAreaOfHybridisationOrBuilder();

  /**
   * <pre>
   * (TBC)
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept oligo_nucleotide_type = 13;</code>
   * @return Whether the oligoNucleotideType field is set.
   */
  boolean hasOligoNucleotideType();
  /**
   * <pre>
   * (TBC)
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept oligo_nucleotide_type = 13;</code>
   * @return The oligoNucleotideType.
   */
  com.google.fhir.r4.core.CodeableConcept getOligoNucleotideType();
  /**
   * <pre>
   * (TBC)
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept oligo_nucleotide_type = 13;</code>
   */
  com.google.fhir.r4.core.CodeableConceptOrBuilder getOligoNucleotideTypeOrBuilder();

  /**
   * <code>repeated .google.fhir.r4.core.SubstanceNucleicAcid.Subunit subunit = 14;</code>
   */
  java.util.List<com.google.fhir.r4.core.SubstanceNucleicAcid.Subunit> 
      getSubunitList();
  /**
   * <code>repeated .google.fhir.r4.core.SubstanceNucleicAcid.Subunit subunit = 14;</code>
   */
  com.google.fhir.r4.core.SubstanceNucleicAcid.Subunit getSubunit(int index);
  /**
   * <code>repeated .google.fhir.r4.core.SubstanceNucleicAcid.Subunit subunit = 14;</code>
   */
  int getSubunitCount();
  /**
   * <code>repeated .google.fhir.r4.core.SubstanceNucleicAcid.Subunit subunit = 14;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.SubstanceNucleicAcid.SubunitOrBuilder> 
      getSubunitOrBuilderList();
  /**
   * <code>repeated .google.fhir.r4.core.SubstanceNucleicAcid.Subunit subunit = 14;</code>
   */
  com.google.fhir.r4.core.SubstanceNucleicAcid.SubunitOrBuilder getSubunitOrBuilder(
      int index);
}
