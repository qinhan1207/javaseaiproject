package com.qinhan.allTest;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字");
        double num1 = sc.nextDouble();
        System.out.println("请输入第二个数字");
        double num2 = sc.nextDouble();
        System.out.println("请输入运算符");
        String operator = sc.next();
        double result = calculate(num1, num2, operator);
        System.out.println("结果为：" + result);

    }
    public static double calculate(double num1, double num2, String operator) {
        double result = 0;
        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
            default:
                System.out.println("运算符错误");
        }
        return result;
    }

}
