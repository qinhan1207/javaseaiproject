package com.qinhan.polymorphsm3;

public class Tortoise extends Animal {
    @Override
    public void run() {
        System.out.println("乌龟跑的贼慢");
    }

    public void shrinkHead(){
        System.out.println("乌龟爱锁头");
    }
}
