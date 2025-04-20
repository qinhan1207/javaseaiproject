package com.qinhan.interface1;

public class Test {
    public static void main(String[] args) {
        // 目标：认识接口，搞清楚接口的特点，基本使用
        System.out.println(A.SCHOOL_NAME);
        // 注意：接口不能创建对象
        // 接口是用来被类实现的

        C c = new C();
        String str = c.go();
        c.run();
        c.play();
        System.out.println(str);
    }
}
