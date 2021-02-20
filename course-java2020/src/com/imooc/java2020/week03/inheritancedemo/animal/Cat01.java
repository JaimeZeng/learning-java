package com.imooc.java2020.week03.inheritancedemo.animal;

/**
 * 小猫类 Cat
 *
 * @author Jaime
 * @project_name learning-java
 */
public class Cat01 extends Animal {
    /**
     * 体重 weight
     */
    private double weight;

    public Cat01() {
    }

    public Cat01(String name, int month, String species, double weight) {
        super(name, month, species);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void run() {
        System.out.println(this.getSpecies() + " species " + this.getName() + " is running~");
    }

    // // 重写 Animal 的 eat()
    // public void eat() {
    //     System.out.println(this.getName() + " 最近食欲不是很好，只吃了一点食物。");
    // }
}
