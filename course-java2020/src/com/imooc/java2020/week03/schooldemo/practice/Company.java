package com.imooc.java2020.week03.schooldemo.practice;

/**
 * 公司类 Company
 *
 * @author Jaime
 * @project_name learning-java
 */
public class Company {
    /**
     * 公司名name、公司地址address
     */
    String name;
    String address;

    /**
     * 初始化全部属性
     *
     * @param name    公司名
     * @param address 公司地址
     */
    public Company(String name, String address) {
        this.name = name;
        this.address = address;
    }
}