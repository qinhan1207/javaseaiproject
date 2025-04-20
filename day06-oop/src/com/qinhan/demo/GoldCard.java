package com.qinhan.demo;

//
public class GoldCard extends Card {

    public GoldCard(String cardId, String name, String phone, double money) {
        super(cardId, name, phone, money);
    }

    @Override
    public void consume(double money) {

        if (money * 0.8 > getMoney()) {
            System.out.println("您余额为" + getMoney() + ",您的余额不足!请存钱！");
            return;
        }
        System.out.println("您当前金卡消费" + money);
        System.out.println("优惠后的价格为" + money * 0.8);
        // 更新金卡的账户余额
        setMoney(getMoney() - money * 0.8);
        // 判断消费如果大于200，调用一个独有的功能，打印洗车票
        if (money * 0.8 >= 200) {
            printTicket();
        } else {
            System.out.println("您当前消费未满200，不能免费洗车");
        }


    }

    public void printTicket() {
        System.out.println("您消费了，打印洗车票");
    }
}
