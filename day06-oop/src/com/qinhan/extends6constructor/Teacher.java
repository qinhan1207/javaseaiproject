package com.qinhan.extends6constructor;

public class Teacher extends People {
    private String skill;



    public Teacher(String name, char sex, String skill) {
        super(name,sex);
        this.skill = skill;
    }

    public Teacher() {

    }

    @Override
    public String toString() {
        return "Teacher{" +
                "skill='" + skill + '\'' +
                "name"+super.getName()+'}';
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }
}
