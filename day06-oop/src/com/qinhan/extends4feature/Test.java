package com.qinhan.extends4feature;

public class Test {
    public static void main(String[] args) {
        Zi zi = new Zi();
        zi.printName();

    }
}

class Fu{
    String name = "父类";
}

class Zi extends Fu{
    String name = "子类";
    public void printName(){
        String name = "nihao";
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }
}