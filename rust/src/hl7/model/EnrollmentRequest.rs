use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;

use crate::core::model::FHIRObject::FHIRObject;

use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::core::model::Meta::Meta;
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::hl7::model::DomainResource::DomainResource;
use crate::hl7::model::Narrative::Narrative;



#[derive(Clone, Debug)]
pub struct EnrollmentRequestRaw {
  pub(crate) id: Option<String>,
  pub(crate) meta: Option<Box<dyn Meta>>,
  pub(crate) text: Option<Box<dyn Narrative>>,
  pub(crate) status: Option<String>,
  pub(crate) created: Option<DateTime<FixedOffset>>,
  pub(crate) insurer: Option<Box<dyn Reference>>,
  pub(crate) language: Option<String>,
  pub(crate) provider: Option<Box<dyn Reference>>,
  pub(crate) coverage: Option<Box<dyn Reference>>,
  pub(crate) contained: Vector<Box<dyn Resource>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) candidate: Option<Box<dyn Reference>>,
  pub(crate) identifier: Vector<Box<dyn Identifier>>,
  pub(crate) implicitRules: Option<String>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}

pub trait EnrollmentRequest : DomainResource {
  fn status(&self) -> &Option<String>;
  fn created(&self) -> &Option<DateTime<FixedOffset>>;
  fn insurer(&self) -> &Option<Box<dyn Reference>>;
  fn provider(&self) -> &Option<Box<dyn Reference>>;
  fn coverage(&self) -> &Option<Box<dyn Reference>>;
  fn candidate(&self) -> &Option<Box<dyn Reference>>;
  fn identifier(&self) -> &Vector<Box<dyn Identifier>>;
}

dyn_clone::clone_trait_object!(EnrollmentRequest);

impl FHIRObject for EnrollmentRequestRaw {
}

impl Resource for EnrollmentRequestRaw {
  fn id(&self) -> &Option<String> { &self.id }
  fn meta(&self) -> &Option<Box<dyn Meta>> { &self.meta }
  fn language(&self) -> &Option<String> { &self.language }
  fn implicitRules(&self) -> &Option<String> { &self.implicitRules }
}


impl DomainResource for EnrollmentRequestRaw {
  fn text(&self) -> &Option<Box<dyn Narrative>> { &self.text }
  fn contained(&self) -> &Vector<Box<dyn Resource>> { &self.contained }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}


impl EnrollmentRequest for EnrollmentRequestRaw {
  fn status(&self) -> &Option<String> { &self.status }
  fn created(&self) -> &Option<DateTime<FixedOffset>> { &self.created }
  fn insurer(&self) -> &Option<Box<dyn Reference>> { &self.insurer }
  fn provider(&self) -> &Option<Box<dyn Reference>> { &self.provider }
  fn coverage(&self) -> &Option<Box<dyn Reference>> { &self.coverage }
  fn candidate(&self) -> &Option<Box<dyn Reference>> { &self.candidate }
  fn identifier(&self) -> &Vector<Box<dyn Identifier>> { &self.identifier }
}

