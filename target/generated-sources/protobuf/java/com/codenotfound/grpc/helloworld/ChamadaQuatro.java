// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HelloWorld.proto

package com.codenotfound.grpc.helloworld;

/**
 * Protobuf type {@code com.codenotfound.grpc.helloworld.ChamadaQuatro}
 */
public  final class ChamadaQuatro extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.codenotfound.grpc.helloworld.ChamadaQuatro)
    ChamadaQuatroOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ChamadaQuatro.newBuilder() to construct.
  private ChamadaQuatro(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ChamadaQuatro() {
    message1_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ChamadaQuatro(
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
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            message1_ = s;
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
    return com.codenotfound.grpc.helloworld.HelloWorld.internal_static_com_codenotfound_grpc_helloworld_ChamadaQuatro_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.codenotfound.grpc.helloworld.HelloWorld.internal_static_com_codenotfound_grpc_helloworld_ChamadaQuatro_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.codenotfound.grpc.helloworld.ChamadaQuatro.class, com.codenotfound.grpc.helloworld.ChamadaQuatro.Builder.class);
  }

  public static final int MESSAGE1_FIELD_NUMBER = 1;
  private volatile java.lang.Object message1_;
  /**
   * <code>string message1 = 1;</code>
   */
  public java.lang.String getMessage1() {
    java.lang.Object ref = message1_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      message1_ = s;
      return s;
    }
  }
  /**
   * <code>string message1 = 1;</code>
   */
  public com.google.protobuf.ByteString
      getMessage1Bytes() {
    java.lang.Object ref = message1_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      message1_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getMessage1Bytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, message1_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getMessage1Bytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, message1_);
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
    if (!(obj instanceof com.codenotfound.grpc.helloworld.ChamadaQuatro)) {
      return super.equals(obj);
    }
    com.codenotfound.grpc.helloworld.ChamadaQuatro other = (com.codenotfound.grpc.helloworld.ChamadaQuatro) obj;

    boolean result = true;
    result = result && getMessage1()
        .equals(other.getMessage1());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + MESSAGE1_FIELD_NUMBER;
    hash = (53 * hash) + getMessage1().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.codenotfound.grpc.helloworld.ChamadaQuatro parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.codenotfound.grpc.helloworld.ChamadaQuatro parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.codenotfound.grpc.helloworld.ChamadaQuatro parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.codenotfound.grpc.helloworld.ChamadaQuatro parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.codenotfound.grpc.helloworld.ChamadaQuatro parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.codenotfound.grpc.helloworld.ChamadaQuatro parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.codenotfound.grpc.helloworld.ChamadaQuatro parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.codenotfound.grpc.helloworld.ChamadaQuatro parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.codenotfound.grpc.helloworld.ChamadaQuatro parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.codenotfound.grpc.helloworld.ChamadaQuatro parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.codenotfound.grpc.helloworld.ChamadaQuatro parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.codenotfound.grpc.helloworld.ChamadaQuatro parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.codenotfound.grpc.helloworld.ChamadaQuatro prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
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
   * Protobuf type {@code com.codenotfound.grpc.helloworld.ChamadaQuatro}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.codenotfound.grpc.helloworld.ChamadaQuatro)
      com.codenotfound.grpc.helloworld.ChamadaQuatroOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.codenotfound.grpc.helloworld.HelloWorld.internal_static_com_codenotfound_grpc_helloworld_ChamadaQuatro_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.codenotfound.grpc.helloworld.HelloWorld.internal_static_com_codenotfound_grpc_helloworld_ChamadaQuatro_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.codenotfound.grpc.helloworld.ChamadaQuatro.class, com.codenotfound.grpc.helloworld.ChamadaQuatro.Builder.class);
    }

    // Construct using com.codenotfound.grpc.helloworld.ChamadaQuatro.newBuilder()
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
    public Builder clear() {
      super.clear();
      message1_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.codenotfound.grpc.helloworld.HelloWorld.internal_static_com_codenotfound_grpc_helloworld_ChamadaQuatro_descriptor;
    }

    public com.codenotfound.grpc.helloworld.ChamadaQuatro getDefaultInstanceForType() {
      return com.codenotfound.grpc.helloworld.ChamadaQuatro.getDefaultInstance();
    }

    public com.codenotfound.grpc.helloworld.ChamadaQuatro build() {
      com.codenotfound.grpc.helloworld.ChamadaQuatro result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.codenotfound.grpc.helloworld.ChamadaQuatro buildPartial() {
      com.codenotfound.grpc.helloworld.ChamadaQuatro result = new com.codenotfound.grpc.helloworld.ChamadaQuatro(this);
      result.message1_ = message1_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.codenotfound.grpc.helloworld.ChamadaQuatro) {
        return mergeFrom((com.codenotfound.grpc.helloworld.ChamadaQuatro)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.codenotfound.grpc.helloworld.ChamadaQuatro other) {
      if (other == com.codenotfound.grpc.helloworld.ChamadaQuatro.getDefaultInstance()) return this;
      if (!other.getMessage1().isEmpty()) {
        message1_ = other.message1_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.codenotfound.grpc.helloworld.ChamadaQuatro parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.codenotfound.grpc.helloworld.ChamadaQuatro) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object message1_ = "";
    /**
     * <code>string message1 = 1;</code>
     */
    public java.lang.String getMessage1() {
      java.lang.Object ref = message1_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        message1_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string message1 = 1;</code>
     */
    public com.google.protobuf.ByteString
        getMessage1Bytes() {
      java.lang.Object ref = message1_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        message1_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string message1 = 1;</code>
     */
    public Builder setMessage1(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      message1_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string message1 = 1;</code>
     */
    public Builder clearMessage1() {
      
      message1_ = getDefaultInstance().getMessage1();
      onChanged();
      return this;
    }
    /**
     * <code>string message1 = 1;</code>
     */
    public Builder setMessage1Bytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      message1_ = value;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:com.codenotfound.grpc.helloworld.ChamadaQuatro)
  }

  // @@protoc_insertion_point(class_scope:com.codenotfound.grpc.helloworld.ChamadaQuatro)
  private static final com.codenotfound.grpc.helloworld.ChamadaQuatro DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.codenotfound.grpc.helloworld.ChamadaQuatro();
  }

  public static com.codenotfound.grpc.helloworld.ChamadaQuatro getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ChamadaQuatro>
      PARSER = new com.google.protobuf.AbstractParser<ChamadaQuatro>() {
    public ChamadaQuatro parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ChamadaQuatro(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ChamadaQuatro> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ChamadaQuatro> getParserForType() {
    return PARSER;
  }

  public com.codenotfound.grpc.helloworld.ChamadaQuatro getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

