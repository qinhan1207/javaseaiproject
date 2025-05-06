package com.qinhan.pracrice;

public class Test07 {
    public static void main(String[] args) {
        int year = 2050;

        System.out.println(year+"年是否为闰年:" + ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0));
    }
}
