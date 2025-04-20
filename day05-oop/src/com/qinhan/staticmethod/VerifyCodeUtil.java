package com.qinhan.staticmethod;

// 静态方法设置工具类
public class VerifyCodeUtil {

    // 工具类没有创建对象的必要性，所以建议私有化构造器
    private VerifyCodeUtil() {
    }

    public static String getCode(int n) {
        String code = "";
        for (int i = 0; i < n; i++) {
            // type随机为0,1,2来表示三种验证码字符
            int type = (int) (Math.random() * 3);
            switch (type) {
                // case 0 来表示大写字母
                case 0:
                    char upper = (char) ('A' + (int) (Math.random() * 26));
                    code += upper;
                    break;
                case 1:
                    char lower = (char) ('a' + (int) (Math.random() * 26));
                    code += lower;
                    break;
                case 2:
                    int num = (int) (Math.random() * 10);
                    code += num;
                    break;
            }
        }
        return code;
    }
}
