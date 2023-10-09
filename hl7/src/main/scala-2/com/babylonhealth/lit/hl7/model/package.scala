package com.babylonhealth.lit.hl7

import java.time.{ LocalDate, LocalTime, ZonedDateTime }
import java.util.UUID

import izumi.reflect.macrortti.LTag

import com.babylonhealth.lit.core._
import com.babylonhealth.lit.core.model._
import com.babylonhealth.lit.hl7.model._

object UnionAliases {
  type Union00107722725 = FHIRDateTime \/ Period \/ Timing \/ ZonedDateTime
  type Union00177902846 = FHIRString \/ Quantity \/ Range \/ Ratio
  type Union00193937709 = Canonical \/ CodeableConcept \/ DataRequirement \/ Expression \/ Reference \/ TriggerDefinition
  type Union00486695352 = BigDecimal \/ Boolean \/ FHIRString \/ Id \/ Int
  type Union00617434070 = Coding \/ FHIRDate \/ FHIRString \/ Int \/ LocalTime \/ Reference
  type Union00969593238 = Attachment \/ Boolean \/ FHIRString \/ Quantity \/ Reference
  type Union01155656698 = Age \/ FHIRString \/ Period \/ Range
  type Union01405873694 = Age \/ Duration \/ FHIRDateTime \/ Period \/ Range \/ Timing
  type Union01409210820 = BigDecimal \/ Boolean \/ Code \/ Coding \/ FHIRDateTime \/ FHIRString \/ Int
  type Union01480857620 =
    BigDecimal \/ FHIRDate \/ FHIRDateTime \/ Int \/ LocalTime \/ PositiveInt \/ Quantity \/ UnsignedInt \/ ZonedDateTime
  type Union01763000476 = Duration \/ FHIRDateTime \/ Period \/ Timing
  type Union01850316684 = Boolean \/ CodeableConcept \/ Quantity \/ Range
  type Union02087996915 =
    Boolean \/ CodeableConcept \/ FHIRDateTime \/ FHIRString \/ Int \/ LocalTime \/ Period \/ Quantity \/ Range \/ Ratio \/ SampledData
  type UnionAddressOrCodeableConceptOrReference = Address \/ CodeableConcept \/ Reference
  type UnionAddressOrReference                  = Address \/ Reference
  type UnionAgeOrFHIRStringOrRange              = Age \/ FHIRString \/ Range
  type UnionAttachmentOrFHIRStringOrReference   = Attachment \/ FHIRString \/ Reference
  type UnionAttachmentOrReference               = Attachment \/ Reference
  type UnionBase64BinaryOrFHIRString            = Base64Binary \/ FHIRString
  type UnionBooleanOrCanonical                  = Boolean \/ Canonical
  type UnionBooleanOrDateTime                   = Boolean \/ FHIRDateTime
  type UnionBooleanOrInteger                    = Boolean \/ Int
  type UnionBooleanOrReference                  = Boolean \/ Reference
  type UnionCanonicalOrCodeableConceptOrUri     = Canonical \/ CodeableConcept \/ UriStr
  type UnionCanonicalOrUri                      = Canonical \/ UriStr
  type UnionCodeableConceptOrDate               = CodeableConcept \/ FHIRDate
  type UnionCodeableConceptOrDuration           = CodeableConcept \/ Duration
  type UnionCodeableConceptOrQuantity           = CodeableConcept \/ Quantity
  type UnionCodeableConceptOrQuantityOrRange    = CodeableConcept \/ Quantity \/ Range
  type UnionCodingOrUri                         = Coding \/ UriStr
  type UnionDateOrFHIRStringOrPeriod            = FHIRDate \/ FHIRString \/ Period
  type UnionDateOrPeriod                        = FHIRDate \/ Period
  type UnionDateTimeOrFHIRString                = FHIRDateTime \/ FHIRString
  type UnionDateTimeOrPeriod                    = FHIRDateTime \/ Period
  type UnionDateTimeOrPeriodOrTiming            = FHIRDateTime \/ Period \/ Timing
  type UnionDecimalOrRange                      = BigDecimal \/ Range
  type UnionDurationOrDate                      = Duration \/ FHIRDate
  type UnionDurationOrRange                     = Duration \/ Range
  type UnionFHIRStringOrMoneyOrUnsignedInt      = FHIRString \/ Money \/ UnsignedInt
  type UnionFHIRStringOrPeriodOrTiming          = FHIRString \/ Period \/ Timing
  type UnionFHIRStringOrPositiveInt             = FHIRString \/ PositiveInt
  type UnionFHIRStringOrQuantity                = FHIRString \/ Quantity
  type UnionFHIRStringOrQuantityOrRange         = FHIRString \/ Quantity \/ Range
  type UnionIdentifierOrReference               = Identifier \/ Reference
  type UnionMoneyOrQuantity                     = Money \/ Quantity
  type UnionMoneyOrUnsignedInt                  = Money \/ UnsignedInt
  type UnionPeriodOrRange                       = Period \/ Range
  type UnionQuantityOrRatio                     = Quantity \/ Ratio
  type UnionReferenceOrUrl                      = Reference \/ UrlStr
  type Union_0044338899                         = Canonical \/ CodeableConcept \/ DataRequirement \/ Expression
  type Union_0231587408                         = Age \/ Boolean \/ FHIRDate \/ FHIRString \/ Range
  type Union_0245096255                         = BigDecimal \/ Boolean \/ Code \/ FHIRDateTime \/ FHIRString \/ Int \/ UriStr
  type Union_0461247536                         = Age \/ FHIRDateTime \/ FHIRString \/ Period \/ Range
  type Union_1090046580                         = Boolean \/ CodeableConcept \/ FHIRString \/ Int \/ Quantity \/ Range \/ Ratio
  type Union_1173468863                         = Base64Binary \/ CodeableConcept \/ FHIRString \/ Quantity
  type Union_1180501282 =
    Attachment \/ BigDecimal \/ Boolean \/ Coding \/ FHIRDate \/ FHIRDateTime \/ FHIRString \/ Int \/ LocalTime \/ Quantity \/ Reference \/ UriStr
  type Union_1492638938 =
    BigDecimal \/ Boolean \/ Coding \/ FHIRDate \/ FHIRDateTime \/ FHIRString \/ Int \/ LocalTime \/ Quantity \/ Reference
  type Union_1690912481 = Boolean \/ CodeableConcept \/ Quantity \/ Range \/ Reference

