package com.qinhan.polymorphsm2;

public class Test {
    public static void main(String[] args) {
        // 目标：认识多态的代码
        // 1.多态的好处1：右边的对象是解耦合的
        Tortoise a1 = new Tortoise();
        go(a1);
        a1.shrinkHead();

        Animal a2 = new Wolf();
        go(a2);
        // 多态的一个问题：多态下不能调用子类独有的功能
        //a2.eatSheep();
    }

    // 宠物游戏：所有动物都可以送给这个方法显示开始跑步
    // 2.多态的好处2：父类类型的变量作为参数，可以接受一个子类的对象
    public static void go(Animal animal){
        System.out.println("开始跑步");
        animal.run();
    }


}
