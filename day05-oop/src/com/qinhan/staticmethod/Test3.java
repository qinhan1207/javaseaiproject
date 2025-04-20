package com.qinhan.staticmethod;

public class Test3 {
    // 目标：搞清楚静态方法的应用：可以做工具类
    // 注册界面
    // 开发一个验证码程序
    public static void main(String[] args) {
        System.out.println(VerifyCodeUtil.getCode(4));
    }
}