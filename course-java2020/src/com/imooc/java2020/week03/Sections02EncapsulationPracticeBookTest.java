package com.imooc.java2020.week03;

/**
 * 自定义类 Sections02EncapsulationPracticeBook 的测试类
 *
 * @author Jaime
 * @project_name learning-java
 */
public class Sections02EncapsulationPracticeBookTest {
    public static void main(String[] args) {
        Sections02EncapsulationPracticeBook book1, book2;
        book1 = new Sections02EncapsulationPracticeBook("红楼梦", "曹雪芹", "人民文学出版社", 9.9f);
        book2 = new Sections02EncapsulationPracticeBook("小李飞刀", "古龙", "中国长安出版社", 55.5f);
        System.out.println(book1.showInformation());
        System.out.println("=====================================");
        System.out.println(book2.showInformation());
    }
}
