package com.qinhan.extends6constructor;

public class Test {
    // 子类构造器都会先调用父类的无参构造器，然后再执行自己的构造器
    public static void main(String[] args) {
        Zi zi = new Zi();

    }
}

class Fu{
    public Fu(){
        System.out.println("父类无参构造器执行了");
    }
    public Fu(int a){
        System.out.println("父类的有参数构造器");
    }
}

class Zi extends Fu{
    public Zi(){
        System.out.println("子类无参构造器执行了");
    }
}
