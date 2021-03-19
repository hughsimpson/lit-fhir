// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/google/fhir/proto/stu3/extensions.proto

package com.google.fhir.stu3.proto;

public interface DiagnosticReportGlstringOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.fhir.stu3.proto.DiagnosticReportGlstring)
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
   * glstring.url
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Uri url = 4;</code>
   * @return Whether the url field is set.
   */
  boolean hasUrl();
  /**
   * <pre>
   * glstring.url
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Uri url = 4;</code>
   * @return The url.
   */
  com.google.fhir.stu3.proto.Uri getUrl();
  /**
   * <pre>
   * glstring.url
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Uri url = 4;</code>
   */
  com.google.fhir.stu3.proto.UriOrBuilder getUrlOrBuilder();

  /**
   * <pre>
   * glstring.text
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.String text = 5;</code>
   * @return Whether the text field is set.
   */
  boolean hasText();
  /**
   * <pre>
   * glstring.text
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.String text = 5;</code>
   * @return The text.
   */
  com.google.fhir.stu3.proto.String getText();
  /**
   * <pre>
   * glstring.text
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.String text = 5;</code>
   */
  com.google.fhir.stu3.proto.StringOrBuilder getTextOrBuilder();
}
