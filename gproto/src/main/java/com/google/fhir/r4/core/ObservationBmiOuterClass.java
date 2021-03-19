// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/google/fhir/proto/r4/core/profiles/observation_bmi.proto

package com.google.fhir.r4.core;

public final class ObservationBmiOuterClass {
  private ObservationBmiOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_fhir_r4_core_ObservationBmi_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_ObservationBmi_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_fhir_r4_core_ObservationBmi_StatusCode_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_ObservationBmi_StatusCode_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_fhir_r4_core_ObservationBmi_CodeableConceptForCode_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_ObservationBmi_CodeableConceptForCode_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_fhir_r4_core_ObservationBmi_EffectiveX_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_ObservationBmi_EffectiveX_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_fhir_r4_core_ObservationBmi_ValueX_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_ObservationBmi_ValueX_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_fhir_r4_core_ObservationBmi_ReferenceRange_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_ObservationBmi_ReferenceRange_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_fhir_r4_core_ObservationBmi_Component_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_ObservationBmi_Component_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_fhir_r4_core_ObservationBmi_Component_ValueX_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_ObservationBmi_Component_ValueX_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n>proto/google/fhir/proto/r4/core/profil" +
      "es/observation_bmi.proto\022\023google.fhir.r4" +
      ".core\032\031google/protobuf/any.proto\032)proto/" +
      "google/fhir/proto/annotations.proto\032+pro" +
      "to/google/fhir/proto/r4/core/codes.proto" +
      "\032/proto/google/fhir/proto/r4/core/dataty" +
      "pes.proto\"\371[\n\016ObservationBmi\022#\n\002id\030\001 \001(\013" +
      "2\027.google.fhir.r4.core.Id\022\'\n\004meta\030\002 \001(\0132" +
      "\031.google.fhir.r4.core.Meta\0220\n\016implicit_r" +
      "ules\030\003 \001(\0132\030.google.fhir.r4.core.Uri\022+\n\010" +
      "language\030\004 \001(\0132\031.google.fhir.r4.core.Cod" +
      "e\022,\n\004text\030\005 \001(\0132\036.google.fhir.r4.core.Na" +
      "rrative\022\'\n\tcontained\030\006 \003(\0132\024.google.prot" +
      "obuf.Any\0221\n\textension\030\010 \003(\0132\036.google.fhi" +
      "r.r4.core.Extension\022:\n\022modifier_extensio" +
      "n\030\t \003(\0132\036.google.fhir.r4.core.Extension\022" +
      "3\n\nidentifier\030\n \003(\0132\037.google.fhir.r4.cor" +
      "e.Identifier\022\263\001\n\010based_on\030\013 \003(\0132\036.google" +
      ".fhir.r4.core.ReferenceB\200\001\362\377\374\302\006\010CarePlan" +
      "\362\377\374\302\006\rDeviceRequest\362\377\374\302\006\032ImmunizationRec" +
      "ommendation\362\377\374\302\006\021MedicationRequest\362\377\374\302\006\016" +
      "NutritionOrder\362\377\374\302\006\016ServiceRequest\022\264\001\n\007p" +
      "art_of\030\014 \003(\0132\036.google.fhir.r4.core.Refer" +
      "enceB\202\001\362\377\374\302\006\030MedicationAdministration\362\377\374" +
      "\302\006\022MedicationDispense\362\377\374\302\006\023MedicationSta" +
      "tement\362\377\374\302\006\tProcedure\362\377\374\302\006\014Immunization\362" +
      "\377\374\302\006\014ImagingStudy\022F\n\006status\030\r \001(\0132..goog" +
      "le.fhir.r4.core.ObservationBmi.StatusCod" +
      "eB\006\360\320\207\353\004\001\022>\n\010category\030\016 \003(\0132$.google.fhi" +
      "r.r4.core.CodeableConceptB\006\360\320\207\353\004\001\022P\n\004cod" +
      "e\030\017 \001(\0132:.google.fhir.r4.core.Observatio" +
      "nBmi.CodeableConceptForCodeB\006\360\320\207\353\004\001\022D\n\007s" +
      "ubject\030\020 \001(\0132\036.google.fhir.r4.core.Refer" +
      "enceB\023\360\320\207\353\004\001\362\377\374\302\006\007Patient\022=\n\005focus\030\021 \003(\013" +
      "2\036.google.fhir.r4.core.ReferenceB\016\362\377\374\302\006\010" +
      "Resource\022B\n\tencounter\030\022 \001(\0132\036.google.fhi" +
      "r.r4.core.ReferenceB\017\362\377\374\302\006\tEncounter\022I\n\t" +
      "effective\030\023 \001(\0132..google.fhir.r4.core.Ob" +
      "servationBmi.EffectiveXB\006\360\320\207\353\004\001\022,\n\006issue" +
      "d\030\024 \001(\0132\034.google.fhir.r4.core.Instant\022\233\001" +
      "\n\tperformer\030\025 \003(\0132\036.google.fhir.r4.core." +
      "ReferenceBh\362\377\374\302\006\014Practitioner\362\377\374\302\006\020Pract" +
      "itionerRole\362\377\374\302\006\014Organization\362\377\374\302\006\010CareT" +
      "eam\362\377\374\302\006\007Patient\362\377\374\302\006\rRelatedPerson\022A\n\005v" +
      "alue\030\026 \001(\0132*.google.fhir.r4.core.Observa" +
      "tionBmi.ValueXB\006\360\320\207\353\004\001\022@\n\022data_absent_re" +
      "ason\030\027 \001(\0132$.google.fhir.r4.core.Codeabl" +
      "eConcept\022<\n\016interpretation\030\030 \003(\0132$.googl" +
      "e.fhir.r4.core.CodeableConcept\022-\n\004note\030\031" +
      " \003(\0132\037.google.fhir.r4.core.Annotation\0227\n" +
      "\tbody_site\030\032 \001(\0132$.google.fhir.r4.core.C" +
      "odeableConcept\0224\n\006method\030\033 \001(\0132$.google." +
      "fhir.r4.core.CodeableConcept\022@\n\010specimen" +
      "\030\034 \001(\0132\036.google.fhir.r4.core.ReferenceB\016" +
      "\362\377\374\302\006\010Specimen\022N\n\006device\030\035 \001(\0132\036.google." +
      "fhir.r4.core.ReferenceB\036\362\377\374\302\006\006Device\362\377\374\302" +
      "\006\014DeviceMetric\022K\n\017reference_range\030\036 \003(\0132" +
      "2.google.fhir.r4.core.ObservationBmi.Ref" +
      "erenceRange\022w\n\nhas_member\030\037 \003(\0132\036.google" +
      ".fhir.r4.core.ReferenceBC\362\377\374\302\006\025Questionn" +
      "aireResponse\362\377\374\302\006\021MolecularSequence\362\377\374\302\006" +
      "\013Observation\022\255\001\n\014derived_from\030  \003(\0132\036.go" +
      "ogle.fhir.r4.core.ReferenceBw\362\377\374\302\006\021Docum" +
      "entReference\362\377\374\302\006\014ImagingStudy\362\377\374\302\006\005Medi" +
      "a\362\377\374\302\006\025QuestionnaireResponse\362\377\374\302\006\021Molecu" +
      "larSequence\362\377\374\302\006\013Observation\022@\n\tcomponen" +
      "t\030! \003(\0132-.google.fhir.r4.core.Observatio" +
      "nBmi.Component\032\230\002\n\nStatusCode\022?\n\005value\030\001" +
      " \001(\01620.google.fhir.r4.core.ObservationSt" +
      "atusCode.Value\022\'\n\002id\030\002 \001(\0132\033.google.fhir" +
      ".r4.core.String\0221\n\textension\030\003 \003(\0132\036.goo" +
      "gle.fhir.r4.core.Extension:m\300\237\343\266\005\001\212\371\203\262\005/" +
      "http://hl7.org/fhir/ValueSet/observation" +
      "-status\232\265\216\223\006,http://hl7.org/fhir/Structu" +
      "reDefinition/code\032\365\002\n\026CodeableConceptFor" +
      "Code\022\'\n\002id\030\001 \001(\0132\033.google.fhir.r4.core.S" +
      "tring\0221\n\textension\030\002 \003(\0132\036.google.fhir.r" +
      "4.core.Extension\022+\n\006coding\030\003 \003(\0132\033.googl" +
      "e.fhir.r4.core.Coding\022)\n\004text\030\004 \001(\0132\033.go" +
      "ogle.fhir.r4.core.String\022h\n\010bmi_code\030\005 \001" +
      "(\0132(.google.fhir.r4.core.CodingWithFixed" +
      "CodeB#\372\347\224\250\006\020http://loinc.org\242\274\227\251\006\00739156-" +
      "5R\007BMICode:=\232\265\216\223\0067http://hl7.org/fhir/St" +
      "ructureDefinition/CodeableConcept\032\263\001\n\nEf" +
      "fectiveX\0222\n\tdate_time\030\001 \001(\0132\035.google.fhi" +
      "r.r4.core.DateTimeH\000\022-\n\006period\030\002 \001(\0132\033.g" +
      "oogle.fhir.r4.core.PeriodH\000:8\232\206\223\240\010,($thi" +
      "s as dateTime).toString().length() >= 8\240" +
      "\203\203\350\006\001B\010\n\006choice\032M\n\006ValueX\0221\n\010quantity\030\001 " +
      "\001(\0132\035.google.fhir.r4.core.QuantityH\000:\006\240\203" +
      "\203\350\006\001B\010\n\006choice\032\205\004\n\016ReferenceRange\022\'\n\002id\030" +
      "\001 \001(\0132\033.google.fhir.r4.core.String\0221\n\tex" +
      "tension\030\002 \003(\0132\036.google.fhir.r4.core.Exte" +
      "nsion\022:\n\022modifier_extension\030\003 \003(\0132\036.goog" +
      "le.fhir.r4.core.Extension\0220\n\003low\030\004 \001(\0132#" +
      ".google.fhir.r4.core.SimpleQuantity\0221\n\004h" +
      "igh\030\005 \001(\0132#.google.fhir.r4.core.SimpleQu" +
      "antity\0222\n\004type\030\006 \001(\0132$.google.fhir.r4.co" +
      "re.CodeableConcept\0228\n\napplies_to\030\007 \003(\0132$" +
      ".google.fhir.r4.core.CodeableConcept\022\'\n\003" +
      "age\030\010 \001(\0132\032.google.fhir.r4.core.Range\022)\n" +
      "\004text\030\t \001(\0132\033.google.fhir.r4.core.String" +
      ":4\232\206\223\240\010.low.exists() or high.exists() or" +
      " text.exists()\032\367\010\n\tComponent\022\'\n\002id\030\001 \001(\013" +
      "2\033.google.fhir.r4.core.String\0221\n\textensi" +
      "on\030\002 \003(\0132\036.google.fhir.r4.core.Extension" +
      "\022:\n\022modifier_extension\030\003 \003(\0132\036.google.fh" +
      "ir.r4.core.Extension\022:\n\004code\030\004 \001(\0132$.goo" +
      "gle.fhir.r4.core.CodeableConceptB\006\360\320\207\353\004\001" +
      "\022C\n\005value\030\005 \001(\01324.google.fhir.r4.core.Ob" +
      "servationBmi.Component.ValueX\022@\n\022data_ab" +
      "sent_reason\030\006 \001(\0132$.google.fhir.r4.core." +
      "CodeableConcept\022<\n\016interpretation\030\007 \003(\0132" +
      "$.google.fhir.r4.core.CodeableConcept\022K\n" +
      "\017reference_range\030\010 \003(\01322.google.fhir.r4." +
      "core.ObservationBmi.ReferenceRange\032\320\004\n\006V" +
      "alueX\0221\n\010quantity\030\001 \001(\0132\035.google.fhir.r4" +
      ".core.QuantityH\000\022@\n\020codeable_concept\030\002 \001" +
      "(\0132$.google.fhir.r4.core.CodeableConcept" +
      "H\000\022;\n\014string_value\030\003 \001(\0132\033.google.fhir.r" +
      "4.core.StringH\000R\006string\022/\n\007boolean\030\004 \001(\013" +
      "2\034.google.fhir.r4.core.BooleanH\000\022/\n\007inte" +
      "ger\030\005 \001(\0132\034.google.fhir.r4.core.IntegerH" +
      "\000\022+\n\005range\030\006 \001(\0132\032.google.fhir.r4.core.R" +
      "angeH\000\022+\n\005ratio\030\007 \001(\0132\032.google.fhir.r4.c" +
      "ore.RatioH\000\0228\n\014sampled_data\030\010 \001(\0132 .goog" +
      "le.fhir.r4.core.SampledDataH\000\022)\n\004time\030\t " +
      "\001(\0132\031.google.fhir.r4.core.TimeH\000\0222\n\tdate" +
      "_time\030\n \001(\0132\035.google.fhir.r4.core.DateTi" +
      "meH\000\022-\n\006period\030\013 \001(\0132\033.google.fhir.r4.co" +
      "re.PeriodH\000:\006\240\203\203\350\006\001B\010\n\006choice:1\232\206\223\240\010+val" +
      "ue.exists() or dataAbsentReason.exists()" +
      ":\3064\300\237\343\266\005\003\232\265\216\223\0062http://hl7.org/fhir/Struc" +
      "tureDefinition/vitalsigns\232\265\216\223\0063http://hl" +
      "7.org/fhir/StructureDefinition/Observati" +
      "on\262\376\344\227\006+http://hl7.org/fhir/StructureDef" +
      "inition/bmi\232\206\223\240\010)dataAbsentReason.empty(" +
      ") or value.empty()\232\206\223\240\010_value.empty() or" +
      " component.code.where(coding.intersect(%" +
      "resource.code.coding).exists()).empty()\232" +
      "\206\223\240\010_(component.empty() and hasMember.em" +
      "pty()) implies (dataAbsentReason.exists(" +
      ") or value.exists())\262\365\365\327\t\177\n\021amino-acid-c" +
      "hange\020\003\032hObservation.extension(\'http://h" +
      "l7.org/fhir/StructureDefinition/observat" +
      "ion-geneticsAminoAcidChangeName\')\262\365\365\327\t!\n" +
      "\010based-on\020\005\032\023Observation.basedOn\262\365\365\327\t\"\n\010" +
      "category\020\004\032\024Observation.category\262\365\365\327\t\364\003\n" +
      "\004code\020\004\032\351\003AllergyIntolerance.code | Alle" +
      "rgyIntolerance.reaction.substance | Cond" +
      "ition.code | (DeviceRequest.code as Code" +
      "ableConcept) | DiagnosticReport.code | F" +
      "amilyMemberHistory.condition.code | List" +
      ".code | Medication.code | (MedicationAdm" +
      "inistration.medication as CodeableConcep" +
      "t) | (MedicationDispense.medication as C" +
      "odeableConcept) | (MedicationRequest.med" +
      "ication as CodeableConcept) | (Medicatio" +
      "nStatement.medication as CodeableConcept" +
      ") | Observation.code | Procedure.code | " +
      "ServiceRequest.code\262\365\365\327\t#\n\022code-value-co" +
      "ncept\020\006\032\013Observation\262\365\365\327\t \n\017code-value-d" +
      "ate\020\006\032\013Observation\262\365\365\327\t$\n\023code-value-qua" +
      "ntity\020\006\032\013Observation\262\365\365\327\t\"\n\021code-value-s" +
      "tring\020\006\032\013Observation\262\365\365\327\t=\n\ncombo-code\020\004" +
      "\032-Observation.code | Observation.compone" +
      "nt.code\262\365\365\327\tA\n\030combo-code-value-concept\020" +
      "\006\032#Observation | Observation.component\262\365" +
      "\365\327\tB\n\031combo-code-value-quantity\020\006\032#Obser" +
      "vation | Observation.component\262\365\365\327\tc\n\030co" +
      "mbo-data-absent-reason\020\004\032EObservation.da" +
      "taAbsentReason | Observation.component.d" +
      "ataAbsentReason\262\365\365\327\tr\n\023combo-value-conce" +
      "pt\020\004\032Y(Observation.value as CodeableConc" +
      "ept) | (Observation.component.value as C" +
      "odeableConcept)\262\365\365\327\t\272\001\n\024combo-value-quan" +
      "tity\020\007\032\237\001(Observation.value as Quantity)" +
      " | (Observation.value as SampledData) | " +
      "(Observation.component.value as Quantity" +
      ") | (Observation.component.value as Samp" +
      "ledData)\262\365\365\327\t.\n\016component-code\020\004\032\032Observ" +
      "ation.component.code\262\365\365\327\t7\n\034component-co" +
      "de-value-concept\020\006\032\025Observation.componen" +
      "t\262\365\365\327\t8\n\035component-code-value-quantity\020\006" +
      "\032\025Observation.component\262\365\365\327\tH\n\034component" +
      "-data-absent-reason\020\004\032&Observation.compo" +
      "nent.dataAbsentReason\262\365\365\327\tM\n\027component-v" +
      "alue-concept\020\004\0320(Observation.component.v" +
      "alue as CodeableConcept)\262\365\365\327\tv\n\030componen" +
      "t-value-quantity\020\007\032X(Observation.compone" +
      "nt.value as Quantity) | (Observation.com" +
      "ponent.value as SampledData)\262\365\365\327\t4\n\022data" +
      "-absent-reason\020\004\032\034Observation.dataAbsent" +
      "Reason\262\365\365\327\t\227\003\n\004date\020\002\032\214\003AllergyIntoleran" +
      "ce.recordedDate | CarePlan.period | Care" +
      "Team.period | ClinicalImpression.date | " +
      "Composition.date | Consent.dateTime | Di" +
      "agnosticReport.effective | Encounter.per" +
      "iod | EpisodeOfCare.period | FamilyMembe" +
      "rHistory.date | Flag.period | Immunizati" +
      "on.occurrence | List.date | Observation." +
      "effective | Procedure.performed | (RiskA" +
      "ssessment.occurrence as dateTime) | Supp" +
      "lyRequest.authoredOn\262\365\365\327\t)\n\014derived-from" +
      "\020\005\032\027Observation.derivedFrom\262\365\365\327\t\036\n\006devic" +
      "e\020\005\032\022Observation.device\262\365\365\327\tp\n\013dna-varia" +
      "nt\020\003\032_Observation.extension(\'http://hl7." +
      "org/fhir/StructureDefinition/observation" +
      "-geneticsDnaVariant\')\262\365\365\327\t\302\002\n\tencounter\020" +
      "\005\032\262\002Composition.encounter | DeviceReques" +
      "t.encounter | DiagnosticReport.encounter" +
      " | DocumentReference.context.encounter |" +
      " Flag.encounter | List.encounter | Nutri" +
      "tionOrder.encounter | Observation.encoun" +
      "ter | Procedure.encounter | RiskAssessme" +
      "nt.encounter | ServiceRequest.encounter " +
      "| VisionPrescription.encounter\262\365\365\327\t\034\n\005fo" +
      "cus\020\005\032\021Observation.focus\262\365\365\327\t\204\001\n\026gene-am" +
      "ino-acid-change\020\003\032hObservation.extension" +
      "(\'http://hl7.org/fhir/StructureDefinitio" +
      "n/observation-geneticsAminoAcidChangeNam" +
      "e\')\262\365\365\327\tt\n\017gene-dnavariant\020\003\032_Observatio" +
      "n.extension(\'http://hl7.org/fhir/Structu" +
      "reDefinition/observation-geneticsDnaVari" +
      "ant\')\262\365\365\327\tn\n\017gene-identifier\020\004\032YObservat" +
      "ion.extension(\'http://hl7.org/fhir/Struc" +
      "tureDefinition/observation-geneticsGene\'" +
      ")\262\365\365\327\t%\n\nhas-member\020\005\032\025Observation.hasMe" +
      "mber\262\365\365\327\t\205\007\n\nidentifier\020\004\032\364\006AllergyIntol" +
      "erance.identifier | CarePlan.identifier " +
      "| CareTeam.identifier | Composition.iden" +
      "tifier | Condition.identifier | Consent." +
      "identifier | DetectedIssue.identifier | " +
      "DeviceRequest.identifier | DiagnosticRep" +
      "ort.identifier | DocumentManifest.master" +
      "Identifier | DocumentManifest.identifier" +
      " | DocumentReference.masterIdentifier | " +
      "DocumentReference.identifier | Encounter" +
      ".identifier | EpisodeOfCare.identifier |" +
      " FamilyMemberHistory.identifier | Goal.i" +
      "dentifier | ImagingStudy.identifier | Im" +
      "munization.identifier | List.identifier " +
      "| MedicationAdministration.identifier | " +
      "MedicationDispense.identifier | Medicati" +
      "onRequest.identifier | MedicationStateme" +
      "nt.identifier | NutritionOrder.identifie" +
      "r | Observation.identifier | Procedure.i" +
      "dentifier | RiskAssessment.identifier | " +
      "ServiceRequest.identifier | SupplyDelive" +
      "ry.identifier | SupplyRequest.identifier" +
      " | VisionPrescription.identifier\262\365\365\327\t\036\n\006" +
      "method\020\004\032\022Observation.method\262\365\365\327\t\037\n\007part" +
      "-of\020\005\032\022Observation.partOf\262\365\365\327\t\370\n\n\007patien" +
      "t\020\005\032\352\nAllergyIntolerance.patient | CareP" +
      "lan.subject.where(resolve() is Patient) " +
      "| CareTeam.subject.where(resolve() is Pa" +
      "tient) | ClinicalImpression.subject.wher" +
      "e(resolve() is Patient) | Composition.su" +
      "bject.where(resolve() is Patient) | Cond" +
      "ition.subject.where(resolve() is Patient" +
      ") | Consent.patient | DetectedIssue.pati" +
      "ent | DeviceRequest.subject.where(resolv" +
      "e() is Patient) | DeviceUseStatement.sub" +
      "ject | DiagnosticReport.subject.where(re" +
      "solve() is Patient) | DocumentManifest.s" +
      "ubject.where(resolve() is Patient) | Doc" +
      "umentReference.subject.where(resolve() i" +
      "s Patient) | Encounter.subject.where(res" +
      "olve() is Patient) | EpisodeOfCare.patie" +
      "nt | FamilyMemberHistory.patient | Flag." +
      "subject.where(resolve() is Patient) | Go" +
      "al.subject.where(resolve() is Patient) |" +
      " ImagingStudy.subject.where(resolve() is" +
      " Patient) | Immunization.patient | List." +
      "subject.where(resolve() is Patient) | Me" +
      "dicationAdministration.subject.where(res" +
      "olve() is Patient) | MedicationDispense." +
      "subject.where(resolve() is Patient) | Me" +
      "dicationRequest.subject.where(resolve() " +
      "is Patient) | MedicationStatement.subjec" +
      "t.where(resolve() is Patient) | Nutritio" +
      "nOrder.patient | Observation.subject.whe" +
      "re(resolve() is Patient) | Procedure.sub" +
      "ject.where(resolve() is Patient) | RiskA" +
      "ssessment.subject.where(resolve() is Pat" +
      "ient) | ServiceRequest.subject.where(res" +
      "olve() is Patient) | SupplyDelivery.pati" +
      "ent | VisionPrescription.patient\262\365\365\327\t$\n\t" +
      "performer\020\005\032\025Observation.performer\262\365\365\327\t\"" +
      "\n\010specimen\020\005\032\024Observation.specimen\262\365\365\327\t\036" +
      "\n\006status\020\004\032\022Observation.status\262\365\365\327\t \n\007su" +
      "bject\020\005\032\023Observation.subject\262\365\365\327\t9\n\rvalu" +
      "e-concept\020\004\032&(Observation.value as Codea" +
      "bleConcept)\262\365\365\327\tO\n\nvalue-date\020\002\032?(Observ" +
      "ation.value as dateTime) | (Observation." +
      "value as Period)\262\365\365\327\tX\n\016value-quantity\020\007" +
      "\032D(Observation.value as Quantity) | (Obs" +
      "ervation.value as SampledData)\262\365\365\327\t]\n\014va" +
      "lue-string\020\003\032K(Observation.value as stri" +
      "ng) | (Observation.value as CodeableConc" +
      "ept).textJ\004\010\007\020\010J\004\010\"\020#B!\n\027com.google.fhir" +
      ".r4.coreP\001\230\306\260\265\007\004b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.AnyProto.getDescriptor(),
          com.google.fhir.proto.Annotations.getDescriptor(),
          com.google.fhir.r4.core.Codes.getDescriptor(),
          com.google.fhir.r4.core.Datatypes.getDescriptor(),
        });
    internal_static_google_fhir_r4_core_ObservationBmi_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_fhir_r4_core_ObservationBmi_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_fhir_r4_core_ObservationBmi_descriptor,
        new java.lang.String[] { "Id", "Meta", "ImplicitRules", "Language", "Text", "Contained", "Extension", "ModifierExtension", "Identifier", "BasedOn", "PartOf", "Status", "Category", "Code", "Subject", "Focus", "Encounter", "Effective", "Issued", "Performer", "Value", "DataAbsentReason", "Interpretation", "Note", "BodySite", "Method", "Specimen", "Device", "ReferenceRange", "HasMember", "DerivedFrom", "Component", });
    internal_static_google_fhir_r4_core_ObservationBmi_StatusCode_descriptor =
      internal_static_google_fhir_r4_core_ObservationBmi_descriptor.getNestedTypes().get(0);
    internal_static_google_fhir_r4_core_ObservationBmi_StatusCode_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_fhir_r4_core_ObservationBmi_StatusCode_descriptor,
        new java.lang.String[] { "Value", "Id", "Extension", });
    internal_static_google_fhir_r4_core_ObservationBmi_CodeableConceptForCode_descriptor =
      internal_static_google_fhir_r4_core_ObservationBmi_descriptor.getNestedTypes().get(1);
    internal_static_google_fhir_r4_core_ObservationBmi_CodeableConceptForCode_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_fhir_r4_core_ObservationBmi_CodeableConceptForCode_descriptor,
        new java.lang.String[] { "Id", "Extension", "Coding", "Text", "BmiCode", });
    internal_static_google_fhir_r4_core_ObservationBmi_EffectiveX_descriptor =
      internal_static_google_fhir_r4_core_ObservationBmi_descriptor.getNestedTypes().get(2);
    internal_static_google_fhir_r4_core_ObservationBmi_EffectiveX_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_fhir_r4_core_ObservationBmi_EffectiveX_descriptor,
        new java.lang.String[] { "DateTime", "Period", "Choice", });
    internal_static_google_fhir_r4_core_ObservationBmi_ValueX_descriptor =
      internal_static_google_fhir_r4_core_ObservationBmi_descriptor.getNestedTypes().get(3);
    internal_static_google_fhir_r4_core_ObservationBmi_ValueX_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_fhir_r4_core_ObservationBmi_ValueX_descriptor,
        new java.lang.String[] { "Quantity", "Choice", });
    internal_static_google_fhir_r4_core_ObservationBmi_ReferenceRange_descriptor =
      internal_static_google_fhir_r4_core_ObservationBmi_descriptor.getNestedTypes().get(4);
    internal_static_google_fhir_r4_core_ObservationBmi_ReferenceRange_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_fhir_r4_core_ObservationBmi_ReferenceRange_descriptor,
        new java.lang.String[] { "Id", "Extension", "ModifierExtension", "Low", "High", "Type", "AppliesTo", "Age", "Text", });
    internal_static_google_fhir_r4_core_ObservationBmi_Component_descriptor =
      internal_static_google_fhir_r4_core_ObservationBmi_descriptor.getNestedTypes().get(5);
    internal_static_google_fhir_r4_core_ObservationBmi_Component_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_fhir_r4_core_ObservationBmi_Component_descriptor,
        new java.lang.String[] { "Id", "Extension", "ModifierExtension", "Code", "Value", "DataAbsentReason", "Interpretation", "ReferenceRange", });
    internal_static_google_fhir_r4_core_ObservationBmi_Component_ValueX_descriptor =
      internal_static_google_fhir_r4_core_ObservationBmi_Component_descriptor.getNestedTypes().get(0);
    internal_static_google_fhir_r4_core_ObservationBmi_Component_ValueX_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_fhir_r4_core_ObservationBmi_Component_ValueX_descriptor,
        new java.lang.String[] { "Quantity", "CodeableConcept", "StringValue", "Boolean", "Integer", "Range", "Ratio", "SampledData", "Time", "DateTime", "Period", "Choice", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.fhir.proto.Annotations.fhirInlinedCodingCode);
    registry.add(com.google.fhir.proto.Annotations.fhirInlinedCodingSystem);
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
