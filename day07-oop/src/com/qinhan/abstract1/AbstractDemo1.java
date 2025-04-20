package com.qinhan.abstract1;

public class AbstractDemo1 {
    public static void main(String[] args) {
        // 目标：认识抽象类，抽象方法，搞清楚他们的特点
        // 抽象类不能创建对象
        // 抽象类的使命就是被子类继承
        B b = new B("qinhan",18);
        System.out.println(b);
        b.show();
    }
}
