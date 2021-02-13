/**
 * @author Jaime
 * @project_name learning-java
 */
public class Sections0411Break {
    public static void main(String[] args) {
        // 循环将 1 到 10 之间的整数相加，如果累加值大于 20，则跳出循环，并输出当前的累加值。
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
            if (sum > 20) {
                System.out.println("当前的累加值为：" + sum);
                break;
            }
        }
    }
}
