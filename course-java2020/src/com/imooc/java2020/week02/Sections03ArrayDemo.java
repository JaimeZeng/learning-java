package com.imooc.java2020.week02;

/**
 * @author Jaime
 * @project_name learning-java
 * <p>
 * 定义二维数组存储成绩：
 * 89 92 93
 * 85 90 96
 * 95 93 98
 */
public class Sections03ArrayDemo {
    public static void main(String[] args) {
        // int[][] scoreArray = new int[3][3];
        int[][] scoreArray = {{89, 92, 93}, {85, 90, 96}, {95, 93, 98}};
        System.out.printf("第一行元素为: %d %d %d, 第一行元素长度为：%d\n", scoreArray[0][0], scoreArray[0][1], scoreArray[0][2], scoreArray[0].length);
        System.out.printf("第二行元素为: %d %d %d, 第二行元素长度为：%d\n", scoreArray[1][0], scoreArray[1][1], scoreArray[1][2], scoreArray[1].length);
        System.out.printf("第三行元素为: %d %d %d, 第三行元素长度为：%d\n", scoreArray[2][0], scoreArray[2][1], scoreArray[2][2], scoreArray[2].length);

        for (int[] scores : scoreArray) {
            for (int score : scores) {
                System.out.print(score + " ");
            }
            System.out.println(scores.length);
        }
    }
}
