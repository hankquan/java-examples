package com.github.howaric.java17.java12;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
public class T1_TestJMH2 {

    private static List<String> data;

    static {
        data = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            data.add(i + "");
        }
    }

    //-XX:-EliminateLocks
    public static void main(String[] args) throws RunnerException {
        Options options = new OptionsBuilder().include(T1_TestJMH2.class.getName())
                .forks(1).build();
        new Runner(options).run();
    }

    @Benchmark
    public void testForeach() {
        for (String value : data) {
            value.strip();
        }
    }

    @Benchmark
    public void testStream() {
        data.parallelStream().forEach(value->value.strip());
//        data.stream().forEach(value->value.strip());
    }

}
