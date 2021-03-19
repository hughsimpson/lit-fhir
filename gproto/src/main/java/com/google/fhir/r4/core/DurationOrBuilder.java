// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/google/fhir/proto/r4/core/datatypes.proto

package com.google.fhir.r4.core;

public interface DurationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.fhir.r4.core.Duration)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Unique id for inter-element referencing
   * </pre>
   *
   * <code>.google.fhir.r4.core.String id = 1;</code>
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   * <pre>
   * Unique id for inter-element referencing
   * </pre>
   *
   * <code>.google.fhir.r4.core.String id = 1;</code>
   * @return The id.
   */
  com.google.fhir.r4.core.String getId();
  /**
   * <pre>
   * Unique id for inter-element referencing
   * </pre>
   *
   * <code>.google.fhir.r4.core.String id = 1;</code>
   */
  com.google.fhir.r4.core.StringOrBuilder getIdOrBuilder();

  /**
   * <pre>
   * Additional content defined by implementations
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Extension extension = 2;</code>
   */
  java.util.List<com.google.fhir.r4.core.Extension> 
      getExtensionList();
  /**
   * <pre>
   * Additional content defined by implementations
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Extension extension = 2;</code>
   */
  com.google.fhir.r4.core.Extension getExtension(int index);
  /**
   * <pre>
   * Additional content defined by implementations
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Extension extension = 2;</code>
   */
  int getExtensionCount();
  /**
   * <pre>
   * Additional content defined by implementations
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Extension extension = 2;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.ExtensionOrBuilder> 
      getExtensionOrBuilderList();
  /**
   * <pre>
   * Additional content defined by implementations
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.Extension extension = 2;</code>
   */
  com.google.fhir.r4.core.ExtensionOrBuilder getExtensionOrBuilder(
      int index);

  /**
   * <pre>
   * Numerical value (with implicit precision)
   * </pre>
   *
   * <code>.google.fhir.r4.core.Decimal value = 3;</code>
   * @return Whether the value field is set.
   */
  boolean hasValue();
  /**
   * <pre>
   * Numerical value (with implicit precision)
   * </pre>
   *
   * <code>.google.fhir.r4.core.Decimal value = 3;</code>
   * @return The value.
   */
  com.google.fhir.r4.core.Decimal getValue();
  /**
   * <pre>
   * Numerical value (with implicit precision)
   * </pre>
   *
   * <code>.google.fhir.r4.core.Decimal value = 3;</code>
   */
  com.google.fhir.r4.core.DecimalOrBuilder getValueOrBuilder();

  /**
   * <code>.google.fhir.r4.core.Duration.ComparatorCode comparator = 4;</code>
   * @return Whether the comparator field is set.
   */
  boolean hasComparator();
  /**
   * <code>.google.fhir.r4.core.Duration.ComparatorCode comparator = 4;</code>
   * @return The comparator.
   */
  com.google.fhir.r4.core.Duration.ComparatorCode getComparator();
  /**
   * <code>.google.fhir.r4.core.Duration.ComparatorCode comparator = 4;</code>
   */
  com.google.fhir.r4.core.Duration.ComparatorCodeOrBuilder getComparatorOrBuilder();

  /**
   * <pre>
   * Unit representation
   * </pre>
   *
   * <code>.google.fhir.r4.core.String unit = 5;</code>
   * @return Whether the unit field is set.
   */
  boolean hasUnit();
  /**
   * <pre>
   * Unit representation
   * </pre>
   *
   * <code>.google.fhir.r4.core.String unit = 5;</code>
   * @return The unit.
   */
  com.google.fhir.r4.core.String getUnit();
  /**
   * <pre>
   * Unit representation
   * </pre>
   *
   * <code>.google.fhir.r4.core.String unit = 5;</code>
   */
  com.google.fhir.r4.core.StringOrBuilder getUnitOrBuilder();

  /**
   * <pre>
   * System that defines coded unit form
   * </pre>
   *
   * <code>.google.fhir.r4.core.Uri system = 6;</code>
   * @return Whether the system field is set.
   */
  boolean hasSystem();
  /**
   * <pre>
   * System that defines coded unit form
   * </pre>
   *
   * <code>.google.fhir.r4.core.Uri system = 6;</code>
   * @return The system.
   */
  com.google.fhir.r4.core.Uri getSystem();
  /**
   * <pre>
   * System that defines coded unit form
   * </pre>
   *
   * <code>.google.fhir.r4.core.Uri system = 6;</code>
   */
  com.google.fhir.r4.core.UriOrBuilder getSystemOrBuilder();

  /**
   * <pre>
   * Coded form of the unit
   * </pre>
   *
   * <code>.google.fhir.r4.core.Code code = 7;</code>
   * @return Whether the code field is set.
   */
  boolean hasCode();
  /**
   * <pre>
   * Coded form of the unit
   * </pre>
   *
   * <code>.google.fhir.r4.core.Code code = 7;</code>
   * @return The code.
   */
  com.google.fhir.r4.core.Code getCode();
  /**
   * <pre>
   * Coded form of the unit
   * </pre>
   *
   * <code>.google.fhir.r4.core.Code code = 7;</code>
   */
  com.google.fhir.r4.core.CodeOrBuilder getCodeOrBuilder();
}
