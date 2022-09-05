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
pub struct EnrollmentResponseRaw {
  pub(crate) id: Option<String>,
  pub(crate) meta: Option<Box<dyn Meta>>,
  pub(crate) text: Option<Box<dyn Narrative>>,
  pub(crate) status: Option<String>,
  pub(crate) request: Option<Box<dyn Reference>>,
  pub(crate) outcome: Option<String>,
  pub(crate) created: Option<DateTime<FixedOffset>>,
  pub(crate) language: Option<String>,
  pub(crate) contained: Vector<Box<dyn Resource>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) identifier: Vector<Box<dyn Identifier>>,
  pub(crate) disposition: Option<String>,
  pub(crate) organization: Option<Box<dyn Reference>>,
  pub(crate) implicitRules: Option<String>,
  pub(crate) requestProvider: Option<Box<dyn Reference>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}

pub trait EnrollmentResponse : DomainResource {
  fn status(&self) -> &Option<String>;
  fn request(&self) -> &Option<Box<dyn Reference>>;
  fn outcome(&self) -> &Option<String>;
  fn created(&self) -> &Option<DateTime<FixedOffset>>;
  fn identifier(&self) -> &Vector<Box<dyn Identifier>>;
  fn disposition(&self) -> &Option<String>;
  fn organization(&self) -> &Option<Box<dyn Reference>>;
  fn requestProvider(&self) -> &Option<Box<dyn Reference>>;
}

dyn_clone::clone_trait_object!(EnrollmentResponse);

impl FHIRObject for EnrollmentResponseRaw {
}

impl Resource for EnrollmentResponseRaw {
  fn id(&self) -> &Option<String> { &self.id }
  fn meta(&self) -> &Option<Box<dyn Meta>> { &self.meta }
  fn language(&self) -> &Option<String> { &self.language }
  fn implicitRules(&self) -> &Option<String> { &self.implicitRules }
}


impl DomainResource for EnrollmentResponseRaw {
  fn text(&self) -> &Option<Box<dyn Narrative>> { &self.text }
  fn contained(&self) -> &Vector<Box<dyn Resource>> { &self.contained }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}


impl EnrollmentResponse for EnrollmentResponseRaw {
  fn status(&self) -> &Option<String> { &self.status }
  fn request(&self) -> &Option<Box<dyn Reference>> { &self.request }
  fn outcome(&self) -> &Option<String> { &self.outcome }
  fn created(&self) -> &Option<DateTime<FixedOffset>> { &self.created }
  fn identifier(&self) -> &Vector<Box<dyn Identifier>> { &self.identifier }
  fn disposition(&self) -> &Option<String> { &self.disposition }
  fn organization(&self) -> &Option<Box<dyn Reference>> { &self.organization }
  fn requestProvider(&self) -> &Option<Box<dyn Reference>> { &self.requestProvider }
}

