package com.github.howaric.java17.java14;

import org.junit.jupiter.api.Test;

public class T3_TextBlockV2 {

    @Test
    public void test1(){
        String json = """
               {
                   "username":"xiaobai",\
                   "age":18
               }
               """;
        System.out.println(json);
    }

    @Test
    public void test2(){
        String json = """
               {
                   "username"\s:\s"xiaobai",
                   "age"\s:\s18
               }
               """;
        System.out.println(json);
    }

}
