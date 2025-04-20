package com.qinhan.demo;

public class SilverCard extends Card{
    public SilverCard(String cardId, String name, String phone, double money) {
        super(cardId, name, phone, money);
    }


    @Override
    public void consume(double money){

        if (money * 0.9 > getMoney()) {
            System.out.println("您余额为" + getMoney() + ",您的余额不足!请存钱！");
            return;
        }

        System.out.println("您当前银卡消费"+money);
        System.out.println("优惠后价格为"+money*0.9);
        // 更新银卡的账户余额
        setMoney(getMoney()-money*0.9);
    }
}
