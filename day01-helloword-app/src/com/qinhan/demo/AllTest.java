package com.qinhan.demo;

import java.util.Scanner;

public class AllTest {
    public static void main(String[] args) {
        // 目标：完成健康计算器
        // 1.先让用户输入自己个人的信息：身高、体重、性别、年龄
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您的身高");
        double height = scanner.nextDouble();
        System.out.println("请输入您的体重");
        double weight = scanner.nextDouble();
        System.out.println("请输入您的性别");
        String gender = scanner.next();
        System.out.println("请输入您的年龄");
        int age = scanner.nextInt();

        double bmi = getBMI(weight, height);
        System.out.println("您的BMI值为" + bmi);

        double bmr = getBMR(gender, weight, height, age);
        System.out.println("您的基础代谢率值为" + bmr);


    }

    // 2.根据用户的信息，计算出BMI值
    public static double getBMI(double weight, double height) {
        double bmi = weight / (height * height);
        return bmi;
    }
    // 3.根据用户的信息，计算出BMR值
    public static double getBMR(String gender,double weight,double height,int age){
        if ("男".equals(gender)){
            return 88.362 + 13.397 * weight + 4.799 * height - 5.677 * age;
        } else {
            return 447.593 + 9.247 * weight + 3.098 * height - 4.330 * age;
        }
    }

}
