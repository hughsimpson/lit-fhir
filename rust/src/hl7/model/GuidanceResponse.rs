use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;


use crate::core::model::Annotation::Annotation;
use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::DataRequirement::DataRequirement;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::core::model::Meta::Meta;
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::hl7::UnionCanonicalOrCodeableConceptOrUri;
use crate::hl7::model::Narrative::Narrative;



#[derive(Clone, Debug)]
pub struct GuidanceResponse {
  pub(crate) note: Vector<Annotation>,
  pub(crate) status: String,
  pub(crate) result: Option<Box<Reference>>,
  pub(crate) subject: Option<Box<Reference>>,
  pub(crate) module: UnionCanonicalOrCodeableConceptOrUri,
  pub(crate) encounter: Option<Box<Reference>>,
  pub(crate) performer: Option<Box<Reference>>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) reasonCode: Vector<CodeableConcept>,
  pub(crate) reasonReference: Vector<Reference>,
  pub(crate) dataRequirement: Vector<DataRequirement>,
  pub(crate) outputParameters: Option<Box<Reference>>,
  pub(crate) requestIdentifier: Option<Identifier>,
  pub(crate) evaluationMessage: Vector<Reference>,
  pub(crate) occurrenceDateTime: Option<DateTime<FixedOffset>>,
}