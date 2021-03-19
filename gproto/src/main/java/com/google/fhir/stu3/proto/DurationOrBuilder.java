// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/google/fhir/proto/stu3/datatypes.proto

package com.google.fhir.stu3.proto;

public interface DurationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.fhir.stu3.proto.Duration)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * xml:id (or equivalent in JSON)
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.String id = 1;</code>
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   * <pre>
   * xml:id (or equivalent in JSON)
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.String id = 1;</code>
   * @return The id.
   */
  com.google.fhir.stu3.proto.String getId();
  /**
   * <pre>
   * xml:id (or equivalent in JSON)
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.String id = 1;</code>
   */
  com.google.fhir.stu3.proto.StringOrBuilder getIdOrBuilder();

  /**
   * <pre>
   * Additional Content defined by implementations
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Extension extension = 2;</code>
   */
  java.util.List<com.google.fhir.stu3.proto.Extension> 
      getExtensionList();
  /**
   * <pre>
   * Additional Content defined by implementations
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Extension extension = 2;</code>
   */
  com.google.fhir.stu3.proto.Extension getExtension(int index);
  /**
   * <pre>
   * Additional Content defined by implementations
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Extension extension = 2;</code>
   */
  int getExtensionCount();
  /**
   * <pre>
   * Additional Content defined by implementations
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Extension extension = 2;</code>
   */
  java.util.List<? extends com.google.fhir.stu3.proto.ExtensionOrBuilder> 
      getExtensionOrBuilderList();
  /**
   * <pre>
   * Additional Content defined by implementations
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Extension extension = 2;</code>
   */
  com.google.fhir.stu3.proto.ExtensionOrBuilder getExtensionOrBuilder(
      int index);

  /**
   * <pre>
   * Numerical value (with implicit precision)
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Decimal value = 3;</code>
   * @return Whether the value field is set.
   */
  boolean hasValue();
  /**
   * <pre>
   * Numerical value (with implicit precision)
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Decimal value = 3;</code>
   * @return The value.
   */
  com.google.fhir.stu3.proto.Decimal getValue();
  /**
   * <pre>
   * Numerical value (with implicit precision)
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Decimal value = 3;</code>
   */
  com.google.fhir.stu3.proto.DecimalOrBuilder getValueOrBuilder();

  /**
   * <pre>
   * &lt; | &lt;= | &gt;= | &gt; - how to understand the value
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.QuantityComparatorCode comparator = 4;</code>
   * @return Whether the comparator field is set.
   */
  boolean hasComparator();
  /**
   * <pre>
   * &lt; | &lt;= | &gt;= | &gt; - how to understand the value
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.QuantityComparatorCode comparator = 4;</code>
   * @return The comparator.
   */
  com.google.fhir.stu3.proto.QuantityComparatorCode getComparator();
  /**
   * <pre>
   * &lt; | &lt;= | &gt;= | &gt; - how to understand the value
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.QuantityComparatorCode comparator = 4;</code>
   */
  com.google.fhir.stu3.proto.QuantityComparatorCodeOrBuilder getComparatorOrBuilder();

  /**
   * <pre>
   * Unit representation
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.String unit = 5;</code>
   * @return Whether the unit field is set.
   */
  boolean hasUnit();
  /**
   * <pre>
   * Unit representation
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.String unit = 5;</code>
   * @return The unit.
   */
  com.google.fhir.stu3.proto.String getUnit();
  /**
   * <pre>
   * Unit representation
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.String unit = 5;</code>
   */
  com.google.fhir.stu3.proto.StringOrBuilder getUnitOrBuilder();

  /**
   * <pre>
   * System that defines coded unit form
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Uri system = 6;</code>
   * @return Whether the system field is set.
   */
  boolean hasSystem();
  /**
   * <pre>
   * System that defines coded unit form
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Uri system = 6;</code>
   * @return The system.
   */
  com.google.fhir.stu3.proto.Uri getSystem();
  /**
   * <pre>
   * System that defines coded unit form
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Uri system = 6;</code>
   */
  com.google.fhir.stu3.proto.UriOrBuilder getSystemOrBuilder();

  /**
   * <pre>
   * Coded form of the unit
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Code code = 7;</code>
   * @return Whether the code field is set.
   */
  boolean hasCode();
  /**
   * <pre>
   * Coded form of the unit
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Code code = 7;</code>
   * @return The code.
   */
  com.google.fhir.stu3.proto.Code getCode();
  /**
   * <pre>
   * Coded form of the unit
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Code code = 7;</code>
   */
  com.google.fhir.stu3.proto.CodeOrBuilder getCodeOrBuilder();
}
