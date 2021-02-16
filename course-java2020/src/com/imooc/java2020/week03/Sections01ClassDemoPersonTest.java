package com.imooc.java2020.week03;

/**
 * SectionsClassDemoPerson 测试类
 *
 * @author Jaime
 * @project_name learning-java
 */
public class Sections01ClassDemoPersonTest {
    public static void main(String[] args) {
        Sections01ClassDemoPerson person = new Sections01ClassDemoPerson();
        person.name = "李明";
        person.age = 10;
        person.grade = "小学五年级";

        person.student();
        char studentSex = '男';
        person.sex(studentSex);
        person.myself();
    }
}
