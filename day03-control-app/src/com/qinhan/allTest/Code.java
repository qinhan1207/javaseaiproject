package com.qinhan.allTest;

public class Code {
    public static void main(String[] args) {
        //开发一个程序，可以生成指定位数的验证码，每位可以是数字、大小写字母
        System.out.println(getCode(4));

    }

    public static String getCode(int n) {
        String code = "";
        for (int i = 0; i < n; i++) {
            int type = (int) (Math.random() * 3);
            switch (type) {
                case 0:
                    int num = (int) (Math.random() * 10);
                    code += num;
                    break;
                case 1:
                    int upper = (int) (Math.random() * 25);
                    code += (char) (upper + 'A');
                    break;
                case 2:
                    int lower = (int) (Math.random() * 25);
                    code += (char) (lower + 'a');
                    break;
            }
        }
        return code;
    }
}