  val Union00107722725Tag: LTag[Union00107722725] = LTag[Union00107722725]
  val Union00177902846Tag: LTag[Union00177902846] = LTag[Union00177902846]
  val Union00193937709Tag: LTag[Union00193937709] = LTag[Union00193937709]
  val Union00486695352Tag: LTag[Union00486695352] = LTag[Union00486695352]
  val Union00617434070Tag: LTag[Union00617434070] = LTag[Union00617434070]
  val Union00969593238Tag: LTag[Union00969593238] = LTag[Union00969593238]
  val Union01155656698Tag: LTag[Union01155656698] = LTag[Union01155656698]
  val Union01405873694Tag: LTag[Union01405873694] = LTag[Union01405873694]
  val Union01409210820Tag: LTag[Union01409210820] = LTag[Union01409210820]
  val Union01480857620Tag: LTag[Union01480857620] = LTag[Union01480857620]
  val Union01763000476Tag: LTag[Union01763000476] = LTag[Union01763000476]
  val Union01850316684Tag: LTag[Union01850316684] = LTag[Union01850316684]
  val Union02087996915Tag: LTag[Union02087996915] = LTag[Union02087996915]
  val UnionAddressOrCodeableConceptOrReferenceTag: LTag[UnionAddressOrCodeableConceptOrReference] =
    LTag[UnionAddressOrCodeableConceptOrReference]
  val UnionAddressOrReferenceTag: LTag[UnionAddressOrReference]         = LTag[UnionAddressOrReference]
  val UnionAgeOrFHIRStringOrRangeTag: LTag[UnionAgeOrFHIRStringOrRange] = LTag[UnionAgeOrFHIRStringOrRange]
  val UnionAttachmentOrFHIRStringOrReferenceTag: LTag[UnionAttachmentOrFHIRStringOrReference] =
    LTag[UnionAttachmentOrFHIRStringOrReference]
  val UnionAttachmentOrReferenceTag: LTag[UnionAttachmentOrReference]       = LTag[UnionAttachmentOrReference]
  val UnionBase64BinaryOrFHIRStringTag: LTag[UnionBase64BinaryOrFHIRString] = LTag[UnionBase64BinaryOrFHIRString]
  val UnionBooleanOrCanonicalTag: LTag[UnionBooleanOrCanonical]             = LTag[UnionBooleanOrCanonical]
  val UnionBooleanOrDateTimeTag: LTag[UnionBooleanOrDateTime]               = LTag[UnionBooleanOrDateTime]
  val UnionBooleanOrIntegerTag: LTag[UnionBooleanOrInteger]                 = LTag[UnionBooleanOrInteger]
  val UnionBooleanOrReferenceTag: LTag[UnionBooleanOrReference]             = LTag[UnionBooleanOrReference]
  val UnionCanonicalOrCodeableConceptOrUriTag: LTag[UnionCanonicalOrCodeableConceptOrUri] =
    LTag[UnionCanonicalOrCodeableConceptOrUri]
  val UnionCanonicalOrUriTag: LTag[UnionCanonicalOrUri]                       = LTag[UnionCanonicalOrUri]
  val UnionCodeableConceptOrDateTag: LTag[UnionCodeableConceptOrDate]         = LTag[UnionCodeableConceptOrDate]
  val UnionCodeableConceptOrDurationTag: LTag[UnionCodeableConceptOrDuration] = LTag[UnionCodeableConceptOrDuration]
  val UnionCodeableConceptOrQuantityOrRangeTag: LTag[UnionCodeableConceptOrQuantityOrRange] =
    LTag[UnionCodeableConceptOrQuantityOrRange]
  val UnionCodeableConceptOrQuantityTag: LTag[UnionCodeableConceptOrQuantity] = LTag[UnionCodeableConceptOrQuantity]
  val UnionCodingOrUriTag: LTag[UnionCodingOrUri]                             = LTag[UnionCodingOrUri]
  val UnionDateOrFHIRStringOrPeriodTag: LTag[UnionDateOrFHIRStringOrPeriod]   = LTag[UnionDateOrFHIRStringOrPeriod]
  val UnionDateOrPeriodTag: LTag[UnionDateOrPeriod]                           = LTag[UnionDateOrPeriod]
  val UnionDateTimeOrFHIRStringTag: LTag[UnionDateTimeOrFHIRString]           = LTag[UnionDateTimeOrFHIRString]
  val UnionDateTimeOrPeriodOrTimingTag: LTag[UnionDateTimeOrPeriodOrTiming]   = LTag[UnionDateTimeOrPeriodOrTiming]
  val UnionDateTimeOrPeriodTag: LTag[UnionDateTimeOrPeriod]                   = LTag[UnionDateTimeOrPeriod]
  val UnionDecimalOrRangeTag: LTag[UnionDecimalOrRange]                       = LTag[UnionDecimalOrRange]
  val UnionDurationOrDateTag: LTag[UnionDurationOrDate]                       = LTag[UnionDurationOrDate]
  val UnionDurationOrRangeTag: LTag[UnionDurationOrRange]                     = LTag[UnionDurationOrRange]
  val UnionFHIRStringOrMoneyOrUnsignedIntTag: LTag[UnionFHIRStringOrMoneyOrUnsignedInt] =
    LTag[UnionFHIRStringOrMoneyOrUnsignedInt]
  val UnionFHIRStringOrPeriodOrTimingTag: LTag[UnionFHIRStringOrPeriodOrTiming]   = LTag[UnionFHIRStringOrPeriodOrTiming]
  val UnionFHIRStringOrPositiveIntTag: LTag[UnionFHIRStringOrPositiveInt]         = LTag[UnionFHIRStringOrPositiveInt]
  val UnionFHIRStringOrQuantityOrRangeTag: LTag[UnionFHIRStringOrQuantityOrRange] = LTag[UnionFHIRStringOrQuantityOrRange]
  val UnionFHIRStringOrQuantityTag: LTag[UnionFHIRStringOrQuantity]               = LTag[UnionFHIRStringOrQuantity]
  val UnionIdentifierOrReferenceTag: LTag[UnionIdentifierOrReference]             = LTag[UnionIdentifierOrReference]
  val UnionMoneyOrQuantityTag: LTag[UnionMoneyOrQuantity]                         = LTag[UnionMoneyOrQuantity]
  val UnionMoneyOrUnsignedIntTag: LTag[UnionMoneyOrUnsignedInt]                   = LTag[UnionMoneyOrUnsignedInt]
  val UnionPeriodOrRangeTag: LTag[UnionPeriodOrRange]                             = LTag[UnionPeriodOrRange]
  val UnionQuantityOrRatioTag: LTag[UnionQuantityOrRatio]                         = LTag[UnionQuantityOrRatio]
  val UnionReferenceOrUrlTag: LTag[UnionReferenceOrUrl]                           = LTag[UnionReferenceOrUrl]
  val Union_0044338899Tag: LTag[Union_0044338899]                                 = LTag[Union_0044338899]
  val Union_0231587408Tag: LTag[Union_0231587408]                                 = LTag[Union_0231587408]
  val Union_0245096255Tag: LTag[Union_0245096255]                                 = LTag[Union_0245096255]
  val Union_0461247536Tag: LTag[Union_0461247536]                                 = LTag[Union_0461247536]
  val Union_1090046580Tag: LTag[Union_1090046580]                                 = LTag[Union_1090046580]
  val Union_1173468863Tag: LTag[Union_1173468863]                                 = LTag[Union_1173468863]
  val Union_1180501282Tag: LTag[Union_1180501282]                                 = LTag[Union_1180501282]
  val Union_1492638938Tag: LTag[Union_1492638938]                                 = LTag[Union_1492638938]
  val Union_1690912481Tag: LTag[Union_1690912481]                                 = LTag[Union_1690912481]
}

