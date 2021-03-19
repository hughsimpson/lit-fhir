// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/google/fhir/proto/r4/core/resources/patient.proto

package com.google.fhir.r4.core;

public interface PatientOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.fhir.r4.core.Patient)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Logical id of this artifact
   * </pre>
   *
   * <code>.google.fhir.r4.core.Id id = 1;</code>
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   * <pre>
   * Logical id of this artifact
   * </pre>
   *
   * <code>.google.fhir.r4.core.Id id = 1;</code>
   * @return The id.
   */
  com.google.fhir.r4.core.Id getId();
  /**
   * <pre>
   * Logical id of this artifact
   * </pre>
   *
   * <code>.google.fhir.r4.core.Id id = 1;</code>
   */
  com.google.fhir.r4.core.IdOrBuilder getIdOrBuilder();

  /**
   * <pre>
   * Metadata about the resource
   * </pre>
   *
   * <code>.google.fhir.r4.core.Meta meta = 2;</code>
   * @return Whether the meta field is set.
   */
  boolean hasMeta();
  /**
   * <pre>
   * Metadata about the resource
   * </pre>
   *
   * <code>.google.fhir.r4.core.Meta meta = 2;</code>
   * @return The meta.
   */
  com.google.fhir.r4.core.Meta getMeta();
  /**
   * <pre>
   * Metadata about the resource
   * </pre>
   *
   * <code>.google.fhir.r4.core.Meta meta = 2;</code>
   */
  com.google.fhir.r4.core.MetaOrBuilder getMetaOrBuilder();

  /**
   * <pre>
   * A set of rules under which this content was created
   * </pre>
   *
   * <code>.google.fhir.r4.core.Uri implicit_rules = 3;</code>
   * @return Whether the implicitRules field is set.
   */
  boolean hasImplicitRules();
  /**
   * <pre>
   * A set of rules under which this content was created
   * </pre>
   *
   * <code>.google.fhir.r4.core.Uri implicit_rules = 3;</code>
   * @return The implicitRules.
   */
  com.google.fhir.r4.core.Uri getImplicitRules();
  /**
   * <pre>
   * A set of rules under which this content was created
   * </pre>
   *
   * <code>.google.fhir.r4.core.Uri implicit_rules = 3;</code>
   */
  com.google.fhir.r4.core.UriOrBuilder getImplicitRulesOrBuilder();

  /**
   * <pre>
   * Language of the resource content
   * </pre>
   *
   * <code>.google.fhir.r4.core.Code language = 4;</code>
   * @return Whether the language field is set.
   */
  boolean hasLanguage();
  /**
   * <pre>
   * Language of the resource content
   * </pre>
   *
   * <code>.google.fhir.r4.core.Code language = 4;</code>
   * @return The language.
   */
  com.google.fhir.r4.core.Code getLanguage();
  /**
   * <pre>
   * Language of the resource content
   * </pre>
   *
   * <code>.google.fhir.r4.core.Code language = 4;</code>
   */
  com.google.fhir.r4.core.CodeOrBuilder getLanguageOrBuilder();

  /**
   * <pre>
   * Text summary of the resource, for human interpretation
   * </pre>
   *
   * <code>.google.fhir.r4.core.Narrative text = 5;</code>
   * @return Whether the text field is set.
   */
  boolean hasText();
  /**
   * <pre>
   * Text summary of the resource, for human interpretation
   * </pre>
   *
   * <code>.google.fhir.r4.core.Narrative text = 5;</code>
   * @return The text.
   */
  com.google.fhir.r4.core.Narrative getText();
  /**
   * <pre>
   * Text summary of the resource, for human interpretation
   * </pre>
   *
   * <code>.google.fhir.r4.core.Narrative text = 5;</code>
   */
  com.google.fhir.r4.core.NarrativeOrBuilder getTextOrBuilder();

  /**
   * <pre>
   * Contained, inline Resources
   * </pre>
   *
   * <code>repeated .google.protobuf.Any contained = 6;</code>
   */
  java.util.List<com.google.protobuf.Any> 
      getContainedList();
  /**
   * <pre>
   * Contained, inline Resources
   * </pre>
   *
   * <code>repeated .google.protobuf.Any contained = 6;</code>
   */
  com.google.protobuf.Any getContained(int index);
  /**
   * <pre>
   * Contained, inline Resources
   * </pre>
   *
   * <code>repeated .google.protobuf.Any contained = 6;</code>
   */
  int getContainedCount();
  /**
   * <pre>
   * Contained, inline Resources
   * </pre>
   *
   * <code>repeated .google.protobuf.Any contained = 6;</code>
   */
  java.util.List<? extends com.google.protobuf.AnyOrBuilder> 
      getContainedOrBuilderList();
  /**
   * <pre>
   * Contained, inline Resources
   * </pre>
   *
   * <code>repeated .google.protobuf.Any contained = 6;</code>
   */
  com.google.protobuf.AnyOrBuilder getContainedOrBuilder(
      int index);

  /**
   * <pre>
   * Additional content defined by implementations
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Extension extension = 8;</code>
   */
  java.util.List<com.google.fhir.r4.core.Extension> 
      getExtensionList();
  /**
   * <pre>
   * Additional content defined by implementations
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Extension extension = 8;</code>
   */
  com.google.fhir.r4.core.Extension getExtension(int index);
  /**
   * <pre>
   * Additional content defined by implementations
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Extension extension = 8;</code>
   */
  int getExtensionCount();
  /**
   * <pre>
   * Additional content defined by implementations
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Extension extension = 8;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.ExtensionOrBuilder> 
      getExtensionOrBuilderList();
  /**
   * <pre>
   * Additional content defined by implementations
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Extension extension = 8;</code>
   */
  com.google.fhir.r4.core.ExtensionOrBuilder getExtensionOrBuilder(
      int index);

  /**
   * <pre>
   * Extensions that cannot be ignored
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Extension modifier_extension = 9;</code>
   */
  java.util.List<com.google.fhir.r4.core.Extension> 
      getModifierExtensionList();
  /**
   * <pre>
   * Extensions that cannot be ignored
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Extension modifier_extension = 9;</code>
   */
  com.google.fhir.r4.core.Extension getModifierExtension(int index);
  /**
   * <pre>
   * Extensions that cannot be ignored
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Extension modifier_extension = 9;</code>
   */
  int getModifierExtensionCount();
  /**
   * <pre>
   * Extensions that cannot be ignored
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Extension modifier_extension = 9;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.ExtensionOrBuilder> 
      getModifierExtensionOrBuilderList();
  /**
   * <pre>
   * Extensions that cannot be ignored
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Extension modifier_extension = 9;</code>
   */
  com.google.fhir.r4.core.ExtensionOrBuilder getModifierExtensionOrBuilder(
      int index);

  /**
   * <pre>
   * An identifier for this patient
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Identifier identifier = 10;</code>
   */
  java.util.List<com.google.fhir.r4.core.Identifier> 
      getIdentifierList();
  /**
   * <pre>
   * An identifier for this patient
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Identifier identifier = 10;</code>
   */
  com.google.fhir.r4.core.Identifier getIdentifier(int index);
  /**
   * <pre>
   * An identifier for this patient
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Identifier identifier = 10;</code>
   */
  int getIdentifierCount();
  /**
   * <pre>
   * An identifier for this patient
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Identifier identifier = 10;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.IdentifierOrBuilder> 
      getIdentifierOrBuilderList();
  /**
   * <pre>
   * An identifier for this patient
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Identifier identifier = 10;</code>
   */
  com.google.fhir.r4.core.IdentifierOrBuilder getIdentifierOrBuilder(
      int index);

  /**
   * <pre>
   * Whether this patient's record is in active use
   * </pre>
   *
   * <code>.google.fhir.r4.core.Boolean active = 11;</code>
   * @return Whether the active field is set.
   */
  boolean hasActive();
  /**
   * <pre>
   * Whether this patient's record is in active use
   * </pre>
   *
   * <code>.google.fhir.r4.core.Boolean active = 11;</code>
   * @return The active.
   */
  com.google.fhir.r4.core.Boolean getActive();
  /**
   * <pre>
   * Whether this patient's record is in active use
   * </pre>
   *
   * <code>.google.fhir.r4.core.Boolean active = 11;</code>
   */
  com.google.fhir.r4.core.BooleanOrBuilder getActiveOrBuilder();

  /**
   * <pre>
   * A name associated with the patient
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.HumanName name = 12;</code>
   */
  java.util.List<com.google.fhir.r4.core.HumanName> 
      getNameList();
  /**
   * <pre>
   * A name associated with the patient
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.HumanName name = 12;</code>
   */
  com.google.fhir.r4.core.HumanName getName(int index);
  /**
   * <pre>
   * A name associated with the patient
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.HumanName name = 12;</code>
   */
  int getNameCount();
  /**
   * <pre>
   * A name associated with the patient
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.HumanName name = 12;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.HumanNameOrBuilder> 
      getNameOrBuilderList();
  /**
   * <pre>
   * A name associated with the patient
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.HumanName name = 12;</code>
   */
  com.google.fhir.r4.core.HumanNameOrBuilder getNameOrBuilder(
      int index);

  /**
   * <pre>
   * A contact detail for the individual
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.ContactPoint telecom = 13;</code>
   */
  java.util.List<com.google.fhir.r4.core.ContactPoint> 
      getTelecomList();
  /**
   * <pre>
   * A contact detail for the individual
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.ContactPoint telecom = 13;</code>
   */
  com.google.fhir.r4.core.ContactPoint getTelecom(int index);
  /**
   * <pre>
   * A contact detail for the individual
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.ContactPoint telecom = 13;</code>
   */
  int getTelecomCount();
  /**
   * <pre>
   * A contact detail for the individual
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.ContactPoint telecom = 13;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.ContactPointOrBuilder> 
      getTelecomOrBuilderList();
  /**
   * <pre>
   * A contact detail for the individual
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.ContactPoint telecom = 13;</code>
   */
  com.google.fhir.r4.core.ContactPointOrBuilder getTelecomOrBuilder(
      int index);

  /**
   * <code>.google.fhir.r4.core.Patient.GenderCode gender = 14;</code>
   * @return Whether the gender field is set.
   */
  boolean hasGender();
  /**
   * <code>.google.fhir.r4.core.Patient.GenderCode gender = 14;</code>
   * @return The gender.
   */
  com.google.fhir.r4.core.Patient.GenderCode getGender();
  /**
   * <code>.google.fhir.r4.core.Patient.GenderCode gender = 14;</code>
   */
  com.google.fhir.r4.core.Patient.GenderCodeOrBuilder getGenderOrBuilder();

  /**
   * <pre>
   * The date of birth for the individual
   * </pre>
   *
   * <code>.google.fhir.r4.core.Date birth_date = 15;</code>
   * @return Whether the birthDate field is set.
   */
  boolean hasBirthDate();
  /**
   * <pre>
   * The date of birth for the individual
   * </pre>
   *
   * <code>.google.fhir.r4.core.Date birth_date = 15;</code>
   * @return The birthDate.
   */
  com.google.fhir.r4.core.Date getBirthDate();
  /**
   * <pre>
   * The date of birth for the individual
   * </pre>
   *
   * <code>.google.fhir.r4.core.Date birth_date = 15;</code>
   */
  com.google.fhir.r4.core.DateOrBuilder getBirthDateOrBuilder();

  /**
   * <code>.google.fhir.r4.core.Patient.DeceasedX deceased = 16;</code>
   * @return Whether the deceased field is set.
   */
  boolean hasDeceased();
  /**
   * <code>.google.fhir.r4.core.Patient.DeceasedX deceased = 16;</code>
   * @return The deceased.
   */
  com.google.fhir.r4.core.Patient.DeceasedX getDeceased();
  /**
   * <code>.google.fhir.r4.core.Patient.DeceasedX deceased = 16;</code>
   */
  com.google.fhir.r4.core.Patient.DeceasedXOrBuilder getDeceasedOrBuilder();

  /**
   * <pre>
   * An address for the individual
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Address address = 17;</code>
   */
  java.util.List<com.google.fhir.r4.core.Address> 
      getAddressList();
  /**
   * <pre>
   * An address for the individual
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Address address = 17;</code>
   */
  com.google.fhir.r4.core.Address getAddress(int index);
  /**
   * <pre>
   * An address for the individual
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Address address = 17;</code>
   */
  int getAddressCount();
  /**
   * <pre>
   * An address for the individual
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Address address = 17;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.AddressOrBuilder> 
      getAddressOrBuilderList();
  /**
   * <pre>
   * An address for the individual
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Address address = 17;</code>
   */
  com.google.fhir.r4.core.AddressOrBuilder getAddressOrBuilder(
      int index);

  /**
   * <pre>
   * Marital (civil) status of a patient
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept marital_status = 18;</code>
   * @return Whether the maritalStatus field is set.
   */
  boolean hasMaritalStatus();
  /**
   * <pre>
   * Marital (civil) status of a patient
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept marital_status = 18;</code>
   * @return The maritalStatus.
   */
  com.google.fhir.r4.core.CodeableConcept getMaritalStatus();
  /**
   * <pre>
   * Marital (civil) status of a patient
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept marital_status = 18;</code>
   */
  com.google.fhir.r4.core.CodeableConceptOrBuilder getMaritalStatusOrBuilder();

  /**
   * <code>.google.fhir.r4.core.Patient.MultipleBirthX multiple_birth = 19;</code>
   * @return Whether the multipleBirth field is set.
   */
  boolean hasMultipleBirth();
  /**
   * <code>.google.fhir.r4.core.Patient.MultipleBirthX multiple_birth = 19;</code>
   * @return The multipleBirth.
   */
  com.google.fhir.r4.core.Patient.MultipleBirthX getMultipleBirth();
  /**
   * <code>.google.fhir.r4.core.Patient.MultipleBirthX multiple_birth = 19;</code>
   */
  com.google.fhir.r4.core.Patient.MultipleBirthXOrBuilder getMultipleBirthOrBuilder();

  /**
   * <pre>
   * Image of the patient
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Attachment photo = 20;</code>
   */
  java.util.List<com.google.fhir.r4.core.Attachment> 
      getPhotoList();
  /**
   * <pre>
   * Image of the patient
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Attachment photo = 20;</code>
   */
  com.google.fhir.r4.core.Attachment getPhoto(int index);
  /**
   * <pre>
   * Image of the patient
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Attachment photo = 20;</code>
   */
  int getPhotoCount();
  /**
   * <pre>
   * Image of the patient
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Attachment photo = 20;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.AttachmentOrBuilder> 
      getPhotoOrBuilderList();
  /**
   * <pre>
   * Image of the patient
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Attachment photo = 20;</code>
   */
  com.google.fhir.r4.core.AttachmentOrBuilder getPhotoOrBuilder(
      int index);

  /**
   * <code>repeated .google.fhir.r4.core.Patient.Contact contact = 21;</code>
   */
  java.util.List<com.google.fhir.r4.core.Patient.Contact> 
      getContactList();
  /**
   * <code>repeated .google.fhir.r4.core.Patient.Contact contact = 21;</code>
   */
  com.google.fhir.r4.core.Patient.Contact getContact(int index);
  /**
   * <code>repeated .google.fhir.r4.core.Patient.Contact contact = 21;</code>
   */
  int getContactCount();
  /**
   * <code>repeated .google.fhir.r4.core.Patient.Contact contact = 21;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.Patient.ContactOrBuilder> 
      getContactOrBuilderList();
  /**
   * <code>repeated .google.fhir.r4.core.Patient.Contact contact = 21;</code>
   */
  com.google.fhir.r4.core.Patient.ContactOrBuilder getContactOrBuilder(
      int index);

  /**
   * <code>repeated .google.fhir.r4.core.Patient.Communication communication = 22;</code>
   */
  java.util.List<com.google.fhir.r4.core.Patient.Communication> 
      getCommunicationList();
  /**
   * <code>repeated .google.fhir.r4.core.Patient.Communication communication = 22;</code>
   */
  com.google.fhir.r4.core.Patient.Communication getCommunication(int index);
  /**
   * <code>repeated .google.fhir.r4.core.Patient.Communication communication = 22;</code>
   */
  int getCommunicationCount();
  /**
   * <code>repeated .google.fhir.r4.core.Patient.Communication communication = 22;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.Patient.CommunicationOrBuilder> 
      getCommunicationOrBuilderList();
  /**
   * <code>repeated .google.fhir.r4.core.Patient.Communication communication = 22;</code>
   */
  com.google.fhir.r4.core.Patient.CommunicationOrBuilder getCommunicationOrBuilder(
      int index);

  /**
   * <pre>
   * Patient's nominated primary care provider
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Reference general_practitioner = 23 [(.google.fhir.proto.valid_reference_type) = "Organization", (.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "PractitionerRole"];</code>
   */
  java.util.List<com.google.fhir.r4.core.Reference> 
      getGeneralPractitionerList();
  /**
   * <pre>
   * Patient's nominated primary care provider
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Reference general_practitioner = 23 [(.google.fhir.proto.valid_reference_type) = "Organization", (.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "PractitionerRole"];</code>
   */
  com.google.fhir.r4.core.Reference getGeneralPractitioner(int index);
  /**
   * <pre>
   * Patient's nominated primary care provider
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Reference general_practitioner = 23 [(.google.fhir.proto.valid_reference_type) = "Organization", (.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "PractitionerRole"];</code>
   */
  int getGeneralPractitionerCount();
  /**
   * <pre>
   * Patient's nominated primary care provider
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Reference general_practitioner = 23 [(.google.fhir.proto.valid_reference_type) = "Organization", (.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "PractitionerRole"];</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.ReferenceOrBuilder> 
      getGeneralPractitionerOrBuilderList();
  /**
   * <pre>
   * Patient's nominated primary care provider
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Reference general_practitioner = 23 [(.google.fhir.proto.valid_reference_type) = "Organization", (.google.fhir.proto.valid_reference_type) = "Practitioner", (.google.fhir.proto.valid_reference_type) = "PractitionerRole"];</code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getGeneralPractitionerOrBuilder(
      int index);

  /**
   * <pre>
   * Organization that is the custodian of the patient record
   * </pre>
   *
   * <code>.google.fhir.r4.core.Reference managing_organization = 24 [(.google.fhir.proto.valid_reference_type) = "Organization"];</code>
   * @return Whether the managingOrganization field is set.
   */
  boolean hasManagingOrganization();
  /**
   * <pre>
   * Organization that is the custodian of the patient record
   * </pre>
   *
   * <code>.google.fhir.r4.core.Reference managing_organization = 24 [(.google.fhir.proto.valid_reference_type) = "Organization"];</code>
   * @return The managingOrganization.
   */
  com.google.fhir.r4.core.Reference getManagingOrganization();
  /**
   * <pre>
   * Organization that is the custodian of the patient record
   * </pre>
   *
   * <code>.google.fhir.r4.core.Reference managing_organization = 24 [(.google.fhir.proto.valid_reference_type) = "Organization"];</code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getManagingOrganizationOrBuilder();

  /**
   * <code>repeated .google.fhir.r4.core.Patient.Link link = 25;</code>
   */
  java.util.List<com.google.fhir.r4.core.Patient.Link> 
      getLinkList();
  /**
   * <code>repeated .google.fhir.r4.core.Patient.Link link = 25;</code>
   */
  com.google.fhir.r4.core.Patient.Link getLink(int index);
  /**
   * <code>repeated .google.fhir.r4.core.Patient.Link link = 25;</code>
   */
  int getLinkCount();
  /**
   * <code>repeated .google.fhir.r4.core.Patient.Link link = 25;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.Patient.LinkOrBuilder> 
      getLinkOrBuilderList();
  /**
   * <code>repeated .google.fhir.r4.core.Patient.Link link = 25;</code>
   */
  com.google.fhir.r4.core.Patient.LinkOrBuilder getLinkOrBuilder(
      int index);
}
