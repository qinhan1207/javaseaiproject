package com.qinhan.allTest;

import java.util.Random;
import java.util.Scanner;

public class GuessNum {
    /*
     * 需求：
     * 随机生成一个1-100之间的数据，提示用户猜测，猜大提示过大，猜小提示过小，直到猜中结束游戏
     * */
    public static void main(String[] args) {
        guessNum();
    }

    public static void guessNum() {
//        得到随机数[1,100]的两种方法
//        方法一：
//        int num = Math.random() * 100 + 1;
        Random random = new Random();
        int num = random.nextInt(100) + 1;
        System.out.println("请输入您认为正确的数字");
        Scanner sc = new Scanner(System.in);
        while (true) {
            int guessNum = sc.nextInt();
            if (guessNum > num) {
                System.out.println("猜大了");
            } else if (guessNum < num) {
                System.out.println("猜小了");
            } else {
                System.out.println("恭喜你猜中了");
                break;
            }
        }

    }
}
