import java.util.Scanner;

/**
 * @author Jaime
 * @project_name learning-java
 */
public class Sections0504DebugPractice {
    public static void main(String[] args) {
        // 计算 1 - n 之间能被 3 整除的数之和
        int sum = 0;
        System.out.print("Pls Input a num: ");
        int num = new Scanner(System.in).nextInt();
        int i = 1;
        while (i <= num) {
            sum += ((i % 3 == 0) ? i : 0);
            i++;
        }
        System.out.printf("3 + 6 + ... + %d = %d", num, sum);
    }
}
