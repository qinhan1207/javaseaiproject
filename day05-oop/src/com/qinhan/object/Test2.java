package com.qinhan.object;

public class Test2 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "波妞";
        s1.chineseScore = 100;
        s1.mathScore = 100;
        s1.printAllScore();
        s1.printAverageScore();
        Student s2 = new Student();
        s2.name = "波仔";
        s2.chineseScore = 59;
        s2.mathScore = 100;
        s2.printAllScore();
        s2.printAverageScore();
    }
}
