package com.qinhan.gui2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test2 {
    public static void main(String[] args) {
        // 第一种写法：提供实现类：创建实现类对象代表事件监听器对象
        JFrame jf = new JFrame("窗口");

        JPanel panel = new JPanel();
        jf.add(panel);

        jf.setSize(400,300);
        jf.setLocationRelativeTo(null);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton jb = new JButton("登录");
        panel.add(jb);
        jb.addActionListener(new MyActionListener(jf));

        jf.setVisible(true);
    }
}

// 实现类
class MyActionListener implements ActionListener{
    private JFrame jf;
    public MyActionListener(JFrame jf){
        this.jf = jf;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(jf,"有人点击了登录");
    }
}
