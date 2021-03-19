// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/google/fhir/proto/r4/core/codes.proto

package com.google.fhir.r4.core;

/**
 * <pre>
 *   Description:
 * The qualifier is a set of codes each of which specifies a certain subcategory
 * of the name part in addition to the main name part type. For example, a given
 * name may be flagged as a nickname, a family name may be a pseudonym or a name
 * of public records. See
 * http://terminology.hl7.org/CodeSystem/v3-EntityNamePartQualifierR2
 * </pre>
 *
 * Protobuf type {@code google.fhir.r4.core.V3EntityNamePartQualifierR2Code}
 */
public final class V3EntityNamePartQualifierR2Code extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.fhir.r4.core.V3EntityNamePartQualifierR2Code)
    V3EntityNamePartQualifierR2CodeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use V3EntityNamePartQualifierR2Code.newBuilder() to construct.
  private V3EntityNamePartQualifierR2Code(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private V3EntityNamePartQualifierR2Code() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new V3EntityNamePartQualifierR2Code();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private V3EntityNamePartQualifierR2Code(
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
    return com.google.fhir.r4.core.Codes.internal_static_google_fhir_r4_core_V3EntityNamePartQualifierR2Code_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.fhir.r4.core.Codes.internal_static_google_fhir_r4_core_V3EntityNamePartQualifierR2Code_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.fhir.r4.core.V3EntityNamePartQualifierR2Code.class, com.google.fhir.r4.core.V3EntityNamePartQualifierR2Code.Builder.class);
  }

  /**
   * Protobuf enum {@code google.fhir.r4.core.V3EntityNamePartQualifierR2Code.Value}
   */
  public enum Value
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>INVALID_UNINITIALIZED = 0;</code>
     */
    INVALID_UNINITIALIZED(0),
    /**
     * <code>AD = 1 [(.google.fhir.proto.fhir_original_code) = "AD"];</code>
     */
    AD(1),
    /**
     * <code>SP = 2 [(.google.fhir.proto.fhir_original_code) = "SP"];</code>
     */
    SP(2),
    /**
     * <code>BR = 3 [(.google.fhir.proto.fhir_original_code) = "BR"];</code>
     */
    BR(3),
    /**
     * <code>CL = 4 [(.google.fhir.proto.fhir_original_code) = "CL"];</code>
     */
    CL(4),
    /**
     * <code>IN = 5 [(.google.fhir.proto.fhir_original_code) = "IN"];</code>
     */
    IN(5),
    /**
     * <code>LS = 6 [(.google.fhir.proto.fhir_original_code) = "LS"];</code>
     */
    LS(6),
    /**
     * <code>MID = 7 [(.google.fhir.proto.fhir_original_code) = "MID"];</code>
     */
    MID(7),
    /**
     * <code>PFX = 8 [(.google.fhir.proto.fhir_original_code) = "PFX"];</code>
     */
    PFX(8),
    /**
     * <code>PHARMACEUTICAL_ENTITY_NAME_PART_QUALIFIERS = 9 [(.google.fhir.proto.fhir_original_code) = "PharmaceuticalEntityNamePartQualifiers"];</code>
     */
    PHARMACEUTICAL_ENTITY_NAME_PART_QUALIFIERS(9),
    /**
     * <code>CON = 10 [(.google.fhir.proto.fhir_original_code) = "CON"];</code>
     */
    CON(10),
    /**
     * <code>DEV = 11 [(.google.fhir.proto.fhir_original_code) = "DEV"];</code>
     */
    DEV(11),
    /**
     * <code>FLAV = 12 [(.google.fhir.proto.fhir_original_code) = "FLAV"];</code>
     */
    FLAV(12),
    /**
     * <code>FORMUL = 13 [(.google.fhir.proto.fhir_original_code) = "FORMUL"];</code>
     */
    FORMUL(13),
    /**
     * <code>FRM = 14 [(.google.fhir.proto.fhir_original_code) = "FRM"];</code>
     */
    FRM(14),
    /**
     * <code>INV = 15 [(.google.fhir.proto.fhir_original_code) = "INV"];</code>
     */
    INV(15),
    /**
     * <code>POPUL = 16 [(.google.fhir.proto.fhir_original_code) = "POPUL"];</code>
     */
    POPUL(16),
    /**
     * <code>SCI = 17 [(.google.fhir.proto.fhir_original_code) = "SCI"];</code>
     */
    SCI(17),
    /**
     * <code>STR = 18 [(.google.fhir.proto.fhir_original_code) = "STR"];</code>
     */
    STR(18),
    /**
     * <code>TIME = 19 [(.google.fhir.proto.fhir_original_code) = "TIME"];</code>
     */
    TIME(19),
    /**
     * <code>TMK = 20 [(.google.fhir.proto.fhir_original_code) = "TMK"];</code>
     */
    TMK(20),
    /**
     * <code>USE = 21 [(.google.fhir.proto.fhir_original_code) = "USE"];</code>
     */
    USE(21),
    /**
     * <code>SFX = 22 [(.google.fhir.proto.fhir_original_code) = "SFX"];</code>
     */
    SFX(22),
    /**
     * <code>TITLE_STYLES = 23 [(.google.fhir.proto.fhir_original_code) = "TitleStyles"];</code>
     */
    TITLE_STYLES(23),
    /**
     * <code>AC = 24 [(.google.fhir.proto.fhir_original_code) = "AC"];</code>
     */
    AC(24),
    /**
     * <code>HON = 25 [(.google.fhir.proto.fhir_original_code) = "HON"];</code>
     */
    HON(25),
    /**
     * <code>NB = 26 [(.google.fhir.proto.fhir_original_code) = "NB"];</code>
     */
    NB(26),
    /**
     * <code>PR = 27 [(.google.fhir.proto.fhir_original_code) = "PR"];</code>
     */
    PR(27),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>INVALID_UNINITIALIZED = 0;</code>
     */
    public static final int INVALID_UNINITIALIZED_VALUE = 0;
    /**
     * <code>AD = 1 [(.google.fhir.proto.fhir_original_code) = "AD"];</code>
     */
    public static final int AD_VALUE = 1;
    /**
     * <code>SP = 2 [(.google.fhir.proto.fhir_original_code) = "SP"];</code>
     */
    public static final int SP_VALUE = 2;
    /**
     * <code>BR = 3 [(.google.fhir.proto.fhir_original_code) = "BR"];</code>
     */
    public static final int BR_VALUE = 3;
    /**
     * <code>CL = 4 [(.google.fhir.proto.fhir_original_code) = "CL"];</code>
     */
    public static final int CL_VALUE = 4;
    /**
     * <code>IN = 5 [(.google.fhir.proto.fhir_original_code) = "IN"];</code>
     */
    public static final int IN_VALUE = 5;
    /**
     * <code>LS = 6 [(.google.fhir.proto.fhir_original_code) = "LS"];</code>
     */
    public static final int LS_VALUE = 6;
    /**
     * <code>MID = 7 [(.google.fhir.proto.fhir_original_code) = "MID"];</code>
     */
    public static final int MID_VALUE = 7;
    /**
     * <code>PFX = 8 [(.google.fhir.proto.fhir_original_code) = "PFX"];</code>
     */
    public static final int PFX_VALUE = 8;
    /**
     * <code>PHARMACEUTICAL_ENTITY_NAME_PART_QUALIFIERS = 9 [(.google.fhir.proto.fhir_original_code) = "PharmaceuticalEntityNamePartQualifiers"];</code>
     */
    public static final int PHARMACEUTICAL_ENTITY_NAME_PART_QUALIFIERS_VALUE = 9;
    /**
     * <code>CON = 10 [(.google.fhir.proto.fhir_original_code) = "CON"];</code>
     */
    public static final int CON_VALUE = 10;
    /**
     * <code>DEV = 11 [(.google.fhir.proto.fhir_original_code) = "DEV"];</code>
     */
    public static final int DEV_VALUE = 11;
    /**
     * <code>FLAV = 12 [(.google.fhir.proto.fhir_original_code) = "FLAV"];</code>
     */
    public static final int FLAV_VALUE = 12;
    /**
     * <code>FORMUL = 13 [(.google.fhir.proto.fhir_original_code) = "FORMUL"];</code>
     */
    public static final int FORMUL_VALUE = 13;
    /**
     * <code>FRM = 14 [(.google.fhir.proto.fhir_original_code) = "FRM"];</code>
     */
    public static final int FRM_VALUE = 14;
    /**
     * <code>INV = 15 [(.google.fhir.proto.fhir_original_code) = "INV"];</code>
     */
    public static final int INV_VALUE = 15;
    /**
     * <code>POPUL = 16 [(.google.fhir.proto.fhir_original_code) = "POPUL"];</code>
     */
    public static final int POPUL_VALUE = 16;
    /**
     * <code>SCI = 17 [(.google.fhir.proto.fhir_original_code) = "SCI"];</code>
     */
    public static final int SCI_VALUE = 17;
    /**
     * <code>STR = 18 [(.google.fhir.proto.fhir_original_code) = "STR"];</code>
     */
    public static final int STR_VALUE = 18;
    /**
     * <code>TIME = 19 [(.google.fhir.proto.fhir_original_code) = "TIME"];</code>
     */
    public static final int TIME_VALUE = 19;
    /**
     * <code>TMK = 20 [(.google.fhir.proto.fhir_original_code) = "TMK"];</code>
     */
    public static final int TMK_VALUE = 20;
    /**
     * <code>USE = 21 [(.google.fhir.proto.fhir_original_code) = "USE"];</code>
     */
    public static final int USE_VALUE = 21;
    /**
     * <code>SFX = 22 [(.google.fhir.proto.fhir_original_code) = "SFX"];</code>
     */
    public static final int SFX_VALUE = 22;
    /**
     * <code>TITLE_STYLES = 23 [(.google.fhir.proto.fhir_original_code) = "TitleStyles"];</code>
     */
    public static final int TITLE_STYLES_VALUE = 23;
    /**
     * <code>AC = 24 [(.google.fhir.proto.fhir_original_code) = "AC"];</code>
     */
    public static final int AC_VALUE = 24;
    /**
     * <code>HON = 25 [(.google.fhir.proto.fhir_original_code) = "HON"];</code>
     */
    public static final int HON_VALUE = 25;
    /**
     * <code>NB = 26 [(.google.fhir.proto.fhir_original_code) = "NB"];</code>
     */
    public static final int NB_VALUE = 26;
    /**
     * <code>PR = 27 [(.google.fhir.proto.fhir_original_code) = "PR"];</code>
     */
    public static final int PR_VALUE = 27;


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
        case 1: return AD;
        case 2: return SP;
        case 3: return BR;
        case 4: return CL;
        case 5: return IN;
        case 6: return LS;
        case 7: return MID;
        case 8: return PFX;
        case 9: return PHARMACEUTICAL_ENTITY_NAME_PART_QUALIFIERS;
        case 10: return CON;
        case 11: return DEV;
        case 12: return FLAV;
        case 13: return FORMUL;
        case 14: return FRM;
        case 15: return INV;
        case 16: return POPUL;
        case 17: return SCI;
        case 18: return STR;
        case 19: return TIME;
        case 20: return TMK;
        case 21: return USE;
        case 22: return SFX;
        case 23: return TITLE_STYLES;
        case 24: return AC;
        case 25: return HON;
        case 26: return NB;
        case 27: return PR;
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
      return com.google.fhir.r4.core.V3EntityNamePartQualifierR2Code.getDescriptor().getEnumTypes().get(0);
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

    // @@protoc_insertion_point(enum_scope:google.fhir.r4.core.V3EntityNamePartQualifierR2Code.Value)
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
    if (!(obj instanceof com.google.fhir.r4.core.V3EntityNamePartQualifierR2Code)) {
      return super.equals(obj);
    }
    com.google.fhir.r4.core.V3EntityNamePartQualifierR2Code other = (com.google.fhir.r4.core.V3EntityNamePartQualifierR2Code) obj;

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

  public static com.google.fhir.r4.core.V3EntityNamePartQualifierR2Code parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.fhir.r4.core.V3EntityNamePartQualifierR2Code parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.fhir.r4.core.V3EntityNamePartQualifierR2Code parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.fhir.r4.core.V3EntityNamePartQualifierR2Code parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.fhir.r4.core.V3EntityNamePartQualifierR2Code parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.fhir.r4.core.V3EntityNamePartQualifierR2Code parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.fhir.r4.core.V3EntityNamePartQualifierR2Code parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.fhir.r4.core.V3EntityNamePartQualifierR2Code parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.fhir.r4.core.V3EntityNamePartQualifierR2Code parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.fhir.r4.core.V3EntityNamePartQualifierR2Code parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.fhir.r4.core.V3EntityNamePartQualifierR2Code parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.fhir.r4.core.V3EntityNamePartQualifierR2Code parseFrom(
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
  public static Builder newBuilder(com.google.fhir.r4.core.V3EntityNamePartQualifierR2Code prototype) {
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
   *   Description:
   * The qualifier is a set of codes each of which specifies a certain subcategory
   * of the name part in addition to the main name part type. For example, a given
   * name may be flagged as a nickname, a family name may be a pseudonym or a name
   * of public records. See
   * http://terminology.hl7.org/CodeSystem/v3-EntityNamePartQualifierR2
   * </pre>
   *
   * Protobuf type {@code google.fhir.r4.core.V3EntityNamePartQualifierR2Code}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.fhir.r4.core.V3EntityNamePartQualifierR2Code)
      com.google.fhir.r4.core.V3EntityNamePartQualifierR2CodeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.fhir.r4.core.Codes.internal_static_google_fhir_r4_core_V3EntityNamePartQualifierR2Code_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.fhir.r4.core.Codes.internal_static_google_fhir_r4_core_V3EntityNamePartQualifierR2Code_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.fhir.r4.core.V3EntityNamePartQualifierR2Code.class, com.google.fhir.r4.core.V3EntityNamePartQualifierR2Code.Builder.class);
    }

    // Construct using com.google.fhir.r4.core.V3EntityNamePartQualifierR2Code.newBuilder()
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
      return com.google.fhir.r4.core.Codes.internal_static_google_fhir_r4_core_V3EntityNamePartQualifierR2Code_descriptor;
    }

    @java.lang.Override
    public com.google.fhir.r4.core.V3EntityNamePartQualifierR2Code getDefaultInstanceForType() {
      return com.google.fhir.r4.core.V3EntityNamePartQualifierR2Code.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.fhir.r4.core.V3EntityNamePartQualifierR2Code build() {
      com.google.fhir.r4.core.V3EntityNamePartQualifierR2Code result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.fhir.r4.core.V3EntityNamePartQualifierR2Code buildPartial() {
      com.google.fhir.r4.core.V3EntityNamePartQualifierR2Code result = new com.google.fhir.r4.core.V3EntityNamePartQualifierR2Code(this);
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
      if (other instanceof com.google.fhir.r4.core.V3EntityNamePartQualifierR2Code) {
        return mergeFrom((com.google.fhir.r4.core.V3EntityNamePartQualifierR2Code)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.fhir.r4.core.V3EntityNamePartQualifierR2Code other) {
      if (other == com.google.fhir.r4.core.V3EntityNamePartQualifierR2Code.getDefaultInstance()) return this;
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
      com.google.fhir.r4.core.V3EntityNamePartQualifierR2Code parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.fhir.r4.core.V3EntityNamePartQualifierR2Code) e.getUnfinishedMessage();
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


    // @@protoc_insertion_point(builder_scope:google.fhir.r4.core.V3EntityNamePartQualifierR2Code)
  }

  // @@protoc_insertion_point(class_scope:google.fhir.r4.core.V3EntityNamePartQualifierR2Code)
  private static final com.google.fhir.r4.core.V3EntityNamePartQualifierR2Code DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.fhir.r4.core.V3EntityNamePartQualifierR2Code();
  }

  public static com.google.fhir.r4.core.V3EntityNamePartQualifierR2Code getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<V3EntityNamePartQualifierR2Code>
      PARSER = new com.google.protobuf.AbstractParser<V3EntityNamePartQualifierR2Code>() {
    @java.lang.Override
    public V3EntityNamePartQualifierR2Code parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new V3EntityNamePartQualifierR2Code(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<V3EntityNamePartQualifierR2Code> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<V3EntityNamePartQualifierR2Code> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.fhir.r4.core.V3EntityNamePartQualifierR2Code getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

