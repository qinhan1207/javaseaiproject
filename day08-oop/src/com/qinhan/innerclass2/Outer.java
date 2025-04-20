package com.qinhan.innerclass2;

public class Outer {

    // 静态内部类：属于外部类本身持有
    public static class Inner{
        public void show(){
            System.out.println("show");
        }
    }
}
