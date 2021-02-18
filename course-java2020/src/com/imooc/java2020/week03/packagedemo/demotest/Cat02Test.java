package com.imooc.java2020.week03.packagedemo.demotest;

import com.imooc.java2020.week03.packagedemo.animal.Cat02;

/**
 * Cat02 测试类
 *
 * @author Jaime
 * @project_name learning-java
 */
public class Cat02Test {
    public static void main(String[] args) {
        System.out.println("====== Cat02 one ======");
        Cat02 one = new Cat02("huahua");
        one.run(one.getName(), Cat02.price);
        System.out.println("====== Cat02 two ======");
        Cat02 two = new Cat02("niuniu");
        Cat02.price = 1000;
        // two.eat(two);
        Cat02.eat(two);
    }
}
