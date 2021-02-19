package com.imooc.java2020.week03.schooldemo.test;

import com.imooc.java2020.week03.schooldemo.model.Student01;

/**
 * 学生类 Student01 的测试类
 *
 * @author Jaime
 * @project_name learning-java
 */
public class Student01Test {
    public static void main(String[] args) {
        Student01 stu01, stu02, stu03;
        stu01 = new Student01("张三", "S01", "男", 18);
        stu02 = new Student01("李四", "S02", "女", 17);
        stu03 = new Student01("王五", "S03", "男", 18);
        System.out.println(stu01.showStuInformation("计算机科学与技术", 4));
        System.out.println(stu02.showStuInformation("计算机科学与技术", 4));
        System.out.println(stu03.showStuInformation("计算机科学与技术", 4));

    }

}
