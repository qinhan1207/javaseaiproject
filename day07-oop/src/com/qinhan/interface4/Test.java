package com.qinhan.interface4;

public class Test {
    public static void main(String[] args) {
        // 目标：搞清楚接口新增的三种方式，并理解其好处
        A a = new B();
        a.go();
        A.show();
    }
}
