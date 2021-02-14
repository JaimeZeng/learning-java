package com.imooc.course1183.chapter04;

/**
 * @author Jaime
 * @project_name learning-java
 */
public class Sections0412Continue {
    public static void main(String[] args) {
        // 求 1 到 10 之间的所有偶数的和。
        int sum = 0;

        for (int i = 1; i <= 10; i++) {

            // sum += ((i % 2 == 0) ? i : 0);

            // 如果i为奇数,结束本次循环，进行下一次循环
            if (i % 2 == 1) {
                continue;
            }

            sum = sum + i;
        }

        System.out.print("1 到 10 之间的所有偶数的和为：" + sum);
    }
}
