package com.qinhan.singleinstance;

// 设计成单例设计模式：饿汉式单例
public class A {
    // 1.私有化构造器:确保单例类对外不能创建太多对象
    private A(){}

    // 2.定义一个静态变量，用于记住本类的唯一对象
    //public static final A a = new A();
    private static A a = new A();

    public static A getInstance(){
        return a;
    }


}
