package com.github.howaric.java11.java11;

import java.util.stream.Stream;

public class T1_StringApi {

    public static void main(String[] args) {
        //true, 空格，制表符，换行等都认为是空的
        boolean blank = "\t \n".isBlank();
        System.out.println(blank);

        //strip()
        String source = " \n www.howaric.cn \t";
        System.out.println(source.strip());//前后去除
        System.out.println(source.stripLeading());//去除开头
        System.out.println(source.stripTrailing());//去除结尾

        //repeat
        String repeat = "howaric".repeat(3);
        System.out.println(repeat);

        //split a string by \n to a stream
        Stream<String> lines = "a\nb\nc\n".lines();
        System.out.println(lines.count());
    }

}
