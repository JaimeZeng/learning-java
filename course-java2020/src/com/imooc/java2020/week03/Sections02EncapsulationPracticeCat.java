package com.imooc.java2020.week03;

/**
 * 宠物猫类 Sections02EncapsulationPracticeCat
 *
 * @author Jaime
 * @project_name learning-java
 */
public class Sections02EncapsulationPracticeCat {
    /**
     * 昵称name、年龄age
     */
    private String name;
    private int age;

    /**
     * 有参构造初始化
     *
     * @param name 昵称
     * @param age  年龄
     */
    public Sections02EncapsulationPracticeCat(String name, int age) {
        // this.name = name;
        // this.age = age;
        this.setName(name);
        this.setAge(age);
    }

    /**
     * get 获取昵称
     *
     * @return 昵称
     */
    public String getName() {
        return name;
    }

    /**
     * set 设置昵称
     *
     * @param name 昵称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get 获取年龄
     *
     * @return 年龄
     */
    public int getAge() {
        return age;
    }

    /**
     * set 设置年龄
     *
     * @param age 年龄
     */
    public void setAge(int age) {
        this.age = age;
    }
}
