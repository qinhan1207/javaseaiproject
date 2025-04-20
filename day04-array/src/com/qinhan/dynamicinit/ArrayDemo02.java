package com.qinhan.dynamicinit;

import java.util.Arrays;

public class ArrayDemo02 {
    public static void main(String[] args) {
        // 目标：完成斗地主游戏的做牌和洗牌
        start();
    }

    public static void start(){
        // 初始化牌堆
        String[] poker = new String[54];
        String[] nums = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        String[] flowers = {"♠","♥","♣","♦"};
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < flowers.length; j++) {
                poker[index++] = flowers[j]+nums[i];
            }
        }
        poker[index++] = "smallJoker";
        poker[index] = "bigJoker";
        System.out.println(Arrays.toString(poker));
        // 洗牌
        for (int i = 0; i < poker.length; i++) {
            int j = (int)(Math.random()*poker.length);
            String temp = poker[i];
            poker[i] = poker[j];
            poker[j] = temp;
        }
        System.out.println(Arrays.toString(poker));
    }
}
