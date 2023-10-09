package com.babylonhealth.lit.hl7_java.model;

import com.babylonhealth.lit.core.$bslash$div;
import com.babylonhealth.lit.core.*;
import com.babylonhealth.lit.core.Choice;
import com.babylonhealth.lit.core.model.*;
import com.babylonhealth.lit.hl7.UnionAliases;
import com.babylonhealth.lit.hl7_java.model.Unions.*;
import izumi.reflect.macrortti.LTag;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import scala.math.BigDecimal;

public class Unions {
  public static class ChoiceBooleanOrDateTime extends Choice<$bslash$div<Boolean, FHIRDateTime>> {
    public ChoiceBooleanOrDateTime(Boolean arg) {
      super("Boolean", arg, (LTag) UnionAliases.UnionBooleanOrDateTimeTag());
    }

    public ChoiceBooleanOrDateTime(FHIRDateTime arg) {
      super("DateTime", arg, (LTag) UnionAliases.UnionBooleanOrDateTimeTag());
    }
  }

  public static class Choice00193937709
      extends Choice<
          $bslash$div<
              $bslash$div<
                  $bslash$div<
                      $bslash$div<$bslash$div<String, CodeableConcept>, DataRequirement>,
                      Expression>,
                  Reference>,
              TriggerDefinition>> {
    public Choice00193937709(String arg) {
      super("Canonical", arg, (LTag) UnionAliases.Union00193937709Tag());
    }

    public Choice00193937709(CodeableConcept arg) {
      super("CodeableConcept", arg, (LTag) UnionAliases.Union00193937709Tag());
    }

    public Choice00193937709(DataRequirement arg) {
      super("DataRequirement", arg, (LTag) UnionAliases.Union00193937709Tag());
    }

    public Choice00193937709(Expression arg) {
      super("Expression", arg, (LTag) UnionAliases.Union00193937709Tag());
    }

    public Choice00193937709(Reference arg) {
      super("Reference", arg, (LTag) UnionAliases.Union00193937709Tag());
    }

    public Choice00193937709(TriggerDefinition arg) {
      super("TriggerDefinition", arg, (LTag) UnionAliases.Union00193937709Tag());
    }
  }

  public static class Choice_1173468863
      extends Choice<
          $bslash$div<$bslash$div<$bslash$div<byte[], CodeableConcept>, String>, Quantity>> {
    public Choice_1173468863(byte[] arg) {
      super("Base64Binary", arg, (LTag) UnionAliases.Union_1173468863Tag());
    }

    public Choice_1173468863(CodeableConcept arg) {
      super("CodeableConcept", arg, (LTag) UnionAliases.Union_1173468863Tag());
    }

    public Choice_1173468863(String arg) {
      super("FHIRString", arg, (LTag) UnionAliases.Union_1173468863Tag());
    }

    public Choice_1173468863(Quantity arg) {
      super("Quantity", arg, (LTag) UnionAliases.Union_1173468863Tag());
    }
  }

  public static class ChoiceAddressOrReference extends Choice<$bslash$div<Address, Reference>> {
    public ChoiceAddressOrReference(Address arg) {
      super("Address", arg, (LTag) UnionAliases.UnionAddressOrReferenceTag());
    }

    public ChoiceAddressOrReference(Reference arg) {
      super("Reference", arg, (LTag) UnionAliases.UnionAddressOrReferenceTag());
    }
  }

  public static class ChoiceBooleanOrCanonical extends Choice<$bslash$div<Boolean, String>> {
    public ChoiceBooleanOrCanonical(Boolean arg) {
      super("Boolean", arg, (LTag) UnionAliases.UnionBooleanOrCanonicalTag());
    }

    public ChoiceBooleanOrCanonical(String arg) {
      super("Canonical", arg, (LTag) UnionAliases.UnionBooleanOrCanonicalTag());
    }
  }

  public static class Choice01155656698
      extends Choice<$bslash$div<$bslash$div<$bslash$div<Age, String>, Period>, Range>> {
    public Choice01155656698(Age arg) {
      super("Age", arg, (LTag) UnionAliases.Union01155656698Tag());
    }

    public Choice01155656698(String arg) {
      super("FHIRString", arg, (LTag) UnionAliases.Union01155656698Tag());
    }

    public Choice01155656698(Period arg) {
      super("Period", arg, (LTag) UnionAliases.Union01155656698Tag());
    }

    public Choice01155656698(Range arg) {
      super("Range", arg, (LTag) UnionAliases.Union01155656698Tag());
    }
  }

  public static class ChoiceAttachmentOrReference
      extends Choice<$bslash$div<Attachment, Reference>> {
    public ChoiceAttachmentOrReference(Attachment arg) {
      super("Attachment", arg, (LTag) UnionAliases.UnionAttachmentOrReferenceTag());
    }

    public ChoiceAttachmentOrReference(Reference arg) {
      super("Reference", arg, (LTag) UnionAliases.UnionAttachmentOrReferenceTag());
    }
  }

  public static class Choice01850316684
      extends Choice<
          $bslash$div<$bslash$div<$bslash$div<Boolean, CodeableConcept>, Quantity>, Range>> {
    public Choice01850316684(Boolean arg) {
      super("Boolean", arg, (LTag) UnionAliases.Union01850316684Tag());
    }

    public Choice01850316684(CodeableConcept arg) {
      super("CodeableConcept", arg, (LTag) UnionAliases.Union01850316684Tag());
    }

    public Choice01850316684(Quantity arg) {
      super("Quantity", arg, (LTag) UnionAliases.Union01850316684Tag());
    }

    public Choice01850316684(Range arg) {
      super("Range", arg, (LTag) UnionAliases.Union01850316684Tag());
    }
  }

