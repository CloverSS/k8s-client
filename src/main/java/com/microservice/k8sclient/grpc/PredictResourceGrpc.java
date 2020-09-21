package com.microservice.k8sclient.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.21.0)",
    comments = "Source: predict.proto")
public final class PredictResourceGrpc {

  private PredictResourceGrpc() {}

  public static final String SERVICE_NAME = "PredictResource";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.microservice.k8sclient.grpc.historyReq,
      com.microservice.k8sclient.grpc.predictResp> getPredictMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Predict",
      requestType = com.microservice.k8sclient.grpc.historyReq.class,
      responseType = com.microservice.k8sclient.grpc.predictResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.microservice.k8sclient.grpc.historyReq,
      com.microservice.k8sclient.grpc.predictResp> getPredictMethod() {
    io.grpc.MethodDescriptor<com.microservice.k8sclient.grpc.historyReq, com.microservice.k8sclient.grpc.predictResp> getPredictMethod;
    if ((getPredictMethod = PredictResourceGrpc.getPredictMethod) == null) {
      synchronized (PredictResourceGrpc.class) {
        if ((getPredictMethod = PredictResourceGrpc.getPredictMethod) == null) {
          PredictResourceGrpc.getPredictMethod = getPredictMethod = 
              io.grpc.MethodDescriptor.<com.microservice.k8sclient.grpc.historyReq, com.microservice.k8sclient.grpc.predictResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "PredictResource", "Predict"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.microservice.k8sclient.grpc.historyReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.microservice.k8sclient.grpc.predictResp.getDefaultInstance()))
                  .setSchemaDescriptor(new PredictResourceMethodDescriptorSupplier("Predict"))
                  .build();
          }
        }
     }
     return getPredictMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PredictResourceStub newStub(io.grpc.Channel channel) {
    return new PredictResourceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PredictResourceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new PredictResourceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PredictResourceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new PredictResourceFutureStub(channel);
  }

  /**
   */
  public static abstract class PredictResourceImplBase implements io.grpc.BindableService {

    /**
     */
    public void predict(com.microservice.k8sclient.grpc.historyReq request,
        io.grpc.stub.StreamObserver<com.microservice.k8sclient.grpc.predictResp> responseObserver) {
      asyncUnimplementedUnaryCall(getPredictMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getPredictMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.microservice.k8sclient.grpc.historyReq,
                com.microservice.k8sclient.grpc.predictResp>(
                  this, METHODID_PREDICT)))
          .build();
    }
  }

  /**
   */
  public static final class PredictResourceStub extends io.grpc.stub.AbstractStub<PredictResourceStub> {
    private PredictResourceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PredictResourceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PredictResourceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PredictResourceStub(channel, callOptions);
    }

    /**
     */
    public void predict(com.microservice.k8sclient.grpc.historyReq request,
        io.grpc.stub.StreamObserver<com.microservice.k8sclient.grpc.predictResp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPredictMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class PredictResourceBlockingStub extends io.grpc.stub.AbstractStub<PredictResourceBlockingStub> {
    private PredictResourceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PredictResourceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PredictResourceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PredictResourceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.microservice.k8sclient.grpc.predictResp predict(com.microservice.k8sclient.grpc.historyReq request) {
      return blockingUnaryCall(
          getChannel(), getPredictMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class PredictResourceFutureStub extends io.grpc.stub.AbstractStub<PredictResourceFutureStub> {
    private PredictResourceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PredictResourceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PredictResourceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PredictResourceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.microservice.k8sclient.grpc.predictResp> predict(
        com.microservice.k8sclient.grpc.historyReq request) {
      return futureUnaryCall(
          getChannel().newCall(getPredictMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PREDICT = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PredictResourceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PredictResourceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PREDICT:
          serviceImpl.predict((com.microservice.k8sclient.grpc.historyReq) request,
              (io.grpc.stub.StreamObserver<com.microservice.k8sclient.grpc.predictResp>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class PredictResourceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PredictResourceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.microservice.k8sclient.grpc.PredictResourceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PredictResource");
    }
  }

  private static final class PredictResourceFileDescriptorSupplier
      extends PredictResourceBaseDescriptorSupplier {
    PredictResourceFileDescriptorSupplier() {}
  }

  private static final class PredictResourceMethodDescriptorSupplier
      extends PredictResourceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PredictResourceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (PredictResourceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PredictResourceFileDescriptorSupplier())
              .addMethod(getPredictMethod())
              .build();
        }
      }
    }
    return result;
  }
}
