package com.netflix.conductor.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: grpc/metadata_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MetadataServiceGrpc {

  private MetadataServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "conductor.grpc.metadata.MetadataService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.netflix.conductor.grpc.MetadataServicePb.CreateWorkflowRequest,
      com.netflix.conductor.grpc.MetadataServicePb.CreateWorkflowResponse> getCreateWorkflowMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateWorkflow",
      requestType = com.netflix.conductor.grpc.MetadataServicePb.CreateWorkflowRequest.class,
      responseType = com.netflix.conductor.grpc.MetadataServicePb.CreateWorkflowResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.netflix.conductor.grpc.MetadataServicePb.CreateWorkflowRequest,
      com.netflix.conductor.grpc.MetadataServicePb.CreateWorkflowResponse> getCreateWorkflowMethod() {
    io.grpc.MethodDescriptor<com.netflix.conductor.grpc.MetadataServicePb.CreateWorkflowRequest, com.netflix.conductor.grpc.MetadataServicePb.CreateWorkflowResponse> getCreateWorkflowMethod;
    if ((getCreateWorkflowMethod = MetadataServiceGrpc.getCreateWorkflowMethod) == null) {
      synchronized (MetadataServiceGrpc.class) {
        if ((getCreateWorkflowMethod = MetadataServiceGrpc.getCreateWorkflowMethod) == null) {
          MetadataServiceGrpc.getCreateWorkflowMethod = getCreateWorkflowMethod =
              io.grpc.MethodDescriptor.<com.netflix.conductor.grpc.MetadataServicePb.CreateWorkflowRequest, com.netflix.conductor.grpc.MetadataServicePb.CreateWorkflowResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateWorkflow"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netflix.conductor.grpc.MetadataServicePb.CreateWorkflowRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netflix.conductor.grpc.MetadataServicePb.CreateWorkflowResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MetadataServiceMethodDescriptorSupplier("CreateWorkflow"))
              .build();
        }
      }
    }
    return getCreateWorkflowMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.netflix.conductor.grpc.MetadataServicePb.ValidateWorkflowRequest,
      com.netflix.conductor.grpc.MetadataServicePb.ValidateWorkflowResponse> getValidateWorkflowMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ValidateWorkflow",
      requestType = com.netflix.conductor.grpc.MetadataServicePb.ValidateWorkflowRequest.class,
      responseType = com.netflix.conductor.grpc.MetadataServicePb.ValidateWorkflowResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.netflix.conductor.grpc.MetadataServicePb.ValidateWorkflowRequest,
      com.netflix.conductor.grpc.MetadataServicePb.ValidateWorkflowResponse> getValidateWorkflowMethod() {
    io.grpc.MethodDescriptor<com.netflix.conductor.grpc.MetadataServicePb.ValidateWorkflowRequest, com.netflix.conductor.grpc.MetadataServicePb.ValidateWorkflowResponse> getValidateWorkflowMethod;
    if ((getValidateWorkflowMethod = MetadataServiceGrpc.getValidateWorkflowMethod) == null) {
      synchronized (MetadataServiceGrpc.class) {
        if ((getValidateWorkflowMethod = MetadataServiceGrpc.getValidateWorkflowMethod) == null) {
          MetadataServiceGrpc.getValidateWorkflowMethod = getValidateWorkflowMethod =
              io.grpc.MethodDescriptor.<com.netflix.conductor.grpc.MetadataServicePb.ValidateWorkflowRequest, com.netflix.conductor.grpc.MetadataServicePb.ValidateWorkflowResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ValidateWorkflow"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netflix.conductor.grpc.MetadataServicePb.ValidateWorkflowRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netflix.conductor.grpc.MetadataServicePb.ValidateWorkflowResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MetadataServiceMethodDescriptorSupplier("ValidateWorkflow"))
              .build();
        }
      }
    }
    return getValidateWorkflowMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.netflix.conductor.grpc.MetadataServicePb.UpdateWorkflowsRequest,
      com.netflix.conductor.grpc.MetadataServicePb.UpdateWorkflowsResponse> getUpdateWorkflowsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateWorkflows",
      requestType = com.netflix.conductor.grpc.MetadataServicePb.UpdateWorkflowsRequest.class,
      responseType = com.netflix.conductor.grpc.MetadataServicePb.UpdateWorkflowsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.netflix.conductor.grpc.MetadataServicePb.UpdateWorkflowsRequest,
      com.netflix.conductor.grpc.MetadataServicePb.UpdateWorkflowsResponse> getUpdateWorkflowsMethod() {
    io.grpc.MethodDescriptor<com.netflix.conductor.grpc.MetadataServicePb.UpdateWorkflowsRequest, com.netflix.conductor.grpc.MetadataServicePb.UpdateWorkflowsResponse> getUpdateWorkflowsMethod;
    if ((getUpdateWorkflowsMethod = MetadataServiceGrpc.getUpdateWorkflowsMethod) == null) {
      synchronized (MetadataServiceGrpc.class) {
        if ((getUpdateWorkflowsMethod = MetadataServiceGrpc.getUpdateWorkflowsMethod) == null) {
          MetadataServiceGrpc.getUpdateWorkflowsMethod = getUpdateWorkflowsMethod =
              io.grpc.MethodDescriptor.<com.netflix.conductor.grpc.MetadataServicePb.UpdateWorkflowsRequest, com.netflix.conductor.grpc.MetadataServicePb.UpdateWorkflowsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateWorkflows"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netflix.conductor.grpc.MetadataServicePb.UpdateWorkflowsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netflix.conductor.grpc.MetadataServicePb.UpdateWorkflowsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MetadataServiceMethodDescriptorSupplier("UpdateWorkflows"))
              .build();
        }
      }
    }
    return getUpdateWorkflowsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.netflix.conductor.grpc.MetadataServicePb.GetWorkflowRequest,
      com.netflix.conductor.grpc.MetadataServicePb.GetWorkflowResponse> getGetWorkflowMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetWorkflow",
      requestType = com.netflix.conductor.grpc.MetadataServicePb.GetWorkflowRequest.class,
      responseType = com.netflix.conductor.grpc.MetadataServicePb.GetWorkflowResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.netflix.conductor.grpc.MetadataServicePb.GetWorkflowRequest,
      com.netflix.conductor.grpc.MetadataServicePb.GetWorkflowResponse> getGetWorkflowMethod() {
    io.grpc.MethodDescriptor<com.netflix.conductor.grpc.MetadataServicePb.GetWorkflowRequest, com.netflix.conductor.grpc.MetadataServicePb.GetWorkflowResponse> getGetWorkflowMethod;
    if ((getGetWorkflowMethod = MetadataServiceGrpc.getGetWorkflowMethod) == null) {
      synchronized (MetadataServiceGrpc.class) {
        if ((getGetWorkflowMethod = MetadataServiceGrpc.getGetWorkflowMethod) == null) {
          MetadataServiceGrpc.getGetWorkflowMethod = getGetWorkflowMethod =
              io.grpc.MethodDescriptor.<com.netflix.conductor.grpc.MetadataServicePb.GetWorkflowRequest, com.netflix.conductor.grpc.MetadataServicePb.GetWorkflowResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetWorkflow"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netflix.conductor.grpc.MetadataServicePb.GetWorkflowRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netflix.conductor.grpc.MetadataServicePb.GetWorkflowResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MetadataServiceMethodDescriptorSupplier("GetWorkflow"))
              .build();
        }
      }
    }
    return getGetWorkflowMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.netflix.conductor.grpc.MetadataServicePb.CreateTasksRequest,
      com.netflix.conductor.grpc.MetadataServicePb.CreateTasksResponse> getCreateTasksMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateTasks",
      requestType = com.netflix.conductor.grpc.MetadataServicePb.CreateTasksRequest.class,
      responseType = com.netflix.conductor.grpc.MetadataServicePb.CreateTasksResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.netflix.conductor.grpc.MetadataServicePb.CreateTasksRequest,
      com.netflix.conductor.grpc.MetadataServicePb.CreateTasksResponse> getCreateTasksMethod() {
    io.grpc.MethodDescriptor<com.netflix.conductor.grpc.MetadataServicePb.CreateTasksRequest, com.netflix.conductor.grpc.MetadataServicePb.CreateTasksResponse> getCreateTasksMethod;
    if ((getCreateTasksMethod = MetadataServiceGrpc.getCreateTasksMethod) == null) {
      synchronized (MetadataServiceGrpc.class) {
        if ((getCreateTasksMethod = MetadataServiceGrpc.getCreateTasksMethod) == null) {
          MetadataServiceGrpc.getCreateTasksMethod = getCreateTasksMethod =
              io.grpc.MethodDescriptor.<com.netflix.conductor.grpc.MetadataServicePb.CreateTasksRequest, com.netflix.conductor.grpc.MetadataServicePb.CreateTasksResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateTasks"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netflix.conductor.grpc.MetadataServicePb.CreateTasksRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netflix.conductor.grpc.MetadataServicePb.CreateTasksResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MetadataServiceMethodDescriptorSupplier("CreateTasks"))
              .build();
        }
      }
    }
    return getCreateTasksMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.netflix.conductor.grpc.MetadataServicePb.UpdateTaskRequest,
      com.netflix.conductor.grpc.MetadataServicePb.UpdateTaskResponse> getUpdateTaskMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateTask",
      requestType = com.netflix.conductor.grpc.MetadataServicePb.UpdateTaskRequest.class,
      responseType = com.netflix.conductor.grpc.MetadataServicePb.UpdateTaskResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.netflix.conductor.grpc.MetadataServicePb.UpdateTaskRequest,
      com.netflix.conductor.grpc.MetadataServicePb.UpdateTaskResponse> getUpdateTaskMethod() {
    io.grpc.MethodDescriptor<com.netflix.conductor.grpc.MetadataServicePb.UpdateTaskRequest, com.netflix.conductor.grpc.MetadataServicePb.UpdateTaskResponse> getUpdateTaskMethod;
    if ((getUpdateTaskMethod = MetadataServiceGrpc.getUpdateTaskMethod) == null) {
      synchronized (MetadataServiceGrpc.class) {
        if ((getUpdateTaskMethod = MetadataServiceGrpc.getUpdateTaskMethod) == null) {
          MetadataServiceGrpc.getUpdateTaskMethod = getUpdateTaskMethod =
              io.grpc.MethodDescriptor.<com.netflix.conductor.grpc.MetadataServicePb.UpdateTaskRequest, com.netflix.conductor.grpc.MetadataServicePb.UpdateTaskResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateTask"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netflix.conductor.grpc.MetadataServicePb.UpdateTaskRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netflix.conductor.grpc.MetadataServicePb.UpdateTaskResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MetadataServiceMethodDescriptorSupplier("UpdateTask"))
              .build();
        }
      }
    }
    return getUpdateTaskMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.netflix.conductor.grpc.MetadataServicePb.GetTaskRequest,
      com.netflix.conductor.grpc.MetadataServicePb.GetTaskResponse> getGetTaskMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTask",
      requestType = com.netflix.conductor.grpc.MetadataServicePb.GetTaskRequest.class,
      responseType = com.netflix.conductor.grpc.MetadataServicePb.GetTaskResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.netflix.conductor.grpc.MetadataServicePb.GetTaskRequest,
      com.netflix.conductor.grpc.MetadataServicePb.GetTaskResponse> getGetTaskMethod() {
    io.grpc.MethodDescriptor<com.netflix.conductor.grpc.MetadataServicePb.GetTaskRequest, com.netflix.conductor.grpc.MetadataServicePb.GetTaskResponse> getGetTaskMethod;
    if ((getGetTaskMethod = MetadataServiceGrpc.getGetTaskMethod) == null) {
      synchronized (MetadataServiceGrpc.class) {
        if ((getGetTaskMethod = MetadataServiceGrpc.getGetTaskMethod) == null) {
          MetadataServiceGrpc.getGetTaskMethod = getGetTaskMethod =
              io.grpc.MethodDescriptor.<com.netflix.conductor.grpc.MetadataServicePb.GetTaskRequest, com.netflix.conductor.grpc.MetadataServicePb.GetTaskResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTask"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netflix.conductor.grpc.MetadataServicePb.GetTaskRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netflix.conductor.grpc.MetadataServicePb.GetTaskResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MetadataServiceMethodDescriptorSupplier("GetTask"))
              .build();
        }
      }
    }
    return getGetTaskMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.netflix.conductor.grpc.MetadataServicePb.DeleteTaskRequest,
      com.netflix.conductor.grpc.MetadataServicePb.DeleteTaskResponse> getDeleteTaskMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteTask",
      requestType = com.netflix.conductor.grpc.MetadataServicePb.DeleteTaskRequest.class,
      responseType = com.netflix.conductor.grpc.MetadataServicePb.DeleteTaskResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.netflix.conductor.grpc.MetadataServicePb.DeleteTaskRequest,
      com.netflix.conductor.grpc.MetadataServicePb.DeleteTaskResponse> getDeleteTaskMethod() {
    io.grpc.MethodDescriptor<com.netflix.conductor.grpc.MetadataServicePb.DeleteTaskRequest, com.netflix.conductor.grpc.MetadataServicePb.DeleteTaskResponse> getDeleteTaskMethod;
    if ((getDeleteTaskMethod = MetadataServiceGrpc.getDeleteTaskMethod) == null) {
      synchronized (MetadataServiceGrpc.class) {
        if ((getDeleteTaskMethod = MetadataServiceGrpc.getDeleteTaskMethod) == null) {
          MetadataServiceGrpc.getDeleteTaskMethod = getDeleteTaskMethod =
              io.grpc.MethodDescriptor.<com.netflix.conductor.grpc.MetadataServicePb.DeleteTaskRequest, com.netflix.conductor.grpc.MetadataServicePb.DeleteTaskResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteTask"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netflix.conductor.grpc.MetadataServicePb.DeleteTaskRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netflix.conductor.grpc.MetadataServicePb.DeleteTaskResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MetadataServiceMethodDescriptorSupplier("DeleteTask"))
              .build();
        }
      }
    }
    return getDeleteTaskMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MetadataServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MetadataServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MetadataServiceStub>() {
        @java.lang.Override
        public MetadataServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MetadataServiceStub(channel, callOptions);
        }
      };
    return MetadataServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MetadataServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MetadataServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MetadataServiceBlockingStub>() {
        @java.lang.Override
        public MetadataServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MetadataServiceBlockingStub(channel, callOptions);
        }
      };
    return MetadataServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MetadataServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MetadataServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MetadataServiceFutureStub>() {
        @java.lang.Override
        public MetadataServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MetadataServiceFutureStub(channel, callOptions);
        }
      };
    return MetadataServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * POST /workflow
     * </pre>
     */
    default void createWorkflow(com.netflix.conductor.grpc.MetadataServicePb.CreateWorkflowRequest request,
        io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.MetadataServicePb.CreateWorkflowResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateWorkflowMethod(), responseObserver);
    }

    /**
     * <pre>
     * POST /workflow/validate
     * </pre>
     */
    default void validateWorkflow(com.netflix.conductor.grpc.MetadataServicePb.ValidateWorkflowRequest request,
        io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.MetadataServicePb.ValidateWorkflowResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getValidateWorkflowMethod(), responseObserver);
    }

    /**
     * <pre>
     * PUT /workflow
     * </pre>
     */
    default void updateWorkflows(com.netflix.conductor.grpc.MetadataServicePb.UpdateWorkflowsRequest request,
        io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.MetadataServicePb.UpdateWorkflowsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateWorkflowsMethod(), responseObserver);
    }

    /**
     * <pre>
     * GET /workflow/{name}
     * </pre>
     */
    default void getWorkflow(com.netflix.conductor.grpc.MetadataServicePb.GetWorkflowRequest request,
        io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.MetadataServicePb.GetWorkflowResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetWorkflowMethod(), responseObserver);
    }

    /**
     * <pre>
     * POST /taskdefs
     * </pre>
     */
    default void createTasks(com.netflix.conductor.grpc.MetadataServicePb.CreateTasksRequest request,
        io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.MetadataServicePb.CreateTasksResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateTasksMethod(), responseObserver);
    }

    /**
     * <pre>
     * PUT /taskdefs
     * </pre>
     */
    default void updateTask(com.netflix.conductor.grpc.MetadataServicePb.UpdateTaskRequest request,
        io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.MetadataServicePb.UpdateTaskResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateTaskMethod(), responseObserver);
    }

    /**
     * <pre>
     * GET /taskdefs/{tasktype}
     * </pre>
     */
    default void getTask(com.netflix.conductor.grpc.MetadataServicePb.GetTaskRequest request,
        io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.MetadataServicePb.GetTaskResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTaskMethod(), responseObserver);
    }

    /**
     * <pre>
     * DELETE /taskdefs/{tasktype}
     * </pre>
     */
    default void deleteTask(com.netflix.conductor.grpc.MetadataServicePb.DeleteTaskRequest request,
        io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.MetadataServicePb.DeleteTaskResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteTaskMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service MetadataService.
   */
  public static abstract class MetadataServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return MetadataServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service MetadataService.
   */
  public static final class MetadataServiceStub
      extends io.grpc.stub.AbstractAsyncStub<MetadataServiceStub> {
    private MetadataServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MetadataServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MetadataServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * POST /workflow
     * </pre>
     */
    public void createWorkflow(com.netflix.conductor.grpc.MetadataServicePb.CreateWorkflowRequest request,
        io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.MetadataServicePb.CreateWorkflowResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateWorkflowMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * POST /workflow/validate
     * </pre>
     */
    public void validateWorkflow(com.netflix.conductor.grpc.MetadataServicePb.ValidateWorkflowRequest request,
        io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.MetadataServicePb.ValidateWorkflowResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getValidateWorkflowMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * PUT /workflow
     * </pre>
     */
    public void updateWorkflows(com.netflix.conductor.grpc.MetadataServicePb.UpdateWorkflowsRequest request,
        io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.MetadataServicePb.UpdateWorkflowsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateWorkflowsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GET /workflow/{name}
     * </pre>
     */
    public void getWorkflow(com.netflix.conductor.grpc.MetadataServicePb.GetWorkflowRequest request,
        io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.MetadataServicePb.GetWorkflowResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetWorkflowMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * POST /taskdefs
     * </pre>
     */
    public void createTasks(com.netflix.conductor.grpc.MetadataServicePb.CreateTasksRequest request,
        io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.MetadataServicePb.CreateTasksResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateTasksMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * PUT /taskdefs
     * </pre>
     */
    public void updateTask(com.netflix.conductor.grpc.MetadataServicePb.UpdateTaskRequest request,
        io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.MetadataServicePb.UpdateTaskResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateTaskMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GET /taskdefs/{tasktype}
     * </pre>
     */
    public void getTask(com.netflix.conductor.grpc.MetadataServicePb.GetTaskRequest request,
        io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.MetadataServicePb.GetTaskResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTaskMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DELETE /taskdefs/{tasktype}
     * </pre>
     */
    public void deleteTask(com.netflix.conductor.grpc.MetadataServicePb.DeleteTaskRequest request,
        io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.MetadataServicePb.DeleteTaskResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteTaskMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service MetadataService.
   */
  public static final class MetadataServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<MetadataServiceBlockingStub> {
    private MetadataServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MetadataServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MetadataServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * POST /workflow
     * </pre>
     */
    public com.netflix.conductor.grpc.MetadataServicePb.CreateWorkflowResponse createWorkflow(com.netflix.conductor.grpc.MetadataServicePb.CreateWorkflowRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateWorkflowMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * POST /workflow/validate
     * </pre>
     */
    public com.netflix.conductor.grpc.MetadataServicePb.ValidateWorkflowResponse validateWorkflow(com.netflix.conductor.grpc.MetadataServicePb.ValidateWorkflowRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getValidateWorkflowMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * PUT /workflow
     * </pre>
     */
    public com.netflix.conductor.grpc.MetadataServicePb.UpdateWorkflowsResponse updateWorkflows(com.netflix.conductor.grpc.MetadataServicePb.UpdateWorkflowsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateWorkflowsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GET /workflow/{name}
     * </pre>
     */
    public com.netflix.conductor.grpc.MetadataServicePb.GetWorkflowResponse getWorkflow(com.netflix.conductor.grpc.MetadataServicePb.GetWorkflowRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetWorkflowMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * POST /taskdefs
     * </pre>
     */
    public com.netflix.conductor.grpc.MetadataServicePb.CreateTasksResponse createTasks(com.netflix.conductor.grpc.MetadataServicePb.CreateTasksRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateTasksMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * PUT /taskdefs
     * </pre>
     */
    public com.netflix.conductor.grpc.MetadataServicePb.UpdateTaskResponse updateTask(com.netflix.conductor.grpc.MetadataServicePb.UpdateTaskRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateTaskMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GET /taskdefs/{tasktype}
     * </pre>
     */
    public com.netflix.conductor.grpc.MetadataServicePb.GetTaskResponse getTask(com.netflix.conductor.grpc.MetadataServicePb.GetTaskRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTaskMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DELETE /taskdefs/{tasktype}
     * </pre>
     */
    public com.netflix.conductor.grpc.MetadataServicePb.DeleteTaskResponse deleteTask(com.netflix.conductor.grpc.MetadataServicePb.DeleteTaskRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteTaskMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service MetadataService.
   */
  public static final class MetadataServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<MetadataServiceFutureStub> {
    private MetadataServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MetadataServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MetadataServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * POST /workflow
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.netflix.conductor.grpc.MetadataServicePb.CreateWorkflowResponse> createWorkflow(
        com.netflix.conductor.grpc.MetadataServicePb.CreateWorkflowRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateWorkflowMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * POST /workflow/validate
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.netflix.conductor.grpc.MetadataServicePb.ValidateWorkflowResponse> validateWorkflow(
        com.netflix.conductor.grpc.MetadataServicePb.ValidateWorkflowRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getValidateWorkflowMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * PUT /workflow
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.netflix.conductor.grpc.MetadataServicePb.UpdateWorkflowsResponse> updateWorkflows(
        com.netflix.conductor.grpc.MetadataServicePb.UpdateWorkflowsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateWorkflowsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GET /workflow/{name}
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.netflix.conductor.grpc.MetadataServicePb.GetWorkflowResponse> getWorkflow(
        com.netflix.conductor.grpc.MetadataServicePb.GetWorkflowRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetWorkflowMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * POST /taskdefs
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.netflix.conductor.grpc.MetadataServicePb.CreateTasksResponse> createTasks(
        com.netflix.conductor.grpc.MetadataServicePb.CreateTasksRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateTasksMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * PUT /taskdefs
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.netflix.conductor.grpc.MetadataServicePb.UpdateTaskResponse> updateTask(
        com.netflix.conductor.grpc.MetadataServicePb.UpdateTaskRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateTaskMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GET /taskdefs/{tasktype}
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.netflix.conductor.grpc.MetadataServicePb.GetTaskResponse> getTask(
        com.netflix.conductor.grpc.MetadataServicePb.GetTaskRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTaskMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DELETE /taskdefs/{tasktype}
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.netflix.conductor.grpc.MetadataServicePb.DeleteTaskResponse> deleteTask(
        com.netflix.conductor.grpc.MetadataServicePb.DeleteTaskRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteTaskMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_WORKFLOW = 0;
  private static final int METHODID_VALIDATE_WORKFLOW = 1;
  private static final int METHODID_UPDATE_WORKFLOWS = 2;
  private static final int METHODID_GET_WORKFLOW = 3;
  private static final int METHODID_CREATE_TASKS = 4;
  private static final int METHODID_UPDATE_TASK = 5;
  private static final int METHODID_GET_TASK = 6;
  private static final int METHODID_DELETE_TASK = 7;

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
        case METHODID_CREATE_WORKFLOW:
          serviceImpl.createWorkflow((com.netflix.conductor.grpc.MetadataServicePb.CreateWorkflowRequest) request,
              (io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.MetadataServicePb.CreateWorkflowResponse>) responseObserver);
          break;
        case METHODID_VALIDATE_WORKFLOW:
          serviceImpl.validateWorkflow((com.netflix.conductor.grpc.MetadataServicePb.ValidateWorkflowRequest) request,
              (io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.MetadataServicePb.ValidateWorkflowResponse>) responseObserver);
          break;
        case METHODID_UPDATE_WORKFLOWS:
          serviceImpl.updateWorkflows((com.netflix.conductor.grpc.MetadataServicePb.UpdateWorkflowsRequest) request,
              (io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.MetadataServicePb.UpdateWorkflowsResponse>) responseObserver);
          break;
        case METHODID_GET_WORKFLOW:
          serviceImpl.getWorkflow((com.netflix.conductor.grpc.MetadataServicePb.GetWorkflowRequest) request,
              (io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.MetadataServicePb.GetWorkflowResponse>) responseObserver);
          break;
        case METHODID_CREATE_TASKS:
          serviceImpl.createTasks((com.netflix.conductor.grpc.MetadataServicePb.CreateTasksRequest) request,
              (io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.MetadataServicePb.CreateTasksResponse>) responseObserver);
          break;
        case METHODID_UPDATE_TASK:
          serviceImpl.updateTask((com.netflix.conductor.grpc.MetadataServicePb.UpdateTaskRequest) request,
              (io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.MetadataServicePb.UpdateTaskResponse>) responseObserver);
          break;
        case METHODID_GET_TASK:
          serviceImpl.getTask((com.netflix.conductor.grpc.MetadataServicePb.GetTaskRequest) request,
              (io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.MetadataServicePb.GetTaskResponse>) responseObserver);
          break;
        case METHODID_DELETE_TASK:
          serviceImpl.deleteTask((com.netflix.conductor.grpc.MetadataServicePb.DeleteTaskRequest) request,
              (io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.MetadataServicePb.DeleteTaskResponse>) responseObserver);
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
          getCreateWorkflowMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.netflix.conductor.grpc.MetadataServicePb.CreateWorkflowRequest,
              com.netflix.conductor.grpc.MetadataServicePb.CreateWorkflowResponse>(
                service, METHODID_CREATE_WORKFLOW)))
        .addMethod(
          getValidateWorkflowMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.netflix.conductor.grpc.MetadataServicePb.ValidateWorkflowRequest,
              com.netflix.conductor.grpc.MetadataServicePb.ValidateWorkflowResponse>(
                service, METHODID_VALIDATE_WORKFLOW)))
        .addMethod(
          getUpdateWorkflowsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.netflix.conductor.grpc.MetadataServicePb.UpdateWorkflowsRequest,
              com.netflix.conductor.grpc.MetadataServicePb.UpdateWorkflowsResponse>(
                service, METHODID_UPDATE_WORKFLOWS)))
        .addMethod(
          getGetWorkflowMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.netflix.conductor.grpc.MetadataServicePb.GetWorkflowRequest,
              com.netflix.conductor.grpc.MetadataServicePb.GetWorkflowResponse>(
                service, METHODID_GET_WORKFLOW)))
        .addMethod(
          getCreateTasksMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.netflix.conductor.grpc.MetadataServicePb.CreateTasksRequest,
              com.netflix.conductor.grpc.MetadataServicePb.CreateTasksResponse>(
                service, METHODID_CREATE_TASKS)))
        .addMethod(
          getUpdateTaskMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.netflix.conductor.grpc.MetadataServicePb.UpdateTaskRequest,
              com.netflix.conductor.grpc.MetadataServicePb.UpdateTaskResponse>(
                service, METHODID_UPDATE_TASK)))
        .addMethod(
          getGetTaskMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.netflix.conductor.grpc.MetadataServicePb.GetTaskRequest,
              com.netflix.conductor.grpc.MetadataServicePb.GetTaskResponse>(
                service, METHODID_GET_TASK)))
        .addMethod(
          getDeleteTaskMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.netflix.conductor.grpc.MetadataServicePb.DeleteTaskRequest,
              com.netflix.conductor.grpc.MetadataServicePb.DeleteTaskResponse>(
                service, METHODID_DELETE_TASK)))
        .build();
  }

  private static abstract class MetadataServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MetadataServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.netflix.conductor.grpc.MetadataServicePb.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MetadataService");
    }
  }

  private static final class MetadataServiceFileDescriptorSupplier
      extends MetadataServiceBaseDescriptorSupplier {
    MetadataServiceFileDescriptorSupplier() {}
  }

  private static final class MetadataServiceMethodDescriptorSupplier
      extends MetadataServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    MetadataServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (MetadataServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MetadataServiceFileDescriptorSupplier())
              .addMethod(getCreateWorkflowMethod())
              .addMethod(getValidateWorkflowMethod())
              .addMethod(getUpdateWorkflowsMethod())
              .addMethod(getGetWorkflowMethod())
              .addMethod(getCreateTasksMethod())
              .addMethod(getUpdateTaskMethod())
              .addMethod(getGetTaskMethod())
              .addMethod(getDeleteTaskMethod())
              .build();
        }
      }
    }
    return result;
  }
}
