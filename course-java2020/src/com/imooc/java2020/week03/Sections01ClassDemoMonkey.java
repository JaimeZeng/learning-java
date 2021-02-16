package com.imooc.java2020.week03;

/**
 * 自定义猴子类 Sections01ClassDemoMonkey
 *
 * @author Jaime
 * @project_name learning-java
 */
public class Sections01ClassDemoMonkey {
    /**
     * 名称 name、特征 feature
     */
    String name;
    String feature;

    /**
     * 无参构造
     */
    public Sections01ClassDemoMonkey() {
        name = "长尾猴";
        feature = "尾巴长";
    }

    /**
     * 带参构造
     *
     * @param name    名称
     * @param feature 特征
     */
    public Sections01ClassDemoMonkey(String name, String feature) {
        this.name = name;
        this.feature = feature;
    }

    public void print(Sections01ClassDemoMonkey monkey) {
        System.out.println("名称：" + monkey.name);
        System.out.println("特征：" + monkey.feature);
    }
}

