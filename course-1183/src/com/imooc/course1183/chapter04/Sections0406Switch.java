package com.imooc.course1183.chapter04;

/**
 * @author Jaime
 * @project_name learning-java
 */
public class Sections0406Switch {
    public static void main(String[] args) {
        char today = '日';
        switch (today) {
            case '一':
            case '三':
            case '五':
                System.out.println("吃包子");
                break;
            case '二':
            case '四':
            case '六':
                System.out.println("吃油条");
                break;
            // case '日':
            default:
                System.out.println("吃主席套餐");

        }
    }
}
