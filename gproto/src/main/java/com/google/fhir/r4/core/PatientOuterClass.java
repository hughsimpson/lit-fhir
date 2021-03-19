// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/google/fhir/proto/r4/core/resources/patient.proto

package com.google.fhir.r4.core;

public final class PatientOuterClass {
  private PatientOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_fhir_r4_core_Patient_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_Patient_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_fhir_r4_core_Patient_GenderCode_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_Patient_GenderCode_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_fhir_r4_core_Patient_DeceasedX_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_Patient_DeceasedX_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_fhir_r4_core_Patient_MultipleBirthX_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_Patient_MultipleBirthX_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_fhir_r4_core_Patient_Contact_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_Patient_Contact_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_fhir_r4_core_Patient_Contact_GenderCode_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_Patient_Contact_GenderCode_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_fhir_r4_core_Patient_Communication_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_Patient_Communication_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_fhir_r4_core_Patient_Link_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_Patient_Link_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_fhir_r4_core_Patient_Link_TypeCode_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_fhir_r4_core_Patient_Link_TypeCode_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n7proto/google/fhir/proto/r4/core/resour" +
      "ces/patient.proto\022\023google.fhir.r4.core\032\031" +
      "google/protobuf/any.proto\032)proto/google/" +
      "fhir/proto/annotations.proto\032+proto/goog" +
      "le/fhir/proto/r4/core/codes.proto\032/proto" +
      "/google/fhir/proto/r4/core/datatypes.pro" +
      "to\"\266/\n\007Patient\022#\n\002id\030\001 \001(\0132\027.google.fhir" +
      ".r4.core.Id\022\'\n\004meta\030\002 \001(\0132\031.google.fhir." +
      "r4.core.Meta\0220\n\016implicit_rules\030\003 \001(\0132\030.g" +
      "oogle.fhir.r4.core.Uri\022+\n\010language\030\004 \001(\013" +
      "2\031.google.fhir.r4.core.Code\022,\n\004text\030\005 \001(" +
      "\0132\036.google.fhir.r4.core.Narrative\022\'\n\tcon" +
      "tained\030\006 \003(\0132\024.google.protobuf.Any\0221\n\tex" +
      "tension\030\010 \003(\0132\036.google.fhir.r4.core.Exte" +
      "nsion\022:\n\022modifier_extension\030\t \003(\0132\036.goog" +
      "le.fhir.r4.core.Extension\0223\n\nidentifier\030" +
      "\n \003(\0132\037.google.fhir.r4.core.Identifier\022," +
      "\n\006active\030\013 \001(\0132\034.google.fhir.r4.core.Boo" +
      "lean\022,\n\004name\030\014 \003(\0132\036.google.fhir.r4.core" +
      ".HumanName\0222\n\007telecom\030\r \003(\0132!.google.fhi" +
      "r.r4.core.ContactPoint\0227\n\006gender\030\016 \001(\0132\'" +
      ".google.fhir.r4.core.Patient.GenderCode\022" +
      "-\n\nbirth_date\030\017 \001(\0132\031.google.fhir.r4.cor" +
      "e.Date\0228\n\010deceased\030\020 \001(\0132&.google.fhir.r" +
      "4.core.Patient.DeceasedX\022-\n\007address\030\021 \003(" +
      "\0132\034.google.fhir.r4.core.Address\022<\n\016marit" +
      "al_status\030\022 \001(\0132$.google.fhir.r4.core.Co" +
      "deableConcept\022C\n\016multiple_birth\030\023 \001(\0132+." +
      "google.fhir.r4.core.Patient.MultipleBirt" +
      "hX\022.\n\005photo\030\024 \003(\0132\037.google.fhir.r4.core." +
      "Attachment\0225\n\007contact\030\025 \003(\0132$.google.fhi" +
      "r.r4.core.Patient.Contact\022A\n\rcommunicati" +
      "on\030\026 \003(\0132*.google.fhir.r4.core.Patient.C" +
      "ommunication\022x\n\024general_practitioner\030\027 \003" +
      "(\0132\036.google.fhir.r4.core.ReferenceB:\362\377\374\302" +
      "\006\014Organization\362\377\374\302\006\014Practitioner\362\377\374\302\006\020Pr" +
      "actitionerRole\022Q\n\025managing_organization\030" +
      "\030 \001(\0132\036.google.fhir.r4.core.ReferenceB\022\362" +
      "\377\374\302\006\014Organization\022/\n\004link\030\031 \003(\0132!.google" +
      ".fhir.r4.core.Patient.Link\032\236\002\n\nGenderCod" +
      "e\022B\n\005value\030\001 \001(\01623.google.fhir.r4.core.A" +
      "dministrativeGenderCode.Value\022\'\n\002id\030\002 \001(" +
      "\0132\033.google.fhir.r4.core.String\0221\n\textens" +
      "ion\030\003 \003(\0132\036.google.fhir.r4.core.Extensio" +
      "n:p\300\237\343\266\005\001\212\371\203\262\0052http://hl7.org/fhir/Value" +
      "Set/administrative-gender\232\265\216\223\006,http://hl" +
      "7.org/fhir/StructureDefinition/code\032\202\001\n\t" +
      "DeceasedX\022/\n\007boolean\030\001 \001(\0132\034.google.fhir" +
      ".r4.core.BooleanH\000\0222\n\tdate_time\030\002 \001(\0132\035." +
      "google.fhir.r4.core.DateTimeH\000:\006\240\203\203\350\006\001B\010" +
      "\n\006choice\032\204\001\n\016MultipleBirthX\022/\n\007boolean\030\001" +
      " \001(\0132\034.google.fhir.r4.core.BooleanH\000\022/\n\007" +
      "integer\030\002 \001(\0132\034.google.fhir.r4.core.Inte" +
      "gerH\000:\006\240\203\203\350\006\001B\010\n\006choice\032\235\007\n\007Contact\022\'\n\002i" +
      "d\030\001 \001(\0132\033.google.fhir.r4.core.String\0221\n\t" +
      "extension\030\002 \003(\0132\036.google.fhir.r4.core.Ex" +
      "tension\022:\n\022modifier_extension\030\003 \003(\0132\036.go" +
      "ogle.fhir.r4.core.Extension\022:\n\014relations" +
      "hip\030\004 \003(\0132$.google.fhir.r4.core.Codeable" +
      "Concept\022,\n\004name\030\005 \001(\0132\036.google.fhir.r4.c" +
      "ore.HumanName\0222\n\007telecom\030\006 \003(\0132!.google." +
      "fhir.r4.core.ContactPoint\022-\n\007address\030\007 \001" +
      "(\0132\034.google.fhir.r4.core.Address\022?\n\006gend" +
      "er\030\010 \001(\0132/.google.fhir.r4.core.Patient.C" +
      "ontact.GenderCode\022H\n\014organization\030\t \001(\0132" +
      "\036.google.fhir.r4.core.ReferenceB\022\362\377\374\302\006\014O" +
      "rganization\022+\n\006period\030\n \001(\0132\033.google.fhi" +
      "r.r4.core.Period\032\236\002\n\nGenderCode\022B\n\005value" +
      "\030\001 \001(\01623.google.fhir.r4.core.Administrat" +
      "iveGenderCode.Value\022\'\n\002id\030\002 \001(\0132\033.google" +
      ".fhir.r4.core.String\0221\n\textension\030\003 \003(\0132" +
      "\036.google.fhir.r4.core.Extension:p\300\237\343\266\005\001\212" +
      "\371\203\262\0052http://hl7.org/fhir/ValueSet/admini" +
      "strative-gender\232\265\216\223\006,http://hl7.org/fhir" +
      "/StructureDefinition/code:T\232\206\223\240\010Nname.ex" +
      "ists() or telecom.exists() or address.ex" +
      "ists() or organization.exists()\032\230\002\n\rComm" +
      "unication\022\'\n\002id\030\001 \001(\0132\033.google.fhir.r4.c" +
      "ore.String\0221\n\textension\030\002 \003(\0132\036.google.f" +
      "hir.r4.core.Extension\022:\n\022modifier_extens" +
      "ion\030\003 \003(\0132\036.google.fhir.r4.core.Extensio" +
      "n\022>\n\010language\030\004 \001(\0132$.google.fhir.r4.cor" +
      "e.CodeableConceptB\006\360\320\207\353\004\001\022/\n\tpreferred\030\005" +
      " \001(\0132\034.google.fhir.r4.core.Boolean\032\276\004\n\004L" +
      "ink\022\'\n\002id\030\001 \001(\0132\033.google.fhir.r4.core.St" +
      "ring\0221\n\textension\030\002 \003(\0132\036.google.fhir.r4" +
      ".core.Extension\022:\n\022modifier_extension\030\003 " +
      "\003(\0132\036.google.fhir.r4.core.Extension\022U\n\005o" +
      "ther\030\004 \001(\0132\036.google.fhir.r4.core.Referen" +
      "ceB&\360\320\207\353\004\001\362\377\374\302\006\007Patient\362\377\374\302\006\rRelatedPers" +
      "on\022@\n\004type\030\005 \001(\0132*.google.fhir.r4.core.P" +
      "atient.Link.TypeCodeB\006\360\320\207\353\004\001\032\204\002\n\010TypeCod" +
      "e\0226\n\005value\030\001 \001(\0162\'.google.fhir.r4.core.L" +
      "inkTypeCode.Value\022\'\n\002id\030\002 \001(\0132\033.google.f" +
      "hir.r4.core.String\0221\n\textension\030\003 \003(\0132\036." +
      "google.fhir.r4.core.Extension:d\300\237\343\266\005\001\212\371\203" +
      "\262\005&http://hl7.org/fhir/ValueSet/link-typ" +
      "e\232\265\216\223\006,http://hl7.org/fhir/StructureDefi" +
      "nition/code:\307\022\300\237\343\266\005\003\262\376\344\227\006/http://hl7.org" +
      "/fhir/StructureDefinition/Patient\262\365\365\327\t\220\001" +
      "\n(Example Search Parameter on an extensi" +
      "on\020\005\032bDocumentReference.extension(\'http:" +
      "//example.org/fhir/StructureDefinition/p" +
      "articipation-agreement\')\262\365\365\327\t\032\n\006active\020\004" +
      "\032\016Patient.active\262\365\365\327\t\\\n\007address\020\003\032OPatie" +
      "nt.address | Person.address | Practition" +
      "er.address | RelatedPerson.address\262\365\365\327\tu" +
      "\n\014address-city\020\003\032cPatient.address.city |" +
      " Person.address.city | Practitioner.addr" +
      "ess.city | RelatedPerson.address.city\262\365\365" +
      "\327\t\204\001\n\017address-country\020\003\032oPatient.address" +
      ".country | Person.address.country | Prac" +
      "titioner.address.country | RelatedPerson" +
      ".address.country\262\365\365\327\t\223\001\n\022address-postalc" +
      "ode\020\003\032{Patient.address.postalCode | Pers" +
      "on.address.postalCode | Practitioner.add" +
      "ress.postalCode | RelatedPerson.address." +
      "postalCode\262\365\365\327\tz\n\raddress-state\020\003\032gPatie" +
      "nt.address.state | Person.address.state " +
      "| Practitioner.address.state | RelatedPe" +
      "rson.address.state\262\365\365\327\tp\n\013address-use\020\004\032" +
      "_Patient.address.use | Person.address.us" +
      "e | Practitioner.address.use | RelatedPe" +
      "rson.address.use\262\365\365\327\tM\n\tbirthdate\020\002\032>Pat" +
      "ient.birthDate | Person.birthDate | Rela" +
      "tedPerson.birthDate\262\365\365\327\t.\n\ndeath-date\020\002\032" +
      "\036(Patient.deceased as dateTime)\262\365\365\327\tE\n\010d" +
      "eceased\020\004\0327Patient.deceased.exists() and" +
      " Patient.deceased != false\262\365\365\327\t\344\001\n\005email" +
      "\020\004\032\330\001Patient.telecom.where(system=\'email" +
      "\') | Person.telecom.where(system=\'email\'" +
      ") | Practitioner.telecom.where(system=\'e" +
      "mail\') | PractitionerRole.telecom.where(" +
      "system=\'email\') | RelatedPerson.telecom." +
      "where(system=\'email\')\262\365\365\327\t:\n\006family\020\003\032.P" +
      "atient.name.family | Practitioner.name.f" +
      "amily\262\365\365\327\tW\n\006gender\020\004\032KPatient.gender | " +
      "Person.gender | Practitioner.gender | Re" +
      "latedPerson.gender\262\365\365\327\t5\n\024general-practi" +
      "tioner\020\005\032\033Patient.generalPractitioner\262\365\365" +
      "\327\t7\n\005given\020\003\032,Patient.name.given | Pract" +
      "itioner.name.given\262\365\365\327\t\"\n\nidentifier\020\004\032\022" +
      "Patient.identifier\262\365\365\327\t,\n\010language\020\004\032\036Pa" +
      "tient.communication.language\262\365\365\327\t\034\n\004link" +
      "\020\005\032\022Patient.link.other\262\365\365\327\t\026\n\004name\020\003\032\014Pa" +
      "tient.name\262\365\365\327\t.\n\014organization\020\005\032\034Patien" +
      "t.managingOrganization\262\365\365\327\t\344\001\n\005phone\020\004\032\330" +
      "\001Patient.telecom.where(system=\'phone\') |" +
      " Person.telecom.where(system=\'phone\') | " +
      "Practitioner.telecom.where(system=\'phone" +
      "\') | PractitionerRole.telecom.where(syst" +
      "em=\'phone\') | RelatedPerson.telecom.wher" +
      "e(system=\'phone\')\262\365\365\327\tQ\n\010phonetic\020\003\032CPat" +
      "ient.name | Person.name | Practitioner.n" +
      "ame | RelatedPerson.name\262\365\365\327\tw\n\007telecom\020" +
      "\004\032jPatient.telecom | Person.telecom | Pr" +
      "actitioner.telecom | PractitionerRole.te" +
      "lecom | RelatedPerson.telecomJ\004\010\007\020\010B!\n\027c" +
      "om.google.fhir.r4.coreP\001\230\306\260\265\007\004b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.AnyProto.getDescriptor(),
          com.google.fhir.proto.Annotations.getDescriptor(),
          com.google.fhir.r4.core.Codes.getDescriptor(),
          com.google.fhir.r4.core.Datatypes.getDescriptor(),
        });
    internal_static_google_fhir_r4_core_Patient_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_fhir_r4_core_Patient_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_fhir_r4_core_Patient_descriptor,
        new java.lang.String[] { "Id", "Meta", "ImplicitRules", "Language", "Text", "Contained", "Extension", "ModifierExtension", "Identifier", "Active", "Name", "Telecom", "Gender", "BirthDate", "Deceased", "Address", "MaritalStatus", "MultipleBirth", "Photo", "Contact", "Communication", "GeneralPractitioner", "ManagingOrganization", "Link", });
    internal_static_google_fhir_r4_core_Patient_GenderCode_descriptor =
      internal_static_google_fhir_r4_core_Patient_descriptor.getNestedTypes().get(0);
    internal_static_google_fhir_r4_core_Patient_GenderCode_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_fhir_r4_core_Patient_GenderCode_descriptor,
        new java.lang.String[] { "Value", "Id", "Extension", });
    internal_static_google_fhir_r4_core_Patient_DeceasedX_descriptor =
      internal_static_google_fhir_r4_core_Patient_descriptor.getNestedTypes().get(1);
    internal_static_google_fhir_r4_core_Patient_DeceasedX_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_fhir_r4_core_Patient_DeceasedX_descriptor,
        new java.lang.String[] { "Boolean", "DateTime", "Choice", });
    internal_static_google_fhir_r4_core_Patient_MultipleBirthX_descriptor =
      internal_static_google_fhir_r4_core_Patient_descriptor.getNestedTypes().get(2);
    internal_static_google_fhir_r4_core_Patient_MultipleBirthX_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_fhir_r4_core_Patient_MultipleBirthX_descriptor,
        new java.lang.String[] { "Boolean", "Integer", "Choice", });
    internal_static_google_fhir_r4_core_Patient_Contact_descriptor =
      internal_static_google_fhir_r4_core_Patient_descriptor.getNestedTypes().get(3);
    internal_static_google_fhir_r4_core_Patient_Contact_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_fhir_r4_core_Patient_Contact_descriptor,
        new java.lang.String[] { "Id", "Extension", "ModifierExtension", "Relationship", "Name", "Telecom", "Address", "Gender", "Organization", "Period", });
    internal_static_google_fhir_r4_core_Patient_Contact_GenderCode_descriptor =
      internal_static_google_fhir_r4_core_Patient_Contact_descriptor.getNestedTypes().get(0);
    internal_static_google_fhir_r4_core_Patient_Contact_GenderCode_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_fhir_r4_core_Patient_Contact_GenderCode_descriptor,
        new java.lang.String[] { "Value", "Id", "Extension", });
    internal_static_google_fhir_r4_core_Patient_Communication_descriptor =
      internal_static_google_fhir_r4_core_Patient_descriptor.getNestedTypes().get(4);
    internal_static_google_fhir_r4_core_Patient_Communication_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_fhir_r4_core_Patient_Communication_descriptor,
        new java.lang.String[] { "Id", "Extension", "ModifierExtension", "Language", "Preferred", });
    internal_static_google_fhir_r4_core_Patient_Link_descriptor =
      internal_static_google_fhir_r4_core_Patient_descriptor.getNestedTypes().get(5);
    internal_static_google_fhir_r4_core_Patient_Link_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_fhir_r4_core_Patient_Link_descriptor,
        new java.lang.String[] { "Id", "Extension", "ModifierExtension", "Other", "Type", });
    internal_static_google_fhir_r4_core_Patient_Link_TypeCode_descriptor =
      internal_static_google_fhir_r4_core_Patient_Link_descriptor.getNestedTypes().get(0);
    internal_static_google_fhir_r4_core_Patient_Link_TypeCode_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_fhir_r4_core_Patient_Link_TypeCode_descriptor,
        new java.lang.String[] { "Value", "Id", "Extension", });
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
