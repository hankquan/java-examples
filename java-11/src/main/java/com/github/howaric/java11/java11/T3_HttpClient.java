package com.github.howaric.java11.java11;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.concurrent.CompletableFuture;

public class T3_HttpClient {

    @Test
    public void syncRequest() {
        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder(URI.create("http://127.0.0.1:8082/test"))
                .GET()
                .timeout(Duration.ofSeconds(1))
                .build();
        try {
            HttpResponse<String> httpResponse = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
            int statusCode = httpResponse.statusCode();
            System.out.println(statusCode);
            String body = httpResponse.body();
            System.out.println(body);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void asyncRequest() {
        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder(URI.create("http://localhost:8082/test")).build();
        var stringBodyHandler = HttpResponse.BodyHandlers.ofString();
        CompletableFuture<HttpResponse<String>> httpResponseCompletableFuture = httpClient.sendAsync(request, stringBodyHandler);
        httpResponseCompletableFuture.thenApply(HttpResponse::body).thenAccept(System.out::println);
        //        httpResponseCompletableFuture.whenComplete((stringHttpResponse, throwable) -> {
//            if (throwable != null) {
//                //handle exception
//                System.err.println(throwable);
//                return;
//            }
//            System.out.println(stringHttpResponse.statusCode());
//            System.out.println(stringHttpResponse.body());
////            System.out.println(System.currentTimeMillis());
//        });
//        try {
//            System.out.println(System.currentTimeMillis());
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    }

}
