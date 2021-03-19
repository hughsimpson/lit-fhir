// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/google/fhir/proto/r4/core/codes.proto

package com.google.fhir.r4.core;

/**
 * <pre>
 *  Codes that provide guidance around the circumstances in which a given
 *  address should be used.
 * See http://terminology.hl7.org/CodeSystem/v3-AddressUse
 * </pre>
 *
 * Protobuf type {@code google.fhir.r4.core.V3AddressUseCode}
 */
public final class V3AddressUseCode extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.fhir.r4.core.V3AddressUseCode)
    V3AddressUseCodeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use V3AddressUseCode.newBuilder() to construct.
  private V3AddressUseCode(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private V3AddressUseCode() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new V3AddressUseCode();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private V3AddressUseCode(
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
    return com.google.fhir.r4.core.Codes.internal_static_google_fhir_r4_core_V3AddressUseCode_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.fhir.r4.core.Codes.internal_static_google_fhir_r4_core_V3AddressUseCode_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.fhir.r4.core.V3AddressUseCode.class, com.google.fhir.r4.core.V3AddressUseCode.Builder.class);
  }

  /**
   * Protobuf enum {@code google.fhir.r4.core.V3AddressUseCode.Value}
   */
  public enum Value
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>INVALID_UNINITIALIZED = 0;</code>
     */
    INVALID_UNINITIALIZED(0),
    /**
     * <code>GENERAL_ADDRESS_USE = 1 [(.google.fhir.proto.fhir_original_code) = "_GeneralAddressUse"];</code>
     */
    GENERAL_ADDRESS_USE(1),
    /**
     * <code>BAD = 2 [(.google.fhir.proto.fhir_original_code) = "BAD"];</code>
     */
    BAD(2),
    /**
     * <code>CONF = 3 [(.google.fhir.proto.fhir_original_code) = "CONF"];</code>
     */
    CONF(3),
    /**
     * <code>H = 4 [(.google.fhir.proto.fhir_original_code) = "H"];</code>
     */
    H(4),
    /**
     * <code>HP = 5 [(.google.fhir.proto.fhir_original_code) = "HP"];</code>
     */
    HP(5),
    /**
     * <code>HV = 6 [(.google.fhir.proto.fhir_original_code) = "HV"];</code>
     */
    HV(6),
    /**
     * <code>OLD = 7 [(.google.fhir.proto.fhir_original_code) = "OLD"];</code>
     */
    OLD(7),
    /**
     * <code>TMP = 8 [(.google.fhir.proto.fhir_original_code) = "TMP"];</code>
     */
    TMP(8),
    /**
     * <code>WP = 9 [(.google.fhir.proto.fhir_original_code) = "WP"];</code>
     */
    WP(9),
    /**
     * <code>DIR = 10 [(.google.fhir.proto.fhir_original_code) = "DIR"];</code>
     */
    DIR(10),
    /**
     * <code>PUB = 11 [(.google.fhir.proto.fhir_original_code) = "PUB"];</code>
     */
    PUB(11),
    /**
     * <code>POSTAL_ADDRESS_USE = 12 [(.google.fhir.proto.fhir_original_code) = "_PostalAddressUse"];</code>
     */
    POSTAL_ADDRESS_USE(12),
    /**
     * <code>PHYS = 13 [(.google.fhir.proto.fhir_original_code) = "PHYS"];</code>
     */
    PHYS(13),
    /**
     * <code>PST = 14 [(.google.fhir.proto.fhir_original_code) = "PST"];</code>
     */
    PST(14),
    /**
     * <code>TELECOMMUNICATION_ADDRESS_USE = 15 [(.google.fhir.proto.fhir_original_code) = "_TelecommunicationAddressUse"];</code>
     */
    TELECOMMUNICATION_ADDRESS_USE(15),
    /**
     * <code>AS = 16 [(.google.fhir.proto.fhir_original_code) = "AS"];</code>
     */
    AS(16),
    /**
     * <code>EC = 17 [(.google.fhir.proto.fhir_original_code) = "EC"];</code>
     */
    EC(17),
    /**
     * <code>MC = 18 [(.google.fhir.proto.fhir_original_code) = "MC"];</code>
     */
    MC(18),
    /**
     * <code>PG = 19 [(.google.fhir.proto.fhir_original_code) = "PG"];</code>
     */
    PG(19),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>INVALID_UNINITIALIZED = 0;</code>
     */
    public static final int INVALID_UNINITIALIZED_VALUE = 0;
    /**
     * <code>GENERAL_ADDRESS_USE = 1 [(.google.fhir.proto.fhir_original_code) = "_GeneralAddressUse"];</code>
     */
    public static final int GENERAL_ADDRESS_USE_VALUE = 1;
    /**
     * <code>BAD = 2 [(.google.fhir.proto.fhir_original_code) = "BAD"];</code>
     */
    public static final int BAD_VALUE = 2;
    /**
     * <code>CONF = 3 [(.google.fhir.proto.fhir_original_code) = "CONF"];</code>
     */
    public static final int CONF_VALUE = 3;
    /**
     * <code>H = 4 [(.google.fhir.proto.fhir_original_code) = "H"];</code>
     */
    public static final int H_VALUE = 4;
    /**
     * <code>HP = 5 [(.google.fhir.proto.fhir_original_code) = "HP"];</code>
     */
    public static final int HP_VALUE = 5;
    /**
     * <code>HV = 6 [(.google.fhir.proto.fhir_original_code) = "HV"];</code>
     */
    public static final int HV_VALUE = 6;
    /**
     * <code>OLD = 7 [(.google.fhir.proto.fhir_original_code) = "OLD"];</code>
     */
    public static final int OLD_VALUE = 7;
    /**
     * <code>TMP = 8 [(.google.fhir.proto.fhir_original_code) = "TMP"];</code>
     */
    public static final int TMP_VALUE = 8;
    /**
     * <code>WP = 9 [(.google.fhir.proto.fhir_original_code) = "WP"];</code>
     */
    public static final int WP_VALUE = 9;
    /**
     * <code>DIR = 10 [(.google.fhir.proto.fhir_original_code) = "DIR"];</code>
     */
    public static final int DIR_VALUE = 10;
    /**
     * <code>PUB = 11 [(.google.fhir.proto.fhir_original_code) = "PUB"];</code>
     */
    public static final int PUB_VALUE = 11;
    /**
     * <code>POSTAL_ADDRESS_USE = 12 [(.google.fhir.proto.fhir_original_code) = "_PostalAddressUse"];</code>
     */
    public static final int POSTAL_ADDRESS_USE_VALUE = 12;
    /**
     * <code>PHYS = 13 [(.google.fhir.proto.fhir_original_code) = "PHYS"];</code>
     */
    public static final int PHYS_VALUE = 13;
    /**
     * <code>PST = 14 [(.google.fhir.proto.fhir_original_code) = "PST"];</code>
     */
    public static final int PST_VALUE = 14;
    /**
     * <code>TELECOMMUNICATION_ADDRESS_USE = 15 [(.google.fhir.proto.fhir_original_code) = "_TelecommunicationAddressUse"];</code>
     */
    public static final int TELECOMMUNICATION_ADDRESS_USE_VALUE = 15;
    /**
     * <code>AS = 16 [(.google.fhir.proto.fhir_original_code) = "AS"];</code>
     */
    public static final int AS_VALUE = 16;
    /**
     * <code>EC = 17 [(.google.fhir.proto.fhir_original_code) = "EC"];</code>
     */
    public static final int EC_VALUE = 17;
    /**
     * <code>MC = 18 [(.google.fhir.proto.fhir_original_code) = "MC"];</code>
     */
    public static final int MC_VALUE = 18;
    /**
     * <code>PG = 19 [(.google.fhir.proto.fhir_original_code) = "PG"];</code>
     */
    public static final int PG_VALUE = 19;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static Value valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Value forNumber(int value) {
      switch (value) {
        case 0: return INVALID_UNINITIALIZED;
        case 1: return GENERAL_ADDRESS_USE;
        case 2: return BAD;
        case 3: return CONF;
        case 4: return H;
        case 5: return HP;
        case 6: return HV;
        case 7: return OLD;
        case 8: return TMP;
        case 9: return WP;
        case 10: return DIR;
        case 11: return PUB;
        case 12: return POSTAL_ADDRESS_USE;
        case 13: return PHYS;
        case 14: return PST;
        case 15: return TELECOMMUNICATION_ADDRESS_USE;
        case 16: return AS;
        case 17: return EC;
        case 18: return MC;
        case 19: return PG;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Value>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Value> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Value>() {
            public Value findValueByNumber(int number) {
              return Value.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.google.fhir.r4.core.V3AddressUseCode.getDescriptor().getEnumTypes().get(0);
    }

    private static final Value[] VALUES = values();

    public static Value valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Value(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.fhir.r4.core.V3AddressUseCode.Value)
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
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.fhir.r4.core.V3AddressUseCode)) {
      return super.equals(obj);
    }
    com.google.fhir.r4.core.V3AddressUseCode other = (com.google.fhir.r4.core.V3AddressUseCode) obj;

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
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.fhir.r4.core.V3AddressUseCode parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.fhir.r4.core.V3AddressUseCode parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.fhir.r4.core.V3AddressUseCode parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.fhir.r4.core.V3AddressUseCode parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.fhir.r4.core.V3AddressUseCode parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.fhir.r4.core.V3AddressUseCode parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.fhir.r4.core.V3AddressUseCode parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.fhir.r4.core.V3AddressUseCode parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.fhir.r4.core.V3AddressUseCode parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.fhir.r4.core.V3AddressUseCode parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.fhir.r4.core.V3AddressUseCode parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.fhir.r4.core.V3AddressUseCode parseFrom(
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
  public static Builder newBuilder(com.google.fhir.r4.core.V3AddressUseCode prototype) {
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
   *  Codes that provide guidance around the circumstances in which a given
   *  address should be used.
   * See http://terminology.hl7.org/CodeSystem/v3-AddressUse
   * </pre>
   *
   * Protobuf type {@code google.fhir.r4.core.V3AddressUseCode}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.fhir.r4.core.V3AddressUseCode)
      com.google.fhir.r4.core.V3AddressUseCodeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.fhir.r4.core.Codes.internal_static_google_fhir_r4_core_V3AddressUseCode_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.fhir.r4.core.Codes.internal_static_google_fhir_r4_core_V3AddressUseCode_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.fhir.r4.core.V3AddressUseCode.class, com.google.fhir.r4.core.V3AddressUseCode.Builder.class);
    }

    // Construct using com.google.fhir.r4.core.V3AddressUseCode.newBuilder()
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
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.fhir.r4.core.Codes.internal_static_google_fhir_r4_core_V3AddressUseCode_descriptor;
    }

    @java.lang.Override
    public com.google.fhir.r4.core.V3AddressUseCode getDefaultInstanceForType() {
      return com.google.fhir.r4.core.V3AddressUseCode.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.fhir.r4.core.V3AddressUseCode build() {
      com.google.fhir.r4.core.V3AddressUseCode result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.fhir.r4.core.V3AddressUseCode buildPartial() {
      com.google.fhir.r4.core.V3AddressUseCode result = new com.google.fhir.r4.core.V3AddressUseCode(this);
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
      if (other instanceof com.google.fhir.r4.core.V3AddressUseCode) {
        return mergeFrom((com.google.fhir.r4.core.V3AddressUseCode)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.fhir.r4.core.V3AddressUseCode other) {
      if (other == com.google.fhir.r4.core.V3AddressUseCode.getDefaultInstance()) return this;
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
      com.google.fhir.r4.core.V3AddressUseCode parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.fhir.r4.core.V3AddressUseCode) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
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


    // @@protoc_insertion_point(builder_scope:google.fhir.r4.core.V3AddressUseCode)
  }

  // @@protoc_insertion_point(class_scope:google.fhir.r4.core.V3AddressUseCode)
  private static final com.google.fhir.r4.core.V3AddressUseCode DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.fhir.r4.core.V3AddressUseCode();
  }

  public static com.google.fhir.r4.core.V3AddressUseCode getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<V3AddressUseCode>
      PARSER = new com.google.protobuf.AbstractParser<V3AddressUseCode>() {
    @java.lang.Override
    public V3AddressUseCode parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new V3AddressUseCode(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<V3AddressUseCode> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<V3AddressUseCode> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.fhir.r4.core.V3AddressUseCode getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

