package com.qinhan.demo;
// 智能控制系统
public class SmartHomeControl {

    // 私有化构造器
    private SmartHomeControl(){}

    // 创建一个对象
    private static final SmartHomeControl smartHomeControl = new SmartHomeControl();

    public static SmartHomeControl getInstance(){
        return smartHomeControl;
    }

    public void control(JD jd) {
        System.out.println(jd.getName()+"状态目前是"+((jd.isStatus())?"开":"关"));
        System.out.println("开始您的操作....");
        jd.press();
        System.out.println(jd.getName()+"状态目前是"+((jd.isStatus())?"开":"关"));
    }

    public void printAllStatus(JD[] jds) {
        // 遍历每个设备
        JD jd = new JD();
        for (int i = 0; i < jds.length; i++) {
            jd = jds[i];
            System.out.println((i+1)+" "+jd.getName()+"的开关情况为"+((jd.isStatus())?"开着":"关着"));
        }
    }
}
