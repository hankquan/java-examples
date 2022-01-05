package com.github.howaric.java17.java16;

public class T2_TestRecord {
}

interface Login {
    void login();
}

record User(String username, int age) implements Login {
    @Override
    public void login() {
    }
}
