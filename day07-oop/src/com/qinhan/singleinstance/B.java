package com.qinhan.singleinstance;

// 懒汉式单例类
public class B {
    // 1.私有化构造器
    private B(){}

    // 2.私有化静态变量
    private static B b;

    // 3.提供静态方法返回对象：真正需要对象的时候再创建对象
    public static B getInstance(){
        if (b==null){
            b = new B();
        }
        return b;
    }
}
