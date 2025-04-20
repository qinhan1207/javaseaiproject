package com.qinhan.gui2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// 自定义的登录界面：认JFrame做爸爸
public class LoginFrame extends JFrame implements ActionListener {
    public LoginFrame(){
        super("登录界面");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        init();
    }
    private void init(){
        // 添加一个登录按钮
        JPanel panel = new JPanel();
        JButton btn = new JButton("登录");
        add(panel);
        panel.add(btn);
        btn.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(this, "我被点击了");
    }
}