  public static class Choice_1180501282
      extends Choice<
          $bslash$div<
              $bslash$div<
                  $bslash$div<
                      $bslash$div<
                          $bslash$div<
                              $bslash$div<
                                  $bslash$div<
                                      $bslash$div<
                                          $bslash$div<
                                              $bslash$div<
                                                  $bslash$div<Attachment, BigDecimal>, Boolean>,
                                              Coding>,
                                          FHIRDate>,
                                      FHIRDateTime>,
                                  String>,
                              Integer>,
                          LocalTime>,
                      Quantity>,
                  Reference>,
              String>> {
    public Choice_1180501282(Attachment arg) {
      super("Attachment", arg, (LTag) UnionAliases.Union_1180501282Tag());
    }

    public Choice_1180501282(BigDecimal arg) {
      super("Decimal", arg, (LTag) UnionAliases.Union_1180501282Tag());
    }

    public Choice_1180501282(Boolean arg) {
      super("Boolean", arg, (LTag) UnionAliases.Union_1180501282Tag());
    }

    public Choice_1180501282(Coding arg) {
      super("Coding", arg, (LTag) UnionAliases.Union_1180501282Tag());
    }

    public Choice_1180501282(FHIRDate arg) {
      super("Date", arg, (LTag) UnionAliases.Union_1180501282Tag());
    }

    public Choice_1180501282(FHIRDateTime arg) {
      super("DateTime", arg, (LTag) UnionAliases.Union_1180501282Tag());
    }

    public Choice_1180501282(Integer arg) {
      super("Integer", arg, (LTag) UnionAliases.Union_1180501282Tag());
    }

    public Choice_1180501282(LocalTime arg) {
      super("Time", arg, (LTag) UnionAliases.Union_1180501282Tag());
    }

    public Choice_1180501282(Quantity arg) {
      super("Quantity", arg, (LTag) UnionAliases.Union_1180501282Tag());
    }

    public Choice_1180501282(Reference arg) {
      super("Reference", arg, (LTag) UnionAliases.Union_1180501282Tag());
    }

    private Choice_1180501282(String subtype, String arg) {
      super(subtype, arg, (LTag) UnionAliases.Union_1180501282Tag());
    }

    public static Choice_1180501282 Choice_1180501282FHIRString(String arg) {
      return new Choice_1180501282("FHIRString", arg);
    }

    public static Choice_1180501282 Choice_1180501282UriStr(String arg) {
      return new Choice_1180501282("Uri", arg);
    }
  }

  public static class Choice01763000476
      extends Choice<
          $bslash$div<$bslash$div<$bslash$div<Duration, FHIRDateTime>, Period>, Timing>> {
    public Choice01763000476(Duration arg) {
      super("Duration", arg, (LTag) UnionAliases.Union01763000476Tag());
    }

    public Choice01763000476(FHIRDateTime arg) {
      super("DateTime", arg, (LTag) UnionAliases.Union01763000476Tag());
    }

    public Choice01763000476(Period arg) {
      super("Period", arg, (LTag) UnionAliases.Union01763000476Tag());
    }

    public Choice01763000476(Timing arg) {
      super("Timing", arg, (LTag) UnionAliases.Union01763000476Tag());
    }
  }

  public static class ChoiceBooleanOrReference extends Choice<$bslash$div<Boolean, Reference>> {
    public ChoiceBooleanOrReference(Boolean arg) {
      super("Boolean", arg, (LTag) UnionAliases.UnionBooleanOrReferenceTag());
    }

    public ChoiceBooleanOrReference(Reference arg) {
      super("Reference", arg, (LTag) UnionAliases.UnionBooleanOrReferenceTag());
    }
  }

  public static class ChoiceBase64BinaryOrFHIRString extends Choice<$bslash$div<byte[], String>> {
    public ChoiceBase64BinaryOrFHIRString(byte[] arg) {
      super("Base64Binary", arg, (LTag) UnionAliases.UnionBase64BinaryOrFHIRStringTag());
    }

    public ChoiceBase64BinaryOrFHIRString(String arg) {
      super("FHIRString", arg, (LTag) UnionAliases.UnionBase64BinaryOrFHIRStringTag());
    }
  }

  public static class ChoiceCanonicalOrCodeableConceptOrUri
      extends Choice<$bslash$div<$bslash$div<String, CodeableConcept>, String>> {
    public ChoiceCanonicalOrCodeableConceptOrUri(CodeableConcept arg) {
      super("CodeableConcept", arg, (LTag) UnionAliases.UnionCanonicalOrCodeableConceptOrUriTag());
    }

    private ChoiceCanonicalOrCodeableConceptOrUri(String subtype, String arg) {
      super(subtype, arg, (LTag) UnionAliases.UnionCanonicalOrCodeableConceptOrUriTag());
    }

    public static ChoiceCanonicalOrCodeableConceptOrUri
        ChoiceCanonicalOrCodeableConceptOrUriCanonical(String arg) {
      return new ChoiceCanonicalOrCodeableConceptOrUri("Canonical", arg);
    }

    public static ChoiceCanonicalOrCodeableConceptOrUri ChoiceCanonicalOrCodeableConceptOrUriUriStr(
        String arg) {
      return new ChoiceCanonicalOrCodeableConceptOrUri("Uri", arg);
    }
  }

  public static class ChoiceReferenceOrUrl extends Choice<$bslash$div<Reference, String>> {
    public ChoiceReferenceOrUrl(Reference arg) {
      super("Reference", arg, (LTag) UnionAliases.UnionReferenceOrUrlTag());
    }

    public ChoiceReferenceOrUrl(String arg) {
      super("Url", arg, (LTag) UnionAliases.UnionReferenceOrUrlTag());
    }
  }

