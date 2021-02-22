package pub.zxj.java2020.week02;

/**
 * 方法重载
 * - 方法名相同，参数列表不同。
 *
 * @author Jaime
 * @project_name learning-java
 */
public class Sections04MethodDemo03 {

    /**
     * 求两个 int 型数值的和
     */
    public int getSum(int a, int b) {
        return a + b;
    }

    /**
     * 求两个 double 型数值的和
     */
    public double getSum(double a, double b) {
        return a + b;
    }

    /**
     * 求数组中所有元素的和
     */
    public int getSum(int[] intArray) {
        int sum = 0;
        for (int number : intArray) {
            sum += number;
        }
        return sum;
    }

    public static void main(String[] args) {
        Sections04MethodDemo03 testMethodDemo = new Sections04MethodDemo03();

        System.out.println("20 + 30 = " + testMethodDemo.getSum(20, 30));
        System.out.println();
        System.out.println("20.15 + 30.66 = " + testMethodDemo.getSum(20.15, 30.66));
        System.out.println();
        int[] intArray = {10, 20, 30, 40, 50};
        System.out.println("intArray数组中所有元素之和为：" + testMethodDemo.getSum(intArray));
    }
}
