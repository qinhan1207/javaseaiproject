package com.qinhan.extends5override;

public class Test  {
    // 目标：认识方法重写，再搞清楚场景

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.cry();
    }
}

class Cat extends Animal{
    // 方法重写，方法名称和参数列表必须一样
    @Override   // 方法重写的校验注解（标志）：要求方法名称和形参列表必须与被重写方法一致，否则报错
    public void cry(){
        System.out.println("miao~");
    }
}

class Animal{
    public void cry(){
        System.out.println("动物会叫");
    }
}
