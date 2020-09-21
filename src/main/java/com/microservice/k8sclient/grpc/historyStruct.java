// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: predict.proto

package com.microservice.k8sclient.grpc;

/**
 * Protobuf type {@code historyStruct}
 */
public  final class historyStruct extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:historyStruct)
    historyStructOrBuilder {
private static final long serialVersionUID = 0L;
  // Use historyStruct.newBuilder() to construct.
  private historyStruct(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private historyStruct() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private historyStruct(
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
          case 9: {

            timestamp_ = input.readDouble();
            break;
          }
          case 17: {

            value_ = input.readDouble();
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
    return com.microservice.k8sclient.grpc.PredictResourceProto.internal_static_historyStruct_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.microservice.k8sclient.grpc.PredictResourceProto.internal_static_historyStruct_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.microservice.k8sclient.grpc.historyStruct.class, com.microservice.k8sclient.grpc.historyStruct.Builder.class);
  }

  public static final int TIMESTAMP_FIELD_NUMBER = 1;
  private double timestamp_;
  /**
   * <code>double timestamp = 1;</code>
   */
  public double getTimestamp() {
    return timestamp_;
  }

  public static final int VALUE_FIELD_NUMBER = 2;
  private double value_;
  /**
   * <code>double value = 2;</code>
   */
  public double getValue() {
    return value_;
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
    if (timestamp_ != 0D) {
      output.writeDouble(1, timestamp_);
    }
    if (value_ != 0D) {
      output.writeDouble(2, value_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (timestamp_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(1, timestamp_);
    }
    if (value_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(2, value_);
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
    if (!(obj instanceof com.microservice.k8sclient.grpc.historyStruct)) {
      return super.equals(obj);
    }
    com.microservice.k8sclient.grpc.historyStruct other = (com.microservice.k8sclient.grpc.historyStruct) obj;

    if (java.lang.Double.doubleToLongBits(getTimestamp())
        != java.lang.Double.doubleToLongBits(
            other.getTimestamp())) return false;
    if (java.lang.Double.doubleToLongBits(getValue())
        != java.lang.Double.doubleToLongBits(
            other.getValue())) return false;
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
    hash = (37 * hash) + TIMESTAMP_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getTimestamp()));
    hash = (37 * hash) + VALUE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getValue()));
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.microservice.k8sclient.grpc.historyStruct parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.microservice.k8sclient.grpc.historyStruct parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.microservice.k8sclient.grpc.historyStruct parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.microservice.k8sclient.grpc.historyStruct parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.microservice.k8sclient.grpc.historyStruct parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.microservice.k8sclient.grpc.historyStruct parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.microservice.k8sclient.grpc.historyStruct parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.microservice.k8sclient.grpc.historyStruct parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.microservice.k8sclient.grpc.historyStruct parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.microservice.k8sclient.grpc.historyStruct parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.microservice.k8sclient.grpc.historyStruct parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.microservice.k8sclient.grpc.historyStruct parseFrom(
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
  public static Builder newBuilder(com.microservice.k8sclient.grpc.historyStruct prototype) {
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
   * Protobuf type {@code historyStruct}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:historyStruct)
      com.microservice.k8sclient.grpc.historyStructOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.microservice.k8sclient.grpc.PredictResourceProto.internal_static_historyStruct_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.microservice.k8sclient.grpc.PredictResourceProto.internal_static_historyStruct_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.microservice.k8sclient.grpc.historyStruct.class, com.microservice.k8sclient.grpc.historyStruct.Builder.class);
    }

    // Construct using com.microservice.k8sclient.grpc.historyStruct.newBuilder()
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
      timestamp_ = 0D;

      value_ = 0D;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.microservice.k8sclient.grpc.PredictResourceProto.internal_static_historyStruct_descriptor;
    }

    @java.lang.Override
    public com.microservice.k8sclient.grpc.historyStruct getDefaultInstanceForType() {
      return com.microservice.k8sclient.grpc.historyStruct.getDefaultInstance();
    }

    @java.lang.Override
    public com.microservice.k8sclient.grpc.historyStruct build() {
      com.microservice.k8sclient.grpc.historyStruct result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.microservice.k8sclient.grpc.historyStruct buildPartial() {
      com.microservice.k8sclient.grpc.historyStruct result = new com.microservice.k8sclient.grpc.historyStruct(this);
      result.timestamp_ = timestamp_;
      result.value_ = value_;
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
      if (other instanceof com.microservice.k8sclient.grpc.historyStruct) {
        return mergeFrom((com.microservice.k8sclient.grpc.historyStruct)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.microservice.k8sclient.grpc.historyStruct other) {
      if (other == com.microservice.k8sclient.grpc.historyStruct.getDefaultInstance()) return this;
      if (other.getTimestamp() != 0D) {
        setTimestamp(other.getTimestamp());
      }
      if (other.getValue() != 0D) {
        setValue(other.getValue());
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
      com.microservice.k8sclient.grpc.historyStruct parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.microservice.k8sclient.grpc.historyStruct) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private double timestamp_ ;
    /**
     * <code>double timestamp = 1;</code>
     */
    public double getTimestamp() {
      return timestamp_;
    }
    /**
     * <code>double timestamp = 1;</code>
     */
    public Builder setTimestamp(double value) {
      
      timestamp_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double timestamp = 1;</code>
     */
    public Builder clearTimestamp() {
      
      timestamp_ = 0D;
      onChanged();
      return this;
    }

    private double value_ ;
    /**
     * <code>double value = 2;</code>
     */
    public double getValue() {
      return value_;
    }
    /**
     * <code>double value = 2;</code>
     */
    public Builder setValue(double value) {
      
      value_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double value = 2;</code>
     */
    public Builder clearValue() {
      
      value_ = 0D;
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


    // @@protoc_insertion_point(builder_scope:historyStruct)
  }

  // @@protoc_insertion_point(class_scope:historyStruct)
  private static final com.microservice.k8sclient.grpc.historyStruct DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.microservice.k8sclient.grpc.historyStruct();
  }

  public static com.microservice.k8sclient.grpc.historyStruct getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<historyStruct>
      PARSER = new com.google.protobuf.AbstractParser<historyStruct>() {
    @java.lang.Override
    public historyStruct parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new historyStruct(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<historyStruct> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<historyStruct> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.microservice.k8sclient.grpc.historyStruct getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

