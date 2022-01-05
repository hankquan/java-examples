package com.github.howaric.java11.java9;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class T4_NewStreamAPI {

    @Test
    public void testTakeWhile() {
        List<Integer> list = Arrays.asList(1, 3, 4, 7, 4, 8, 10);
        //当takeWhile条件满足时遍历，不满足时停止，丢弃后面的元素
        //奇数继续，遇到不是奇数时停止
        list.stream().takeWhile(n -> n % 2 == 1).forEach(System.out::println);
        //output: 1,3
    }

    @Test
    public void testDropWhile() {
        List<Integer> list = Arrays.asList(1, 3, 4, 7, 4, 8, 10);
        //当dropWhile条件满足时丢弃该元素，并继续遍历，直到遇到第一个不满足条件的数据，保留该元素和后面所有元素
        //遇到奇数时丢弃，遇到第一个不是奇数时，保留该
        list.stream().dropWhile(n -> n % 2 == 1).forEach(System.out::println);
        //output: 4，7，4，8，10
    }

    @Test
    public void testOfNullableStream() {
        //of方法获取流，允许元素中有多个null值
        Stream<Integer> stream1 = Stream.of(1, 2, null);
        //如果元素中只有一个null，会报空指针异常
//        Stream<Object> stream2 = Stream.of(null);
        //新API，可以创建空的stream
        Stream<Object> nullStream = Stream.ofNullable(null);
    }

    @Test
    public void testNewIterator() {
        //java8生成0到9
        Stream.iterate(0, n -> ++n).limit(10).forEach(System.out::println);
        //第二个参数为退出迭代的条件，更加灵活
        //java9 生成0到9
        Stream.iterate(0, n -> n < 10, n -> ++n).forEach(System.out::println);
    }

}
