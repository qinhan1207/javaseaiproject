package com.qinhan.capsulation;

public class Student {
    private String name;
    private int age;
    private double chinese;
    private double math;

    public Student(){}

    public Student(String name, int age, double chinese, double math){
        this.name = name;
        this.age = age;
        this.chinese = chinese;
        this.math = math;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public void setChinese(double chinese){
        this.chinese = chinese;
    }
    public double getChinese(){
        return chinese;
    }

    public void setMath(double math){
        this.math = math;
    }

    public double getMath(){
        return math;
    }


}
