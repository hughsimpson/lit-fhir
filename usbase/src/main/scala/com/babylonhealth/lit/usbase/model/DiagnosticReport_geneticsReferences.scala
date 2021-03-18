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

object DiagnosticReport_geneticsReferences extends CompanionFor[DiagnosticReport_geneticsReferences] {
  override val baseType: CompanionFor[Extension] = Extension
  override val profileUrl: Option[String] = Some(
    "http://hl7.org/fhir/StructureDefinition/DiagnosticReport-geneticsReferences")
  def apply(
      id: Option[String] = None,
      url: String,
      extension: LitSeq[Extension] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): DiagnosticReport_geneticsReferences = new DiagnosticReport_geneticsReferences(
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
  override def fields(t: DiagnosticReport_geneticsReferences): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[String](url, t.url),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension)
  )
  def extractId(t: DiagnosticReport_geneticsReferences): Option[String]                   = t.id
  def extractUrl(t: DiagnosticReport_geneticsReferences): String                          = t.url
  def extractExtension(t: DiagnosticReport_geneticsReferences): LitSeq[Extension]         = t.extension
  override val thisName: String                                                           = "DiagnosticReport_geneticsReferences"
  override val searchParams: Map[String, DiagnosticReport_geneticsReferences => Seq[Any]] = Extension.searchParams
  def unapply(o: DiagnosticReport_geneticsReferences): Option[(Option[String], String, LitSeq[Extension])] = Some(
    (o.id, o.url, o.extension))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[DiagnosticReport_geneticsReferences] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new DiagnosticReport_geneticsReferences(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[String]("url", None),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** Additional bibliographic reference information about genetics, medications, clinical trials, etc. associated with knowledge-based information on genetics/genetic condition.
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
class DiagnosticReport_geneticsReferences(
    override val id: Option[String] = None,
    override val url: String,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Extension(id = id, url = url, extension = extension, primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "Extension"
}
