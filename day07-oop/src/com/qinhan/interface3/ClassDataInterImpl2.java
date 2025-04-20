package com.qinhan.interface3;

//  -- 定义第二套实现类，实现接口：实现打印全班学生的信息（包括男女人数），打印全班学生的平均成绩（要求是去掉最高分，最低分）
public class ClassDataInterImpl2 implements ClassDataInter{
    private Student[] students;

    public ClassDataInterImpl2(Student[] students){
        this.students = students;
    }


    @Override
    public void printAllStudentInfos() {
        int totalMale = 0;
        int totalFemale = 0;
        System.out.println("全班学生信息如下");
        for (Student student:students){
            System.out.println(student);
            if (student.getSex()=='男'){
                totalMale++;
            } else {
                totalFemale++;
            }
        }
        System.out.println("共有" + totalMale + "名男生"+totalFemale+"名女生");
    }

    @Override
    public void printAverageScore() {
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;
        double sum = 0;
        double average = 0;
        for (Student student : students){
            if (student.getScore()>max){
                max = student.getScore();
            }
            if (student.getScore()<min){
                min = student.getScore();
            }
            sum += student.getScore();
        }
        average = (sum - max - min)/students.length;
        System.out.println("全班学生的平均分位"+average);
    }
}
