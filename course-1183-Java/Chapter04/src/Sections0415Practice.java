/**
 * @author Jaime
 * @project_name learning-java
 */
public class Sections0415Practice {
    public static void main(String[] args) {
        // 给定一个小于 10 位的数，判断它是几位数。
        // 例如：输入 999，则输出 “它是个 3 位的数！”
        int num = 999;
        int count = 0;
        while (num != 0) {
            count++;
            num /= 10;
        }
        System.out.println("它是个 " + count + " 位的数！");
    }
}