  public static class Choice01480857620
      extends Choice<
          $bslash$div<
              $bslash$div<
                  $bslash$div<
                      $bslash$div<
                          $bslash$div<
                              $bslash$div<
                                  $bslash$div<$bslash$div<BigDecimal, FHIRDate>, FHIRDateTime>,
                                  Integer>,
                              LocalTime>,
                          Integer>,
                      Quantity>,
                  Integer>,
              ZonedDateTime>> {
    public Choice01480857620(BigDecimal arg) {
      super("Decimal", arg, (LTag) UnionAliases.Union01480857620Tag());
    }

    public Choice01480857620(FHIRDate arg) {
      super("Date", arg, (LTag) UnionAliases.Union01480857620Tag());
    }

    public Choice01480857620(FHIRDateTime arg) {
      super("DateTime", arg, (LTag) UnionAliases.Union01480857620Tag());
    }

    public Choice01480857620(LocalTime arg) {
      super("Time", arg, (LTag) UnionAliases.Union01480857620Tag());
    }

    public Choice01480857620(Quantity arg) {
      super("Quantity", arg, (LTag) UnionAliases.Union01480857620Tag());
    }

    public Choice01480857620(ZonedDateTime arg) {
      super("Instant", arg, (LTag) UnionAliases.Union01480857620Tag());
    }

    private Choice01480857620(String subtype, Integer arg) {
      super(subtype, arg, (LTag) UnionAliases.Union01480857620Tag());
    }

    public static Choice01480857620 Choice01480857620Int(Integer arg) {
      return new Choice01480857620("Integer", arg);
    }

    public static Choice01480857620 Choice01480857620PositiveInt(Integer arg) {
      return new Choice01480857620("PositiveInt", arg);
    }

    public static Choice01480857620 Choice01480857620UnsignedInt(Integer arg) {
      return new Choice01480857620("UnsignedInt", arg);
    }
  }

  public static class ChoiceDecimalOrRange extends Choice<$bslash$div<BigDecimal, Range>> {
    public ChoiceDecimalOrRange(BigDecimal arg) {
      super("Decimal", arg, (LTag) UnionAliases.UnionDecimalOrRangeTag());
    }

    public ChoiceDecimalOrRange(Range arg) {
      super("Range", arg, (LTag) UnionAliases.UnionDecimalOrRangeTag());
    }
  }

  public static class ChoiceDateTimeOrPeriod extends Choice<$bslash$div<FHIRDateTime, Period>> {
    public ChoiceDateTimeOrPeriod(FHIRDateTime arg) {
      super("DateTime", arg, (LTag) UnionAliases.UnionDateTimeOrPeriodTag());
    }

    public ChoiceDateTimeOrPeriod(Period arg) {
      super("Period", arg, (LTag) UnionAliases.UnionDateTimeOrPeriodTag());
    }
  }

  public static class Choice_1492638938
      extends Choice<
          $bslash$div<
              $bslash$div<
                  $bslash$div<
                      $bslash$div<
                          $bslash$div<
                              $bslash$div<
                                  $bslash$div<
                                      $bslash$div<$bslash$div<BigDecimal, Boolean>, Coding>,
                                      FHIRDate>,
                                  FHIRDateTime>,
                              String>,
                          Integer>,
                      LocalTime>,
                  Quantity>,
              Reference>> {
    public Choice_1492638938(BigDecimal arg) {
      super("Decimal", arg, (LTag) UnionAliases.Union_1492638938Tag());
    }

    public Choice_1492638938(Boolean arg) {
      super("Boolean", arg, (LTag) UnionAliases.Union_1492638938Tag());
    }

    public Choice_1492638938(Coding arg) {
      super("Coding", arg, (LTag) UnionAliases.Union_1492638938Tag());
    }

    public Choice_1492638938(FHIRDate arg) {
      super("Date", arg, (LTag) UnionAliases.Union_1492638938Tag());
    }

    public Choice_1492638938(FHIRDateTime arg) {
      super("DateTime", arg, (LTag) UnionAliases.Union_1492638938Tag());
    }

    public Choice_1492638938(String arg) {
      super("FHIRString", arg, (LTag) UnionAliases.Union_1492638938Tag());
    }

    public Choice_1492638938(Integer arg) {
      super("Integer", arg, (LTag) UnionAliases.Union_1492638938Tag());
    }

    public Choice_1492638938(LocalTime arg) {
      super("Time", arg, (LTag) UnionAliases.Union_1492638938Tag());
    }

    public Choice_1492638938(Quantity arg) {
      super("Quantity", arg, (LTag) UnionAliases.Union_1492638938Tag());
    }

    public Choice_1492638938(Reference arg) {
      super("Reference", arg, (LTag) UnionAliases.Union_1492638938Tag());
    }
  }

  public static class ChoiceBooleanOrInteger extends Choice<$bslash$div<Boolean, Integer>> {
    public ChoiceBooleanOrInteger(Boolean arg) {
      super("Boolean", arg, (LTag) UnionAliases.UnionBooleanOrIntegerTag());
    }

    public ChoiceBooleanOrInteger(Integer arg) {
      super("Integer", arg, (LTag) UnionAliases.UnionBooleanOrIntegerTag());
    }
  }

  public static class ChoiceDurationOrDate extends Choice<$bslash$div<Duration, FHIRDate>> {
    public ChoiceDurationOrDate(Duration arg) {
      super("Duration", arg, (LTag) UnionAliases.UnionDurationOrDateTag());
    }

    public ChoiceDurationOrDate(FHIRDate arg) {
      super("Date", arg, (LTag) UnionAliases.UnionDurationOrDateTag());
    }
  }

