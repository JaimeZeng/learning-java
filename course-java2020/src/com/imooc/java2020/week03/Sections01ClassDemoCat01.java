package com.imooc.java2020.week03;

/**
 * 定义一个宠物猫类 + 构造方法
 *
 * @author Jaime
 * @project_name learning-java
 */
public class Sections01ClassDemoCat01 {
    /**
     * 昵称 name、年龄 age、体重 weight、品种 species
     */
    String name;
    int age;
    double weight;
    String species;

    /**
     * 无参构造方法。IDEA中使用 Alt + Insert 自动生成。
     */
    public Sections01ClassDemoCat01() {  //添加断点调试
        System.out.println("无参构造方法");
    }

    /**
     * 有参构造方法。IDEA中使用 Alt + Insert 自动生成。
     *
     * @param name    昵称
     * @param age     年龄
     * @param weight  体重
     * @param species 品种
     */
    /*public Sections01ClassDemoCat01(String catName, int catAge, double catWeight, String catSpecies) {  //添加断点调试
        name = catName;
        age = catAge;
        weight = catWeight;
        species = catSpecies;
    }*/
    public Sections01ClassDemoCat01(String name, int age, double weight, String species) {  //添加断点调试
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.species = species;
    }

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
        this.run();
        System.out.println(name + " 快吃鱼！");
    }
}

