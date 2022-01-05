package com.github.howaric.java17.java12;

import java.text.NumberFormat;
import java.util.Locale;

public class T3_NumberFormat {

    public static void main(String[] args) {
        NumberFormat formatter = NumberFormat.getCompactNumberInstance(Locale.CHINESE, NumberFormat.Style.SHORT);
        System.out.println(formatter.format(10_000));
        System.out.println(formatter.format(19_000));
        System.out.println(formatter.format(1000_000_000));
        System.out.println(formatter.format(1L << 40));
    }

}
