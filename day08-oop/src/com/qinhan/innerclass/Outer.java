package com.qinhan.innerclass;

public class Outer {

    private int age = 18;

    public static String schoolName = "清华大学";

    public static void method(){
        System.out.println("method");
    }

    public class Inner{
        public void show(){
            System.out.println(schoolName);
            System.out.println("show");
            method();
            System.out.println(age);
        }
    }
}
