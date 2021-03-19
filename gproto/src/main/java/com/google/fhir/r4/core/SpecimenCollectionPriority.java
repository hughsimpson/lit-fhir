// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/google/fhir/proto/r4/core/extensions.proto

package com.google.fhir.r4.core;

/**
 * <pre>
 * Auto-generated from StructureDefinition for collectionPriority.
 * Urgency for collection.
 * See http://hl7.org/fhir/StructureDefinition/specimen-collectionPriority
 * </pre>
 *
 * Protobuf type {@code google.fhir.r4.core.SpecimenCollectionPriority}
 */
public final class SpecimenCollectionPriority extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.fhir.r4.core.SpecimenCollectionPriority)
    SpecimenCollectionPriorityOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SpecimenCollectionPriority.newBuilder() to construct.
  private SpecimenCollectionPriority(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SpecimenCollectionPriority() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SpecimenCollectionPriority();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SpecimenCollectionPriority(
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
            com.google.fhir.r4.core.CodeableConcept.Builder subBuilder = null;
            if (valueCodeableConcept_ != null) {
              subBuilder = valueCodeableConcept_.toBuilder();
            }
            valueCodeableConcept_ = input.readMessage(com.google.fhir.r4.core.CodeableConcept.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(valueCodeableConcept_);
              valueCodeableConcept_ = subBuilder.buildPartial();
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
    return com.google.fhir.r4.core.Extensions.internal_static_google_fhir_r4_core_SpecimenCollectionPriority_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.fhir.r4.core.Extensions.internal_static_google_fhir_r4_core_SpecimenCollectionPriority_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.fhir.r4.core.SpecimenCollectionPriority.class, com.google.fhir.r4.core.SpecimenCollectionPriority.Builder.class);
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

  public static final int VALUE_CODEABLE_CONCEPT_FIELD_NUMBER = 3;
  private com.google.fhir.r4.core.CodeableConcept valueCodeableConcept_;
  /**
   * <pre>
   * Value of extension
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept value_codeable_concept = 3 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   * @return Whether the valueCodeableConcept field is set.
   */
  @java.lang.Override
  public boolean hasValueCodeableConcept() {
    return valueCodeableConcept_ != null;
  }
  /**
   * <pre>
   * Value of extension
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept value_codeable_concept = 3 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   * @return The valueCodeableConcept.
   */
  @java.lang.Override
  public com.google.fhir.r4.core.CodeableConcept getValueCodeableConcept() {
    return valueCodeableConcept_ == null ? com.google.fhir.r4.core.CodeableConcept.getDefaultInstance() : valueCodeableConcept_;
  }
  /**
   * <pre>
   * Value of extension
   * </pre>
   *
   * <code>.google.fhir.r4.core.CodeableConcept value_codeable_concept = 3 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
   */
  @java.lang.Override
  public com.google.fhir.r4.core.CodeableConceptOrBuilder getValueCodeableConceptOrBuilder() {
    return getValueCodeableConcept();
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
    if (valueCodeableConcept_ != null) {
      output.writeMessage(3, getValueCodeableConcept());
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
    if (valueCodeableConcept_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getValueCodeableConcept());
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
    if (!(obj instanceof com.google.fhir.r4.core.SpecimenCollectionPriority)) {
      return super.equals(obj);
    }
    com.google.fhir.r4.core.SpecimenCollectionPriority other = (com.google.fhir.r4.core.SpecimenCollectionPriority) obj;

    if (hasId() != other.hasId()) return false;
    if (hasId()) {
      if (!getId()
          .equals(other.getId())) return false;
    }
    if (hasValueCodeableConcept() != other.hasValueCodeableConcept()) return false;
    if (hasValueCodeableConcept()) {
      if (!getValueCodeableConcept()
          .equals(other.getValueCodeableConcept())) return false;
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
    if (hasValueCodeableConcept()) {
      hash = (37 * hash) + VALUE_CODEABLE_CONCEPT_FIELD_NUMBER;
      hash = (53 * hash) + getValueCodeableConcept().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.fhir.r4.core.SpecimenCollectionPriority parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.fhir.r4.core.SpecimenCollectionPriority parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.fhir.r4.core.SpecimenCollectionPriority parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.fhir.r4.core.SpecimenCollectionPriority parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.fhir.r4.core.SpecimenCollectionPriority parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.fhir.r4.core.SpecimenCollectionPriority parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.fhir.r4.core.SpecimenCollectionPriority parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.fhir.r4.core.SpecimenCollectionPriority parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.fhir.r4.core.SpecimenCollectionPriority parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.fhir.r4.core.SpecimenCollectionPriority parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.fhir.r4.core.SpecimenCollectionPriority parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.fhir.r4.core.SpecimenCollectionPriority parseFrom(
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
  public static Builder newBuilder(com.google.fhir.r4.core.SpecimenCollectionPriority prototype) {
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
   * Auto-generated from StructureDefinition for collectionPriority.
   * Urgency for collection.
   * See http://hl7.org/fhir/StructureDefinition/specimen-collectionPriority
   * </pre>
   *
   * Protobuf type {@code google.fhir.r4.core.SpecimenCollectionPriority}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.fhir.r4.core.SpecimenCollectionPriority)
      com.google.fhir.r4.core.SpecimenCollectionPriorityOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.fhir.r4.core.Extensions.internal_static_google_fhir_r4_core_SpecimenCollectionPriority_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.fhir.r4.core.Extensions.internal_static_google_fhir_r4_core_SpecimenCollectionPriority_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.fhir.r4.core.SpecimenCollectionPriority.class, com.google.fhir.r4.core.SpecimenCollectionPriority.Builder.class);
    }

    // Construct using com.google.fhir.r4.core.SpecimenCollectionPriority.newBuilder()
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
      if (valueCodeableConceptBuilder_ == null) {
        valueCodeableConcept_ = null;
      } else {
        valueCodeableConcept_ = null;
        valueCodeableConceptBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.fhir.r4.core.Extensions.internal_static_google_fhir_r4_core_SpecimenCollectionPriority_descriptor;
    }

    @java.lang.Override
    public com.google.fhir.r4.core.SpecimenCollectionPriority getDefaultInstanceForType() {
      return com.google.fhir.r4.core.SpecimenCollectionPriority.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.fhir.r4.core.SpecimenCollectionPriority build() {
      com.google.fhir.r4.core.SpecimenCollectionPriority result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.fhir.r4.core.SpecimenCollectionPriority buildPartial() {
      com.google.fhir.r4.core.SpecimenCollectionPriority result = new com.google.fhir.r4.core.SpecimenCollectionPriority(this);
      if (idBuilder_ == null) {
        result.id_ = id_;
      } else {
        result.id_ = idBuilder_.build();
      }
      if (valueCodeableConceptBuilder_ == null) {
        result.valueCodeableConcept_ = valueCodeableConcept_;
      } else {
        result.valueCodeableConcept_ = valueCodeableConceptBuilder_.build();
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
      if (other instanceof com.google.fhir.r4.core.SpecimenCollectionPriority) {
        return mergeFrom((com.google.fhir.r4.core.SpecimenCollectionPriority)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.fhir.r4.core.SpecimenCollectionPriority other) {
      if (other == com.google.fhir.r4.core.SpecimenCollectionPriority.getDefaultInstance()) return this;
      if (other.hasId()) {
        mergeId(other.getId());
      }
      if (other.hasValueCodeableConcept()) {
        mergeValueCodeableConcept(other.getValueCodeableConcept());
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
      com.google.fhir.r4.core.SpecimenCollectionPriority parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.fhir.r4.core.SpecimenCollectionPriority) e.getUnfinishedMessage();
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

    private com.google.fhir.r4.core.CodeableConcept valueCodeableConcept_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.fhir.r4.core.CodeableConcept, com.google.fhir.r4.core.CodeableConcept.Builder, com.google.fhir.r4.core.CodeableConceptOrBuilder> valueCodeableConceptBuilder_;
    /**
     * <pre>
     * Value of extension
     * </pre>
     *
     * <code>.google.fhir.r4.core.CodeableConcept value_codeable_concept = 3 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
     * @return Whether the valueCodeableConcept field is set.
     */
    public boolean hasValueCodeableConcept() {
      return valueCodeableConceptBuilder_ != null || valueCodeableConcept_ != null;
    }
    /**
     * <pre>
     * Value of extension
     * </pre>
     *
     * <code>.google.fhir.r4.core.CodeableConcept value_codeable_concept = 3 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
     * @return The valueCodeableConcept.
     */
    public com.google.fhir.r4.core.CodeableConcept getValueCodeableConcept() {
      if (valueCodeableConceptBuilder_ == null) {
        return valueCodeableConcept_ == null ? com.google.fhir.r4.core.CodeableConcept.getDefaultInstance() : valueCodeableConcept_;
      } else {
        return valueCodeableConceptBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Value of extension
     * </pre>
     *
     * <code>.google.fhir.r4.core.CodeableConcept value_codeable_concept = 3 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
     */
    public Builder setValueCodeableConcept(com.google.fhir.r4.core.CodeableConcept value) {
      if (valueCodeableConceptBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        valueCodeableConcept_ = value;
        onChanged();
      } else {
        valueCodeableConceptBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Value of extension
     * </pre>
     *
     * <code>.google.fhir.r4.core.CodeableConcept value_codeable_concept = 3 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
     */
    public Builder setValueCodeableConcept(
        com.google.fhir.r4.core.CodeableConcept.Builder builderForValue) {
      if (valueCodeableConceptBuilder_ == null) {
        valueCodeableConcept_ = builderForValue.build();
        onChanged();
      } else {
        valueCodeableConceptBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Value of extension
     * </pre>
     *
     * <code>.google.fhir.r4.core.CodeableConcept value_codeable_concept = 3 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
     */
    public Builder mergeValueCodeableConcept(com.google.fhir.r4.core.CodeableConcept value) {
      if (valueCodeableConceptBuilder_ == null) {
        if (valueCodeableConcept_ != null) {
          valueCodeableConcept_ =
            com.google.fhir.r4.core.CodeableConcept.newBuilder(valueCodeableConcept_).mergeFrom(value).buildPartial();
        } else {
          valueCodeableConcept_ = value;
        }
        onChanged();
      } else {
        valueCodeableConceptBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Value of extension
     * </pre>
     *
     * <code>.google.fhir.r4.core.CodeableConcept value_codeable_concept = 3 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
     */
    public Builder clearValueCodeableConcept() {
      if (valueCodeableConceptBuilder_ == null) {
        valueCodeableConcept_ = null;
        onChanged();
      } else {
        valueCodeableConcept_ = null;
        valueCodeableConceptBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Value of extension
     * </pre>
     *
     * <code>.google.fhir.r4.core.CodeableConcept value_codeable_concept = 3 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
     */
    public com.google.fhir.r4.core.CodeableConcept.Builder getValueCodeableConceptBuilder() {
      
      onChanged();
      return getValueCodeableConceptFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Value of extension
     * </pre>
     *
     * <code>.google.fhir.r4.core.CodeableConcept value_codeable_concept = 3 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
     */
    public com.google.fhir.r4.core.CodeableConceptOrBuilder getValueCodeableConceptOrBuilder() {
      if (valueCodeableConceptBuilder_ != null) {
        return valueCodeableConceptBuilder_.getMessageOrBuilder();
      } else {
        return valueCodeableConcept_ == null ?
            com.google.fhir.r4.core.CodeableConcept.getDefaultInstance() : valueCodeableConcept_;
      }
    }
    /**
     * <pre>
     * Value of extension
     * </pre>
     *
     * <code>.google.fhir.r4.core.CodeableConcept value_codeable_concept = 3 [(.google.fhir.proto.validation_requirement) = REQUIRED_BY_FHIR];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.fhir.r4.core.CodeableConcept, com.google.fhir.r4.core.CodeableConcept.Builder, com.google.fhir.r4.core.CodeableConceptOrBuilder> 
        getValueCodeableConceptFieldBuilder() {
      if (valueCodeableConceptBuilder_ == null) {
        valueCodeableConceptBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.fhir.r4.core.CodeableConcept, com.google.fhir.r4.core.CodeableConcept.Builder, com.google.fhir.r4.core.CodeableConceptOrBuilder>(
                getValueCodeableConcept(),
                getParentForChildren(),
                isClean());
        valueCodeableConcept_ = null;
      }
      return valueCodeableConceptBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.fhir.r4.core.SpecimenCollectionPriority)
  }

  // @@protoc_insertion_point(class_scope:google.fhir.r4.core.SpecimenCollectionPriority)
  private static final com.google.fhir.r4.core.SpecimenCollectionPriority DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.fhir.r4.core.SpecimenCollectionPriority();
  }

  public static com.google.fhir.r4.core.SpecimenCollectionPriority getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SpecimenCollectionPriority>
      PARSER = new com.google.protobuf.AbstractParser<SpecimenCollectionPriority>() {
    @java.lang.Override
    public SpecimenCollectionPriority parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SpecimenCollectionPriority(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SpecimenCollectionPriority> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SpecimenCollectionPriority> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.fhir.r4.core.SpecimenCollectionPriority getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