  public static class Choice_1090046580
      extends Choice<
          $bslash$div<
              $bslash$div<
                  $bslash$div<
                      $bslash$div<
                          $bslash$div<$bslash$div<Boolean, CodeableConcept>, String>, Integer>,
                      Quantity>,
                  Range>,
              Ratio>> {
    public Choice_1090046580(Boolean arg) {
      super("Boolean", arg, (LTag) UnionAliases.Union_1090046580Tag());
    }

    public Choice_1090046580(CodeableConcept arg) {
      super("CodeableConcept", arg, (LTag) UnionAliases.Union_1090046580Tag());
    }

    public Choice_1090046580(String arg) {
      super("FHIRString", arg, (LTag) UnionAliases.Union_1090046580Tag());
    }

    public Choice_1090046580(Integer arg) {
      super("Integer", arg, (LTag) UnionAliases.Union_1090046580Tag());
    }

    public Choice_1090046580(Quantity arg) {
      super("Quantity", arg, (LTag) UnionAliases.Union_1090046580Tag());
    }

    public Choice_1090046580(Range arg) {
      super("Range", arg, (LTag) UnionAliases.Union_1090046580Tag());
    }

    public Choice_1090046580(Ratio arg) {
      super("Ratio", arg, (LTag) UnionAliases.Union_1090046580Tag());
    }
  }

  public static class ChoiceMoneyOrQuantity extends Choice<$bslash$div<Money, Quantity>> {
    public ChoiceMoneyOrQuantity(Money arg) {
      super("Money", arg, (LTag) UnionAliases.UnionMoneyOrQuantityTag());
    }

    public ChoiceMoneyOrQuantity(Quantity arg) {
      super("Quantity", arg, (LTag) UnionAliases.UnionMoneyOrQuantityTag());
    }
  }

  public static class Choice00617434070
      extends Choice<
          $bslash$div<
              $bslash$div<
                  $bslash$div<$bslash$div<$bslash$div<Coding, FHIRDate>, String>, Integer>,
                  LocalTime>,
              Reference>> {
    public Choice00617434070(Coding arg) {
      super("Coding", arg, (LTag) UnionAliases.Union00617434070Tag());
    }

    public Choice00617434070(FHIRDate arg) {
      super("Date", arg, (LTag) UnionAliases.Union00617434070Tag());
    }

    public Choice00617434070(String arg) {
      super("FHIRString", arg, (LTag) UnionAliases.Union00617434070Tag());
    }

    public Choice00617434070(Integer arg) {
      super("Integer", arg, (LTag) UnionAliases.Union00617434070Tag());
    }

    public Choice00617434070(LocalTime arg) {
      super("Time", arg, (LTag) UnionAliases.Union00617434070Tag());
    }

    public Choice00617434070(Reference arg) {
      super("Reference", arg, (LTag) UnionAliases.Union00617434070Tag());
    }
  }

  public static class ChoiceFHIRStringOrPositiveInt extends Choice<$bslash$div<String, Integer>> {
    public ChoiceFHIRStringOrPositiveInt(String arg) {
      super("FHIRString", arg, (LTag) UnionAliases.UnionFHIRStringOrPositiveIntTag());
    }

    public ChoiceFHIRStringOrPositiveInt(Integer arg) {
      super("PositiveInt", arg, (LTag) UnionAliases.UnionFHIRStringOrPositiveIntTag());
    }
  }

  public static class Choice00969593238
      extends Choice<
          $bslash$div<
              $bslash$div<$bslash$div<$bslash$div<Attachment, Boolean>, String>, Quantity>,
              Reference>> {
    public Choice00969593238(Attachment arg) {
      super("Attachment", arg, (LTag) UnionAliases.Union00969593238Tag());
    }

    public Choice00969593238(Boolean arg) {
      super("Boolean", arg, (LTag) UnionAliases.Union00969593238Tag());
    }

    public Choice00969593238(String arg) {
      super("FHIRString", arg, (LTag) UnionAliases.Union00969593238Tag());
    }

    public Choice00969593238(Quantity arg) {
      super("Quantity", arg, (LTag) UnionAliases.Union00969593238Tag());
    }

    public Choice00969593238(Reference arg) {
      super("Reference", arg, (LTag) UnionAliases.Union00969593238Tag());
    }
  }

  public static class ChoiceFHIRStringOrQuantityOrRange
      extends Choice<$bslash$div<$bslash$div<String, Quantity>, Range>> {
    public ChoiceFHIRStringOrQuantityOrRange(String arg) {
      super("FHIRString", arg, (LTag) UnionAliases.UnionFHIRStringOrQuantityOrRangeTag());
    }

    public ChoiceFHIRStringOrQuantityOrRange(Quantity arg) {
      super("Quantity", arg, (LTag) UnionAliases.UnionFHIRStringOrQuantityOrRangeTag());
    }

    public ChoiceFHIRStringOrQuantityOrRange(Range arg) {
      super("Range", arg, (LTag) UnionAliases.UnionFHIRStringOrQuantityOrRangeTag());
    }
  }

  public static class ChoiceCanonicalOrUri extends Choice<$bslash$div<String, String>> {

    private ChoiceCanonicalOrUri(String subtype, String arg) {
      super(subtype, arg, (LTag) UnionAliases.UnionCanonicalOrUriTag());
    }

    public static ChoiceCanonicalOrUri ChoiceCanonicalOrUriCanonical(String arg) {
      return new ChoiceCanonicalOrUri("Canonical", arg);
    }

    public static ChoiceCanonicalOrUri ChoiceCanonicalOrUriUriStr(String arg) {
      return new ChoiceCanonicalOrUri("Uri", arg);
    }
  }

  public static class ChoiceDateOrPeriod extends Choice<$bslash$div<FHIRDate, Period>> {
    public ChoiceDateOrPeriod(FHIRDate arg) {
      super("Date", arg, (LTag) UnionAliases.UnionDateOrPeriodTag());
    }

    public ChoiceDateOrPeriod(Period arg) {
      super("Period", arg, (LTag) UnionAliases.UnionDateOrPeriodTag());
    }
  }

