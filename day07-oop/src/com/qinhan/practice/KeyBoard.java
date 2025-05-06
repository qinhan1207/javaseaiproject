package com.qinhan.practice;

public class KeyBoard implements Usb{
    @Override
    public void connect() {
        System.out.println("连接上了键盘");
    }

    @Override
    public void exit() {
        System.out.println("拔出了键盘");
    }

    public void input(){
        System.out.println("使用键盘输入了Hello World");
    }
}
