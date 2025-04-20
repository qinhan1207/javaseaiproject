package com.qinhan.extends1demo;

public class Test {
    // 目标：认识继承
    // 1.创建对象，封装老师数据
    // 子类可以继承父类的非私有成员
    // 子类对象其实是由子类和父类多张设计图共同构建出来的对象，所以子类对象是完整的
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.setName("dlei");
        teacher.setSex('男');
        teacher.setSkill("java,大数据,前端");

        System.out.println(teacher.getSex());
        System.out.println(teacher.getSkill());

    }
}
