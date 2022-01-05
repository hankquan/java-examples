package com.github.howaric.java17.java15;

public class T2_SealedInterface {
}

//sealed的接口要被继承或者实现
sealed interface InterA permits InterB, InterC {
}
//继承sealed的接口也要是sealed或non-sealed
sealed interface InterB extends InterA {
}
//如果是sealed，那么需要被实现或者继续被继承
final class BImpl implements InterB {
}
//non-sealed的接口继承sealed的接口，终止密封的传递
non-sealed interface InterC extends InterA {
}