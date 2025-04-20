package com.qinhan.method1reference;

import com.qinhan.method1reference.Student;
import java.util.Arrays;

public class Demo1 {
    public static void main(String[] args) {
        // 静态方法引用
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

        Arrays.sort(students, (o1, o2) -> o1.getAge() - o2.getAge());


        Arrays.sort(students, (o1, o2) -> Student.compareByAge(o1,o2));

        // 静态方法引用：类名::静态方法
        Arrays.sort(students, Student::compareByAge);


        // 遍历数组中的数据
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
