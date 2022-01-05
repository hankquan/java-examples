package com.github.howaric.java17.java14;

public class T2_TestRecord {

    public static void main(String[] args) {
        User user = new User("xiaobai", 18);
        System.out.println(user.username());
        System.out.println(user.age());
        System.out.println(user);
    }

    record User(String username, int age) {
    }
}
