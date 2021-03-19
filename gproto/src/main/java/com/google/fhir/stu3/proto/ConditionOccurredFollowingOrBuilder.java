// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/google/fhir/proto/stu3/extensions.proto

package com.google.fhir.stu3.proto;

public interface ConditionOccurredFollowingOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.fhir.stu3.proto.ConditionOccurredFollowing)
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
   * <code>.google.fhir.stu3.proto.ConditionOccurredFollowing.Value value = 3 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   * @return Whether the value field is set.
   */
  boolean hasValue();
  /**
   * <code>.google.fhir.stu3.proto.ConditionOccurredFollowing.Value value = 3 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   * @return The value.
   */
  com.google.fhir.stu3.proto.ConditionOccurredFollowing.Value getValue();
  /**
   * <code>.google.fhir.stu3.proto.ConditionOccurredFollowing.Value value = 3 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   */
  com.google.fhir.stu3.proto.ConditionOccurredFollowing.ValueOrBuilder getValueOrBuilder();
}
