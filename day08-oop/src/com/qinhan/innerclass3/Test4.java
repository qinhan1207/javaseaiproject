package com.qinhan.innerclass3;

import java.util.Arrays;
import java.util.Comparator;

public class Test4 {
    public static void main(String[] args) {
        // 目标：完成给数组排序，理解其中匿名内部类的用法。
        // 准备一个学生类型的数组，存放6个学生
        Student[] students = new Student[6];
        students[0] = new Student("殷素素", 18, 1.75, '女');
        students[1] = new Student("杨幂", 19, 1.68, '女');
        students[2] = new Student("张无忌", 25, 1.90, '男');
        students[3] = new Student("刘嘉玲", 18, 1.68, '女');
        students[4] = new Student("小昭", 27, 1.65, '女');
        students[5] = new Student("刘亦菲", 36, 1.67, '女');

        // 需求：按照年龄进行升序排序。可以调用sun公司写好的API直接对数组进行排序
        Arrays.sort(students,new Comparator<Student>(){
            @Override
            public int compare(Student o1, Student o2) {
                // 指定排序规则
                // 如果你认为左边对象大于右边对象，那么返回正整数
                // 如果你认为左边对象小于右边对象，那么返回负整数
                // 如果两边相等，返回0
                //if(o1.getAge()>o2.getAge()){
                //    return 1;
                //} else if (o1.getAge()<o2.getAge()){
                //    return -1;
                //}
                //return 0;
                return o1.getAge()-o2.getAge();
            }
        });


        // 遍历数组中的数据
        for(Student student : students){
            System.out.println(student);
        }
    }
}
