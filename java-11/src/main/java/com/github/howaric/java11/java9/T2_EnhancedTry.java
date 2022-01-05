package com.github.howaric.java11.java9;

import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class T2_EnhancedTry {

    public static void main(String[] args) {
        testTry();
    }

    private static void testTry() {
        InputStreamReader inputStream = new InputStreamReader(System.in);
        OutputStreamWriter outputStream = new OutputStreamWriter(System.out);
        //流可以放在外面声明实例化
        try (inputStream; outputStream) {
            inputStream.read();
            outputStream.write(1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
