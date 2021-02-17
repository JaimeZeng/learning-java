package com.imooc.java2020.week03;

/**
 * 自定义 Sections02EncapsulationPracticeBook 图书类实现图书信息设置。
 * <p>
 * 属性：书名name、作者author、出版社publisher、价格price
 * 方法：信息介绍
 * <p>
 * 要求：
 * 1. 设计构造函数实现属性赋值。
 * 2. 设置私有属性，get/set 方法实现对属性的访问。
 * 3. 限定图书价格必须大于 10，如果无效进行提示，并强行赋值为10。
 * 4. 限定作者、书名为只读属性。
 * 5. 信息介绍方法描述图书所有信息。
 *
 * @author Jaime
 * @project_name learning-java
 */
public class Sections02EncapsulationPracticeBook {
    /**
     * 书名name、作者author、出版社publisher、价格price
     */
    private String name;
    private String author;
    private String publisher;
    private float price;

    /**
     * 有参构造初始化图书信息
     *
     * @param name      图书书名
     * @param author    图书作者
     * @param publisher 图书出版社
     * @param price     图书价格
     */
    public Sections02EncapsulationPracticeBook(String name, String author, String publisher, float price) {
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.setPrice(price);
    }

    /**
     * get 获取图书书名
     *
     * @return 图书书名
     */
    public String getName() {
        return name;
    }

    /**
     * get 获取图书作者
     *
     * @return 图书作者
     */
    public String getAuthor() {
        return author;
    }

    /**
     * get 获取图书出版社
     *
     * @return 图书出版社
     */
    public String getPublisher() {
        return publisher;
    }

    /**
     * set 设置图书出版社
     *
     * @param publisher 图书出版社
     */
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    /**
     * get 获取图书价格
     *
     * @return 图书价格
     */
    public float getPrice() {
        return price;
    }

    /**
     * set 设置图书价格
     *
     * @param price 图书价格
     */
    public void setPrice(float price) {
        if (price > 10) {
            this.price = price;
        } else {
            System.out.println("图书价格最低 10 元");
            this.price = 10;
        }
    }

    /**
     * 信息介绍
     *
     * @return 图书所有信息
     */
    public String showInformation() {
        return "书名 :" + name +
                "\n作者 :" + author +
                "\n出版社 :" + publisher +
                "\n价格 :" + price + "元";
    }
}
