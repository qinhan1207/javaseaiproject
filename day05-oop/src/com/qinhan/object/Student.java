package com.qinhan.object;

public class Student {
    // 创建一个学生类，定义3个属性：姓名，语文成绩和数学成绩
    String name;
    double chineseScore;
    double mathScore;

    public void printAllScore(){
        System.out.println(name+"的总成绩是"+chineseScore+mathScore+"分");
    }

    public void printAverageScore(){
        System.out.println(name+"的平均成绩是"+(chineseScore+mathScore)/2+"分");
    }
}
