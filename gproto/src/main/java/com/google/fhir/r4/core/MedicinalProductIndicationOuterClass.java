// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/google/fhir/proto/r4/core/resources/medicinal_product_indication.proto

package com.google.fhir.r4.core;

public final class MedicinalProductIndicationOuterClass {
  private MedicinalProductIndicationOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_fhir_r4_core_MedicinalProductIndication_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_MedicinalProductIndication_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_fhir_r4_core_MedicinalProductIndication_OtherTherapy_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_MedicinalProductIndication_OtherTherapy_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_fhir_r4_core_MedicinalProductIndication_OtherTherapy_MedicationX_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_MedicinalProductIndication_OtherTherapy_MedicationX_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nLproto/google/fhir/proto/r4/core/resour" +
      "ces/medicinal_product_indication.proto\022\023" +
      "google.fhir.r4.core\032\031google/protobuf/any" +
      ".proto\032)proto/google/fhir/proto/annotati" +
      "ons.proto\032/proto/google/fhir/proto/r4/co" +
      "re/datatypes.proto\"\342\r\n\032MedicinalProductI" +
      "ndication\022#\n\002id\030\001 \001(\0132\027.google.fhir.r4.c" +
      "ore.Id\022\'\n\004meta\030\002 \001(\0132\031.google.fhir.r4.co" +
      "re.Meta\0220\n\016implicit_rules\030\003 \001(\0132\030.google" +
      ".fhir.r4.core.Uri\022+\n\010language\030\004 \001(\0132\031.go" +
      "ogle.fhir.r4.core.Code\022,\n\004text\030\005 \001(\0132\036.g" +
      "oogle.fhir.r4.core.Narrative\022\'\n\tcontaine" +
      "d\030\006 \003(\0132\024.google.protobuf.Any\0221\n\textensi" +
      "on\030\010 \003(\0132\036.google.fhir.r4.core.Extension" +
      "\022:\n\022modifier_extension\030\t \003(\0132\036.google.fh" +
      "ir.r4.core.Extension\022W\n\007subject\030\n \003(\0132\036." +
      "google.fhir.r4.core.ReferenceB&\362\377\374\302\006\020Med" +
      "icinalProduct\362\377\374\302\006\nMedication\022G\n\031disease" +
      "_symptom_procedure\030\013 \001(\0132$.google.fhir.r" +
      "4.core.CodeableConcept\022<\n\016disease_status" +
      "\030\014 \001(\0132$.google.fhir.r4.core.CodeableCon" +
      "cept\0229\n\013comorbidity\030\r \003(\0132$.google.fhir." +
      "r4.core.CodeableConcept\022=\n\017intended_effe" +
      "ct\030\016 \001(\0132$.google.fhir.r4.core.CodeableC" +
      "oncept\022/\n\010duration\030\017 \001(\0132\035.google.fhir.r" +
      "4.core.Quantity\022S\n\rother_therapy\030\020 \003(\0132<" +
      ".google.fhir.r4.core.MedicinalProductInd" +
      "ication.OtherTherapy\022c\n\022undesirable_effe" +
      "ct\030\021 \003(\0132\036.google.fhir.r4.core.Reference" +
      "B\'\362\377\374\302\006!MedicinalProductUndesirableEffec" +
      "t\0223\n\npopulation\030\022 \003(\0132\037.google.fhir.r4.c" +
      "ore.Population\032\312\004\n\014OtherTherapy\022\'\n\002id\030\001 " +
      "\001(\0132\033.google.fhir.r4.core.String\0221\n\texte" +
      "nsion\030\002 \003(\0132\036.google.fhir.r4.core.Extens" +
      "ion\022:\n\022modifier_extension\030\003 \003(\0132\036.google" +
      ".fhir.r4.core.Extension\022O\n\031therapy_relat" +
      "ionship_type\030\004 \001(\0132$.google.fhir.r4.core" +
      ".CodeableConceptB\006\360\320\207\353\004\001\022d\n\nmedication\030\005" +
      " \001(\0132H.google.fhir.r4.core.MedicinalProd" +
      "uctIndication.OtherTherapy.MedicationXB\006" +
      "\360\320\207\353\004\001\032\352\001\n\013MedicationX\022@\n\020codeable_conce" +
      "pt\030\001 \001(\0132$.google.fhir.r4.core.CodeableC" +
      "onceptH\000\022\206\001\n\treference\030\002 \001(\0132\036.google.fh" +
      "ir.r4.core.ReferenceBQ\362\377\374\302\006\020MedicinalPro" +
      "duct\362\377\374\302\006\nMedication\362\377\374\302\006\tSubstance\362\377\374\302\006" +
      "\026SubstanceSpecificationH\000:\006\240\203\203\350\006\001B\010\n\006cho" +
      "ice:\203\001\300\237\343\266\005\003\262\376\344\227\006Bhttp://hl7.org/fhir/St" +
      "ructureDefinition/MedicinalProductIndica" +
      "tion\262\365\365\327\t/\n\007subject\020\005\032\"MedicinalProductI" +
      "ndication.subjectJ\004\010\007\020\010B!\n\027com.google.fh" +
      "ir.r4.coreP\001\230\306\260\265\007\004b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.AnyProto.getDescriptor(),
          com.google.fhir.proto.Annotations.getDescriptor(),
          com.google.fhir.r4.core.Datatypes.getDescriptor(),
        });
    internal_static_google_fhir_r4_core_MedicinalProductIndication_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_fhir_r4_core_MedicinalProductIndication_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_fhir_r4_core_MedicinalProductIndication_descriptor,
        new java.lang.String[] { "Id", "Meta", "ImplicitRules", "Language", "Text", "Contained", "Extension", "ModifierExtension", "Subject", "DiseaseSymptomProcedure", "DiseaseStatus", "Comorbidity", "IntendedEffect", "Duration", "OtherTherapy", "UndesirableEffect", "Population", });
    internal_static_google_fhir_r4_core_MedicinalProductIndication_OtherTherapy_descriptor =
      internal_static_google_fhir_r4_core_MedicinalProductIndication_descriptor.getNestedTypes().get(0);
    internal_static_google_fhir_r4_core_MedicinalProductIndication_OtherTherapy_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_fhir_r4_core_MedicinalProductIndication_OtherTherapy_descriptor,
        new java.lang.String[] { "Id", "Extension", "ModifierExtension", "TherapyRelationshipType", "Medication", });
    internal_static_google_fhir_r4_core_MedicinalProductIndication_OtherTherapy_MedicationX_descriptor =
      internal_static_google_fhir_r4_core_MedicinalProductIndication_OtherTherapy_descriptor.getNestedTypes().get(0);
    internal_static_google_fhir_r4_core_MedicinalProductIndication_OtherTherapy_MedicationX_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_fhir_r4_core_MedicinalProductIndication_OtherTherapy_MedicationX_descriptor,
        new java.lang.String[] { "CodeableConcept", "Reference", "Choice", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.fhir.proto.Annotations.fhirStructureDefinitionUrl);
    registry.add(com.google.fhir.proto.Annotations.fhirVersion);
    registry.add(com.google.fhir.proto.Annotations.isChoiceType);
    registry.add(com.google.fhir.proto.Annotations.searchParameter);
    registry.add(com.google.fhir.proto.Annotations.structureDefinitionKind);
    registry.add(com.google.fhir.proto.Annotations.validReferenceType);
    registry.add(com.google.fhir.proto.Annotations.validationRequirement);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.protobuf.AnyProto.getDescriptor();
    com.google.fhir.proto.Annotations.getDescriptor();
    com.google.fhir.r4.core.Datatypes.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
