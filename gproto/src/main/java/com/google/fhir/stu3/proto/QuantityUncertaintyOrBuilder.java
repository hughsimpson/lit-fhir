// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/google/fhir/proto/stu3/extensions.proto

package com.google.fhir.stu3.proto;

public interface QuantityUncertaintyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.fhir.stu3.proto.QuantityUncertainty)
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
   * Value of extension
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Decimal value_decimal = 3;</code>
   * @return Whether the valueDecimal field is set.
   */
  boolean hasValueDecimal();
  /**
   * <pre>
   * Value of extension
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Decimal value_decimal = 3;</code>
   * @return The valueDecimal.
   */
  com.google.fhir.stu3.proto.Decimal getValueDecimal();
  /**
   * <pre>
   * Value of extension
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Decimal value_decimal = 3;</code>
   */
  com.google.fhir.stu3.proto.DecimalOrBuilder getValueDecimalOrBuilder();
}
