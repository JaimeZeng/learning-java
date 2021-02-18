package com.imooc.java2020.week03.classdemo;

/**
 * Person 测试类
 *
 * @author Jaime
 * @project_name learning-java
 */
public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "李明";
        person.age = 10;
        person.grade = "小学五年级";

        person.student();
        char studentSex = '男';
        person.sex(studentSex);
        person.myself();
    }
}
