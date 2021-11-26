use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;


use crate::core::UnionCodeableConceptOrReference;
use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::Coding::Coding;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::core::model::Meta::Meta;
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::hl7::model::Narrative::Narrative;



#[derive(Clone, Debug)]
pub struct MedicinalProduct_SpecialDesignation {
  pub(crate) id: Option<String>,
  pub(crate) _type: Option<CodeableConcept>,
  pub(crate) date: Option<DateTime<FixedOffset>>,
  pub(crate) status: Option<CodeableConcept>,
  pub(crate) species: Option<CodeableConcept>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) intendedUse: Option<CodeableConcept>,
  pub(crate) indication: Option<UnionCodeableConceptOrReference>,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct MedicinalProduct_Name_NamePart {
  pub(crate) id: Option<String>,
  pub(crate) part: String,
  pub(crate) _type: Coding,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}



#[derive(Clone, Debug)]
pub struct MedicinalProduct_Name_CountryLanguage {
  pub(crate) id: Option<String>,
  pub(crate) country: CodeableConcept,
  pub(crate) language: CodeableConcept,
  pub(crate) extension: Vector<Extension>,
  pub(crate) jurisdiction: Option<CodeableConcept>,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct MedicinalProduct_Name {
  pub(crate) id: Option<String>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) productName: String,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) namePart: Vector<MedicinalProduct_Name_NamePart>,
  pub(crate) countryLanguage: Vector<MedicinalProduct_Name_CountryLanguage>,
}


#[derive(Clone, Debug)]
pub struct MedicinalProduct_ManufacturingBusinessOperation {
  pub(crate) id: Option<String>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) regulator: Option<Box<Reference>>,
  pub(crate) manufacturer: Vector<Reference>,
  pub(crate) operationType: Option<CodeableConcept>,
  pub(crate) effectiveDate: Option<DateTime<FixedOffset>>,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) confidentialityIndicator: Option<CodeableConcept>,
  pub(crate) authorisationReferenceNumber: Option<Identifier>,
}

#[derive(Clone, Debug)]
pub struct MedicinalProduct {
  pub(crate) _type: Option<CodeableConcept>,
  pub(crate) domain: Option<Coding>,
  pub(crate) contact: Vector<Reference>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) masterFile: Vector<Reference>,
  pub(crate) clinicalTrial: Vector<Reference>,
  pub(crate) crossReference: Vector<Identifier>,
  pub(crate) specialMeasures: Vector<String>,
  pub(crate) marketingStatus: Vector<any>,
  pub(crate) attachedDocument: Vector<Reference>,
  pub(crate) legalStatusOfSupply: Option<CodeableConcept>,
  pub(crate) productClassification: Vector<CodeableConcept>,
  pub(crate) pharmaceuticalProduct: Vector<Reference>,
  pub(crate) paediatricUseIndicator: Option<CodeableConcept>,
  pub(crate) packagedMedicinalProduct: Vector<Reference>,
  pub(crate) additionalMonitoringIndicator: Option<CodeableConcept>,
  pub(crate) combinedPharmaceuticalDoseForm: Option<CodeableConcept>,
  pub(crate) specialDesignation: Vector<MedicinalProduct_SpecialDesignation>,
  pub(crate) name: Vector<MedicinalProduct_Name>,
  pub(crate) manufacturingBusinessOperation: Vector<MedicinalProduct_ManufacturingBusinessOperation>,
}