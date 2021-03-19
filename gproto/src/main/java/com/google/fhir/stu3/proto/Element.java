// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/google/fhir/proto/stu3/metadatatypes.proto

package com.google.fhir.stu3.proto;

/**
 * <pre>
 * Auto-generated from StructureDefinition for Element, last updated
 * 2017-04-19T07:44:43.294+10:00. Base for all elements. See
 * http://hl7.org/fhir/StructureDefinition/Element
 * </pre>
 *
 * Protobuf type {@code google.fhir.stu3.proto.Element}
 */
public final class Element extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.fhir.stu3.proto.Element)
    ElementOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Element.newBuilder() to construct.
  private Element(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Element() {
    extension_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Element();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Element(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
          case 18: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              extension_ = new java.util.ArrayList<com.google.fhir.stu3.proto.Extension>();
              mutable_bitField0_ |= 0x00000001;
            }
            extension_.add(
                input.readMessage(com.google.fhir.stu3.proto.Extension.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        extension_ = java.util.Collections.unmodifiableList(extension_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.fhir.stu3.proto.Metadatatypes.internal_static_google_fhir_stu3_proto_Element_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.fhir.stu3.proto.Metadatatypes.internal_static_google_fhir_stu3_proto_Element_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.fhir.stu3.proto.Element.class, com.google.fhir.stu3.proto.Element.Builder.class);
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

  public static final int EXTENSION_FIELD_NUMBER = 2;
  private java.util.List<com.google.fhir.stu3.proto.Extension> extension_;
  /**
   * <pre>
   * Additional Content defined by implementations
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Extension extension = 2;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.fhir.stu3.proto.Extension> getExtensionList() {
    return extension_;
  }
  /**
   * <pre>
   * Additional Content defined by implementations
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Extension extension = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.fhir.stu3.proto.ExtensionOrBuilder> 
      getExtensionOrBuilderList() {
    return extension_;
  }
  /**
   * <pre>
   * Additional Content defined by implementations
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Extension extension = 2;</code>
   */
  @java.lang.Override
  public int getExtensionCount() {
    return extension_.size();
  }
  /**
   * <pre>
   * Additional Content defined by implementations
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Extension extension = 2;</code>
   */
  @java.lang.Override
  public com.google.fhir.stu3.proto.Extension getExtension(int index) {
    return extension_.get(index);
  }
  /**
   * <pre>
   * Additional Content defined by implementations
   * </pre>
   *
   * <code>repeated .google.fhir.stu3.proto.Extension extension = 2;</code>
   */
  @java.lang.Override
  public com.google.fhir.stu3.proto.ExtensionOrBuilder getExtensionOrBuilder(
      int index) {
    return extension_.get(index);
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
    for (int i = 0; i < extension_.size(); i++) {
      output.writeMessage(2, extension_.get(i));
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
    for (int i = 0; i < extension_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, extension_.get(i));
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
    if (!(obj instanceof com.google.fhir.stu3.proto.Element)) {
      return super.equals(obj);
    }
    com.google.fhir.stu3.proto.Element other = (com.google.fhir.stu3.proto.Element) obj;

    if (hasId() != other.hasId()) return false;
    if (hasId()) {
      if (!getId()
          .equals(other.getId())) return false;
    }
    if (!getExtensionList()
        .equals(other.getExtensionList())) return false;
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
    if (getExtensionCount() > 0) {
      hash = (37 * hash) + EXTENSION_FIELD_NUMBER;
      hash = (53 * hash) + getExtensionList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.fhir.stu3.proto.Element parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.fhir.stu3.proto.Element parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.fhir.stu3.proto.Element parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.fhir.stu3.proto.Element parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.fhir.stu3.proto.Element parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.fhir.stu3.proto.Element parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.fhir.stu3.proto.Element parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.fhir.stu3.proto.Element parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.fhir.stu3.proto.Element parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.fhir.stu3.proto.Element parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.fhir.stu3.proto.Element parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.fhir.stu3.proto.Element parseFrom(
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
  public static Builder newBuilder(com.google.fhir.stu3.proto.Element prototype) {
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
   * Auto-generated from StructureDefinition for Element, last updated
   * 2017-04-19T07:44:43.294+10:00. Base for all elements. See
   * http://hl7.org/fhir/StructureDefinition/Element
   * </pre>
   *
   * Protobuf type {@code google.fhir.stu3.proto.Element}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.fhir.stu3.proto.Element)
      com.google.fhir.stu3.proto.ElementOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.fhir.stu3.proto.Metadatatypes.internal_static_google_fhir_stu3_proto_Element_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.fhir.stu3.proto.Metadatatypes.internal_static_google_fhir_stu3_proto_Element_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.fhir.stu3.proto.Element.class, com.google.fhir.stu3.proto.Element.Builder.class);
    }

    // Construct using com.google.fhir.stu3.proto.Element.newBuilder()
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
        getExtensionFieldBuilder();
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
      if (extensionBuilder_ == null) {
        extension_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        extensionBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.fhir.stu3.proto.Metadatatypes.internal_static_google_fhir_stu3_proto_Element_descriptor;
    }

    @java.lang.Override
    public com.google.fhir.stu3.proto.Element getDefaultInstanceForType() {
      return com.google.fhir.stu3.proto.Element.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.fhir.stu3.proto.Element build() {
      com.google.fhir.stu3.proto.Element result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.fhir.stu3.proto.Element buildPartial() {
      com.google.fhir.stu3.proto.Element result = new com.google.fhir.stu3.proto.Element(this);
      int from_bitField0_ = bitField0_;
      if (idBuilder_ == null) {
        result.id_ = id_;
      } else {
        result.id_ = idBuilder_.build();
      }
      if (extensionBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          extension_ = java.util.Collections.unmodifiableList(extension_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.extension_ = extension_;
      } else {
        result.extension_ = extensionBuilder_.build();
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
      if (other instanceof com.google.fhir.stu3.proto.Element) {
        return mergeFrom((com.google.fhir.stu3.proto.Element)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.fhir.stu3.proto.Element other) {
      if (other == com.google.fhir.stu3.proto.Element.getDefaultInstance()) return this;
      if (other.hasId()) {
        mergeId(other.getId());
      }
      if (extensionBuilder_ == null) {
        if (!other.extension_.isEmpty()) {
          if (extension_.isEmpty()) {
            extension_ = other.extension_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureExtensionIsMutable();
            extension_.addAll(other.extension_);
          }
          onChanged();
        }
      } else {
        if (!other.extension_.isEmpty()) {
          if (extensionBuilder_.isEmpty()) {
            extensionBuilder_.dispose();
            extensionBuilder_ = null;
            extension_ = other.extension_;
            bitField0_ = (bitField0_ & ~0x00000001);
            extensionBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getExtensionFieldBuilder() : null;
          } else {
            extensionBuilder_.addAllMessages(other.extension_);
          }
        }
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
      com.google.fhir.stu3.proto.Element parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.fhir.stu3.proto.Element) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

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

    private java.util.List<com.google.fhir.stu3.proto.Extension> extension_ =
      java.util.Collections.emptyList();
    private void ensureExtensionIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        extension_ = new java.util.ArrayList<com.google.fhir.stu3.proto.Extension>(extension_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.fhir.stu3.proto.Extension, com.google.fhir.stu3.proto.Extension.Builder, com.google.fhir.stu3.proto.ExtensionOrBuilder> extensionBuilder_;

    /**
     * <pre>
     * Additional Content defined by implementations
     * </pre>
     *
     * <code>repeated .google.fhir.stu3.proto.Extension extension = 2;</code>
     */
    public java.util.List<com.google.fhir.stu3.proto.Extension> getExtensionList() {
      if (extensionBuilder_ == null) {
        return java.util.Collections.unmodifiableList(extension_);
      } else {
        return extensionBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * Additional Content defined by implementations
     * </pre>
     *
     * <code>repeated .google.fhir.stu3.proto.Extension extension = 2;</code>
     */
    public int getExtensionCount() {
      if (extensionBuilder_ == null) {
        return extension_.size();
      } else {
        return extensionBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * Additional Content defined by implementations
     * </pre>
     *
     * <code>repeated .google.fhir.stu3.proto.Extension extension = 2;</code>
     */
    public com.google.fhir.stu3.proto.Extension getExtension(int index) {
      if (extensionBuilder_ == null) {
        return extension_.get(index);
      } else {
        return extensionBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * Additional Content defined by implementations
     * </pre>
     *
     * <code>repeated .google.fhir.stu3.proto.Extension extension = 2;</code>
     */
    public Builder setExtension(
        int index, com.google.fhir.stu3.proto.Extension value) {
      if (extensionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureExtensionIsMutable();
        extension_.set(index, value);
        onChanged();
      } else {
        extensionBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Additional Content defined by implementations
     * </pre>
     *
     * <code>repeated .google.fhir.stu3.proto.Extension extension = 2;</code>
     */
    public Builder setExtension(
        int index, com.google.fhir.stu3.proto.Extension.Builder builderForValue) {
      if (extensionBuilder_ == null) {
        ensureExtensionIsMutable();
        extension_.set(index, builderForValue.build());
        onChanged();
      } else {
        extensionBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Additional Content defined by implementations
     * </pre>
     *
     * <code>repeated .google.fhir.stu3.proto.Extension extension = 2;</code>
     */
    public Builder addExtension(com.google.fhir.stu3.proto.Extension value) {
      if (extensionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureExtensionIsMutable();
        extension_.add(value);
        onChanged();
      } else {
        extensionBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * Additional Content defined by implementations
     * </pre>
     *
     * <code>repeated .google.fhir.stu3.proto.Extension extension = 2;</code>
     */
    public Builder addExtension(
        int index, com.google.fhir.stu3.proto.Extension value) {
      if (extensionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureExtensionIsMutable();
        extension_.add(index, value);
        onChanged();
      } else {
        extensionBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Additional Content defined by implementations
     * </pre>
     *
     * <code>repeated .google.fhir.stu3.proto.Extension extension = 2;</code>
     */
    public Builder addExtension(
        com.google.fhir.stu3.proto.Extension.Builder builderForValue) {
      if (extensionBuilder_ == null) {
        ensureExtensionIsMutable();
        extension_.add(builderForValue.build());
        onChanged();
      } else {
        extensionBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Additional Content defined by implementations
     * </pre>
     *
     * <code>repeated .google.fhir.stu3.proto.Extension extension = 2;</code>
     */
    public Builder addExtension(
        int index, com.google.fhir.stu3.proto.Extension.Builder builderForValue) {
      if (extensionBuilder_ == null) {
        ensureExtensionIsMutable();
        extension_.add(index, builderForValue.build());
        onChanged();
      } else {
        extensionBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Additional Content defined by implementations
     * </pre>
     *
     * <code>repeated .google.fhir.stu3.proto.Extension extension = 2;</code>
     */
    public Builder addAllExtension(
        java.lang.Iterable<? extends com.google.fhir.stu3.proto.Extension> values) {
      if (extensionBuilder_ == null) {
        ensureExtensionIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, extension_);
        onChanged();
      } else {
        extensionBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * Additional Content defined by implementations
     * </pre>
     *
     * <code>repeated .google.fhir.stu3.proto.Extension extension = 2;</code>
     */
    public Builder clearExtension() {
      if (extensionBuilder_ == null) {
        extension_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        extensionBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Additional Content defined by implementations
     * </pre>
     *
     * <code>repeated .google.fhir.stu3.proto.Extension extension = 2;</code>
     */
    public Builder removeExtension(int index) {
      if (extensionBuilder_ == null) {
        ensureExtensionIsMutable();
        extension_.remove(index);
        onChanged();
      } else {
        extensionBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * Additional Content defined by implementations
     * </pre>
     *
     * <code>repeated .google.fhir.stu3.proto.Extension extension = 2;</code>
     */
    public com.google.fhir.stu3.proto.Extension.Builder getExtensionBuilder(
        int index) {
      return getExtensionFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * Additional Content defined by implementations
     * </pre>
     *
     * <code>repeated .google.fhir.stu3.proto.Extension extension = 2;</code>
     */
    public com.google.fhir.stu3.proto.ExtensionOrBuilder getExtensionOrBuilder(
        int index) {
      if (extensionBuilder_ == null) {
        return extension_.get(index);  } else {
        return extensionBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * Additional Content defined by implementations
     * </pre>
     *
     * <code>repeated .google.fhir.stu3.proto.Extension extension = 2;</code>
     */
    public java.util.List<? extends com.google.fhir.stu3.proto.ExtensionOrBuilder> 
         getExtensionOrBuilderList() {
      if (extensionBuilder_ != null) {
        return extensionBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(extension_);
      }
    }
    /**
     * <pre>
     * Additional Content defined by implementations
     * </pre>
     *
     * <code>repeated .google.fhir.stu3.proto.Extension extension = 2;</code>
     */
    public com.google.fhir.stu3.proto.Extension.Builder addExtensionBuilder() {
      return getExtensionFieldBuilder().addBuilder(
          com.google.fhir.stu3.proto.Extension.getDefaultInstance());
    }
    /**
     * <pre>
     * Additional Content defined by implementations
     * </pre>
     *
     * <code>repeated .google.fhir.stu3.proto.Extension extension = 2;</code>
     */
    public com.google.fhir.stu3.proto.Extension.Builder addExtensionBuilder(
        int index) {
      return getExtensionFieldBuilder().addBuilder(
          index, com.google.fhir.stu3.proto.Extension.getDefaultInstance());
    }
    /**
     * <pre>
     * Additional Content defined by implementations
     * </pre>
     *
     * <code>repeated .google.fhir.stu3.proto.Extension extension = 2;</code>
     */
    public java.util.List<com.google.fhir.stu3.proto.Extension.Builder> 
         getExtensionBuilderList() {
      return getExtensionFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.fhir.stu3.proto.Extension, com.google.fhir.stu3.proto.Extension.Builder, com.google.fhir.stu3.proto.ExtensionOrBuilder> 
        getExtensionFieldBuilder() {
      if (extensionBuilder_ == null) {
        extensionBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.fhir.stu3.proto.Extension, com.google.fhir.stu3.proto.Extension.Builder, com.google.fhir.stu3.proto.ExtensionOrBuilder>(
                extension_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        extension_ = null;
      }
      return extensionBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.fhir.stu3.proto.Element)
  }

  // @@protoc_insertion_point(class_scope:google.fhir.stu3.proto.Element)
  private static final com.google.fhir.stu3.proto.Element DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.fhir.stu3.proto.Element();
  }

  public static com.google.fhir.stu3.proto.Element getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Element>
      PARSER = new com.google.protobuf.AbstractParser<Element>() {
    @java.lang.Override
    public Element parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Element(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Element> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Element> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.fhir.stu3.proto.Element getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

