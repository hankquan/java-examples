package com.github.howaric.java11.java9;

import org.junit.jupiter.api.Test;

import java.util.*;

public class T5_CollectionOf {

    @Test
    public void testOf() {
        List<Integer> integerList = List.of(1, 2, 3, 4);
        System.out.println(integerList);
        Map<Integer, String> stringMap = Map.of(1, "xiaobai", 2, "xiaohei");
        System.out.println(stringMap);
        //注意，通过of创建set的时候，如果有重复元素，会直接报错: IllegalArgumentException
//        Set<String> nameSet = Set.of("xiaobai", "xiaohei", "xiaohei");
//        System.out.println(nameSet);
    }

    /**
     * Arrays.asList与List.of的区别
     */
    @Test
    public void differenceOfArraysAndList() {
        //定长集合，长度不能改变，也就是说不能执行add操作，但是可以通过set(index, value)修改值
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        //error!
//        list1.add(4);
        //ok!
        list1.set(1, 5);

        //不可变集合，无法进行任何修改
        List<Integer> list2 = List.of(1, 2, 3);
        //error!
//        list2.add(4);
        //error!
//        list2.set(1, 5);
    }

}
