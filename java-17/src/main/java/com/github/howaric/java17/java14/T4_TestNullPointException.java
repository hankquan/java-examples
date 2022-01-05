package com.github.howaric.java17.java14;

public class T4_TestNullPointException {

    public static void main(String[] args) {
        Dog dog = new Dog(null);
        dog.leg.walk();
    }

    static class Dog {
        Leg leg;

        public Dog(Leg leg) {
            this.leg = leg;
        }
    }

    static class Leg {
        void walk() {
            System.out.println("Walk!");
        }
    }

}
