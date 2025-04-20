package com.qinhan.singleinstance;

public class Test {
    // 目标：设计单例类
    public static void main(String[] args) {
        A a1 = A.getInstance();
        A a2 = A.getInstance();
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a1==a2);
        System.out.println("=================");

        B b1 = B.getInstance();
        B b2 = B.getInstance();
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b1==b2);

    }


}
