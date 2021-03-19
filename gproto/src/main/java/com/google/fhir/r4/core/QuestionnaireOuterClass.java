// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/google/fhir/proto/r4/core/resources/questionnaire.proto

package com.google.fhir.r4.core;

public final class QuestionnaireOuterClass {
  private QuestionnaireOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_fhir_r4_core_Questionnaire_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_Questionnaire_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_fhir_r4_core_Questionnaire_StatusCode_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_Questionnaire_StatusCode_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_fhir_r4_core_Questionnaire_SubjectTypeCode_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_Questionnaire_SubjectTypeCode_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_fhir_r4_core_Questionnaire_Item_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_Questionnaire_Item_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_fhir_r4_core_Questionnaire_Item_TypeCode_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_Questionnaire_Item_TypeCode_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_fhir_r4_core_Questionnaire_Item_EnableWhen_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_Questionnaire_Item_EnableWhen_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_fhir_r4_core_Questionnaire_Item_EnableWhen_OperatorCode_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_Questionnaire_Item_EnableWhen_OperatorCode_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_fhir_r4_core_Questionnaire_Item_EnableWhen_AnswerX_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_Questionnaire_Item_EnableWhen_AnswerX_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_fhir_r4_core_Questionnaire_Item_EnableBehaviorCode_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_Questionnaire_Item_EnableBehaviorCode_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_fhir_r4_core_Questionnaire_Item_AnswerOption_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_Questionnaire_Item_AnswerOption_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_fhir_r4_core_Questionnaire_Item_AnswerOption_ValueX_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_Questionnaire_Item_AnswerOption_ValueX_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_fhir_r4_core_Questionnaire_Item_Initial_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_Questionnaire_Item_Initial_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_fhir_r4_core_Questionnaire_Item_Initial_ValueX_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_Questionnaire_Item_Initial_ValueX_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n=proto/google/fhir/proto/r4/core/resour" +
      "ces/questionnaire.proto\022\023google.fhir.r4." +
      "core\032\031google/protobuf/any.proto\032)proto/g" +
      "oogle/fhir/proto/annotations.proto\032+prot" +
      "o/google/fhir/proto/r4/core/codes.proto\032" +
      "/proto/google/fhir/proto/r4/core/datatyp" +
      "es.proto\"\262B\n\rQuestionnaire\022#\n\002id\030\001 \001(\0132\027" +
      ".google.fhir.r4.core.Id\022\'\n\004meta\030\002 \001(\0132\031." +
      "google.fhir.r4.core.Meta\0220\n\016implicit_rul" +
      "es\030\003 \001(\0132\030.google.fhir.r4.core.Uri\022+\n\010la" +
      "nguage\030\004 \001(\0132\031.google.fhir.r4.core.Code\022" +
      ",\n\004text\030\005 \001(\0132\036.google.fhir.r4.core.Narr" +
      "ative\022\'\n\tcontained\030\006 \003(\0132\024.google.protob" +
      "uf.Any\0221\n\textension\030\010 \003(\0132\036.google.fhir." +
      "r4.core.Extension\022:\n\022modifier_extension\030" +
      "\t \003(\0132\036.google.fhir.r4.core.Extension\022%\n" +
      "\003url\030\n \001(\0132\030.google.fhir.r4.core.Uri\0223\n\n" +
      "identifier\030\013 \003(\0132\037.google.fhir.r4.core.I" +
      "dentifier\022,\n\007version\030\014 \001(\0132\033.google.fhir" +
      ".r4.core.String\022)\n\004name\030\r \001(\0132\033.google.f" +
      "hir.r4.core.String\022*\n\005title\030\016 \001(\0132\033.goog" +
      "le.fhir.r4.core.String\0224\n\014derived_from\030\017" +
      " \003(\0132\036.google.fhir.r4.core.Canonical\022E\n\006" +
      "status\030\020 \001(\0132-.google.fhir.r4.core.Quest" +
      "ionnaire.StatusCodeB\006\360\320\207\353\004\001\0222\n\014experimen" +
      "tal\030\021 \001(\0132\034.google.fhir.r4.core.Boolean\022" +
      "H\n\014subject_type\030\022 \003(\01322.google.fhir.r4.c" +
      "ore.Questionnaire.SubjectTypeCode\022+\n\004dat" +
      "e\030\023 \001(\0132\035.google.fhir.r4.core.DateTime\022." +
      "\n\tpublisher\030\024 \001(\0132\033.google.fhir.r4.core." +
      "String\0223\n\007contact\030\025 \003(\0132\".google.fhir.r4" +
      ".core.ContactDetail\0222\n\013description\030\026 \001(\013" +
      "2\035.google.fhir.r4.core.Markdown\0226\n\013use_c" +
      "ontext\030\027 \003(\0132!.google.fhir.r4.core.Usage" +
      "Context\022:\n\014jurisdiction\030\030 \003(\0132$.google.f" +
      "hir.r4.core.CodeableConcept\022.\n\007purpose\030\031" +
      " \001(\0132\035.google.fhir.r4.core.Markdown\0220\n\tc" +
      "opyright\030\032 \001(\0132\035.google.fhir.r4.core.Mar" +
      "kdown\0220\n\rapproval_date\030\033 \001(\0132\031.google.fh" +
      "ir.r4.core.Date\0223\n\020last_review_date\030\034 \001(" +
      "\0132\031.google.fhir.r4.core.Date\0225\n\020effectiv" +
      "e_period\030\035 \001(\0132\033.google.fhir.r4.core.Per" +
      "iod\022)\n\004code\030\036 \003(\0132\033.google.fhir.r4.core." +
      "Coding\0225\n\004item\030\037 \003(\0132\'.google.fhir.r4.co" +
      "re.Questionnaire.Item\032\230\002\n\nStatusCode\022?\n\005" +
      "value\030\001 \001(\01620.google.fhir.r4.core.Public" +
      "ationStatusCode.Value\022\'\n\002id\030\002 \001(\0132\033.goog" +
      "le.fhir.r4.core.String\0221\n\textension\030\003 \003(" +
      "\0132\036.google.fhir.r4.core.Extension:m\300\237\343\266\005" +
      "\001\212\371\203\262\005/http://hl7.org/fhir/ValueSet/publ" +
      "ication-status\232\265\216\223\006,http://hl7.org/fhir/" +
      "StructureDefinition/code\032\224\002\n\017SubjectType" +
      "Code\022:\n\005value\030\001 \001(\0162+.google.fhir.r4.cor" +
      "e.ResourceTypeCode.Value\022\'\n\002id\030\002 \001(\0132\033.g" +
      "oogle.fhir.r4.core.String\0221\n\textension\030\003" +
      " \003(\0132\036.google.fhir.r4.core.Extension:i\300\237" +
      "\343\266\005\001\212\371\203\262\005+http://hl7.org/fhir/ValueSet/r" +
      "esource-types\232\265\216\223\006,http://hl7.org/fhir/S" +
      "tructureDefinition/code\032\345)\n\004Item\022\'\n\002id\030\001" +
      " \001(\0132\033.google.fhir.r4.core.String\0221\n\text" +
      "ension\030\002 \003(\0132\036.google.fhir.r4.core.Exten" +
      "sion\022:\n\022modifier_extension\030\003 \003(\0132\036.googl" +
      "e.fhir.r4.core.Extension\0224\n\007link_id\030\004 \001(" +
      "\0132\033.google.fhir.r4.core.StringB\006\360\320\207\353\004\001\022," +
      "\n\ndefinition\030\005 \001(\0132\030.google.fhir.r4.core" +
      ".Uri\022)\n\004code\030\006 \003(\0132\033.google.fhir.r4.core" +
      ".Coding\022+\n\006prefix\030\007 \001(\0132\033.google.fhir.r4" +
      ".core.String\022)\n\004text\030\010 \001(\0132\033.google.fhir" +
      ".r4.core.String\022F\n\004type\030\t \001(\01320.google.f" +
      "hir.r4.core.Questionnaire.Item.TypeCodeB" +
      "\006\360\320\207\353\004\001\022G\n\013enable_when\030\n \003(\01322.google.fh" +
      "ir.r4.core.Questionnaire.Item.EnableWhen" +
      "\022S\n\017enable_behavior\030\013 \001(\0132:.google.fhir." +
      "r4.core.Questionnaire.Item.EnableBehavio" +
      "rCode\022.\n\010required\030\014 \001(\0132\034.google.fhir.r4" +
      ".core.Boolean\022-\n\007repeats\030\r \001(\0132\034.google." +
      "fhir.r4.core.Boolean\022/\n\tread_only\030\016 \001(\0132" +
      "\034.google.fhir.r4.core.Boolean\0220\n\nmax_len" +
      "gth\030\017 \001(\0132\034.google.fhir.r4.core.Integer\022" +
      "8\n\020answer_value_set\030\020 \001(\0132\036.google.fhir." +
      "r4.core.Canonical\022K\n\ranswer_option\030\021 \003(\013" +
      "24.google.fhir.r4.core.Questionnaire.Ite" +
      "m.AnswerOption\022@\n\007initial\030\022 \003(\0132/.google" +
      ".fhir.r4.core.Questionnaire.Item.Initial" +
      "\0225\n\004item\030\023 \003(\0132\'.google.fhir.r4.core.Que" +
      "stionnaire.Item\032\221\002\n\010TypeCode\022C\n\005value\030\001 " +
      "\001(\01624.google.fhir.r4.core.QuestionnaireI" +
      "temTypeCode.Value\022\'\n\002id\030\002 \001(\0132\033.google.f" +
      "hir.r4.core.String\0221\n\textension\030\003 \003(\0132\036." +
      "google.fhir.r4.core.Extension:d\300\237\343\266\005\001\212\371\203" +
      "\262\005&http://hl7.org/fhir/ValueSet/item-typ" +
      "e\232\265\216\223\006,http://hl7.org/fhir/StructureDefi" +
      "nition/code\032\220\n\n\nEnableWhen\022\'\n\002id\030\001 \001(\0132\033" +
      ".google.fhir.r4.core.String\0221\n\textension" +
      "\030\002 \003(\0132\036.google.fhir.r4.core.Extension\022:" +
      "\n\022modifier_extension\030\003 \003(\0132\036.google.fhir" +
      ".r4.core.Extension\0225\n\010question\030\004 \001(\0132\033.g" +
      "oogle.fhir.r4.core.StringB\006\360\320\207\353\004\001\022Y\n\010ope" +
      "rator\030\005 \001(\0132?.google.fhir.r4.core.Questi" +
      "onnaire.Item.EnableWhen.OperatorCodeB\006\360\320" +
      "\207\353\004\001\022R\n\006answer\030\006 \001(\0132:.google.fhir.r4.co" +
      "re.Questionnaire.Item.EnableWhen.AnswerX" +
      "B\006\360\320\207\353\004\001\032\255\002\n\014OperatorCode\022G\n\005value\030\001 \001(\016" +
      "28.google.fhir.r4.core.QuestionnaireItem" +
      "OperatorCode.Value\022\'\n\002id\030\002 \001(\0132\033.google." +
      "fhir.r4.core.String\0221\n\textension\030\003 \003(\0132\036" +
      ".google.fhir.r4.core.Extension:x\300\237\343\266\005\001\212\371" +
      "\203\262\005:http://hl7.org/fhir/ValueSet/questio" +
      "nnaire-enable-operator\232\265\216\223\006,http://hl7.o" +
      "rg/fhir/StructureDefinition/code\032\234\004\n\007Ans" +
      "werX\022/\n\007boolean\030\001 \001(\0132\034.google.fhir.r4.c" +
      "ore.BooleanH\000\022/\n\007decimal\030\002 \001(\0132\034.google." +
      "fhir.r4.core.DecimalH\000\022/\n\007integer\030\003 \001(\0132" +
      "\034.google.fhir.r4.core.IntegerH\000\022)\n\004date\030" +
      "\004 \001(\0132\031.google.fhir.r4.core.DateH\000\0222\n\tda" +
      "te_time\030\005 \001(\0132\035.google.fhir.r4.core.Date" +
      "TimeH\000\022)\n\004time\030\006 \001(\0132\031.google.fhir.r4.co" +
      "re.TimeH\000\022;\n\014string_value\030\007 \001(\0132\033.google" +
      ".fhir.r4.core.StringH\000R\006string\022-\n\006coding" +
      "\030\010 \001(\0132\033.google.fhir.r4.core.CodingH\000\0221\n" +
      "\010quantity\030\t \001(\0132\035.google.fhir.r4.core.Qu" +
      "antityH\000\022C\n\treference\030\n \001(\0132\036.google.fhi" +
      "r.r4.core.ReferenceB\016\362\377\374\302\006\010ResourceH\000:\006\240" +
      "\203\203\350\006\001B\010\n\006choice:5\232\206\223\240\010/operator = \'exist" +
      "s\' implies (answer is Boolean)\032\254\002\n\022Enabl" +
      "eBehaviorCode\022@\n\005value\030\001 \001(\01621.google.fh" +
      "ir.r4.core.EnableWhenBehaviorCode.Value\022" +
      "\'\n\002id\030\002 \001(\0132\033.google.fhir.r4.core.String" +
      "\0221\n\textension\030\003 \003(\0132\036.google.fhir.r4.cor" +
      "e.Extension:x\300\237\343\266\005\001\212\371\203\262\005:http://hl7.org/" +
      "fhir/ValueSet/questionnaire-enable-behav" +
      "ior\232\265\216\223\006,http://hl7.org/fhir/StructureDe" +
      "finition/code\032\207\005\n\014AnswerOption\022\'\n\002id\030\001 \001" +
      "(\0132\033.google.fhir.r4.core.String\0221\n\texten" +
      "sion\030\002 \003(\0132\036.google.fhir.r4.core.Extensi" +
      "on\022:\n\022modifier_extension\030\003 \003(\0132\036.google." +
      "fhir.r4.core.Extension\022R\n\005value\030\004 \001(\0132;." +
      "google.fhir.r4.core.Questionnaire.Item.A" +
      "nswerOption.ValueXB\006\360\320\207\353\004\001\0226\n\020initial_se" +
      "lected\030\005 \001(\0132\034.google.fhir.r4.core.Boole" +
      "an\032\322\002\n\006ValueX\022/\n\007integer\030\001 \001(\0132\034.google." +
      "fhir.r4.core.IntegerH\000\022)\n\004date\030\002 \001(\0132\031.g" +
      "oogle.fhir.r4.core.DateH\000\022)\n\004time\030\003 \001(\0132" +
      "\031.google.fhir.r4.core.TimeH\000\022;\n\014string_v" +
      "alue\030\004 \001(\0132\033.google.fhir.r4.core.StringH" +
      "\000R\006string\022-\n\006coding\030\005 \001(\0132\033.google.fhir." +
      "r4.core.CodingH\000\022C\n\treference\030\006 \001(\0132\036.go" +
      "ogle.fhir.r4.core.ReferenceB\016\362\377\374\302\006\010Resou" +
      "rceH\000:\006\240\203\203\350\006\001B\010\n\006choice\032\356\006\n\007Initial\022\'\n\002i" +
      "d\030\001 \001(\0132\033.google.fhir.r4.core.String\0221\n\t" +
      "extension\030\002 \003(\0132\036.google.fhir.r4.core.Ex" +
      "tension\022:\n\022modifier_extension\030\003 \003(\0132\036.go" +
      "ogle.fhir.r4.core.Extension\022M\n\005value\030\004 \001" +
      "(\01326.google.fhir.r4.core.Questionnaire.I" +
      "tem.Initial.ValueXB\006\360\320\207\353\004\001\032\373\004\n\006ValueX\022/\n" +
      "\007boolean\030\001 \001(\0132\034.google.fhir.r4.core.Boo" +
      "leanH\000\022/\n\007decimal\030\002 \001(\0132\034.google.fhir.r4" +
      ".core.DecimalH\000\022/\n\007integer\030\003 \001(\0132\034.googl" +
      "e.fhir.r4.core.IntegerH\000\022)\n\004date\030\004 \001(\0132\031" +
      ".google.fhir.r4.core.DateH\000\0222\n\tdate_time" +
      "\030\005 \001(\0132\035.google.fhir.r4.core.DateTimeH\000\022" +
      ")\n\004time\030\006 \001(\0132\031.google.fhir.r4.core.Time" +
      "H\000\022;\n\014string_value\030\007 \001(\0132\033.google.fhir.r" +
      "4.core.StringH\000R\006string\022\'\n\003uri\030\010 \001(\0132\030.g" +
      "oogle.fhir.r4.core.UriH\000\0225\n\nattachment\030\t" +
      " \001(\0132\037.google.fhir.r4.core.AttachmentH\000\022" +
      "-\n\006coding\030\n \001(\0132\033.google.fhir.r4.core.Co" +
      "dingH\000\0221\n\010quantity\030\013 \001(\0132\035.google.fhir.r" +
      "4.core.QuantityH\000\022C\n\treference\030\014 \001(\0132\036.g" +
      "oogle.fhir.r4.core.ReferenceB\016\362\377\374\302\006\010Reso" +
      "urceH\000:\006\240\203\203\350\006\001B\010\n\006choice:\344\006\232\206\223\240\010o(type=\'" +
      "group\' implies item.empty().not()) and (" +
      "type.trace(\'type\')=\'display\' implies ite" +
      "m.trace(\'item\').empty())\232\206\223\240\010\037type!=\'dis" +
      "play\' or code.empty()\232\206\223\240\010.answerOption." +
      "empty() or answerValueSet.empty()\232\206\223\240\010\344\001" +
      "(type =\'choice\' or type = \'open-choice\' " +
      "or type = \'decimal\' or type = \'integer\' " +
      "or type = \'date\' or type = \'dateTime\' or" +
      " type = \'time\' or type = \'string\' or typ" +
      "e = \'quantity\') or (answerValueSet.empty" +
      "() and answerOption.empty())\232\206\223\240\0109type!=" +
      "\'display\' or (required.empty() and repea" +
      "ts.empty())\232\206\223\240\0106(type!=\'group\' and type" +
      "!=\'display\') or initial.empty()\232\206\223\240\010#typ" +
      "e!=\'display\' or readOnly.empty()\232\206\223\240\010n(t" +
      "ype in (\'boolean\' | \'decimal\' | \'integer" +
      "\' | \'string\' | \'text\' | \'url\' | \'open-ch" +
      "oice\')) or maxLength.empty()\232\206\223\240\010\'answer" +
      "Option.empty() or initial.empty()\232\206\223\240\0106e" +
      "nableWhen.count() > 2 implies enableBeha" +
      "vior.exists()\232\206\223\240\010$repeats=true or initi" +
      "al.count() <= 1:\225\010\300\237\343\266\005\003\262\376\344\227\0065http://hl7" +
      ".org/fhir/StructureDefinition/Questionna" +
      "ire\232\206\223\240\010!descendants().linkId.isDistinct" +
      "()\262\365\365\327\t!\n\004code\020\004\032\027Questionnaire.item.cod" +
      "e\262\365\365\327\t@\n\007context\020\004\0323(Questionnaire.useCo" +
      "ntext.value as CodeableConcept)\262\365\365\327\tn\n\020c" +
      "ontext-quantity\020\007\032X(Questionnaire.useCon" +
      "text.value as Quantity) | (Questionnaire" +
      ".useContext.value as Range)\262\365\365\327\t/\n\014conte" +
      "xt-type\020\004\032\035Questionnaire.useContext.code" +
      "\262\365\365\327\t3\n\025context-type-quantity\020\006\032\030Questio" +
      "nnaire.useContext\262\365\365\327\t0\n\022context-type-va" +
      "lue\020\006\032\030Questionnaire.useContext\262\365\365\327\t\034\n\004d" +
      "ate\020\002\032\022Questionnaire.date\262\365\365\327\t-\n\ndefinit" +
      "ion\020\010\032\035Questionnaire.item.definition\262\365\365\327" +
      "\t*\n\013description\020\003\032\031Questionnaire.descrip" +
      "tion\262\365\365\327\t,\n\teffective\020\002\032\035Questionnaire.e" +
      "ffectivePeriod\262\365\365\327\t(\n\nidentifier\020\004\032\030Ques" +
      "tionnaire.identifier\262\365\365\327\t,\n\014jurisdiction" +
      "\020\004\032\032Questionnaire.jurisdiction\262\365\365\327\t\034\n\004na" +
      "me\020\003\032\022Questionnaire.name\262\365\365\327\t&\n\tpublishe" +
      "r\020\003\032\027Questionnaire.publisher\262\365\365\327\t \n\006stat" +
      "us\020\004\032\024Questionnaire.status\262\365\365\327\t+\n\014subjec" +
      "t-type\020\004\032\031Questionnaire.subjectType\262\365\365\327\t" +
      "\036\n\005title\020\003\032\023Questionnaire.title\262\365\365\327\t\032\n\003u" +
      "rl\020\010\032\021Questionnaire.url\262\365\365\327\t\"\n\007version\020\004" +
      "\032\025Questionnaire.versionJ\004\010\007\020\010B!\n\027com.goo" +
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
    internal_static_google_fhir_r4_core_Questionnaire_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_fhir_r4_core_Questionnaire_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_fhir_r4_core_Questionnaire_descriptor,
        new java.lang.String[] { "Id", "Meta", "ImplicitRules", "Language", "Text", "Contained", "Extension", "ModifierExtension", "Url", "Identifier", "Version", "Name", "Title", "DerivedFrom", "Status", "Experimental", "SubjectType", "Date", "Publisher", "Contact", "Description", "UseContext", "Jurisdiction", "Purpose", "Copyright", "ApprovalDate", "LastReviewDate", "EffectivePeriod", "Code", "Item", });
    internal_static_google_fhir_r4_core_Questionnaire_StatusCode_descriptor =
      internal_static_google_fhir_r4_core_Questionnaire_descriptor.getNestedTypes().get(0);
    internal_static_google_fhir_r4_core_Questionnaire_StatusCode_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_fhir_r4_core_Questionnaire_StatusCode_descriptor,
        new java.lang.String[] { "Value", "Id", "Extension", });
    internal_static_google_fhir_r4_core_Questionnaire_SubjectTypeCode_descriptor =
      internal_static_google_fhir_r4_core_Questionnaire_descriptor.getNestedTypes().get(1);
    internal_static_google_fhir_r4_core_Questionnaire_SubjectTypeCode_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_fhir_r4_core_Questionnaire_SubjectTypeCode_descriptor,
        new java.lang.String[] { "Value", "Id", "Extension", });
    internal_static_google_fhir_r4_core_Questionnaire_Item_descriptor =
      internal_static_google_fhir_r4_core_Questionnaire_descriptor.getNestedTypes().get(2);
    internal_static_google_fhir_r4_core_Questionnaire_Item_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_fhir_r4_core_Questionnaire_Item_descriptor,
        new java.lang.String[] { "Id", "Extension", "ModifierExtension", "LinkId", "Definition", "Code", "Prefix", "Text", "Type", "EnableWhen", "EnableBehavior", "Required", "Repeats", "ReadOnly", "MaxLength", "AnswerValueSet", "AnswerOption", "Initial", "Item", });
    internal_static_google_fhir_r4_core_Questionnaire_Item_TypeCode_descriptor =
      internal_static_google_fhir_r4_core_Questionnaire_Item_descriptor.getNestedTypes().get(0);
    internal_static_google_fhir_r4_core_Questionnaire_Item_TypeCode_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_fhir_r4_core_Questionnaire_Item_TypeCode_descriptor,
        new java.lang.String[] { "Value", "Id", "Extension", });
    internal_static_google_fhir_r4_core_Questionnaire_Item_EnableWhen_descriptor =
      internal_static_google_fhir_r4_core_Questionnaire_Item_descriptor.getNestedTypes().get(1);
    internal_static_google_fhir_r4_core_Questionnaire_Item_EnableWhen_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_fhir_r4_core_Questionnaire_Item_EnableWhen_descriptor,
        new java.lang.String[] { "Id", "Extension", "ModifierExtension", "Question", "Operator", "Answer", });
    internal_static_google_fhir_r4_core_Questionnaire_Item_EnableWhen_OperatorCode_descriptor =
      internal_static_google_fhir_r4_core_Questionnaire_Item_EnableWhen_descriptor.getNestedTypes().get(0);
    internal_static_google_fhir_r4_core_Questionnaire_Item_EnableWhen_OperatorCode_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_fhir_r4_core_Questionnaire_Item_EnableWhen_OperatorCode_descriptor,
        new java.lang.String[] { "Value", "Id", "Extension", });
    internal_static_google_fhir_r4_core_Questionnaire_Item_EnableWhen_AnswerX_descriptor =
      internal_static_google_fhir_r4_core_Questionnaire_Item_EnableWhen_descriptor.getNestedTypes().get(1);
    internal_static_google_fhir_r4_core_Questionnaire_Item_EnableWhen_AnswerX_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_fhir_r4_core_Questionnaire_Item_EnableWhen_AnswerX_descriptor,
        new java.lang.String[] { "Boolean", "Decimal", "Integer", "Date", "DateTime", "Time", "StringValue", "Coding", "Quantity", "Reference", "Choice", });
    internal_static_google_fhir_r4_core_Questionnaire_Item_EnableBehaviorCode_descriptor =
      internal_static_google_fhir_r4_core_Questionnaire_Item_descriptor.getNestedTypes().get(2);
    internal_static_google_fhir_r4_core_Questionnaire_Item_EnableBehaviorCode_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_fhir_r4_core_Questionnaire_Item_EnableBehaviorCode_descriptor,
        new java.lang.String[] { "Value", "Id", "Extension", });
    internal_static_google_fhir_r4_core_Questionnaire_Item_AnswerOption_descriptor =
      internal_static_google_fhir_r4_core_Questionnaire_Item_descriptor.getNestedTypes().get(3);
    internal_static_google_fhir_r4_core_Questionnaire_Item_AnswerOption_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_fhir_r4_core_Questionnaire_Item_AnswerOption_descriptor,
        new java.lang.String[] { "Id", "Extension", "ModifierExtension", "Value", "InitialSelected", });
    internal_static_google_fhir_r4_core_Questionnaire_Item_AnswerOption_ValueX_descriptor =
      internal_static_google_fhir_r4_core_Questionnaire_Item_AnswerOption_descriptor.getNestedTypes().get(0);
    internal_static_google_fhir_r4_core_Questionnaire_Item_AnswerOption_ValueX_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_fhir_r4_core_Questionnaire_Item_AnswerOption_ValueX_descriptor,
        new java.lang.String[] { "Integer", "Date", "Time", "StringValue", "Coding", "Reference", "Choice", });
    internal_static_google_fhir_r4_core_Questionnaire_Item_Initial_descriptor =
      internal_static_google_fhir_r4_core_Questionnaire_Item_descriptor.getNestedTypes().get(4);
    internal_static_google_fhir_r4_core_Questionnaire_Item_Initial_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_fhir_r4_core_Questionnaire_Item_Initial_descriptor,
        new java.lang.String[] { "Id", "Extension", "ModifierExtension", "Value", });
    internal_static_google_fhir_r4_core_Questionnaire_Item_Initial_ValueX_descriptor =
      internal_static_google_fhir_r4_core_Questionnaire_Item_Initial_descriptor.getNestedTypes().get(0);
    internal_static_google_fhir_r4_core_Questionnaire_Item_Initial_ValueX_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_fhir_r4_core_Questionnaire_Item_Initial_ValueX_descriptor,
        new java.lang.String[] { "Boolean", "Decimal", "Integer", "Date", "DateTime", "Time", "StringValue", "Uri", "Attachment", "Coding", "Quantity", "Reference", "Choice", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.fhir.proto.Annotations.fhirPathMessageConstraint);
    registry.add(com.google.fhir.proto.Annotations.fhirProfileBase);
    registry.add(com.google.fhir.proto.Annotations.fhirStructureDefinitionUrl);
    registry.add(com.google.fhir.proto.Annotations.fhirValuesetUrl);
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
    com.google.fhir.r4.core.Codes.getDescriptor();
    com.google.fhir.r4.core.Datatypes.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
