package com.qinhan.interface1;

// 使用interface关键字定义的
public interface A {
    // JDK8之前，接口中只能定义常量和抽象方法
    // 1.常量：接口中定义的常量可以省略public static final
    String SCHOOL_NAME = "哈理工";

    // 2.抽象方法：接口中定义抽象方法可以省略public abstract，默认会加上去
    //public abstract void run();
    void run();
    String go();
}
