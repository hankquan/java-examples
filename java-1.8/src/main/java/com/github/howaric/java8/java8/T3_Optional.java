package com.github.howaric.java8.java8;

import java.util.Optional;

public class T3_Optional {

    public static void main(String[] args) {
        Optional<Object> optional = Optional.ofNullable(getUser());

    }

    private static User getUser() {

        return null;
    }

    private static class User {
        @Override
        public String toString() {
            return "This is user";
        }
    }

}
