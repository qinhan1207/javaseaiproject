package com.qinhan.code;

public class CodeDemo2 {
    private String name;
    {
        name = "hello";
        System.out.println(name);
    }

    public static void main(String[] args) {
        new CodeDemo2();
        new CodeDemo2();
        new CodeDemo2();
    }

}
