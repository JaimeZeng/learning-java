/**
 * @author Jaime
 * @project_name learning-java
 */
public class Sections0401If {
    public static void main(String[] args) {
        int one = 20;
        /*String mark = (one % 2 == 0) ? "one 是偶数" : "one 是奇数";
        System.out.println(mark);*/
        if (one % 2 == 0) {
            System.out.println("one 是偶数");
        } else {
            System.out.println("one 是奇数");
        }
    }
}
