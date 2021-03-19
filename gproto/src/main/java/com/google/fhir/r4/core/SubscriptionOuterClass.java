// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/google/fhir/proto/r4/core/resources/subscription.proto

package com.google.fhir.r4.core;

public final class SubscriptionOuterClass {
  private SubscriptionOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_fhir_r4_core_Subscription_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_Subscription_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_fhir_r4_core_Subscription_StatusCode_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_Subscription_StatusCode_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_fhir_r4_core_Subscription_Channel_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_Subscription_Channel_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_fhir_r4_core_Subscription_Channel_TypeCode_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_Subscription_Channel_TypeCode_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_fhir_r4_core_Subscription_Channel_PayloadCode_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_Subscription_Channel_PayloadCode_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n<proto/google/fhir/proto/r4/core/resour" +
      "ces/subscription.proto\022\023google.fhir.r4.c" +
      "ore\032\031google/protobuf/any.proto\032)proto/go" +
      "ogle/fhir/proto/annotations.proto\032+proto" +
      "/google/fhir/proto/r4/core/codes.proto\032/" +
      "proto/google/fhir/proto/r4/core/datatype" +
      "s.proto\"\375\021\n\014Subscription\022#\n\002id\030\001 \001(\0132\027.g" +
      "oogle.fhir.r4.core.Id\022\'\n\004meta\030\002 \001(\0132\031.go" +
      "ogle.fhir.r4.core.Meta\0220\n\016implicit_rules" +
      "\030\003 \001(\0132\030.google.fhir.r4.core.Uri\022+\n\010lang" +
      "uage\030\004 \001(\0132\031.google.fhir.r4.core.Code\022,\n" +
      "\004text\030\005 \001(\0132\036.google.fhir.r4.core.Narrat" +
      "ive\022\'\n\tcontained\030\006 \003(\0132\024.google.protobuf" +
      ".Any\0221\n\textension\030\010 \003(\0132\036.google.fhir.r4" +
      ".core.Extension\022:\n\022modifier_extension\030\t " +
      "\003(\0132\036.google.fhir.r4.core.Extension\022D\n\006s" +
      "tatus\030\n \001(\0132,.google.fhir.r4.core.Subscr" +
      "iption.StatusCodeB\006\360\320\207\353\004\001\0222\n\007contact\030\013 \003" +
      "(\0132!.google.fhir.r4.core.ContactPoint\022)\n" +
      "\003end\030\014 \001(\0132\034.google.fhir.r4.core.Instant" +
      "\0223\n\006reason\030\r \001(\0132\033.google.fhir.r4.core.S" +
      "tringB\006\360\320\207\353\004\001\0225\n\010criteria\030\016 \001(\0132\033.google" +
      ".fhir.r4.core.StringB\006\360\320\207\353\004\001\022*\n\005error\030\017 " +
      "\001(\0132\033.google.fhir.r4.core.String\022B\n\007chan" +
      "nel\030\020 \001(\0132).google.fhir.r4.core.Subscrip" +
      "tion.ChannelB\006\360\320\207\353\004\001\032\232\002\n\nStatusCode\022@\n\005v" +
      "alue\030\001 \001(\01621.google.fhir.r4.core.Subscri" +
      "ptionStatusCode.Value\022\'\n\002id\030\002 \001(\0132\033.goog" +
      "le.fhir.r4.core.String\0221\n\textension\030\003 \003(" +
      "\0132\036.google.fhir.r4.core.Extension:n\300\237\343\266\005" +
      "\001\212\371\203\262\0050http://hl7.org/fhir/ValueSet/subs" +
      "cription-status\232\265\216\223\006,http://hl7.org/fhir" +
      "/StructureDefinition/code\032\231\007\n\007Channel\022\'\n" +
      "\002id\030\001 \001(\0132\033.google.fhir.r4.core.String\0221" +
      "\n\textension\030\002 \003(\0132\036.google.fhir.r4.core." +
      "Extension\022:\n\022modifier_extension\030\003 \003(\0132\036." +
      "google.fhir.r4.core.Extension\022H\n\004type\030\004 " +
      "\001(\01322.google.fhir.r4.core.Subscription.C" +
      "hannel.TypeCodeB\006\360\320\207\353\004\001\022*\n\010endpoint\030\005 \001(" +
      "\0132\030.google.fhir.r4.core.Url\022F\n\007payload\030\006" +
      " \001(\01325.google.fhir.r4.core.Subscription." +
      "Channel.PayloadCode\022+\n\006header\030\007 \003(\0132\033.go" +
      "ogle.fhir.r4.core.String\032\243\002\n\010TypeCode\022E\n" +
      "\005value\030\001 \001(\01626.google.fhir.r4.core.Subsc" +
      "riptionChannelTypeCode.Value\022\'\n\002id\030\002 \001(\013" +
      "2\033.google.fhir.r4.core.String\0221\n\textensi" +
      "on\030\003 \003(\0132\036.google.fhir.r4.core.Extension" +
      ":t\300\237\343\266\005\001\212\371\203\262\0056http://hl7.org/fhir/ValueS" +
      "et/subscription-channel-type\232\265\216\223\006,http:/" +
      "/hl7.org/fhir/StructureDefinition/code\032\344" +
      "\001\n\013PayloadCode\022\'\n\002id\030\002 \001(\0132\033.google.fhir" +
      ".r4.core.String\0221\n\textension\030\003 \003(\0132\036.goo" +
      "gle.fhir.r4.core.Extension\022\r\n\005value\030\004 \001(" +
      "\t:d\300\237\343\266\005\001\212\371\203\262\005&http://hl7.org/fhir/Value" +
      "Set/mimetypes\232\265\216\223\006,http://hl7.org/fhir/S" +
      "tructureDefinition/codeJ\004\010\001\020\002:\271\002\300\237\343\266\005\003\262\376" +
      "\344\227\0064http://hl7.org/fhir/StructureDefinit" +
      "ion/Subscription\262\365\365\327\t!\n\007contact\020\004\032\024Subsc" +
      "ription.contact\262\365\365\327\t#\n\010criteria\020\003\032\025Subsc" +
      "ription.criteria\262\365\365\327\t)\n\007payload\020\004\032\034Subsc" +
      "ription.channel.payload\262\365\365\327\t\037\n\006status\020\004\032" +
      "\023Subscription.status\262\365\365\327\t#\n\004type\020\004\032\031Subs" +
      "cription.channel.type\262\365\365\327\t&\n\003url\020\010\032\035Subs" +
      "cription.channel.endpointJ\004\010\007\020\010B!\n\027com.g" +
      "oogle.fhir.r4.coreP\001\230\306\260\265\007\004b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.AnyProto.getDescriptor(),
          com.google.fhir.proto.Annotations.getDescriptor(),
          com.google.fhir.r4.core.Codes.getDescriptor(),
          com.google.fhir.r4.core.Datatypes.getDescriptor(),
        });
    internal_static_google_fhir_r4_core_Subscription_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_fhir_r4_core_Subscription_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_fhir_r4_core_Subscription_descriptor,
        new java.lang.String[] { "Id", "Meta", "ImplicitRules", "Language", "Text", "Contained", "Extension", "ModifierExtension", "Status", "Contact", "End", "Reason", "Criteria", "Error", "Channel", });
    internal_static_google_fhir_r4_core_Subscription_StatusCode_descriptor =
      internal_static_google_fhir_r4_core_Subscription_descriptor.getNestedTypes().get(0);
    internal_static_google_fhir_r4_core_Subscription_StatusCode_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_fhir_r4_core_Subscription_StatusCode_descriptor,
        new java.lang.String[] { "Value", "Id", "Extension", });
    internal_static_google_fhir_r4_core_Subscription_Channel_descriptor =
      internal_static_google_fhir_r4_core_Subscription_descriptor.getNestedTypes().get(1);
    internal_static_google_fhir_r4_core_Subscription_Channel_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_fhir_r4_core_Subscription_Channel_descriptor,
        new java.lang.String[] { "Id", "Extension", "ModifierExtension", "Type", "Endpoint", "Payload", "Header", });
    internal_static_google_fhir_r4_core_Subscription_Channel_TypeCode_descriptor =
      internal_static_google_fhir_r4_core_Subscription_Channel_descriptor.getNestedTypes().get(0);
    internal_static_google_fhir_r4_core_Subscription_Channel_TypeCode_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_fhir_r4_core_Subscription_Channel_TypeCode_descriptor,
        new java.lang.String[] { "Value", "Id", "Extension", });
    internal_static_google_fhir_r4_core_Subscription_Channel_PayloadCode_descriptor =
      internal_static_google_fhir_r4_core_Subscription_Channel_descriptor.getNestedTypes().get(1);
    internal_static_google_fhir_r4_core_Subscription_Channel_PayloadCode_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_fhir_r4_core_Subscription_Channel_PayloadCode_descriptor,
        new java.lang.String[] { "Id", "Extension", "Value", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.fhir.proto.Annotations.fhirProfileBase);
    registry.add(com.google.fhir.proto.Annotations.fhirStructureDefinitionUrl);
    registry.add(com.google.fhir.proto.Annotations.fhirValuesetUrl);
    registry.add(com.google.fhir.proto.Annotations.fhirVersion);
    registry.add(com.google.fhir.proto.Annotations.searchParameter);
    registry.add(com.google.fhir.proto.Annotations.structureDefinitionKind);
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
