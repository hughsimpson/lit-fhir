// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/google/fhir/proto/r4/core/resources/enrollment_response.proto

package com.google.fhir.r4.core;

public final class EnrollmentResponseOuterClass {
  private EnrollmentResponseOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_fhir_r4_core_EnrollmentResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_EnrollmentResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_fhir_r4_core_EnrollmentResponse_StatusCode_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_EnrollmentResponse_StatusCode_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_fhir_r4_core_EnrollmentResponse_OutcomeCode_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_EnrollmentResponse_OutcomeCode_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nCproto/google/fhir/proto/r4/core/resour" +
      "ces/enrollment_response.proto\022\023google.fh" +
      "ir.r4.core\032\031google/protobuf/any.proto\032)p" +
      "roto/google/fhir/proto/annotations.proto" +
      "\032+proto/google/fhir/proto/r4/core/codes." +
      "proto\032/proto/google/fhir/proto/r4/core/d" +
      "atatypes.proto\"\276\r\n\022EnrollmentResponse\022#\n" +
      "\002id\030\001 \001(\0132\027.google.fhir.r4.core.Id\022\'\n\004me" +
      "ta\030\002 \001(\0132\031.google.fhir.r4.core.Meta\0220\n\016i" +
      "mplicit_rules\030\003 \001(\0132\030.google.fhir.r4.cor" +
      "e.Uri\022+\n\010language\030\004 \001(\0132\031.google.fhir.r4" +
      ".core.Code\022,\n\004text\030\005 \001(\0132\036.google.fhir.r" +
      "4.core.Narrative\022\'\n\tcontained\030\006 \003(\0132\024.go" +
      "ogle.protobuf.Any\0221\n\textension\030\010 \003(\0132\036.g" +
      "oogle.fhir.r4.core.Extension\022:\n\022modifier" +
      "_extension\030\t \003(\0132\036.google.fhir.r4.core.E" +
      "xtension\0223\n\nidentifier\030\n \003(\0132\037.google.fh" +
      "ir.r4.core.Identifier\022B\n\006status\030\013 \001(\01322." +
      "google.fhir.r4.core.EnrollmentResponse.S" +
      "tatusCode\022H\n\007request\030\014 \001(\0132\036.google.fhir" +
      ".r4.core.ReferenceB\027\362\377\374\302\006\021EnrollmentRequ" +
      "est\022D\n\007outcome\030\r \001(\01323.google.fhir.r4.co" +
      "re.EnrollmentResponse.OutcomeCode\0220\n\013dis" +
      "position\030\016 \001(\0132\033.google.fhir.r4.core.Str" +
      "ing\022.\n\007created\030\017 \001(\0132\035.google.fhir.r4.co" +
      "re.DateTime\022H\n\014organization\030\020 \001(\0132\036.goog" +
      "le.fhir.r4.core.ReferenceB\022\362\377\374\302\006\014Organiz" +
      "ation\022t\n\020request_provider\030\021 \001(\0132\036.google" +
      ".fhir.r4.core.ReferenceB:\362\377\374\302\006\014Practitio" +
      "ner\362\377\374\302\006\020PractitionerRole\362\377\374\302\006\014Organizat" +
      "ion\032\225\002\n\nStatusCode\022E\n\005value\030\001 \001(\01626.goog" +
      "le.fhir.r4.core.FinancialResourceStatusC" +
      "ode.Value\022\'\n\002id\030\002 \001(\0132\033.google.fhir.r4.c" +
      "ore.String\0221\n\textension\030\003 \003(\0132\036.google.f" +
      "hir.r4.core.Extension:d\300\237\343\266\005\001\212\371\203\262\005&http:" +
      "//hl7.org/fhir/ValueSet/fm-status\232\265\216\223\006,h" +
      "ttp://hl7.org/fhir/StructureDefinition/c" +
      "ode\032\227\002\n\013OutcomeCode\022=\n\005value\030\001 \001(\0162..goo" +
      "gle.fhir.r4.core.ClaimProcessingCode.Val" +
      "ue\022\'\n\002id\030\002 \001(\0132\033.google.fhir.r4.core.Str" +
      "ing\0221\n\textension\030\003 \003(\0132\036.google.fhir.r4." +
      "core.Extension:m\300\237\343\266\005\001\212\371\203\262\005/http://hl7.o" +
      "rg/fhir/ValueSet/remittance-outcome\232\265\216\223\006" +
      ",http://hl7.org/fhir/StructureDefinition" +
      "/code:\321\001\300\237\343\266\005\003\262\376\344\227\006:http://hl7.org/fhir/" +
      "StructureDefinition/EnrollmentResponse\262\365" +
      "\365\327\t-\n\nidentifier\020\004\032\035EnrollmentResponse.i" +
      "dentifier\262\365\365\327\t\'\n\007request\020\005\032\032EnrollmentRe" +
      "sponse.request\262\365\365\327\t%\n\006status\020\004\032\031Enrollme" +
      "ntResponse.statusJ\004\010\007\020\010B!\n\027com.google.fh" +
      "ir.r4.coreP\001\230\306\260\265\007\004b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.AnyProto.getDescriptor(),
          com.google.fhir.proto.Annotations.getDescriptor(),
          com.google.fhir.r4.core.Codes.getDescriptor(),
          com.google.fhir.r4.core.Datatypes.getDescriptor(),
        });
    internal_static_google_fhir_r4_core_EnrollmentResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_fhir_r4_core_EnrollmentResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_fhir_r4_core_EnrollmentResponse_descriptor,
        new java.lang.String[] { "Id", "Meta", "ImplicitRules", "Language", "Text", "Contained", "Extension", "ModifierExtension", "Identifier", "Status", "Request", "Outcome", "Disposition", "Created", "Organization", "RequestProvider", });
    internal_static_google_fhir_r4_core_EnrollmentResponse_StatusCode_descriptor =
      internal_static_google_fhir_r4_core_EnrollmentResponse_descriptor.getNestedTypes().get(0);
    internal_static_google_fhir_r4_core_EnrollmentResponse_StatusCode_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_fhir_r4_core_EnrollmentResponse_StatusCode_descriptor,
        new java.lang.String[] { "Value", "Id", "Extension", });
    internal_static_google_fhir_r4_core_EnrollmentResponse_OutcomeCode_descriptor =
      internal_static_google_fhir_r4_core_EnrollmentResponse_descriptor.getNestedTypes().get(1);
    internal_static_google_fhir_r4_core_EnrollmentResponse_OutcomeCode_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_fhir_r4_core_EnrollmentResponse_OutcomeCode_descriptor,
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
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.protobuf.AnyProto.getDescriptor();
    com.google.fhir.proto.Annotations.getDescriptor();
    com.google.fhir.r4.core.Codes.getDescriptor();
    com.google.fhir.r4.core.Datatypes.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
