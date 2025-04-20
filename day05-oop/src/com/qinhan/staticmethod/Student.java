package com.qinhan.staticmethod;

public class Student {
    private double score;

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public static void printHello(){
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
    }

    public void printScore(){
        System.out.println(score>=60?"通过了":"挂科了");
    }
}
