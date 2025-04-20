package com.qinhan.method1reference;

import java.util.Arrays;
import java.util.Comparator;

public class Demo3 {
    public static void main(String[] args) {
        // 特定类型的方法引用
        // 需求：有一个字符串数组，里面有一些人的名字，请按照名字的首字母升序排序
        String[] names = {"Tom", "Jerry", "Mike", "Jack", "Lucy","caocao","angela","Andy","Bobi","曹操"};

        // 把这个数组进行排序
        //Arrays.sort(names);
        // 要求：忽略首字母的大小进行升序排序（java官方默认是搞不定的，需要我们自己指定规则）
        //Arrays.sort(names, new Comparator<String>() {
        //    @Override
        //    public int compare(String o1, String o2) {
        //        return o1.compareToIgnoreCase(o2);
        //    }
        //});

        //Arrays.sort(names,(o1,o2)->o1.compareToIgnoreCase(o2));

        // 特定类型方法引用：类型名称::方法名
        Arrays.sort(names, String::compareToIgnoreCase);
        System.out.println(Arrays.toString(names));
    }
}
