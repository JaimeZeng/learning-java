package com.imooc.java2020.week03.inheritancedemo.animal;

/**
 * 小狗类 Dog01
 *
 * @author Jaime
 * @project_name learning-java
 */
public class Dog01 extends Animal {
    /**
     * 性别sex
     */
    private char sex;

    public Dog01() {
    }

    public Dog01(String name, int month, String species, char sex) {
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

    // 重载 Dog 类的 sleep()
    public void sleep(String name) {
        System.out.println(name + " 正在睡觉哦~");
    }

    // 重写 Animal 的 eat()
    public void eat() {
        System.out.println(this.getName() + " 最近食欲不是很好，只吃了一点食物。");
    }
}
