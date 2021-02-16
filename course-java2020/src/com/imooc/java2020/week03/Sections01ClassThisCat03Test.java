package com.imooc.java2020.week03;

/**
 * 自定义类 Sections01ClassThisCat03 的测试类
 *
 * @author Jaime
 * @project_name learning-java
 */
public class Sections01ClassThisCat03Test {
    public static void main(String[] args) {
        Sections01ClassThisCat03 one, two, three;

        System.out.println("--------- 调用无参构造 ---------");
        one = new Sections01ClassThisCat03();

        System.out.println("--------- 单参构造调用无参构造 ---------");
        two = new Sections01ClassThisCat03("huahua");

        System.out.println("--------- 双参构造调用单参构造 ---------");
        three = new Sections01ClassThisCat03("huahua", 2);
    }
}
