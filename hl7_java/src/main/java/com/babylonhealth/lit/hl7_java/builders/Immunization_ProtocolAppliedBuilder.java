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

import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core_java.LitUtils;

import static com.babylonhealth.lit.core_java.LitUtils.autoSuffix;
import static com.babylonhealth.lit.core_java.LitUtils.guard;
import static java.util.stream.Collectors.toList;

public interface Immunization_ProtocolAppliedBuilder {
  public Immunization.ProtocolApplied build();

  public static Impl init(String doseNumber) {
    return new Impl(doseNumber);
  }

  public static Impl builder(String doseNumber) {
    return new Impl(doseNumber);
  }

  public class Impl implements Immunization_ProtocolAppliedBuilder {
    private Optional<String> id = Optional.empty();
    private Optional<String> series = Optional.empty();
    private Collection<Extension> extension = Collections.emptyList();
    private Optional<Reference> authority = Optional.empty();
    private String doseNumber;
    private Optional<String> seriesDoses = Optional.empty();
    private Collection<CodeableConcept> targetDisease = Collections.emptyList();
    private Collection<Extension> modifierExtension = Collections.emptyList();

    /**
     * Required fields for {@link Immunization.ProtocolApplied}
     *
     * @param doseNumber
     */
    public Impl(String doseNumber) {
      this.doseNumber = doseNumber;
    }

    /**
     * @param id - The logical id of the resource, as used in the URL for the resource. Once
     *     assigned, this value never changes.
     */
    public Immunization_ProtocolAppliedBuilder.Impl withId(@NonNull String id) {
      this.id = Optional.of(id);
      return this;
    }
    /** @param series */
    public Immunization_ProtocolAppliedBuilder.Impl withSeries(@NonNull String series) {
      this.series = Optional.of(series);
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public Immunization_ProtocolAppliedBuilder.Impl withExtension(@NonNull Extension... extension) {
      this.extension = Arrays.asList(extension);
      return this;
    }
    /**
     * @param extension - May be used to represent additional information that is not part of the
     *     basic definition of the resource. To make the use of extensions safe and manageable,
     *     there is a strict set of governance applied to the definition and use of extensions.
     *     Though any implementer can define an extension, there is a set of requirements that SHALL
     *     be met as part of the definition of the extension.
     */
    public Immunization_ProtocolAppliedBuilder.Impl withExtension(
        @NonNull Collection<Extension> extension) {
      this.extension = Collections.unmodifiableCollection(extension);
      return this;
    }

    public Immunization_ProtocolAppliedBuilder.Impl withExtension(
        @NonNull ExtensionBuilder... extension) {
      this.extension = Arrays.stream(extension).map(e -> e.build()).collect(toList());
      return this;
    }
    /** @param authority */
    public Immunization_ProtocolAppliedBuilder.Impl withAuthority(@NonNull Reference authority) {
      this.authority = Optional.of(authority);
      return this;
    }

    public Immunization_ProtocolAppliedBuilder.Impl withAuthority(
        @NonNull ReferenceBuilder authority) {
      this.authority = Optional.of(authority.build());
      return this;
    }
    /** @param seriesDoses */
    public Immunization_ProtocolAppliedBuilder.Impl withSeriesDoses(@NonNull String seriesDoses) {
      this.seriesDoses = Optional.of(seriesDoses);
      return this;
    }
    /** @param targetDisease */
    public Immunization_ProtocolAppliedBuilder.Impl withTargetDisease(
        @NonNull CodeableConcept... targetDisease) {
      this.targetDisease = Arrays.asList(targetDisease);
      return this;
    }
    /** @param targetDisease */
    public Immunization_ProtocolAppliedBuilder.Impl withTargetDisease(
        @NonNull Collection<CodeableConcept> targetDisease) {
      this.targetDisease = Collections.unmodifiableCollection(targetDisease);
      return this;
    }

    public Immunization_ProtocolAppliedBuilder.Impl withTargetDisease(
        @NonNull CodeableConceptBuilder... targetDisease) {
      this.targetDisease = Arrays.stream(targetDisease).map(e -> e.build()).collect(toList());
      return this;
    }
    /**
     * @param modifierExtension - May be used to represent additional information that is not part
     *     of the basic definition of the resource and that modifies the understanding of the
     *     element that contains it and/or the understanding of the containing element's
     *     descendants. Usually modifier elements provide negation or qualification. To make the use
     *     of extensions safe and manageable, there is a strict set of governance applied to the
     *     definition and use of extensions. Though any implementer is allowed to define an
     *     extension, there is a set of requirements that SHALL be met as part of the definition of
     *     the extension. Applications processing a resource are required to check for modifier
     *     extensions.
     *     <p>Modifier extensions SHALL NOT change the meaning of any elements on Resource or
     *     DomainResource (including cannot change the meaning of modifierExtension itself).
     */
    public Immunization_ProtocolAppliedBuilder.Impl withModifierExtension(
        @NonNull Extension... modifierExtension) {
      this.modifierExtension = Arrays.asList(modifierExtension);
      return this;
    }
    /**
     * @param modifierExtension - May be used to represent additional information that is not part
     *     of the basic definition of the resource and that modifies the understanding of the
     *     element that contains it and/or the understanding of the containing element's
     *     descendants. Usually modifier elements provide negation or qualification. To make the use
     *     of extensions safe and manageable, there is a strict set of governance applied to the
     *     definition and use of extensions. Though any implementer is allowed to define an
     *     extension, there is a set of requirements that SHALL be met as part of the definition of
     *     the extension. Applications processing a resource are required to check for modifier
     *     extensions.
     *     <p>Modifier extensions SHALL NOT change the meaning of any elements on Resource or
     *     DomainResource (including cannot change the meaning of modifierExtension itself).
     */
    public Immunization_ProtocolAppliedBuilder.Impl withModifierExtension(
        @NonNull Collection<Extension> modifierExtension) {
      this.modifierExtension = Collections.unmodifiableCollection(modifierExtension);
      return this;
    }

    public Immunization_ProtocolAppliedBuilder.Impl withModifierExtension(
        @NonNull ExtensionBuilder... modifierExtension) {
      this.modifierExtension =
          Arrays.stream(modifierExtension).map(e -> e.build()).collect(toList());
      return this;
    }

    public Immunization.ProtocolApplied build() {
      return new Immunization.ProtocolApplied(
          OptionConverters.toScala(id),
          OptionConverters.toScala(series),
          extension.stream().collect(new LitSeqJCollector<>()),
          OptionConverters.toScala(authority),
          doseNumber,
          OptionConverters.toScala(seriesDoses),
          targetDisease.stream().collect(new LitSeqJCollector<>()),
          modifierExtension.stream().collect(new LitSeqJCollector<>()),
          LitUtils.emptyMetaElMap());
    }
  }
}
