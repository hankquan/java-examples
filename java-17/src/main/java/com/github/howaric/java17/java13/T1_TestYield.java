package com.github.howaric.java17.java13;

public class T1_TestYield {

    public static void main(String[] args) {
        int month = 2;
        String season = switch (month) {
            case 12:
            case 1:
            case 2:
                yield "winter";
            case 3:
            case 4:
            case 5:
                yield "spring";
            case 6:
            case 7:
            case 8:
                yield "summer";
            case 9:
            case 10:
            case 11:
                yield "autumn";
            default:
                throw new RuntimeException("Bad input");
        };
        System.out.println(season);
    }

}
