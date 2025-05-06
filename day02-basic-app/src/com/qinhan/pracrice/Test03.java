package com.qinhan.pracrice;

public class Test03 {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
        int result = sum(a,b);
        System.out.println(result);

        byte c = 10;
        char d = 'a';
        float f =5.2f;
        double e = 10;
        double result2 = sum(c,d,f,e);
        System.out.println(result2);
    }

    public static int sum(byte a,byte b){
        return a+b;
    }

    public static double sum(byte a,char b,float c,double d){
        return a+b+c+d;
    }


}
