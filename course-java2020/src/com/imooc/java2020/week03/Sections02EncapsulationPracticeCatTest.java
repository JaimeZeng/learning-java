package com.imooc.java2020.week03;

/**
 * 自定义 Sections02EncapsulationPracticeCat 类的测试类：宠物猫测试类
 *
 * @author Jaime
 * @project_name learning-java
 */
public class Sections02EncapsulationPracticeCatTest {
    public static void main(String[] args) {
        Sections02EncapsulationPracticeCat one, two;
        one = new Sections02EncapsulationPracticeCat("huahua", 3);
        two = new Sections02EncapsulationPracticeCat("fanfan", 6);
        Sections02EncapsulationPracticeCatManage manage = new Sections02EncapsulationPracticeCatManage();
        System.out.println("优胜者 name = " + manage.catMonthPk(one, two).getName() + ", age = " + manage.catMonthPk(one, two).getAge());
    }
}
