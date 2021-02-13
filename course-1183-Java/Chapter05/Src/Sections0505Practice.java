import java.util.Scanner;

/**
 * @author Jaime
 * @project_name learning-java
 */
public class Sections0505Practice {
    public static void main(String[] args) {
        // 有四个班级 CLassA - ClassC，每个班各有 4 名学生
        // 从控制台接收学生成绩信息，然后计算每个班学生平均成绩

        int classNum = 3;
        int stuNum = 4;

        for (int i = 1; i <= classNum; i++) {
            System.out.printf("--- 第 %d 个班级成绩信息 --- \n", i);
            int sumScore = 0;

            for (int j = 1; j <= stuNum; j++) {
                System.out.printf("\r 请输入第 %d 个学生的成绩信息：", j);
                double score = new Scanner(System.in).nextDouble();
                sumScore += score;
            }

            System.out.printf("--- 第 %d 个班级平均成绩为 %,.2f --- \n\n", i, (double) sumScore / stuNum);
        }
    }
}

/* Output:
--- 第 1 个班级成绩信息 ---
 请输入第 1 个学生的成绩信息：96.5
 请输入第 2 个学生的成绩信息：95.5
 请输入第 3 个学生的成绩信息：98.5
 请输入第 4 个学生的成绩信息：99.5
--- 第 1 个班级平均成绩为 97.00 ---

--- 第 2 个班级成绩信息 ---
 请输入第 1 个学生的成绩信息：98
 请输入第 2 个学生的成绩信息：97
 请输入第 3 个学生的成绩信息：96
 请输入第 4 个学生的成绩信息：95
--- 第 2 个班级平均成绩为 96.50 ---

--- 第 3 个班级成绩信息 ---
 请输入第 1 个学生的成绩信息：36.5
 请输入第 2 个学生的成绩信息：69.5
 请输入第 3 个学生的成绩信息：66
 请输入第 4 个学生的成绩信息：99.5
--- 第 3 个班级平均成绩为 67.50 --- */
