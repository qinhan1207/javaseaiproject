package com.qinhan;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;

// 自定义窗口类
public class MainFrame extends JFrame {

    private static final String IMAGE_PATH = "stone-maze/src/image/";

    // 准备一个数组，用于存储数字色块的行列位置：4行4列
    private int[][] imageData = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 0}
    };
    // 定义一个二维数组，用来存储最终游戏成功的数据顺序
    private int[][] winData = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 0}
    };
    // 定义两个整数变量，记录当前空白色块的位置
    private int row;
    private int col;
    private int count; // 统计总共移动的步数


    public MainFrame() {
        // 1.调用一个初始化方法：初始化窗口大小信息
        initFrame();
        // 4.打乱数字色块的顺序，再展示图片
        initRandomArray();
        // 2.初始化界面：展示数字色块
        initImage();
        // 3.初化系统菜单：点击弹出菜单信息是系统退出，重启游戏
        initMenu();
        // 5.给当前窗口绑定上下左右按键事件
        initKeyPressEvent();
        // 设置窗口的显示
        this.setVisible(true);

    }

    // 给当前窗口绑定上下左右按键事件
    private void initKeyPressEvent() {
        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                // 获取当前按钮的编号
                int keyCode = e.getKeyCode();
                switch (keyCode) {
                    case KeyEvent.VK_UP:
                        switchAndMove(Direction.UP);
                        break;
                    case KeyEvent.VK_DOWN:
                        switchAndMove(Direction.DOWN);
                        break;
                    case KeyEvent.VK_LEFT:
                        switchAndMove(Direction.LEFT);
                        break;
                    case KeyEvent.VK_RIGHT:
                        switchAndMove(Direction.RIGHT);
                        break;
                }
            }
        });
    }

    // 控制数据交换和图片移动
    private void switchAndMove(Direction direction) {
        // 判断图片的方向，再控制图片的移动
        switch (direction) {
            case UP:
                if(row<imageData.length-1){
                    int temp = imageData[row][col];
                    imageData[row][col] = imageData[row+1][col];
                    imageData[row+1][col] = temp;
                    // 更新空白色块的位置
                    row++;
                    count++;
                }

                break;
            case DOWN:
                if(row>0){
                    int temp = imageData[row][col];
                    imageData[row][col] = imageData[row-1][col];
                    imageData[row-1][col] = temp;
                    // 更新空白色块的位置
                    row--;
                    count++;
                }
                break;
            case LEFT:
                if(col<imageData[0].length-1){
                    int temp = imageData[row][col];
                    imageData[row][col] = imageData[row][col+1];
                    imageData[row][col+1] = temp;
                    col++;
                    count++;
                }
                break;
            case RIGHT:
                if(col>0){
                    int temp = imageData[row][col];
                    imageData[row][col] = imageData[row][col-1];
                    imageData[row][col-1] = temp;
                    col--;
                    count++;
                }
                break;
        }
        // 重新刷新界面
        initImage();
    }

    private void initRandomArray() {
        for (int i = 0; i < imageData.length; i++) {
            for (int j = 0; j < imageData[i].length; j++) {
                int randomRow = (int) (Math.random() * imageData.length);
                int randomCol = (int) (Math.random() * imageData[i].length);
                int temp = imageData[i][j];
                imageData[i][j] = imageData[randomRow][randomCol];
                imageData[randomRow][randomCol] = temp;
            }
        }
        // 定位空白色块的位置
        OUT:
        for (int i = 0; i < imageData.length; i++) {
            for (int j = 0; j < imageData[i].length; j++) {
                if (imageData[i][j]==0){
                    row = i;
                    col = j;
                    break OUT;  // 跳出整个循环
                }
            }
        }

    }

    // 初始化菜单
    private void initMenu() {
        JMenuBar menuBar = new JMenuBar();  // 创建一个菜单条
        JMenu menu = new JMenu("系统");  // 创建一个菜单
        JMenuItem exitJi = new JMenuItem("退出");   // 添加一个菜单项
        menu.add(exitJi);
        exitJi.addActionListener(e -> {
            this.dispose();
        });
        JMenuItem restartJi = new JMenuItem("重启");   // 添加一个菜单项
        menu.add(restartJi);
        restartJi.addActionListener(e -> {
            // 重启游戏:重新打乱二维数组中的数据
            count = 0;
            initRandomArray();
            initImage();

        });
        menuBar.add(menu);
        this.setJMenuBar(menuBar);

    }

    private void initImage() {
        // 先清空窗口上的全部图层
        this.getContentPane().removeAll();

        // 给窗口添加一个展示文字的组件
        JLabel countTxt = new JLabel("当前移动：" + count+"步");
        countTxt.setBounds(20, 20, 100, 20);
        // 把文字设置成红色
        countTxt.setForeground(Color.RED);
        // 加粗
        countTxt.setFont(new Font("楷体",Font.BOLD,12));
        this.add(countTxt);

        // 判断是否胜利
        if(isWin()){
            // 展示胜利的图片
            JLabel label = new JLabel(new ImageIcon(IMAGE_PATH+"win.png"));
            label.setBounds(124,230,266,88);
            this.add(label);
        }

        // 1.展示一个行列矩阵的色块依次铺满窗口(4*4)
        for (int i = 0; i < imageData.length; i++) {
            for (int j = 0; j < imageData[i].length; j++) {
                // 拿到图片的名称
                String imageName = imageData[i][j] + ".png";
                // 2.创建一个JLabel对象，设置图片给他展示
                JLabel label = new JLabel();
                // 3.设置图片
                label.setIcon(new ImageIcon(IMAGE_PATH + imageName));
                // 4.设置图片位置展示出来
                label.setBounds(20 + j * 100, 60 + i * 100, 100, 100);
                // 5.把这个图片展示到窗口上
                this.add(label);

            }
        }

        // 设置窗口的背景图片
        JLabel background = new JLabel(new ImageIcon(IMAGE_PATH + "background.png"));
        background.setBounds(0, 0, 450, 484);
        this.add(background);

        // 刷新图层
        this.repaint();
    }

    private boolean isWin() {
        // 判断游戏二维数组和赢了之后的二维数组的内容
        for (int i = 0; i < imageData.length; i++) {
            for (int j = 0; j < imageData[i].length; j++) {
                if (imageData[i][j]!=winData[i][j]){
                    return false;
                }
            }
        }
        return true;
    }

    private void initFrame() {
        this.setTitle("石头迷阵 V1.0");
        this.setSize(465, 575);
        this.setLocationRelativeTo(null);
        // 设置布局方式为绝对布局
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
