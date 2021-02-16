package com.imooc.java2020.week03;

/**
 * 自定义一个 Person 类
 *
 * @author Jaime
 * @project_name learning-java
 */
public class Sections01ClassDemoPerson {
    /**
     * 名字 name、年龄 age、年级 grade
     */
    String name;
    int age;
    String grade;

    /**
     * student 方法
     */
    public void student() {
        System.out.println("我是一名学生！");
    }

    /**
     * sex 方法
     *
     * @param sex 性别
     */
    public void sex(char sex) {
        System.out.println("我是一名" + sex + "孩！");
    }

    /**
     * myself 方法
     */
    public void myself() {
        System.out.printf("我加%s,今年%d岁了,读%s了。", name, age, grade);
    }

}
