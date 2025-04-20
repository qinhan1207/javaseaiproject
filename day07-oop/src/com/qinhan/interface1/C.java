package com.qinhan.interface1;


// 实现类，实现多个接口，必须实现接口中的所有抽象方法，否则这个类必须定义为抽象类
public class C implements A,B{
    @Override
    public void run() {
        System.out.println("我是run方法");
    }

    @Override
    public String go() {
        return "我是go学长";
    }

    @Override
    public void play() {
        System.out.println("去哪里玩");
    }
}
