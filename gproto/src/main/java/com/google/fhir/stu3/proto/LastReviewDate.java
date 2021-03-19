// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/google/fhir/proto/stu3/extensions.proto

package com.google.fhir.stu3.proto;

/**
 * <pre>
 * Auto-generated from StructureDefinition for lastReviewDate.
 * Last review date for the resource.
 * See http://hl7.org/fhir/StructureDefinition/resource-lastReviewDate
 * </pre>
 *
 * Protobuf type {@code google.fhir.stu3.proto.LastReviewDate}
 */
public final class LastReviewDate extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.fhir.stu3.proto.LastReviewDate)
    LastReviewDateOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LastReviewDate.newBuilder() to construct.
  private LastReviewDate(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LastReviewDate() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new LastReviewDate();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private LastReviewDate(
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
            com.google.fhir.stu3.proto.Date.Builder subBuilder = null;
            if (valueDate_ != null) {
              subBuilder = valueDate_.toBuilder();
            }
            valueDate_ = input.readMessage(com.google.fhir.stu3.proto.Date.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(valueDate_);
              valueDate_ = subBuilder.buildPartial();
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
    return com.google.fhir.stu3.proto.Extensions.internal_static_google_fhir_stu3_proto_LastReviewDate_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.fhir.stu3.proto.Extensions.internal_static_google_fhir_stu3_proto_LastReviewDate_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.fhir.stu3.proto.LastReviewDate.class, com.google.fhir.stu3.proto.LastReviewDate.Builder.class);
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

  public static final int VALUE_DATE_FIELD_NUMBER = 3;
  private com.google.fhir.stu3.proto.Date valueDate_;
  /**
   * <pre>
   * Value of extension
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Date value_date = 3;</code>
   * @return Whether the valueDate field is set.
   */
  @java.lang.Override
  public boolean hasValueDate() {
    return valueDate_ != null;
  }
  /**
   * <pre>
   * Value of extension
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Date value_date = 3;</code>
   * @return The valueDate.
   */
  @java.lang.Override
  public com.google.fhir.stu3.proto.Date getValueDate() {
    return valueDate_ == null ? com.google.fhir.stu3.proto.Date.getDefaultInstance() : valueDate_;
  }
  /**
   * <pre>
   * Value of extension
   * </pre>
   *
   * <code>.google.fhir.stu3.proto.Date value_date = 3;</code>
   */
  @java.lang.Override
  public com.google.fhir.stu3.proto.DateOrBuilder getValueDateOrBuilder() {
    return getValueDate();
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
    if (valueDate_ != null) {
      output.writeMessage(3, getValueDate());
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
    if (valueDate_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getValueDate());
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
    if (!(obj instanceof com.google.fhir.stu3.proto.LastReviewDate)) {
      return super.equals(obj);
    }
    com.google.fhir.stu3.proto.LastReviewDate other = (com.google.fhir.stu3.proto.LastReviewDate) obj;

    if (hasId() != other.hasId()) return false;
    if (hasId()) {
      if (!getId()
          .equals(other.getId())) return false;
    }
    if (hasValueDate() != other.hasValueDate()) return false;
    if (hasValueDate()) {
      if (!getValueDate()
          .equals(other.getValueDate())) return false;
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
    if (hasValueDate()) {
      hash = (37 * hash) + VALUE_DATE_FIELD_NUMBER;
      hash = (53 * hash) + getValueDate().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.fhir.stu3.proto.LastReviewDate parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.fhir.stu3.proto.LastReviewDate parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.fhir.stu3.proto.LastReviewDate parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.fhir.stu3.proto.LastReviewDate parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.fhir.stu3.proto.LastReviewDate parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.fhir.stu3.proto.LastReviewDate parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.fhir.stu3.proto.LastReviewDate parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.fhir.stu3.proto.LastReviewDate parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.fhir.stu3.proto.LastReviewDate parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.fhir.stu3.proto.LastReviewDate parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.fhir.stu3.proto.LastReviewDate parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.fhir.stu3.proto.LastReviewDate parseFrom(
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
  public static Builder newBuilder(com.google.fhir.stu3.proto.LastReviewDate prototype) {
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
   * Auto-generated from StructureDefinition for lastReviewDate.
   * Last review date for the resource.
   * See http://hl7.org/fhir/StructureDefinition/resource-lastReviewDate
   * </pre>
   *
   * Protobuf type {@code google.fhir.stu3.proto.LastReviewDate}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.fhir.stu3.proto.LastReviewDate)
      com.google.fhir.stu3.proto.LastReviewDateOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.fhir.stu3.proto.Extensions.internal_static_google_fhir_stu3_proto_LastReviewDate_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.fhir.stu3.proto.Extensions.internal_static_google_fhir_stu3_proto_LastReviewDate_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.fhir.stu3.proto.LastReviewDate.class, com.google.fhir.stu3.proto.LastReviewDate.Builder.class);
    }

    // Construct using com.google.fhir.stu3.proto.LastReviewDate.newBuilder()
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
      if (valueDateBuilder_ == null) {
        valueDate_ = null;
      } else {
        valueDate_ = null;
        valueDateBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.fhir.stu3.proto.Extensions.internal_static_google_fhir_stu3_proto_LastReviewDate_descriptor;
    }

    @java.lang.Override
    public com.google.fhir.stu3.proto.LastReviewDate getDefaultInstanceForType() {
      return com.google.fhir.stu3.proto.LastReviewDate.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.fhir.stu3.proto.LastReviewDate build() {
      com.google.fhir.stu3.proto.LastReviewDate result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.fhir.stu3.proto.LastReviewDate buildPartial() {
      com.google.fhir.stu3.proto.LastReviewDate result = new com.google.fhir.stu3.proto.LastReviewDate(this);
      if (idBuilder_ == null) {
        result.id_ = id_;
      } else {
        result.id_ = idBuilder_.build();
      }
      if (valueDateBuilder_ == null) {
        result.valueDate_ = valueDate_;
      } else {
        result.valueDate_ = valueDateBuilder_.build();
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
      if (other instanceof com.google.fhir.stu3.proto.LastReviewDate) {
        return mergeFrom((com.google.fhir.stu3.proto.LastReviewDate)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.fhir.stu3.proto.LastReviewDate other) {
      if (other == com.google.fhir.stu3.proto.LastReviewDate.getDefaultInstance()) return this;
      if (other.hasId()) {
        mergeId(other.getId());
      }
      if (other.hasValueDate()) {
        mergeValueDate(other.getValueDate());
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
      com.google.fhir.stu3.proto.LastReviewDate parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.fhir.stu3.proto.LastReviewDate) e.getUnfinishedMessage();
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

    private com.google.fhir.stu3.proto.Date valueDate_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.fhir.stu3.proto.Date, com.google.fhir.stu3.proto.Date.Builder, com.google.fhir.stu3.proto.DateOrBuilder> valueDateBuilder_;
    /**
     * <pre>
     * Value of extension
     * </pre>
     *
     * <code>.google.fhir.stu3.proto.Date value_date = 3;</code>
     * @return Whether the valueDate field is set.
     */
    public boolean hasValueDate() {
      return valueDateBuilder_ != null || valueDate_ != null;
    }
    /**
     * <pre>
     * Value of extension
     * </pre>
     *
     * <code>.google.fhir.stu3.proto.Date value_date = 3;</code>
     * @return The valueDate.
     */
    public com.google.fhir.stu3.proto.Date getValueDate() {
      if (valueDateBuilder_ == null) {
        return valueDate_ == null ? com.google.fhir.stu3.proto.Date.getDefaultInstance() : valueDate_;
      } else {
        return valueDateBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Value of extension
     * </pre>
     *
     * <code>.google.fhir.stu3.proto.Date value_date = 3;</code>
     */
    public Builder setValueDate(com.google.fhir.stu3.proto.Date value) {
      if (valueDateBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        valueDate_ = value;
        onChanged();
      } else {
        valueDateBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Value of extension
     * </pre>
     *
     * <code>.google.fhir.stu3.proto.Date value_date = 3;</code>
     */
    public Builder setValueDate(
        com.google.fhir.stu3.proto.Date.Builder builderForValue) {
      if (valueDateBuilder_ == null) {
        valueDate_ = builderForValue.build();
        onChanged();
      } else {
        valueDateBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Value of extension
     * </pre>
     *
     * <code>.google.fhir.stu3.proto.Date value_date = 3;</code>
     */
    public Builder mergeValueDate(com.google.fhir.stu3.proto.Date value) {
      if (valueDateBuilder_ == null) {
        if (valueDate_ != null) {
          valueDate_ =
            com.google.fhir.stu3.proto.Date.newBuilder(valueDate_).mergeFrom(value).buildPartial();
        } else {
          valueDate_ = value;
        }
        onChanged();
      } else {
        valueDateBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Value of extension
     * </pre>
     *
     * <code>.google.fhir.stu3.proto.Date value_date = 3;</code>
     */
    public Builder clearValueDate() {
      if (valueDateBuilder_ == null) {
        valueDate_ = null;
        onChanged();
      } else {
        valueDate_ = null;
        valueDateBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Value of extension
     * </pre>
     *
     * <code>.google.fhir.stu3.proto.Date value_date = 3;</code>
     */
    public com.google.fhir.stu3.proto.Date.Builder getValueDateBuilder() {
      
      onChanged();
      return getValueDateFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Value of extension
     * </pre>
     *
     * <code>.google.fhir.stu3.proto.Date value_date = 3;</code>
     */
    public com.google.fhir.stu3.proto.DateOrBuilder getValueDateOrBuilder() {
      if (valueDateBuilder_ != null) {
        return valueDateBuilder_.getMessageOrBuilder();
      } else {
        return valueDate_ == null ?
            com.google.fhir.stu3.proto.Date.getDefaultInstance() : valueDate_;
      }
    }
    /**
     * <pre>
     * Value of extension
     * </pre>
     *
     * <code>.google.fhir.stu3.proto.Date value_date = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.fhir.stu3.proto.Date, com.google.fhir.stu3.proto.Date.Builder, com.google.fhir.stu3.proto.DateOrBuilder> 
        getValueDateFieldBuilder() {
      if (valueDateBuilder_ == null) {
        valueDateBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.fhir.stu3.proto.Date, com.google.fhir.stu3.proto.Date.Builder, com.google.fhir.stu3.proto.DateOrBuilder>(
                getValueDate(),
                getParentForChildren(),
                isClean());
        valueDate_ = null;
      }
      return valueDateBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.fhir.stu3.proto.LastReviewDate)
  }

  // @@protoc_insertion_point(class_scope:google.fhir.stu3.proto.LastReviewDate)
  private static final com.google.fhir.stu3.proto.LastReviewDate DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.fhir.stu3.proto.LastReviewDate();
  }

  public static com.google.fhir.stu3.proto.LastReviewDate getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LastReviewDate>
      PARSER = new com.google.protobuf.AbstractParser<LastReviewDate>() {
    @java.lang.Override
    public LastReviewDate parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new LastReviewDate(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<LastReviewDate> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LastReviewDate> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.fhir.stu3.proto.LastReviewDate getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

