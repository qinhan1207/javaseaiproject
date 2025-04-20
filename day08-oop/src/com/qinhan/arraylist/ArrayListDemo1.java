package com.qinhan.arraylist;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        // 目标：掌握ArrayList集合的常用方法。
        // 创建ArrayList对象，代表一个集合容器
        ArrayList<String> list = new ArrayList<>(); // 泛型定义集合
        // 添加数据
        list.add("hello");
        list.add("world");
        list.add("java");
        list.add("赵敏");
        System.out.println(list);
        // 查看数据
        System.out.println(list.get(0));
        // 遍历结合
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        // 删除数据
        list.remove(0); // 根据索引删除
        list.remove("java");    // 根据元素删除
        System.out.println(list);
        // 修改数据
        list.set(0, "赵敏");
        System.out.println(list);
    }
}
