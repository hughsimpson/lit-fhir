package com.babylonhealth.lit.hl7_java.builders;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Stream;
import java.util.stream.Collectors;

import scala.math.BigDecimal;
import scala.Option;
import scala.collection.immutable.Seq;
import scala.jdk.javaapi.CollectionConverters;
import scala.jdk.javaapi.OptionConverters;

import lombok.NonNull;

import com.babylonhealth.lit.core.FHIRComponentFieldMeta;
import com.babylonhealth.lit.core.FHIRDateTime;
import com.babylonhealth.lit.core.FHIRDate;
import com.babylonhealth.lit.core.LitSeqJCollector;
import com.babylonhealth.lit.core.LitSeq;
import com.babylonhealth.lit.core.LitSeq$;
import com.babylonhealth.lit.core.NonEmptyLitSeqJCollector;
import com.babylonhealth.lit.core.Choice;
import com.babylonhealth.lit.core.Choice$;
import com.babylonhealth.lit.core.model.*;
import com.babylonhealth.lit.hl7.model.*;
import com.babylonhealth.lit.core_java.builders.*;
import com.babylonhealth.lit.hl7_java.builders.*;
import com.babylonhealth.lit.core_java.model.Unions.*;
import com.babylonhealth.lit.hl7_java.model.Unions.*;
import com.babylonhealth.lit.core.LANGUAGES;
import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public class MedicinalProductAuthorizationBuilder {
  private Optional<String> id = Optional.empty();
  private Optional<Meta> meta = Optional.empty();
  private Optional<Narrative> text = Optional.empty();
  private Optional<CodeableConcept> status = Optional.empty();
  private Optional<Reference> holder = Optional.empty();
  private Optional<Reference> subject = Optional.empty();
  private Collection<CodeableConcept> country = Collections.emptyList();
  private Optional<LANGUAGES> language = Optional.empty();
  private Collection<Resource> contained = Collections.emptyList();
  private Collection<Extension> extension = Collections.emptyList();
  private Optional<Reference> regulator = Optional.empty();
  private Collection<Identifier> identifier = Collections.emptyList();
  private Optional<FHIRDateTime> statusDate = Optional.empty();
  private Optional<CodeableConcept> legalBasis = Optional.empty();
  private Optional<FHIRDateTime> restoreDate = Optional.empty();
  private Collection<CodeableConcept> jurisdiction = Collections.emptyList();
  private Optional<String> implicitRules = Optional.empty();
  private Optional<Period> validityPeriod = Optional.empty();
  private Collection<Extension> modifierExtension = Collections.emptyList();
  private Optional<Period> dataExclusivityPeriod = Optional.empty();
  private Optional<FHIRDateTime> internationalBirthDate = Optional.empty();
  private Optional<FHIRDateTime> dateOfFirstAuthorization = Optional.empty();
  private Optional<MedicinalProductAuthorization.Procedure> procedure = Optional.empty();
  private Collection<MedicinalProductAuthorization.JurisdictionalAuthorization>
      jurisdictionalAuthorization = Collections.emptyList();

  /** Required fields for {@link MedicinalProductAuthorization} */
  public MedicinalProductAuthorizationBuilder() {}

  /**
   * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned,
   *     this value never changes.
   */
  public MedicinalProductAuthorizationBuilder withId(@NonNull String id) {
    this.id = Optional.of(id);
    return this;
  }
  /**
   * @param meta - The metadata about the resource. This is content that is maintained by the
   *     infrastructure. Changes to the content might not always be associated with version changes
   *     to the resource.
   */
  public MedicinalProductAuthorizationBuilder withMeta(@NonNull Meta meta) {
    this.meta = Optional.of(meta);
    return this;
  }
  /**
   * @param text - A human-readable narrative that contains a summary of the resource and can be
   *     used to represent the content of the resource to a human. The narrative need not encode all
   *     the structured data, but is required to contain sufficient detail to make it "clinically
   *     safe" for a human to just read the narrative. Resource definitions may define what content
   *     should be represented in the narrative to ensure clinical safety.
   */
  public MedicinalProductAuthorizationBuilder withText(@NonNull Narrative text) {
    this.text = Optional.of(text);
    return this;
  }
  /** @param status - The status of the marketing authorization. */
  public MedicinalProductAuthorizationBuilder withStatus(@NonNull CodeableConcept status) {
    this.status = Optional.of(status);
    return this;
  }
  /** @param holder - Marketing Authorization Holder. */
  public MedicinalProductAuthorizationBuilder withHolder(@NonNull Reference holder) {
    this.holder = Optional.of(holder);
    return this;
  }
  /** @param subject - The medicinal product that is being authorized. */
  public MedicinalProductAuthorizationBuilder withSubject(@NonNull Reference subject) {
    this.subject = Optional.of(subject);
    return this;
  }
  /** @param country - The country in which the marketing authorization has been granted. */
  public MedicinalProductAuthorizationBuilder withCountry(@NonNull CodeableConcept... country) {
    this.country = Arrays.asList(country);
    return this;
  }
  /** @param country - The country in which the marketing authorization has been granted. */
  public MedicinalProductAuthorizationBuilder withCountry(
      @NonNull Collection<CodeableConcept> country) {
    this.country = Collections.unmodifiableCollection(country);
    return this;
  }
  /** @param language - The base language in which the resource is written. */
  public MedicinalProductAuthorizationBuilder withLanguage(@NonNull LANGUAGES language) {
    this.language = Optional.of(language);
    return this;
  }
  /**
   * @param contained - These resources do not have an independent existence apart from the resource
   *     that contains them - they cannot be identified independently, and nor can they have their
   *     own independent transaction scope.
   */
  public MedicinalProductAuthorizationBuilder withContained(@NonNull Resource... contained) {
    this.contained = Arrays.asList(contained);
    return this;
  }
  /**
   * @param contained - These resources do not have an independent existence apart from the resource
   *     that contains them - they cannot be identified independently, and nor can they have their
   *     own independent transaction scope.
   */
  public MedicinalProductAuthorizationBuilder withContained(
      @NonNull Collection<Resource> contained) {
    this.contained = Collections.unmodifiableCollection(contained);
    return this;
  }
  /**
   * @param extension - May be used to represent additional information that is not part of the
   *     basic definition of the resource. To make the use of extensions safe and manageable, there
   *     is a strict set of governance applied to the definition and use of extensions. Though any
   *     implementer can define an extension, there is a set of requirements that SHALL be met as
   *     part of the definition of the extension.
   */
  public MedicinalProductAuthorizationBuilder withExtension(@NonNull Extension... extension) {
    this.extension = Arrays.asList(extension);
    return this;
  }
  /**
   * @param extension - May be used to represent additional information that is not part of the
   *     basic definition of the resource. To make the use of extensions safe and manageable, there
   *     is a strict set of governance applied to the definition and use of extensions. Though any
   *     implementer can define an extension, there is a set of requirements that SHALL be met as
   *     part of the definition of the extension.
   */
  public MedicinalProductAuthorizationBuilder withExtension(
      @NonNull Collection<Extension> extension) {
    this.extension = Collections.unmodifiableCollection(extension);
    return this;
  }
  /** @param regulator - Medicines Regulatory Agency. */
  public MedicinalProductAuthorizationBuilder withRegulator(@NonNull Reference regulator) {
    this.regulator = Optional.of(regulator);
    return this;
  }
  /**
   * @param identifier - Business identifier for the marketing authorization, as assigned by a
   *     regulator.
   */
  public MedicinalProductAuthorizationBuilder withIdentifier(@NonNull Identifier... identifier) {
    this.identifier = Arrays.asList(identifier);
    return this;
  }
  /**
   * @param identifier - Business identifier for the marketing authorization, as assigned by a
   *     regulator.
   */
  public MedicinalProductAuthorizationBuilder withIdentifier(
      @NonNull Collection<Identifier> identifier) {
    this.identifier = Collections.unmodifiableCollection(identifier);
    return this;
  }
  /** @param statusDate - The date at which the given status has become applicable. */
  public MedicinalProductAuthorizationBuilder withStatusDate(@NonNull FHIRDateTime statusDate) {
    this.statusDate = Optional.of(statusDate);
    return this;
  }
  /** @param legalBasis - The legal framework against which this authorization is granted. */
  public MedicinalProductAuthorizationBuilder withLegalBasis(@NonNull CodeableConcept legalBasis) {
    this.legalBasis = Optional.of(legalBasis);
    return this;
  }
  /**
   * @param restoreDate - The date when a suspended the marketing or the marketing authorization of
   *     the product is anticipated to be restored.
   */
  public MedicinalProductAuthorizationBuilder withRestoreDate(@NonNull FHIRDateTime restoreDate) {
    this.restoreDate = Optional.of(restoreDate);
    return this;
  }
  /** @param jurisdiction - Jurisdiction within a country. */
  public MedicinalProductAuthorizationBuilder withJurisdiction(
      @NonNull CodeableConcept... jurisdiction) {
    this.jurisdiction = Arrays.asList(jurisdiction);
    return this;
  }
  /** @param jurisdiction - Jurisdiction within a country. */
  public MedicinalProductAuthorizationBuilder withJurisdiction(
      @NonNull Collection<CodeableConcept> jurisdiction) {
    this.jurisdiction = Collections.unmodifiableCollection(jurisdiction);
    return this;
  }
  /**
   * @param implicitRules - A reference to a set of rules that were followed when the resource was
   *     constructed, and which must be understood when processing the content. Often, this is a
   *     reference to an implementation guide that defines the special rules along with other
   *     profiles etc.
   */
  public MedicinalProductAuthorizationBuilder withImplicitRules(@NonNull String implicitRules) {
    this.implicitRules = Optional.of(implicitRules);
    return this;
  }
  /**
   * @param validityPeriod - The beginning of the time period in which the marketing authorization
   *     is in the specific status shall be specified A complete date consisting of day, month and
   *     year shall be specified using the ISO 8601 date format.
   */
  public MedicinalProductAuthorizationBuilder withValidityPeriod(@NonNull Period validityPeriod) {
    this.validityPeriod = Optional.of(validityPeriod);
    return this;
  }
  /**
   * @param modifierExtension - May be used to represent additional information that is not part of
   *     the basic definition of the resource and that modifies the understanding of the element
   *     that contains it and/or the understanding of the containing element's descendants. Usually
   *     modifier elements provide negation or qualification. To make the use of extensions safe and
   *     manageable, there is a strict set of governance applied to the definition and use of
   *     extensions. Though any implementer is allowed to define an extension, there is a set of
   *     requirements that SHALL be met as part of the definition of the extension. Applications
   *     processing a resource are required to check for modifier extensions.
   *     <p>Modifier extensions SHALL NOT change the meaning of any elements on Resource or
   *     DomainResource (including cannot change the meaning of modifierExtension itself).
   */
  public MedicinalProductAuthorizationBuilder withModifierExtension(
      @NonNull Extension... modifierExtension) {
    this.modifierExtension = Arrays.asList(modifierExtension);
    return this;
  }
  /**
   * @param modifierExtension - May be used to represent additional information that is not part of
   *     the basic definition of the resource and that modifies the understanding of the element
   *     that contains it and/or the understanding of the containing element's descendants. Usually
   *     modifier elements provide negation or qualification. To make the use of extensions safe and
   *     manageable, there is a strict set of governance applied to the definition and use of
   *     extensions. Though any implementer is allowed to define an extension, there is a set of
   *     requirements that SHALL be met as part of the definition of the extension. Applications
   *     processing a resource are required to check for modifier extensions.
   *     <p>Modifier extensions SHALL NOT change the meaning of any elements on Resource or
   *     DomainResource (including cannot change the meaning of modifierExtension itself).
   */
  public MedicinalProductAuthorizationBuilder withModifierExtension(
      @NonNull Collection<Extension> modifierExtension) {
    this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
    return this;
  }
  /**
   * @param dataExclusivityPeriod - A period of time after authorization before generic product
   *     applicatiosn can be submitted.
   */
  public MedicinalProductAuthorizationBuilder withDataExclusivityPeriod(
      @NonNull Period dataExclusivityPeriod) {
    this.dataExclusivityPeriod = Optional.of(dataExclusivityPeriod);
    return this;
  }
  /**
   * @param internationalBirthDate - Date of first marketing authorization for a company's new
   *     medicinal product in any country in the World.
   */
  public MedicinalProductAuthorizationBuilder withInternationalBirthDate(
      @NonNull FHIRDateTime internationalBirthDate) {
    this.internationalBirthDate = Optional.of(internationalBirthDate);
    return this;
  }
  /**
   * @param dateOfFirstAuthorization - The date when the first authorization was granted by a
   *     Medicines Regulatory Agency.
   */
  public MedicinalProductAuthorizationBuilder withDateOfFirstAuthorization(
      @NonNull FHIRDateTime dateOfFirstAuthorization) {
    this.dateOfFirstAuthorization = Optional.of(dateOfFirstAuthorization);
    return this;
  }
  /**
   * @param procedure - The regulatory procedure for granting or amending a marketing authorization.
   */
  public MedicinalProductAuthorizationBuilder withProcedure(
      @NonNull MedicinalProductAuthorization.Procedure procedure) {
    this.procedure = Optional.of(procedure);
    return this;
  }
  /** @param jurisdictionalAuthorization - Authorization in areas within a country. */
  public MedicinalProductAuthorizationBuilder withJurisdictionalAuthorization(
      @NonNull
          MedicinalProductAuthorization.JurisdictionalAuthorization...
              jurisdictionalAuthorization) {
    this.jurisdictionalAuthorization = Arrays.asList(jurisdictionalAuthorization);
    return this;
  }
  /** @param jurisdictionalAuthorization - Authorization in areas within a country. */
  public MedicinalProductAuthorizationBuilder withJurisdictionalAuthorization(
      @NonNull
          Collection<MedicinalProductAuthorization.JurisdictionalAuthorization>
              jurisdictionalAuthorization) {
    this.jurisdictionalAuthorization =
        Collections.unmodifiableCollection(jurisdictionalAuthorization);
    return this;
  }

  public MedicinalProductAuthorizationBuilder withoutMeta() {
    this.meta = Optional.empty();
    return this;
  }

  public MedicinalProductAuthorization build() {
    return new MedicinalProductAuthorization(
        OptionConverters.toScala(id),
        OptionConverters.toScala(meta),
        OptionConverters.toScala(text),
        OptionConverters.toScala(status),
        OptionConverters.toScala(holder),
        OptionConverters.toScala(subject),
        country.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(language),
        contained.stream().collect(new LitSeqJCollector<>()),
        extension.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(regulator),
        identifier.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(statusDate),
        OptionConverters.toScala(legalBasis),
        OptionConverters.toScala(restoreDate),
        jurisdiction.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(implicitRules),
        OptionConverters.toScala(validityPeriod),
        modifierExtension.stream().collect(new LitSeqJCollector<>()),
        OptionConverters.toScala(dataExclusivityPeriod),
        OptionConverters.toScala(internationalBirthDate),
        OptionConverters.toScala(dateOfFirstAuthorization),
        OptionConverters.toScala(procedure),
        jurisdictionalAuthorization.stream().collect(new LitSeqJCollector<>()),
        LitUtils.emptyMetaElMap());
  }
}
