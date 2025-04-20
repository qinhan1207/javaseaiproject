package com.qinhan.polymorphsm2;

public class Wolf extends Animal {
    @Override
    public void run() {
        System.out.println("狼跑的贼溜~~~");
    }

    public void eatSheep(){
        System.out.println("狼爱吃羊");
    }
}
