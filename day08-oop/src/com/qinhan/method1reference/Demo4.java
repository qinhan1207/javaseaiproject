package com.qinhan.method1reference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class Demo4 {
    public static void main(String[] args) {
        // 目标：理解构造器引用

    }
}


interface CarFactory{
    Car getCar(String name);
}

@Data
@NoArgsConstructor
@AllArgsConstructor
class Car{
    private String name;
}
