package com.github.howaric.java8.java8;

import java.util.function.Consumer;
import java.util.function.Function;

public class T1_LamdaExpress {

    public static void main(String[] args) {
        //使用lamda表达式直接创建匿名内部类
        Runnable task = () -> {
        };
        Consumer<Person> walk = Person::walk;

        Function<Integer, Integer> integerIntegerFunction = Integer::intValue;



    }

    static class Person {
        void walk() {
            System.out.println("person walk");
        }
    }

    interface InterfaceA {

        void test();

    }

}
