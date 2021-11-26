use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;


use crate::core::model::Annotation::Annotation;
use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::ContactPoint::ContactPoint;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::core::model::Meta::Meta;
use crate::core::model::Period::Period;
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::hl7::model::Narrative::Narrative;



#[derive(Clone, Debug)]
pub struct CareTeam_Participant {
  pub(crate) id: Option<String>,
  pub(crate) role: Vector<CodeableConcept>,
  pub(crate) member: Option<Box<Reference>>,
  pub(crate) period: Option<Period>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) onBehalfOf: Option<Box<Reference>>,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct CareTeam {
  pub(crate) name: Option<String>,
  pub(crate) note: Vector<Annotation>,
  pub(crate) status: Option<String>,
  pub(crate) period: Option<Period>,
  pub(crate) subject: Option<Box<Reference>>,
  pub(crate) telecom: Vector<ContactPoint>,
  pub(crate) category: Vector<CodeableConcept>,
  pub(crate) encounter: Option<Box<Reference>>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) reasonCode: Vector<CodeableConcept>,
  pub(crate) reasonReference: Vector<Reference>,
  pub(crate) managingOrganization: Vector<Reference>,
  pub(crate) participant: Vector<CareTeam_Participant>,
}