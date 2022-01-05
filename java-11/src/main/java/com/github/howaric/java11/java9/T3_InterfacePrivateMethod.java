package com.github.howaric.java11.java9;

public class T3_InterfacePrivateMethod {

    //java8
    interface InterA {
        static void method1() {

        }

        default void method2() {

        }
    }

    //java9+
    interface InterB {
        private void method() {

        }
        private static void methodStatic(){

        }
    }

}
