package com.imooc.java2020.week03.classdemo;

/**
 * Cat 测试类
 *
 * @author Jaime
 * @project_name learning-java
 */
public class CatTest {

    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println("--------- 小猫属性 ---------");
        System.out.println("昵称: " + cat.name);
        System.out.println("年龄: " + cat.age);
        System.out.println("体重: " + cat.weight);
        System.out.println("品种: " + cat.species);
        System.out.println();
        System.out.println("--------- 小猫方法 ---------");
        cat.eat();
        cat.run();

        cat.name = "huahua";
        cat.age = 2;
        cat.weight = 5.3;
        cat.species = "英国短毛猫";

        System.out.println();
        System.out.println("--------- huahua 小猫属性 ---------");
        System.out.println("昵称: " + cat.name);
        System.out.println("年龄: " + cat.age);
        System.out.println("体重: " + cat.weight);
        System.out.println("品种: " + cat.species);
        System.out.println();
        System.out.println("--------- huahua 小猫方法 ---------");
        cat.eat(cat.name);
        cat.run(cat.name);
    }
}
