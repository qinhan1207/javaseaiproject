package com.qinhan.polymorphsm1;

public class Test {
    public static void main(String[] args) {
        Animal a1 = new Wolf();
        a1.run();

    }

    // 宠物游戏：所有动物都可以送给这个方法开始跑步
    public static void go(Wolf wolf){
        System.out.println("开始跑步");
        wolf.run();
    }
}