  public static class Choice_0231587408
      extends Choice<
          $bslash$div<
              $bslash$div<$bslash$div<$bslash$div<Age, Boolean>, FHIRDate>, String>, Range>> {
    public Choice_0231587408(Age arg) {
      super("Age", arg, (LTag) UnionAliases.Union_0231587408Tag());
    }

    public Choice_0231587408(Boolean arg) {
      super("Boolean", arg, (LTag) UnionAliases.Union_0231587408Tag());
    }

    public Choice_0231587408(FHIRDate arg) {
      super("Date", arg, (LTag) UnionAliases.Union_0231587408Tag());
    }

    public Choice_0231587408(String arg) {
      super("FHIRString", arg, (LTag) UnionAliases.Union_0231587408Tag());
    }

    public Choice_0231587408(Range arg) {
      super("Range", arg, (LTag) UnionAliases.Union_0231587408Tag());
    }
  }

  public static class ChoiceAttachmentOrFHIRStringOrReference
      extends Choice<$bslash$div<$bslash$div<Attachment, String>, Reference>> {
    public ChoiceAttachmentOrFHIRStringOrReference(Attachment arg) {
      super("Attachment", arg, (LTag) UnionAliases.UnionAttachmentOrFHIRStringOrReferenceTag());
    }

    public ChoiceAttachmentOrFHIRStringOrReference(String arg) {
      super("FHIRString", arg, (LTag) UnionAliases.UnionAttachmentOrFHIRStringOrReferenceTag());
    }

    public ChoiceAttachmentOrFHIRStringOrReference(Reference arg) {
      super("Reference", arg, (LTag) UnionAliases.UnionAttachmentOrFHIRStringOrReferenceTag());
    }
  }

  public static class Choice_0461247536
      extends Choice<
          $bslash$div<
              $bslash$div<$bslash$div<$bslash$div<Age, FHIRDateTime>, String>, Period>, Range>> {
    public Choice_0461247536(Age arg) {
      super("Age", arg, (LTag) UnionAliases.Union_0461247536Tag());
    }

    public Choice_0461247536(FHIRDateTime arg) {
      super("DateTime", arg, (LTag) UnionAliases.Union_0461247536Tag());
    }

    public Choice_0461247536(String arg) {
      super("FHIRString", arg, (LTag) UnionAliases.Union_0461247536Tag());
    }

    public Choice_0461247536(Period arg) {
      super("Period", arg, (LTag) UnionAliases.Union_0461247536Tag());
    }

    public Choice_0461247536(Range arg) {
      super("Range", arg, (LTag) UnionAliases.Union_0461247536Tag());
    }
  }

  public static class ChoiceQuantityOrRatio extends Choice<$bslash$div<Quantity, Ratio>> {
    public ChoiceQuantityOrRatio(Quantity arg) {
      super("Quantity", arg, (LTag) UnionAliases.UnionQuantityOrRatioTag());
    }

    public ChoiceQuantityOrRatio(Ratio arg) {
      super("Ratio", arg, (LTag) UnionAliases.UnionQuantityOrRatioTag());
    }
  }

  public static class ChoiceDurationOrRange extends Choice<$bslash$div<Duration, Range>> {
    public ChoiceDurationOrRange(Duration arg) {
      super("Duration", arg, (LTag) UnionAliases.UnionDurationOrRangeTag());
    }

    public ChoiceDurationOrRange(Range arg) {
      super("Range", arg, (LTag) UnionAliases.UnionDurationOrRangeTag());
    }
  }

  public static class Choice_0245096255
      extends Choice<
          $bslash$div<
              $bslash$div<
                  $bslash$div<
                      $bslash$div<
                          $bslash$div<$bslash$div<BigDecimal, Boolean>, String>, FHIRDateTime>,
                      String>,
                  Integer>,
              String>> {
    public Choice_0245096255(BigDecimal arg) {
      super("Decimal", arg, (LTag) UnionAliases.Union_0245096255Tag());
    }

    public Choice_0245096255(Boolean arg) {
      super("Boolean", arg, (LTag) UnionAliases.Union_0245096255Tag());
    }

    public Choice_0245096255(FHIRDateTime arg) {
      super("DateTime", arg, (LTag) UnionAliases.Union_0245096255Tag());
    }

    public Choice_0245096255(Integer arg) {
      super("Integer", arg, (LTag) UnionAliases.Union_0245096255Tag());
    }

    private Choice_0245096255(String subtype, String arg) {
      super(subtype, arg, (LTag) UnionAliases.Union_0245096255Tag());
    }

    public static Choice_0245096255 Choice_0245096255Code(String arg) {
      return new Choice_0245096255("Code", arg);
    }

    public static Choice_0245096255 Choice_0245096255FHIRString(String arg) {
      return new Choice_0245096255("FHIRString", arg);
    }

    public static Choice_0245096255 Choice_0245096255UriStr(String arg) {
      return new Choice_0245096255("Uri", arg);
    }
  }

  public static class ChoiceDateOrFHIRStringOrPeriod
      extends Choice<$bslash$div<$bslash$div<FHIRDate, String>, Period>> {
    public ChoiceDateOrFHIRStringOrPeriod(FHIRDate arg) {
      super("Date", arg, (LTag) UnionAliases.UnionDateOrFHIRStringOrPeriodTag());
    }

    public ChoiceDateOrFHIRStringOrPeriod(String arg) {
      super("FHIRString", arg, (LTag) UnionAliases.UnionDateOrFHIRStringOrPeriodTag());
    }

    public ChoiceDateOrFHIRStringOrPeriod(Period arg) {
      super("Period", arg, (LTag) UnionAliases.UnionDateOrFHIRStringOrPeriodTag());
    }
  }

