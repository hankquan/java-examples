package com.github.howaric.java17.java12;

public class T2_NewSwitch {

    public static void main(String[] args) {
        normalSwitch();
        newSwitch();
    }

    private static void normalSwitch() {
        int month = 2;
        String season;
        switch (month) {
            case 12:
            case 1:
            case 2:
                season = "winter";
                break;
            case 3:
            case 4:
            case 5:
                season = "spring";
                break;
            case 6:
            case 7:
            case 8:
                season = "summer";
                break;
            case 9:
            case 10:
            case 11:
                season = "autumn";
                break;
            default:
                throw new RuntimeException("Bad input");
        }
        System.out.println(season);
    }

    private static void newSwitch() {
        int month = 2;
        String season = switch (month) {
            case 12, 1, 2 -> "winter";
            case 3, 4, 5 -> "spring";
            case 6, 7, 8 -> "summer";
            case 9, 10, 11 -> "autumn";
            default -> throw new RuntimeException("Bad input");
        };
        System.out.println(season);
    }

}
