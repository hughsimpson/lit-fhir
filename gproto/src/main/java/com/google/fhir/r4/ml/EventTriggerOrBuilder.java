// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/google/fhir/proto/r4/ml_extensions.proto

package com.google.fhir.r4.ml;

public interface EventTriggerOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.fhir.r4.ml.EventTrigger)
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
   * The type of trigger, part of the prediction task definition.
   * </pre>
   *
   * <code>.google.fhir.r4.core.Coding type = 4 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   * @return Whether the type field is set.
   */
  boolean hasType();
  /**
   * <pre>
   * The type of trigger, part of the prediction task definition.
   * </pre>
   *
   * <code>.google.fhir.r4.core.Coding type = 4 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   * @return The type.
   */
  com.google.fhir.r4.core.Coding getType();
  /**
   * <pre>
   * The type of trigger, part of the prediction task definition.
   * </pre>
   *
   * <code>.google.fhir.r4.core.Coding type = 4 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   */
  com.google.fhir.r4.core.CodingOrBuilder getTypeOrBuilder();

  /**
   * <pre>
   * Prediction event time, more recent data will be elided.
   * </pre>
   *
   * <code>.google.fhir.r4.core.DateTime event_time = 5 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   * @return Whether the eventTime field is set.
   */
  boolean hasEventTime();
  /**
   * <pre>
   * Prediction event time, more recent data will be elided.
   * </pre>
   *
   * <code>.google.fhir.r4.core.DateTime event_time = 5 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   * @return The eventTime.
   */
  com.google.fhir.r4.core.DateTime getEventTime();
  /**
   * <pre>
   * Prediction event time, more recent data will be elided.
   * </pre>
   *
   * <code>.google.fhir.r4.core.DateTime event_time = 5 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   */
  com.google.fhir.r4.core.DateTimeOrBuilder getEventTimeOrBuilder();

  /**
   * <pre>
   * Resource that owns this trigger.
   * </pre>
   *
   * <code>.google.fhir.r4.core.Reference source = 6;</code>
   * @return Whether the source field is set.
   */
  boolean hasSource();
  /**
   * <pre>
   * Resource that owns this trigger.
   * </pre>
   *
   * <code>.google.fhir.r4.core.Reference source = 6;</code>
   * @return The source.
   */
  com.google.fhir.r4.core.Reference getSource();
  /**
   * <pre>
   * Resource that owns this trigger.
   * </pre>
   *
   * <code>.google.fhir.r4.core.Reference source = 6;</code>
   */
  com.google.fhir.r4.core.ReferenceOrBuilder getSourceOrBuilder();
}
