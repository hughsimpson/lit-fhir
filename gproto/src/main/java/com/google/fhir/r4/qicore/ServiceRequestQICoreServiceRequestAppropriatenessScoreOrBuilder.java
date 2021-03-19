// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/google/fhir/proto/r4/qicore/qicore.proto

package com.google.fhir.r4.qicore;

public interface ServiceRequestQICoreServiceRequestAppropriatenessScoreOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.fhir.r4.qicore.ServiceRequestQICoreServiceRequestAppropriatenessScore)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * xml:id (or equivalent in JSON)
   * </pre>
   *
   * <code>.google.fhir.r4.core.Id id = 1;</code>
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   * <pre>
   * xml:id (or equivalent in JSON)
   * </pre>
   *
   * <code>.google.fhir.r4.core.Id id = 1;</code>
   * @return The id.
   */
  com.google.fhir.r4.core.Id getId();
  /**
   * <pre>
   * xml:id (or equivalent in JSON)
   * </pre>
   *
   * <code>.google.fhir.r4.core.Id id = 1;</code>
   */
  com.google.fhir.r4.core.IdOrBuilder getIdOrBuilder();

  /**
   * <code>.google.fhir.r4.qicore.ServiceRequestQICoreServiceRequestAppropriatenessScore.ValueX value = 3 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   * @return Whether the value field is set.
   */
  boolean hasValue();
  /**
   * <code>.google.fhir.r4.qicore.ServiceRequestQICoreServiceRequestAppropriatenessScore.ValueX value = 3 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   * @return The value.
   */
  com.google.fhir.r4.qicore.ServiceRequestQICoreServiceRequestAppropriatenessScore.ValueX getValue();
  /**
   * <code>.google.fhir.r4.qicore.ServiceRequestQICoreServiceRequestAppropriatenessScore.ValueX value = 3 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   */
  com.google.fhir.r4.qicore.ServiceRequestQICoreServiceRequestAppropriatenessScore.ValueXOrBuilder getValueOrBuilder();
}
