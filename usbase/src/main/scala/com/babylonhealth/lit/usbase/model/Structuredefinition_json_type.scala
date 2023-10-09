package com.babylonhealth.lit.usbase.model

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
import com.babylonhealth.lit.hl7.model._
import com.babylonhealth.lit.core.UnionAliases._
import com.babylonhealth.lit.hl7.UnionAliases._
import com.babylonhealth.lit.usbase.UnionAliases._

import com.babylonhealth.lit.{ core, hl7, usbase }
import com.babylonhealth.lit.macros.POJOBoilerplate

object Structuredefinition_json_type extends CompanionFor[Structuredefinition_json_type] {
  implicit def summonObjectAndCompanionStructuredefinition_json_type1692665667(
      o: Structuredefinition_json_type): ObjectAndCompanion[Structuredefinition_json_type, Structuredefinition_json_type.type] =
    ObjectAndCompanion(o, this)
  override type ResourceType = Extension
  override type ParentType   = Extension
  override val baseType: CompanionFor[ResourceType] = Extension
  override val parentType: CompanionFor[ParentType] = Extension
  override val profileUrl: Option[String] = Some("http://hl7.org/fhir/StructureDefinition/structuredefinition-json-type")
  def apply(
      id: Option[FHIRString] = None,
      value: Option[FHIRString] = None,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Structuredefinition_json_type = new Structuredefinition_json_type(
    id,
    value,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[FHIRString]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[FHIRString]], false, lTagOf[FHIRString])
  val value: FHIRComponentFieldMeta[Option[FHIRString]] =
    FHIRComponentFieldMeta("value", lTagOf[Option[FHIRString]], true, lTagOf[FHIRString])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, value)
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Try(
    Seq(
      FHIRComponentField[Option[FHIRString]](id, t.id),
      FHIRComponentField[Option[FHIRString]](value, t.value.map(_.toSubRefNonUnion[FHIRString]))
    ))
  override def fields(t: Structuredefinition_json_type): Seq[FHIRComponentField[_]] = fieldsFromParent(t).get
  def extractId(t: Structuredefinition_json_type): Option[FHIRString]               = t.id
  def extractValue(t: Structuredefinition_json_type): Option[FHIRString]            = t.value.map(_.toSubRefNonUnion[FHIRString])
  override val thisName: String                                                     = "Structuredefinition_json_type"
  override val searchParams: Map[String, Structuredefinition_json_type => Seq[Any]] = Extension.searchParams
  def unapply(o: Structuredefinition_json_type): Option[(Option[FHIRString], Option[FHIRString])] = Some(
    (o.id, o.value.map(_.toSubRefNonUnion[FHIRString])))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Structuredefinition_json_type] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Structuredefinition_json_type(
          cursor.decodeAs[Option[FHIRString]]("id", Some(None)),
          cursor.decodeAs[Option[FHIRString]]("valueString", Some(None)),
          decodeAttributes(cursor)
        )
      ))
}

/** The JSON type of a property - used for the value property of a primitive type (for which there is no type in the FHIR typing
  * system).
  *
  * Subclass of [[core.model.Extension]] (Base StructureDefinition for Extension Type: Optional Extension Element - found in all
  * resources.)
  *
  * @constructor
  *   Inherits all params from parent. Refines the types of: value. Forbids the use of the following fields which were optional in
  *   the parent: extension. Hardcodes the value of the following fields: url.
  * @param id
  *   - Unique id for the element within a resource (for internal references). This may be any string value that does not contain
  *     spaces.
  * @param url
  *   - Source of the definition for the extension code - a logical name or a URL.
  * @param value
  *   - Value of extension - must be one of a constrained set of the data types (see
  *     [Extensibility](http://hl7.org/fhir/extensibility.html) for a list).
  */
@POJOBoilerplate
class Structuredefinition_json_type(
    id: Option[FHIRString] = None,
    value: Option[FHIRString] = None,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Extension(
      id = id,
      value = value.map(choice(_)),
      url = "http://hl7.org/fhir/StructureDefinition/structuredefinition-json-type",
      primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "Extension"
}
