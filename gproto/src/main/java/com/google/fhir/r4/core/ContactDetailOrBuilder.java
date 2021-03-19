// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/google/fhir/proto/r4/core/datatypes.proto

package com.google.fhir.r4.core;

public interface ContactDetailOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.fhir.r4.core.ContactDetail)
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
   * Name of an individual to contact
   * </pre>
   *
   * <code>.google.fhir.r4.core.String name = 3;</code>
   * @return Whether the name field is set.
   */
  boolean hasName();
  /**
   * <pre>
   * Name of an individual to contact
   * </pre>
   *
   * <code>.google.fhir.r4.core.String name = 3;</code>
   * @return The name.
   */
  com.google.fhir.r4.core.String getName();
  /**
   * <pre>
   * Name of an individual to contact
   * </pre>
   *
   * <code>.google.fhir.r4.core.String name = 3;</code>
   */
  com.google.fhir.r4.core.StringOrBuilder getNameOrBuilder();

  /**
   * <pre>
   * Contact details for individual or organization
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.ContactPoint telecom = 4;</code>
   */
  java.util.List<com.google.fhir.r4.core.ContactPoint> 
      getTelecomList();
  /**
   * <pre>
   * Contact details for individual or organization
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.ContactPoint telecom = 4;</code>
   */
  com.google.fhir.r4.core.ContactPoint getTelecom(int index);
  /**
   * <pre>
   * Contact details for individual or organization
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.ContactPoint telecom = 4;</code>
   */
  int getTelecomCount();
  /**
   * <pre>
   * Contact details for individual or organization
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.ContactPoint telecom = 4;</code>
   */
  java.util.List<? extends com.google.fhir.r4.core.ContactPointOrBuilder> 
      getTelecomOrBuilderList();
  /**
   * <pre>
   * Contact details for individual or organization
   * </pre>
   *
   * <code>repeated .google.fhir.r4.core.ContactPoint telecom = 4;</code>
   */
  com.google.fhir.r4.core.ContactPointOrBuilder getTelecomOrBuilder(
      int index);
}
