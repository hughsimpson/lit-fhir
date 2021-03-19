// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/google/fhir/proto/stu3/extensions.proto

package com.google.fhir.stu3.proto;

/**
 * <pre>
 * Auto-generated from StructureDefinition for modeOfArrival.
 * The method of arrival of the patient into the facility.
 * See http://hl7.org/fhir/StructureDefinition/encounter-modeOfArrival
 * </pre>
 *
 * Protobuf type {@code google.fhir.stu3.proto.EncounterModeOfArrival}
 */
public final class EncounterModeOfArrival extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.fhir.stu3.proto.EncounterModeOfArrival)
    EncounterModeOfArrivalOrBuilder {
private static final long serialVersionUID = 0L;
  // Use EncounterModeOfArrival.newBuilder() to construct.
  private EncounterModeOfArrival(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EncounterModeOfArrival() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new EncounterModeOfArrival();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private EncounterModeOfArrival(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            com.google.fhir.stu3.proto.String.Builder subBuilder = null;
            if (id_ != null) {
              subBuilder = id_.toBuilder();
            }
            id_ = input.readMessage(com.google.fhir.stu3.proto.String.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(id_);
              id_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            com.google.fhir.stu3.proto.Coding.Builder subBuilder = null;
            if (valueCoding_ != null) {
              subBuilder = valueCoding_.toBuilder();
            }
            valueCoding_ = input.readMessage(com.google.fhir.stu3.proto.Coding.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(valueCoding_);
              valueCoding_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.fhir.stu3.proto.Extensions.internal_static_google_fhir_stu3_proto_EncounterModeOfArrival_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.fhir.stu3.proto.Extensions.internal_static_google_fhir_stu3_proto_EncounterModeOfArrival_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.fhir.stu3.proto.EncounterModeOfArrival.class, com.google.fhir.stu3.proto.EncounterModeOfArrival.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private com.google.fhir.stu3.proto.String id_;
  /**
   * <pre>
   * xml:id (or equivalent in JSON)
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.String id = 1;</code>
   * @return Whether the id field is set.
   */
  @java.lang.Override
  public boolean hasId() {
    return id_ != null;
  }
  /**
   * <pre>
   * xml:id (or equivalent in JSON)
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.String id = 1;</code>
   * @return The id.
   */
  @java.lang.Override
  public com.google.fhir.stu3.proto.String getId() {
    return id_ == null ? com.google.fhir.stu3.proto.String.getDefaultInstance() : id_;
  }
  /**
   * <pre>
   * xml:id (or equivalent in JSON)
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.String id = 1;</code>
   */
  @java.lang.Override
  public com.google.fhir.stu3.proto.StringOrBuilder getIdOrBuilder() {
    return getId();
  }

  public static final int VALUE_CODING_FIELD_NUMBER = 3;
  private com.google.fhir.stu3.proto.Coding valueCoding_;
  /**
   * <pre>
   * Value of extension
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Coding value_coding = 3;</code>
   * @return Whether the valueCoding field is set.
   */
  @java.lang.Override
  public boolean hasValueCoding() {
    return valueCoding_ != null;
  }
  /**
   * <pre>
   * Value of extension
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Coding value_coding = 3;</code>
   * @return The valueCoding.
   */
  @java.lang.Override
  public com.google.fhir.stu3.proto.Coding getValueCoding() {
    return valueCoding_ == null ? com.google.fhir.stu3.proto.Coding.getDefaultInstance() : valueCoding_;
  }
  /**
   * <pre>
   * Value of extension
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Coding value_coding = 3;</code>
   */
  @java.lang.Override
  public com.google.fhir.stu3.proto.CodingOrBuilder getValueCodingOrBuilder() {
    return getValueCoding();
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (id_ != null) {
      output.writeMessage(1, getId());
    }
    if (valueCoding_ != null) {
      output.writeMessage(3, getValueCoding());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (id_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getId());
    }
    if (valueCoding_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getValueCoding());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.fhir.stu3.proto.EncounterModeOfArrival)) {
      return super.equals(obj);
    }
    com.google.fhir.stu3.proto.EncounterModeOfArrival other = (com.google.fhir.stu3.proto.EncounterModeOfArrival) obj;

    if (hasId() != other.hasId()) return false;
    if (hasId()) {
      if (!getId()
          .equals(other.getId())) return false;
    }
    if (hasValueCoding() != other.hasValueCoding()) return false;
    if (hasValueCoding()) {
      if (!getValueCoding()
          .equals(other.getValueCoding())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasId()) {
      hash = (37 * hash) + ID_FIELD_NUMBER;
      hash = (53 * hash) + getId().hashCode();
    }
    if (hasValueCoding()) {
      hash = (37 * hash) + VALUE_CODING_FIELD_NUMBER;
      hash = (53 * hash) + getValueCoding().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.fhir.stu3.proto.EncounterModeOfArrival parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.fhir.stu3.proto.EncounterModeOfArrival parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.fhir.stu3.proto.EncounterModeOfArrival parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.fhir.stu3.proto.EncounterModeOfArrival parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.fhir.stu3.proto.EncounterModeOfArrival parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.fhir.stu3.proto.EncounterModeOfArrival parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.fhir.stu3.proto.EncounterModeOfArrival parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.fhir.stu3.proto.EncounterModeOfArrival parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.fhir.stu3.proto.EncounterModeOfArrival parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.fhir.stu3.proto.EncounterModeOfArrival parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.fhir.stu3.proto.EncounterModeOfArrival parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.fhir.stu3.proto.EncounterModeOfArrival parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.fhir.stu3.proto.EncounterModeOfArrival prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Auto-generated from StructureDefinition for modeOfArrival.
   * The method of arrival of the patient into the facility.
   * See http://hl7.org/fhir/StructureDefinition/encounter-modeOfArrival
   * </pre>
   *
   * Protobuf type {@code google.fhir.stu3.proto.EncounterModeOfArrival}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.fhir.stu3.proto.EncounterModeOfArrival)
      com.google.fhir.stu3.proto.EncounterModeOfArrivalOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.fhir.stu3.proto.Extensions.internal_static_google_fhir_stu3_proto_EncounterModeOfArrival_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.fhir.stu3.proto.Extensions.internal_static_google_fhir_stu3_proto_EncounterModeOfArrival_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.fhir.stu3.proto.EncounterModeOfArrival.class, com.google.fhir.stu3.proto.EncounterModeOfArrival.Builder.class);
    }

    // Construct using com.google.fhir.stu3.proto.EncounterModeOfArrival.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (idBuilder_ == null) {
        id_ = null;
      } else {
        id_ = null;
        idBuilder_ = null;
      }
      if (valueCodingBuilder_ == null) {
        valueCoding_ = null;
      } else {
        valueCoding_ = null;
        valueCodingBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.fhir.stu3.proto.Extensions.internal_static_google_fhir_stu3_proto_EncounterModeOfArrival_descriptor;
    }

    @java.lang.Override
    public com.google.fhir.stu3.proto.EncounterModeOfArrival getDefaultInstanceForType() {
      return com.google.fhir.stu3.proto.EncounterModeOfArrival.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.fhir.stu3.proto.EncounterModeOfArrival build() {
      com.google.fhir.stu3.proto.EncounterModeOfArrival result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.fhir.stu3.proto.EncounterModeOfArrival buildPartial() {
      com.google.fhir.stu3.proto.EncounterModeOfArrival result = new com.google.fhir.stu3.proto.EncounterModeOfArrival(this);
      if (idBuilder_ == null) {
        result.id_ = id_;
      } else {
        result.id_ = idBuilder_.build();
      }
      if (valueCodingBuilder_ == null) {
        result.valueCoding_ = valueCoding_;
      } else {
        result.valueCoding_ = valueCodingBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.fhir.stu3.proto.EncounterModeOfArrival) {
        return mergeFrom((com.google.fhir.stu3.proto.EncounterModeOfArrival)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.fhir.stu3.proto.EncounterModeOfArrival other) {
      if (other == com.google.fhir.stu3.proto.EncounterModeOfArrival.getDefaultInstance()) return this;
      if (other.hasId()) {
        mergeId(other.getId());
      }
      if (other.hasValueCoding()) {
        mergeValueCoding(other.getValueCoding());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.fhir.stu3.proto.EncounterModeOfArrival parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.fhir.stu3.proto.EncounterModeOfArrival) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.fhir.stu3.proto.String id_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.fhir.stu3.proto.String, com.google.fhir.stu3.proto.String.Builder, com.google.fhir.stu3.proto.StringOrBuilder> idBuilder_;
    /**
     * <pre>
     * xml:id (or equivalent in JSON)
     * </pre>
     *
     * <code>.google.fhir.stu3.proto.String id = 1;</code>
     * @return Whether the id field is set.
     */
    public boolean hasId() {
      return idBuilder_ != null || id_ != null;
    }
    /**
     * <pre>
     * xml:id (or equivalent in JSON)
     * </pre>
     *
     * <code>.google.fhir.stu3.proto.String id = 1;</code>
     * @return The id.
     */
    public com.google.fhir.stu3.proto.String getId() {
      if (idBuilder_ == null) {
        return id_ == null ? com.google.fhir.stu3.proto.String.getDefaultInstance() : id_;
      } else {
        return idBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * xml:id (or equivalent in JSON)
     * </pre>
     *
     * <code>.google.fhir.stu3.proto.String id = 1;</code>
     */
    public Builder setId(com.google.fhir.stu3.proto.String value) {
      if (idBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        id_ = value;
        onChanged();
      } else {
        idBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * xml:id (or equivalent in JSON)
     * </pre>
     *
     * <code>.google.fhir.stu3.proto.String id = 1;</code>
     */
    public Builder setId(
        com.google.fhir.stu3.proto.String.Builder builderForValue) {
      if (idBuilder_ == null) {
        id_ = builderForValue.build();
        onChanged();
      } else {
        idBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * xml:id (or equivalent in JSON)
     * </pre>
     *
     * <code>.google.fhir.stu3.proto.String id = 1;</code>
     */
    public Builder mergeId(com.google.fhir.stu3.proto.String value) {
      if (idBuilder_ == null) {
        if (id_ != null) {
          id_ =
            com.google.fhir.stu3.proto.String.newBuilder(id_).mergeFrom(value).buildPartial();
        } else {
          id_ = value;
        }
        onChanged();
      } else {
        idBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * xml:id (or equivalent in JSON)
     * </pre>
     *
     * <code>.google.fhir.stu3.proto.String id = 1;</code>
     */
    public Builder clearId() {
      if (idBuilder_ == null) {
        id_ = null;
        onChanged();
      } else {
        id_ = null;
        idBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * xml:id (or equivalent in JSON)
     * </pre>
     *
     * <code>.google.fhir.stu3.proto.String id = 1;</code>
     */
    public com.google.fhir.stu3.proto.String.Builder getIdBuilder() {
      
      onChanged();
      return getIdFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * xml:id (or equivalent in JSON)
     * </pre>
     *
     * <code>.google.fhir.stu3.proto.String id = 1;</code>
     */
    public com.google.fhir.stu3.proto.StringOrBuilder getIdOrBuilder() {
      if (idBuilder_ != null) {
        return idBuilder_.getMessageOrBuilder();
      } else {
        return id_ == null ?
            com.google.fhir.stu3.proto.String.getDefaultInstance() : id_;
      }
    }
    /**
     * <pre>
     * xml:id (or equivalent in JSON)
     * </pre>
     *
     * <code>.google.fhir.stu3.proto.String id = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.fhir.stu3.proto.String, com.google.fhir.stu3.proto.String.Builder, com.google.fhir.stu3.proto.StringOrBuilder> 
        getIdFieldBuilder() {
      if (idBuilder_ == null) {
        idBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.fhir.stu3.proto.String, com.google.fhir.stu3.proto.String.Builder, com.google.fhir.stu3.proto.StringOrBuilder>(
                getId(),
                getParentForChildren(),
                isClean());
        id_ = null;
      }
      return idBuilder_;
    }

    private com.google.fhir.stu3.proto.Coding valueCoding_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.fhir.stu3.proto.Coding, com.google.fhir.stu3.proto.Coding.Builder, com.google.fhir.stu3.proto.CodingOrBuilder> valueCodingBuilder_;
    /**
     * <pre>
     * Value of extension
     * </pre>
     *
     * <code>.google.fhir.stu3.proto.Coding value_coding = 3;</code>
     * @return Whether the valueCoding field is set.
     */
    public boolean hasValueCoding() {
      return valueCodingBuilder_ != null || valueCoding_ != null;
    }
    /**
     * <pre>
     * Value of extension
     * </pre>
     *
     * <code>.google.fhir.stu3.proto.Coding value_coding = 3;</code>
     * @return The valueCoding.
     */
    public com.google.fhir.stu3.proto.Coding getValueCoding() {
      if (valueCodingBuilder_ == null) {
        return valueCoding_ == null ? com.google.fhir.stu3.proto.Coding.getDefaultInstance() : valueCoding_;
      } else {
        return valueCodingBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Value of extension
     * </pre>
     *
     * <code>.google.fhir.stu3.proto.Coding value_coding = 3;</code>
     */
    public Builder setValueCoding(com.google.fhir.stu3.proto.Coding value) {
      if (valueCodingBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        valueCoding_ = value;
        onChanged();
      } else {
        valueCodingBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Value of extension
     * </pre>
     *
     * <code>.google.fhir.stu3.proto.Coding value_coding = 3;</code>
     */
    public Builder setValueCoding(
        com.google.fhir.stu3.proto.Coding.Builder builderForValue) {
      if (valueCodingBuilder_ == null) {
        valueCoding_ = builderForValue.build();
        onChanged();
      } else {
        valueCodingBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Value of extension
     * </pre>
     *
     * <code>.google.fhir.stu3.proto.Coding value_coding = 3;</code>
     */
    public Builder mergeValueCoding(com.google.fhir.stu3.proto.Coding value) {
      if (valueCodingBuilder_ == null) {
        if (valueCoding_ != null) {
          valueCoding_ =
            com.google.fhir.stu3.proto.Coding.newBuilder(valueCoding_).mergeFrom(value).buildPartial();
        } else {
          valueCoding_ = value;
        }
        onChanged();
      } else {
        valueCodingBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Value of extension
     * </pre>
     *
     * <code>.google.fhir.stu3.proto.Coding value_coding = 3;</code>
     */
    public Builder clearValueCoding() {
      if (valueCodingBuilder_ == null) {
        valueCoding_ = null;
        onChanged();
      } else {
        valueCoding_ = null;
        valueCodingBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Value of extension
     * </pre>
     *
     * <code>.google.fhir.stu3.proto.Coding value_coding = 3;</code>
     */
    public com.google.fhir.stu3.proto.Coding.Builder getValueCodingBuilder() {
      
      onChanged();
      return getValueCodingFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Value of extension
     * </pre>
     *
     * <code>.google.fhir.stu3.proto.Coding value_coding = 3;</code>
     */
    public com.google.fhir.stu3.proto.CodingOrBuilder getValueCodingOrBuilder() {
      if (valueCodingBuilder_ != null) {
        return valueCodingBuilder_.getMessageOrBuilder();
      } else {
        return valueCoding_ == null ?
            com.google.fhir.stu3.proto.Coding.getDefaultInstance() : valueCoding_;
      }
    }
    /**
     * <pre>
     * Value of extension
     * </pre>
     *
     * <code>.google.fhir.stu3.proto.Coding value_coding = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.fhir.stu3.proto.Coding, com.google.fhir.stu3.proto.Coding.Builder, com.google.fhir.stu3.proto.CodingOrBuilder> 
        getValueCodingFieldBuilder() {
      if (valueCodingBuilder_ == null) {
        valueCodingBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.fhir.stu3.proto.Coding, com.google.fhir.stu3.proto.Coding.Builder, com.google.fhir.stu3.proto.CodingOrBuilder>(
                getValueCoding(),
                getParentForChildren(),
                isClean());
        valueCoding_ = null;
      }
      return valueCodingBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.fhir.stu3.proto.EncounterModeOfArrival)
  }

  // @@protoc_insertion_point(class_scope:google.fhir.stu3.proto.EncounterModeOfArrival)
  private static final com.google.fhir.stu3.proto.EncounterModeOfArrival DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.fhir.stu3.proto.EncounterModeOfArrival();
  }

  public static com.google.fhir.stu3.proto.EncounterModeOfArrival getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EncounterModeOfArrival>
      PARSER = new com.google.protobuf.AbstractParser<EncounterModeOfArrival>() {
    @java.lang.Override
    public EncounterModeOfArrival parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new EncounterModeOfArrival(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<EncounterModeOfArrival> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EncounterModeOfArrival> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.fhir.stu3.proto.EncounterModeOfArrival getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

