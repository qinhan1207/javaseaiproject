package com.qinhan.javabean;

public class Test {
    public static void main(String[] args) {
        // 目标：搞清楚实体类是什么？搞清楚其基本作用和应用场景
        // 实体类的基本作用：创建他的对象，存取数据（封装数据）
        Student s = new Student();
        s.setName("蔡徐坤");
        s.setMath(98);
        s.setChinese(100);

        StudentService studentService = new StudentService(s);

        studentService.printTotal();
        studentService.printAverage();

    }
}
