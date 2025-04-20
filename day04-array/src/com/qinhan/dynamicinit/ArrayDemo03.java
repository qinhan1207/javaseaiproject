package com.qinhan.dynamicinit;

import java.util.Arrays;

public class ArrayDemo03 {
    public static void main(String[] args) {
        // 目标：完成数字华容道的初始化和乱序
        start(6);
    }
    public static void start(int n) {
        // 定义一个二维数组来存储数字华容道数据
        int[][] arr = new int[n][n];

        // 遍历二维数组，给二维数组赋值
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = i*n+j+1;
                if(i==n-1&&j==n-2){
                    break;
                }
            }
        }
        printArr(arr);
        System.out.println("====================================");

        // 乱序
        for (int i = 0; i < 1000; i++) {
            int x = (int)(Math.random()*n);
            int y = (int)(Math.random()*n);
            int temp = arr[x][y];
            arr[x][y] = arr[n-1][n-2];
            arr[n-1][n-2] = temp;
        }
        printArr(arr);
    }

    public static void printArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
