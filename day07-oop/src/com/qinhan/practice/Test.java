package com.qinhan.practice;

public class Test {
    public static void main(String[] args) {

        Usb mouse = new Mouse();
        Usb keyBoard = new KeyBoard();

        Computer computer = new Computer();
        computer.use(mouse);

        computer.use(keyBoard);
    }
}
