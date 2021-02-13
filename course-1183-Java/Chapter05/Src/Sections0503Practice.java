import java.util.Scanner;

/**
 * @author Jaime
 * @project_name learning-java
 */
public class Sections0503Practice {
    public static void main(String[] args) {
        // 为用户成绩加分，直到分数大于等于 60 为止，输出加分前和加分后的成绩，并统计加分的次数
        System.out.print("请输入用户成绩：");
        int score = new Scanner(System.in).nextInt();
        int count = 0;
        int passScore = 60;
        System.out.println("加分前成绩：" + score);
        while (score < passScore) {
            count++;
            score++;
        }
        System.out.printf("加分后成绩：%d\n共加了 %d 次！", score, count);

    }

}
