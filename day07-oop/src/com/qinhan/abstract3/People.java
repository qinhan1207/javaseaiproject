package com.qinhan.abstract3;

public abstract class People {
    // 1.模版方法设计模式
    public final void write(){
        System.out.println("\t\t\t《我的爸爸》");
        System.out.println("\t我爸爸是一个好人，我特别喜欢他，他对我很好，我来介绍一下");
        // 2.模版方法知道子类一定要写这个正文，但是每个子类写的信息是不同的，父类定义一个抽象方法
        // 具体的实现交给子类来重写正文
        writeMain();
        System.out.println("\t我爸爸真好，你有这样的爸爸吗");
    }

    public abstract void writeMain();
}
