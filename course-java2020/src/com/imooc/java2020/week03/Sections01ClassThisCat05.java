package com.imooc.java2020.week03;

/**
 * 自定义类 Sections01ClassThisCat05，在成员方法中通过 this 返回类对象。
 *
 * @author Jaime
 * @project_name learning-java
 */
public class Sections01ClassThisCat05 {
    String name;

    public Sections01ClassThisCat05() {
    }

    public Sections01ClassThisCat05(String name) {
        this.name = name;
    }

    public Sections01ClassThisCat05 call(String name) {
        this.name = name;
        //通过 this 返回类对象
        return this;
    }
}
