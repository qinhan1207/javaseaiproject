package com.qinhan.extends6constructor;

public class People {
    private String name;
    private char sex;

    public People(String name, char sex) {
        this.name = name;
        this.sex = sex;
    }

    public People() {

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }
}
