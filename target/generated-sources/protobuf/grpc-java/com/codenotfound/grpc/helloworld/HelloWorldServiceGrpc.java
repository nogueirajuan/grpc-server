package com.codenotfound.grpc.helloworld;

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
    value = "by gRPC proto compiler (version 1.11.0)",
    comments = "Source: HelloWorld.proto")
public final class HelloWorldServiceGrpc {

  private HelloWorldServiceGrpc() {}

  public static final String SERVICE_NAME = "com.codenotfound.grpc.helloworld.HelloWorldService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getSayHelloMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.codenotfound.grpc.helloworld.Person,
      com.codenotfound.grpc.helloworld.Greeting> METHOD_SAY_HELLO = getSayHelloMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.codenotfound.grpc.helloworld.Person,
      com.codenotfound.grpc.helloworld.Greeting> getSayHelloMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.codenotfound.grpc.helloworld.Person,
      com.codenotfound.grpc.helloworld.Greeting> getSayHelloMethod() {
    return getSayHelloMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.codenotfound.grpc.helloworld.Person,
      com.codenotfound.grpc.helloworld.Greeting> getSayHelloMethodHelper() {
    io.grpc.MethodDescriptor<com.codenotfound.grpc.helloworld.Person, com.codenotfound.grpc.helloworld.Greeting> getSayHelloMethod;
    if ((getSayHelloMethod = HelloWorldServiceGrpc.getSayHelloMethod) == null) {
      synchronized (HelloWorldServiceGrpc.class) {
        if ((getSayHelloMethod = HelloWorldServiceGrpc.getSayHelloMethod) == null) {
          HelloWorldServiceGrpc.getSayHelloMethod = getSayHelloMethod = 
              io.grpc.MethodDescriptor.<com.codenotfound.grpc.helloworld.Person, com.codenotfound.grpc.helloworld.Greeting>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.codenotfound.grpc.helloworld.HelloWorldService", "sayHello"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.codenotfound.grpc.helloworld.Person.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.codenotfound.grpc.helloworld.Greeting.getDefaultInstance()))
                  .setSchemaDescriptor(new HelloWorldServiceMethodDescriptorSupplier("sayHello"))
                  .build();
          }
        }
     }
     return getSayHelloMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getCallChamadaUmMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.codenotfound.grpc.helloworld.ChamadaUm,
      com.codenotfound.grpc.helloworld.ChamadaUm> METHOD_CALL_CHAMADA_UM = getCallChamadaUmMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.codenotfound.grpc.helloworld.ChamadaUm,
      com.codenotfound.grpc.helloworld.ChamadaUm> getCallChamadaUmMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.codenotfound.grpc.helloworld.ChamadaUm,
      com.codenotfound.grpc.helloworld.ChamadaUm> getCallChamadaUmMethod() {
    return getCallChamadaUmMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.codenotfound.grpc.helloworld.ChamadaUm,
      com.codenotfound.grpc.helloworld.ChamadaUm> getCallChamadaUmMethodHelper() {
    io.grpc.MethodDescriptor<com.codenotfound.grpc.helloworld.ChamadaUm, com.codenotfound.grpc.helloworld.ChamadaUm> getCallChamadaUmMethod;
    if ((getCallChamadaUmMethod = HelloWorldServiceGrpc.getCallChamadaUmMethod) == null) {
      synchronized (HelloWorldServiceGrpc.class) {
        if ((getCallChamadaUmMethod = HelloWorldServiceGrpc.getCallChamadaUmMethod) == null) {
          HelloWorldServiceGrpc.getCallChamadaUmMethod = getCallChamadaUmMethod = 
              io.grpc.MethodDescriptor.<com.codenotfound.grpc.helloworld.ChamadaUm, com.codenotfound.grpc.helloworld.ChamadaUm>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.codenotfound.grpc.helloworld.HelloWorldService", "callChamadaUm"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.codenotfound.grpc.helloworld.ChamadaUm.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.codenotfound.grpc.helloworld.ChamadaUm.getDefaultInstance()))
                  .setSchemaDescriptor(new HelloWorldServiceMethodDescriptorSupplier("callChamadaUm"))
                  .build();
          }
        }
     }
     return getCallChamadaUmMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getCallChamadaDoisMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.codenotfound.grpc.helloworld.ChamadaDois,
      com.codenotfound.grpc.helloworld.RetornoLong> METHOD_CALL_CHAMADA_DOIS = getCallChamadaDoisMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.codenotfound.grpc.helloworld.ChamadaDois,
      com.codenotfound.grpc.helloworld.RetornoLong> getCallChamadaDoisMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.codenotfound.grpc.helloworld.ChamadaDois,
      com.codenotfound.grpc.helloworld.RetornoLong> getCallChamadaDoisMethod() {
    return getCallChamadaDoisMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.codenotfound.grpc.helloworld.ChamadaDois,
      com.codenotfound.grpc.helloworld.RetornoLong> getCallChamadaDoisMethodHelper() {
    io.grpc.MethodDescriptor<com.codenotfound.grpc.helloworld.ChamadaDois, com.codenotfound.grpc.helloworld.RetornoLong> getCallChamadaDoisMethod;
    if ((getCallChamadaDoisMethod = HelloWorldServiceGrpc.getCallChamadaDoisMethod) == null) {
      synchronized (HelloWorldServiceGrpc.class) {
        if ((getCallChamadaDoisMethod = HelloWorldServiceGrpc.getCallChamadaDoisMethod) == null) {
          HelloWorldServiceGrpc.getCallChamadaDoisMethod = getCallChamadaDoisMethod = 
              io.grpc.MethodDescriptor.<com.codenotfound.grpc.helloworld.ChamadaDois, com.codenotfound.grpc.helloworld.RetornoLong>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.codenotfound.grpc.helloworld.HelloWorldService", "callChamadaDois"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.codenotfound.grpc.helloworld.ChamadaDois.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.codenotfound.grpc.helloworld.RetornoLong.getDefaultInstance()))
                  .setSchemaDescriptor(new HelloWorldServiceMethodDescriptorSupplier("callChamadaDois"))
                  .build();
          }
        }
     }
     return getCallChamadaDoisMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getCallChamadaTresMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.codenotfound.grpc.helloworld.ChamadaTres,
      com.codenotfound.grpc.helloworld.RetornoLong> METHOD_CALL_CHAMADA_TRES = getCallChamadaTresMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.codenotfound.grpc.helloworld.ChamadaTres,
      com.codenotfound.grpc.helloworld.RetornoLong> getCallChamadaTresMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.codenotfound.grpc.helloworld.ChamadaTres,
      com.codenotfound.grpc.helloworld.RetornoLong> getCallChamadaTresMethod() {
    return getCallChamadaTresMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.codenotfound.grpc.helloworld.ChamadaTres,
      com.codenotfound.grpc.helloworld.RetornoLong> getCallChamadaTresMethodHelper() {
    io.grpc.MethodDescriptor<com.codenotfound.grpc.helloworld.ChamadaTres, com.codenotfound.grpc.helloworld.RetornoLong> getCallChamadaTresMethod;
    if ((getCallChamadaTresMethod = HelloWorldServiceGrpc.getCallChamadaTresMethod) == null) {
      synchronized (HelloWorldServiceGrpc.class) {
        if ((getCallChamadaTresMethod = HelloWorldServiceGrpc.getCallChamadaTresMethod) == null) {
          HelloWorldServiceGrpc.getCallChamadaTresMethod = getCallChamadaTresMethod = 
              io.grpc.MethodDescriptor.<com.codenotfound.grpc.helloworld.ChamadaTres, com.codenotfound.grpc.helloworld.RetornoLong>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.codenotfound.grpc.helloworld.HelloWorldService", "callChamadaTres"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.codenotfound.grpc.helloworld.ChamadaTres.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.codenotfound.grpc.helloworld.RetornoLong.getDefaultInstance()))
                  .setSchemaDescriptor(new HelloWorldServiceMethodDescriptorSupplier("callChamadaTres"))
                  .build();
          }
        }
     }
     return getCallChamadaTresMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getCallChamadaQuatroMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.codenotfound.grpc.helloworld.ChamadaQuatro,
      com.codenotfound.grpc.helloworld.RetornoString> METHOD_CALL_CHAMADA_QUATRO = getCallChamadaQuatroMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.codenotfound.grpc.helloworld.ChamadaQuatro,
      com.codenotfound.grpc.helloworld.RetornoString> getCallChamadaQuatroMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.codenotfound.grpc.helloworld.ChamadaQuatro,
      com.codenotfound.grpc.helloworld.RetornoString> getCallChamadaQuatroMethod() {
    return getCallChamadaQuatroMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.codenotfound.grpc.helloworld.ChamadaQuatro,
      com.codenotfound.grpc.helloworld.RetornoString> getCallChamadaQuatroMethodHelper() {
    io.grpc.MethodDescriptor<com.codenotfound.grpc.helloworld.ChamadaQuatro, com.codenotfound.grpc.helloworld.RetornoString> getCallChamadaQuatroMethod;
    if ((getCallChamadaQuatroMethod = HelloWorldServiceGrpc.getCallChamadaQuatroMethod) == null) {
      synchronized (HelloWorldServiceGrpc.class) {
        if ((getCallChamadaQuatroMethod = HelloWorldServiceGrpc.getCallChamadaQuatroMethod) == null) {
          HelloWorldServiceGrpc.getCallChamadaQuatroMethod = getCallChamadaQuatroMethod = 
              io.grpc.MethodDescriptor.<com.codenotfound.grpc.helloworld.ChamadaQuatro, com.codenotfound.grpc.helloworld.RetornoString>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.codenotfound.grpc.helloworld.HelloWorldService", "callChamadaQuatro"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.codenotfound.grpc.helloworld.ChamadaQuatro.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.codenotfound.grpc.helloworld.RetornoString.getDefaultInstance()))
                  .setSchemaDescriptor(new HelloWorldServiceMethodDescriptorSupplier("callChamadaQuatro"))
                  .build();
          }
        }
     }
     return getCallChamadaQuatroMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HelloWorldServiceStub newStub(io.grpc.Channel channel) {
    return new HelloWorldServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HelloWorldServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new HelloWorldServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HelloWorldServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new HelloWorldServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class HelloWorldServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void sayHello(com.codenotfound.grpc.helloworld.Person request,
        io.grpc.stub.StreamObserver<com.codenotfound.grpc.helloworld.Greeting> responseObserver) {
      asyncUnimplementedUnaryCall(getSayHelloMethodHelper(), responseObserver);
    }

    /**
     */
    public void callChamadaUm(com.codenotfound.grpc.helloworld.ChamadaUm request,
        io.grpc.stub.StreamObserver<com.codenotfound.grpc.helloworld.ChamadaUm> responseObserver) {
      asyncUnimplementedUnaryCall(getCallChamadaUmMethodHelper(), responseObserver);
    }

    /**
     */
    public void callChamadaDois(com.codenotfound.grpc.helloworld.ChamadaDois request,
        io.grpc.stub.StreamObserver<com.codenotfound.grpc.helloworld.RetornoLong> responseObserver) {
      asyncUnimplementedUnaryCall(getCallChamadaDoisMethodHelper(), responseObserver);
    }

    /**
     */
    public void callChamadaTres(com.codenotfound.grpc.helloworld.ChamadaTres request,
        io.grpc.stub.StreamObserver<com.codenotfound.grpc.helloworld.RetornoLong> responseObserver) {
      asyncUnimplementedUnaryCall(getCallChamadaTresMethodHelper(), responseObserver);
    }

    /**
     */
    public void callChamadaQuatro(com.codenotfound.grpc.helloworld.ChamadaQuatro request,
        io.grpc.stub.StreamObserver<com.codenotfound.grpc.helloworld.RetornoString> responseObserver) {
      asyncUnimplementedUnaryCall(getCallChamadaQuatroMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSayHelloMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.codenotfound.grpc.helloworld.Person,
                com.codenotfound.grpc.helloworld.Greeting>(
                  this, METHODID_SAY_HELLO)))
          .addMethod(
            getCallChamadaUmMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.codenotfound.grpc.helloworld.ChamadaUm,
                com.codenotfound.grpc.helloworld.ChamadaUm>(
                  this, METHODID_CALL_CHAMADA_UM)))
          .addMethod(
            getCallChamadaDoisMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.codenotfound.grpc.helloworld.ChamadaDois,
                com.codenotfound.grpc.helloworld.RetornoLong>(
                  this, METHODID_CALL_CHAMADA_DOIS)))
          .addMethod(
            getCallChamadaTresMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.codenotfound.grpc.helloworld.ChamadaTres,
                com.codenotfound.grpc.helloworld.RetornoLong>(
                  this, METHODID_CALL_CHAMADA_TRES)))
          .addMethod(
            getCallChamadaQuatroMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.codenotfound.grpc.helloworld.ChamadaQuatro,
                com.codenotfound.grpc.helloworld.RetornoString>(
                  this, METHODID_CALL_CHAMADA_QUATRO)))
          .build();
    }
  }

  /**
   */
  public static final class HelloWorldServiceStub extends io.grpc.stub.AbstractStub<HelloWorldServiceStub> {
    private HelloWorldServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HelloWorldServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HelloWorldServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HelloWorldServiceStub(channel, callOptions);
    }

    /**
     */
    public void sayHello(com.codenotfound.grpc.helloworld.Person request,
        io.grpc.stub.StreamObserver<com.codenotfound.grpc.helloworld.Greeting> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSayHelloMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void callChamadaUm(com.codenotfound.grpc.helloworld.ChamadaUm request,
        io.grpc.stub.StreamObserver<com.codenotfound.grpc.helloworld.ChamadaUm> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCallChamadaUmMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void callChamadaDois(com.codenotfound.grpc.helloworld.ChamadaDois request,
        io.grpc.stub.StreamObserver<com.codenotfound.grpc.helloworld.RetornoLong> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCallChamadaDoisMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void callChamadaTres(com.codenotfound.grpc.helloworld.ChamadaTres request,
        io.grpc.stub.StreamObserver<com.codenotfound.grpc.helloworld.RetornoLong> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCallChamadaTresMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void callChamadaQuatro(com.codenotfound.grpc.helloworld.ChamadaQuatro request,
        io.grpc.stub.StreamObserver<com.codenotfound.grpc.helloworld.RetornoString> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCallChamadaQuatroMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class HelloWorldServiceBlockingStub extends io.grpc.stub.AbstractStub<HelloWorldServiceBlockingStub> {
    private HelloWorldServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HelloWorldServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HelloWorldServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HelloWorldServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.codenotfound.grpc.helloworld.Greeting sayHello(com.codenotfound.grpc.helloworld.Person request) {
      return blockingUnaryCall(
          getChannel(), getSayHelloMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public com.codenotfound.grpc.helloworld.ChamadaUm callChamadaUm(com.codenotfound.grpc.helloworld.ChamadaUm request) {
      return blockingUnaryCall(
          getChannel(), getCallChamadaUmMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public com.codenotfound.grpc.helloworld.RetornoLong callChamadaDois(com.codenotfound.grpc.helloworld.ChamadaDois request) {
      return blockingUnaryCall(
          getChannel(), getCallChamadaDoisMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public com.codenotfound.grpc.helloworld.RetornoLong callChamadaTres(com.codenotfound.grpc.helloworld.ChamadaTres request) {
      return blockingUnaryCall(
          getChannel(), getCallChamadaTresMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public com.codenotfound.grpc.helloworld.RetornoString callChamadaQuatro(com.codenotfound.grpc.helloworld.ChamadaQuatro request) {
      return blockingUnaryCall(
          getChannel(), getCallChamadaQuatroMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class HelloWorldServiceFutureStub extends io.grpc.stub.AbstractStub<HelloWorldServiceFutureStub> {
    private HelloWorldServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HelloWorldServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HelloWorldServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HelloWorldServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.codenotfound.grpc.helloworld.Greeting> sayHello(
        com.codenotfound.grpc.helloworld.Person request) {
      return futureUnaryCall(
          getChannel().newCall(getSayHelloMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.codenotfound.grpc.helloworld.ChamadaUm> callChamadaUm(
        com.codenotfound.grpc.helloworld.ChamadaUm request) {
      return futureUnaryCall(
          getChannel().newCall(getCallChamadaUmMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.codenotfound.grpc.helloworld.RetornoLong> callChamadaDois(
        com.codenotfound.grpc.helloworld.ChamadaDois request) {
      return futureUnaryCall(
          getChannel().newCall(getCallChamadaDoisMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.codenotfound.grpc.helloworld.RetornoLong> callChamadaTres(
        com.codenotfound.grpc.helloworld.ChamadaTres request) {
      return futureUnaryCall(
          getChannel().newCall(getCallChamadaTresMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.codenotfound.grpc.helloworld.RetornoString> callChamadaQuatro(
        com.codenotfound.grpc.helloworld.ChamadaQuatro request) {
      return futureUnaryCall(
          getChannel().newCall(getCallChamadaQuatroMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SAY_HELLO = 0;
  private static final int METHODID_CALL_CHAMADA_UM = 1;
  private static final int METHODID_CALL_CHAMADA_DOIS = 2;
  private static final int METHODID_CALL_CHAMADA_TRES = 3;
  private static final int METHODID_CALL_CHAMADA_QUATRO = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final HelloWorldServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(HelloWorldServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAY_HELLO:
          serviceImpl.sayHello((com.codenotfound.grpc.helloworld.Person) request,
              (io.grpc.stub.StreamObserver<com.codenotfound.grpc.helloworld.Greeting>) responseObserver);
          break;
        case METHODID_CALL_CHAMADA_UM:
          serviceImpl.callChamadaUm((com.codenotfound.grpc.helloworld.ChamadaUm) request,
              (io.grpc.stub.StreamObserver<com.codenotfound.grpc.helloworld.ChamadaUm>) responseObserver);
          break;
        case METHODID_CALL_CHAMADA_DOIS:
          serviceImpl.callChamadaDois((com.codenotfound.grpc.helloworld.ChamadaDois) request,
              (io.grpc.stub.StreamObserver<com.codenotfound.grpc.helloworld.RetornoLong>) responseObserver);
          break;
        case METHODID_CALL_CHAMADA_TRES:
          serviceImpl.callChamadaTres((com.codenotfound.grpc.helloworld.ChamadaTres) request,
              (io.grpc.stub.StreamObserver<com.codenotfound.grpc.helloworld.RetornoLong>) responseObserver);
          break;
        case METHODID_CALL_CHAMADA_QUATRO:
          serviceImpl.callChamadaQuatro((com.codenotfound.grpc.helloworld.ChamadaQuatro) request,
              (io.grpc.stub.StreamObserver<com.codenotfound.grpc.helloworld.RetornoString>) responseObserver);
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

  private static abstract class HelloWorldServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    HelloWorldServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.codenotfound.grpc.helloworld.HelloWorld.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("HelloWorldService");
    }
  }

  private static final class HelloWorldServiceFileDescriptorSupplier
      extends HelloWorldServiceBaseDescriptorSupplier {
    HelloWorldServiceFileDescriptorSupplier() {}
  }

  private static final class HelloWorldServiceMethodDescriptorSupplier
      extends HelloWorldServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    HelloWorldServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (HelloWorldServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new HelloWorldServiceFileDescriptorSupplier())
              .addMethod(getSayHelloMethodHelper())
              .addMethod(getCallChamadaUmMethodHelper())
              .addMethod(getCallChamadaDoisMethodHelper())
              .addMethod(getCallChamadaTresMethodHelper())
              .addMethod(getCallChamadaQuatroMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