  public static class ChoiceFHIRStringOrMoneyOrUnsignedInt
      extends Choice<$bslash$div<$bslash$div<String, Money>, Integer>> {
    public ChoiceFHIRStringOrMoneyOrUnsignedInt(String arg) {
      super("FHIRString", arg, (LTag) UnionAliases.UnionFHIRStringOrMoneyOrUnsignedIntTag());
    }

    public ChoiceFHIRStringOrMoneyOrUnsignedInt(Money arg) {
      super("Money", arg, (LTag) UnionAliases.UnionFHIRStringOrMoneyOrUnsignedIntTag());
    }

    public ChoiceFHIRStringOrMoneyOrUnsignedInt(Integer arg) {
      super("UnsignedInt", arg, (LTag) UnionAliases.UnionFHIRStringOrMoneyOrUnsignedIntTag());
    }
  }

  public static class Choice00486695352
      extends Choice<
          $bslash$div<
              $bslash$div<$bslash$div<$bslash$div<BigDecimal, Boolean>, String>, String>,
              Integer>> {
    public Choice00486695352(BigDecimal arg) {
      super("Decimal", arg, (LTag) UnionAliases.Union00486695352Tag());
    }

    public Choice00486695352(Boolean arg) {
      super("Boolean", arg, (LTag) UnionAliases.Union00486695352Tag());
    }

    public Choice00486695352(Integer arg) {
      super("Integer", arg, (LTag) UnionAliases.Union00486695352Tag());
    }

    private Choice00486695352(String subtype, String arg) {
      super(subtype, arg, (LTag) UnionAliases.Union00486695352Tag());
    }

    public static Choice00486695352 Choice00486695352FHIRString(String arg) {
      return new Choice00486695352("FHIRString", arg);
    }

    public static Choice00486695352 Choice00486695352Id(String arg) {
      return new Choice00486695352("Id", arg);
    }
  }

  public static class Choice_0044338899
      extends Choice<
          $bslash$div<
              $bslash$div<$bslash$div<String, CodeableConcept>, DataRequirement>, Expression>> {
    public Choice_0044338899(String arg) {
      super("Canonical", arg, (LTag) UnionAliases.Union_0044338899Tag());
    }

    public Choice_0044338899(CodeableConcept arg) {
      super("CodeableConcept", arg, (LTag) UnionAliases.Union_0044338899Tag());
    }

    public Choice_0044338899(DataRequirement arg) {
      super("DataRequirement", arg, (LTag) UnionAliases.Union_0044338899Tag());
    }

    public Choice_0044338899(Expression arg) {
      super("Expression", arg, (LTag) UnionAliases.Union_0044338899Tag());
    }
  }

  public static class ChoiceDateTimeOrFHIRString extends Choice<$bslash$div<FHIRDateTime, String>> {
    public ChoiceDateTimeOrFHIRString(FHIRDateTime arg) {
      super("DateTime", arg, (LTag) UnionAliases.UnionDateTimeOrFHIRStringTag());
    }

    public ChoiceDateTimeOrFHIRString(String arg) {
      super("FHIRString", arg, (LTag) UnionAliases.UnionDateTimeOrFHIRStringTag());
    }
  }

  public static class ChoiceIdentifierOrReference
      extends Choice<$bslash$div<Identifier, Reference>> {
    public ChoiceIdentifierOrReference(Identifier arg) {
      super("Identifier", arg, (LTag) UnionAliases.UnionIdentifierOrReferenceTag());
    }

    public ChoiceIdentifierOrReference(Reference arg) {
      super("Reference", arg, (LTag) UnionAliases.UnionIdentifierOrReferenceTag());
    }
  }

  public static class ChoiceCodeableConceptOrDate
      extends Choice<$bslash$div<CodeableConcept, FHIRDate>> {
    public ChoiceCodeableConceptOrDate(CodeableConcept arg) {
      super("CodeableConcept", arg, (LTag) UnionAliases.UnionCodeableConceptOrDateTag());
    }

    public ChoiceCodeableConceptOrDate(FHIRDate arg) {
      super("Date", arg, (LTag) UnionAliases.UnionCodeableConceptOrDateTag());
    }
  }

  public static class ChoiceCodeableConceptOrDuration
      extends Choice<$bslash$div<CodeableConcept, Duration>> {
    public ChoiceCodeableConceptOrDuration(CodeableConcept arg) {
      super("CodeableConcept", arg, (LTag) UnionAliases.UnionCodeableConceptOrDurationTag());
    }

    public ChoiceCodeableConceptOrDuration(Duration arg) {
      super("Duration", arg, (LTag) UnionAliases.UnionCodeableConceptOrDurationTag());
    }
  }

  public static class ChoiceFHIRStringOrPeriodOrTiming
      extends Choice<$bslash$div<$bslash$div<String, Period>, Timing>> {
    public ChoiceFHIRStringOrPeriodOrTiming(String arg) {
      super("FHIRString", arg, (LTag) UnionAliases.UnionFHIRStringOrPeriodOrTimingTag());
    }

    public ChoiceFHIRStringOrPeriodOrTiming(Period arg) {
      super("Period", arg, (LTag) UnionAliases.UnionFHIRStringOrPeriodOrTimingTag());
    }

    public ChoiceFHIRStringOrPeriodOrTiming(Timing arg) {
      super("Timing", arg, (LTag) UnionAliases.UnionFHIRStringOrPeriodOrTimingTag());
    }
  }

  public static class ChoicePeriodOrRange extends Choice<$bslash$div<Period, Range>> {
    public ChoicePeriodOrRange(Period arg) {
      super("Period", arg, (LTag) UnionAliases.UnionPeriodOrRangeTag());
    }

    public ChoicePeriodOrRange(Range arg) {
      super("Range", arg, (LTag) UnionAliases.UnionPeriodOrRangeTag());
    }
  }

