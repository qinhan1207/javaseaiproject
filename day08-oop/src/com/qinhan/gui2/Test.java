package com.qinhan.gui2;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Test {
    public static void main(String[] args) {
        JFrame jf = new JFrame("第一个窗体");
        jf.setSize(400, 300);
        jf.setLocationRelativeTo(null); // 设置窗口居中
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 关闭窗口，退出程序

        JPanel panel = new JPanel();
        jf.add(panel);

        JButton jb = new JButton("登录");
        jb.setBounds(100, 100, 100, 50); // 设置按钮的位置和尺寸
        panel.add(jb);


        // 给按钮绑定点击事件监听对象
        jb.addActionListener(e -> {
            JOptionPane.showMessageDialog(jf, "有人点击了登录");
        });
        // 需求：监听用户键盘上下左右四个按键的事件
        // 给jf窗口整体绑定按键事件
        jf.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                //super.keyPressed(e);
                int keyCode = e.getKeyCode();

                if (keyCode == KeyEvent.VK_UP) {
                    System.out.println("用户点击了上");
                } else if (keyCode == KeyEvent.VK_DOWN) {
                    System.out.println("用户点击了下");
                } else if (keyCode == KeyEvent.VK_LEFT) {
                    System.out.println("用户点击了左");
                } else if (keyCode == KeyEvent.VK_RIGHT) {
                    System.out.println("用户点击了右");
                }
            }
        });
        jf.setVisible(true);    //显示窗口
        // 让窗口成为焦点
        jf.requestFocus();
    }
}
