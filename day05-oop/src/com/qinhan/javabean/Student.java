package com.qinhan.javabean;

public class Student {
    // 1.私有成员变量
    private String name;
    private double chinese;
    private double math;
    // 2.提供getter和setter方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getChinese() {
        return chinese;
    }

    public void setChinese(double chinese) {
        this.chinese = chinese;
    }

    public double getMath() {
        return math;
    }

    public void setMath(double math) {
        this.math = math;
    }

    // 3.提供无参构造器

    public Student() {
    }

    public Student(String name, double chinese, double math) {
        this.name = name;
        this.chinese = chinese;
        this.math = math;
    }
}
