package com.qinhan.method1reference;

import java.util.Arrays;

public class Demo2 {
    public static void main(String[] args) {
        // 实例方法引用
        test();
    }

    public static void test(){
        Student[] students = new Student[6];
        students[0] = new Student("殷素素", 18, 1.75, '女');
        students[1] = new Student("杨幂", 19, 1.68, '女');
        students[2] = new Student("张无忌", 25, 1.90, '男');
        students[3] = new Student("刘嘉玲", 18, 1.68, '女');
        students[4] = new Student("小昭", 27, 1.65, '女');
        students[5] = new Student("刘亦菲", 36, 1.67, '女');


        Student t = new Student();

        //Arrays.sort(students, (o1, o2) -> t.compareByHeight(o1,o2));

        // 实例方法引用： 对象名::实例方法
        // 前提：如果某个lambda表达式只是通过对象名称调用一个实例方法，并且->前后参数的形式一致，就可以使用实例方法引用
        Arrays.sort(students, t::compareByHeight);





        // 遍历数组中的数据
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
