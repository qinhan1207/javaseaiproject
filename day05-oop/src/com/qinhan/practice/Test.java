package com.qinhan.practice;

public class Test {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.setId("t001");
        t1.setName("杨老师");
        t1.teach();

        Teacher t2 = new Teacher("李老师","t002");
        t2.teach();
    }
}
