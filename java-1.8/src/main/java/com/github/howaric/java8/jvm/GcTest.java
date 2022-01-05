package com.github.howaric.java8.jvm;

import java.util.LinkedList;
import java.util.List;

public class GcTest {

    public static void main(String[] args) {
        List<Object> objects = new LinkedList<>();
        for (; ; ) objects.add(new Object());
    }

}
