package com.qinhan.staticmethod;

public class Test4 {
    static int age = 15;
    private String name;
    public static void main(String[] args) {
        // 目标：搞清楚静态方法，实例方法访问的几点注意事项

        // 2.实例方法中既可以直接访问静态成员，也可以直接访问实例成员
        // 3.实例方法中可以出现this关键字，静态方法中不可以出现this关键字
    }
    // 1.静态方法中可以直接访问静态成员，不可以直接访问实例成员
    public static void printAge(){
        System.out.println(age);
        printAge2();
    }

    public static void printAge2(){
        System.out.println(age);
    }

}
