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

object Iso21090_ADXP_deliveryInstallationQualifier extends CompanionFor[Iso21090_ADXP_deliveryInstallationQualifier] {
  override val baseType: CompanionFor[Extension] = Extension
  override val profileUrl: Option[String] = Some(
    "http://hl7.org/fhir/StructureDefinition/iso21090-ADXP-deliveryInstallationQualifier")
  def apply(
      id: Option[String] = None,
      url: String,
      value: String,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Iso21090_ADXP_deliveryInstallationQualifier = new Iso21090_ADXP_deliveryInstallationQualifier(
    id,
    url,
    value,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val url: FHIRComponentFieldMeta[String] =
    FHIRComponentFieldMeta("url", lTagOf[String], false, lTagOf[String])
  val value: FHIRComponentFieldMeta[String] =
    FHIRComponentFieldMeta("value", lTagOf[String], true, lTagOf[String])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, url, value)
  override def fields(t: Iso21090_ADXP_deliveryInstallationQualifier): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[String](url, t.url),
    FHIRComponentField[String](value, t.value.get.toSubRefNonUnion[String])
  )
  def extractId(t: Iso21090_ADXP_deliveryInstallationQualifier): Option[String] = t.id
  def extractUrl(t: Iso21090_ADXP_deliveryInstallationQualifier): String        = t.url
  def extractValue(t: Iso21090_ADXP_deliveryInstallationQualifier): String      = t.value.get.toSubRefNonUnion[String]
  override val thisName: String                                                 = "Iso21090_ADXP_deliveryInstallationQualifier"
  override val searchParams: Map[String, Iso21090_ADXP_deliveryInstallationQualifier => Seq[Any]] =
    Extension.searchParams
  def unapply(o: Iso21090_ADXP_deliveryInstallationQualifier): Option[(Option[String], String, String)] = Some(
    (o.id, o.url, o.value.get.toSubRefNonUnion[String]))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Iso21090_ADXP_deliveryInstallationQualifier] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Iso21090_ADXP_deliveryInstallationQualifier(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[String]("url", None),
          cursor.decodeAs[String]("valueString", None),
          decodeAttributes(cursor)
        )
      ))
}

/** A number, letter or name identifying a delivery installation. For example, for Station A, the delivery installation qualifier would be 'A'.
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
class Iso21090_ADXP_deliveryInstallationQualifier(
    override val id: Option[String] = None,
    override val url: String,
    value: String,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Extension(id = id, url = url, value = Some(choice(value)), primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "Extension"
}
