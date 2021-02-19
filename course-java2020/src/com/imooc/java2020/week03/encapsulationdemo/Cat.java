package com.imooc.java2020.week03.encapsulationdemo;

/**
 * 自定义类 Cat，类的封装
 *
 * @author Jaime
 * @project_name learning-java
 */
public class Cat {
    /**
     * 昵称 name、年龄age、体重weight、品种 species
     */
    private String name;
    private int age;
    private double weight;
    private String species;

    /**
     * 无参构造
     */
    public Cat() {
    }

    /**
     * 有参构造
     *
     * @param name    昵称
     * @param age     年龄
     * @param weight  体重
     * @param species 品种
     */
    public Cat(String name, int age, double weight, String species) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.species = species;
    }

    /**
     * get 获取昵称
     *
     * @return 昵称
     */
    public String getName() {
        return name;
    }

    /**
     * set 设置昵称
     *
     * @param name 昵称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get 获取年龄
     *
     * @return 年龄
     */
    public int getAge() {
        return age;
    }

    /**
     * set 设置昵称
     *
     * @param age 年龄
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * get 获取体重
     *
     * @return 体重
     */
    public double getWeight() {
        return weight;
    }

    /**
     * set 设置体重
     *
     * @param weight 体重
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }

    /**
     * get 获取品种
     *
     * @return 品种
     */
    public String getSpecies() {
        return species;
    }

    /**
     * set 设置品种
     *
     * @param species 品种
     */
    public void setSpecies(String species) {
        this.species = species;
    }

    /**
     * 返回详细信息
     *
     * @return 详细信息
     */
    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", species='" + species + '\'' +
                '}';
    }
}
