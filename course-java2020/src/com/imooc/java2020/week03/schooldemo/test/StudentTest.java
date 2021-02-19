package com.imooc.java2020.week03.schooldemo.test;

import com.imooc.java2020.week03.schooldemo.model.Student;

/**
 * 学生类 Student 的测试类
 *
 * @author Jaime
 * @project_name learning-java
 */
public class StudentTest {
    public static void main(String[] args) {
        Student stu01, stu02, stu03;
        stu01 = new Student("张三", "S01", "男", 18);
        stu02 = new Student("李四", "S02", "女", 17);
        stu03 = new Student("王五", "S03", "男", 18);
        System.out.println(stu01.showStuInformation());
        System.out.println(stu02.showStuInformation());
        System.out.println(stu03.showStuInformation());

    }

}
