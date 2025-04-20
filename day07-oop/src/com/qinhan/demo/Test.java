package com.qinhan.demo;

import java.util.Scanner;

public class Test {
    // 目标：面向对象编程实现智能家居系统
    // 角色：设备（吊灯、电视机、洗衣机、落地窗）
    // 具备的功能：开和关
    // 谁控制他们：智能控制系统（单例对象），控制调用设备的开和关
    // 1.定义设备类：创建设备对象代表家里的设备
    // 2.准备这些设备对象，放到数组中，代表整个家庭的设备。
    public static void main(String[] args) {
        JD[] jds = new JD[4];
        jds[0] = new Lamp("欧灯", true);
        jds[1] = new TV("小米电视机", false);
        jds[2] = new WashMachine("美的洗衣机", true);
        jds[3] = new Air("美的空调", false);

        // 3.为每个设备制定一个开和关的功能。定义一个接口，让JD实现开关功能。
        // 4.创建智能控制系统对象，控制设备开关。
        SmartHomeControl smartHomeControl = SmartHomeControl.getInstance();
        // 5.控制开关
        //smartHomeControl.control(jds[0]);

        // 6.提示用户操作，a、展示全部设备的当前情况。b、让用户选择哪一个操作。
        // 打印全部设备的开和关的现状
        while (true) {
            smartHomeControl.printAllStatus(jds);
            System.out.println("请您选择要控制的设备：");
            Scanner sc = new Scanner(System.in);
            String command = sc.next();
            switch (command){
                case "1":
                    smartHomeControl.control(jds[0]);
                    break;
                case "2":
                    smartHomeControl.control(jds[1]);
                    break;
                case "3":
                    smartHomeControl.control(jds[2]);
                    break;
                case "4":
                    smartHomeControl.control(jds[3]);
                    break;
                case "exit":
                    System.out.println("感谢您的使用，欢迎下次再来！");
                    System.exit(0);
                default:
                    System.out.println("您输入的编号有误，请重新输入！");
            }
        }
    }


}
