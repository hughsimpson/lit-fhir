package com.babylonhealth.lit.core.model

import java.time.{ LocalDate, LocalTime, ZonedDateTime }
import java.util.UUID

import scala.collection.immutable.TreeMap
import scala.util.{ Success, Try }

import io.circe.{ Decoder, HCursor }

import com.babylonhealth.lit.core._
import com.babylonhealth.lit.core.BaseFieldDecoders._
import com.babylonhealth.lit.core.UnionAliases._
import com.babylonhealth.lit.core.ChoiceImplicits._
import com.babylonhealth.lit.core.TagSummoners.lTagOf
import com.babylonhealth.lit.core.serdes.{ objectDecoder, objectEncoder }
import com.babylonhealth.lit.core.model._
import com.babylonhealth.lit.core.UnionAliases._
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core }
import com.babylonhealth.lit.macros.POJOBoilerplate

<<<<<<< HEAD
object Resource extends CompanionFor[Resource] {
  implicit def summonObjectAndCompanionResource969113347(o: Resource): ObjectAndCompanion[Resource, Resource.type] =
    ObjectAndCompanion(o, this)
  override type ResourceType = Resource
  override type ParentType   = Resource
  override val baseType: CompanionFor[ResourceType] = Resource
  override val parentType: CompanionFor[ParentType] = Resource
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/Resource")
  def apply(
=======
object Resource extends CompanionFor[Resource[_]] {
  override type ResourceType[T] = Resource[T]
  override val baseType: CompanionFor[ResourceType[_]] = Resource
  override val profileUrl: Option[String]              = Some("http://hl7.org/fhir/StructureDefinition/Resource")
  def apply[Stage <: LifecycleStage: ValueOf](
>>>>>>> 1bcce413 (experimentations with a type param on the fhir classes to denote partial objects)
      id: Option[String] = None,
      meta: Option[Meta[Stage]] = None,
      language: Option[LANGUAGES] = None,
      implicitRules: Option[UriStr] = None,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Resource[Stage] = new Resource[Stage](
    id,
    meta,
    language,
    implicitRules,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  def meta[Stage]: FHIRComponentFieldMeta[Option[Meta[Stage]]] =
    FHIRComponentFieldMeta("meta", lTagOf[Option[Meta[Stage]]], false, lTagOf[Meta[Stage]])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  def fieldsMeta[Stage <: LifecycleStage: ValueOf]: Seq[FHIRComponentFieldMeta[_]] =
    Seq(id, meta, language, implicitRules)
  override def fieldsFromParent[Stage <: LifecycleStage: ValueOf](
      t: ResourceType[Stage]): Try[Seq[FHIRComponentField[Stage, _]]] = Success(fields[Stage](t))
  override def fields[Stage <: LifecycleStage: ValueOf](t: Resource[Stage]): Seq[FHIRComponentField[Stage, _]] = Seq(
    FHIRComponentField[Stage, Option[String]](id, t.id),
    FHIRComponentField[Stage, Option[Meta[Stage]]](meta, t.meta),
    FHIRComponentField[Stage, Option[LANGUAGES]](language, t.language),
    FHIRComponentField[Stage, Option[UriStr]](implicitRules, t.implicitRules)
  )
  def extractId(t: Resource[_]): Option[String]                   = t.id
  def extractMeta[Stage](t: Resource[Stage]): Option[Meta[Stage]] = t.meta
  def extractLanguage(t: Resource[_]): Option[LANGUAGES]          = t.language
  def extractImplicitRules(t: Resource[_]): Option[UriStr]        = t.implicitRules
  override val thisName: String                                   = "Resource"
  override val searchParams: Map[String, Resource[_] => Seq[Any]] = Map(
    "_source"      -> (obj => obj.meta.flatMap(_.source).toSeq),
    "_lastUpdated" -> (obj => obj.meta.flatMap(_.lastUpdated).toSeq),
    "_security"    -> (obj => obj.meta.toSeq.flatMap(_.security).toSeq),
    "_id"          -> (obj => obj.id.toSeq),
    "_profile"     -> (obj => obj.meta.toSeq.flatMap(_.profile).toSeq),
    "_tag"         -> (obj => obj.meta.toSeq.flatMap(_.tag).toSeq)
  )
  def unapply[Stage <: LifecycleStage: ValueOf](
      o: Resource[Stage]): Option[(Option[String], Option[Meta[Stage]], Option[LANGUAGES], Option[UriStr])] = Some(
    (o.id, o.meta, o.language, o.implicitRules))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Resource[Completed.type]] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Resource(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Meta[Completed.type]]]("meta", Some(None)),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          decodeAttributes(cursor)
        )
      ))
}

/** This is the base resource type for everything.
  *
  * @constructor
  *   Introduces the fields id, meta, language, implicitRules.
  * @param id
  *   - The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes.
  * @param meta
  *   - The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content might
  *   not always be associated with version changes to the resource.
  * @param language
  *   - The base language in which the resource is written.
  * @param implicitRules
  *   - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when
  *   processing the content. Often, this is a reference to an implementation guide that defines the special rules along with
  *   other profiles etc.
  */
@POJOBoilerplate
class Resource[Stage <: LifecycleStage: ValueOf](
    val id: Option[String] = None,
    val meta: Option[Meta[Stage]] = None,
    val language: Option[LANGUAGES] = None,
    val implicitRules: Option[UriStr] = None,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends FHIRObject(primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "Resource"
  /// Patched-in methods:
  def getIdentifier: Option[String] = id map (i => s"$thisTypeName/$i")
  def getVersionedIdentifier: Option[String] =
    getIdentifier.zip(meta.flatMap(_.versionId)).map { case (i, v) => s"$i/_history/$v" }
  def getMostSpecificIdentifier: Option[String] = getVersionedIdentifier orElse getIdentifier
}
