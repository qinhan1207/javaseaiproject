package com.qinhan.stringdemo;

import java.util.Scanner;

public class StringDemo1 {
    public static void main(String[] args) {
        // 目标：掌握创建字符串对象，封装要处理的字符串数据，调用String提供的方法处理字符串
        // 1.推荐方式一：直接""就可以创建字符串对象，封装字符数据
        String s1 = "hello world";
        System.out.println(s1);

        System.out.println(s1.length());

        // 2.方式二：通过构造器初始化对象
        String s2 = new String();   // 不推荐
        System.out.println(s2); // ""空字符串

        String s3 = new String("hello");
        System.out.println(s3);

        char[] chars = {'h','e','l','l','0',',','你','好'};
        String s4 = new String(chars);
        System.out.println(s4);

        byte[] bytes = {96,97,98,99,65,66};
        String s5 = new String(bytes);
        System.out.println(s5);

        System.out.println("==========================");

        // 只有""给出的字符对象放在字符串常量池，且相同内容只放一份
        String t1 = "abc";
        String t2 = "abc";
        System.out.println(t1==t2);

        String t3 = new String("abc");
        String t4 = new String("abc");
        System.out.println(t3==t4);

        System.out.println("==============================");
        // 调用字符串的方法，处理字符串数据
        // 简易版的登录
        String okLoginName = "admin";
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名");
        String loginName = sc.nextLine();
        if(okLoginName.equals(loginName)){
            System.out.println("恭喜您，登录成功");
        } else {
            System.out.println("登录失败");
        }
        System.out.println("===================");

        System.out.println("请您用手机号登录");

        String phone = sc.nextLine();


        String newPhone = phone.substring(0,3)+"****"+phone.substring(7);
        System.out.println("系统显示以下手机号码进入："+newPhone);
    }
}
