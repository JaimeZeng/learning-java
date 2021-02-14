package com.imooc.course1183.chapter06;

/**
 * @author Jaime
 * @project_name learning-java
 */
public class Sections0605PrintfArrayValue {
    public static void main(String[] args) {
        String[] hobbys = {"sports", "game", "movie"};
        System.out.println("循环输出数组中元素的值：");
        // for (int i = 0; i < hobbys.length; i++) {
        for (String hobby : hobbys) {
            System.out.println(hobby);
        }
    }
}
