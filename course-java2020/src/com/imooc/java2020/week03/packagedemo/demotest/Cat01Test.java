package com.imooc.java2020.week03.packagedemo.demotest;

import com.imooc.java2020.week03.packagedemo.animal.Cat01;

/**
 * 宠物猫 Cat01 测试类
 *
 * @author Jaime
 * @project_name learning-java
 */
public class Cat01Test {
    public static void main(String[] args) {
        Cat01 one = new Cat01();
        one.setName("huahua");
        one.setAge(6);
        one.setWeight(8.88);
        one.setSpecies("英国短毛猫");
        //静态成员访问方式：1、对象.成员 2、类.成员
        Cat01.price = 2000; // 添加断点
        // one.price = 2000; // Warnings: 不应该通过类实例访问静态成员 com.imooc.java2020.week03.packagedemo.animal.Cat01.price

        Cat01 two = new Cat01();
        two.setName("fanfan");
        two.setAge(2);
        two.setWeight(9.87);
        two.setSpecies("中华田园猫");
        Cat01.price = 666; // 添加断点
        // two.price = 666; // Warnings: 不应该通过类实例访问静态成员 com.imooc.java2020.week03.packagedemo.animal.Cat01.price

        System.out.println(one.toString());
        System.out.println(two.toString());
        // one.eat(); // Warning: 不应该通过类实例访问静态成员 com.imooc.java2020.week03.packagedemo.animal.Cat01.eat()
        Cat01.eat();
        two.run();
    }
}
