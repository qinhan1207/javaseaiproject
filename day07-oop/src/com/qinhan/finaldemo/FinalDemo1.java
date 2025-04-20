package com.qinhan.finaldemo;

public class FinalDemo1 {
    // final修饰静态成员变量
    // final 修饰静态成员变量，表示这个变量是常量，不能被修改，通常这个值作为系统的配置信息
    // 常量的名称，建议全部大写，多个单词用下划线连接
    public static final String SCHOOL_NAME = "重庆邮电大学";

    // final修饰实例变量（一般没有意义）
    private final String name = "猪刚鬣";

    public static void main(String[] args) {
        // 目标：认识final关键字的作用
        // 3.final修饰变量，表示这个变量是常量，不能被修改
        /*
            变量有哪些？
            1.成员变量：
                静态成员变量
                实例成员变量
            2.局部变量
         */
        final double rate = 3.14;
        //rate = 3.15;

        buy(0.88);
    }

    public static void buy(final double z){
        //z = 0.1;
        System.out.println(z);
    }
}

// 1.final修饰类，类不能被继承
final class A{

}

//class B extends A{}

// 2.final修饰方法，方法不能被重写
class C{
    public final void show(){
        System.out.println("show方法被执行");
    }
}
class D extends C{
    //public void show(){
    //    System.out.println("show方法被执行");
    //}
}
