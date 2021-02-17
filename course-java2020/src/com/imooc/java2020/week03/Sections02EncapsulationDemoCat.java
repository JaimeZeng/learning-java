package com.imooc.java2020.week03;

/**
 * 自定义类 Sections02EncapsulationDemoCat，类的封装
 *
 * @author Jaime
 * @project_name learning-java
 */
public class Sections02EncapsulationDemoCat {
    /**
     * 昵称 name、年龄age、体重weight、品种 species
     */
    private String name;
    private int age;
    private double weight;
    private String species;

    public Sections02EncapsulationDemoCat() {
    }

    public Sections02EncapsulationDemoCat(String name, int age, double weight, String species) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    @Override
    public String toString() {
        return "Sections02EncapsulationDemoCat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", species='" + species + '\'' +
                '}';
    }
}
