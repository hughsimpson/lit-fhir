// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/google/fhir/proto/r4/core/resources/endpoint.proto

package com.google.fhir.r4.core;

public final class EndpointOuterClass {
  private EndpointOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_fhir_r4_core_Endpoint_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_Endpoint_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_fhir_r4_core_Endpoint_StatusCode_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_Endpoint_StatusCode_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_fhir_r4_core_Endpoint_PayloadMimeTypeCode_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_Endpoint_PayloadMimeTypeCode_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n8proto/google/fhir/proto/r4/core/resour" +
      "ces/endpoint.proto\022\023google.fhir.r4.core\032" +
      "\031google/protobuf/any.proto\032)proto/google" +
      "/fhir/proto/annotations.proto\032+proto/goo" +
      "gle/fhir/proto/r4/core/codes.proto\032/prot" +
      "o/google/fhir/proto/r4/core/datatypes.pr" +
      "oto\"\306\016\n\010Endpoint\022#\n\002id\030\001 \001(\0132\027.google.fh" +
      "ir.r4.core.Id\022\'\n\004meta\030\002 \001(\0132\031.google.fhi" +
      "r.r4.core.Meta\0220\n\016implicit_rules\030\003 \001(\0132\030" +
      ".google.fhir.r4.core.Uri\022+\n\010language\030\004 \001" +
      "(\0132\031.google.fhir.r4.core.Code\022,\n\004text\030\005 " +
      "\001(\0132\036.google.fhir.r4.core.Narrative\022\'\n\tc" +
      "ontained\030\006 \003(\0132\024.google.protobuf.Any\0221\n\t" +
      "extension\030\010 \003(\0132\036.google.fhir.r4.core.Ex" +
      "tension\022:\n\022modifier_extension\030\t \003(\0132\036.go" +
      "ogle.fhir.r4.core.Extension\0223\n\nidentifie" +
      "r\030\n \003(\0132\037.google.fhir.r4.core.Identifier" +
      "\022@\n\006status\030\013 \001(\0132(.google.fhir.r4.core.E" +
      "ndpoint.StatusCodeB\006\360\320\207\353\004\001\022<\n\017connection" +
      "_type\030\014 \001(\0132\033.google.fhir.r4.core.Coding" +
      "B\006\360\320\207\353\004\001\022)\n\004name\030\r \001(\0132\033.google.fhir.r4." +
      "core.String\022Q\n\025managing_organization\030\016 \001" +
      "(\0132\036.google.fhir.r4.core.ReferenceB\022\362\377\374\302" +
      "\006\014Organization\0222\n\007contact\030\017 \003(\0132!.google" +
      ".fhir.r4.core.ContactPoint\022+\n\006period\030\020 \001" +
      "(\0132\033.google.fhir.r4.core.Period\022B\n\014paylo" +
      "ad_type\030\021 \003(\0132$.google.fhir.r4.core.Code" +
      "ableConceptB\006\360\320\207\353\004\001\022L\n\021payload_mime_type" +
      "\030\022 \003(\01321.google.fhir.r4.core.Endpoint.Pa" +
      "yloadMimeTypeCode\0221\n\007address\030\023 \001(\0132\030.goo" +
      "gle.fhir.r4.core.UrlB\006\360\320\207\353\004\001\022+\n\006header\030\024" +
      " \003(\0132\033.google.fhir.r4.core.String\032\222\002\n\nSt" +
      "atusCode\022<\n\005value\030\001 \001(\0162-.google.fhir.r4" +
      ".core.EndpointStatusCode.Value\022\'\n\002id\030\002 \001" +
      "(\0132\033.google.fhir.r4.core.String\0221\n\texten" +
      "sion\030\003 \003(\0132\036.google.fhir.r4.core.Extensi" +
      "on:j\300\237\343\266\005\001\212\371\203\262\005,http://hl7.org/fhir/Valu" +
      "eSet/endpoint-status\232\265\216\223\006,http://hl7.org" +
      "/fhir/StructureDefinition/code\032\354\001\n\023Paylo" +
      "adMimeTypeCode\022\'\n\002id\030\002 \001(\0132\033.google.fhir" +
      ".r4.core.String\0221\n\textension\030\003 \003(\0132\036.goo" +
      "gle.fhir.r4.core.Extension\022\r\n\005value\030\004 \001(" +
      "\t:d\300\237\343\266\005\001\212\371\203\262\005&http://hl7.org/fhir/Value" +
      "Set/mimetypes\232\265\216\223\006,http://hl7.org/fhir/S" +
      "tructureDefinition/codeJ\004\010\001\020\002:\266\002\300\237\343\266\005\003\262\376" +
      "\344\227\0060http://hl7.org/fhir/StructureDefinit" +
      "ion/Endpoint\262\365\365\327\t,\n\017connection-type\020\004\032\027E" +
      "ndpoint.connectionType\262\365\365\327\t#\n\nidentifier" +
      "\020\004\032\023Endpoint.identifier\262\365\365\327\t\027\n\004name\020\003\032\rE" +
      "ndpoint.name\262\365\365\327\t/\n\014organization\020\005\032\035Endp" +
      "oint.managingOrganization\262\365\365\327\t&\n\014payload" +
      "-type\020\004\032\024Endpoint.payloadType\262\365\365\327\t\033\n\006sta" +
      "tus\020\004\032\017Endpoint.statusJ\004\010\007\020\010B!\n\027com.goog" +
      "le.fhir.r4.coreP\001\230\306\260\265\007\004b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.AnyProto.getDescriptor(),
          com.google.fhir.proto.Annotations.getDescriptor(),
          com.google.fhir.r4.core.Codes.getDescriptor(),
          com.google.fhir.r4.core.Datatypes.getDescriptor(),
        });
    internal_static_google_fhir_r4_core_Endpoint_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_fhir_r4_core_Endpoint_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_fhir_r4_core_Endpoint_descriptor,
        new java.lang.String[] { "Id", "Meta", "ImplicitRules", "Language", "Text", "Contained", "Extension", "ModifierExtension", "Identifier", "Status", "ConnectionType", "Name", "ManagingOrganization", "Contact", "Period", "PayloadType", "PayloadMimeType", "Address", "Header", });
    internal_static_google_fhir_r4_core_Endpoint_StatusCode_descriptor =
      internal_static_google_fhir_r4_core_Endpoint_descriptor.getNestedTypes().get(0);
    internal_static_google_fhir_r4_core_Endpoint_StatusCode_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_fhir_r4_core_Endpoint_StatusCode_descriptor,
        new java.lang.String[] { "Value", "Id", "Extension", });
    internal_static_google_fhir_r4_core_Endpoint_PayloadMimeTypeCode_descriptor =
      internal_static_google_fhir_r4_core_Endpoint_descriptor.getNestedTypes().get(1);
    internal_static_google_fhir_r4_core_Endpoint_PayloadMimeTypeCode_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_fhir_r4_core_Endpoint_PayloadMimeTypeCode_descriptor,
        new java.lang.String[] { "Id", "Extension", "Value", });
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
