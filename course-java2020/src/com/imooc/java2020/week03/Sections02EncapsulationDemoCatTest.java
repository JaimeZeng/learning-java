package com.imooc.java2020.week03;

/**
 * 自定义类 Sections02EncapsulationDemoCat 的测试类
 *
 * @author Jaime
 * @project_name learning-java
 */
public class Sections02EncapsulationDemoCatTest {
    public static void main(String[] args) {
        Sections02EncapsulationDemoCat one = new Sections02EncapsulationDemoCat();
        one.setName("huahua");
        one.setAge(10);
        one.setWeight(8.5);
        one.setSpecies("狸花猫");

        System.out.println("name = " + one.getName());
        System.out.println("age = " + one.getAge());
        System.out.println("weight = " + one.getWeight());
        System.out.println("species = " + one.getSpecies());
        System.out.println();
        System.out.println(one.toString());
    }
}
