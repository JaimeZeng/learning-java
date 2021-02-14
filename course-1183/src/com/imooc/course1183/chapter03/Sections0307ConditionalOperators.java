package com.imooc.course1183.chapter03;

/**
 * @author Jaime
 * @project_name learning-java
 */
public class Sections0307ConditionalOperators {
    public static void main(String[] args) {
        int score = 68;
        String mark = (score >= 60) ? "及格" : "不及格";
        System.out.println("考试成绩如何： " + mark);
    }
}
