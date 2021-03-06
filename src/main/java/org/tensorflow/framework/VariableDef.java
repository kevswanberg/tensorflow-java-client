// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: variable.proto

package org.tensorflow.framework;

/**
 * <pre>
 * Protocol buffer representing a Variable.
 * </pre>
 *
 * Protobuf type {@code tensorflow.VariableDef}
 */
public  final class VariableDef extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tensorflow.VariableDef)
    VariableDefOrBuilder {
  // Use VariableDef.newBuilder() to construct.
  private VariableDef(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VariableDef() {
    variableName_ = "";
    initializerName_ = "";
    snapshotName_ = "";
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private VariableDef(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            String s = input.readStringRequireUtf8();

            variableName_ = s;
            break;
          }
          case 18: {
            String s = input.readStringRequireUtf8();

            initializerName_ = s;
            break;
          }
          case 26: {
            String s = input.readStringRequireUtf8();

            snapshotName_ = s;
            break;
          }
          case 34: {
            SaveSliceInfoDef.Builder subBuilder = null;
            if (saveSliceInfoDef_ != null) {
              subBuilder = saveSliceInfoDef_.toBuilder();
            }
            saveSliceInfoDef_ = input.readMessage(SaveSliceInfoDef.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(saveSliceInfoDef_);
              saveSliceInfoDef_ = subBuilder.buildPartial();
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
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.tensorflow.framework.VariableProtos.internal_static_tensorflow_VariableDef_descriptor;
  }

  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.tensorflow.framework.VariableProtos.internal_static_tensorflow_VariableDef_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            VariableDef.class, Builder.class);
  }

  public static final int VARIABLE_NAME_FIELD_NUMBER = 1;
  private volatile Object variableName_;
  /**
   * <pre>
   * Name of the variable tensor.
   * </pre>
   *
   * <code>optional string variable_name = 1;</code>
   */
  public String getVariableName() {
    Object ref = variableName_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      variableName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Name of the variable tensor.
   * </pre>
   *
   * <code>optional string variable_name = 1;</code>
   */
  public com.google.protobuf.ByteString
      getVariableNameBytes() {
    Object ref = variableName_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      variableName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int INITIALIZER_NAME_FIELD_NUMBER = 2;
  private volatile Object initializerName_;
  /**
   * <pre>
   * Name of the initializer op.
   * </pre>
   *
   * <code>optional string initializer_name = 2;</code>
   */
  public String getInitializerName() {
    Object ref = initializerName_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      initializerName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Name of the initializer op.
   * </pre>
   *
   * <code>optional string initializer_name = 2;</code>
   */
  public com.google.protobuf.ByteString
      getInitializerNameBytes() {
    Object ref = initializerName_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      initializerName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SNAPSHOT_NAME_FIELD_NUMBER = 3;
  private volatile Object snapshotName_;
  /**
   * <pre>
   * Name of the snapshot tensor.
   * </pre>
   *
   * <code>optional string snapshot_name = 3;</code>
   */
  public String getSnapshotName() {
    Object ref = snapshotName_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      snapshotName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Name of the snapshot tensor.
   * </pre>
   *
   * <code>optional string snapshot_name = 3;</code>
   */
  public com.google.protobuf.ByteString
      getSnapshotNameBytes() {
    Object ref = snapshotName_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      snapshotName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SAVE_SLICE_INFO_DEF_FIELD_NUMBER = 4;
  private SaveSliceInfoDef saveSliceInfoDef_;
  /**
   * <pre>
   * Support for saving variables as slices of a larger variable.
   * </pre>
   *
   * <code>optional .tensorflow.SaveSliceInfoDef save_slice_info_def = 4;</code>
   */
  public boolean hasSaveSliceInfoDef() {
    return saveSliceInfoDef_ != null;
  }
  /**
   * <pre>
   * Support for saving variables as slices of a larger variable.
   * </pre>
   *
   * <code>optional .tensorflow.SaveSliceInfoDef save_slice_info_def = 4;</code>
   */
  public SaveSliceInfoDef getSaveSliceInfoDef() {
    return saveSliceInfoDef_ == null ? SaveSliceInfoDef.getDefaultInstance() : saveSliceInfoDef_;
  }
  /**
   * <pre>
   * Support for saving variables as slices of a larger variable.
   * </pre>
   *
   * <code>optional .tensorflow.SaveSliceInfoDef save_slice_info_def = 4;</code>
   */
  public SaveSliceInfoDefOrBuilder getSaveSliceInfoDefOrBuilder() {
    return getSaveSliceInfoDef();
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
    if (!getVariableNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, variableName_);
    }
    if (!getInitializerNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, initializerName_);
    }
    if (!getSnapshotNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, snapshotName_);
    }
    if (saveSliceInfoDef_ != null) {
      output.writeMessage(4, getSaveSliceInfoDef());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getVariableNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, variableName_);
    }
    if (!getInitializerNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, initializerName_);
    }
    if (!getSnapshotNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, snapshotName_);
    }
    if (saveSliceInfoDef_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getSaveSliceInfoDef());
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @Override
  public boolean equals(final Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof VariableDef)) {
      return super.equals(obj);
    }
    VariableDef other = (VariableDef) obj;

    boolean result = true;
    result = result && getVariableName()
        .equals(other.getVariableName());
    result = result && getInitializerName()
        .equals(other.getInitializerName());
    result = result && getSnapshotName()
        .equals(other.getSnapshotName());
    result = result && (hasSaveSliceInfoDef() == other.hasSaveSliceInfoDef());
    if (hasSaveSliceInfoDef()) {
      result = result && getSaveSliceInfoDef()
          .equals(other.getSaveSliceInfoDef());
    }
    return result;
  }

  @Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    hash = (37 * hash) + VARIABLE_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getVariableName().hashCode();
    hash = (37 * hash) + INITIALIZER_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getInitializerName().hashCode();
    hash = (37 * hash) + SNAPSHOT_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getSnapshotName().hashCode();
    if (hasSaveSliceInfoDef()) {
      hash = (37 * hash) + SAVE_SLICE_INFO_DEF_FIELD_NUMBER;
      hash = (53 * hash) + getSaveSliceInfoDef().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static VariableDef parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static VariableDef parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static VariableDef parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static VariableDef parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static VariableDef parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static VariableDef parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static VariableDef parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static VariableDef parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static VariableDef parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static VariableDef parseFrom(
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
  public static Builder newBuilder(VariableDef prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @Override
  protected Builder newBuilderForType(
      BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Protocol buffer representing a Variable.
   * </pre>
   *
   * Protobuf type {@code tensorflow.VariableDef}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tensorflow.VariableDef)
      org.tensorflow.framework.VariableDefOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.tensorflow.framework.VariableProtos.internal_static_tensorflow_VariableDef_descriptor;
    }

    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.tensorflow.framework.VariableProtos.internal_static_tensorflow_VariableDef_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              VariableDef.class, Builder.class);
    }

    // Construct using org.tensorflow.framework.VariableDef.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        BuilderParent parent) {
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
      variableName_ = "";

      initializerName_ = "";

      snapshotName_ = "";

      if (saveSliceInfoDefBuilder_ == null) {
        saveSliceInfoDef_ = null;
      } else {
        saveSliceInfoDef_ = null;
        saveSliceInfoDefBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.tensorflow.framework.VariableProtos.internal_static_tensorflow_VariableDef_descriptor;
    }

    public VariableDef getDefaultInstanceForType() {
      return VariableDef.getDefaultInstance();
    }

    public VariableDef build() {
      VariableDef result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public VariableDef buildPartial() {
      VariableDef result = new VariableDef(this);
      result.variableName_ = variableName_;
      result.initializerName_ = initializerName_;
      result.snapshotName_ = snapshotName_;
      if (saveSliceInfoDefBuilder_ == null) {
        result.saveSliceInfoDef_ = saveSliceInfoDef_;
      } else {
        result.saveSliceInfoDef_ = saveSliceInfoDefBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
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
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof VariableDef) {
        return mergeFrom((VariableDef)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(VariableDef other) {
      if (other == VariableDef.getDefaultInstance()) return this;
      if (!other.getVariableName().isEmpty()) {
        variableName_ = other.variableName_;
        onChanged();
      }
      if (!other.getInitializerName().isEmpty()) {
        initializerName_ = other.initializerName_;
        onChanged();
      }
      if (!other.getSnapshotName().isEmpty()) {
        snapshotName_ = other.snapshotName_;
        onChanged();
      }
      if (other.hasSaveSliceInfoDef()) {
        mergeSaveSliceInfoDef(other.getSaveSliceInfoDef());
      }
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
      VariableDef parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (VariableDef) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private Object variableName_ = "";
    /**
     * <pre>
     * Name of the variable tensor.
     * </pre>
     *
     * <code>optional string variable_name = 1;</code>
     */
    public String getVariableName() {
      Object ref = variableName_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        variableName_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <pre>
     * Name of the variable tensor.
     * </pre>
     *
     * <code>optional string variable_name = 1;</code>
     */
    public com.google.protobuf.ByteString
        getVariableNameBytes() {
      Object ref = variableName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        variableName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Name of the variable tensor.
     * </pre>
     *
     * <code>optional string variable_name = 1;</code>
     */
    public Builder setVariableName(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      variableName_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Name of the variable tensor.
     * </pre>
     *
     * <code>optional string variable_name = 1;</code>
     */
    public Builder clearVariableName() {
      
      variableName_ = getDefaultInstance().getVariableName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Name of the variable tensor.
     * </pre>
     *
     * <code>optional string variable_name = 1;</code>
     */
    public Builder setVariableNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      variableName_ = value;
      onChanged();
      return this;
    }

    private Object initializerName_ = "";
    /**
     * <pre>
     * Name of the initializer op.
     * </pre>
     *
     * <code>optional string initializer_name = 2;</code>
     */
    public String getInitializerName() {
      Object ref = initializerName_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        initializerName_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <pre>
     * Name of the initializer op.
     * </pre>
     *
     * <code>optional string initializer_name = 2;</code>
     */
    public com.google.protobuf.ByteString
        getInitializerNameBytes() {
      Object ref = initializerName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        initializerName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Name of the initializer op.
     * </pre>
     *
     * <code>optional string initializer_name = 2;</code>
     */
    public Builder setInitializerName(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      initializerName_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Name of the initializer op.
     * </pre>
     *
     * <code>optional string initializer_name = 2;</code>
     */
    public Builder clearInitializerName() {
      
      initializerName_ = getDefaultInstance().getInitializerName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Name of the initializer op.
     * </pre>
     *
     * <code>optional string initializer_name = 2;</code>
     */
    public Builder setInitializerNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      initializerName_ = value;
      onChanged();
      return this;
    }

    private Object snapshotName_ = "";
    /**
     * <pre>
     * Name of the snapshot tensor.
     * </pre>
     *
     * <code>optional string snapshot_name = 3;</code>
     */
    public String getSnapshotName() {
      Object ref = snapshotName_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        snapshotName_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <pre>
     * Name of the snapshot tensor.
     * </pre>
     *
     * <code>optional string snapshot_name = 3;</code>
     */
    public com.google.protobuf.ByteString
        getSnapshotNameBytes() {
      Object ref = snapshotName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        snapshotName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Name of the snapshot tensor.
     * </pre>
     *
     * <code>optional string snapshot_name = 3;</code>
     */
    public Builder setSnapshotName(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      snapshotName_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Name of the snapshot tensor.
     * </pre>
     *
     * <code>optional string snapshot_name = 3;</code>
     */
    public Builder clearSnapshotName() {
      
      snapshotName_ = getDefaultInstance().getSnapshotName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Name of the snapshot tensor.
     * </pre>
     *
     * <code>optional string snapshot_name = 3;</code>
     */
    public Builder setSnapshotNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      snapshotName_ = value;
      onChanged();
      return this;
    }

    private SaveSliceInfoDef saveSliceInfoDef_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        SaveSliceInfoDef, SaveSliceInfoDef.Builder, SaveSliceInfoDefOrBuilder> saveSliceInfoDefBuilder_;
    /**
     * <pre>
     * Support for saving variables as slices of a larger variable.
     * </pre>
     *
     * <code>optional .tensorflow.SaveSliceInfoDef save_slice_info_def = 4;</code>
     */
    public boolean hasSaveSliceInfoDef() {
      return saveSliceInfoDefBuilder_ != null || saveSliceInfoDef_ != null;
    }
    /**
     * <pre>
     * Support for saving variables as slices of a larger variable.
     * </pre>
     *
     * <code>optional .tensorflow.SaveSliceInfoDef save_slice_info_def = 4;</code>
     */
    public SaveSliceInfoDef getSaveSliceInfoDef() {
      if (saveSliceInfoDefBuilder_ == null) {
        return saveSliceInfoDef_ == null ? SaveSliceInfoDef.getDefaultInstance() : saveSliceInfoDef_;
      } else {
        return saveSliceInfoDefBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Support for saving variables as slices of a larger variable.
     * </pre>
     *
     * <code>optional .tensorflow.SaveSliceInfoDef save_slice_info_def = 4;</code>
     */
    public Builder setSaveSliceInfoDef(SaveSliceInfoDef value) {
      if (saveSliceInfoDefBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        saveSliceInfoDef_ = value;
        onChanged();
      } else {
        saveSliceInfoDefBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Support for saving variables as slices of a larger variable.
     * </pre>
     *
     * <code>optional .tensorflow.SaveSliceInfoDef save_slice_info_def = 4;</code>
     */
    public Builder setSaveSliceInfoDef(
        SaveSliceInfoDef.Builder builderForValue) {
      if (saveSliceInfoDefBuilder_ == null) {
        saveSliceInfoDef_ = builderForValue.build();
        onChanged();
      } else {
        saveSliceInfoDefBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Support for saving variables as slices of a larger variable.
     * </pre>
     *
     * <code>optional .tensorflow.SaveSliceInfoDef save_slice_info_def = 4;</code>
     */
    public Builder mergeSaveSliceInfoDef(SaveSliceInfoDef value) {
      if (saveSliceInfoDefBuilder_ == null) {
        if (saveSliceInfoDef_ != null) {
          saveSliceInfoDef_ =
            SaveSliceInfoDef.newBuilder(saveSliceInfoDef_).mergeFrom(value).buildPartial();
        } else {
          saveSliceInfoDef_ = value;
        }
        onChanged();
      } else {
        saveSliceInfoDefBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Support for saving variables as slices of a larger variable.
     * </pre>
     *
     * <code>optional .tensorflow.SaveSliceInfoDef save_slice_info_def = 4;</code>
     */
    public Builder clearSaveSliceInfoDef() {
      if (saveSliceInfoDefBuilder_ == null) {
        saveSliceInfoDef_ = null;
        onChanged();
      } else {
        saveSliceInfoDef_ = null;
        saveSliceInfoDefBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Support for saving variables as slices of a larger variable.
     * </pre>
     *
     * <code>optional .tensorflow.SaveSliceInfoDef save_slice_info_def = 4;</code>
     */
    public SaveSliceInfoDef.Builder getSaveSliceInfoDefBuilder() {
      
      onChanged();
      return getSaveSliceInfoDefFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Support for saving variables as slices of a larger variable.
     * </pre>
     *
     * <code>optional .tensorflow.SaveSliceInfoDef save_slice_info_def = 4;</code>
     */
    public SaveSliceInfoDefOrBuilder getSaveSliceInfoDefOrBuilder() {
      if (saveSliceInfoDefBuilder_ != null) {
        return saveSliceInfoDefBuilder_.getMessageOrBuilder();
      } else {
        return saveSliceInfoDef_ == null ?
            SaveSliceInfoDef.getDefaultInstance() : saveSliceInfoDef_;
      }
    }
    /**
     * <pre>
     * Support for saving variables as slices of a larger variable.
     * </pre>
     *
     * <code>optional .tensorflow.SaveSliceInfoDef save_slice_info_def = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        SaveSliceInfoDef, SaveSliceInfoDef.Builder, SaveSliceInfoDefOrBuilder>
        getSaveSliceInfoDefFieldBuilder() {
      if (saveSliceInfoDefBuilder_ == null) {
        saveSliceInfoDefBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            SaveSliceInfoDef, SaveSliceInfoDef.Builder, SaveSliceInfoDefOrBuilder>(
                getSaveSliceInfoDef(),
                getParentForChildren(),
                isClean());
        saveSliceInfoDef_ = null;
      }
      return saveSliceInfoDefBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:tensorflow.VariableDef)
  }

  // @@protoc_insertion_point(class_scope:tensorflow.VariableDef)
  private static final VariableDef DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new VariableDef();
  }

  public static VariableDef getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VariableDef>
      PARSER = new com.google.protobuf.AbstractParser<VariableDef>() {
    public VariableDef parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new VariableDef(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<VariableDef> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<VariableDef> getParserForType() {
    return PARSER;
  }

  public VariableDef getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

