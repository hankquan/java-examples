package com.github.howaric.java17.java12;

import org.junit.jupiter.api.Test;

public class T4_StringNewApi {

    @Test
    public void testTransform() {
        String result = "www."
                .transform(input -> input + "howaric")
                .transform(input->input+".cn");
        System.out.println(result);//www.howaric.cn
    }

    @Test
    public void testIndent(){
        String result = "Java\nGolang".indent(4);
        System.out.println(result);
    }

}
