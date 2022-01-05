package com.github.howaric.java17.java13;

import org.junit.jupiter.api.Test;

public class T2_StringBlock {

    @Test
    public void test1() {
        String html = """
                 <html>
                    <body>
                        <p>Hello, world</p>
                    </body>
                 </html>
                """;
        System.out.println(html);
    }

    @Test
    public void test2() {
//        String lines = """
//                line1\ line2
//                """;
//        System.out.println(lines);
    }

    @Test
    public void test3() {
        String html = """
                <html>\n
                	<body>\n
                		<p>Hello, world</p>\n
                	</body>\n
                </html>\n
                  """;
        System.out.println(html);
    }

    @Test
    public void testJson() {
        String json = """
               {
                   "username":"xiaobai",
                   "age":18
               }
               """;
        System.out.println(json);
    }

}
