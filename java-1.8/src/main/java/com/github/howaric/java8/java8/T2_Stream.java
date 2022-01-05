package com.github.howaric.java8.java8;

import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class T2_Stream {

    @Test
    public void filterExample() {
        Stream<Integer> stream = Stream.of(1, 2, 5, 5, 7, 8, 9);
        Stream<Integer> resultStream = stream.filter(n -> n > 5)
                .distinct()//去重
                .skip(1)//跳过前n个
                .limit(2);//选取前n个
        resultStream.forEach(System.out::println);
    }

    @Test
    public void mapExample() {
        List<String> list = Arrays.asList("a,b,c", "1,2,3");
        List<String> collect = list.stream()
                .map(element -> element.replaceAll(",", ""))
                .collect(Collectors.toList());
        System.out.println(collect);
    }

    @Test
    public void mapExample2() {
        Stream<String> stream = Stream.of(null, "2", "3");
        //null element needs to be filtered before map
        List<Integer> collect = stream
                .filter(Objects::nonNull)
                .map(Integer::valueOf)
                .collect(Collectors.toList());
        System.out.println(collect);
    }

    @Test
    public void sortExample() {
        List<Integer> list = Arrays.asList(2, 4, 5, 8, 1);
        //default order
        List<Integer> collect = list.stream().sorted().collect(Collectors.toList());
        System.out.println(collect);
        //use comparator
        List<Integer> collect1 = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(collect1);
        List<T2_Stream> streamExamples = Arrays.asList(new T2_Stream());
    }

    @Test
    public void matchExample() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        //find max
        Optional<Integer> max = list.stream().max(Comparator.comparingInt(Integer::intValue));
        System.out.println(max.orElse(-1));
        //find min
        Optional<Integer> min = list.stream().min(Comparator.comparingInt(Integer::intValue));
        System.out.println(min.orElse(-1));
        //calculate count
        long count = list.stream().filter(e -> e > 2).count();
        System.out.println(count);
        //all elements match predict
        boolean allMatch = list.stream().allMatch(element -> element > 0);
        System.out.println(allMatch);
        //any element matches predict
        boolean anyMatch = list.stream().anyMatch(element -> element == 4);
        System.out.println(anyMatch);
        //all elements don't match
        boolean noneMatch = list.stream().noneMatch(e -> e > 6);
        System.out.println(noneMatch);
    }

}
