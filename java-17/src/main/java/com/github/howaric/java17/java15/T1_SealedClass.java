package com.github.howaric.java17.java15;

public class T1_SealedClass {

}

//密封必须被继承，且可以使用permits来进行指定可以被哪些类继承
sealed class Animal permits Dog, Cat, Fish {
}

//一个密封类的子类必须是final，sealed或non-sealed的
final class Dog extends Animal {
}

//如果子类是sealed，那么这个类也一样要被继承，否则编译错误
sealed class Fish extends Animal {
}

final class Tuna extends Fish {
}

//密封类的子类也可以是非密封的，那么这个类没有被继承的硬性要求，也不能使用permits
non-sealed class Cat extends Animal {
}

