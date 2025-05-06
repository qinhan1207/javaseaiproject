package com.qinhan.pracrice;

import java.util.Scanner;

public class Test08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int a = sc.nextInt();
        System.out.println(a%2==0?"偶数":"奇数");
    }
}
