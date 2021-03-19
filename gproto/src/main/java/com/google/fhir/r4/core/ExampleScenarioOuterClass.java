// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/google/fhir/proto/r4/core/resources/example_scenario.proto

package com.google.fhir.r4.core;

public final class ExampleScenarioOuterClass {
  private ExampleScenarioOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_fhir_r4_core_ExampleScenario_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_ExampleScenario_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_fhir_r4_core_ExampleScenario_StatusCode_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_ExampleScenario_StatusCode_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_fhir_r4_core_ExampleScenario_Actor_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_ExampleScenario_Actor_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_fhir_r4_core_ExampleScenario_Actor_TypeCode_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_ExampleScenario_Actor_TypeCode_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_fhir_r4_core_ExampleScenario_Instance_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_ExampleScenario_Instance_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_fhir_r4_core_ExampleScenario_Instance_ResourceTypeCode_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_ExampleScenario_Instance_ResourceTypeCode_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_fhir_r4_core_ExampleScenario_Instance_Version_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_ExampleScenario_Instance_Version_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_fhir_r4_core_ExampleScenario_Instance_ContainedInstance_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_ExampleScenario_Instance_ContainedInstance_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_fhir_r4_core_ExampleScenario_Process_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_ExampleScenario_Process_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_fhir_r4_core_ExampleScenario_Process_Step_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_ExampleScenario_Process_Step_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_fhir_r4_core_ExampleScenario_Process_Step_Operation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_ExampleScenario_Process_Step_Operation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_fhir_r4_core_ExampleScenario_Process_Step_Alternative_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_ExampleScenario_Process_Step_Alternative_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n@proto/google/fhir/proto/r4/core/resour" +
      "ces/example_scenario.proto\022\023google.fhir." +
      "r4.core\032\031google/protobuf/any.proto\032)prot" +
      "o/google/fhir/proto/annotations.proto\032+p" +
      "roto/google/fhir/proto/r4/core/codes.pro" +
      "to\032/proto/google/fhir/proto/r4/core/data" +
      "types.proto\"\3671\n\017ExampleScenario\022#\n\002id\030\001 " +
      "\001(\0132\027.google.fhir.r4.core.Id\022\'\n\004meta\030\002 \001" +
      "(\0132\031.google.fhir.r4.core.Meta\0220\n\016implici" +
      "t_rules\030\003 \001(\0132\030.google.fhir.r4.core.Uri\022" +
      "+\n\010language\030\004 \001(\0132\031.google.fhir.r4.core." +
      "Code\022,\n\004text\030\005 \001(\0132\036.google.fhir.r4.core" +
      ".Narrative\022\'\n\tcontained\030\006 \003(\0132\024.google.p" +
      "rotobuf.Any\0221\n\textension\030\010 \003(\0132\036.google." +
      "fhir.r4.core.Extension\022:\n\022modifier_exten" +
      "sion\030\t \003(\0132\036.google.fhir.r4.core.Extensi" +
      "on\022%\n\003url\030\n \001(\0132\030.google.fhir.r4.core.Ur" +
      "i\0223\n\nidentifier\030\013 \003(\0132\037.google.fhir.r4.c" +
      "ore.Identifier\022,\n\007version\030\014 \001(\0132\033.google" +
      ".fhir.r4.core.String\022)\n\004name\030\r \001(\0132\033.goo" +
      "gle.fhir.r4.core.String\022G\n\006status\030\016 \001(\0132" +
      "/.google.fhir.r4.core.ExampleScenario.St" +
      "atusCodeB\006\360\320\207\353\004\001\0222\n\014experimental\030\017 \001(\0132\034" +
      ".google.fhir.r4.core.Boolean\022+\n\004date\030\020 \001" +
      "(\0132\035.google.fhir.r4.core.DateTime\022.\n\tpub" +
      "lisher\030\021 \001(\0132\033.google.fhir.r4.core.Strin" +
      "g\0223\n\007contact\030\022 \003(\0132\".google.fhir.r4.core" +
      ".ContactDetail\0226\n\013use_context\030\023 \003(\0132!.go" +
      "ogle.fhir.r4.core.UsageContext\022:\n\014jurisd" +
      "iction\030\024 \003(\0132$.google.fhir.r4.core.Codea" +
      "bleConcept\0220\n\tcopyright\030\025 \001(\0132\035.google.f" +
      "hir.r4.core.Markdown\022.\n\007purpose\030\026 \001(\0132\035." +
      "google.fhir.r4.core.Markdown\0229\n\005actor\030\027 " +
      "\003(\0132*.google.fhir.r4.core.ExampleScenari" +
      "o.Actor\022?\n\010instance\030\030 \003(\0132-.google.fhir." +
      "r4.core.ExampleScenario.Instance\022=\n\007proc" +
      "ess\030\031 \003(\0132,.google.fhir.r4.core.ExampleS" +
      "cenario.Process\0220\n\010workflow\030\032 \003(\0132\036.goog" +
      "le.fhir.r4.core.Canonical\032\230\002\n\nStatusCode" +
      "\022?\n\005value\030\001 \001(\01620.google.fhir.r4.core.Pu" +
      "blicationStatusCode.Value\022\'\n\002id\030\002 \001(\0132\033." +
      "google.fhir.r4.core.String\0221\n\textension\030" +
      "\003 \003(\0132\036.google.fhir.r4.core.Extension:m\300" +
      "\237\343\266\005\001\212\371\203\262\005/http://hl7.org/fhir/ValueSet/" +
      "publication-status\232\265\216\223\006,http://hl7.org/f" +
      "hir/StructureDefinition/code\032\250\005\n\005Actor\022\'" +
      "\n\002id\030\001 \001(\0132\033.google.fhir.r4.core.String\022" +
      "1\n\textension\030\002 \003(\0132\036.google.fhir.r4.core" +
      ".Extension\022:\n\022modifier_extension\030\003 \003(\0132\036" +
      ".google.fhir.r4.core.Extension\0225\n\010actor_" +
      "id\030\004 \001(\0132\033.google.fhir.r4.core.StringB\006\360" +
      "\320\207\353\004\001\022I\n\004type\030\005 \001(\01323.google.fhir.r4.cor" +
      "e.ExampleScenario.Actor.TypeCodeB\006\360\320\207\353\004\001" +
      "\022)\n\004name\030\006 \001(\0132\033.google.fhir.r4.core.Str" +
      "ing\0222\n\013description\030\007 \001(\0132\035.google.fhir.r" +
      "4.core.Markdown\032\245\002\n\010TypeCode\022F\n\005value\030\001 " +
      "\001(\01627.google.fhir.r4.core.ExampleScenari" +
      "oActorTypeCode.Value\022\'\n\002id\030\002 \001(\0132\033.googl" +
      "e.fhir.r4.core.String\0221\n\textension\030\003 \003(\013" +
      "2\036.google.fhir.r4.core.Extension:u\300\237\343\266\005\001" +
      "\212\371\203\262\0057http://hl7.org/fhir/ValueSet/examp" +
      "lescenario-actor-type\232\265\216\223\006,http://hl7.or" +
      "g/fhir/StructureDefinition/code\032\211\013\n\010Inst" +
      "ance\022\'\n\002id\030\001 \001(\0132\033.google.fhir.r4.core.S" +
      "tring\0221\n\textension\030\002 \003(\0132\036.google.fhir.r" +
      "4.core.Extension\022:\n\022modifier_extension\030\003" +
      " \003(\0132\036.google.fhir.r4.core.Extension\0228\n\013" +
      "resource_id\030\004 \001(\0132\033.google.fhir.r4.core." +
      "StringB\006\360\320\207\353\004\001\022]\n\rresource_type\030\005 \001(\0132>." +
      "google.fhir.r4.core.ExampleScenario.Inst" +
      "ance.ResourceTypeCodeB\006\360\320\207\353\004\001\022)\n\004name\030\006 " +
      "\001(\0132\033.google.fhir.r4.core.String\0222\n\013desc" +
      "ription\030\007 \001(\0132\035.google.fhir.r4.core.Mark" +
      "down\022F\n\007version\030\010 \003(\01325.google.fhir.r4.c" +
      "ore.ExampleScenario.Instance.Version\022[\n\022" +
      "contained_instance\030\t \003(\0132?.google.fhir.r" +
      "4.core.ExampleScenario.Instance.Containe" +
      "dInstance\032\225\002\n\020ResourceTypeCode\022:\n\005value\030" +
      "\001 \001(\0162+.google.fhir.r4.core.ResourceType" +
      "Code.Value\022\'\n\002id\030\002 \001(\0132\033.google.fhir.r4." +
      "core.String\0221\n\textension\030\003 \003(\0132\036.google." +
      "fhir.r4.core.Extension:i\300\237\343\266\005\001\212\371\203\262\005+http" +
      "://hl7.org/fhir/ValueSet/resource-types\232" +
      "\265\216\223\006,http://hl7.org/fhir/StructureDefini" +
      "tion/code\032\226\002\n\007Version\022\'\n\002id\030\001 \001(\0132\033.goog" +
      "le.fhir.r4.core.String\0221\n\textension\030\002 \003(" +
      "\0132\036.google.fhir.r4.core.Extension\022:\n\022mod" +
      "ifier_extension\030\003 \003(\0132\036.google.fhir.r4.c" +
      "ore.Extension\0227\n\nversion_id\030\004 \001(\0132\033.goog" +
      "le.fhir.r4.core.StringB\006\360\320\207\353\004\001\022:\n\013descri" +
      "ption\030\005 \001(\0132\035.google.fhir.r4.core.Markdo" +
      "wnB\006\360\320\207\353\004\001\032\226\002\n\021ContainedInstance\022\'\n\002id\030\001" +
      " \001(\0132\033.google.fhir.r4.core.String\0221\n\text" +
      "ension\030\002 \003(\0132\036.google.fhir.r4.core.Exten" +
      "sion\022:\n\022modifier_extension\030\003 \003(\0132\036.googl" +
      "e.fhir.r4.core.Extension\0228\n\013resource_id\030" +
      "\004 \001(\0132\033.google.fhir.r4.core.StringB\006\360\320\207\353" +
      "\004\001\022/\n\nversion_id\030\005 \001(\0132\033.google.fhir.r4." +
      "core.String\032\223\017\n\007Process\022\'\n\002id\030\001 \001(\0132\033.go" +
      "ogle.fhir.r4.core.String\0221\n\textension\030\002 " +
      "\003(\0132\036.google.fhir.r4.core.Extension\022:\n\022m" +
      "odifier_extension\030\003 \003(\0132\036.google.fhir.r4" +
      ".core.Extension\0222\n\005title\030\004 \001(\0132\033.google." +
      "fhir.r4.core.StringB\006\360\320\207\353\004\001\0222\n\013descripti" +
      "on\030\005 \001(\0132\035.google.fhir.r4.core.Markdown\022" +
      "5\n\016pre_conditions\030\006 \001(\0132\035.google.fhir.r4" +
      ".core.Markdown\0226\n\017post_conditions\030\007 \001(\0132" +
      "\035.google.fhir.r4.core.Markdown\022?\n\004step\030\010" +
      " \003(\01321.google.fhir.r4.core.ExampleScenar" +
      "io.Process.Step\032\327\013\n\004Step\022\'\n\002id\030\001 \001(\0132\033.g" +
      "oogle.fhir.r4.core.String\0221\n\textension\030\002" +
      " \003(\0132\036.google.fhir.r4.core.Extension\022:\n\022" +
      "modifier_extension\030\003 \003(\0132\036.google.fhir.r" +
      "4.core.Extension\022=\n\007process\030\004 \003(\0132,.goog" +
      "le.fhir.r4.core.ExampleScenario.Process\022" +
      "+\n\005pause\030\005 \001(\0132\034.google.fhir.r4.core.Boo" +
      "lean\022N\n\toperation\030\006 \001(\0132;.google.fhir.r4" +
      ".core.ExampleScenario.Process.Step.Opera" +
      "tion\022R\n\013alternative\030\007 \003(\0132=.google.fhir." +
      "r4.core.ExampleScenario.Process.Step.Alt" +
      "ernative\032\325\005\n\tOperation\022\'\n\002id\030\001 \001(\0132\033.goo" +
      "gle.fhir.r4.core.String\0221\n\textension\030\002 \003" +
      "(\0132\036.google.fhir.r4.core.Extension\022:\n\022mo" +
      "difier_extension\030\003 \003(\0132\036.google.fhir.r4." +
      "core.Extension\0223\n\006number\030\004 \001(\0132\033.google." +
      "fhir.r4.core.StringB\006\360\320\207\353\004\001\022)\n\004type\030\005 \001(" +
      "\0132\033.google.fhir.r4.core.String\022)\n\004name\030\006" +
      " \001(\0132\033.google.fhir.r4.core.String\022.\n\tini" +
      "tiator\030\007 \001(\0132\033.google.fhir.r4.core.Strin" +
      "g\022-\n\010receiver\030\010 \001(\0132\033.google.fhir.r4.cor" +
      "e.String\0222\n\013description\030\t \001(\0132\035.google.f" +
      "hir.r4.core.Markdown\0226\n\020initiator_active" +
      "\030\n \001(\0132\034.google.fhir.r4.core.Boolean\0225\n\017" +
      "receiver_active\030\013 \001(\0132\034.google.fhir.r4.c" +
      "ore.Boolean\022P\n\007request\030\014 \001(\0132?.google.fh" +
      "ir.r4.core.ExampleScenario.Instance.Cont" +
      "ainedInstance\022Q\n\010response\030\r \001(\0132?.google" +
      ".fhir.r4.core.ExampleScenario.Instance.C" +
      "ontainedInstance\032\316\002\n\013Alternative\022\'\n\002id\030\001" +
      " \001(\0132\033.google.fhir.r4.core.String\0221\n\text" +
      "ension\030\002 \003(\0132\036.google.fhir.r4.core.Exten" +
      "sion\022:\n\022modifier_extension\030\003 \003(\0132\036.googl" +
      "e.fhir.r4.core.Extension\0222\n\005title\030\004 \001(\0132" +
      "\033.google.fhir.r4.core.StringB\006\360\320\207\353\004\001\0222\n\013" +
      "description\030\005 \001(\0132\035.google.fhir.r4.core." +
      "Markdown\022?\n\004step\030\006 \003(\01321.google.fhir.r4." +
      "core.ExampleScenario.Process.Step:\373\005\300\237\343\266" +
      "\005\003\262\376\344\227\0067http://hl7.org/fhir/StructureDef" +
      "inition/ExampleScenario\262\365\365\327\tB\n\007context\020\004" +
      "\0325(ExampleScenario.useContext.value as C" +
      "odeableConcept)\262\365\365\327\tr\n\020context-quantity\020" +
      "\007\032\\(ExampleScenario.useContext.value as " +
      "Quantity) | (ExampleScenario.useContext." +
      "value as Range)\262\365\365\327\t1\n\014context-type\020\004\032\037E" +
      "xampleScenario.useContext.code\262\365\365\327\t5\n\025co" +
      "ntext-type-quantity\020\006\032\032ExampleScenario.u" +
      "seContext\262\365\365\327\t2\n\022context-type-value\020\006\032\032E" +
      "xampleScenario.useContext\262\365\365\327\t\036\n\004date\020\002\032" +
      "\024ExampleScenario.date\262\365\365\327\t*\n\nidentifier\020" +
      "\004\032\032ExampleScenario.identifier\262\365\365\327\t.\n\014jur" +
      "isdiction\020\004\032\034ExampleScenario.jurisdictio" +
      "n\262\365\365\327\t\036\n\004name\020\003\032\024ExampleScenario.name\262\365\365" +
      "\327\t(\n\tpublisher\020\003\032\031ExampleScenario.publis" +
      "her\262\365\365\327\t\"\n\006status\020\004\032\026ExampleScenario.sta" +
      "tus\262\365\365\327\t\034\n\003url\020\010\032\023ExampleScenario.url\262\365\365" +
      "\327\t$\n\007version\020\004\032\027ExampleScenario.versionJ" +
      "\004\010\007\020\010B!\n\027com.google.fhir.r4.coreP\001\230\306\260\265\007\004" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.AnyProto.getDescriptor(),
          com.google.fhir.proto.Annotations.getDescriptor(),
          com.google.fhir.r4.core.Codes.getDescriptor(),
          com.google.fhir.r4.core.Datatypes.getDescriptor(),
        });
    internal_static_google_fhir_r4_core_ExampleScenario_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_fhir_r4_core_ExampleScenario_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_fhir_r4_core_ExampleScenario_descriptor,
        new java.lang.String[] { "Id", "Meta", "ImplicitRules", "Language", "Text", "Contained", "Extension", "ModifierExtension", "Url", "Identifier", "Version", "Name", "Status", "Experimental", "Date", "Publisher", "Contact", "UseContext", "Jurisdiction", "Copyright", "Purpose", "Actor", "Instance", "Process", "Workflow", });
    internal_static_google_fhir_r4_core_ExampleScenario_StatusCode_descriptor =
      internal_static_google_fhir_r4_core_ExampleScenario_descriptor.getNestedTypes().get(0);
    internal_static_google_fhir_r4_core_ExampleScenario_StatusCode_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_fhir_r4_core_ExampleScenario_StatusCode_descriptor,
        new java.lang.String[] { "Value", "Id", "Extension", });
    internal_static_google_fhir_r4_core_ExampleScenario_Actor_descriptor =
      internal_static_google_fhir_r4_core_ExampleScenario_descriptor.getNestedTypes().get(1);
    internal_static_google_fhir_r4_core_ExampleScenario_Actor_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_fhir_r4_core_ExampleScenario_Actor_descriptor,
        new java.lang.String[] { "Id", "Extension", "ModifierExtension", "ActorId", "Type", "Name", "Description", });
    internal_static_google_fhir_r4_core_ExampleScenario_Actor_TypeCode_descriptor =
      internal_static_google_fhir_r4_core_ExampleScenario_Actor_descriptor.getNestedTypes().get(0);
    internal_static_google_fhir_r4_core_ExampleScenario_Actor_TypeCode_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_fhir_r4_core_ExampleScenario_Actor_TypeCode_descriptor,
        new java.lang.String[] { "Value", "Id", "Extension", });
    internal_static_google_fhir_r4_core_ExampleScenario_Instance_descriptor =
      internal_static_google_fhir_r4_core_ExampleScenario_descriptor.getNestedTypes().get(2);
    internal_static_google_fhir_r4_core_ExampleScenario_Instance_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_fhir_r4_core_ExampleScenario_Instance_descriptor,
        new java.lang.String[] { "Id", "Extension", "ModifierExtension", "ResourceId", "ResourceType", "Name", "Description", "Version", "ContainedInstance", });
    internal_static_google_fhir_r4_core_ExampleScenario_Instance_ResourceTypeCode_descriptor =
      internal_static_google_fhir_r4_core_ExampleScenario_Instance_descriptor.getNestedTypes().get(0);
    internal_static_google_fhir_r4_core_ExampleScenario_Instance_ResourceTypeCode_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_fhir_r4_core_ExampleScenario_Instance_ResourceTypeCode_descriptor,
        new java.lang.String[] { "Value", "Id", "Extension", });
    internal_static_google_fhir_r4_core_ExampleScenario_Instance_Version_descriptor =
      internal_static_google_fhir_r4_core_ExampleScenario_Instance_descriptor.getNestedTypes().get(1);
    internal_static_google_fhir_r4_core_ExampleScenario_Instance_Version_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_fhir_r4_core_ExampleScenario_Instance_Version_descriptor,
        new java.lang.String[] { "Id", "Extension", "ModifierExtension", "VersionId", "Description", });
    internal_static_google_fhir_r4_core_ExampleScenario_Instance_ContainedInstance_descriptor =
      internal_static_google_fhir_r4_core_ExampleScenario_Instance_descriptor.getNestedTypes().get(2);
    internal_static_google_fhir_r4_core_ExampleScenario_Instance_ContainedInstance_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_fhir_r4_core_ExampleScenario_Instance_ContainedInstance_descriptor,
        new java.lang.String[] { "Id", "Extension", "ModifierExtension", "ResourceId", "VersionId", });
    internal_static_google_fhir_r4_core_ExampleScenario_Process_descriptor =
      internal_static_google_fhir_r4_core_ExampleScenario_descriptor.getNestedTypes().get(3);
    internal_static_google_fhir_r4_core_ExampleScenario_Process_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_fhir_r4_core_ExampleScenario_Process_descriptor,
        new java.lang.String[] { "Id", "Extension", "ModifierExtension", "Title", "Description", "PreConditions", "PostConditions", "Step", });
    internal_static_google_fhir_r4_core_ExampleScenario_Process_Step_descriptor =
      internal_static_google_fhir_r4_core_ExampleScenario_Process_descriptor.getNestedTypes().get(0);
    internal_static_google_fhir_r4_core_ExampleScenario_Process_Step_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_fhir_r4_core_ExampleScenario_Process_Step_descriptor,
        new java.lang.String[] { "Id", "Extension", "ModifierExtension", "Process", "Pause", "Operation", "Alternative", });
    internal_static_google_fhir_r4_core_ExampleScenario_Process_Step_Operation_descriptor =
      internal_static_google_fhir_r4_core_ExampleScenario_Process_Step_descriptor.getNestedTypes().get(0);
    internal_static_google_fhir_r4_core_ExampleScenario_Process_Step_Operation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_fhir_r4_core_ExampleScenario_Process_Step_Operation_descriptor,
        new java.lang.String[] { "Id", "Extension", "ModifierExtension", "Number", "Type", "Name", "Initiator", "Receiver", "Description", "InitiatorActive", "ReceiverActive", "Request", "Response", });
    internal_static_google_fhir_r4_core_ExampleScenario_Process_Step_Alternative_descriptor =
      internal_static_google_fhir_r4_core_ExampleScenario_Process_Step_descriptor.getNestedTypes().get(1);
    internal_static_google_fhir_r4_core_ExampleScenario_Process_Step_Alternative_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_fhir_r4_core_ExampleScenario_Process_Step_Alternative_descriptor,
        new java.lang.String[] { "Id", "Extension", "ModifierExtension", "Title", "Description", "Step", });
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
