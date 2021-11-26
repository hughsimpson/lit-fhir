use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;


use crate::core::model::Extension::Extension;
use crate::core::model::Meta::Meta;
use crate::core::model::Resource::Resource;
use crate::hl7::model::Narrative::Narrative;



#[derive(Clone, Debug)]
pub struct DomainResource {
  pub(crate) text: Option<Narrative>,
  pub(crate) contained: Vector<Resource>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}