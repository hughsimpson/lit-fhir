// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/google/fhir/proto/r4/core/resources/diagnostic_report.proto

package com.google.fhir.r4.core;

public final class DiagnosticReportOuterClass {
  private DiagnosticReportOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_fhir_r4_core_DiagnosticReport_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_DiagnosticReport_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_fhir_r4_core_DiagnosticReport_StatusCode_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_DiagnosticReport_StatusCode_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_fhir_r4_core_DiagnosticReport_EffectiveX_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_DiagnosticReport_EffectiveX_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_fhir_r4_core_DiagnosticReport_Media_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_DiagnosticReport_Media_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nAproto/google/fhir/proto/r4/core/resour" +
      "ces/diagnostic_report.proto\022\023google.fhir" +
      ".r4.core\032\031google/protobuf/any.proto\032)pro" +
      "to/google/fhir/proto/annotations.proto\032+" +
      "proto/google/fhir/proto/r4/core/codes.pr" +
      "oto\032/proto/google/fhir/proto/r4/core/dat" +
      "atypes.proto\"\3624\n\020DiagnosticReport\022#\n\002id\030" +
      "\001 \001(\0132\027.google.fhir.r4.core.Id\022\'\n\004meta\030\002" +
      " \001(\0132\031.google.fhir.r4.core.Meta\0220\n\016impli" +
      "cit_rules\030\003 \001(\0132\030.google.fhir.r4.core.Ur" +
      "i\022+\n\010language\030\004 \001(\0132\031.google.fhir.r4.cor" +
      "e.Code\022,\n\004text\030\005 \001(\0132\036.google.fhir.r4.co" +
      "re.Narrative\022\'\n\tcontained\030\006 \003(\0132\024.google" +
      ".protobuf.Any\0221\n\textension\030\010 \003(\0132\036.googl" +
      "e.fhir.r4.core.Extension\022:\n\022modifier_ext" +
      "ension\030\t \003(\0132\036.google.fhir.r4.core.Exten" +
      "sion\0223\n\nidentifier\030\n \003(\0132\037.google.fhir.r" +
      "4.core.Identifier\022\237\001\n\010based_on\030\013 \003(\0132\036.g" +
      "oogle.fhir.r4.core.ReferenceBm\362\377\374\302\006\010Care" +
      "Plan\362\377\374\302\006\032ImmunizationRecommendation\362\377\374\302" +
      "\006\021MedicationRequest\362\377\374\302\006\016NutritionOrder\362" +
      "\377\374\302\006\016ServiceRequest\022H\n\006status\030\014 \001(\01320.go" +
      "ogle.fhir.r4.core.DiagnosticReport.Statu" +
      "sCodeB\006\360\320\207\353\004\001\0226\n\010category\030\r \003(\0132$.google" +
      ".fhir.r4.core.CodeableConcept\022:\n\004code\030\016 " +
      "\001(\0132$.google.fhir.r4.core.CodeableConcep" +
      "tB\006\360\320\207\353\004\001\022c\n\007subject\030\017 \001(\0132\036.google.fhir" +
      ".r4.core.ReferenceB2\362\377\374\302\006\007Patient\362\377\374\302\006\005G" +
      "roup\362\377\374\302\006\006Device\362\377\374\302\006\010Location\022B\n\tencoun" +
      "ter\030\020 \001(\0132\036.google.fhir.r4.core.Referenc" +
      "eB\017\362\377\374\302\006\tEncounter\022C\n\teffective\030\021 \001(\01320." +
      "google.fhir.r4.core.DiagnosticReport.Eff" +
      "ectiveX\022,\n\006issued\030\022 \001(\0132\034.google.fhir.r4" +
      ".core.Instant\022{\n\tperformer\030\023 \003(\0132\036.googl" +
      "e.fhir.r4.core.ReferenceBH\362\377\374\302\006\014Practiti" +
      "oner\362\377\374\302\006\020PractitionerRole\362\377\374\302\006\014Organiza" +
      "tion\362\377\374\302\006\010CareTeam\022\205\001\n\023results_interpret" +
      "er\030\024 \003(\0132\036.google.fhir.r4.core.Reference" +
      "BH\362\377\374\302\006\014Practitioner\362\377\374\302\006\020PractitionerRo" +
      "le\362\377\374\302\006\014Organization\362\377\374\302\006\010CareTeam\022@\n\010sp" +
      "ecimen\030\025 \003(\0132\036.google.fhir.r4.core.Refer" +
      "enceB\016\362\377\374\302\006\010Specimen\022A\n\006result\030\026 \003(\0132\036.g" +
      "oogle.fhir.r4.core.ReferenceB\021\362\377\374\302\006\013Obse" +
      "rvation\022I\n\rimaging_study\030\027 \003(\0132\036.google." +
      "fhir.r4.core.ReferenceB\022\362\377\374\302\006\014ImagingStu" +
      "dy\022:\n\005media\030\030 \003(\0132+.google.fhir.r4.core." +
      "DiagnosticReport.Media\022/\n\nconclusion\030\031 \001" +
      "(\0132\033.google.fhir.r4.core.String\022=\n\017concl" +
      "usion_code\030\032 \003(\0132$.google.fhir.r4.core.C" +
      "odeableConcept\0227\n\016presented_form\030\033 \003(\0132\037" +
      ".google.fhir.r4.core.Attachment\032\243\002\n\nStat" +
      "usCode\022D\n\005value\030\001 \001(\01625.google.fhir.r4.c" +
      "ore.DiagnosticReportStatusCode.Value\022\'\n\002" +
      "id\030\002 \001(\0132\033.google.fhir.r4.core.String\0221\n" +
      "\textension\030\003 \003(\0132\036.google.fhir.r4.core.E" +
      "xtension:s\300\237\343\266\005\001\212\371\203\262\0055http://hl7.org/fhi" +
      "r/ValueSet/diagnostic-report-status\232\265\216\223\006" +
      ",http://hl7.org/fhir/StructureDefinition" +
      "/code\032\201\001\n\nEffectiveX\0222\n\tdate_time\030\001 \001(\0132" +
      "\035.google.fhir.r4.core.DateTimeH\000\022-\n\006peri" +
      "od\030\002 \001(\0132\033.google.fhir.r4.core.PeriodH\000:" +
      "\006\240\203\203\350\006\001B\010\n\006choice\032\216\002\n\005Media\022\'\n\002id\030\001 \001(\0132" +
      "\033.google.fhir.r4.core.String\0221\n\textensio" +
      "n\030\002 \003(\0132\036.google.fhir.r4.core.Extension\022" +
      ":\n\022modifier_extension\030\003 \003(\0132\036.google.fhi" +
      "r.r4.core.Extension\022,\n\007comment\030\004 \001(\0132\033.g" +
      "oogle.fhir.r4.core.String\022?\n\004link\030\005 \001(\0132" +
      "\036.google.fhir.r4.core.ReferenceB\021\360\320\207\353\004\001\362" +
      "\377\374\302\006\005Media:\276!\300\237\343\266\005\003\262\376\344\227\0068http://hl7.org/" +
      "fhir/StructureDefinition/DiagnosticRepor" +
      "t\262\365\365\327\t\210\001\n\022assessed-condition\020\005\032pDiagnost" +
      "icReport.extension(\'http://hl7.org/fhir/" +
      "StructureDefinition/DiagnosticReport-gen" +
      "eticsAssessedCondition\')\262\365\365\327\t&\n\010based-on" +
      "\020\005\032\030DiagnosticReport.basedOn\262\365\365\327\t\'\n\010cate" +
      "gory\020\004\032\031DiagnosticReport.category\262\365\365\327\t\364\003" +
      "\n\004code\020\004\032\351\003AllergyIntolerance.code | All" +
      "ergyIntolerance.reaction.substance | Con" +
      "dition.code | (DeviceRequest.code as Cod" +
      "eableConcept) | DiagnosticReport.code | " +
      "FamilyMemberHistory.condition.code | Lis" +
      "t.code | Medication.code | (MedicationAd" +
      "ministration.medication as CodeableConce" +
      "pt) | (MedicationDispense.medication as " +
      "CodeableConcept) | (MedicationRequest.me" +
      "dication as CodeableConcept) | (Medicati" +
      "onStatement.medication as CodeableConcep" +
      "t) | Observation.code | Procedure.code |" +
      " ServiceRequest.code\262\365\365\327\t/\n\nconclusion\020\004" +
      "\032\037DiagnosticReport.conclusionCode\262\365\365\327\t\227\003" +
      "\n\004date\020\002\032\214\003AllergyIntolerance.recordedDa" +
      "te | CarePlan.period | CareTeam.period |" +
      " ClinicalImpression.date | Composition.d" +
      "ate | Consent.dateTime | DiagnosticRepor" +
      "t.effective | Encounter.period | Episode" +
      "OfCare.period | FamilyMemberHistory.date" +
      " | Flag.period | Immunization.occurrence" +
      " | List.date | Observation.effective | P" +
      "rocedure.performed | (RiskAssessment.occ" +
      "urrence as dateTime) | SupplyRequest.aut" +
      "horedOn\262\365\365\327\t\302\002\n\tencounter\020\005\032\262\002Compositio" +
      "n.encounter | DeviceRequest.encounter | " +
      "DiagnosticReport.encounter | DocumentRef" +
      "erence.context.encounter | Flag.encounte" +
      "r | List.encounter | NutritionOrder.enco" +
      "unter | Observation.encounter | Procedur" +
      "e.encounter | RiskAssessment.encounter |" +
      " ServiceRequest.encounter | VisionPrescr" +
      "iption.encounter\262\365\365\327\t\205\007\n\nidentifier\020\004\032\364\006" +
      "AllergyIntolerance.identifier | CarePlan" +
      ".identifier | CareTeam.identifier | Comp" +
      "osition.identifier | Condition.identifie" +
      "r | Consent.identifier | DetectedIssue.i" +
      "dentifier | DeviceRequest.identifier | D" +
      "iagnosticReport.identifier | DocumentMan" +
      "ifest.masterIdentifier | DocumentManifes" +
      "t.identifier | DocumentReference.masterI" +
      "dentifier | DocumentReference.identifier" +
      " | Encounter.identifier | EpisodeOfCare." +
      "identifier | FamilyMemberHistory.identif" +
      "ier | Goal.identifier | ImagingStudy.ide" +
      "ntifier | Immunization.identifier | List" +
      ".identifier | MedicationAdministration.i" +
      "dentifier | MedicationDispense.identifie" +
      "r | MedicationRequest.identifier | Medic" +
      "ationStatement.identifier | NutritionOrd" +
      "er.identifier | Observation.identifier |" +
      " Procedure.identifier | RiskAssessment.i" +
      "dentifier | ServiceRequest.identifier | " +
      "SupplyDelivery.identifier | SupplyReques" +
      "t.identifier | VisionPrescription.identi" +
      "fier\262\365\365\327\t#\n\006issued\020\002\032\027DiagnosticReport.i" +
      "ssued\262\365\365\327\t&\n\005media\020\005\032\033DiagnosticReport.m" +
      "edia.link\262\365\365\327\t\370\n\n\007patient\020\005\032\352\nAllergyInt" +
      "olerance.patient | CarePlan.subject.wher" +
      "e(resolve() is Patient) | CareTeam.subje" +
      "ct.where(resolve() is Patient) | Clinica" +
      "lImpression.subject.where(resolve() is P" +
      "atient) | Composition.subject.where(reso" +
      "lve() is Patient) | Condition.subject.wh" +
      "ere(resolve() is Patient) | Consent.pati" +
      "ent | DetectedIssue.patient | DeviceRequ" +
      "est.subject.where(resolve() is Patient) " +
      "| DeviceUseStatement.subject | Diagnosti" +
      "cReport.subject.where(resolve() is Patie" +
      "nt) | DocumentManifest.subject.where(res" +
      "olve() is Patient) | DocumentReference.s" +
      "ubject.where(resolve() is Patient) | Enc" +
      "ounter.subject.where(resolve() is Patien" +
      "t) | EpisodeOfCare.patient | FamilyMembe" +
      "rHistory.patient | Flag.subject.where(re" +
      "solve() is Patient) | Goal.subject.where" +
      "(resolve() is Patient) | ImagingStudy.su" +
      "bject.where(resolve() is Patient) | Immu" +
      "nization.patient | List.subject.where(re" +
      "solve() is Patient) | MedicationAdminist" +
      "ration.subject.where(resolve() is Patien" +
      "t) | MedicationDispense.subject.where(re" +
      "solve() is Patient) | MedicationRequest." +
      "subject.where(resolve() is Patient) | Me" +
      "dicationStatement.subject.where(resolve(" +
      ") is Patient) | NutritionOrder.patient |" +
      " Observation.subject.where(resolve() is " +
      "Patient) | Procedure.subject.where(resol" +
      "ve() is Patient) | RiskAssessment.subjec" +
      "t.where(resolve() is Patient) | ServiceR" +
      "equest.subject.where(resolve() is Patien" +
      "t) | SupplyDelivery.patient | VisionPres" +
      "cription.patient\262\365\365\327\t)\n\tperformer\020\005\032\032Dia" +
      "gnosticReport.performer\262\365\365\327\t#\n\006result\020\005\032" +
      "\027DiagnosticReport.result\262\365\365\327\t<\n\023results-" +
      "interpreter\020\005\032#DiagnosticReport.resultsI" +
      "nterpreter\262\365\365\327\t\'\n\010specimen\020\005\032\031Diagnostic" +
      "Report.specimen\262\365\365\327\t#\n\006status\020\004\032\027Diagnos" +
      "ticReport.status\262\365\365\327\t%\n\007subject\020\005\032\030Diagn" +
      "osticReport.subjectJ\004\010\007\020\010B!\n\027com.google." +
      "fhir.r4.coreP\001\230\306\260\265\007\004b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.AnyProto.getDescriptor(),
          com.google.fhir.proto.Annotations.getDescriptor(),
          com.google.fhir.r4.core.Codes.getDescriptor(),
          com.google.fhir.r4.core.Datatypes.getDescriptor(),
        });
    internal_static_google_fhir_r4_core_DiagnosticReport_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_fhir_r4_core_DiagnosticReport_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_fhir_r4_core_DiagnosticReport_descriptor,
        new java.lang.String[] { "Id", "Meta", "ImplicitRules", "Language", "Text", "Contained", "Extension", "ModifierExtension", "Identifier", "BasedOn", "Status", "Category", "Code", "Subject", "Encounter", "Effective", "Issued", "Performer", "ResultsInterpreter", "Specimen", "Result", "ImagingStudy", "Media", "Conclusion", "ConclusionCode", "PresentedForm", });
    internal_static_google_fhir_r4_core_DiagnosticReport_StatusCode_descriptor =
      internal_static_google_fhir_r4_core_DiagnosticReport_descriptor.getNestedTypes().get(0);
    internal_static_google_fhir_r4_core_DiagnosticReport_StatusCode_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_fhir_r4_core_DiagnosticReport_StatusCode_descriptor,
        new java.lang.String[] { "Value", "Id", "Extension", });
    internal_static_google_fhir_r4_core_DiagnosticReport_EffectiveX_descriptor =
      internal_static_google_fhir_r4_core_DiagnosticReport_descriptor.getNestedTypes().get(1);
    internal_static_google_fhir_r4_core_DiagnosticReport_EffectiveX_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_fhir_r4_core_DiagnosticReport_EffectiveX_descriptor,
        new java.lang.String[] { "DateTime", "Period", "Choice", });
    internal_static_google_fhir_r4_core_DiagnosticReport_Media_descriptor =
      internal_static_google_fhir_r4_core_DiagnosticReport_descriptor.getNestedTypes().get(2);
    internal_static_google_fhir_r4_core_DiagnosticReport_Media_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_fhir_r4_core_DiagnosticReport_Media_descriptor,
        new java.lang.String[] { "Id", "Extension", "ModifierExtension", "Comment", "Link", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
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
