package com.qinhan.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// lombok可以实现为类自动添加getter setter方法 无参构造 toString方法等

@Data   // @Data 注解可以自动生成getter setter 无参构造器 toString方法等
@NoArgsConstructor
@AllArgsConstructor
public class Card {
    private String cardId;
    private String name;
    private String phone;
    private double money;

    // 预存金额
    public void deposit(double money) {
        this.money += money;
    }

    // 消费金额
    public void consume(double money) {
        this.money -= money;
    }
}
