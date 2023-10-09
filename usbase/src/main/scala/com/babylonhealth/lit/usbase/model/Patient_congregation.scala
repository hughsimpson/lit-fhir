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

object Patient_congregation extends CompanionFor[Patient_congregation] {
  implicit def summonObjectAndCompanionPatient_congregation_1731247581(
      o: Patient_congregation): ObjectAndCompanion[Patient_congregation, Patient_congregation.type] = ObjectAndCompanion(o, this)
  override type ResourceType = Extension
  override type ParentType   = Extension
  override val baseType: CompanionFor[ResourceType] = Extension
  override val parentType: CompanionFor[ParentType] = Extension
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/patient-congregation")
  def apply(
      id: Option[String] = None,
      value: FHIRString,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Patient_congregation = new Patient_congregation(
    id,
    value,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val value: FHIRComponentFieldMeta[FHIRString] =
    FHIRComponentFieldMeta("value", lTagOf[FHIRString], true, lTagOf[FHIRString])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, value)
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Try(
    Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[FHIRString](value, t.value.get.toSubRefNonUnion[FHIRString])
    ))
  override def fields(t: Patient_congregation): Seq[FHIRComponentField[_]] = fieldsFromParent(t).get
  def extractId(t: Patient_congregation): Option[String]                   = t.id
  def extractValue(t: Patient_congregation): FHIRString                    = t.value.get.toSubRefNonUnion[FHIRString]
  override val thisName: String                                            = "Patient_congregation"
  override val searchParams: Map[String, Patient_congregation => Seq[Any]] = Extension.searchParams
  def unapply(o: Patient_congregation): Option[(Option[String], FHIRString)] = Some(
    (o.id, o.value.get.toSubRefNonUnion[FHIRString]))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Patient_congregation] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Patient_congregation(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[FHIRString]("valueString", None),
          decodeAttributes(cursor)
        )
      ))
}

/** A group or place of religious practice that may provide services to the patient.
  *
  * Subclass of [[core.model.Extension]] (Base StructureDefinition for Extension Type: Optional Extension Element - found in all
  * resources.)
  *
  * @constructor
  *   Inherits all params from parent. Refines the types of: value. Requires the following fields which were optional in the
  *   parent: value. Forbids the use of the following fields which were optional in the parent: extension. Hardcodes the value of
  *   the following fields: url.
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
class Patient_congregation(
    override val id: Option[String] = None,
    value: FHIRString,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Extension(
      id = id,
      value = Some(choice(value)),
      url = "http://hl7.org/fhir/StructureDefinition/patient-congregation",
      primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "Extension"
}
