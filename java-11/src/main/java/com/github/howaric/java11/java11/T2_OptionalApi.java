package com.github.howaric.java11.java11;

import java.util.Optional;
import java.util.stream.Stream;

public class T2_OptionalApi {

    public static void main(String[] args) {
        Optional<Object> emptyOptional = Optional.empty();
        //JDK11 新增判断value是否为null
        //不再需要对isPresent使用取反符号判断为null
        emptyOptional.isEmpty();

        Optional<String> aOptional = Optional.of("A");
        //JDK10 如果为null，抛出异常NoSuchElementException
        String aValue = aOptional.orElseThrow();

        Optional<Object> emptyOptional2 = Optional.empty();
        //JDK9 比较方便替换if else的写法，更加简介优雅
        emptyOptional2.ifPresentOrElse(v -> {
            //存在不为null
        }, () -> {
            //不存在，处理
        });

        Optional<Object> emptyOptional3 = Optional.empty();
        //JDK9 value为null时可以通过or来提供新的optional
        Optional<Object> bOptional = emptyOptional3.or(() -> Optional.of("B"));
        System.out.println(bOptional.get());

        Optional<String> cOptional = Optional.of("C");
        //JDK9 通过optional获取只包含value的流
        Stream<String> stream = cOptional.stream();
        stream.forEach(System.out::println);
    }

}
