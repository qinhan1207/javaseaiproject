package com.qinhan.extends5override;

public class Test2 {
    // 目标：方法重写的应用场景：子类重写Object的toString()方法，以便返回对象的内容
    public static void main(String[] args) {
        Student student = new Student("赵敏",'女',25);
        System.out.println(student);
    }
}

class Student{
    private String name;
    private char sex;
    private int age;

    public Student() {
    }

    public Student(String name, char sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                '}';
    }
}