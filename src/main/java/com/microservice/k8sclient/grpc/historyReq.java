// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: predict.proto

package com.microservice.k8sclient.grpc;

/**
 * Protobuf type {@code historyReq}
 */
public  final class historyReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:historyReq)
    historyReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use historyReq.newBuilder() to construct.
  private historyReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private historyReq() {
    data_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private historyReq(
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
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              data_ = new java.util.ArrayList<com.microservice.k8sclient.grpc.historyStruct>();
              mutable_bitField0_ |= 0x00000001;
            }
            data_.add(
                input.readMessage(com.microservice.k8sclient.grpc.historyStruct.parser(), extensionRegistry));
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
        data_ = java.util.Collections.unmodifiableList(data_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.microservice.k8sclient.grpc.PredictResourceProto.internal_static_historyReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.microservice.k8sclient.grpc.PredictResourceProto.internal_static_historyReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.microservice.k8sclient.grpc.historyReq.class, com.microservice.k8sclient.grpc.historyReq.Builder.class);
  }

  public static final int DATA_FIELD_NUMBER = 1;
  private java.util.List<com.microservice.k8sclient.grpc.historyStruct> data_;
  /**
   * <code>repeated .historyStruct data = 1;</code>
   */
  public java.util.List<com.microservice.k8sclient.grpc.historyStruct> getDataList() {
    return data_;
  }
  /**
   * <code>repeated .historyStruct data = 1;</code>
   */
  public java.util.List<? extends com.microservice.k8sclient.grpc.historyStructOrBuilder> 
      getDataOrBuilderList() {
    return data_;
  }
  /**
   * <code>repeated .historyStruct data = 1;</code>
   */
  public int getDataCount() {
    return data_.size();
  }
  /**
   * <code>repeated .historyStruct data = 1;</code>
   */
  public com.microservice.k8sclient.grpc.historyStruct getData(int index) {
    return data_.get(index);
  }
  /**
   * <code>repeated .historyStruct data = 1;</code>
   */
  public com.microservice.k8sclient.grpc.historyStructOrBuilder getDataOrBuilder(
      int index) {
    return data_.get(index);
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
    for (int i = 0; i < data_.size(); i++) {
      output.writeMessage(1, data_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < data_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, data_.get(i));
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
    if (!(obj instanceof com.microservice.k8sclient.grpc.historyReq)) {
      return super.equals(obj);
    }
    com.microservice.k8sclient.grpc.historyReq other = (com.microservice.k8sclient.grpc.historyReq) obj;

    if (!getDataList()
        .equals(other.getDataList())) return false;
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
    if (getDataCount() > 0) {
      hash = (37 * hash) + DATA_FIELD_NUMBER;
      hash = (53 * hash) + getDataList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.microservice.k8sclient.grpc.historyReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.microservice.k8sclient.grpc.historyReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.microservice.k8sclient.grpc.historyReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.microservice.k8sclient.grpc.historyReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.microservice.k8sclient.grpc.historyReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.microservice.k8sclient.grpc.historyReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.microservice.k8sclient.grpc.historyReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.microservice.k8sclient.grpc.historyReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.microservice.k8sclient.grpc.historyReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.microservice.k8sclient.grpc.historyReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.microservice.k8sclient.grpc.historyReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.microservice.k8sclient.grpc.historyReq parseFrom(
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
  public static Builder newBuilder(com.microservice.k8sclient.grpc.historyReq prototype) {
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
   * Protobuf type {@code historyReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:historyReq)
      com.microservice.k8sclient.grpc.historyReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.microservice.k8sclient.grpc.PredictResourceProto.internal_static_historyReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.microservice.k8sclient.grpc.PredictResourceProto.internal_static_historyReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.microservice.k8sclient.grpc.historyReq.class, com.microservice.k8sclient.grpc.historyReq.Builder.class);
    }

    // Construct using com.microservice.k8sclient.grpc.historyReq.newBuilder()
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
        getDataFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (dataBuilder_ == null) {
        data_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        dataBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.microservice.k8sclient.grpc.PredictResourceProto.internal_static_historyReq_descriptor;
    }

    @java.lang.Override
    public com.microservice.k8sclient.grpc.historyReq getDefaultInstanceForType() {
      return com.microservice.k8sclient.grpc.historyReq.getDefaultInstance();
    }

    @java.lang.Override
    public com.microservice.k8sclient.grpc.historyReq build() {
      com.microservice.k8sclient.grpc.historyReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.microservice.k8sclient.grpc.historyReq buildPartial() {
      com.microservice.k8sclient.grpc.historyReq result = new com.microservice.k8sclient.grpc.historyReq(this);
      int from_bitField0_ = bitField0_;
      if (dataBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          data_ = java.util.Collections.unmodifiableList(data_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.data_ = data_;
      } else {
        result.data_ = dataBuilder_.build();
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
      if (other instanceof com.microservice.k8sclient.grpc.historyReq) {
        return mergeFrom((com.microservice.k8sclient.grpc.historyReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.microservice.k8sclient.grpc.historyReq other) {
      if (other == com.microservice.k8sclient.grpc.historyReq.getDefaultInstance()) return this;
      if (dataBuilder_ == null) {
        if (!other.data_.isEmpty()) {
          if (data_.isEmpty()) {
            data_ = other.data_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureDataIsMutable();
            data_.addAll(other.data_);
          }
          onChanged();
        }
      } else {
        if (!other.data_.isEmpty()) {
          if (dataBuilder_.isEmpty()) {
            dataBuilder_.dispose();
            dataBuilder_ = null;
            data_ = other.data_;
            bitField0_ = (bitField0_ & ~0x00000001);
            dataBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getDataFieldBuilder() : null;
          } else {
            dataBuilder_.addAllMessages(other.data_);
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
      com.microservice.k8sclient.grpc.historyReq parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.microservice.k8sclient.grpc.historyReq) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.microservice.k8sclient.grpc.historyStruct> data_ =
      java.util.Collections.emptyList();
    private void ensureDataIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        data_ = new java.util.ArrayList<com.microservice.k8sclient.grpc.historyStruct>(data_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.microservice.k8sclient.grpc.historyStruct, com.microservice.k8sclient.grpc.historyStruct.Builder, com.microservice.k8sclient.grpc.historyStructOrBuilder> dataBuilder_;

    /**
     * <code>repeated .historyStruct data = 1;</code>
     */
    public java.util.List<com.microservice.k8sclient.grpc.historyStruct> getDataList() {
      if (dataBuilder_ == null) {
        return java.util.Collections.unmodifiableList(data_);
      } else {
        return dataBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .historyStruct data = 1;</code>
     */
    public int getDataCount() {
      if (dataBuilder_ == null) {
        return data_.size();
      } else {
        return dataBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .historyStruct data = 1;</code>
     */
    public com.microservice.k8sclient.grpc.historyStruct getData(int index) {
      if (dataBuilder_ == null) {
        return data_.get(index);
      } else {
        return dataBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .historyStruct data = 1;</code>
     */
    public Builder setData(
        int index, com.microservice.k8sclient.grpc.historyStruct value) {
      if (dataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDataIsMutable();
        data_.set(index, value);
        onChanged();
      } else {
        dataBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .historyStruct data = 1;</code>
     */
    public Builder setData(
        int index, com.microservice.k8sclient.grpc.historyStruct.Builder builderForValue) {
      if (dataBuilder_ == null) {
        ensureDataIsMutable();
        data_.set(index, builderForValue.build());
        onChanged();
      } else {
        dataBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .historyStruct data = 1;</code>
     */
    public Builder addData(com.microservice.k8sclient.grpc.historyStruct value) {
      if (dataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDataIsMutable();
        data_.add(value);
        onChanged();
      } else {
        dataBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .historyStruct data = 1;</code>
     */
    public Builder addData(
        int index, com.microservice.k8sclient.grpc.historyStruct value) {
      if (dataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDataIsMutable();
        data_.add(index, value);
        onChanged();
      } else {
        dataBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .historyStruct data = 1;</code>
     */
    public Builder addData(
        com.microservice.k8sclient.grpc.historyStruct.Builder builderForValue) {
      if (dataBuilder_ == null) {
        ensureDataIsMutable();
        data_.add(builderForValue.build());
        onChanged();
      } else {
        dataBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .historyStruct data = 1;</code>
     */
    public Builder addData(
        int index, com.microservice.k8sclient.grpc.historyStruct.Builder builderForValue) {
      if (dataBuilder_ == null) {
        ensureDataIsMutable();
        data_.add(index, builderForValue.build());
        onChanged();
      } else {
        dataBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .historyStruct data = 1;</code>
     */
    public Builder addAllData(
        java.lang.Iterable<? extends com.microservice.k8sclient.grpc.historyStruct> values) {
      if (dataBuilder_ == null) {
        ensureDataIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, data_);
        onChanged();
      } else {
        dataBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .historyStruct data = 1;</code>
     */
    public Builder clearData() {
      if (dataBuilder_ == null) {
        data_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        dataBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .historyStruct data = 1;</code>
     */
    public Builder removeData(int index) {
      if (dataBuilder_ == null) {
        ensureDataIsMutable();
        data_.remove(index);
        onChanged();
      } else {
        dataBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .historyStruct data = 1;</code>
     */
    public com.microservice.k8sclient.grpc.historyStruct.Builder getDataBuilder(
        int index) {
      return getDataFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .historyStruct data = 1;</code>
     */
    public com.microservice.k8sclient.grpc.historyStructOrBuilder getDataOrBuilder(
        int index) {
      if (dataBuilder_ == null) {
        return data_.get(index);  } else {
        return dataBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .historyStruct data = 1;</code>
     */
    public java.util.List<? extends com.microservice.k8sclient.grpc.historyStructOrBuilder> 
         getDataOrBuilderList() {
      if (dataBuilder_ != null) {
        return dataBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(data_);
      }
    }
    /**
     * <code>repeated .historyStruct data = 1;</code>
     */
    public com.microservice.k8sclient.grpc.historyStruct.Builder addDataBuilder() {
      return getDataFieldBuilder().addBuilder(
          com.microservice.k8sclient.grpc.historyStruct.getDefaultInstance());
    }
    /**
     * <code>repeated .historyStruct data = 1;</code>
     */
    public com.microservice.k8sclient.grpc.historyStruct.Builder addDataBuilder(
        int index) {
      return getDataFieldBuilder().addBuilder(
          index, com.microservice.k8sclient.grpc.historyStruct.getDefaultInstance());
    }
    /**
     * <code>repeated .historyStruct data = 1;</code>
     */
    public java.util.List<com.microservice.k8sclient.grpc.historyStruct.Builder> 
         getDataBuilderList() {
      return getDataFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.microservice.k8sclient.grpc.historyStruct, com.microservice.k8sclient.grpc.historyStruct.Builder, com.microservice.k8sclient.grpc.historyStructOrBuilder> 
        getDataFieldBuilder() {
      if (dataBuilder_ == null) {
        dataBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.microservice.k8sclient.grpc.historyStruct, com.microservice.k8sclient.grpc.historyStruct.Builder, com.microservice.k8sclient.grpc.historyStructOrBuilder>(
                data_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        data_ = null;
      }
      return dataBuilder_;
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


    // @@protoc_insertion_point(builder_scope:historyReq)
  }

  // @@protoc_insertion_point(class_scope:historyReq)
  private static final com.microservice.k8sclient.grpc.historyReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.microservice.k8sclient.grpc.historyReq();
  }

  public static com.microservice.k8sclient.grpc.historyReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<historyReq>
      PARSER = new com.google.protobuf.AbstractParser<historyReq>() {
    @java.lang.Override
    public historyReq parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new historyReq(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<historyReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<historyReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.microservice.k8sclient.grpc.historyReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

