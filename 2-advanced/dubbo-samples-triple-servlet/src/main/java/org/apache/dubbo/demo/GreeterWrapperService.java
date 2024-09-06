/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.dubbo.demo;

import org.apache.dubbo.common.stream.StreamObserver;
import org.apache.dubbo.remoting.http12.HttpMethods;
import org.apache.dubbo.remoting.http12.rest.Mapping;

import java.util.concurrent.CompletableFuture;

public interface GreeterWrapperService {

    /**
     * Sends a greeting
     */
    HelloReply sayHello(HelloRequest request);

    /**
     * Sends a greeting asynchronously
     */
    @Mapping(value = "hi", method = HttpMethods.POST)
    CompletableFuture<String> sayHelloAsync(String request);

    /**
     * Sends a greeting with server streaming
     */
    void sayHelloServerStream(HelloRequest request, StreamObserver<HelloReply> responseObserver);

    /**
     * Sends greetings with bi streaming
     */
    StreamObserver<HelloRequest> sayHelloBiStream(StreamObserver<HelloReply> responseObserver);
}