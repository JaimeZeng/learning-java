package com.imooc.java2020.week03.inheritancedemo.animal;

/**
 * 动物类 Animal
 *
 * @author Jaime
 * @project_name learning-java
 */
public class Animal {
    /**
     * 昵称name、月份month、品种species
     */
    private String name;
    private int month;
    private String species;

    public Animal() {
    }

    public Animal(String name, int month, String species) {
        this.name = name;
        this.month = month;
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void eat() {
        System.out.println(this.getName() + " is eating~");
    }
}
