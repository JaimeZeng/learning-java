/**
 * @author Jaime
 * @project_name learning-java
 */
public class Sections0501Practice {
    public static void main(String[] args) {
        // 为指定成绩加分，直到分数大于等于 60 为止，输出加分前和加分后的成绩，并统计加分的次数
        int score = 53;
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
