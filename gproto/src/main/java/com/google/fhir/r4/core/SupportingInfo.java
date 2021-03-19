// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/google/fhir/proto/r4/core/extensions.proto

package com.google.fhir.r4.core;

/**
 * <pre>
 * Auto-generated from StructureDefinition for supportingInfo.
 * Other information that may be relevant to this event.
 * See http://hl7.org/fhir/StructureDefinition/workflow-supportingInfo
 * </pre>
 *
 * Protobuf type {@code google.fhir.r4.core.SupportingInfo}
 */
public final class SupportingInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.fhir.r4.core.SupportingInfo)
    SupportingInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SupportingInfo.newBuilder() to construct.
  private SupportingInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SupportingInfo() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SupportingInfo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SupportingInfo(
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
            com.google.fhir.r4.core.String.Builder subBuilder = null;
            if (id_ != null) {
              subBuilder = id_.toBuilder();
            }
            id_ = input.readMessage(com.google.fhir.r4.core.String.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(id_);
              id_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            com.google.fhir.r4.core.Reference.Builder subBuilder = null;
            if (valueReference_ != null) {
              subBuilder = valueReference_.toBuilder();
            }
            valueReference_ = input.readMessage(com.google.fhir.r4.core.Reference.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(valueReference_);
              valueReference_ = subBuilder.buildPartial();
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
    return com.google.fhir.r4.core.Extensions.internal_static_google_fhir_r4_core_SupportingInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.fhir.r4.core.Extensions.internal_static_google_fhir_r4_core_SupportingInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.fhir.r4.core.SupportingInfo.class, com.google.fhir.r4.core.SupportingInfo.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private com.google.fhir.r4.core.String id_;
  /**
   * <pre>
   * Unique id for inter-element referencing
   * </pre>
   *
   * <code>.google.fhir.r4.core.String id = 1;</code>
   * @return Whether the id field is set.
   */
  @java.lang.Override
  public boolean hasId() {
    return id_ != null;
  }
  /**
   * <pre>
   * Unique id for inter-element referencing
   * </pre>
   *
   * <code>.google.fhir.r4.core.String id = 1;</code>
   * @return The id.
   */
  @java.lang.Override
  public com.google.fhir.r4.core.String getId() {
    return id_ == null ? com.google.fhir.r4.core.String.getDefaultInstance() : id_;
  }
  /**
   * <pre>
   * Unique id for inter-element referencing
   * </pre>
   *
   * <code>.google.fhir.r4.core.String id = 1;</code>
   */
  @java.lang.Override
  public com.google.fhir.r4.core.StringOrBuilder getIdOrBuilder() {
    return getId();
  }

  public static final int VALUE_REFERENCE_FIELD_NUMBER = 3;
  private com.google.fhir.r4.core.Reference valueReference_;
  /**
   * <pre>
   * Value of extension
   * </pre>
   *
   * <code>.google.fhir.r4.core.Reference value_reference = 3 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR, (.google.fhir.proto.valid_reference_type) = "Resource"];</code>
   * @return Whether the valueReference field is set.
   */
  @java.lang.Override
  public boolean hasValueReference() {
    return valueReference_ != null;
  }
  /**
   * <pre>
   * Value of extension
   * </pre>
   *
   * <code>.google.fhir.r4.core.Reference value_reference = 3 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR, (.google.fhir.proto.valid_reference_type) = "Resource"];</code>
   * @return The valueReference.
   */
  @java.lang.Override
  public com.google.fhir.r4.core.Reference getValueReference() {
    return valueReference_ == null ? com.google.fhir.r4.core.Reference.getDefaultInstance() : valueReference_;
  }
  /**
   * <pre>
   * Value of extension
   * </pre>
   *
   * <code>.google.fhir.r4.core.Reference value_reference = 3 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR, (.google.fhir.proto.valid_reference_type) = "Resource"];</code>
   */
  @java.lang.Override
  public com.google.fhir.r4.core.ReferenceOrBuilder getValueReferenceOrBuilder() {
    return getValueReference();
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
    if (valueReference_ != null) {
      output.writeMessage(3, getValueReference());
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
    if (valueReference_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getValueReference());
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
    if (!(obj instanceof com.google.fhir.r4.core.SupportingInfo)) {
      return super.equals(obj);
    }
    com.google.fhir.r4.core.SupportingInfo other = (com.google.fhir.r4.core.SupportingInfo) obj;

    if (hasId() != other.hasId()) return false;
    if (hasId()) {
      if (!getId()
          .equals(other.getId())) return false;
    }
    if (hasValueReference() != other.hasValueReference()) return false;
    if (hasValueReference()) {
      if (!getValueReference()
          .equals(other.getValueReference())) return false;
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
    if (hasValueReference()) {
      hash = (37 * hash) + VALUE_REFERENCE_FIELD_NUMBER;
      hash = (53 * hash) + getValueReference().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.fhir.r4.core.SupportingInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.fhir.r4.core.SupportingInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.fhir.r4.core.SupportingInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.fhir.r4.core.SupportingInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.fhir.r4.core.SupportingInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.fhir.r4.core.SupportingInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.fhir.r4.core.SupportingInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.fhir.r4.core.SupportingInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.fhir.r4.core.SupportingInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.fhir.r4.core.SupportingInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.fhir.r4.core.SupportingInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.fhir.r4.core.SupportingInfo parseFrom(
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
  public static Builder newBuilder(com.google.fhir.r4.core.SupportingInfo prototype) {
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
   * Auto-generated from StructureDefinition for supportingInfo.
   * Other information that may be relevant to this event.
   * See http://hl7.org/fhir/StructureDefinition/workflow-supportingInfo
   * </pre>
   *
   * Protobuf type {@code google.fhir.r4.core.SupportingInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.fhir.r4.core.SupportingInfo)
      com.google.fhir.r4.core.SupportingInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.fhir.r4.core.Extensions.internal_static_google_fhir_r4_core_SupportingInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.fhir.r4.core.Extensions.internal_static_google_fhir_r4_core_SupportingInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.fhir.r4.core.SupportingInfo.class, com.google.fhir.r4.core.SupportingInfo.Builder.class);
    }

    // Construct using com.google.fhir.r4.core.SupportingInfo.newBuilder()
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
      if (valueReferenceBuilder_ == null) {
        valueReference_ = null;
      } else {
        valueReference_ = null;
        valueReferenceBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.fhir.r4.core.Extensions.internal_static_google_fhir_r4_core_SupportingInfo_descriptor;
    }

    @java.lang.Override
    public com.google.fhir.r4.core.SupportingInfo getDefaultInstanceForType() {
      return com.google.fhir.r4.core.SupportingInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.fhir.r4.core.SupportingInfo build() {
      com.google.fhir.r4.core.SupportingInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.fhir.r4.core.SupportingInfo buildPartial() {
      com.google.fhir.r4.core.SupportingInfo result = new com.google.fhir.r4.core.SupportingInfo(this);
      if (idBuilder_ == null) {
        result.id_ = id_;
      } else {
        result.id_ = idBuilder_.build();
      }
      if (valueReferenceBuilder_ == null) {
        result.valueReference_ = valueReference_;
      } else {
        result.valueReference_ = valueReferenceBuilder_.build();
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
      if (other instanceof com.google.fhir.r4.core.SupportingInfo) {
        return mergeFrom((com.google.fhir.r4.core.SupportingInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.fhir.r4.core.SupportingInfo other) {
      if (other == com.google.fhir.r4.core.SupportingInfo.getDefaultInstance()) return this;
      if (other.hasId()) {
        mergeId(other.getId());
      }
      if (other.hasValueReference()) {
        mergeValueReference(other.getValueReference());
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
      com.google.fhir.r4.core.SupportingInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.fhir.r4.core.SupportingInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.fhir.r4.core.String id_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.fhir.r4.core.String, com.google.fhir.r4.core.String.Builder, com.google.fhir.r4.core.StringOrBuilder> idBuilder_;
    /**
     * <pre>
     * Unique id for inter-element referencing
     * </pre>
     *
     * <code>.google.fhir.r4.core.String id = 1;</code>
     * @return Whether the id field is set.
     */
    public boolean hasId() {
      return idBuilder_ != null || id_ != null;
    }
    /**
     * <pre>
     * Unique id for inter-element referencing
     * </pre>
     *
     * <code>.google.fhir.r4.core.String id = 1;</code>
     * @return The id.
     */
    public com.google.fhir.r4.core.String getId() {
      if (idBuilder_ == null) {
        return id_ == null ? com.google.fhir.r4.core.String.getDefaultInstance() : id_;
      } else {
        return idBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Unique id for inter-element referencing
     * </pre>
     *
     * <code>.google.fhir.r4.core.String id = 1;</code>
     */
    public Builder setId(com.google.fhir.r4.core.String value) {
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
     * Unique id for inter-element referencing
     * </pre>
     *
     * <code>.google.fhir.r4.core.String id = 1;</code>
     */
    public Builder setId(
        com.google.fhir.r4.core.String.Builder builderForValue) {
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
     * Unique id for inter-element referencing
     * </pre>
     *
     * <code>.google.fhir.r4.core.String id = 1;</code>
     */
    public Builder mergeId(com.google.fhir.r4.core.String value) {
      if (idBuilder_ == null) {
        if (id_ != null) {
          id_ =
            com.google.fhir.r4.core.String.newBuilder(id_).mergeFrom(value).buildPartial();
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
     * Unique id for inter-element referencing
     * </pre>
     *
     * <code>.google.fhir.r4.core.String id = 1;</code>
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
     * Unique id for inter-element referencing
     * </pre>
     *
     * <code>.google.fhir.r4.core.String id = 1;</code>
     */
    public com.google.fhir.r4.core.String.Builder getIdBuilder() {
      
      onChanged();
      return getIdFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Unique id for inter-element referencing
     * </pre>
     *
     * <code>.google.fhir.r4.core.String id = 1;</code>
     */
    public com.google.fhir.r4.core.StringOrBuilder getIdOrBuilder() {
      if (idBuilder_ != null) {
        return idBuilder_.getMessageOrBuilder();
      } else {
        return id_ == null ?
            com.google.fhir.r4.core.String.getDefaultInstance() : id_;
      }
    }
    /**
     * <pre>
     * Unique id for inter-element referencing
     * </pre>
     *
     * <code>.google.fhir.r4.core.String id = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.fhir.r4.core.String, com.google.fhir.r4.core.String.Builder, com.google.fhir.r4.core.StringOrBuilder> 
        getIdFieldBuilder() {
      if (idBuilder_ == null) {
        idBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.fhir.r4.core.String, com.google.fhir.r4.core.String.Builder, com.google.fhir.r4.core.StringOrBuilder>(
                getId(),
                getParentForChildren(),
                isClean());
        id_ = null;
      }
      return idBuilder_;
    }

    private com.google.fhir.r4.core.Reference valueReference_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.fhir.r4.core.Reference, com.google.fhir.r4.core.Reference.Builder, com.google.fhir.r4.core.ReferenceOrBuilder> valueReferenceBuilder_;
    /**
     * <pre>
     * Value of extension
     * </pre>
     *
     * <code>.google.fhir.r4.core.Reference value_reference = 3 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR, (.google.fhir.proto.valid_reference_type) = "Resource"];</code>
     * @return Whether the valueReference field is set.
     */
    public boolean hasValueReference() {
      return valueReferenceBuilder_ != null || valueReference_ != null;
    }
    /**
     * <pre>
     * Value of extension
     * </pre>
     *
     * <code>.google.fhir.r4.core.Reference value_reference = 3 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR, (.google.fhir.proto.valid_reference_type) = "Resource"];</code>
     * @return The valueReference.
     */
    public com.google.fhir.r4.core.Reference getValueReference() {
      if (valueReferenceBuilder_ == null) {
        return valueReference_ == null ? com.google.fhir.r4.core.Reference.getDefaultInstance() : valueReference_;
      } else {
        return valueReferenceBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Value of extension
     * </pre>
     *
     * <code>.google.fhir.r4.core.Reference value_reference = 3 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR, (.google.fhir.proto.valid_reference_type) = "Resource"];</code>
     */
    public Builder setValueReference(com.google.fhir.r4.core.Reference value) {
      if (valueReferenceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        valueReference_ = value;
        onChanged();
      } else {
        valueReferenceBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Value of extension
     * </pre>
     *
     * <code>.google.fhir.r4.core.Reference value_reference = 3 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR, (.google.fhir.proto.valid_reference_type) = "Resource"];</code>
     */
    public Builder setValueReference(
        com.google.fhir.r4.core.Reference.Builder builderForValue) {
      if (valueReferenceBuilder_ == null) {
        valueReference_ = builderForValue.build();
        onChanged();
      } else {
        valueReferenceBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Value of extension
     * </pre>
     *
     * <code>.google.fhir.r4.core.Reference value_reference = 3 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR, (.google.fhir.proto.valid_reference_type) = "Resource"];</code>
     */
    public Builder mergeValueReference(com.google.fhir.r4.core.Reference value) {
      if (valueReferenceBuilder_ == null) {
        if (valueReference_ != null) {
          valueReference_ =
            com.google.fhir.r4.core.Reference.newBuilder(valueReference_).mergeFrom(value).buildPartial();
        } else {
          valueReference_ = value;
        }
        onChanged();
      } else {
        valueReferenceBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Value of extension
     * </pre>
     *
     * <code>.google.fhir.r4.core.Reference value_reference = 3 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR, (.google.fhir.proto.valid_reference_type) = "Resource"];</code>
     */
    public Builder clearValueReference() {
      if (valueReferenceBuilder_ == null) {
        valueReference_ = null;
        onChanged();
      } else {
        valueReference_ = null;
        valueReferenceBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Value of extension
     * </pre>
     *
     * <code>.google.fhir.r4.core.Reference value_reference = 3 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR, (.google.fhir.proto.valid_reference_type) = "Resource"];</code>
     */
    public com.google.fhir.r4.core.Reference.Builder getValueReferenceBuilder() {
      
      onChanged();
      return getValueReferenceFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Value of extension
     * </pre>
     *
     * <code>.google.fhir.r4.core.Reference value_reference = 3 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR, (.google.fhir.proto.valid_reference_type) = "Resource"];</code>
     */
    public com.google.fhir.r4.core.ReferenceOrBuilder getValueReferenceOrBuilder() {
      if (valueReferenceBuilder_ != null) {
        return valueReferenceBuilder_.getMessageOrBuilder();
      } else {
        return valueReference_ == null ?
            com.google.fhir.r4.core.Reference.getDefaultInstance() : valueReference_;
      }
    }
    /**
     * <pre>
     * Value of extension
     * </pre>
     *
     * <code>.google.fhir.r4.core.Reference value_reference = 3 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR, (.google.fhir.proto.valid_reference_type) = "Resource"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.fhir.r4.core.Reference, com.google.fhir.r4.core.Reference.Builder, com.google.fhir.r4.core.ReferenceOrBuilder> 
        getValueReferenceFieldBuilder() {
      if (valueReferenceBuilder_ == null) {
        valueReferenceBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.fhir.r4.core.Reference, com.google.fhir.r4.core.Reference.Builder, com.google.fhir.r4.core.ReferenceOrBuilder>(
                getValueReference(),
                getParentForChildren(),
                isClean());
        valueReference_ = null;
      }
      return valueReferenceBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.fhir.r4.core.SupportingInfo)
  }

  // @@protoc_insertion_point(class_scope:google.fhir.r4.core.SupportingInfo)
  private static final com.google.fhir.r4.core.SupportingInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.fhir.r4.core.SupportingInfo();
  }

  public static com.google.fhir.r4.core.SupportingInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SupportingInfo>
      PARSER = new com.google.protobuf.AbstractParser<SupportingInfo>() {
    @java.lang.Override
    public SupportingInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SupportingInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SupportingInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SupportingInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.fhir.r4.core.SupportingInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

