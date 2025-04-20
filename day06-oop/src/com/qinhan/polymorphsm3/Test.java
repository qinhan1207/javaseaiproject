package com.qinhan.polymorphsm3;

public class Test {
    public static void main(String[] args) {
        // 目标：认识多态的代码
        // 1.多态的好处1：右边的对象是解耦合的
        Animal a1 = new Tortoise();
        go(a1);

        // 强制类型转换

        Tortoise t = (Tortoise) a1;
        t.shrinkHead();
        System.out.println("================");

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

        // java建议，强制转换前，应该先判断对象的真实类型，再进行强制类型转换
        if(animal instanceof Wolf){
            Wolf w1 = (Wolf) animal;
            w1.eatSheep();
        }else if(animal instanceof Tortoise){
            Tortoise t1 = (Tortoise) animal;
            t1.shrinkHead();
        }
    }


}
