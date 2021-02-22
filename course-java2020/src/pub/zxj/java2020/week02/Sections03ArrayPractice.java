package pub.zxj.java2020.week02;

import java.util.Scanner;

/**
 * @author Jaime
 * @project_name learning-java
 * <p>
 * 在一个二维数组中存放三名学生的语文和数学成绩
 * 要求：
 * 1. 成绩从键盘输入中读取
 * 2. 计算语文和数学的总成绩及平均分
 */
public class Sections03ArrayPractice {
    public static void main(String[] args) {
        int[][] scoreArray = new int[3][2];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < scoreArray.length; i++) {
            for (int j = 0; j < scoreArray[i].length; j++) {
                if (j == 0) {
                    System.out.printf("请输入第 %d 个学生的语文成绩：\n", (i + 1));

                } else {
                    System.out.printf("请输入第 %d 个学生的数学成绩：\n", (i + 1));
                }
                scoreArray[i][j] = scan.nextInt();
            }
        }

        // 遍历数组
        for (int[] scores : scoreArray) {
            for (int score : scores) {
                System.out.print(score + " ");
            }
            System.out.println(scores.length);
        }

        int mathSumScore = 0;
        int chineseSumScore = 0;
        for (int i = 0; i < scoreArray.length; i++) {
            for (int j = 0; j < scoreArray[i].length; j++) {
                chineseSumScore = (j == 0) ? (chineseSumScore + scoreArray[i][j]) : chineseSumScore;
                mathSumScore = (j == 0) ? mathSumScore : +(mathSumScore + scoreArray[i][j]);
            }
        }
        System.out.println("语文的总成绩为：" + chineseSumScore);
        System.out.println("语文的平均分为：" + (int) chineseSumScore / scoreArray.length);
        System.out.println("数学的总成绩为：" + mathSumScore);
        System.out.println("数学的平均分为：" + (int) mathSumScore / scoreArray.length);
    }
}
