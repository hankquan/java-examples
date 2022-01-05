package com.github.howaric.java11.java10;

import java.util.ArrayList;
import java.util.List;

public class T2_CopyOf {

    public static void main(String[] args) {
        List<String> list = List.of("a", "b", "c");
        List<String> copy = List.copyOf(list);
        //true, 对于不可变集合的copyOf，返回的是同一个集合
        System.out.println(list == copy);

        List<Object> arrayList = new ArrayList<>();
        arrayList.add("a");
        arrayList.add("b");
        arrayList.add("c");
        List<Object> newCopy = List.copyOf(arrayList);
        //false, 对普通的集合copyOf，得到的是一个新的不可变集合
        System.out.println(arrayList == newCopy);
        List<Object> newCopy2 = List.copyOf(arrayList);
        //false, 使用同一个集合多次copyOf，得到的是不同的不可变集合
        System.out.println(newCopy == newCopy2);
    }

}
