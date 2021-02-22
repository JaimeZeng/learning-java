package pub.zxj.java2020.week02;

/**
 * @author Jaime
 * @project_name learning-java
 * <p>
 * 定义一个字符数组并初始化，统计字符 a 或 A 出现的次数。
 */
public class Sections02ArrayPractice {
    public static void main(String[] args) {
        char[] charArray = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'a', 'A', 'a'};
        int count = 0;
        System.out.print("字符串数组为：");
        for (char c : charArray) {
            System.out.print(c + " ");
        }
        System.out.println();

        for (char c : charArray) {
            count = (c == 'a' || c == 'A') ? ++count : count;
        }
        System.out.println("字符 a 或 A 出现的次数: " + count);
    }
}
