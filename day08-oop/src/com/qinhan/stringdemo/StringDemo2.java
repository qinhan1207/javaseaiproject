package com.qinhan.stringdemo;

public class StringDemo2 {
    public static void main(String[] args) {
        // 目标：生成验证码
        String code = getCode(4);
        System.out.println(code);
    }

    // 帮我生成指定位数的随机验证码并返回，每位可能是大小写字母或数字
    public static String getCode(int n){
        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        String code = "";
        for (int i = 0; i < n; i++){
            int index = (int) (Math.random()*str.length());
            code += str.charAt(index);
        }
        return code;
    }
}
