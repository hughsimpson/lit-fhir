// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/google/fhir/proto/r4/core/resources/research_subject.proto

package com.google.fhir.r4.core;

public final class ResearchSubjectOuterClass {
  private ResearchSubjectOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_fhir_r4_core_ResearchSubject_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_ResearchSubject_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_fhir_r4_core_ResearchSubject_StatusCode_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_ResearchSubject_StatusCode_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n@proto/google/fhir/proto/r4/core/resour" +
      "ces/research_subject.proto\022\023google.fhir." +
      "r4.core\032\031google/protobuf/any.proto\032)prot" +
      "o/google/fhir/proto/annotations.proto\032+p" +
      "roto/google/fhir/proto/r4/core/codes.pro" +
      "to\032/proto/google/fhir/proto/r4/core/data" +
      "types.proto\"\327\013\n\017ResearchSubject\022#\n\002id\030\001 " +
      "\001(\0132\027.google.fhir.r4.core.Id\022\'\n\004meta\030\002 \001" +
      "(\0132\031.google.fhir.r4.core.Meta\0220\n\016implici" +
      "t_rules\030\003 \001(\0132\030.google.fhir.r4.core.Uri\022" +
      "+\n\010language\030\004 \001(\0132\031.google.fhir.r4.core." +
      "Code\022,\n\004text\030\005 \001(\0132\036.google.fhir.r4.core" +
      ".Narrative\022\'\n\tcontained\030\006 \003(\0132\024.google.p" +
      "rotobuf.Any\0221\n\textension\030\010 \003(\0132\036.google." +
      "fhir.r4.core.Extension\022:\n\022modifier_exten" +
      "sion\030\t \003(\0132\036.google.fhir.r4.core.Extensi" +
      "on\0223\n\nidentifier\030\n \003(\0132\037.google.fhir.r4." +
      "core.Identifier\022G\n\006status\030\013 \001(\0132/.google" +
      ".fhir.r4.core.ResearchSubject.StatusCode" +
      "B\006\360\320\207\353\004\001\022+\n\006period\030\014 \001(\0132\033.google.fhir.r" +
      "4.core.Period\022H\n\005study\030\r \001(\0132\036.google.fh" +
      "ir.r4.core.ReferenceB\031\360\320\207\353\004\001\362\377\374\302\006\rResear" +
      "chStudy\022G\n\nindividual\030\016 \001(\0132\036.google.fhi" +
      "r.r4.core.ReferenceB\023\360\320\207\353\004\001\362\377\374\302\006\007Patient" +
      "\0221\n\014assigned_arm\030\017 \001(\0132\033.google.fhir.r4." +
      "core.String\022/\n\nactual_arm\030\020 \001(\0132\033.google" +
      ".fhir.r4.core.String\022>\n\007consent\030\021 \001(\0132\036." +
      "google.fhir.r4.core.ReferenceB\r\362\377\374\302\006\007Con" +
      "sent\032\241\002\n\nStatusCode\022C\n\005value\030\001 \001(\01624.goo" +
      "gle.fhir.r4.core.ResearchSubjectStatusCo" +
      "de.Value\022\'\n\002id\030\002 \001(\0132\033.google.fhir.r4.co" +
      "re.String\0221\n\textension\030\003 \003(\0132\036.google.fh" +
      "ir.r4.core.Extension:r\300\237\343\266\005\001\212\371\203\262\0054http:/" +
      "/hl7.org/fhir/ValueSet/research-subject-" +
      "status\232\265\216\223\006,http://hl7.org/fhir/Structur" +
      "eDefinition/code:\304\002\300\237\343\266\005\003\262\376\344\227\0067http://hl" +
      "7.org/fhir/StructureDefinition/ResearchS" +
      "ubject\262\365\365\327\t \n\004date\020\002\032\026ResearchSubject.pe" +
      "riod\262\365\365\327\t*\n\nidentifier\020\004\032\032ResearchSubjec" +
      "t.identifier\262\365\365\327\t*\n\nindividual\020\005\032\032Resear" +
      "chSubject.individual\262\365\365\327\t\'\n\007patient\020\005\032\032R" +
      "esearchSubject.individual\262\365\365\327\t\"\n\006status\020" +
      "\004\032\026ResearchSubject.status\262\365\365\327\t \n\005study\020\005" +
      "\032\025ResearchSubject.studyJ\004\010\007\020\010B!\n\027com.goo" +
      "gle.fhir.r4.coreP\001\230\306\260\265\007\004b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.AnyProto.getDescriptor(),
          com.google.fhir.proto.Annotations.getDescriptor(),
          com.google.fhir.r4.core.Codes.getDescriptor(),
          com.google.fhir.r4.core.Datatypes.getDescriptor(),
        });
    internal_static_google_fhir_r4_core_ResearchSubject_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_fhir_r4_core_ResearchSubject_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_fhir_r4_core_ResearchSubject_descriptor,
        new java.lang.String[] { "Id", "Meta", "ImplicitRules", "Language", "Text", "Contained", "Extension", "ModifierExtension", "Identifier", "Status", "Period", "Study", "Individual", "AssignedArm", "ActualArm", "Consent", });
    internal_static_google_fhir_r4_core_ResearchSubject_StatusCode_descriptor =
      internal_static_google_fhir_r4_core_ResearchSubject_descriptor.getNestedTypes().get(0);
    internal_static_google_fhir_r4_core_ResearchSubject_StatusCode_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_fhir_r4_core_ResearchSubject_StatusCode_descriptor,
        new java.lang.String[] { "Value", "Id", "Extension", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.fhir.proto.Annotations.fhirProfileBase);
    registry.add(com.google.fhir.proto.Annotations.fhirStructureDefinitionUrl);
    registry.add(com.google.fhir.proto.Annotations.fhirValuesetUrl);
    registry.add(com.google.fhir.proto.Annotations.fhirVersion);
    registry.add(com.google.fhir.proto.Annotations.searchParameter);
    registry.add(com.google.fhir.proto.Annotations.structureDefinitionKind);
    registry.add(com.google.fhir.proto.Annotations.validReferenceType);
    registry.add(com.google.fhir.proto.Annotations.validationRequirement);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.protobuf.AnyProto.getDescriptor();
    com.google.fhir.proto.Annotations.getDescriptor();
    com.google.fhir.r4.core.Codes.getDescriptor();
    com.google.fhir.r4.core.Datatypes.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
