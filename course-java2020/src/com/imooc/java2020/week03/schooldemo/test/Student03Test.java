package com.imooc.java2020.week03.schooldemo.test;

import com.imooc.java2020.week03.schooldemo.model.Student03;
import com.imooc.java2020.week03.schooldemo.model.Subject;


/**
 * 学生类 Student03 的测试类
 *
 * @author Jaime
 * @project_name learning-java
 */
public class Student03Test {
    public static void main(String[] args) {
        Subject sub;
        sub = new Subject("计算机科学与技术", "J0001", 4);
        System.out.println(sub.showSubInformation(sub));
        System.out.println();
        Student03 stu01, stu02, stu03;
        stu01 = new Student03("张三", "S01", "男", 18, sub);
        stu02 = new Student03("李四", "S02", "女", 17, sub);
        stu03 = new Student03("王五", "S03", "男", 18, sub);
        System.out.println(stu01.showStuInformation(stu01));
        System.out.println();
        System.out.println(stu02.showStuInformation(stu02));
        System.out.println();
        System.out.println(stu03.showStuInformation(stu03));
        System.out.println();
    }
}