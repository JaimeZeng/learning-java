package com.imooc.java2020.week03;

/**
 * 定义一个宠物猫类
 *
 * @author Jaime
 * @project_name learning-java
 */
public class Sections01ClassDemoCat {
    /**
     * 昵称 name、年龄 age、体重 weight、品种 species
     */
    String name;
    int age;
    double weight;
    String species;

    /**
     * 方法： 跑 run
     */
    public void run() {
        System.out.println("小猫快跑！");
    }

    /**
     * 方法： 小猫跑的方法 run
     *
     * @param name 小猫昵称
     */
    public void run(String name) {
        System.out.println(name + " 快跑！");

    }

    /**
     * 方法：吃 eat
     */
    public void eat() {
        System.out.println("小猫快吃鱼！");
    }

    /**
     * 方法：小猫吃东西的方法
     *
     * @param name 小猫昵称
     */
    public void eat(String name) {
        System.out.println(name + " 快吃鱼！");

    }
}
