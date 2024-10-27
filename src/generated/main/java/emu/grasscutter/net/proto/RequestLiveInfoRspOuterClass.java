// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RequestLiveInfoRsp.proto

package emu.grasscutter.net.proto;

public final class RequestLiveInfoRspOuterClass {
  private RequestLiveInfoRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface RequestLiveInfoRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:RequestLiveInfoRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string FECJIGBNJPI = 15;</code>
     * @return The fECJIGBNJPI.
     */
    java.lang.String getFECJIGBNJPI();
    /**
     * <code>string FECJIGBNJPI = 15;</code>
     * @return The bytes for fECJIGBNJPI.
     */
    com.google.protobuf.ByteString
        getFECJIGBNJPIBytes();

    /**
     * <code>string EPBEHDEFFBO = 12;</code>
     * @return The ePBEHDEFFBO.
     */
    java.lang.String getEPBEHDEFFBO();
    /**
     * <code>string EPBEHDEFFBO = 12;</code>
     * @return The bytes for ePBEHDEFFBO.
     */
    com.google.protobuf.ByteString
        getEPBEHDEFFBOBytes();

    /**
     * <code>int32 retcode = 8;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>uint32 live_id = 10;</code>
     * @return The liveId.
     */
    int getLiveId();
  }
  /**
   * <pre>
   * CmdId: 28966
   * Obf: GFJCIAADHDF
   * </pre>
   *
   * Protobuf type {@code RequestLiveInfoRsp}
   */
  public static final class RequestLiveInfoRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:RequestLiveInfoRsp)
      RequestLiveInfoRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use RequestLiveInfoRsp.newBuilder() to construct.
    private RequestLiveInfoRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private RequestLiveInfoRsp() {
      fECJIGBNJPI_ = "";
      ePBEHDEFFBO_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new RequestLiveInfoRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private RequestLiveInfoRsp(
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
            case 64: {

              retcode_ = input.readInt32();
              break;
            }
            case 80: {

              liveId_ = input.readUInt32();
              break;
            }
            case 98: {
              java.lang.String s = input.readStringRequireUtf8();

              ePBEHDEFFBO_ = s;
              break;
            }
            case 122: {
              java.lang.String s = input.readStringRequireUtf8();

              fECJIGBNJPI_ = s;
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
      return emu.grasscutter.net.proto.RequestLiveInfoRspOuterClass.internal_static_RequestLiveInfoRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.RequestLiveInfoRspOuterClass.internal_static_RequestLiveInfoRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.RequestLiveInfoRspOuterClass.RequestLiveInfoRsp.class, emu.grasscutter.net.proto.RequestLiveInfoRspOuterClass.RequestLiveInfoRsp.Builder.class);
    }

    public static final int FECJIGBNJPI_FIELD_NUMBER = 15;
    private volatile java.lang.Object fECJIGBNJPI_;
    /**
     * <code>string FECJIGBNJPI = 15;</code>
     * @return The fECJIGBNJPI.
     */
    @java.lang.Override
    public java.lang.String getFECJIGBNJPI() {
      java.lang.Object ref = fECJIGBNJPI_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        fECJIGBNJPI_ = s;
        return s;
      }
    }
    /**
     * <code>string FECJIGBNJPI = 15;</code>
     * @return The bytes for fECJIGBNJPI.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getFECJIGBNJPIBytes() {
      java.lang.Object ref = fECJIGBNJPI_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        fECJIGBNJPI_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int EPBEHDEFFBO_FIELD_NUMBER = 12;
    private volatile java.lang.Object ePBEHDEFFBO_;
    /**
     * <code>string EPBEHDEFFBO = 12;</code>
     * @return The ePBEHDEFFBO.
     */
    @java.lang.Override
    public java.lang.String getEPBEHDEFFBO() {
      java.lang.Object ref = ePBEHDEFFBO_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        ePBEHDEFFBO_ = s;
        return s;
      }
    }
    /**
     * <code>string EPBEHDEFFBO = 12;</code>
     * @return The bytes for ePBEHDEFFBO.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getEPBEHDEFFBOBytes() {
      java.lang.Object ref = ePBEHDEFFBO_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        ePBEHDEFFBO_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int RETCODE_FIELD_NUMBER = 8;
    private int retcode_;
    /**
     * <code>int32 retcode = 8;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int LIVE_ID_FIELD_NUMBER = 10;
    private int liveId_;
    /**
     * <code>uint32 live_id = 10;</code>
     * @return The liveId.
     */
    @java.lang.Override
    public int getLiveId() {
      return liveId_;
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
      if (retcode_ != 0) {
        output.writeInt32(8, retcode_);
      }
      if (liveId_ != 0) {
        output.writeUInt32(10, liveId_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(ePBEHDEFFBO_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 12, ePBEHDEFFBO_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(fECJIGBNJPI_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 15, fECJIGBNJPI_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(8, retcode_);
      }
      if (liveId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, liveId_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(ePBEHDEFFBO_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(12, ePBEHDEFFBO_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(fECJIGBNJPI_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(15, fECJIGBNJPI_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.RequestLiveInfoRspOuterClass.RequestLiveInfoRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.RequestLiveInfoRspOuterClass.RequestLiveInfoRsp other = (emu.grasscutter.net.proto.RequestLiveInfoRspOuterClass.RequestLiveInfoRsp) obj;

      if (!getFECJIGBNJPI()
          .equals(other.getFECJIGBNJPI())) return false;
      if (!getEPBEHDEFFBO()
          .equals(other.getEPBEHDEFFBO())) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
      if (getLiveId()
          != other.getLiveId()) return false;
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
      hash = (37 * hash) + FECJIGBNJPI_FIELD_NUMBER;
      hash = (53 * hash) + getFECJIGBNJPI().hashCode();
      hash = (37 * hash) + EPBEHDEFFBO_FIELD_NUMBER;
      hash = (53 * hash) + getEPBEHDEFFBO().hashCode();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (37 * hash) + LIVE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getLiveId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.RequestLiveInfoRspOuterClass.RequestLiveInfoRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.RequestLiveInfoRspOuterClass.RequestLiveInfoRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.RequestLiveInfoRspOuterClass.RequestLiveInfoRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.RequestLiveInfoRspOuterClass.RequestLiveInfoRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.RequestLiveInfoRspOuterClass.RequestLiveInfoRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.RequestLiveInfoRspOuterClass.RequestLiveInfoRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.RequestLiveInfoRspOuterClass.RequestLiveInfoRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.RequestLiveInfoRspOuterClass.RequestLiveInfoRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.RequestLiveInfoRspOuterClass.RequestLiveInfoRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.RequestLiveInfoRspOuterClass.RequestLiveInfoRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.RequestLiveInfoRspOuterClass.RequestLiveInfoRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.RequestLiveInfoRspOuterClass.RequestLiveInfoRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.RequestLiveInfoRspOuterClass.RequestLiveInfoRsp prototype) {
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
     * CmdId: 28966
     * Obf: GFJCIAADHDF
     * </pre>
     *
     * Protobuf type {@code RequestLiveInfoRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:RequestLiveInfoRsp)
        emu.grasscutter.net.proto.RequestLiveInfoRspOuterClass.RequestLiveInfoRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.RequestLiveInfoRspOuterClass.internal_static_RequestLiveInfoRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.RequestLiveInfoRspOuterClass.internal_static_RequestLiveInfoRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.RequestLiveInfoRspOuterClass.RequestLiveInfoRsp.class, emu.grasscutter.net.proto.RequestLiveInfoRspOuterClass.RequestLiveInfoRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.RequestLiveInfoRspOuterClass.RequestLiveInfoRsp.newBuilder()
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
        fECJIGBNJPI_ = "";

        ePBEHDEFFBO_ = "";

        retcode_ = 0;

        liveId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.RequestLiveInfoRspOuterClass.internal_static_RequestLiveInfoRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.RequestLiveInfoRspOuterClass.RequestLiveInfoRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.RequestLiveInfoRspOuterClass.RequestLiveInfoRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.RequestLiveInfoRspOuterClass.RequestLiveInfoRsp build() {
        emu.grasscutter.net.proto.RequestLiveInfoRspOuterClass.RequestLiveInfoRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.RequestLiveInfoRspOuterClass.RequestLiveInfoRsp buildPartial() {
        emu.grasscutter.net.proto.RequestLiveInfoRspOuterClass.RequestLiveInfoRsp result = new emu.grasscutter.net.proto.RequestLiveInfoRspOuterClass.RequestLiveInfoRsp(this);
        result.fECJIGBNJPI_ = fECJIGBNJPI_;
        result.ePBEHDEFFBO_ = ePBEHDEFFBO_;
        result.retcode_ = retcode_;
        result.liveId_ = liveId_;
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
        if (other instanceof emu.grasscutter.net.proto.RequestLiveInfoRspOuterClass.RequestLiveInfoRsp) {
          return mergeFrom((emu.grasscutter.net.proto.RequestLiveInfoRspOuterClass.RequestLiveInfoRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.RequestLiveInfoRspOuterClass.RequestLiveInfoRsp other) {
        if (other == emu.grasscutter.net.proto.RequestLiveInfoRspOuterClass.RequestLiveInfoRsp.getDefaultInstance()) return this;
        if (!other.getFECJIGBNJPI().isEmpty()) {
          fECJIGBNJPI_ = other.fECJIGBNJPI_;
          onChanged();
        }
        if (!other.getEPBEHDEFFBO().isEmpty()) {
          ePBEHDEFFBO_ = other.ePBEHDEFFBO_;
          onChanged();
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.getLiveId() != 0) {
          setLiveId(other.getLiveId());
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
        emu.grasscutter.net.proto.RequestLiveInfoRspOuterClass.RequestLiveInfoRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.RequestLiveInfoRspOuterClass.RequestLiveInfoRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object fECJIGBNJPI_ = "";
      /**
       * <code>string FECJIGBNJPI = 15;</code>
       * @return The fECJIGBNJPI.
       */
      public java.lang.String getFECJIGBNJPI() {
        java.lang.Object ref = fECJIGBNJPI_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          fECJIGBNJPI_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string FECJIGBNJPI = 15;</code>
       * @return The bytes for fECJIGBNJPI.
       */
      public com.google.protobuf.ByteString
          getFECJIGBNJPIBytes() {
        java.lang.Object ref = fECJIGBNJPI_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          fECJIGBNJPI_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string FECJIGBNJPI = 15;</code>
       * @param value The fECJIGBNJPI to set.
       * @return This builder for chaining.
       */
      public Builder setFECJIGBNJPI(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        fECJIGBNJPI_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string FECJIGBNJPI = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearFECJIGBNJPI() {
        
        fECJIGBNJPI_ = getDefaultInstance().getFECJIGBNJPI();
        onChanged();
        return this;
      }
      /**
       * <code>string FECJIGBNJPI = 15;</code>
       * @param value The bytes for fECJIGBNJPI to set.
       * @return This builder for chaining.
       */
      public Builder setFECJIGBNJPIBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        fECJIGBNJPI_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object ePBEHDEFFBO_ = "";
      /**
       * <code>string EPBEHDEFFBO = 12;</code>
       * @return The ePBEHDEFFBO.
       */
      public java.lang.String getEPBEHDEFFBO() {
        java.lang.Object ref = ePBEHDEFFBO_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          ePBEHDEFFBO_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string EPBEHDEFFBO = 12;</code>
       * @return The bytes for ePBEHDEFFBO.
       */
      public com.google.protobuf.ByteString
          getEPBEHDEFFBOBytes() {
        java.lang.Object ref = ePBEHDEFFBO_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          ePBEHDEFFBO_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string EPBEHDEFFBO = 12;</code>
       * @param value The ePBEHDEFFBO to set.
       * @return This builder for chaining.
       */
      public Builder setEPBEHDEFFBO(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        ePBEHDEFFBO_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string EPBEHDEFFBO = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearEPBEHDEFFBO() {
        
        ePBEHDEFFBO_ = getDefaultInstance().getEPBEHDEFFBO();
        onChanged();
        return this;
      }
      /**
       * <code>string EPBEHDEFFBO = 12;</code>
       * @param value The bytes for ePBEHDEFFBO to set.
       * @return This builder for chaining.
       */
      public Builder setEPBEHDEFFBOBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        ePBEHDEFFBO_ = value;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 8;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 8;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private int liveId_ ;
      /**
       * <code>uint32 live_id = 10;</code>
       * @return The liveId.
       */
      @java.lang.Override
      public int getLiveId() {
        return liveId_;
      }
      /**
       * <code>uint32 live_id = 10;</code>
       * @param value The liveId to set.
       * @return This builder for chaining.
       */
      public Builder setLiveId(int value) {
        
        liveId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 live_id = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearLiveId() {
        
        liveId_ = 0;
        onChanged();
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


      // @@protoc_insertion_point(builder_scope:RequestLiveInfoRsp)
    }

    // @@protoc_insertion_point(class_scope:RequestLiveInfoRsp)
    private static final emu.grasscutter.net.proto.RequestLiveInfoRspOuterClass.RequestLiveInfoRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.RequestLiveInfoRspOuterClass.RequestLiveInfoRsp();
    }

    public static emu.grasscutter.net.proto.RequestLiveInfoRspOuterClass.RequestLiveInfoRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<RequestLiveInfoRsp>
        PARSER = new com.google.protobuf.AbstractParser<RequestLiveInfoRsp>() {
      @java.lang.Override
      public RequestLiveInfoRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new RequestLiveInfoRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<RequestLiveInfoRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<RequestLiveInfoRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.RequestLiveInfoRspOuterClass.RequestLiveInfoRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RequestLiveInfoRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_RequestLiveInfoRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030RequestLiveInfoRsp.proto\"`\n\022RequestLiv" +
      "eInfoRsp\022\023\n\013FECJIGBNJPI\030\017 \001(\t\022\023\n\013EPBEHDE" +
      "FFBO\030\014 \001(\t\022\017\n\007retcode\030\010 \001(\005\022\017\n\007live_id\030\n" +
      " \001(\rB\033\n\031emu.grasscutter.net.protob\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_RequestLiveInfoRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_RequestLiveInfoRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_RequestLiveInfoRsp_descriptor,
        new java.lang.String[] { "FECJIGBNJPI", "EPBEHDEFFBO", "Retcode", "LiveId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}