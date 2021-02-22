package pub.zxj.java2020.week02;

/**
 * 参数的传递问题
 * - 普通变量参数在传递过程中，主方法的的参数值是不会改变的。
 * - 数组参数在传递过程中，主方法的的参数值会改变。
 *
 * @author Jaime
 * @project_name learning-java
 */
public class Sections04MethodDemo04 {
    /**
     * 交换两数数值
     */
    public void exchangeNumber(int num1, int num2) {
        System.out.printf("方法内交换前 num1 = %d, num2 = %d\n", num1, num2);
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.printf("方法内交换后 num1 = %d, num2 = %d\n", num1, num2);
    }

    /**
     * 打印数组元素
     */
    public void printArray(int[] intArray) {
        for (int intNumber : intArray) {
            System.out.print(intNumber + " ");
        }
        System.out.println();
    }

    /**
     * 改变数组中第一个元素的数值为 15
     */
    public void changeArray(int[] intArray) {
        System.out.print("方法内改变前数组内所有元素为：");
        printArray(intArray);
        intArray[0] = 15;
        System.out.print("方法内改变后数组内所有元素为：");
        printArray(intArray);
    }

    public static void main(String[] args) {
        Sections04MethodDemo04 testMethodDemo = new Sections04MethodDemo04();

        // 普通变量参数传递
        int num1 = 10, num2 = 20;
        System.out.printf("主方法中交换前 num1 = %d, num2 = %d\n", num1, num2);
        testMethodDemo.exchangeNumber(num1, num2);
        System.out.printf("主方法中交换后 num1 = %d, num2 = %d\n", num1, num2);
        System.out.println();

        // 函数参数传递
        int[] intArray = {10, 20, 30, 40, 50, 60};
        System.out.print("主函数内改变前数组内所有元素为：");
        testMethodDemo.printArray(intArray);
        testMethodDemo.changeArray(intArray);
        System.out.print("主函数内改变后数组内所有元素为：");
        testMethodDemo.printArray(intArray);
    }
}
