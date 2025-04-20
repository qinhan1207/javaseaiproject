package com.qinhan.innerclass2;

public class InnerClassDemo2 {
    public static void main(String[] args) {
        // 创建静态内部类对象
        Outer.Inner oi = new Outer.Inner();
        oi.show();
        // 1.静态内部类中可以直接访问外部类的静态成员，但是不可以直接访问外部类中的实例成员
    }
}
