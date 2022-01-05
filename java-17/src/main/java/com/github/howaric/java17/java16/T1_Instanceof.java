package com.github.howaric.java17.java16;

public class T1_Instanceof {

    public static void main(String[] args) {
        Object value = "123";
        System.out.println(value);
        if (value instanceof String str) {//编译错误
            System.out.println(str);
            System.out.println(value==str);
        }
        Object b = new B();
        if (b instanceof A bb) {//编译错误
            System.out.println(b==bb);
        }
    }

    static class A {
    }

    static class B extends A {
    }

}
