// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/google/fhir/proto/stu3/extensions.proto

package com.google.fhir.stu3.proto;

/**
 * <pre>
 * Auto-generated from StructureDefinition for EN-qualifier.
 * LS | AC | NB | PR | HON | BR | AD | SP | MID | CL | IN | VV.
 * See http://hl7.org/fhir/StructureDefinition/iso21090-EN-qualifier
 * </pre>
 *
 * Protobuf type {@code google.fhir.stu3.proto.HumanNameENQualifier}
 */
public final class HumanNameENQualifier extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.fhir.stu3.proto.HumanNameENQualifier)
    HumanNameENQualifierOrBuilder {
private static final long serialVersionUID = 0L;
  // Use HumanNameENQualifier.newBuilder() to construct.
  private HumanNameENQualifier(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private HumanNameENQualifier() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new HumanNameENQualifier();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private HumanNameENQualifier(
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
            com.google.fhir.stu3.proto.EntityNamePartQualifierCode.Builder subBuilder = null;
            if (valueCode_ != null) {
              subBuilder = valueCode_.toBuilder();
            }
            valueCode_ = input.readMessage(com.google.fhir.stu3.proto.EntityNamePartQualifierCode.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(valueCode_);
              valueCode_ = subBuilder.buildPartial();
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
    return com.google.fhir.stu3.proto.Extensions.internal_static_google_fhir_stu3_proto_HumanNameENQualifier_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.fhir.stu3.proto.Extensions.internal_static_google_fhir_stu3_proto_HumanNameENQualifier_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.fhir.stu3.proto.HumanNameENQualifier.class, com.google.fhir.stu3.proto.HumanNameENQualifier.Builder.class);
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

  public static final int VALUE_CODE_FIELD_NUMBER = 3;
  private com.google.fhir.stu3.proto.EntityNamePartQualifierCode valueCode_;
  /**
   * <pre>
   * Value of extension
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.EntityNamePartQualifierCode value_code = 3;</code>
   * @return Whether the valueCode field is set.
   */
  @java.lang.Override
  public boolean hasValueCode() {
    return valueCode_ != null;
  }
  /**
   * <pre>
   * Value of extension
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.EntityNamePartQualifierCode value_code = 3;</code>
   * @return The valueCode.
   */
  @java.lang.Override
  public com.google.fhir.stu3.proto.EntityNamePartQualifierCode getValueCode() {
    return valueCode_ == null ? com.google.fhir.stu3.proto.EntityNamePartQualifierCode.getDefaultInstance() : valueCode_;
  }
  /**
   * <pre>
   * Value of extension
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.EntityNamePartQualifierCode value_code = 3;</code>
   */
  @java.lang.Override
  public com.google.fhir.stu3.proto.EntityNamePartQualifierCodeOrBuilder getValueCodeOrBuilder() {
    return getValueCode();
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
    if (valueCode_ != null) {
      output.writeMessage(3, getValueCode());
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
    if (valueCode_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getValueCode());
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
    if (!(obj instanceof com.google.fhir.stu3.proto.HumanNameENQualifier)) {
      return super.equals(obj);
    }
    com.google.fhir.stu3.proto.HumanNameENQualifier other = (com.google.fhir.stu3.proto.HumanNameENQualifier) obj;

    if (hasId() != other.hasId()) return false;
    if (hasId()) {
      if (!getId()
          .equals(other.getId())) return false;
    }
    if (hasValueCode() != other.hasValueCode()) return false;
    if (hasValueCode()) {
      if (!getValueCode()
          .equals(other.getValueCode())) return false;
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
    if (hasValueCode()) {
      hash = (37 * hash) + VALUE_CODE_FIELD_NUMBER;
      hash = (53 * hash) + getValueCode().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.fhir.stu3.proto.HumanNameENQualifier parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.fhir.stu3.proto.HumanNameENQualifier parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.fhir.stu3.proto.HumanNameENQualifier parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.fhir.stu3.proto.HumanNameENQualifier parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.fhir.stu3.proto.HumanNameENQualifier parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.fhir.stu3.proto.HumanNameENQualifier parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.fhir.stu3.proto.HumanNameENQualifier parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.fhir.stu3.proto.HumanNameENQualifier parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.fhir.stu3.proto.HumanNameENQualifier parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.fhir.stu3.proto.HumanNameENQualifier parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.fhir.stu3.proto.HumanNameENQualifier parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.fhir.stu3.proto.HumanNameENQualifier parseFrom(
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
  public static Builder newBuilder(com.google.fhir.stu3.proto.HumanNameENQualifier prototype) {
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
   * Auto-generated from StructureDefinition for EN-qualifier.
   * LS | AC | NB | PR | HON | BR | AD | SP | MID | CL | IN | VV.
   * See http://hl7.org/fhir/StructureDefinition/iso21090-EN-qualifier
   * </pre>
   *
   * Protobuf type {@code google.fhir.stu3.proto.HumanNameENQualifier}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.fhir.stu3.proto.HumanNameENQualifier)
      com.google.fhir.stu3.proto.HumanNameENQualifierOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.fhir.stu3.proto.Extensions.internal_static_google_fhir_stu3_proto_HumanNameENQualifier_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.fhir.stu3.proto.Extensions.internal_static_google_fhir_stu3_proto_HumanNameENQualifier_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.fhir.stu3.proto.HumanNameENQualifier.class, com.google.fhir.stu3.proto.HumanNameENQualifier.Builder.class);
    }

    // Construct using com.google.fhir.stu3.proto.HumanNameENQualifier.newBuilder()
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
      if (valueCodeBuilder_ == null) {
        valueCode_ = null;
      } else {
        valueCode_ = null;
        valueCodeBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.fhir.stu3.proto.Extensions.internal_static_google_fhir_stu3_proto_HumanNameENQualifier_descriptor;
    }

    @java.lang.Override
    public com.google.fhir.stu3.proto.HumanNameENQualifier getDefaultInstanceForType() {
      return com.google.fhir.stu3.proto.HumanNameENQualifier.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.fhir.stu3.proto.HumanNameENQualifier build() {
      com.google.fhir.stu3.proto.HumanNameENQualifier result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.fhir.stu3.proto.HumanNameENQualifier buildPartial() {
      com.google.fhir.stu3.proto.HumanNameENQualifier result = new com.google.fhir.stu3.proto.HumanNameENQualifier(this);
      if (idBuilder_ == null) {
        result.id_ = id_;
      } else {
        result.id_ = idBuilder_.build();
      }
      if (valueCodeBuilder_ == null) {
        result.valueCode_ = valueCode_;
      } else {
        result.valueCode_ = valueCodeBuilder_.build();
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
      if (other instanceof com.google.fhir.stu3.proto.HumanNameENQualifier) {
        return mergeFrom((com.google.fhir.stu3.proto.HumanNameENQualifier)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.fhir.stu3.proto.HumanNameENQualifier other) {
      if (other == com.google.fhir.stu3.proto.HumanNameENQualifier.getDefaultInstance()) return this;
      if (other.hasId()) {
        mergeId(other.getId());
      }
      if (other.hasValueCode()) {
        mergeValueCode(other.getValueCode());
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
      com.google.fhir.stu3.proto.HumanNameENQualifier parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.fhir.stu3.proto.HumanNameENQualifier) e.getUnfinishedMessage();
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

    private com.google.fhir.stu3.proto.EntityNamePartQualifierCode valueCode_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.fhir.stu3.proto.EntityNamePartQualifierCode, com.google.fhir.stu3.proto.EntityNamePartQualifierCode.Builder, com.google.fhir.stu3.proto.EntityNamePartQualifierCodeOrBuilder> valueCodeBuilder_;
    /**
     * <pre>
     * Value of extension
     * </pre>
     *
     * <code>.google.fhir.stu3.proto.EntityNamePartQualifierCode value_code = 3;</code>
     * @return Whether the valueCode field is set.
     */
    public boolean hasValueCode() {
      return valueCodeBuilder_ != null || valueCode_ != null;
    }
    /**
     * <pre>
     * Value of extension
     * </pre>
     *
     * <code>.google.fhir.stu3.proto.EntityNamePartQualifierCode value_code = 3;</code>
     * @return The valueCode.
     */
    public com.google.fhir.stu3.proto.EntityNamePartQualifierCode getValueCode() {
      if (valueCodeBuilder_ == null) {
        return valueCode_ == null ? com.google.fhir.stu3.proto.EntityNamePartQualifierCode.getDefaultInstance() : valueCode_;
      } else {
        return valueCodeBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Value of extension
     * </pre>
     *
     * <code>.google.fhir.stu3.proto.EntityNamePartQualifierCode value_code = 3;</code>
     */
    public Builder setValueCode(com.google.fhir.stu3.proto.EntityNamePartQualifierCode value) {
      if (valueCodeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        valueCode_ = value;
        onChanged();
      } else {
        valueCodeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Value of extension
     * </pre>
     *
     * <code>.google.fhir.stu3.proto.EntityNamePartQualifierCode value_code = 3;</code>
     */
    public Builder setValueCode(
        com.google.fhir.stu3.proto.EntityNamePartQualifierCode.Builder builderForValue) {
      if (valueCodeBuilder_ == null) {
        valueCode_ = builderForValue.build();
        onChanged();
      } else {
        valueCodeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Value of extension
     * </pre>
     *
     * <code>.google.fhir.stu3.proto.EntityNamePartQualifierCode value_code = 3;</code>
     */
    public Builder mergeValueCode(com.google.fhir.stu3.proto.EntityNamePartQualifierCode value) {
      if (valueCodeBuilder_ == null) {
        if (valueCode_ != null) {
          valueCode_ =
            com.google.fhir.stu3.proto.EntityNamePartQualifierCode.newBuilder(valueCode_).mergeFrom(value).buildPartial();
        } else {
          valueCode_ = value;
        }
        onChanged();
      } else {
        valueCodeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Value of extension
     * </pre>
     *
     * <code>.google.fhir.stu3.proto.EntityNamePartQualifierCode value_code = 3;</code>
     */
    public Builder clearValueCode() {
      if (valueCodeBuilder_ == null) {
        valueCode_ = null;
        onChanged();
      } else {
        valueCode_ = null;
        valueCodeBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Value of extension
     * </pre>
     *
     * <code>.google.fhir.stu3.proto.EntityNamePartQualifierCode value_code = 3;</code>
     */
    public com.google.fhir.stu3.proto.EntityNamePartQualifierCode.Builder getValueCodeBuilder() {
      
      onChanged();
      return getValueCodeFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Value of extension
     * </pre>
     *
     * <code>.google.fhir.stu3.proto.EntityNamePartQualifierCode value_code = 3;</code>
     */
    public com.google.fhir.stu3.proto.EntityNamePartQualifierCodeOrBuilder getValueCodeOrBuilder() {
      if (valueCodeBuilder_ != null) {
        return valueCodeBuilder_.getMessageOrBuilder();
      } else {
        return valueCode_ == null ?
            com.google.fhir.stu3.proto.EntityNamePartQualifierCode.getDefaultInstance() : valueCode_;
      }
    }
    /**
     * <pre>
     * Value of extension
     * </pre>
     *
     * <code>.google.fhir.stu3.proto.EntityNamePartQualifierCode value_code = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.fhir.stu3.proto.EntityNamePartQualifierCode, com.google.fhir.stu3.proto.EntityNamePartQualifierCode.Builder, com.google.fhir.stu3.proto.EntityNamePartQualifierCodeOrBuilder> 
        getValueCodeFieldBuilder() {
      if (valueCodeBuilder_ == null) {
        valueCodeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.fhir.stu3.proto.EntityNamePartQualifierCode, com.google.fhir.stu3.proto.EntityNamePartQualifierCode.Builder, com.google.fhir.stu3.proto.EntityNamePartQualifierCodeOrBuilder>(
                getValueCode(),
                getParentForChildren(),
                isClean());
        valueCode_ = null;
      }
      return valueCodeBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.fhir.stu3.proto.HumanNameENQualifier)
  }

  // @@protoc_insertion_point(class_scope:google.fhir.stu3.proto.HumanNameENQualifier)
  private static final com.google.fhir.stu3.proto.HumanNameENQualifier DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.fhir.stu3.proto.HumanNameENQualifier();
  }

  public static com.google.fhir.stu3.proto.HumanNameENQualifier getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HumanNameENQualifier>
      PARSER = new com.google.protobuf.AbstractParser<HumanNameENQualifier>() {
    @java.lang.Override
    public HumanNameENQualifier parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new HumanNameENQualifier(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<HumanNameENQualifier> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HumanNameENQualifier> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.fhir.stu3.proto.HumanNameENQualifier getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

