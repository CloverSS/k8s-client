// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: predict.proto

package com.microservice.k8sclient.grpc;

public final class PredictResourceProto {
  private PredictResourceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_historyStruct_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_historyStruct_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_historyReq_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_historyReq_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_predictResp_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_predictResp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rpredict.proto\"1\n\rhistoryStruct\022\021\n\ttime" +
      "stamp\030\001 \001(\001\022\r\n\005value\030\002 \001(\001\"*\n\nhistoryReq" +
      "\022\034\n\004data\030\001 \003(\0132\016.historyStruct\"\035\n\013predic" +
      "tResp\022\016\n\006result\030\001 \003(\00127\n\017PredictResource" +
      "\022$\n\007Predict\022\013.historyReq\032\014.predictRespB9" +
      "\n\037com.microservice.k8sclient.grpcB\024Predi" +
      "ctResourceProtoP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_historyStruct_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_historyStruct_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_historyStruct_descriptor,
        new java.lang.String[] { "Timestamp", "Value", });
    internal_static_historyReq_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_historyReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_historyReq_descriptor,
        new java.lang.String[] { "Data", });
    internal_static_predictResp_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_predictResp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_predictResp_descriptor,
        new java.lang.String[] { "Result", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
