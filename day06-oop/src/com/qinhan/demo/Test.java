package com.qinhan.demo;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // 目标：加油站支付小程序
        // 1.创建卡片类，以便创建金卡和银卡对象，封装车主的数据
        // 2.定义卡片父类
        // 3.定义一个金卡类，继承Card类:金卡必须重写消费方法(8折)
        // 4.定义一个银卡类，继承Card类:银卡必须重写消费方法(9折)
        // 5.办一张金卡：创建一个金卡对象。交给一个独立的业务处理（支付机）来完成：存款、消费。
        GoldCard goldCard = new GoldCard("豫G88888","lanni","13373709780",5000);
        pay(goldCard);

        // 6.办一张银卡：创建一个银卡对象。交给一个独立的业务处理（支付机）来完成：存款、消费。
        SilverCard silverCard = new SilverCard("豫G66666","yanhui","13569877896",2000);
        pay(silverCard);
    }
    // 支付机：用一个方法来刷卡：可能接收金卡，也可能接收银卡
    public static void pay(Card card){
        System.out.println("请刷卡，请您输入当前消费的金额");
        Scanner sc = new Scanner(System.in);
        double money = sc.nextDouble();
        card.consume(money);


    }

}
