package com.qinhan.lambda;

import com.qinhan.innerclass3.Student;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Comparator;

public class LambdaDemo2 {
    public static void main(String[] args) {
        // 目标：用lambda表达式简化实际示例
        test1();
        test2();

    }

    public static void test1() {
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

        //Arrays.sort(students, (o1, o2) -> {
        //    return o1.getAge() - o2.getAge();
        //});

        Arrays.sort(students, (o1, o2) -> o1.getAge() - o2.getAge());


        // 遍历数组中的数据
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public static void test2() {
        JFrame win = new JFrame("登录窗口");
        win.setSize(300, 200);
        win.setLocationRelativeTo(null);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        win.add(panel);

        JButton btn = new JButton("登录");
        panel.add(btn);

        // java要求必须给这个按钮添加一个点击事件监听器对象，这样就可以监听用户的点击操作
        // 开发中并不是我们主动写一个匿名内部类，而是调用别人的功能时，别人可以让我们写一个匿名内部类，我们才会写
        //btn.addActionListener(new ActionListener() {
        //    @Override
        //    public void actionPerformed(ActionEvent e) {
        //        System.out.println("用户点击了按钮");
        //    }
        //});

        //btn.addActionListener(e -> {
        //    System.out.println("用户点击了按钮");
        //});

        btn.addActionListener(e -> System.out.println("用户点击了按钮"));

        win.setVisible(true);
    }
}
