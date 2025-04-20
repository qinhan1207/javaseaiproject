package com.qinhan.interface3;

import java.util.Arrays;

public class ClassDataInterImpl1 implements ClassDataInter {

    private Student[] students;

    public ClassDataInterImpl1(Student[] students) {
        this.students = students;
    }

    @Override
    public void printAllStudentInfos() {
        System.out.println("全班学生信息如下：");
        for (Student student : students) {
            System.out.println(student);
        }
    }

    @Override
    public void printAverageScore() {
        double average = 0;
        double sum = 0;
        for (int i = 0; i < students.length; i++) {
            Student student = students[i];
            sum += student.getScore();
        }
        average = sum/students.length;
        System.out.println("全班学生的平均分为"+average);
    }
}
