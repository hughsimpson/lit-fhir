use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;


use crate::core::UnionCodeableConceptOrReference;
use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::core::model::Meta::Meta;
use crate::core::model::Quantity::Quantity;
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::hl7::UnionDateTimeOrPeriodOrTiming;
use crate::hl7::model::Narrative::Narrative;



#[derive(Clone, Debug)]
pub struct SupplyDelivery_SuppliedItem {
  pub(crate) id: Option<String>,
  pub(crate) item: Option<UnionCodeableConceptOrReference>,
  pub(crate) quantity: Option<Quantity>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct SupplyDelivery {
  pub(crate) _type: Option<CodeableConcept>,
  pub(crate) partOf: Vector<Reference>,
  pub(crate) status: Option<String>,
  pub(crate) basedOn: Vector<Reference>,
  pub(crate) patient: Option<Box<Reference>>,
  pub(crate) supplier: Option<Box<Reference>>,
  pub(crate) receiver: Vector<Reference>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) destination: Option<Box<Reference>>,
  pub(crate) occurrence: Option<UnionDateTimeOrPeriodOrTiming>,
  pub(crate) suppliedItem: Option<SupplyDelivery_SuppliedItem>,
}