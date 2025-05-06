package com.qinhan.practice;

public class Computer {
    public void use(Usb usb){
        usb.connect();
        if (usb instanceof KeyBoard){
            ((KeyBoard) usb).input();
        } else if (usb instanceof Mouse) {
            ((Mouse) usb).click();
        }
        usb.exit();
    }
}
