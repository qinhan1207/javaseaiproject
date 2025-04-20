package com.qinhan.code;

public class CodeDemo1 {
    // 静态代码块：有static修饰，属于类，与类一起优先加载，自动执行一次
    static String username;
    static {
        username = "qinhan";
        System.out.println("====静态代码块执行了====");
    }
    public static void main(String[] args) {
        // 目标：认识代码块
        System.out.println("main方法执行了");
    }
}
