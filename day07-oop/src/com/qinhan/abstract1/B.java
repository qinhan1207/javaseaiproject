package com.qinhan.abstract1;

// 一个类继承抽象类，必须重写抽象类的全部抽象方法，否则这个类也必须定义为抽象类

public class B extends A{
    public B(){}

    public B(String name,int age){
        super(name,age);
    }

    @Override
    public void show() {
        System.out.println("B类重写show方法");
    }
}
