package com.github.howaric.java8.jvm;

public class EliminateLockTest {

    //-XX:+DoEscapeAnalysis -XX:+EliminateLocks
    public static void main(String[] args) {
        runStringBuffer();
        runStringBuilder();
    }

    private static void runStringBuilder() {
        long start = System.currentTimeMillis();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 1000000; i++) {
            stringBuilder.append("1");
        }
        stringBuilder.toString();
        long end = System.currentTimeMillis();
        System.out.println("stringbuilder cost: " + (end - start));
    }

    private static void runStringBuffer() {
        long start = System.currentTimeMillis();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < 1000000; i++) {
            stringBuffer.append("1");
        }
        stringBuffer.toString();
        long end = System.currentTimeMillis();
        System.out.println("stringbuffer cost: " + (end - start));
    }

}
