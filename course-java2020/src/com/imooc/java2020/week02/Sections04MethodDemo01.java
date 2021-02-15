package com.imooc.java2020.week02;

/**
 * 根据方法是否带参数、是否返回值，可分为四类：
 * - 无参无返回值方法 `public void printStar()`
 * - 无参带返回值方法 `public int gatRectangleArea()`
 * - 带参无返回值方法 `public void getMaxNumber(double a, double b)`
 * - 带参带返回值方法 `public int getFactorial(int n)`
 *
 * @author Jaime
 * @project_name learning-java
 */
public class Sections04MethodDemo01 {

    /**
     * 无参无返回值方法: 打印指定内容
     */
    public void printStar() {
        System.out.println("***************************");
        System.out.println("欢迎来到 Java 的世界！");
        System.out.println("***************************");
    }

    /**
     * 无参有返回值方法: 获取长方形面积
     */
    public int gatRectangleArea() {
        int length = 10;
        int width = 20;
        return length * width;
    }

    /**
     * 带参无返回值方法: 打印两个数中的最大值
     */
    public void getMaxNumber(double a, double b) {
        System.out.printf("%.2f 和 %.2f 中的最大值为：%.2f\n", a, b, Math.max(a, b));
    }

    /**
     * 带参有返回值方法: 获取 n! 的值
     */
    public int getFactorial(int n) {
        int fac = 1;
        for (int i = 1; i <= n; i++) {
            fac *= i;
        }
        return fac;
    }

    public static void main(String[] args) {
        Sections04MethodDemo01 myMethodDemo = new Sections04MethodDemo01();
        // 调用无参无返回值方法
        myMethodDemo.printStar();
        System.out.println();

        // 调用无参有返回值方法
        System.out.println("10 * 20 的长方形面积为：" + myMethodDemo.gatRectangleArea());
        System.out.println();

        // 调用带参无返回值方法
        myMethodDemo.getMaxNumber(20.15, 96.86);
        System.out.println();

        // 调用带参有返回值方法

        // 求 1! + 2! + 3! + 4!
        int sum = 0;
        int number = 4;
        for (int i = 1; i <= number; i++) {
            System.out.println(i + " 的阶乘为：" + myMethodDemo.getFactorial(i));
            sum += myMethodDemo.getFactorial(i);
        }
        System.out.println("1! + 2! + 3! + 4! = " + sum);
        System.out.println();
    }
}
