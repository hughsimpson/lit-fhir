use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;


use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::Extension::Extension;
use crate::core::model::Meta::Meta;
use crate::core::model::Quantity::Quantity;
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::hl7::model::Narrative::Narrative;



#[derive(Clone, Debug)]
pub struct MedicinalProductManufactured {
  pub(crate) quantity: Quantity,
  pub(crate) ingredient: Vector<Reference>,
  pub(crate) manufacturer: Vector<Reference>,
  pub(crate) unitOfPresentation: Option<CodeableConcept>,
  pub(crate) manufacturedDoseForm: CodeableConcept,
  pub(crate) otherCharacteristics: Vector<CodeableConcept>,
  pub(crate) physicalCharacteristics: Option<any>,
}