// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: device_attributes.proto

package org.tensorflow.framework;

/**
 * <pre>
 * BusAdjacency identifies the ability of a device to participate in
 * maximally efficient DMA operations within the local context of a
 * process.
 * This is currently ignored.
 * </pre>
 *
 * Protobuf enum {@code tensorflow.BusAdjacency}
 */
public enum BusAdjacency
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>BUS_0 = 0;</code>
   */
  BUS_0(0),
  /**
   * <code>BUS_1 = 1;</code>
   */
  BUS_1(1),
  /**
   * <code>BUS_ANY = 2;</code>
   */
  BUS_ANY(2),
  /**
   * <code>BUS_NUM_ADJACENCIES = 3;</code>
   */
  BUS_NUM_ADJACENCIES(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>BUS_0 = 0;</code>
   */
  public static final int BUS_0_VALUE = 0;
  /**
   * <code>BUS_1 = 1;</code>
   */
  public static final int BUS_1_VALUE = 1;
  /**
   * <code>BUS_ANY = 2;</code>
   */
  public static final int BUS_ANY_VALUE = 2;
  /**
   * <code>BUS_NUM_ADJACENCIES = 3;</code>
   */
  public static final int BUS_NUM_ADJACENCIES_VALUE = 3;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @Deprecated
  public static BusAdjacency valueOf(int value) {
    return forNumber(value);
  }

  public static BusAdjacency forNumber(int value) {
    switch (value) {
      case 0: return BUS_0;
      case 1: return BUS_1;
      case 2: return BUS_ANY;
      case 3: return BUS_NUM_ADJACENCIES;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<BusAdjacency>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      BusAdjacency> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<BusAdjacency>() {
          public BusAdjacency findValueByNumber(int number) {
            return BusAdjacency.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return org.tensorflow.framework.DeviceAttributesProtos.getDescriptor()
        .getEnumTypes().get(0);
  }

  private static final BusAdjacency[] VALUES = values();

  public static BusAdjacency valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private BusAdjacency(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:tensorflow.BusAdjacency)
}

