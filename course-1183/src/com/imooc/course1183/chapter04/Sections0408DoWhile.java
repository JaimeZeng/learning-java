package com.imooc.course1183.chapter04;

/**
 * @author Jaime
 * @project_name learning-java
 */
public class Sections0408DoWhile {
    public static void main(String[] args) {
        int sum = 0;
        int num = 2;
        do {
            sum += num;
            num += 2;
        } while (num <= 50);
        System.out.println("50 以内的偶数之和为：" + sum);

    }
}
