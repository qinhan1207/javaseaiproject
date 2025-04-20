package com.qinhan.interface3;

public class Test {
    public static void main(String[] args) {
        // 完成接口小案例
        // 1.定义学生类，创建学生对象，封装学生数据
        // 2.准备学生数据

        Student[] allStudents = new Student[10];
        allStudents[0] = new Student("小明",'男',90);
        allStudents[1] = new Student("小红",'女',80);
        allStudents[2] = new Student("小刚",'男',70);
        allStudents[3] = new Student("小花",'女',60);
        allStudents[4] = new Student("小李",'男',50);
        allStudents[5] = new Student("小赵",'女',40);
        allStudents[6] = new Student("小钱",'男',30);
        allStudents[7] = new Student("小孙",'女',20);
        allStudents[8] = new Student("小周",'男',10);
        allStudents[9] = new Student("小吴",'女',0);

        // 3.提供两套业务实现方案，支持灵活切换(解耦合）：面向接口编程。
        //  -- 定义一个接口：必须完成打印全班学生信息，打印平均分。
        //  -- 定义第一套实现类，实现接口：实现打印全班学生的信息，打印全班学生的平均成绩
        //  -- 定义第二套实现类，实现接口：实现打印全班学生的信息（包括男女人数），打印全班学生的平均成绩（要求是去掉最高分，最低分）
        ClassDataInter cdi = new ClassDataInterImpl2(allStudents);
        cdi.printAllStudentInfos();
        cdi.printAverageScore();
    }

}
