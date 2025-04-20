package com.qinhan.extends2modifier;

public class Fu {
    // 1.private：只能当前类中访问
    private void privateMethod(){
        System.out.println("privateMethod");
    }
    // 2.缺省：当前类和一个包下的类
    void Method(){
        System.out.println("method");
    }
    // 3.protected：当前类，同一个包下的类和子类
    protected void protectedMethod(){
        System.out.println("protectedMethod");
    }
    // 3.任何地方都可以访问
    public void publicMethod(){
        System.out.println("publicMethod");
    }

}
