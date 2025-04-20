package com.qinhan.dynamicinit;

import java.util.Scanner;

public class ArrayDemo01 {
    // 有8名学生的成绩，找到成绩的最高分，最低分和平均分
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] scores = new double[8];
        for (int i = 0; i < 8; i++) {
            System.out.println("请输入第" + (i + 1) + "位同学的成绩");
            scores[i] = sc.nextDouble();
        }
        printScore(scores);
    }

    public static void printScore(double[] scores) {
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;
        double sum = 0;
        for (int i = 0; i < 8; i++) {
            if (scores[i] > max) {
                max = scores[i];
            }
            if (scores[i] < min) {
                min = scores[i];
            }
            sum += scores[i];
        }
        System.out.println("最高分位" + max);
        System.out.println("最低分位" + min);
        System.out.println("平均分为" + sum / 8);
    }
}
