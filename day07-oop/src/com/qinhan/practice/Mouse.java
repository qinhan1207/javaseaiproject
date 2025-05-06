package com.qinhan.practice;

public class Mouse implements Usb {
    @Override
    public void connect() {
        System.out.println("连接上了鼠标");
    }

    @Override
    public void exit() {
        System.out.println("拔出了鼠标");
    }

    public void click(){
        System.out.println("使用鼠标点击了桌面");
    }
}
