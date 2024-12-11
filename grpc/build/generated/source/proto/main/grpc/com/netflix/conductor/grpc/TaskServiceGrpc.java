package com.netflix.conductor.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: grpc/task_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class TaskServiceGrpc {

  private TaskServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "conductor.grpc.tasks.TaskService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.netflix.conductor.grpc.TaskServicePb.PollRequest,
      com.netflix.conductor.grpc.TaskServicePb.PollResponse> getPollMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Poll",
      requestType = com.netflix.conductor.grpc.TaskServicePb.PollRequest.class,
      responseType = com.netflix.conductor.grpc.TaskServicePb.PollResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.netflix.conductor.grpc.TaskServicePb.PollRequest,
      com.netflix.conductor.grpc.TaskServicePb.PollResponse> getPollMethod() {
    io.grpc.MethodDescriptor<com.netflix.conductor.grpc.TaskServicePb.PollRequest, com.netflix.conductor.grpc.TaskServicePb.PollResponse> getPollMethod;
    if ((getPollMethod = TaskServiceGrpc.getPollMethod) == null) {
      synchronized (TaskServiceGrpc.class) {
        if ((getPollMethod = TaskServiceGrpc.getPollMethod) == null) {
          TaskServiceGrpc.getPollMethod = getPollMethod =
              io.grpc.MethodDescriptor.<com.netflix.conductor.grpc.TaskServicePb.PollRequest, com.netflix.conductor.grpc.TaskServicePb.PollResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Poll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netflix.conductor.grpc.TaskServicePb.PollRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netflix.conductor.grpc.TaskServicePb.PollResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TaskServiceMethodDescriptorSupplier("Poll"))
              .build();
        }
      }
    }
    return getPollMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.netflix.conductor.grpc.TaskServicePb.BatchPollRequest,
      com.netflix.conductor.proto.TaskPb.Task> getBatchPollMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BatchPoll",
      requestType = com.netflix.conductor.grpc.TaskServicePb.BatchPollRequest.class,
      responseType = com.netflix.conductor.proto.TaskPb.Task.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.netflix.conductor.grpc.TaskServicePb.BatchPollRequest,
      com.netflix.conductor.proto.TaskPb.Task> getBatchPollMethod() {
    io.grpc.MethodDescriptor<com.netflix.conductor.grpc.TaskServicePb.BatchPollRequest, com.netflix.conductor.proto.TaskPb.Task> getBatchPollMethod;
    if ((getBatchPollMethod = TaskServiceGrpc.getBatchPollMethod) == null) {
      synchronized (TaskServiceGrpc.class) {
        if ((getBatchPollMethod = TaskServiceGrpc.getBatchPollMethod) == null) {
          TaskServiceGrpc.getBatchPollMethod = getBatchPollMethod =
              io.grpc.MethodDescriptor.<com.netflix.conductor.grpc.TaskServicePb.BatchPollRequest, com.netflix.conductor.proto.TaskPb.Task>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BatchPoll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netflix.conductor.grpc.TaskServicePb.BatchPollRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netflix.conductor.proto.TaskPb.Task.getDefaultInstance()))
              .setSchemaDescriptor(new TaskServiceMethodDescriptorSupplier("BatchPoll"))
              .build();
        }
      }
    }
    return getBatchPollMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.netflix.conductor.grpc.TaskServicePb.UpdateTaskRequest,
      com.netflix.conductor.grpc.TaskServicePb.UpdateTaskResponse> getUpdateTaskMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateTask",
      requestType = com.netflix.conductor.grpc.TaskServicePb.UpdateTaskRequest.class,
      responseType = com.netflix.conductor.grpc.TaskServicePb.UpdateTaskResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.netflix.conductor.grpc.TaskServicePb.UpdateTaskRequest,
      com.netflix.conductor.grpc.TaskServicePb.UpdateTaskResponse> getUpdateTaskMethod() {
    io.grpc.MethodDescriptor<com.netflix.conductor.grpc.TaskServicePb.UpdateTaskRequest, com.netflix.conductor.grpc.TaskServicePb.UpdateTaskResponse> getUpdateTaskMethod;
    if ((getUpdateTaskMethod = TaskServiceGrpc.getUpdateTaskMethod) == null) {
      synchronized (TaskServiceGrpc.class) {
        if ((getUpdateTaskMethod = TaskServiceGrpc.getUpdateTaskMethod) == null) {
          TaskServiceGrpc.getUpdateTaskMethod = getUpdateTaskMethod =
              io.grpc.MethodDescriptor.<com.netflix.conductor.grpc.TaskServicePb.UpdateTaskRequest, com.netflix.conductor.grpc.TaskServicePb.UpdateTaskResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateTask"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netflix.conductor.grpc.TaskServicePb.UpdateTaskRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netflix.conductor.grpc.TaskServicePb.UpdateTaskResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TaskServiceMethodDescriptorSupplier("UpdateTask"))
              .build();
        }
      }
    }
    return getUpdateTaskMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.netflix.conductor.grpc.TaskServicePb.AddLogRequest,
      com.netflix.conductor.grpc.TaskServicePb.AddLogResponse> getAddLogMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddLog",
      requestType = com.netflix.conductor.grpc.TaskServicePb.AddLogRequest.class,
      responseType = com.netflix.conductor.grpc.TaskServicePb.AddLogResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.netflix.conductor.grpc.TaskServicePb.AddLogRequest,
      com.netflix.conductor.grpc.TaskServicePb.AddLogResponse> getAddLogMethod() {
    io.grpc.MethodDescriptor<com.netflix.conductor.grpc.TaskServicePb.AddLogRequest, com.netflix.conductor.grpc.TaskServicePb.AddLogResponse> getAddLogMethod;
    if ((getAddLogMethod = TaskServiceGrpc.getAddLogMethod) == null) {
      synchronized (TaskServiceGrpc.class) {
        if ((getAddLogMethod = TaskServiceGrpc.getAddLogMethod) == null) {
          TaskServiceGrpc.getAddLogMethod = getAddLogMethod =
              io.grpc.MethodDescriptor.<com.netflix.conductor.grpc.TaskServicePb.AddLogRequest, com.netflix.conductor.grpc.TaskServicePb.AddLogResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddLog"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netflix.conductor.grpc.TaskServicePb.AddLogRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netflix.conductor.grpc.TaskServicePb.AddLogResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TaskServiceMethodDescriptorSupplier("AddLog"))
              .build();
        }
      }
    }
    return getAddLogMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.netflix.conductor.grpc.TaskServicePb.GetTaskLogsRequest,
      com.netflix.conductor.grpc.TaskServicePb.GetTaskLogsResponse> getGetTaskLogsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTaskLogs",
      requestType = com.netflix.conductor.grpc.TaskServicePb.GetTaskLogsRequest.class,
      responseType = com.netflix.conductor.grpc.TaskServicePb.GetTaskLogsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.netflix.conductor.grpc.TaskServicePb.GetTaskLogsRequest,
      com.netflix.conductor.grpc.TaskServicePb.GetTaskLogsResponse> getGetTaskLogsMethod() {
    io.grpc.MethodDescriptor<com.netflix.conductor.grpc.TaskServicePb.GetTaskLogsRequest, com.netflix.conductor.grpc.TaskServicePb.GetTaskLogsResponse> getGetTaskLogsMethod;
    if ((getGetTaskLogsMethod = TaskServiceGrpc.getGetTaskLogsMethod) == null) {
      synchronized (TaskServiceGrpc.class) {
        if ((getGetTaskLogsMethod = TaskServiceGrpc.getGetTaskLogsMethod) == null) {
          TaskServiceGrpc.getGetTaskLogsMethod = getGetTaskLogsMethod =
              io.grpc.MethodDescriptor.<com.netflix.conductor.grpc.TaskServicePb.GetTaskLogsRequest, com.netflix.conductor.grpc.TaskServicePb.GetTaskLogsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTaskLogs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netflix.conductor.grpc.TaskServicePb.GetTaskLogsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netflix.conductor.grpc.TaskServicePb.GetTaskLogsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TaskServiceMethodDescriptorSupplier("GetTaskLogs"))
              .build();
        }
      }
    }
    return getGetTaskLogsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.netflix.conductor.grpc.TaskServicePb.GetTaskRequest,
      com.netflix.conductor.grpc.TaskServicePb.GetTaskResponse> getGetTaskMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTask",
      requestType = com.netflix.conductor.grpc.TaskServicePb.GetTaskRequest.class,
      responseType = com.netflix.conductor.grpc.TaskServicePb.GetTaskResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.netflix.conductor.grpc.TaskServicePb.GetTaskRequest,
      com.netflix.conductor.grpc.TaskServicePb.GetTaskResponse> getGetTaskMethod() {
    io.grpc.MethodDescriptor<com.netflix.conductor.grpc.TaskServicePb.GetTaskRequest, com.netflix.conductor.grpc.TaskServicePb.GetTaskResponse> getGetTaskMethod;
    if ((getGetTaskMethod = TaskServiceGrpc.getGetTaskMethod) == null) {
      synchronized (TaskServiceGrpc.class) {
        if ((getGetTaskMethod = TaskServiceGrpc.getGetTaskMethod) == null) {
          TaskServiceGrpc.getGetTaskMethod = getGetTaskMethod =
              io.grpc.MethodDescriptor.<com.netflix.conductor.grpc.TaskServicePb.GetTaskRequest, com.netflix.conductor.grpc.TaskServicePb.GetTaskResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTask"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netflix.conductor.grpc.TaskServicePb.GetTaskRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netflix.conductor.grpc.TaskServicePb.GetTaskResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TaskServiceMethodDescriptorSupplier("GetTask"))
              .build();
        }
      }
    }
    return getGetTaskMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.netflix.conductor.grpc.TaskServicePb.QueueSizesRequest,
      com.netflix.conductor.grpc.TaskServicePb.QueueSizesResponse> getGetQueueSizesForTasksMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetQueueSizesForTasks",
      requestType = com.netflix.conductor.grpc.TaskServicePb.QueueSizesRequest.class,
      responseType = com.netflix.conductor.grpc.TaskServicePb.QueueSizesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.netflix.conductor.grpc.TaskServicePb.QueueSizesRequest,
      com.netflix.conductor.grpc.TaskServicePb.QueueSizesResponse> getGetQueueSizesForTasksMethod() {
    io.grpc.MethodDescriptor<com.netflix.conductor.grpc.TaskServicePb.QueueSizesRequest, com.netflix.conductor.grpc.TaskServicePb.QueueSizesResponse> getGetQueueSizesForTasksMethod;
    if ((getGetQueueSizesForTasksMethod = TaskServiceGrpc.getGetQueueSizesForTasksMethod) == null) {
      synchronized (TaskServiceGrpc.class) {
        if ((getGetQueueSizesForTasksMethod = TaskServiceGrpc.getGetQueueSizesForTasksMethod) == null) {
          TaskServiceGrpc.getGetQueueSizesForTasksMethod = getGetQueueSizesForTasksMethod =
              io.grpc.MethodDescriptor.<com.netflix.conductor.grpc.TaskServicePb.QueueSizesRequest, com.netflix.conductor.grpc.TaskServicePb.QueueSizesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetQueueSizesForTasks"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netflix.conductor.grpc.TaskServicePb.QueueSizesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netflix.conductor.grpc.TaskServicePb.QueueSizesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TaskServiceMethodDescriptorSupplier("GetQueueSizesForTasks"))
              .build();
        }
      }
    }
    return getGetQueueSizesForTasksMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.netflix.conductor.grpc.TaskServicePb.QueueInfoRequest,
      com.netflix.conductor.grpc.TaskServicePb.QueueInfoResponse> getGetQueueInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetQueueInfo",
      requestType = com.netflix.conductor.grpc.TaskServicePb.QueueInfoRequest.class,
      responseType = com.netflix.conductor.grpc.TaskServicePb.QueueInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.netflix.conductor.grpc.TaskServicePb.QueueInfoRequest,
      com.netflix.conductor.grpc.TaskServicePb.QueueInfoResponse> getGetQueueInfoMethod() {
    io.grpc.MethodDescriptor<com.netflix.conductor.grpc.TaskServicePb.QueueInfoRequest, com.netflix.conductor.grpc.TaskServicePb.QueueInfoResponse> getGetQueueInfoMethod;
    if ((getGetQueueInfoMethod = TaskServiceGrpc.getGetQueueInfoMethod) == null) {
      synchronized (TaskServiceGrpc.class) {
        if ((getGetQueueInfoMethod = TaskServiceGrpc.getGetQueueInfoMethod) == null) {
          TaskServiceGrpc.getGetQueueInfoMethod = getGetQueueInfoMethod =
              io.grpc.MethodDescriptor.<com.netflix.conductor.grpc.TaskServicePb.QueueInfoRequest, com.netflix.conductor.grpc.TaskServicePb.QueueInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetQueueInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netflix.conductor.grpc.TaskServicePb.QueueInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netflix.conductor.grpc.TaskServicePb.QueueInfoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TaskServiceMethodDescriptorSupplier("GetQueueInfo"))
              .build();
        }
      }
    }
    return getGetQueueInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.netflix.conductor.grpc.TaskServicePb.QueueAllInfoRequest,
      com.netflix.conductor.grpc.TaskServicePb.QueueAllInfoResponse> getGetQueueAllInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetQueueAllInfo",
      requestType = com.netflix.conductor.grpc.TaskServicePb.QueueAllInfoRequest.class,
      responseType = com.netflix.conductor.grpc.TaskServicePb.QueueAllInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.netflix.conductor.grpc.TaskServicePb.QueueAllInfoRequest,
      com.netflix.conductor.grpc.TaskServicePb.QueueAllInfoResponse> getGetQueueAllInfoMethod() {
    io.grpc.MethodDescriptor<com.netflix.conductor.grpc.TaskServicePb.QueueAllInfoRequest, com.netflix.conductor.grpc.TaskServicePb.QueueAllInfoResponse> getGetQueueAllInfoMethod;
    if ((getGetQueueAllInfoMethod = TaskServiceGrpc.getGetQueueAllInfoMethod) == null) {
      synchronized (TaskServiceGrpc.class) {
        if ((getGetQueueAllInfoMethod = TaskServiceGrpc.getGetQueueAllInfoMethod) == null) {
          TaskServiceGrpc.getGetQueueAllInfoMethod = getGetQueueAllInfoMethod =
              io.grpc.MethodDescriptor.<com.netflix.conductor.grpc.TaskServicePb.QueueAllInfoRequest, com.netflix.conductor.grpc.TaskServicePb.QueueAllInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetQueueAllInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netflix.conductor.grpc.TaskServicePb.QueueAllInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netflix.conductor.grpc.TaskServicePb.QueueAllInfoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TaskServiceMethodDescriptorSupplier("GetQueueAllInfo"))
              .build();
        }
      }
    }
    return getGetQueueAllInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.netflix.conductor.grpc.SearchPb.Request,
      com.netflix.conductor.grpc.TaskServicePb.TaskSummarySearchResult> getSearchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Search",
      requestType = com.netflix.conductor.grpc.SearchPb.Request.class,
      responseType = com.netflix.conductor.grpc.TaskServicePb.TaskSummarySearchResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.netflix.conductor.grpc.SearchPb.Request,
      com.netflix.conductor.grpc.TaskServicePb.TaskSummarySearchResult> getSearchMethod() {
    io.grpc.MethodDescriptor<com.netflix.conductor.grpc.SearchPb.Request, com.netflix.conductor.grpc.TaskServicePb.TaskSummarySearchResult> getSearchMethod;
    if ((getSearchMethod = TaskServiceGrpc.getSearchMethod) == null) {
      synchronized (TaskServiceGrpc.class) {
        if ((getSearchMethod = TaskServiceGrpc.getSearchMethod) == null) {
          TaskServiceGrpc.getSearchMethod = getSearchMethod =
              io.grpc.MethodDescriptor.<com.netflix.conductor.grpc.SearchPb.Request, com.netflix.conductor.grpc.TaskServicePb.TaskSummarySearchResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Search"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netflix.conductor.grpc.SearchPb.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netflix.conductor.grpc.TaskServicePb.TaskSummarySearchResult.getDefaultInstance()))
              .setSchemaDescriptor(new TaskServiceMethodDescriptorSupplier("Search"))
              .build();
        }
      }
    }
    return getSearchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.netflix.conductor.grpc.SearchPb.Request,
      com.netflix.conductor.grpc.TaskServicePb.TaskSearchResult> getSearchV2Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SearchV2",
      requestType = com.netflix.conductor.grpc.SearchPb.Request.class,
      responseType = com.netflix.conductor.grpc.TaskServicePb.TaskSearchResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.netflix.conductor.grpc.SearchPb.Request,
      com.netflix.conductor.grpc.TaskServicePb.TaskSearchResult> getSearchV2Method() {
    io.grpc.MethodDescriptor<com.netflix.conductor.grpc.SearchPb.Request, com.netflix.conductor.grpc.TaskServicePb.TaskSearchResult> getSearchV2Method;
    if ((getSearchV2Method = TaskServiceGrpc.getSearchV2Method) == null) {
      synchronized (TaskServiceGrpc.class) {
        if ((getSearchV2Method = TaskServiceGrpc.getSearchV2Method) == null) {
          TaskServiceGrpc.getSearchV2Method = getSearchV2Method =
              io.grpc.MethodDescriptor.<com.netflix.conductor.grpc.SearchPb.Request, com.netflix.conductor.grpc.TaskServicePb.TaskSearchResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SearchV2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netflix.conductor.grpc.SearchPb.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netflix.conductor.grpc.TaskServicePb.TaskSearchResult.getDefaultInstance()))
              .setSchemaDescriptor(new TaskServiceMethodDescriptorSupplier("SearchV2"))
              .build();
        }
      }
    }
    return getSearchV2Method;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TaskServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TaskServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TaskServiceStub>() {
        @java.lang.Override
        public TaskServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TaskServiceStub(channel, callOptions);
        }
      };
    return TaskServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TaskServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TaskServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TaskServiceBlockingStub>() {
        @java.lang.Override
        public TaskServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TaskServiceBlockingStub(channel, callOptions);
        }
      };
    return TaskServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TaskServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TaskServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TaskServiceFutureStub>() {
        @java.lang.Override
        public TaskServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TaskServiceFutureStub(channel, callOptions);
        }
      };
    return TaskServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * GET /poll/{tasktype}
     * </pre>
     */
    default void poll(com.netflix.conductor.grpc.TaskServicePb.PollRequest request,
        io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.TaskServicePb.PollResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPollMethod(), responseObserver);
    }

    /**
     * <pre>
     * /poll/batch/{tasktype}
     * </pre>
     */
    default void batchPoll(com.netflix.conductor.grpc.TaskServicePb.BatchPollRequest request,
        io.grpc.stub.StreamObserver<com.netflix.conductor.proto.TaskPb.Task> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBatchPollMethod(), responseObserver);
    }

    /**
     * <pre>
     * POST /
     * </pre>
     */
    default void updateTask(com.netflix.conductor.grpc.TaskServicePb.UpdateTaskRequest request,
        io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.TaskServicePb.UpdateTaskResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateTaskMethod(), responseObserver);
    }

    /**
     * <pre>
     * POST /{taskId}/log
     * </pre>
     */
    default void addLog(com.netflix.conductor.grpc.TaskServicePb.AddLogRequest request,
        io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.TaskServicePb.AddLogResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddLogMethod(), responseObserver);
    }

    /**
     * <pre>
     * GET {taskId}/log
     * </pre>
     */
    default void getTaskLogs(com.netflix.conductor.grpc.TaskServicePb.GetTaskLogsRequest request,
        io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.TaskServicePb.GetTaskLogsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTaskLogsMethod(), responseObserver);
    }

    /**
     * <pre>
     * GET /{taskId}
     * </pre>
     */
    default void getTask(com.netflix.conductor.grpc.TaskServicePb.GetTaskRequest request,
        io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.TaskServicePb.GetTaskResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTaskMethod(), responseObserver);
    }

    /**
     * <pre>
     * GET /queue/sizes
     * </pre>
     */
    default void getQueueSizesForTasks(com.netflix.conductor.grpc.TaskServicePb.QueueSizesRequest request,
        io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.TaskServicePb.QueueSizesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetQueueSizesForTasksMethod(), responseObserver);
    }

    /**
     * <pre>
     * GET /queue/all
     * </pre>
     */
    default void getQueueInfo(com.netflix.conductor.grpc.TaskServicePb.QueueInfoRequest request,
        io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.TaskServicePb.QueueInfoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetQueueInfoMethod(), responseObserver);
    }

    /**
     * <pre>
     * GET /queue/all/verbose
     * </pre>
     */
    default void getQueueAllInfo(com.netflix.conductor.grpc.TaskServicePb.QueueAllInfoRequest request,
        io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.TaskServicePb.QueueAllInfoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetQueueAllInfoMethod(), responseObserver);
    }

    /**
     * <pre>
     * GET /search
     * </pre>
     */
    default void search(com.netflix.conductor.grpc.SearchPb.Request request,
        io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.TaskServicePb.TaskSummarySearchResult> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchMethod(), responseObserver);
    }

    /**
     * <pre>
     * GET /searchV2
     * </pre>
     */
    default void searchV2(com.netflix.conductor.grpc.SearchPb.Request request,
        io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.TaskServicePb.TaskSearchResult> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchV2Method(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service TaskService.
   */
  public static abstract class TaskServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return TaskServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service TaskService.
   */
  public static final class TaskServiceStub
      extends io.grpc.stub.AbstractAsyncStub<TaskServiceStub> {
    private TaskServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TaskServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TaskServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * GET /poll/{tasktype}
     * </pre>
     */
    public void poll(com.netflix.conductor.grpc.TaskServicePb.PollRequest request,
        io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.TaskServicePb.PollResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPollMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * /poll/batch/{tasktype}
     * </pre>
     */
    public void batchPoll(com.netflix.conductor.grpc.TaskServicePb.BatchPollRequest request,
        io.grpc.stub.StreamObserver<com.netflix.conductor.proto.TaskPb.Task> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getBatchPollMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * POST /
     * </pre>
     */
    public void updateTask(com.netflix.conductor.grpc.TaskServicePb.UpdateTaskRequest request,
        io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.TaskServicePb.UpdateTaskResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateTaskMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * POST /{taskId}/log
     * </pre>
     */
    public void addLog(com.netflix.conductor.grpc.TaskServicePb.AddLogRequest request,
        io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.TaskServicePb.AddLogResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddLogMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GET {taskId}/log
     * </pre>
     */
    public void getTaskLogs(com.netflix.conductor.grpc.TaskServicePb.GetTaskLogsRequest request,
        io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.TaskServicePb.GetTaskLogsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTaskLogsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GET /{taskId}
     * </pre>
     */
    public void getTask(com.netflix.conductor.grpc.TaskServicePb.GetTaskRequest request,
        io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.TaskServicePb.GetTaskResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTaskMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GET /queue/sizes
     * </pre>
     */
    public void getQueueSizesForTasks(com.netflix.conductor.grpc.TaskServicePb.QueueSizesRequest request,
        io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.TaskServicePb.QueueSizesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetQueueSizesForTasksMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GET /queue/all
     * </pre>
     */
    public void getQueueInfo(com.netflix.conductor.grpc.TaskServicePb.QueueInfoRequest request,
        io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.TaskServicePb.QueueInfoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetQueueInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GET /queue/all/verbose
     * </pre>
     */
    public void getQueueAllInfo(com.netflix.conductor.grpc.TaskServicePb.QueueAllInfoRequest request,
        io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.TaskServicePb.QueueAllInfoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetQueueAllInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GET /search
     * </pre>
     */
    public void search(com.netflix.conductor.grpc.SearchPb.Request request,
        io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.TaskServicePb.TaskSummarySearchResult> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSearchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GET /searchV2
     * </pre>
     */
    public void searchV2(com.netflix.conductor.grpc.SearchPb.Request request,
        io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.TaskServicePb.TaskSearchResult> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSearchV2Method(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service TaskService.
   */
  public static final class TaskServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<TaskServiceBlockingStub> {
    private TaskServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TaskServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TaskServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * GET /poll/{tasktype}
     * </pre>
     */
    public com.netflix.conductor.grpc.TaskServicePb.PollResponse poll(com.netflix.conductor.grpc.TaskServicePb.PollRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPollMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * /poll/batch/{tasktype}
     * </pre>
     */
    public java.util.Iterator<com.netflix.conductor.proto.TaskPb.Task> batchPoll(
        com.netflix.conductor.grpc.TaskServicePb.BatchPollRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getBatchPollMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * POST /
     * </pre>
     */
    public com.netflix.conductor.grpc.TaskServicePb.UpdateTaskResponse updateTask(com.netflix.conductor.grpc.TaskServicePb.UpdateTaskRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateTaskMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * POST /{taskId}/log
     * </pre>
     */
    public com.netflix.conductor.grpc.TaskServicePb.AddLogResponse addLog(com.netflix.conductor.grpc.TaskServicePb.AddLogRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddLogMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GET {taskId}/log
     * </pre>
     */
    public com.netflix.conductor.grpc.TaskServicePb.GetTaskLogsResponse getTaskLogs(com.netflix.conductor.grpc.TaskServicePb.GetTaskLogsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTaskLogsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GET /{taskId}
     * </pre>
     */
    public com.netflix.conductor.grpc.TaskServicePb.GetTaskResponse getTask(com.netflix.conductor.grpc.TaskServicePb.GetTaskRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTaskMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GET /queue/sizes
     * </pre>
     */
    public com.netflix.conductor.grpc.TaskServicePb.QueueSizesResponse getQueueSizesForTasks(com.netflix.conductor.grpc.TaskServicePb.QueueSizesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetQueueSizesForTasksMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GET /queue/all
     * </pre>
     */
    public com.netflix.conductor.grpc.TaskServicePb.QueueInfoResponse getQueueInfo(com.netflix.conductor.grpc.TaskServicePb.QueueInfoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetQueueInfoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GET /queue/all/verbose
     * </pre>
     */
    public com.netflix.conductor.grpc.TaskServicePb.QueueAllInfoResponse getQueueAllInfo(com.netflix.conductor.grpc.TaskServicePb.QueueAllInfoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetQueueAllInfoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GET /search
     * </pre>
     */
    public com.netflix.conductor.grpc.TaskServicePb.TaskSummarySearchResult search(com.netflix.conductor.grpc.SearchPb.Request request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GET /searchV2
     * </pre>
     */
    public com.netflix.conductor.grpc.TaskServicePb.TaskSearchResult searchV2(com.netflix.conductor.grpc.SearchPb.Request request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchV2Method(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service TaskService.
   */
  public static final class TaskServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<TaskServiceFutureStub> {
    private TaskServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TaskServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TaskServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * GET /poll/{tasktype}
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.netflix.conductor.grpc.TaskServicePb.PollResponse> poll(
        com.netflix.conductor.grpc.TaskServicePb.PollRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPollMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * POST /
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.netflix.conductor.grpc.TaskServicePb.UpdateTaskResponse> updateTask(
        com.netflix.conductor.grpc.TaskServicePb.UpdateTaskRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateTaskMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * POST /{taskId}/log
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.netflix.conductor.grpc.TaskServicePb.AddLogResponse> addLog(
        com.netflix.conductor.grpc.TaskServicePb.AddLogRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddLogMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GET {taskId}/log
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.netflix.conductor.grpc.TaskServicePb.GetTaskLogsResponse> getTaskLogs(
        com.netflix.conductor.grpc.TaskServicePb.GetTaskLogsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTaskLogsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GET /{taskId}
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.netflix.conductor.grpc.TaskServicePb.GetTaskResponse> getTask(
        com.netflix.conductor.grpc.TaskServicePb.GetTaskRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTaskMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GET /queue/sizes
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.netflix.conductor.grpc.TaskServicePb.QueueSizesResponse> getQueueSizesForTasks(
        com.netflix.conductor.grpc.TaskServicePb.QueueSizesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetQueueSizesForTasksMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GET /queue/all
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.netflix.conductor.grpc.TaskServicePb.QueueInfoResponse> getQueueInfo(
        com.netflix.conductor.grpc.TaskServicePb.QueueInfoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetQueueInfoMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GET /queue/all/verbose
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.netflix.conductor.grpc.TaskServicePb.QueueAllInfoResponse> getQueueAllInfo(
        com.netflix.conductor.grpc.TaskServicePb.QueueAllInfoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetQueueAllInfoMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GET /search
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.netflix.conductor.grpc.TaskServicePb.TaskSummarySearchResult> search(
        com.netflix.conductor.grpc.SearchPb.Request request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSearchMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GET /searchV2
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.netflix.conductor.grpc.TaskServicePb.TaskSearchResult> searchV2(
        com.netflix.conductor.grpc.SearchPb.Request request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSearchV2Method(), getCallOptions()), request);
    }
  }

  private static final int METHODID_POLL = 0;
  private static final int METHODID_BATCH_POLL = 1;
  private static final int METHODID_UPDATE_TASK = 2;
  private static final int METHODID_ADD_LOG = 3;
  private static final int METHODID_GET_TASK_LOGS = 4;
  private static final int METHODID_GET_TASK = 5;
  private static final int METHODID_GET_QUEUE_SIZES_FOR_TASKS = 6;
  private static final int METHODID_GET_QUEUE_INFO = 7;
  private static final int METHODID_GET_QUEUE_ALL_INFO = 8;
  private static final int METHODID_SEARCH = 9;
  private static final int METHODID_SEARCH_V2 = 10;

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
        case METHODID_POLL:
          serviceImpl.poll((com.netflix.conductor.grpc.TaskServicePb.PollRequest) request,
              (io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.TaskServicePb.PollResponse>) responseObserver);
          break;
        case METHODID_BATCH_POLL:
          serviceImpl.batchPoll((com.netflix.conductor.grpc.TaskServicePb.BatchPollRequest) request,
              (io.grpc.stub.StreamObserver<com.netflix.conductor.proto.TaskPb.Task>) responseObserver);
          break;
        case METHODID_UPDATE_TASK:
          serviceImpl.updateTask((com.netflix.conductor.grpc.TaskServicePb.UpdateTaskRequest) request,
              (io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.TaskServicePb.UpdateTaskResponse>) responseObserver);
          break;
        case METHODID_ADD_LOG:
          serviceImpl.addLog((com.netflix.conductor.grpc.TaskServicePb.AddLogRequest) request,
              (io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.TaskServicePb.AddLogResponse>) responseObserver);
          break;
        case METHODID_GET_TASK_LOGS:
          serviceImpl.getTaskLogs((com.netflix.conductor.grpc.TaskServicePb.GetTaskLogsRequest) request,
              (io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.TaskServicePb.GetTaskLogsResponse>) responseObserver);
          break;
        case METHODID_GET_TASK:
          serviceImpl.getTask((com.netflix.conductor.grpc.TaskServicePb.GetTaskRequest) request,
              (io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.TaskServicePb.GetTaskResponse>) responseObserver);
          break;
        case METHODID_GET_QUEUE_SIZES_FOR_TASKS:
          serviceImpl.getQueueSizesForTasks((com.netflix.conductor.grpc.TaskServicePb.QueueSizesRequest) request,
              (io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.TaskServicePb.QueueSizesResponse>) responseObserver);
          break;
        case METHODID_GET_QUEUE_INFO:
          serviceImpl.getQueueInfo((com.netflix.conductor.grpc.TaskServicePb.QueueInfoRequest) request,
              (io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.TaskServicePb.QueueInfoResponse>) responseObserver);
          break;
        case METHODID_GET_QUEUE_ALL_INFO:
          serviceImpl.getQueueAllInfo((com.netflix.conductor.grpc.TaskServicePb.QueueAllInfoRequest) request,
              (io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.TaskServicePb.QueueAllInfoResponse>) responseObserver);
          break;
        case METHODID_SEARCH:
          serviceImpl.search((com.netflix.conductor.grpc.SearchPb.Request) request,
              (io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.TaskServicePb.TaskSummarySearchResult>) responseObserver);
          break;
        case METHODID_SEARCH_V2:
          serviceImpl.searchV2((com.netflix.conductor.grpc.SearchPb.Request) request,
              (io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.TaskServicePb.TaskSearchResult>) responseObserver);
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
          getPollMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.netflix.conductor.grpc.TaskServicePb.PollRequest,
              com.netflix.conductor.grpc.TaskServicePb.PollResponse>(
                service, METHODID_POLL)))
        .addMethod(
          getBatchPollMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.netflix.conductor.grpc.TaskServicePb.BatchPollRequest,
              com.netflix.conductor.proto.TaskPb.Task>(
                service, METHODID_BATCH_POLL)))
        .addMethod(
          getUpdateTaskMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.netflix.conductor.grpc.TaskServicePb.UpdateTaskRequest,
              com.netflix.conductor.grpc.TaskServicePb.UpdateTaskResponse>(
                service, METHODID_UPDATE_TASK)))
        .addMethod(
          getAddLogMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.netflix.conductor.grpc.TaskServicePb.AddLogRequest,
              com.netflix.conductor.grpc.TaskServicePb.AddLogResponse>(
                service, METHODID_ADD_LOG)))
        .addMethod(
          getGetTaskLogsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.netflix.conductor.grpc.TaskServicePb.GetTaskLogsRequest,
              com.netflix.conductor.grpc.TaskServicePb.GetTaskLogsResponse>(
                service, METHODID_GET_TASK_LOGS)))
        .addMethod(
          getGetTaskMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.netflix.conductor.grpc.TaskServicePb.GetTaskRequest,
              com.netflix.conductor.grpc.TaskServicePb.GetTaskResponse>(
                service, METHODID_GET_TASK)))
        .addMethod(
          getGetQueueSizesForTasksMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.netflix.conductor.grpc.TaskServicePb.QueueSizesRequest,
              com.netflix.conductor.grpc.TaskServicePb.QueueSizesResponse>(
                service, METHODID_GET_QUEUE_SIZES_FOR_TASKS)))
        .addMethod(
          getGetQueueInfoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.netflix.conductor.grpc.TaskServicePb.QueueInfoRequest,
              com.netflix.conductor.grpc.TaskServicePb.QueueInfoResponse>(
                service, METHODID_GET_QUEUE_INFO)))
        .addMethod(
          getGetQueueAllInfoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.netflix.conductor.grpc.TaskServicePb.QueueAllInfoRequest,
              com.netflix.conductor.grpc.TaskServicePb.QueueAllInfoResponse>(
                service, METHODID_GET_QUEUE_ALL_INFO)))
        .addMethod(
          getSearchMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.netflix.conductor.grpc.SearchPb.Request,
              com.netflix.conductor.grpc.TaskServicePb.TaskSummarySearchResult>(
                service, METHODID_SEARCH)))
        .addMethod(
          getSearchV2Method(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.netflix.conductor.grpc.SearchPb.Request,
              com.netflix.conductor.grpc.TaskServicePb.TaskSearchResult>(
                service, METHODID_SEARCH_V2)))
        .build();
  }

  private static abstract class TaskServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TaskServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.netflix.conductor.grpc.TaskServicePb.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TaskService");
    }
  }

  private static final class TaskServiceFileDescriptorSupplier
      extends TaskServiceBaseDescriptorSupplier {
    TaskServiceFileDescriptorSupplier() {}
  }

  private static final class TaskServiceMethodDescriptorSupplier
      extends TaskServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    TaskServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (TaskServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TaskServiceFileDescriptorSupplier())
              .addMethod(getPollMethod())
              .addMethod(getBatchPollMethod())
              .addMethod(getUpdateTaskMethod())
              .addMethod(getAddLogMethod())
              .addMethod(getGetTaskLogsMethod())
              .addMethod(getGetTaskMethod())
              .addMethod(getGetQueueSizesForTasksMethod())
              .addMethod(getGetQueueInfoMethod())
              .addMethod(getGetQueueAllInfoMethod())
              .addMethod(getSearchMethod())
              .addMethod(getSearchV2Method())
              .build();
        }
      }
    }
    return result;
  }
}