  public static class Choice_1690912481
      extends Choice<
          $bslash$div<
              $bslash$div<$bslash$div<$bslash$div<Boolean, CodeableConcept>, Quantity>, Range>,
              Reference>> {
    public Choice_1690912481(Boolean arg) {
      super("Boolean", arg, (LTag) UnionAliases.Union_1690912481Tag());
    }

    public Choice_1690912481(CodeableConcept arg) {
      super("CodeableConcept", arg, (LTag) UnionAliases.Union_1690912481Tag());
    }

    public Choice_1690912481(Quantity arg) {
      super("Quantity", arg, (LTag) UnionAliases.Union_1690912481Tag());
    }

    public Choice_1690912481(Range arg) {
      super("Range", arg, (LTag) UnionAliases.Union_1690912481Tag());
    }

    public Choice_1690912481(Reference arg) {
      super("Reference", arg, (LTag) UnionAliases.Union_1690912481Tag());
    }
  }

  public static class ChoiceCodeableConceptOrQuantity
      extends Choice<$bslash$div<CodeableConcept, Quantity>> {
    public ChoiceCodeableConceptOrQuantity(CodeableConcept arg) {
      super("CodeableConcept", arg, (LTag) UnionAliases.UnionCodeableConceptOrQuantityTag());
    }

    public ChoiceCodeableConceptOrQuantity(Quantity arg) {
      super("Quantity", arg, (LTag) UnionAliases.UnionCodeableConceptOrQuantityTag());
    }
  }

  public static class ChoiceCodeableConceptOrQuantityOrRange
      extends Choice<$bslash$div<$bslash$div<CodeableConcept, Quantity>, Range>> {
    public ChoiceCodeableConceptOrQuantityOrRange(CodeableConcept arg) {
      super("CodeableConcept", arg, (LTag) UnionAliases.UnionCodeableConceptOrQuantityOrRangeTag());
    }

    public ChoiceCodeableConceptOrQuantityOrRange(Quantity arg) {
      super("Quantity", arg, (LTag) UnionAliases.UnionCodeableConceptOrQuantityOrRangeTag());
    }

    public ChoiceCodeableConceptOrQuantityOrRange(Range arg) {
      super("Range", arg, (LTag) UnionAliases.UnionCodeableConceptOrQuantityOrRangeTag());
    }
  }

  public static class Choice01409210820
      extends Choice<
          $bslash$div<
              $bslash$div<
                  $bslash$div<
                      $bslash$div<$bslash$div<$bslash$div<BigDecimal, Boolean>, String>, Coding>,
                      FHIRDateTime>,
                  String>,
              Integer>> {
    public Choice01409210820(BigDecimal arg) {
      super("Decimal", arg, (LTag) UnionAliases.Union01409210820Tag());
    }

    public Choice01409210820(Boolean arg) {
      super("Boolean", arg, (LTag) UnionAliases.Union01409210820Tag());
    }

    public Choice01409210820(Coding arg) {
      super("Coding", arg, (LTag) UnionAliases.Union01409210820Tag());
    }

    public Choice01409210820(FHIRDateTime arg) {
      super("DateTime", arg, (LTag) UnionAliases.Union01409210820Tag());
    }

    public Choice01409210820(Integer arg) {
      super("Integer", arg, (LTag) UnionAliases.Union01409210820Tag());
    }

    private Choice01409210820(String subtype, String arg) {
      super(subtype, arg, (LTag) UnionAliases.Union01409210820Tag());
    }

    public static Choice01409210820 Choice01409210820Code(String arg) {
      return new Choice01409210820("Code", arg);
    }

    public static Choice01409210820 Choice01409210820FHIRString(String arg) {
      return new Choice01409210820("FHIRString", arg);
    }
  }

  public static class Choice02087996915
      extends Choice<
          $bslash$div<
              $bslash$div<
                  $bslash$div<
                      $bslash$div<
                          $bslash$div<
                              $bslash$div<
                                  $bslash$div<
                                      $bslash$div<
                                          $bslash$div<
                                              $bslash$div<Boolean, CodeableConcept>, FHIRDateTime>,
                                          String>,
                                      Integer>,
                                  LocalTime>,
                              Period>,
                          Quantity>,
                      Range>,
                  Ratio>,
              SampledData>> {
    public Choice02087996915(Boolean arg) {
      super("Boolean", arg, (LTag) UnionAliases.Union02087996915Tag());
    }

    public Choice02087996915(CodeableConcept arg) {
      super("CodeableConcept", arg, (LTag) UnionAliases.Union02087996915Tag());
    }

    public Choice02087996915(FHIRDateTime arg) {
      super("DateTime", arg, (LTag) UnionAliases.Union02087996915Tag());
    }

    public Choice02087996915(String arg) {
      super("FHIRString", arg, (LTag) UnionAliases.Union02087996915Tag());
    }

    public Choice02087996915(Integer arg) {
      super("Integer", arg, (LTag) UnionAliases.Union02087996915Tag());
    }

    public Choice02087996915(LocalTime arg) {
      super("Time", arg, (LTag) UnionAliases.Union02087996915Tag());
    }

    public Choice02087996915(Period arg) {
      super("Period", arg, (LTag) UnionAliases.Union02087996915Tag());
    }

    public Choice02087996915(Quantity arg) {
      super("Quantity", arg, (LTag) UnionAliases.Union02087996915Tag());
    }

    public Choice02087996915(Range arg) {
      super("Range", arg, (LTag) UnionAliases.Union02087996915Tag());
    }

    public Choice02087996915(Ratio arg) {
      super("Ratio", arg, (LTag) UnionAliases.Union02087996915Tag());
    }

    public Choice02087996915(SampledData arg) {
      super("SampledData", arg, (LTag) UnionAliases.Union02087996915Tag());
    }
  }

