package com.imooc.java2020.week03;

/**
 * Sections01ClassDemoCat01 测试类
 *
 * @author Jaime
 * @project_name learning-java
 */
public class Sections01ClassDemoCatTest01 {
    public static void main(String[] args) {
        Sections01ClassDemoCat01 cat1 = new Sections01ClassDemoCat01();     //添加断点调试
        cat1.run();

        Sections01ClassDemoCat01 cat2 = new Sections01ClassDemoCat01("huahua", 2, 9, "英国短毛猫");  //添加断点调试
        System.out.println("--------- huahua 小猫属性 ---------");
        System.out.println("昵称: " + cat2.name);
        System.out.println("年龄: " + cat2.age);
        System.out.println("体重: " + cat2.weight);
        System.out.println("品种: " + cat2.species);
        System.out.println();

        cat2.eat(cat2.name);
    }
}
