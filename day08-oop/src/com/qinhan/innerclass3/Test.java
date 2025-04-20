package com.qinhan.innerclass3;

public class Test {
    public static void main(String[] args) {
        // 目标：认识匿名内部类
        // 匿名内部类实际上是有名字的：外部类名$编号.class
        // 匿名内部类本质上是一个子类，同时会立即构建一个子类对象

        Animal a = new Animal(){
            @Override
            public void cry() {
                System.out.println("喵喵喵~");
            }
        };
        a.cry();
    }
}

