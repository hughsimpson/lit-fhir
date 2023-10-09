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
import com.babylonhealth.lit.core.NAME_USE
import com.babylonhealth.lit.{ core }
import com.babylonhealth.lit.macros.POJOBoilerplate

object HumanName extends CompanionFor[HumanName] {
  implicit def summonObjectAndCompanionHumanName1549178115(o: HumanName): ObjectAndCompanion[HumanName, HumanName.type] =
    ObjectAndCompanion(o, this)
  override type ResourceType = HumanName
  override type ParentType   = HumanName
  override val baseType: CompanionFor[ResourceType] = HumanName
  override val parentType: CompanionFor[ParentType] = HumanName
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/HumanName")
  def apply(
      id: Option[String] = None,
      use: Option[NAME_USE] = None,
      text: Option[FHIRString] = None,
      `given`: LitSeq[FHIRString] = LitSeq.empty,
      family: Option[FHIRString] = None,
      prefix: LitSeq[FHIRString] = LitSeq.empty,
      suffix: LitSeq[FHIRString] = LitSeq.empty,
      period: Option[Period] = None,
      extension: LitSeq[Extension] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): HumanName = new HumanName(
    id,
    use,
    text,
    `given`,
    family,
    prefix,
    suffix,
    period,
    extension,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val use: FHIRComponentFieldMeta[Option[NAME_USE]] =
    FHIRComponentFieldMeta("use", lTagOf[Option[NAME_USE]], false, lTagOf[NAME_USE])
  val text: FHIRComponentFieldMeta[Option[FHIRString]] =
    FHIRComponentFieldMeta("text", lTagOf[Option[FHIRString]], false, lTagOf[FHIRString])
  val `given`: FHIRComponentFieldMeta[LitSeq[FHIRString]] =
    FHIRComponentFieldMeta("given", lTagOf[LitSeq[FHIRString]], false, lTagOf[FHIRString])
  val family: FHIRComponentFieldMeta[Option[FHIRString]] =
    FHIRComponentFieldMeta("family", lTagOf[Option[FHIRString]], false, lTagOf[FHIRString])
  val prefix: FHIRComponentFieldMeta[LitSeq[FHIRString]] =
    FHIRComponentFieldMeta("prefix", lTagOf[LitSeq[FHIRString]], false, lTagOf[FHIRString])
  val suffix: FHIRComponentFieldMeta[LitSeq[FHIRString]] =
    FHIRComponentFieldMeta("suffix", lTagOf[LitSeq[FHIRString]], false, lTagOf[FHIRString])
  val period: FHIRComponentFieldMeta[Option[Period]] =
    FHIRComponentFieldMeta("period", lTagOf[Option[Period]], false, lTagOf[Period])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, use, text, `given`, family, prefix, suffix, period, extension)
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: HumanName): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[NAME_USE]](use, t.use),
    FHIRComponentField[Option[FHIRString]](text, t.text),
    FHIRComponentField[LitSeq[FHIRString]](`given`, t.`given`),
    FHIRComponentField[Option[FHIRString]](family, t.family),
    FHIRComponentField[LitSeq[FHIRString]](prefix, t.prefix),
    FHIRComponentField[LitSeq[FHIRString]](suffix, t.suffix),
    FHIRComponentField[Option[Period]](period, t.period),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension)
  )
  def extractId(t: HumanName): Option[String]           = t.id
  def extractUse(t: HumanName): Option[NAME_USE]        = t.use
  def extractText(t: HumanName): Option[FHIRString]     = t.text
  def extractGiven(t: HumanName): LitSeq[FHIRString]    = t.`given`
  def extractFamily(t: HumanName): Option[FHIRString]   = t.family
  def extractPrefix(t: HumanName): LitSeq[FHIRString]   = t.prefix
  def extractSuffix(t: HumanName): LitSeq[FHIRString]   = t.suffix
  def extractPeriod(t: HumanName): Option[Period]       = t.period
  def extractExtension(t: HumanName): LitSeq[Extension] = t.extension
  override val thisName: String                         = "HumanName"
  def unapply(
      o: HumanName): Option[(Option[String], Option[NAME_USE], Option[FHIRString], LitSeq[FHIRString], Option[FHIRString], LitSeq[FHIRString], LitSeq[FHIRString], Option[Period], LitSeq[Extension])] =
    Some((o.id, o.use, o.text, o.`given`, o.family, o.prefix, o.suffix, o.period, o.extension))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[HumanName] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new HumanName(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[NAME_USE]]("use", Some(None)),
          cursor.decodeAs[Option[FHIRString]]("text", Some(None)),
          cursor.decodeAs[LitSeq[FHIRString]]("given", Some(LitSeq.empty)),
          cursor.decodeAs[Option[FHIRString]]("family", Some(None)),
          cursor.decodeAs[LitSeq[FHIRString]]("prefix", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[FHIRString]]("suffix", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Period]]("period", Some(None)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** Base StructureDefinition for HumanName Type: A human's name with the ability to identify parts and usage.
  *
  * Subclass of [[core.model.Element]] (Base StructureDefinition for Element Type: Base definition for all elements in a
  * resource.)
  *
  * @constructor
  *   Introduces the fields use, text, `given`, family, prefix, suffix, period.
  * @param id
  *   - Unique id for the element within a resource (for internal references). This may be any string value that does not contain
  *     spaces.
  * @param use
  *   - Identifies the purpose for this name.
  * @param text
  *   - Specifies the entire name as it should be displayed e.g. on an application UI. This may be provided instead of or as well
  *     as the specific parts.
  * @param `given`
  *   - Given name.
  * @param family
  *   - The part of a name that links to the genealogy. In some cultures (e.g. Eritrea) the family name of a son is the first name
  *     of his father.
  * @param prefix
  *   - Part of the name that is acquired as a title due to academic, legal, employment or nobility status, etc. and that appears
  *     at the start of the name.
  * @param suffix
  *   - Part of the name that is acquired as a title due to academic, legal, employment or nobility status, etc. and that appears
  *     at the end of the name.
  * @param period
  *   - Indicates the period of time when this name was valid for the named person.
  * @param extension
  *   - May be used to represent additional information that is not part of the basic definition of the element. To make the use
  *     of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions.
  *     Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition
  *     of the extension.
  */
@POJOBoilerplate
class HumanName(
    override val id: Option[String] = None,
    val use: Option[NAME_USE] = None,
    val text: Option[FHIRString] = None,
    val `given`: LitSeq[FHIRString] = LitSeq.empty,
    val family: Option[FHIRString] = None,
    val prefix: LitSeq[FHIRString] = LitSeq.empty,
    val suffix: LitSeq[FHIRString] = LitSeq.empty,
    val period: Option[Period] = None,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Element(id = id, extension = extension, primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "HumanName"
}
