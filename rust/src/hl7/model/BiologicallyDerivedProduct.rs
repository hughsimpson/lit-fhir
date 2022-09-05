use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;

use crate::core::model::FHIRObject::FHIRObject;

use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::core::model::Meta::Meta;
use crate::core::model::Period::Period;
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::hl7::UnionDateTimeOrPeriod;
use crate::hl7::model::DomainResource::DomainResource;
use crate::hl7::model::Narrative::Narrative;



#[derive(Clone, Debug)]
pub struct BiologicallyDerivedProduct_Storage {
  pub(crate) id: Option<String>,
  pub(crate) scale: Option<String>,
  pub(crate) duration: Option<Box<dyn Period>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) description: Option<String>,
  pub(crate) temperature: Option<BigDecimal>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}


#[derive(Clone, Debug)]
pub struct BiologicallyDerivedProduct_Collection {
  pub(crate) id: Option<String>,
  pub(crate) source: Option<Box<dyn Reference>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) collector: Option<Box<dyn Reference>>,
  pub(crate) collected: Option<UnionDateTimeOrPeriod>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}


#[derive(Clone, Debug)]
pub struct BiologicallyDerivedProduct_Processing {
  pub(crate) id: Option<String>,
  pub(crate) time: Option<UnionDateTimeOrPeriod>,
  pub(crate) additive: Option<Box<dyn Reference>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) procedure: Option<Box<dyn CodeableConcept>>,
  pub(crate) description: Option<String>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}


#[derive(Clone, Debug)]
pub struct BiologicallyDerivedProduct_Manipulation {
  pub(crate) id: Option<String>,
  pub(crate) time: Option<UnionDateTimeOrPeriod>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) description: Option<String>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}

#[derive(Clone, Debug)]
pub struct BiologicallyDerivedProductRaw {
  pub(crate) id: Option<String>,
  pub(crate) meta: Option<Box<dyn Meta>>,
  pub(crate) text: Option<Box<dyn Narrative>>,
  pub(crate) status: Option<String>,
  pub(crate) parent: Vector<Box<dyn Reference>>,
  pub(crate) request: Vector<Box<dyn Reference>>,
  pub(crate) language: Option<String>,
  pub(crate) quantity: Option<i32>,
  pub(crate) contained: Vector<Box<dyn Resource>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) identifier: Vector<Box<dyn Identifier>>,
  pub(crate) productCode: Option<Box<dyn CodeableConcept>>,
  pub(crate) implicitRules: Option<String>,
  pub(crate) productCategory: Option<String>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) storage: Vector<BiologicallyDerivedProduct_Storage>,
  pub(crate) collection: Option<BiologicallyDerivedProduct_Collection>,
  pub(crate) processing: Vector<BiologicallyDerivedProduct_Processing>,
  pub(crate) manipulation: Option<BiologicallyDerivedProduct_Manipulation>,
}

pub trait BiologicallyDerivedProduct : DomainResource {
  fn status(&self) -> &Option<String>;
  fn parent(&self) -> &Vector<Box<dyn Reference>>;
  fn request(&self) -> &Vector<Box<dyn Reference>>;
  fn quantity(&self) -> &Option<i32>;
  fn identifier(&self) -> &Vector<Box<dyn Identifier>>;
  fn productCode(&self) -> &Option<Box<dyn CodeableConcept>>;
  fn productCategory(&self) -> &Option<String>;
  fn storage(&self) -> &Vector<BiologicallyDerivedProduct_Storage>;
  fn collection(&self) -> &Option<BiologicallyDerivedProduct_Collection>;
  fn processing(&self) -> &Vector<BiologicallyDerivedProduct_Processing>;
  fn manipulation(&self) -> &Option<BiologicallyDerivedProduct_Manipulation>;
}

dyn_clone::clone_trait_object!(BiologicallyDerivedProduct);

impl FHIRObject for BiologicallyDerivedProductRaw {
}

impl Resource for BiologicallyDerivedProductRaw {
  fn id(&self) -> &Option<String> { &self.id }
  fn meta(&self) -> &Option<Box<dyn Meta>> { &self.meta }
  fn language(&self) -> &Option<String> { &self.language }
  fn implicitRules(&self) -> &Option<String> { &self.implicitRules }
}


impl DomainResource for BiologicallyDerivedProductRaw {
  fn text(&self) -> &Option<Box<dyn Narrative>> { &self.text }
  fn contained(&self) -> &Vector<Box<dyn Resource>> { &self.contained }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}


impl BiologicallyDerivedProduct for BiologicallyDerivedProductRaw {
  fn status(&self) -> &Option<String> { &self.status }
  fn parent(&self) -> &Vector<Box<dyn Reference>> { &self.parent }
  fn request(&self) -> &Vector<Box<dyn Reference>> { &self.request }
  fn quantity(&self) -> &Option<i32> { &self.quantity }
  fn identifier(&self) -> &Vector<Box<dyn Identifier>> { &self.identifier }
  fn productCode(&self) -> &Option<Box<dyn CodeableConcept>> { &self.productCode }
  fn productCategory(&self) -> &Option<String> { &self.productCategory }
  fn storage(&self) -> &Vector<BiologicallyDerivedProduct_Storage> { &self.storage }
  fn collection(&self) -> &Option<BiologicallyDerivedProduct_Collection> { &self.collection }
  fn processing(&self) -> &Vector<BiologicallyDerivedProduct_Processing> { &self.processing }
  fn manipulation(&self) -> &Option<BiologicallyDerivedProduct_Manipulation> { &self.manipulation }
}

