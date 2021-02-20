package com.imooc.java2020.week03.inheritancedemo.animal;

/**
 * 小狗类 Dog
 *
 * @author Jaime
 * @project_name learning-java
 */
public class Dog extends Animal {
    /**
     * 性别sex
     */
    private char sex;

    public Dog() {
    }

    public Dog(String name, int month, String species, char sex) {
        super(name, month, species);
        this.sex = sex;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public void sleep() {
        System.out.println(this.getMonth() + " month " + this.getName() + " is sleeping~");
    }
}
