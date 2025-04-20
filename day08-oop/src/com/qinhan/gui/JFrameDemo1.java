package com.qinhan.gui;

import javax.swing.*;

public class JFrameDemo1 {
    public static void main(String[] args) {
        // 目标：快速入门一下GUI Swing编程
        // 1.创建一个窗口，有一个输入框，有一个登录按钮
        JFrame jf = new JFrame("第一个窗体");
        jf.setSize(400, 300);
        jf.setLocationRelativeTo(null); // 设置窗口居中
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 关闭窗口，退出程序

        JPanel panel = new JPanel();
        jf.add(panel);

        JButton jb = new JButton("登录");
        jb.setBounds(100, 100, 100, 50); // 设置按钮的位置和尺寸
        panel.add(jb);
        jf.setVisible(true);
    }
}
