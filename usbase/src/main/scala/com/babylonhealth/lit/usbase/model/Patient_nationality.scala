package com.babylonhealth.lit.usbase.model

import java.time.{ LocalDate, LocalTime, ZonedDateTime }
import java.util.UUID

import scala.collection.immutable.TreeMap
import scala.util.Try

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

object Patient_nationality extends CompanionFor[Patient_nationality] {
  override val baseType: CompanionFor[Extension] = Extension
  override val profileUrl: Option[String]        = Some("http://hl7.org/fhir/StructureDefinition/patient-nationality")
  def apply(
      id: Option[String] = None,
      url: String,
      extension: LitSeq[Extension] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Patient_nationality = new Patient_nationality(
    id,
    url,
    extension,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val url: FHIRComponentFieldMeta[String] =
    FHIRComponentFieldMeta("url", lTagOf[String], false, lTagOf[String])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, url, extension)
  override def fields(t: Patient_nationality): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[String](url, t.url),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension)
  )
  def extractId(t: Patient_nationality): Option[String]                   = t.id
  def extractUrl(t: Patient_nationality): String                          = t.url
  def extractExtension(t: Patient_nationality): LitSeq[Extension]         = t.extension
  override val thisName: String                                           = "Patient_nationality"
  override val searchParams: Map[String, Patient_nationality => Seq[Any]] = Extension.searchParams
  def unapply(o: Patient_nationality): Option[(Option[String], String, LitSeq[Extension])] = Some(
    (o.id, o.url, o.extension))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Patient_nationality] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Patient_nationality(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[String]("url", None),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** The nationality of the patient.
  *
  *  Subclass of [[core.model.Extension]] (Base StructureDefinition for Extension Type: Optional Extension Element - found in all resources.)
  *
  * @constructor Inherits all params from parent.
  *              Forbids the use of the following fields which were optional in the parent: value.
  * @param id - Unique id for the element within a resource (for internal references). This may be any string value that does not contain spaces.
  * @param url - Source of the definition for the extension code - a logical name or a URL.
  * @param extension - May be used to represent additional information that is not part of the basic definition of the element. To make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension.
  */
@POJOBoilerplate
class Patient_nationality(
    override val id: Option[String] = None,
    override val url: String,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Extension(id = id, url = url, extension = extension, primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "Extension"
}
