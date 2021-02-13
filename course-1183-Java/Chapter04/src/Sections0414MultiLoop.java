/**
 * @author Jaime
 * @project_name learning-java
 */
public class Sections0414MultiLoop {
    public static void main(String[] args) {
        // 使用 * 打印直角三角形
        System.out.println("打印直角三角形");

        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
