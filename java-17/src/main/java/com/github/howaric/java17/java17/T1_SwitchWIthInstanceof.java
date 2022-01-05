package com.github.howaric.java17.java17;

public class T1_SwitchWIthInstanceof {

    public static void main(String[] args) {
        System.out.println(testOld(1));
//        System.out.println(testNew(1));
    }

    public static String testOld(Object o) {
        String result = "unknown";
        if (o instanceof Integer i) {
            result = "int: " + i;
        } else if (o instanceof Long l) {
            result = "long: " + l;
        } else if (o instanceof String str) {
            result = "string: " + str;
        } else {
            return o.toString();
        }
        return result;
    }

    //This feature is in java17 preview edition
//    public static String testNew(Object o) {
//        return switch (o) {
//            case Integer i -> "int: " + i;
//            case Long i -> "long: " + i;
//            case String s -> "string: " + s;
//            default -> o.toString();
//        };
//    }

}
