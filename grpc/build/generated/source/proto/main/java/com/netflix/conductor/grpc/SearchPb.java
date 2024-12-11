// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/search.proto

package com.netflix.conductor.grpc;

public final class SearchPb {
  private SearchPb() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface RequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:conductor.grpc.search.Request)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 start = 1;</code>
     * @return The start.
     */
    int getStart();

    /**
     * <code>int32 size = 2;</code>
     * @return The size.
     */
    int getSize();

    /**
     * <code>string sort = 3;</code>
     * @return The sort.
     */
    java.lang.String getSort();
    /**
     * <code>string sort = 3;</code>
     * @return The bytes for sort.
     */
    com.google.protobuf.ByteString
        getSortBytes();

    /**
     * <code>string free_text = 4;</code>
     * @return The freeText.
     */
    java.lang.String getFreeText();
    /**
     * <code>string free_text = 4;</code>
     * @return The bytes for freeText.
     */
    com.google.protobuf.ByteString
        getFreeTextBytes();

    /**
     * <code>string query = 5;</code>
     * @return The query.
     */
    java.lang.String getQuery();
    /**
     * <code>string query = 5;</code>
     * @return The bytes for query.
     */
    com.google.protobuf.ByteString
        getQueryBytes();
  }
  /**
   * Protobuf type {@code conductor.grpc.search.Request}
   */
  public static final class Request extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:conductor.grpc.search.Request)
      RequestOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Request.newBuilder() to construct.
    private Request(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Request() {
      sort_ = "";
      freeText_ = "";
      query_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Request();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.netflix.conductor.grpc.SearchPb.internal_static_conductor_grpc_search_Request_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.netflix.conductor.grpc.SearchPb.internal_static_conductor_grpc_search_Request_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.netflix.conductor.grpc.SearchPb.Request.class, com.netflix.conductor.grpc.SearchPb.Request.Builder.class);
    }

    public static final int START_FIELD_NUMBER = 1;
    private int start_ = 0;
    /**
     * <code>int32 start = 1;</code>
     * @return The start.
     */
    @java.lang.Override
    public int getStart() {
      return start_;
    }

    public static final int SIZE_FIELD_NUMBER = 2;
    private int size_ = 0;
    /**
     * <code>int32 size = 2;</code>
     * @return The size.
     */
    @java.lang.Override
    public int getSize() {
      return size_;
    }

    public static final int SORT_FIELD_NUMBER = 3;
    @SuppressWarnings("serial")
    private volatile java.lang.Object sort_ = "";
    /**
     * <code>string sort = 3;</code>
     * @return The sort.
     */
    @java.lang.Override
    public java.lang.String getSort() {
      java.lang.Object ref = sort_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        sort_ = s;
        return s;
      }
    }
    /**
     * <code>string sort = 3;</code>
     * @return The bytes for sort.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getSortBytes() {
      java.lang.Object ref = sort_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        sort_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int FREE_TEXT_FIELD_NUMBER = 4;
    @SuppressWarnings("serial")
    private volatile java.lang.Object freeText_ = "";
    /**
     * <code>string free_text = 4;</code>
     * @return The freeText.
     */
    @java.lang.Override
    public java.lang.String getFreeText() {
      java.lang.Object ref = freeText_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        freeText_ = s;
        return s;
      }
    }
    /**
     * <code>string free_text = 4;</code>
     * @return The bytes for freeText.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getFreeTextBytes() {
      java.lang.Object ref = freeText_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        freeText_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int QUERY_FIELD_NUMBER = 5;
    @SuppressWarnings("serial")
    private volatile java.lang.Object query_ = "";
    /**
     * <code>string query = 5;</code>
     * @return The query.
     */
    @java.lang.Override
    public java.lang.String getQuery() {
      java.lang.Object ref = query_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        query_ = s;
        return s;
      }
    }
    /**
     * <code>string query = 5;</code>
     * @return The bytes for query.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getQueryBytes() {
      java.lang.Object ref = query_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        query_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
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
      if (start_ != 0) {
        output.writeInt32(1, start_);
      }
      if (size_ != 0) {
        output.writeInt32(2, size_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(sort_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, sort_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(freeText_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 4, freeText_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(query_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 5, query_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (start_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, start_);
      }
      if (size_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, size_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(sort_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, sort_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(freeText_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, freeText_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(query_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, query_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.netflix.conductor.grpc.SearchPb.Request)) {
        return super.equals(obj);
      }
      com.netflix.conductor.grpc.SearchPb.Request other = (com.netflix.conductor.grpc.SearchPb.Request) obj;

      if (getStart()
          != other.getStart()) return false;
      if (getSize()
          != other.getSize()) return false;
      if (!getSort()
          .equals(other.getSort())) return false;
      if (!getFreeText()
          .equals(other.getFreeText())) return false;
      if (!getQuery()
          .equals(other.getQuery())) return false;
      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + START_FIELD_NUMBER;
      hash = (53 * hash) + getStart();
      hash = (37 * hash) + SIZE_FIELD_NUMBER;
      hash = (53 * hash) + getSize();
      hash = (37 * hash) + SORT_FIELD_NUMBER;
      hash = (53 * hash) + getSort().hashCode();
      hash = (37 * hash) + FREE_TEXT_FIELD_NUMBER;
      hash = (53 * hash) + getFreeText().hashCode();
      hash = (37 * hash) + QUERY_FIELD_NUMBER;
      hash = (53 * hash) + getQuery().hashCode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.netflix.conductor.grpc.SearchPb.Request parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.netflix.conductor.grpc.SearchPb.Request parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.netflix.conductor.grpc.SearchPb.Request parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.netflix.conductor.grpc.SearchPb.Request parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.netflix.conductor.grpc.SearchPb.Request parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.netflix.conductor.grpc.SearchPb.Request parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.netflix.conductor.grpc.SearchPb.Request parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.netflix.conductor.grpc.SearchPb.Request parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.netflix.conductor.grpc.SearchPb.Request parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.netflix.conductor.grpc.SearchPb.Request parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.netflix.conductor.grpc.SearchPb.Request parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.netflix.conductor.grpc.SearchPb.Request parseFrom(
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
    public static Builder newBuilder(com.netflix.conductor.grpc.SearchPb.Request prototype) {
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
     * Protobuf type {@code conductor.grpc.search.Request}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:conductor.grpc.search.Request)
        com.netflix.conductor.grpc.SearchPb.RequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.netflix.conductor.grpc.SearchPb.internal_static_conductor_grpc_search_Request_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.netflix.conductor.grpc.SearchPb.internal_static_conductor_grpc_search_Request_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.netflix.conductor.grpc.SearchPb.Request.class, com.netflix.conductor.grpc.SearchPb.Request.Builder.class);
      }

      // Construct using com.netflix.conductor.grpc.SearchPb.Request.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        start_ = 0;
        size_ = 0;
        sort_ = "";
        freeText_ = "";
        query_ = "";
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.netflix.conductor.grpc.SearchPb.internal_static_conductor_grpc_search_Request_descriptor;
      }

      @java.lang.Override
      public com.netflix.conductor.grpc.SearchPb.Request getDefaultInstanceForType() {
        return com.netflix.conductor.grpc.SearchPb.Request.getDefaultInstance();
      }

      @java.lang.Override
      public com.netflix.conductor.grpc.SearchPb.Request build() {
        com.netflix.conductor.grpc.SearchPb.Request result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.netflix.conductor.grpc.SearchPb.Request buildPartial() {
        com.netflix.conductor.grpc.SearchPb.Request result = new com.netflix.conductor.grpc.SearchPb.Request(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(com.netflix.conductor.grpc.SearchPb.Request result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.start_ = start_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.size_ = size_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.sort_ = sort_;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.freeText_ = freeText_;
        }
        if (((from_bitField0_ & 0x00000010) != 0)) {
          result.query_ = query_;
        }
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
        if (other instanceof com.netflix.conductor.grpc.SearchPb.Request) {
          return mergeFrom((com.netflix.conductor.grpc.SearchPb.Request)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.netflix.conductor.grpc.SearchPb.Request other) {
        if (other == com.netflix.conductor.grpc.SearchPb.Request.getDefaultInstance()) return this;
        if (other.getStart() != 0) {
          setStart(other.getStart());
        }
        if (other.getSize() != 0) {
          setSize(other.getSize());
        }
        if (!other.getSort().isEmpty()) {
          sort_ = other.sort_;
          bitField0_ |= 0x00000004;
          onChanged();
        }
        if (!other.getFreeText().isEmpty()) {
          freeText_ = other.freeText_;
          bitField0_ |= 0x00000008;
          onChanged();
        }
        if (!other.getQuery().isEmpty()) {
          query_ = other.query_;
          bitField0_ |= 0x00000010;
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
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
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 8: {
                start_ = input.readInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
              case 16: {
                size_ = input.readInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
              case 26: {
                sort_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000004;
                break;
              } // case 26
              case 34: {
                freeText_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000008;
                break;
              } // case 34
              case 42: {
                query_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000010;
                break;
              } // case 42
              default: {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
            } // switch (tag)
          } // while (!done)
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.unwrapIOException();
        } finally {
          onChanged();
        } // finally
        return this;
      }
      private int bitField0_;

      private int start_ ;
      /**
       * <code>int32 start = 1;</code>
       * @return The start.
       */
      @java.lang.Override
      public int getStart() {
        return start_;
      }
      /**
       * <code>int32 start = 1;</code>
       * @param value The start to set.
       * @return This builder for chaining.
       */
      public Builder setStart(int value) {
        
        start_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>int32 start = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearStart() {
        bitField0_ = (bitField0_ & ~0x00000001);
        start_ = 0;
        onChanged();
        return this;
      }

      private int size_ ;
      /**
       * <code>int32 size = 2;</code>
       * @return The size.
       */
      @java.lang.Override
      public int getSize() {
        return size_;
      }
      /**
       * <code>int32 size = 2;</code>
       * @param value The size to set.
       * @return This builder for chaining.
       */
      public Builder setSize(int value) {
        
        size_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>int32 size = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearSize() {
        bitField0_ = (bitField0_ & ~0x00000002);
        size_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object sort_ = "";
      /**
       * <code>string sort = 3;</code>
       * @return The sort.
       */
      public java.lang.String getSort() {
        java.lang.Object ref = sort_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          sort_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string sort = 3;</code>
       * @return The bytes for sort.
       */
      public com.google.protobuf.ByteString
          getSortBytes() {
        java.lang.Object ref = sort_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          sort_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string sort = 3;</code>
       * @param value The sort to set.
       * @return This builder for chaining.
       */
      public Builder setSort(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        sort_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>string sort = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearSort() {
        sort_ = getDefaultInstance().getSort();
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
        return this;
      }
      /**
       * <code>string sort = 3;</code>
       * @param value The bytes for sort to set.
       * @return This builder for chaining.
       */
      public Builder setSortBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        sort_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }

      private java.lang.Object freeText_ = "";
      /**
       * <code>string free_text = 4;</code>
       * @return The freeText.
       */
      public java.lang.String getFreeText() {
        java.lang.Object ref = freeText_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          freeText_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string free_text = 4;</code>
       * @return The bytes for freeText.
       */
      public com.google.protobuf.ByteString
          getFreeTextBytes() {
        java.lang.Object ref = freeText_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          freeText_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string free_text = 4;</code>
       * @param value The freeText to set.
       * @return This builder for chaining.
       */
      public Builder setFreeText(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        freeText_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>string free_text = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearFreeText() {
        freeText_ = getDefaultInstance().getFreeText();
        bitField0_ = (bitField0_ & ~0x00000008);
        onChanged();
        return this;
      }
      /**
       * <code>string free_text = 4;</code>
       * @param value The bytes for freeText to set.
       * @return This builder for chaining.
       */
      public Builder setFreeTextBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        freeText_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }

      private java.lang.Object query_ = "";
      /**
       * <code>string query = 5;</code>
       * @return The query.
       */
      public java.lang.String getQuery() {
        java.lang.Object ref = query_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          query_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string query = 5;</code>
       * @return The bytes for query.
       */
      public com.google.protobuf.ByteString
          getQueryBytes() {
        java.lang.Object ref = query_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          query_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string query = 5;</code>
       * @param value The query to set.
       * @return This builder for chaining.
       */
      public Builder setQuery(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        query_ = value;
        bitField0_ |= 0x00000010;
        onChanged();
        return this;
      }
      /**
       * <code>string query = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearQuery() {
        query_ = getDefaultInstance().getQuery();
        bitField0_ = (bitField0_ & ~0x00000010);
        onChanged();
        return this;
      }
      /**
       * <code>string query = 5;</code>
       * @param value The bytes for query to set.
       * @return This builder for chaining.
       */
      public Builder setQueryBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        query_ = value;
        bitField0_ |= 0x00000010;
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


      // @@protoc_insertion_point(builder_scope:conductor.grpc.search.Request)
    }

    // @@protoc_insertion_point(class_scope:conductor.grpc.search.Request)
    private static final com.netflix.conductor.grpc.SearchPb.Request DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.netflix.conductor.grpc.SearchPb.Request();
    }

    public static com.netflix.conductor.grpc.SearchPb.Request getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Request>
        PARSER = new com.google.protobuf.AbstractParser<Request>() {
      @java.lang.Override
      public Request parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        Builder builder = newBuilder();
        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(builder.buildPartial());
        } catch (com.google.protobuf.UninitializedMessageException e) {
          throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(e)
              .setUnfinishedMessage(builder.buildPartial());
        }
        return builder.buildPartial();
      }
    };

    public static com.google.protobuf.Parser<Request> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Request> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.netflix.conductor.grpc.SearchPb.Request getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_conductor_grpc_search_Request_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_conductor_grpc_search_Request_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021grpc/search.proto\022\025conductor.grpc.sear" +
      "ch\"V\n\007Request\022\r\n\005start\030\001 \001(\005\022\014\n\004size\030\002 \001" +
      "(\005\022\014\n\004sort\030\003 \001(\t\022\021\n\tfree_text\030\004 \001(\t\022\r\n\005q" +
      "uery\030\005 \001(\tBh\n\032com.netflix.conductor.grpc" +
      "B\010SearchPbZ@github.com/netflix/conductor" +
      "/client/gogrpc/conductor/grpc/searchb\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_conductor_grpc_search_Request_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_conductor_grpc_search_Request_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_conductor_grpc_search_Request_descriptor,
        new java.lang.String[] { "Start", "Size", "Sort", "FreeText", "Query", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
