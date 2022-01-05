package com.github.howaric.java17.java15;

public class T3_SealedAndRecord {
}

sealed interface People {
    void eat();
}
//record本身就是隐式final的，因此不需要final修饰
record Student(String username, int age) implements People {
    @Override
    public void eat() {
        System.out.println("student eat!");
    }
}
