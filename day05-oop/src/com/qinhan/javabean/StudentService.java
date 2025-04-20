package com.qinhan.javabean;

public class StudentService {

    private Student student;

    public StudentService(Student student){
        this.student = student;
    }


    // 提供方法，打印学生对象的总成绩
    public void printTotal(){
        System.out.println(student.getName()+"的总成绩为"+(student.getChinese()+student.getMath()));
    }
    // 提供方法，打印学生的评价成绩
    public void printAverage(){
        System.out.println(student.getName()+"的平均成绩为"+(student.getChinese()+student.getMath())/2);
    }
}
