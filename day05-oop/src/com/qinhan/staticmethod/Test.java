package com.qinhan.staticmethod;

public class Test {
    // 认识static修饰和不修饰方法


    public static void main(String[] args) {
        // 1.类名.静态方法（推荐）
        Student.printHello();
        // 2.对象.静态方法
        Student s1 = new Student();
        s1.printHello();
        // 3.对象名.实例方法
        s1.setScore(98.9);
        s1.printScore();

        // 规范：如果这个方法只是为了做一个功能且不需要直接访问对象的数据，这个方法直接定义成静态方法
        // 如果这个方法是对象的行为，需要访问对象的数据，这个方法必须定义成实例方法
    }


}
