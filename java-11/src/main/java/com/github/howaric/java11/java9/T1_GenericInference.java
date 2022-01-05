package com.github.howaric.java11.java9;

import java.util.concurrent.Callable;

public class T1_GenericInference {

    public static void main(String[] args) {

        //<>中不用再声明类型
        Callable<String> task = new Callable<>() {
            @Override
            public String call() throws Exception {
                return "123";
            }
        };

        //使用lamda
        Callable<String> task2 = () -> "123";

        User user = new User() {
            @Override
            void hello() {
                System.out.println("new hello");
            }
        };
        user.hello();
    }

    static class User {
        void hello() {
            System.out.println("hello");
        }
    }

}
