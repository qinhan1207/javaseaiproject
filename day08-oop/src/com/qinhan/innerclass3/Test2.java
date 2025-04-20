package com.qinhan.innerclass3;

public class Test2 {
    public static void main(String[] args) {
        // 目标：搞清楚匿名内部类的使用形式（语法）：通常可以作为一个对象参数传输给方法
        // 需求：老师和学生都需要参加游泳比赛
        Swim s1 = new Swim(){

            @Override
            public void swimming() {
                System.out.println("学生游泳贼快");
            }
        };
        start(s1);

        System.out.println("================================");


        start(new Swim(){

            @Override
            public void swimming() {
                System.out.println("老师游泳贼6");
            }
        });

    }
    // 设计一个方法，可以接收老师和学生开始比赛
    public static void start(Swim s){
        System.out.println("starting");
        s.swimming();
        System.out.println("ending");
    }
}

interface Swim{
    void swimming();
}

