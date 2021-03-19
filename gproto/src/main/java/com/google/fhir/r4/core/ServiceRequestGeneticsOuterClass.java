// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/google/fhir/proto/r4/core/profiles/service_request_genetics.proto

package com.google.fhir.r4.core;

public final class ServiceRequestGeneticsOuterClass {
  private ServiceRequestGeneticsOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_fhir_r4_core_ServiceRequestGenetics_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_ServiceRequestGenetics_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_fhir_r4_core_ServiceRequestGenetics_StatusCode_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_ServiceRequestGenetics_StatusCode_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_fhir_r4_core_ServiceRequestGenetics_IntentCode_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_ServiceRequestGenetics_IntentCode_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_fhir_r4_core_ServiceRequestGenetics_PriorityCode_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_ServiceRequestGenetics_PriorityCode_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_fhir_r4_core_ServiceRequestGenetics_QuantityX_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_ServiceRequestGenetics_QuantityX_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_fhir_r4_core_ServiceRequestGenetics_OccurrenceX_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_ServiceRequestGenetics_OccurrenceX_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_fhir_r4_core_ServiceRequestGenetics_AsNeededX_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_ServiceRequestGenetics_AsNeededX_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nGproto/google/fhir/proto/r4/core/profil" +
      "es/service_request_genetics.proto\022\023googl" +
      "e.fhir.r4.core\032\031google/protobuf/any.prot" +
      "o\032)proto/google/fhir/proto/annotations.p" +
      "roto\032+proto/google/fhir/proto/r4/core/co" +
      "des.proto\032/proto/google/fhir/proto/r4/co" +
      "re/datatypes.proto\0320proto/google/fhir/pr" +
      "oto/r4/core/extensions.proto\"\302B\n\026Service" +
      "RequestGenetics\022#\n\002id\030\001 \001(\0132\027.google.fhi" +
      "r.r4.core.Id\022\'\n\004meta\030\002 \001(\0132\031.google.fhir" +
      ".r4.core.Meta\0220\n\016implicit_rules\030\003 \001(\0132\030." +
      "google.fhir.r4.core.Uri\022+\n\010language\030\004 \001(" +
      "\0132\031.google.fhir.r4.core.Code\022,\n\004text\030\005 \001" +
      "(\0132\036.google.fhir.r4.core.Narrative\022\'\n\tco" +
      "ntained\030\006 \003(\0132\024.google.protobuf.Any\0221\n\te" +
      "xtension\030\010 \003(\0132\036.google.fhir.r4.core.Ext" +
      "ension\022:\n\022modifier_extension\030\t \003(\0132\036.goo" +
      "gle.fhir.r4.core.Extension\0223\n\nidentifier" +
      "\030\n \003(\0132\037.google.fhir.r4.core.Identifier\022" +
      ">\n\026instantiates_canonical\030\013 \003(\0132\036.google" +
      ".fhir.r4.core.Canonical\0222\n\020instantiates_" +
      "uri\030\014 \003(\0132\030.google.fhir.r4.core.Uri\022k\n\010b" +
      "ased_on\030\r \003(\0132\036.google.fhir.r4.core.Refe" +
      "renceB9\362\377\374\302\006\010CarePlan\362\377\374\302\006\016ServiceReques" +
      "t\362\377\374\302\006\021MedicationRequest\022F\n\010replaces\030\016 \003" +
      "(\0132\036.google.fhir.r4.core.ReferenceB\024\362\377\374\302" +
      "\006\016ServiceRequest\0224\n\013requisition\030\017 \001(\0132\037." +
      "google.fhir.r4.core.Identifier\022N\n\006status" +
      "\030\020 \001(\01326.google.fhir.r4.core.ServiceRequ" +
      "estGenetics.StatusCodeB\006\360\320\207\353\004\001\022N\n\006intent" +
      "\030\021 \001(\01326.google.fhir.r4.core.ServiceRequ" +
      "estGenetics.IntentCodeB\006\360\320\207\353\004\001\0226\n\010catego" +
      "ry\030\022 \003(\0132$.google.fhir.r4.core.CodeableC" +
      "oncept\022J\n\010priority\030\023 \001(\01328.google.fhir.r" +
      "4.core.ServiceRequestGenetics.PriorityCo" +
      "de\0224\n\016do_not_perform\030\024 \001(\0132\034.google.fhir" +
      ".r4.core.Boolean\0222\n\004code\030\025 \001(\0132$.google." +
      "fhir.r4.core.CodeableConcept\022:\n\014order_de" +
      "tail\030\026 \003(\0132$.google.fhir.r4.core.Codeabl" +
      "eConcept\022G\n\010quantity\030\027 \001(\01325.google.fhir" +
      ".r4.core.ServiceRequestGenetics.Quantity" +
      "X\022i\n\007subject\030\030 \001(\0132\036.google.fhir.r4.core" +
      ".ReferenceB8\360\320\207\353\004\001\362\377\374\302\006\007Patient\362\377\374\302\006\005Gro" +
      "up\362\377\374\302\006\010Location\362\377\374\302\006\006Device\022B\n\tencounte" +
      "r\030\031 \001(\0132\036.google.fhir.r4.core.ReferenceB" +
      "\017\362\377\374\302\006\tEncounter\022K\n\noccurrence\030\032 \001(\01327.g" +
      "oogle.fhir.r4.core.ServiceRequestGenetic" +
      "s.OccurrenceX\022H\n\tas_needed\030\033 \001(\01325.googl" +
      "e.fhir.r4.core.ServiceRequestGenetics.As" +
      "NeededX\0222\n\013authored_on\030\034 \001(\0132\035.google.fh" +
      "ir.r4.core.DateTime\022\231\001\n\trequester\030\035 \001(\0132" +
      "\036.google.fhir.r4.core.ReferenceBf\362\377\374\302\006\014P" +
      "ractitioner\362\377\374\302\006\020PractitionerRole\362\377\374\302\006\014O" +
      "rganization\362\377\374\302\006\007Patient\362\377\374\302\006\rRelatedPer" +
      "son\362\377\374\302\006\006Device\022<\n\016performer_type\030\036 \001(\0132" +
      "$.google.fhir.r4.core.CodeableConcept\022\277\001" +
      "\n\tperformer\030\037 \003(\0132\036.google.fhir.r4.core." +
      "ReferenceB\213\001\362\377\374\302\006\014Practitioner\362\377\374\302\006\020Prac" +
      "titionerRole\362\377\374\302\006\014Organization\362\377\374\302\006\010Care" +
      "Team\362\377\374\302\006\021HealthcareService\362\377\374\302\006\007Patient" +
      "\362\377\374\302\006\006Device\362\377\374\302\006\rRelatedPerson\022;\n\rlocat" +
      "ion_code\030  \003(\0132$.google.fhir.r4.core.Cod" +
      "eableConcept\022J\n\022location_reference\030! \003(\013" +
      "2\036.google.fhir.r4.core.ReferenceB\016\362\377\374\302\006\010" +
      "Location\0229\n\013reason_code\030\" \003(\0132$.google.f" +
      "hir.r4.core.CodeableConcept\022\207\001\n\020reason_r" +
      "eference\030# \003(\0132\036.google.fhir.r4.core.Ref" +
      "erenceBM\362\377\374\302\006\tCondition\362\377\374\302\006\013Observation" +
      "\362\377\374\302\006\020DiagnosticReport\362\377\374\302\006\021DocumentRefe" +
      "rence\022T\n\tinsurance\030$ \003(\0132\036.google.fhir.r" +
      "4.core.ReferenceB!\362\377\374\302\006\010Coverage\362\377\374\302\006\rCl" +
      "aimResponse\022G\n\017supporting_info\030% \003(\0132\036.g" +
      "oogle.fhir.r4.core.ReferenceB\016\362\377\374\302\006\010Reso" +
      "urce\022@\n\010specimen\030& \003(\0132\036.google.fhir.r4." +
      "core.ReferenceB\016\362\377\374\302\006\010Specimen\0227\n\tbody_s" +
      "ite\030\' \003(\0132$.google.fhir.r4.core.Codeable" +
      "Concept\022-\n\004note\030( \003(\0132\037.google.fhir.r4.c" +
      "ore.Annotation\0228\n\023patient_instruction\030) " +
      "\001(\0132\033.google.fhir.r4.core.String\022J\n\020rele" +
      "vant_history\030* \003(\0132\036.google.fhir.r4.core" +
      ".ReferenceB\020\362\377\374\302\006\nProvenance\022\210\001\n\004item\030+ " +
      "\003(\0132).google.fhir.r4.core.DiagnosticRepo" +
      "rtItemBI\252\374\217\223\006Chttp://hl7.org/fhir/Struct" +
      "ureDefinition/servicerequest-geneticsIte" +
      "mR\004Item\032\220\002\n\nStatusCode\022;\n\005value\030\001 \001(\0162,." +
      "google.fhir.r4.core.RequestStatusCode.Va" +
      "lue\022\'\n\002id\030\002 \001(\0132\033.google.fhir.r4.core.St" +
      "ring\0221\n\textension\030\003 \003(\0132\036.google.fhir.r4" +
      ".core.Extension:i\300\237\343\266\005\001\212\371\203\262\005+http://hl7." +
      "org/fhir/ValueSet/request-status\232\265\216\223\006,ht" +
      "tp://hl7.org/fhir/StructureDefinition/co" +
      "de\032\220\002\n\nIntentCode\022;\n\005value\030\001 \001(\0162,.googl" +
      "e.fhir.r4.core.RequestIntentCode.Value\022\'" +
      "\n\002id\030\002 \001(\0132\033.google.fhir.r4.core.String\022" +
      "1\n\textension\030\003 \003(\0132\036.google.fhir.r4.core" +
      ".Extension:i\300\237\343\266\005\001\212\371\203\262\005+http://hl7.org/f" +
      "hir/ValueSet/request-intent\232\265\216\223\006,http://" +
      "hl7.org/fhir/StructureDefinition/code\032\226\002" +
      "\n\014PriorityCode\022=\n\005value\030\001 \001(\0162..google.f" +
      "hir.r4.core.RequestPriorityCode.Value\022\'\n" +
      "\002id\030\002 \001(\0132\033.google.fhir.r4.core.String\0221" +
      "\n\textension\030\003 \003(\0132\036.google.fhir.r4.core." +
      "Extension:k\300\237\343\266\005\001\212\371\203\262\005-http://hl7.org/fh" +
      "ir/ValueSet/request-priority\232\265\216\223\006,http:/" +
      "/hl7.org/fhir/StructureDefinition/code\032\252" +
      "\001\n\tQuantityX\0221\n\010quantity\030\001 \001(\0132\035.google." +
      "fhir.r4.core.QuantityH\000\022+\n\005ratio\030\002 \001(\0132\032" +
      ".google.fhir.r4.core.RatioH\000\022+\n\005range\030\003 " +
      "\001(\0132\032.google.fhir.r4.core.RangeH\000:\006\240\203\203\350\006" +
      "\001B\010\n\006choice\032\261\001\n\013OccurrenceX\0222\n\tdate_time" +
      "\030\001 \001(\0132\035.google.fhir.r4.core.DateTimeH\000\022" +
      "-\n\006period\030\002 \001(\0132\033.google.fhir.r4.core.Pe" +
      "riodH\000\022-\n\006timing\030\003 \001(\0132\033.google.fhir.r4." +
      "core.TimingH\000:\006\240\203\203\350\006\001B\010\n\006choice\032\220\001\n\tAsNe" +
      "ededX\022/\n\007boolean\030\001 \001(\0132\034.google.fhir.r4." +
      "core.BooleanH\000\022@\n\020codeable_concept\030\002 \001(\013" +
      "2$.google.fhir.r4.core.CodeableConceptH\000" +
      ":\006\240\203\203\350\006\001B\010\n\006choice:\226 \300\237\343\266\005\003\232\265\216\223\0066http://" +
      "hl7.org/fhir/StructureDefinition/Service" +
      "Request\262\376\344\227\006?http://hl7.org/fhir/Structu" +
      "reDefinition/servicerequest-genetics\232\206\223\240" +
      "\010$orderDetail.empty() or code.exists()\262\365" +
      "\365\327\t\'\n\010authored\020\002\032\031ServiceRequest.authore" +
      "dOn\262\365\365\327\t$\n\010based-on\020\005\032\026ServiceRequest.ba" +
      "sedOn\262\365\365\327\t&\n\tbody-site\020\004\032\027ServiceRequest" +
      ".bodySite\262\365\365\327\t%\n\010category\020\004\032\027ServiceRequ" +
      "est.category\262\365\365\327\t\364\003\n\004code\020\004\032\351\003AllergyInt" +
      "olerance.code | AllergyIntolerance.react" +
      "ion.substance | Condition.code | (Device" +
      "Request.code as CodeableConcept) | Diagn" +
      "osticReport.code | FamilyMemberHistory.c" +
      "ondition.code | List.code | Medication.c" +
      "ode | (MedicationAdministration.medicati" +
      "on as CodeableConcept) | (MedicationDisp" +
      "ense.medication as CodeableConcept) | (M" +
      "edicationRequest.medication as CodeableC" +
      "oncept) | (MedicationStatement.medicatio" +
      "n as CodeableConcept) | Observation.code" +
      " | Procedure.code | ServiceRequest.code\262" +
      "\365\365\327\t\302\002\n\tencounter\020\005\032\262\002Composition.encoun" +
      "ter | DeviceRequest.encounter | Diagnost" +
      "icReport.encounter | DocumentReference.c" +
      "ontext.encounter | Flag.encounter | List" +
      ".encounter | NutritionOrder.encounter | " +
      "Observation.encounter | Procedure.encoun" +
      "ter | RiskAssessment.encounter | Service" +
      "Request.encounter | VisionPrescription.e" +
      "ncounter\262\365\365\327\t\205\007\n\nidentifier\020\004\032\364\006AllergyI" +
      "ntolerance.identifier | CarePlan.identif" +
      "ier | CareTeam.identifier | Composition." +
      "identifier | Condition.identifier | Cons" +
      "ent.identifier | DetectedIssue.identifie" +
      "r | DeviceRequest.identifier | Diagnosti" +
      "cReport.identifier | DocumentManifest.ma" +
      "sterIdentifier | DocumentManifest.identi" +
      "fier | DocumentReference.masterIdentifie" +
      "r | DocumentReference.identifier | Encou" +
      "nter.identifier | EpisodeOfCare.identifi" +
      "er | FamilyMemberHistory.identifier | Go" +
      "al.identifier | ImagingStudy.identifier " +
      "| Immunization.identifier | List.identif" +
      "ier | MedicationAdministration.identifie" +
      "r | MedicationDispense.identifier | Medi" +
      "cationRequest.identifier | MedicationSta" +
      "tement.identifier | NutritionOrder.ident" +
      "ifier | Observation.identifier | Procedu" +
      "re.identifier | RiskAssessment.identifie" +
      "r | ServiceRequest.identifier | SupplyDe" +
      "livery.identifier | SupplyRequest.identi" +
      "fier | VisionPrescription.identifier\262\365\365\327" +
      "\t@\n\026instantiates-canonical\020\005\032$ServiceReq" +
      "uest.instantiatesCanonical\262\365\365\327\t4\n\020instan" +
      "tiates-uri\020\010\032\036ServiceRequest.instantiate" +
      "sUri\262\365\365\327\t!\n\006intent\020\004\032\025ServiceRequest.int" +
      "ent\262\365\365\327\t)\n\noccurrence\020\002\032\031ServiceRequest." +
      "occurrence\262\365\365\327\t\370\n\n\007patient\020\005\032\352\nAllergyIn" +
      "tolerance.patient | CarePlan.subject.whe" +
      "re(resolve() is Patient) | CareTeam.subj" +
      "ect.where(resolve() is Patient) | Clinic" +
      "alImpression.subject.where(resolve() is " +
      "Patient) | Composition.subject.where(res" +
      "olve() is Patient) | Condition.subject.w" +
      "here(resolve() is Patient) | Consent.pat" +
      "ient | DetectedIssue.patient | DeviceReq" +
      "uest.subject.where(resolve() is Patient)" +
      " | DeviceUseStatement.subject | Diagnost" +
      "icReport.subject.where(resolve() is Pati" +
      "ent) | DocumentManifest.subject.where(re" +
      "solve() is Patient) | DocumentReference." +
      "subject.where(resolve() is Patient) | En" +
      "counter.subject.where(resolve() is Patie" +
      "nt) | EpisodeOfCare.patient | FamilyMemb" +
      "erHistory.patient | Flag.subject.where(r" +
      "esolve() is Patient) | Goal.subject.wher" +
      "e(resolve() is Patient) | ImagingStudy.s" +
      "ubject.where(resolve() is Patient) | Imm" +
      "unization.patient | List.subject.where(r" +
      "esolve() is Patient) | MedicationAdminis" +
      "tration.subject.where(resolve() is Patie" +
      "nt) | MedicationDispense.subject.where(r" +
      "esolve() is Patient) | MedicationRequest" +
      ".subject.where(resolve() is Patient) | M" +
      "edicationStatement.subject.where(resolve" +
      "() is Patient) | NutritionOrder.patient " +
      "| Observation.subject.where(resolve() is" +
      " Patient) | Procedure.subject.where(reso" +
      "lve() is Patient) | RiskAssessment.subje" +
      "ct.where(resolve() is Patient) | Service" +
      "Request.subject.where(resolve() is Patie" +
      "nt) | SupplyDelivery.patient | VisionPre" +
      "scription.patient\262\365\365\327\t\'\n\tperformer\020\005\032\030Se" +
      "rviceRequest.performer\262\365\365\327\t0\n\016performer-" +
      "type\020\004\032\034ServiceRequest.performerType\262\365\365\327" +
      "\t%\n\010priority\020\004\032\027ServiceRequest.priority\262" +
      "\365\365\327\t%\n\010replaces\020\005\032\027ServiceRequest.replac" +
      "es\262\365\365\327\t\'\n\trequester\020\005\032\030ServiceRequest.re" +
      "quester\262\365\365\327\t+\n\013requisition\020\004\032\032ServiceReq" +
      "uest.requisition\262\365\365\327\t%\n\010specimen\020\005\032\027Serv" +
      "iceRequest.specimen\262\365\365\327\t!\n\006status\020\004\032\025Ser" +
      "viceRequest.status\262\365\365\327\t#\n\007subject\020\005\032\026Ser" +
      "viceRequest.subjectJ\004\010\007\020\010B!\n\027com.google." +
      "fhir.r4.coreP\001\230\306\260\265\007\004b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.AnyProto.getDescriptor(),
          com.google.fhir.proto.Annotations.getDescriptor(),
          com.google.fhir.r4.core.Codes.getDescriptor(),
          com.google.fhir.r4.core.Datatypes.getDescriptor(),
          com.google.fhir.r4.core.Extensions.getDescriptor(),
        });
    internal_static_google_fhir_r4_core_ServiceRequestGenetics_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_fhir_r4_core_ServiceRequestGenetics_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_fhir_r4_core_ServiceRequestGenetics_descriptor,
        new java.lang.String[] { "Id", "Meta", "ImplicitRules", "Language", "Text", "Contained", "Extension", "ModifierExtension", "Identifier", "InstantiatesCanonical", "InstantiatesUri", "BasedOn", "Replaces", "Requisition", "Status", "Intent", "Category", "Priority", "DoNotPerform", "Code", "OrderDetail", "Quantity", "Subject", "Encounter", "Occurrence", "AsNeeded", "AuthoredOn", "Requester", "PerformerType", "Performer", "LocationCode", "LocationReference", "ReasonCode", "ReasonReference", "Insurance", "SupportingInfo", "Specimen", "BodySite", "Note", "PatientInstruction", "RelevantHistory", "Item", });
    internal_static_google_fhir_r4_core_ServiceRequestGenetics_StatusCode_descriptor =
      internal_static_google_fhir_r4_core_ServiceRequestGenetics_descriptor.getNestedTypes().get(0);
    internal_static_google_fhir_r4_core_ServiceRequestGenetics_StatusCode_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_fhir_r4_core_ServiceRequestGenetics_StatusCode_descriptor,
        new java.lang.String[] { "Value", "Id", "Extension", });
    internal_static_google_fhir_r4_core_ServiceRequestGenetics_IntentCode_descriptor =
      internal_static_google_fhir_r4_core_ServiceRequestGenetics_descriptor.getNestedTypes().get(1);
    internal_static_google_fhir_r4_core_ServiceRequestGenetics_IntentCode_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_fhir_r4_core_ServiceRequestGenetics_IntentCode_descriptor,
        new java.lang.String[] { "Value", "Id", "Extension", });
    internal_static_google_fhir_r4_core_ServiceRequestGenetics_PriorityCode_descriptor =
      internal_static_google_fhir_r4_core_ServiceRequestGenetics_descriptor.getNestedTypes().get(2);
    internal_static_google_fhir_r4_core_ServiceRequestGenetics_PriorityCode_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_fhir_r4_core_ServiceRequestGenetics_PriorityCode_descriptor,
        new java.lang.String[] { "Value", "Id", "Extension", });
    internal_static_google_fhir_r4_core_ServiceRequestGenetics_QuantityX_descriptor =
      internal_static_google_fhir_r4_core_ServiceRequestGenetics_descriptor.getNestedTypes().get(3);
    internal_static_google_fhir_r4_core_ServiceRequestGenetics_QuantityX_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_fhir_r4_core_ServiceRequestGenetics_QuantityX_descriptor,
        new java.lang.String[] { "Quantity", "Ratio", "Range", "Choice", });
    internal_static_google_fhir_r4_core_ServiceRequestGenetics_OccurrenceX_descriptor =
      internal_static_google_fhir_r4_core_ServiceRequestGenetics_descriptor.getNestedTypes().get(4);
    internal_static_google_fhir_r4_core_ServiceRequestGenetics_OccurrenceX_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_fhir_r4_core_ServiceRequestGenetics_OccurrenceX_descriptor,
        new java.lang.String[] { "DateTime", "Period", "Timing", "Choice", });
    internal_static_google_fhir_r4_core_ServiceRequestGenetics_AsNeededX_descriptor =
      internal_static_google_fhir_r4_core_ServiceRequestGenetics_descriptor.getNestedTypes().get(5);
    internal_static_google_fhir_r4_core_ServiceRequestGenetics_AsNeededX_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_fhir_r4_core_ServiceRequestGenetics_AsNeededX_descriptor,
        new java.lang.String[] { "Boolean", "CodeableConcept", "Choice", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.fhir.proto.Annotations.fhirInlinedExtensionUrl);
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
    com.google.fhir.r4.core.Extensions.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
