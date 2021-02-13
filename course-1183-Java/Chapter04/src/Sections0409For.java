/**
 * @author Jaime
 * @project_name learning-java
 */
public class Sections0409For {
    public static void main(String[] args) {
        /* 计算 1 到 100 之间不能被 3 整除的数之和 */
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += ((i % 3 != 0) ? i : 0);
        }
        System.out.println("1 到 100 之间不能被 3 整除的数之和为：" + sum);
    }
}
