package com.github.howaric.java17.java14;

import jdk.jfr.Configuration;
import jdk.jfr.consumer.RecordingStream;

import java.io.IOException;
import java.text.ParseException;
import java.time.Duration;

public class T5_TestJRF {

    public static void main(String[] args) throws IOException, ParseException {
        //default or profile 两个默认的profiling configuration files
        Configuration config = Configuration.getConfiguration("default");
        try (var es = new RecordingStream(config)) {
            es.onEvent("jdk.GarbageCollection", System.out::println);
            es.onEvent("jdk.CPULoad", System.out::println);
            es.onEvent("jdk.JVMInformation", System.out::println);
            es.setMaxAge(Duration.ofSeconds(10));
            es.start();
        }
    }

}
