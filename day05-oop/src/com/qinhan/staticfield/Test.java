package com.qinhan.staticfield;

public class Test {
    // 目标：认识static修饰成员变量特点、访问机制、搞清楚作用
    public static void main(String[] args) {
        Student.name  = "袁华";
        System.out.println(Student.name);

        Student s1 = new Student();
        s1.name = "马冬梅";

        Student s2 = new Student();
        s2.name = "秋雅";

        System.out.println(s1.name);
        System.out.println(s2.name);
    }
}
