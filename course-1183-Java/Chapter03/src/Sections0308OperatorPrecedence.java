/**
 * @author Jaime
 * @project_name learning-java
 */
public class Sections0308OperatorPrecedence {
    public static void main(String[] args) {
        int m = 5;
        int n = 7;
        int x = (m * 8 / (n + 2)) % m;
        System.out.println("m:" + m);
        System.out.println("m:" + n);
        System.out.println("x:" + x);
    }
}
