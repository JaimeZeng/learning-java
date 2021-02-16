package com.imooc.java2020.week03;

/**
 * 自定义类 Sections01ClassThisCat01 的测试类
 *
 * @author Jaime
 * @project_name learning-java
 */
public class Sections01ClassThisCat01Test {
    public static void main(String[] args) {
        Sections01ClassThisCat01 one = new Sections01ClassThisCat01();
        int mh = 1;

        System.out.println("---------- 没有 this ----------");
        one.run1(mh);
        System.out.printf("小猫已经 %d 个月大了，跑的很欢快！\n", one.month);
        one.eat1();

        System.out.println("---------- 有 this ----------");
        one.run(mh);
        System.out.printf("小猫已经 %d 个月大了，跑的很欢快！\n", one.month);
        one.eat();
    }
}
