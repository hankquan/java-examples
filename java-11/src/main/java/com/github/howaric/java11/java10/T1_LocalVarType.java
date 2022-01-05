package com.github.howaric.java11.java10;

import java.util.ArrayList;

public class T1_LocalVarType {

    public static void main(String[] args) {
        //使用var来作为变量的引用声明
        var list = new ArrayList<>();

        //以下为不可以声明为var的情况

        //1.使用var必须要求变量必须初始化
//        var username;//编译错误

        //2.不能给变量赋null值
//        var username = null;//编译错误

        //3.lamda表达式不可以声明为var
//        var supplier = ()->Math.random();

        //4.方法引用不可以声明为var
//        var method = System.out::println;

        //5.数组静态初始化不可以声明为var
//        var array = {"a", "b"};
        String[] array1 = {"1", "2"};

        //6.类的成员变量不可以使用var类型推断
        //7.所有参数声明，方法入参，返回值，构造方法参数都不可以

    }

}