object Module
    extends ModuleDict(
      Map(
        "http://hl7.org/fhir/StructureDefinition/Account"                           -> Account,
        "http://hl7.org/fhir/StructureDefinition/ActivityDefinition"                -> ActivityDefinition,
        "http://hl7.org/fhir/StructureDefinition/AdverseEvent"                      -> AdverseEvent,
        "http://hl7.org/fhir/StructureDefinition/AllergyIntolerance"                -> AllergyIntolerance,
        "http://hl7.org/fhir/StructureDefinition/Appointment"                       -> Appointment,
        "http://hl7.org/fhir/StructureDefinition/AppointmentResponse"               -> AppointmentResponse,
        "http://hl7.org/fhir/StructureDefinition/AuditEvent"                        -> AuditEvent,
        "http://hl7.org/fhir/StructureDefinition/Basic"                             -> Basic,
        "http://hl7.org/fhir/StructureDefinition/Binary"                            -> Binary,
        "http://hl7.org/fhir/StructureDefinition/BiologicallyDerivedProduct"        -> BiologicallyDerivedProduct,
        "http://hl7.org/fhir/StructureDefinition/BodyStructure"                     -> BodyStructure,
        "http://hl7.org/fhir/StructureDefinition/Bundle"                            -> Bundle,
        "http://hl7.org/fhir/StructureDefinition/CapabilityStatement"               -> CapabilityStatement,
        "http://hl7.org/fhir/StructureDefinition/CarePlan"                          -> CarePlan,
        "http://hl7.org/fhir/StructureDefinition/CareTeam"                          -> CareTeam,
        "http://hl7.org/fhir/StructureDefinition/CatalogEntry"                      -> CatalogEntry,
        "http://hl7.org/fhir/StructureDefinition/ChargeItem"                        -> ChargeItem,
        "http://hl7.org/fhir/StructureDefinition/ChargeItemDefinition"              -> ChargeItemDefinition,
        "http://hl7.org/fhir/StructureDefinition/Claim"                             -> Claim,
        "http://hl7.org/fhir/StructureDefinition/ClaimResponse"                     -> ClaimResponse,
        "http://hl7.org/fhir/StructureDefinition/ClinicalImpression"                -> ClinicalImpression,
        "http://hl7.org/fhir/StructureDefinition/CodeSystem"                        -> CodeSystem,
        "http://hl7.org/fhir/StructureDefinition/Communication"                     -> Communication,
        "http://hl7.org/fhir/StructureDefinition/CommunicationRequest"              -> CommunicationRequest,
        "http://hl7.org/fhir/StructureDefinition/CompartmentDefinition"             -> CompartmentDefinition,
        "http://hl7.org/fhir/StructureDefinition/Composition"                       -> Composition,
        "http://hl7.org/fhir/StructureDefinition/ConceptMap"                        -> ConceptMap,
        "http://hl7.org/fhir/StructureDefinition/Condition"                         -> Condition,
        "http://hl7.org/fhir/StructureDefinition/Consent"                           -> Consent,
        "http://hl7.org/fhir/StructureDefinition/Contract"                          -> Contract,
        "http://hl7.org/fhir/StructureDefinition/Coverage"                          -> Coverage,
        "http://hl7.org/fhir/StructureDefinition/CoverageEligibilityRequest"        -> CoverageEligibilityRequest,
        "http://hl7.org/fhir/StructureDefinition/CoverageEligibilityResponse"       -> CoverageEligibilityResponse,
        "http://hl7.org/fhir/StructureDefinition/DetectedIssue"                     -> DetectedIssue,
        "http://hl7.org/fhir/StructureDefinition/Device"                            -> Device,
        "http://hl7.org/fhir/StructureDefinition/DeviceDefinition"                  -> DeviceDefinition,
        "http://hl7.org/fhir/StructureDefinition/DeviceMetric"                      -> DeviceMetric,
        "http://hl7.org/fhir/StructureDefinition/DeviceRequest"                     -> DeviceRequest,
        "http://hl7.org/fhir/StructureDefinition/DeviceUseStatement"                -> DeviceUseStatement,
        "http://hl7.org/fhir/StructureDefinition/DiagnosticReport"                  -> DiagnosticReport,
        "http://hl7.org/fhir/StructureDefinition/DocumentManifest"                  -> DocumentManifest,
        "http://hl7.org/fhir/StructureDefinition/DocumentReference"                 -> DocumentReference,
        "http://hl7.org/fhir/StructureDefinition/DomainResource"                    -> DomainResource,
        "http://hl7.org/fhir/StructureDefinition/EffectEvidenceSynthesis"           -> EffectEvidenceSynthesis,
        "http://hl7.org/fhir/StructureDefinition/ElementDefinition"                 -> ElementDefinition,
        "http://hl7.org/fhir/StructureDefinition/Encounter"                         -> Encounter,
        "http://hl7.org/fhir/StructureDefinition/Endpoint"                          -> Endpoint,
        "http://hl7.org/fhir/StructureDefinition/EnrollmentRequest"                 -> EnrollmentRequest,
        "http://hl7.org/fhir/StructureDefinition/EnrollmentResponse"                -> EnrollmentResponse,
        "http://hl7.org/fhir/StructureDefinition/EpisodeOfCare"                     -> EpisodeOfCare,
        "http://hl7.org/fhir/StructureDefinition/EventDefinition"                   -> EventDefinition,
        "http://hl7.org/fhir/StructureDefinition/Evidence"                          -> Evidence,
        "http://hl7.org/fhir/StructureDefinition/EvidenceVariable"                  -> EvidenceVariable,
        "http://hl7.org/fhir/StructureDefinition/ExampleScenario"                   -> ExampleScenario,
        "http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit"              -> ExplanationOfBenefit,
        "http://hl7.org/fhir/StructureDefinition/FamilyMemberHistory"               -> FamilyMemberHistory,
        "http://hl7.org/fhir/StructureDefinition/Flag"                              -> Flag,
        "http://hl7.org/fhir/StructureDefinition/Goal"                              -> Goal,
        "http://hl7.org/fhir/StructureDefinition/GraphDefinition"                   -> GraphDefinition,
        "http://hl7.org/fhir/StructureDefinition/Group"                             -> Group,
        "http://hl7.org/fhir/StructureDefinition/GuidanceResponse"                  -> GuidanceResponse,
        "http://hl7.org/fhir/StructureDefinition/HealthcareService"                 -> HealthcareService,
        "http://hl7.org/fhir/StructureDefinition/ImagingStudy"                      -> ImagingStudy,
        "http://hl7.org/fhir/StructureDefinition/Immunization"                      -> Immunization,
        "http://hl7.org/fhir/StructureDefinition/ImmunizationEvaluation"            -> ImmunizationEvaluation,
        "http://hl7.org/fhir/StructureDefinition/ImmunizationRecommendation"        -> ImmunizationRecommendation,
        "http://hl7.org/fhir/StructureDefinition/ImplementationGuide"               -> ImplementationGuide,
        "http://hl7.org/fhir/StructureDefinition/InsurancePlan"                     -> InsurancePlan,
        "http://hl7.org/fhir/StructureDefinition/Invoice"                           -> Invoice,
        "http://hl7.org/fhir/StructureDefinition/Library"                           -> Library,
        "http://hl7.org/fhir/StructureDefinition/Linkage"                           -> Linkage,
        "http://hl7.org/fhir/StructureDefinition/List"                              -> FHIRList,
        "http://hl7.org/fhir/StructureDefinition/Location"                          -> Location,
        "http://hl7.org/fhir/StructureDefinition/Measure"                           -> Measure,
        "http://hl7.org/fhir/StructureDefinition/MeasureReport"                     -> MeasureReport,
        "http://hl7.org/fhir/StructureDefinition/Media"                             -> Media,
        "http://hl7.org/fhir/StructureDefinition/Medication"                        -> Medication,
        "http://hl7.org/fhir/StructureDefinition/MedicationAdministration"          -> MedicationAdministration,
        "http://hl7.org/fhir/StructureDefinition/MedicationDispense"                -> MedicationDispense,
        "http://hl7.org/fhir/StructureDefinition/MedicationKnowledge"               -> MedicationKnowledge,
        "http://hl7.org/fhir/StructureDefinition/MedicationRequest"                 -> MedicationRequest,
        "http://hl7.org/fhir/StructureDefinition/MedicationStatement"               -> MedicationStatement,
        "http://hl7.org/fhir/StructureDefinition/MedicinalProduct"                  -> MedicinalProduct,
        "http://hl7.org/fhir/StructureDefinition/MedicinalProductAuthorization"     -> MedicinalProductAuthorization,
        "http://hl7.org/fhir/StructureDefinition/MedicinalProductContraindication"  -> MedicinalProductContraindication,
        "http://hl7.org/fhir/StructureDefinition/MedicinalProductIndication"        -> MedicinalProductIndication,
        "http://hl7.org/fhir/StructureDefinition/MedicinalProductIngredient"        -> MedicinalProductIngredient,
        "http://hl7.org/fhir/StructureDefinition/MedicinalProductInteraction"       -> MedicinalProductInteraction,
        "http://hl7.org/fhir/StructureDefinition/MedicinalProductManufactured"      -> MedicinalProductManufactured,
        "http://hl7.org/fhir/StructureDefinition/MedicinalProductPackaged"          -> MedicinalProductPackaged,
        "http://hl7.org/fhir/StructureDefinition/MedicinalProductPharmaceutical"    -> MedicinalProductPharmaceutical,
        "http://hl7.org/fhir/StructureDefinition/MedicinalProductUndesirableEffect" -> MedicinalProductUndesirableEffect,
        "http://hl7.org/fhir/StructureDefinition/MessageDefinition"                 -> MessageDefinition,
        "http://hl7.org/fhir/StructureDefinition/MessageHeader"                     -> MessageHeader,
        "http://hl7.org/fhir/StructureDefinition/MolecularSequence"                 -> MolecularSequence,
        "http://hl7.org/fhir/StructureDefinition/MoneyQuantity"                     -> MoneyQuantity,
        "http://hl7.org/fhir/StructureDefinition/NamingSystem"                      -> NamingSystem,
        "http://hl7.org/fhir/StructureDefinition/Narrative"                         -> Narrative,
        "http://hl7.org/fhir/StructureDefinition/NutritionOrder"                    -> NutritionOrder,
        "http://hl7.org/fhir/StructureDefinition/Observation"                       -> Observation,
        "http://hl7.org/fhir/StructureDefinition/ObservationDefinition"             -> ObservationDefinition,
        "http://hl7.org/fhir/StructureDefinition/OperationDefinition"               -> OperationDefinition,
        "http://hl7.org/fhir/StructureDefinition/OperationOutcome"                  -> OperationOutcome,
        "http://hl7.org/fhir/StructureDefinition/Organization"                      -> Organization,
        "http://hl7.org/fhir/StructureDefinition/OrganizationAffiliation"           -> OrganizationAffiliation,
        "http://hl7.org/fhir/StructureDefinition/Parameters"                        -> Parameters,
        "http://hl7.org/fhir/StructureDefinition/Patient"                           -> Patient,
        "http://hl7.org/fhir/StructureDefinition/PaymentNotice"                     -> PaymentNotice,
        "http://hl7.org/fhir/StructureDefinition/PaymentReconciliation"             -> PaymentReconciliation,
        "http://hl7.org/fhir/StructureDefinition/Person"                            -> Person,
        "http://hl7.org/fhir/StructureDefinition/PlanDefinition"                    -> PlanDefinition,
        "http://hl7.org/fhir/StructureDefinition/Practitioner"                      -> Practitioner,
        "http://hl7.org/fhir/StructureDefinition/PractitionerRole"                  -> PractitionerRole,
        "http://hl7.org/fhir/StructureDefinition/Procedure"                         -> Procedure,
        "http://hl7.org/fhir/StructureDefinition/Provenance"                        -> Provenance,
        "http://hl7.org/fhir/StructureDefinition/Questionnaire"                     -> Questionnaire,
        "http://hl7.org/fhir/StructureDefinition/QuestionnaireResponse"             -> QuestionnaireResponse,
        "http://hl7.org/fhir/StructureDefinition/RelatedPerson"                     -> RelatedPerson,
        "http://hl7.org/fhir/StructureDefinition/RequestGroup"                      -> RequestGroup,
        "http://hl7.org/fhir/StructureDefinition/ResearchDefinition"                -> ResearchDefinition,
        "http://hl7.org/fhir/StructureDefinition/ResearchElementDefinition"         -> ResearchElementDefinition,
        "http://hl7.org/fhir/StructureDefinition/ResearchStudy"                     -> ResearchStudy,
        "http://hl7.org/fhir/StructureDefinition/ResearchSubject"                   -> ResearchSubject,
        "http://hl7.org/fhir/StructureDefinition/RiskAssessment"                    -> RiskAssessment,
        "http://hl7.org/fhir/StructureDefinition/RiskEvidenceSynthesis"             -> RiskEvidenceSynthesis,
        "http://hl7.org/fhir/StructureDefinition/Schedule"                          -> Schedule,
        "http://hl7.org/fhir/StructureDefinition/SearchParameter"                   -> SearchParameter,
        "http://hl7.org/fhir/StructureDefinition/ServiceRequest"                    -> ServiceRequest,
        "http://hl7.org/fhir/StructureDefinition/SimpleQuantity"                    -> SimpleQuantity,
        "http://hl7.org/fhir/StructureDefinition/Slot"                              -> Slot,
        "http://hl7.org/fhir/StructureDefinition/Specimen"                          -> Specimen,
        "http://hl7.org/fhir/StructureDefinition/SpecimenDefinition"                -> SpecimenDefinition,
        "http://hl7.org/fhir/StructureDefinition/StructureDefinition"               -> StructureDefinition,
        "http://hl7.org/fhir/StructureDefinition/StructureMap"                      -> StructureMap,
        "http://hl7.org/fhir/StructureDefinition/Subscription"                      -> Subscription,
        "http://hl7.org/fhir/StructureDefinition/Substance"                         -> Substance,
        "http://hl7.org/fhir/StructureDefinition/SubstancePolymer"                  -> SubstancePolymer,
        "http://hl7.org/fhir/StructureDefinition/SubstanceReferenceInformation"     -> SubstanceReferenceInformation,
        "http://hl7.org/fhir/StructureDefinition/SubstanceSpecification"            -> SubstanceSpecification,
        "http://hl7.org/fhir/StructureDefinition/SupplyDelivery"                    -> SupplyDelivery,
        "http://hl7.org/fhir/StructureDefinition/SupplyRequest"                     -> SupplyRequest,
        "http://hl7.org/fhir/StructureDefinition/Task"                              -> Task,
        "http://hl7.org/fhir/StructureDefinition/TerminologyCapabilities"           -> TerminologyCapabilities,
        "http://hl7.org/fhir/StructureDefinition/TestReport"                        -> TestReport,
        "http://hl7.org/fhir/StructureDefinition/TestScript"                        -> TestScript,
        "http://hl7.org/fhir/StructureDefinition/ValueSet"                          -> ValueSet,
        "http://hl7.org/fhir/StructureDefinition/VerificationResult"                -> VerificationResult,
        "http://hl7.org/fhir/StructureDefinition/VisionPrescription"                -> VisionPrescription,
        "http://hl7.org/fhir/StructureDefinition/shareablecodesystem"               -> Shareablecodesystem,
        "http://hl7.org/fhir/StructureDefinition/shareablevalueset"                 -> Shareablevalueset
      ))
