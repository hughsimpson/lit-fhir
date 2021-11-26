use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;


use crate::core::model::Extension::Extension;
use crate::core::model::Meta::Meta;
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::hl7::model::Narrative::Narrative;



#[derive(Clone, Debug)]
pub struct Linkage_Item {
  pub(crate) id: Option<String>,
  pub(crate) _type: String,
  pub(crate) resource: Box<Reference>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct Linkage {
  pub(crate) active: Option<bool>,
  pub(crate) author: Option<Box<Reference>>,
  pub(crate) item: Vector<Linkage_Item>,
}