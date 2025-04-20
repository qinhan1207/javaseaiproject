package com.qinhan.abstract1;
// 抽象类
public abstract class A {
    private String name;
    private int age;
    public A(){}

    @Override
    public String toString() {
        return "A{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public A(String name, int age){
        this.name = name;
        this.age = age;
    }
    // 抽象方法:必须用abstract关键字来修饰，抽象方法没有方法体，只有方法声明
    public abstract void show();

    public void show1(){
        System.out.println("show1的方法");
    }
}