  public static class Choice01405873694
      extends Choice<
          $bslash$div<
              $bslash$div<
                  $bslash$div<$bslash$div<$bslash$div<Age, Duration>, FHIRDateTime>, Period>,
                  Range>,
              Timing>> {
    public Choice01405873694(Age arg) {
      super("Age", arg, (LTag) UnionAliases.Union01405873694Tag());
    }

    public Choice01405873694(Duration arg) {
      super("Duration", arg, (LTag) UnionAliases.Union01405873694Tag());
    }

    public Choice01405873694(FHIRDateTime arg) {
      super("DateTime", arg, (LTag) UnionAliases.Union01405873694Tag());
    }

    public Choice01405873694(Period arg) {
      super("Period", arg, (LTag) UnionAliases.Union01405873694Tag());
    }

    public Choice01405873694(Range arg) {
      super("Range", arg, (LTag) UnionAliases.Union01405873694Tag());
    }

    public Choice01405873694(Timing arg) {
      super("Timing", arg, (LTag) UnionAliases.Union01405873694Tag());
    }
  }

  public static class ChoiceCodingOrUri extends Choice<$bslash$div<Coding, String>> {
    public ChoiceCodingOrUri(Coding arg) {
      super("Coding", arg, (LTag) UnionAliases.UnionCodingOrUriTag());
    }

    public ChoiceCodingOrUri(String arg) {
      super("Uri", arg, (LTag) UnionAliases.UnionCodingOrUriTag());
    }
  }

  public static class ChoiceAgeOrFHIRStringOrRange
      extends Choice<$bslash$div<$bslash$div<Age, String>, Range>> {
    public ChoiceAgeOrFHIRStringOrRange(Age arg) {
      super("Age", arg, (LTag) UnionAliases.UnionAgeOrFHIRStringOrRangeTag());
    }

    public ChoiceAgeOrFHIRStringOrRange(String arg) {
      super("FHIRString", arg, (LTag) UnionAliases.UnionAgeOrFHIRStringOrRangeTag());
    }

    public ChoiceAgeOrFHIRStringOrRange(Range arg) {
      super("Range", arg, (LTag) UnionAliases.UnionAgeOrFHIRStringOrRangeTag());
    }
  }

  public static class ChoiceFHIRStringOrQuantity extends Choice<$bslash$div<String, Quantity>> {
    public ChoiceFHIRStringOrQuantity(String arg) {
      super("FHIRString", arg, (LTag) UnionAliases.UnionFHIRStringOrQuantityTag());
    }

    public ChoiceFHIRStringOrQuantity(Quantity arg) {
      super("Quantity", arg, (LTag) UnionAliases.UnionFHIRStringOrQuantityTag());
    }
  }

  public static class ChoiceAddressOrCodeableConceptOrReference
      extends Choice<$bslash$div<$bslash$div<Address, CodeableConcept>, Reference>> {
    public ChoiceAddressOrCodeableConceptOrReference(Address arg) {
      super("Address", arg, (LTag) UnionAliases.UnionAddressOrCodeableConceptOrReferenceTag());
    }

    public ChoiceAddressOrCodeableConceptOrReference(CodeableConcept arg) {
      super(
          "CodeableConcept",
          arg,
          (LTag) UnionAliases.UnionAddressOrCodeableConceptOrReferenceTag());
    }

    public ChoiceAddressOrCodeableConceptOrReference(Reference arg) {
      super("Reference", arg, (LTag) UnionAliases.UnionAddressOrCodeableConceptOrReferenceTag());
    }
  }

  public static class Choice00107722725
      extends Choice<
          $bslash$div<$bslash$div<$bslash$div<FHIRDateTime, Period>, Timing>, ZonedDateTime>> {
    public Choice00107722725(FHIRDateTime arg) {
      super("DateTime", arg, (LTag) UnionAliases.Union00107722725Tag());
    }

    public Choice00107722725(Period arg) {
      super("Period", arg, (LTag) UnionAliases.Union00107722725Tag());
    }

    public Choice00107722725(Timing arg) {
      super("Timing", arg, (LTag) UnionAliases.Union00107722725Tag());
    }

    public Choice00107722725(ZonedDateTime arg) {
      super("Instant", arg, (LTag) UnionAliases.Union00107722725Tag());
    }
  }

  public static class ChoiceDateTimeOrPeriodOrTiming
      extends Choice<$bslash$div<$bslash$div<FHIRDateTime, Period>, Timing>> {
    public ChoiceDateTimeOrPeriodOrTiming(FHIRDateTime arg) {
      super("DateTime", arg, (LTag) UnionAliases.UnionDateTimeOrPeriodOrTimingTag());
    }

    public ChoiceDateTimeOrPeriodOrTiming(Period arg) {
      super("Period", arg, (LTag) UnionAliases.UnionDateTimeOrPeriodOrTimingTag());
    }

    public ChoiceDateTimeOrPeriodOrTiming(Timing arg) {
      super("Timing", arg, (LTag) UnionAliases.UnionDateTimeOrPeriodOrTimingTag());
    }
  }

  public static class ChoiceMoneyOrUnsignedInt extends Choice<$bslash$div<Money, Integer>> {
    public ChoiceMoneyOrUnsignedInt(Money arg) {
      super("Money", arg, (LTag) UnionAliases.UnionMoneyOrUnsignedIntTag());
    }

    public ChoiceMoneyOrUnsignedInt(Integer arg) {
      super("UnsignedInt", arg, (LTag) UnionAliases.UnionMoneyOrUnsignedIntTag());
    }
  }

  public static class Choice00177902846
      extends Choice<$bslash$div<$bslash$div<$bslash$div<String, Quantity>, Range>, Ratio>> {
    public Choice00177902846(String arg) {
      super("FHIRString", arg, (LTag) UnionAliases.Union00177902846Tag());
    }

    public Choice00177902846(Quantity arg) {
      super("Quantity", arg, (LTag) UnionAliases.Union00177902846Tag());
    }

    public Choice00177902846(Range arg) {
      super("Range", arg, (LTag) UnionAliases.Union00177902846Tag());
    }

    public Choice00177902846(Ratio arg) {
      super("Ratio", arg, (LTag) UnionAliases.Union00177902846Tag());
    }
  }
}
