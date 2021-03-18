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

object Questionnaireresponse_reviewer extends CompanionFor[Questionnaireresponse_reviewer] {
  override val baseType: CompanionFor[Extension] = Extension
  override val profileUrl: Option[String] = Some(
    "http://hl7.org/fhir/StructureDefinition/questionnaireresponse-reviewer")
  def apply(
      id: Option[String] = None,
      url: String,
      value: Reference,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Questionnaireresponse_reviewer = new Questionnaireresponse_reviewer(
    id,
    url,
    value,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val url: FHIRComponentFieldMeta[String] =
    FHIRComponentFieldMeta("url", lTagOf[String], false, lTagOf[String])
  val value: FHIRComponentFieldMeta[Reference] =
    FHIRComponentFieldMeta("value", lTagOf[Reference], true, lTagOf[Reference])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, url, value)
  override def fields(t: Questionnaireresponse_reviewer): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[String](url, t.url),
    FHIRComponentField[Reference](value, t.value.get.toSubRefNonUnion[Reference])
  )
  def extractId(t: Questionnaireresponse_reviewer): Option[String]                   = t.id
  def extractUrl(t: Questionnaireresponse_reviewer): String                          = t.url
  def extractValue(t: Questionnaireresponse_reviewer): Reference                     = t.value.get.toSubRefNonUnion[Reference]
  override val thisName: String                                                      = "Questionnaireresponse_reviewer"
  override val searchParams: Map[String, Questionnaireresponse_reviewer => Seq[Any]] = Extension.searchParams
  def unapply(o: Questionnaireresponse_reviewer): Option[(Option[String], String, Reference)] = Some(
    (o.id, o.url, o.value.get.toSubRefNonUnion[Reference]))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Questionnaireresponse_reviewer] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Questionnaireresponse_reviewer(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[String]("url", None),
          cursor.decodeAs[Reference]("valueReference", None),
          decodeAttributes(cursor)
        )
      ))
}

/** Individual responsible for ensuring that the questionnaire response have been completed appropriately and signs off on the content.
  *
  *  Subclass of [[core.model.Extension]] (Base StructureDefinition for Extension Type: Optional Extension Element - found in all resources.)
  *
  * @constructor Inherits all params from parent.
  *              Refines the types of: value.
  *              Requires the following fields which were optional in the parent: value.
  *              Forbids the use of the following fields which were optional in the parent: extension.
  * @param id - Unique id for the element within a resource (for internal references). This may be any string value that does not contain spaces.
  * @param url - Source of the definition for the extension code - a logical name or a URL.
  * @param value - Value of extension - must be one of a constrained set of the data types (see [Extensibility](http://hl7.org/fhir/extensibility.html) for a list).
  */
@POJOBoilerplate
class Questionnaireresponse_reviewer(
    override val id: Option[String] = None,
    override val url: String,
    value: Reference,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Extension(id = id, url = url, value = Some(choice(value)), primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "Extension"
}
