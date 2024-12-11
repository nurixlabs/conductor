package com.netflix.conductor.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: grpc/event_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class EventServiceGrpc {

  private EventServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "conductor.grpc.events.EventService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.netflix.conductor.grpc.EventServicePb.AddEventHandlerRequest,
      com.netflix.conductor.grpc.EventServicePb.AddEventHandlerResponse> getAddEventHandlerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddEventHandler",
      requestType = com.netflix.conductor.grpc.EventServicePb.AddEventHandlerRequest.class,
      responseType = com.netflix.conductor.grpc.EventServicePb.AddEventHandlerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.netflix.conductor.grpc.EventServicePb.AddEventHandlerRequest,
      com.netflix.conductor.grpc.EventServicePb.AddEventHandlerResponse> getAddEventHandlerMethod() {
    io.grpc.MethodDescriptor<com.netflix.conductor.grpc.EventServicePb.AddEventHandlerRequest, com.netflix.conductor.grpc.EventServicePb.AddEventHandlerResponse> getAddEventHandlerMethod;
    if ((getAddEventHandlerMethod = EventServiceGrpc.getAddEventHandlerMethod) == null) {
      synchronized (EventServiceGrpc.class) {
        if ((getAddEventHandlerMethod = EventServiceGrpc.getAddEventHandlerMethod) == null) {
          EventServiceGrpc.getAddEventHandlerMethod = getAddEventHandlerMethod =
              io.grpc.MethodDescriptor.<com.netflix.conductor.grpc.EventServicePb.AddEventHandlerRequest, com.netflix.conductor.grpc.EventServicePb.AddEventHandlerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddEventHandler"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netflix.conductor.grpc.EventServicePb.AddEventHandlerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netflix.conductor.grpc.EventServicePb.AddEventHandlerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EventServiceMethodDescriptorSupplier("AddEventHandler"))
              .build();
        }
      }
    }
    return getAddEventHandlerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.netflix.conductor.grpc.EventServicePb.UpdateEventHandlerRequest,
      com.netflix.conductor.grpc.EventServicePb.UpdateEventHandlerResponse> getUpdateEventHandlerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateEventHandler",
      requestType = com.netflix.conductor.grpc.EventServicePb.UpdateEventHandlerRequest.class,
      responseType = com.netflix.conductor.grpc.EventServicePb.UpdateEventHandlerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.netflix.conductor.grpc.EventServicePb.UpdateEventHandlerRequest,
      com.netflix.conductor.grpc.EventServicePb.UpdateEventHandlerResponse> getUpdateEventHandlerMethod() {
    io.grpc.MethodDescriptor<com.netflix.conductor.grpc.EventServicePb.UpdateEventHandlerRequest, com.netflix.conductor.grpc.EventServicePb.UpdateEventHandlerResponse> getUpdateEventHandlerMethod;
    if ((getUpdateEventHandlerMethod = EventServiceGrpc.getUpdateEventHandlerMethod) == null) {
      synchronized (EventServiceGrpc.class) {
        if ((getUpdateEventHandlerMethod = EventServiceGrpc.getUpdateEventHandlerMethod) == null) {
          EventServiceGrpc.getUpdateEventHandlerMethod = getUpdateEventHandlerMethod =
              io.grpc.MethodDescriptor.<com.netflix.conductor.grpc.EventServicePb.UpdateEventHandlerRequest, com.netflix.conductor.grpc.EventServicePb.UpdateEventHandlerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateEventHandler"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netflix.conductor.grpc.EventServicePb.UpdateEventHandlerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netflix.conductor.grpc.EventServicePb.UpdateEventHandlerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EventServiceMethodDescriptorSupplier("UpdateEventHandler"))
              .build();
        }
      }
    }
    return getUpdateEventHandlerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.netflix.conductor.grpc.EventServicePb.RemoveEventHandlerRequest,
      com.netflix.conductor.grpc.EventServicePb.RemoveEventHandlerResponse> getRemoveEventHandlerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveEventHandler",
      requestType = com.netflix.conductor.grpc.EventServicePb.RemoveEventHandlerRequest.class,
      responseType = com.netflix.conductor.grpc.EventServicePb.RemoveEventHandlerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.netflix.conductor.grpc.EventServicePb.RemoveEventHandlerRequest,
      com.netflix.conductor.grpc.EventServicePb.RemoveEventHandlerResponse> getRemoveEventHandlerMethod() {
    io.grpc.MethodDescriptor<com.netflix.conductor.grpc.EventServicePb.RemoveEventHandlerRequest, com.netflix.conductor.grpc.EventServicePb.RemoveEventHandlerResponse> getRemoveEventHandlerMethod;
    if ((getRemoveEventHandlerMethod = EventServiceGrpc.getRemoveEventHandlerMethod) == null) {
      synchronized (EventServiceGrpc.class) {
        if ((getRemoveEventHandlerMethod = EventServiceGrpc.getRemoveEventHandlerMethod) == null) {
          EventServiceGrpc.getRemoveEventHandlerMethod = getRemoveEventHandlerMethod =
              io.grpc.MethodDescriptor.<com.netflix.conductor.grpc.EventServicePb.RemoveEventHandlerRequest, com.netflix.conductor.grpc.EventServicePb.RemoveEventHandlerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveEventHandler"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netflix.conductor.grpc.EventServicePb.RemoveEventHandlerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netflix.conductor.grpc.EventServicePb.RemoveEventHandlerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EventServiceMethodDescriptorSupplier("RemoveEventHandler"))
              .build();
        }
      }
    }
    return getRemoveEventHandlerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.netflix.conductor.grpc.EventServicePb.GetEventHandlersRequest,
      com.netflix.conductor.proto.EventHandlerPb.EventHandler> getGetEventHandlersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetEventHandlers",
      requestType = com.netflix.conductor.grpc.EventServicePb.GetEventHandlersRequest.class,
      responseType = com.netflix.conductor.proto.EventHandlerPb.EventHandler.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.netflix.conductor.grpc.EventServicePb.GetEventHandlersRequest,
      com.netflix.conductor.proto.EventHandlerPb.EventHandler> getGetEventHandlersMethod() {
    io.grpc.MethodDescriptor<com.netflix.conductor.grpc.EventServicePb.GetEventHandlersRequest, com.netflix.conductor.proto.EventHandlerPb.EventHandler> getGetEventHandlersMethod;
    if ((getGetEventHandlersMethod = EventServiceGrpc.getGetEventHandlersMethod) == null) {
      synchronized (EventServiceGrpc.class) {
        if ((getGetEventHandlersMethod = EventServiceGrpc.getGetEventHandlersMethod) == null) {
          EventServiceGrpc.getGetEventHandlersMethod = getGetEventHandlersMethod =
              io.grpc.MethodDescriptor.<com.netflix.conductor.grpc.EventServicePb.GetEventHandlersRequest, com.netflix.conductor.proto.EventHandlerPb.EventHandler>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetEventHandlers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netflix.conductor.grpc.EventServicePb.GetEventHandlersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netflix.conductor.proto.EventHandlerPb.EventHandler.getDefaultInstance()))
              .setSchemaDescriptor(new EventServiceMethodDescriptorSupplier("GetEventHandlers"))
              .build();
        }
      }
    }
    return getGetEventHandlersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.netflix.conductor.grpc.EventServicePb.GetEventHandlersForEventRequest,
      com.netflix.conductor.proto.EventHandlerPb.EventHandler> getGetEventHandlersForEventMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetEventHandlersForEvent",
      requestType = com.netflix.conductor.grpc.EventServicePb.GetEventHandlersForEventRequest.class,
      responseType = com.netflix.conductor.proto.EventHandlerPb.EventHandler.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.netflix.conductor.grpc.EventServicePb.GetEventHandlersForEventRequest,
      com.netflix.conductor.proto.EventHandlerPb.EventHandler> getGetEventHandlersForEventMethod() {
    io.grpc.MethodDescriptor<com.netflix.conductor.grpc.EventServicePb.GetEventHandlersForEventRequest, com.netflix.conductor.proto.EventHandlerPb.EventHandler> getGetEventHandlersForEventMethod;
    if ((getGetEventHandlersForEventMethod = EventServiceGrpc.getGetEventHandlersForEventMethod) == null) {
      synchronized (EventServiceGrpc.class) {
        if ((getGetEventHandlersForEventMethod = EventServiceGrpc.getGetEventHandlersForEventMethod) == null) {
          EventServiceGrpc.getGetEventHandlersForEventMethod = getGetEventHandlersForEventMethod =
              io.grpc.MethodDescriptor.<com.netflix.conductor.grpc.EventServicePb.GetEventHandlersForEventRequest, com.netflix.conductor.proto.EventHandlerPb.EventHandler>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetEventHandlersForEvent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netflix.conductor.grpc.EventServicePb.GetEventHandlersForEventRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netflix.conductor.proto.EventHandlerPb.EventHandler.getDefaultInstance()))
              .setSchemaDescriptor(new EventServiceMethodDescriptorSupplier("GetEventHandlersForEvent"))
              .build();
        }
      }
    }
    return getGetEventHandlersForEventMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EventServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EventServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EventServiceStub>() {
        @java.lang.Override
        public EventServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EventServiceStub(channel, callOptions);
        }
      };
    return EventServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EventServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EventServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EventServiceBlockingStub>() {
        @java.lang.Override
        public EventServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EventServiceBlockingStub(channel, callOptions);
        }
      };
    return EventServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EventServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EventServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EventServiceFutureStub>() {
        @java.lang.Override
        public EventServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EventServiceFutureStub(channel, callOptions);
        }
      };
    return EventServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * POST /
     * </pre>
     */
    default void addEventHandler(com.netflix.conductor.grpc.EventServicePb.AddEventHandlerRequest request,
        io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.EventServicePb.AddEventHandlerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddEventHandlerMethod(), responseObserver);
    }

    /**
     * <pre>
     * PUT /
     * </pre>
     */
    default void updateEventHandler(com.netflix.conductor.grpc.EventServicePb.UpdateEventHandlerRequest request,
        io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.EventServicePb.UpdateEventHandlerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateEventHandlerMethod(), responseObserver);
    }

    /**
     * <pre>
     * DELETE /{name}
     * </pre>
     */
    default void removeEventHandler(com.netflix.conductor.grpc.EventServicePb.RemoveEventHandlerRequest request,
        io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.EventServicePb.RemoveEventHandlerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveEventHandlerMethod(), responseObserver);
    }

    /**
     * <pre>
     * GET /
     * </pre>
     */
    default void getEventHandlers(com.netflix.conductor.grpc.EventServicePb.GetEventHandlersRequest request,
        io.grpc.stub.StreamObserver<com.netflix.conductor.proto.EventHandlerPb.EventHandler> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetEventHandlersMethod(), responseObserver);
    }

    /**
     * <pre>
     * GET /{name}
     * </pre>
     */
    default void getEventHandlersForEvent(com.netflix.conductor.grpc.EventServicePb.GetEventHandlersForEventRequest request,
        io.grpc.stub.StreamObserver<com.netflix.conductor.proto.EventHandlerPb.EventHandler> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetEventHandlersForEventMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service EventService.
   */
  public static abstract class EventServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return EventServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service EventService.
   */
  public static final class EventServiceStub
      extends io.grpc.stub.AbstractAsyncStub<EventServiceStub> {
    private EventServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EventServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EventServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * POST /
     * </pre>
     */
    public void addEventHandler(com.netflix.conductor.grpc.EventServicePb.AddEventHandlerRequest request,
        io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.EventServicePb.AddEventHandlerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddEventHandlerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * PUT /
     * </pre>
     */
    public void updateEventHandler(com.netflix.conductor.grpc.EventServicePb.UpdateEventHandlerRequest request,
        io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.EventServicePb.UpdateEventHandlerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateEventHandlerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DELETE /{name}
     * </pre>
     */
    public void removeEventHandler(com.netflix.conductor.grpc.EventServicePb.RemoveEventHandlerRequest request,
        io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.EventServicePb.RemoveEventHandlerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveEventHandlerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GET /
     * </pre>
     */
    public void getEventHandlers(com.netflix.conductor.grpc.EventServicePb.GetEventHandlersRequest request,
        io.grpc.stub.StreamObserver<com.netflix.conductor.proto.EventHandlerPb.EventHandler> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetEventHandlersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GET /{name}
     * </pre>
     */
    public void getEventHandlersForEvent(com.netflix.conductor.grpc.EventServicePb.GetEventHandlersForEventRequest request,
        io.grpc.stub.StreamObserver<com.netflix.conductor.proto.EventHandlerPb.EventHandler> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetEventHandlersForEventMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service EventService.
   */
  public static final class EventServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<EventServiceBlockingStub> {
    private EventServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EventServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EventServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * POST /
     * </pre>
     */
    public com.netflix.conductor.grpc.EventServicePb.AddEventHandlerResponse addEventHandler(com.netflix.conductor.grpc.EventServicePb.AddEventHandlerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddEventHandlerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * PUT /
     * </pre>
     */
    public com.netflix.conductor.grpc.EventServicePb.UpdateEventHandlerResponse updateEventHandler(com.netflix.conductor.grpc.EventServicePb.UpdateEventHandlerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateEventHandlerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DELETE /{name}
     * </pre>
     */
    public com.netflix.conductor.grpc.EventServicePb.RemoveEventHandlerResponse removeEventHandler(com.netflix.conductor.grpc.EventServicePb.RemoveEventHandlerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveEventHandlerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GET /
     * </pre>
     */
    public java.util.Iterator<com.netflix.conductor.proto.EventHandlerPb.EventHandler> getEventHandlers(
        com.netflix.conductor.grpc.EventServicePb.GetEventHandlersRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetEventHandlersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GET /{name}
     * </pre>
     */
    public java.util.Iterator<com.netflix.conductor.proto.EventHandlerPb.EventHandler> getEventHandlersForEvent(
        com.netflix.conductor.grpc.EventServicePb.GetEventHandlersForEventRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetEventHandlersForEventMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service EventService.
   */
  public static final class EventServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<EventServiceFutureStub> {
    private EventServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EventServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EventServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * POST /
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.netflix.conductor.grpc.EventServicePb.AddEventHandlerResponse> addEventHandler(
        com.netflix.conductor.grpc.EventServicePb.AddEventHandlerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddEventHandlerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * PUT /
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.netflix.conductor.grpc.EventServicePb.UpdateEventHandlerResponse> updateEventHandler(
        com.netflix.conductor.grpc.EventServicePb.UpdateEventHandlerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateEventHandlerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DELETE /{name}
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.netflix.conductor.grpc.EventServicePb.RemoveEventHandlerResponse> removeEventHandler(
        com.netflix.conductor.grpc.EventServicePb.RemoveEventHandlerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveEventHandlerMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_EVENT_HANDLER = 0;
  private static final int METHODID_UPDATE_EVENT_HANDLER = 1;
  private static final int METHODID_REMOVE_EVENT_HANDLER = 2;
  private static final int METHODID_GET_EVENT_HANDLERS = 3;
  private static final int METHODID_GET_EVENT_HANDLERS_FOR_EVENT = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD_EVENT_HANDLER:
          serviceImpl.addEventHandler((com.netflix.conductor.grpc.EventServicePb.AddEventHandlerRequest) request,
              (io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.EventServicePb.AddEventHandlerResponse>) responseObserver);
          break;
        case METHODID_UPDATE_EVENT_HANDLER:
          serviceImpl.updateEventHandler((com.netflix.conductor.grpc.EventServicePb.UpdateEventHandlerRequest) request,
              (io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.EventServicePb.UpdateEventHandlerResponse>) responseObserver);
          break;
        case METHODID_REMOVE_EVENT_HANDLER:
          serviceImpl.removeEventHandler((com.netflix.conductor.grpc.EventServicePb.RemoveEventHandlerRequest) request,
              (io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.EventServicePb.RemoveEventHandlerResponse>) responseObserver);
          break;
        case METHODID_GET_EVENT_HANDLERS:
          serviceImpl.getEventHandlers((com.netflix.conductor.grpc.EventServicePb.GetEventHandlersRequest) request,
              (io.grpc.stub.StreamObserver<com.netflix.conductor.proto.EventHandlerPb.EventHandler>) responseObserver);
          break;
        case METHODID_GET_EVENT_HANDLERS_FOR_EVENT:
          serviceImpl.getEventHandlersForEvent((com.netflix.conductor.grpc.EventServicePb.GetEventHandlersForEventRequest) request,
              (io.grpc.stub.StreamObserver<com.netflix.conductor.proto.EventHandlerPb.EventHandler>) responseObserver);
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

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getAddEventHandlerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.netflix.conductor.grpc.EventServicePb.AddEventHandlerRequest,
              com.netflix.conductor.grpc.EventServicePb.AddEventHandlerResponse>(
                service, METHODID_ADD_EVENT_HANDLER)))
        .addMethod(
          getUpdateEventHandlerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.netflix.conductor.grpc.EventServicePb.UpdateEventHandlerRequest,
              com.netflix.conductor.grpc.EventServicePb.UpdateEventHandlerResponse>(
                service, METHODID_UPDATE_EVENT_HANDLER)))
        .addMethod(
          getRemoveEventHandlerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.netflix.conductor.grpc.EventServicePb.RemoveEventHandlerRequest,
              com.netflix.conductor.grpc.EventServicePb.RemoveEventHandlerResponse>(
                service, METHODID_REMOVE_EVENT_HANDLER)))
        .addMethod(
          getGetEventHandlersMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.netflix.conductor.grpc.EventServicePb.GetEventHandlersRequest,
              com.netflix.conductor.proto.EventHandlerPb.EventHandler>(
                service, METHODID_GET_EVENT_HANDLERS)))
        .addMethod(
          getGetEventHandlersForEventMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.netflix.conductor.grpc.EventServicePb.GetEventHandlersForEventRequest,
              com.netflix.conductor.proto.EventHandlerPb.EventHandler>(
                service, METHODID_GET_EVENT_HANDLERS_FOR_EVENT)))
        .build();
  }

  private static abstract class EventServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EventServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.netflix.conductor.grpc.EventServicePb.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("EventService");
    }
  }

  private static final class EventServiceFileDescriptorSupplier
      extends EventServiceBaseDescriptorSupplier {
    EventServiceFileDescriptorSupplier() {}
  }

  private static final class EventServiceMethodDescriptorSupplier
      extends EventServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    EventServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (EventServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EventServiceFileDescriptorSupplier())
              .addMethod(getAddEventHandlerMethod())
              .addMethod(getUpdateEventHandlerMethod())
              .addMethod(getRemoveEventHandlerMethod())
              .addMethod(getGetEventHandlersMethod())
              .addMethod(getGetEventHandlersForEventMethod())
              .build();
        }
      }
    }
    return result;
  }
}
