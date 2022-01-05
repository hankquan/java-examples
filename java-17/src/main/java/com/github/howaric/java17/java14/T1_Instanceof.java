package com.github.howaric.java17.java14;

public class T1_Instanceof {

    public static void main(String[] args) {
        System.out.println(getIfString("123 "));
        System.out.println(getIfStringNew("123 "));
    }

    public static String getIfString(Object obj) {
        if (obj instanceof String) {
            String value = (String) obj;
            return value.strip();
        } else {
            return "Not a string";
        }
    }

    public static String getIfStringNew(Object obj) {
        if (obj instanceof String value) {
            return value.strip();
        } else {
            return "Not a string";
        }
    }
}
