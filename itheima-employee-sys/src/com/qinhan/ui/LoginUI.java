package com.qinhan.ui;

import com.qinhan.bean.User;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


// 自定义登录界面
public class LoginUI extends JFrame implements ActionListener {
    private JTextField loginNameField; // 用户名输入框
    private JPasswordField passwordField; // 密码输入框
    private JButton loginButton; // 登录按钮
    private JButton registerButton; //注册按钮

    // 定义一个静态的集合，存储用户中全部的用户对象信息
    private static ArrayList<User> allUsers = new ArrayList<>();

    // 初始化几个测试的用户对象信息，作为登录用
    static {
        allUsers.add(new User("超级管理员", "123456", "admin"));
        allUsers.add(new User("赵敏", "wuji520", "minmin"));
        allUsers.add(new User("周杰伦", "jaychou", "jay"));
    }

    public LoginUI() {
        super("登录界面");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

        createAndShowGUI();
    }


    private void createAndShowGUI() {
        // 创建面板
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(new Color(240, 240, 240));

        // 设置字体和颜色
        Font customFont = new Font("楷体", Font.BOLD, 18);
        Color primaryColor = new Color(66, 135, 245);
        Color secondaryColor = new Color(204, 204, 204); // 更浅的颜色用于注册按钮

        // 标题
        JLabel titleLabel = new JLabel("黑马程序员人事管理系统");
        titleLabel.setBounds(50, 30, 300, 30);
        titleLabel.setFont(new Font("楷体", Font.BOLD, 24));
        panel.add(titleLabel);

        // 用户名标签
        JLabel usernameLabel = new JLabel("用户名：");
        usernameLabel.setBounds(50, 100, 150, 30);
        usernameLabel.setFont(customFont);
        panel.add(usernameLabel);

        // 用户名输入框
        loginNameField = new JTextField();
        loginNameField.setBounds(160, 100, 190, 30);
        loginNameField.setFont(customFont);
        panel.add(loginNameField);

        // 密码标签
        JLabel passwordLabel = new JLabel("密   码：");
        passwordLabel.setBounds(50, 150, 150, 30);
        passwordLabel.setFont(customFont);
        panel.add(passwordLabel);

        // 密码输入框
        passwordField = new JPasswordField();
        passwordField.setBounds(160, 150, 190, 30);
        passwordField.setFont(customFont);
        // 设置掩码字符为*
        passwordField.setEchoChar('*');
        panel.add(passwordField);


        // 登录按钮
        loginButton = new JButton("登   录");
        loginButton.setBounds(50, 200, 150, 30);
        loginButton.setFont(customFont);
        loginButton.setBackground(primaryColor);
        loginButton.setForeground(Color.WHITE);
        panel.add(loginButton);

        loginButton.addActionListener(this);


        // 注册按钮
        registerButton = new JButton("注   册");
        registerButton.setBounds(200, 200, 150, 30);
        registerButton.setFont(customFont);
        registerButton.setBackground(secondaryColor);
        registerButton.setForeground(Color.BLACK);
        panel.add(registerButton);
        registerButton.addActionListener(this);

        // 添加面板到窗口
        add(panel);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // 这里可能是登录按钮点击过来的，也可能是注册按钮点击进来的
        // 判断到底是登录还是注册进来的
        JButton btn = (JButton) e.getSource();
        if (btn == loginButton) {
            login();
        } else {
            System.out.println("注册过来的");
        }
    }

    private void login() {
        // 1.获取用户输入的用户名和密码
        String loginName = loginNameField.getText();
        String password = new String(passwordField.getPassword());
        // 2.遍历集合，判断用户名和密码是否和集合中的用户名和密码匹配
        // 3.根据登录名称去查询用户对象返回。查询到用户对象，说明登录名正确
        User user = getUserByLoginName(loginName);
        if (user != null) {
            // 4.判断密码是否正确
            if (user.getPassword().equals(password)) {
                System.out.println("登录成功");
                new EmployeeManagerUI(user.getUsername());
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this,"密码错误");
            }
        } else{
            JOptionPane.showMessageDialog(this,"用户名不存在");
        }


    }

    // 根据登录名称去查询用户对象返回。查询到用户对象，说明登录名正确
    private User getUserByLoginName(String loginName) {
        for (User user : allUsers) {
            if (user.getLoginName().equals(loginName)) {
                return user;
            }
        }
        return null; //没有查询到用户对象，说明登录名称不正确
    }
}