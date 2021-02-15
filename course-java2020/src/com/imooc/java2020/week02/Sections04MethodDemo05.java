package com.imooc.java2020.week02;

/**
 * 可变参数列表
 *
 * @author Jaime
 * @project_name learning-java
 */
public class Sections04MethodDemo05 {
    /**
     * 可变参数列表求和
     *
     * @param n 可变参数列表
     */
    public void getSum(int... n) {
        int sum = 0;
        for (int number : n) {
            sum += number;
            System.out.print(" + " + number);
        }
        System.out.print(" = " + sum);
    }

    /**
     * 在可变参数列表中查找 number 是否存在
     *
     * @param number 查找数值
     * @param n      可变参数列表
     */
    public void searchNumber(int number, int... n) {
        boolean flag = false;
        for (int a : n) {
            if (a == number) {
                flag = true;
                break;
            }
        }
        System.out.print((flag) ? "Found！" : "Not Found!");
    }


    /**
     * 重载。求 2 数之和，得出结论：可变参数列表所在的方法是最后执行的。
     *
     * @param a 整数 a
     * @param b 整数 b
     */
    public void getSum(int a, int b) {
        System.out.printf("%d + %d = %d", a, b, a + b);
    }

    public static void main(String[] args) {

        Sections04MethodDemo05 testMethod = new Sections04MethodDemo05();
        testMethod.getSum(10, 20, 20);
        System.out.println();

        testMethod.getSum(22, 33, 44, 55, 66);
        System.out.println();

        testMethod.searchNumber(10, 20, 30, 40, 50, 60, 10);
        System.out.println();

        int[] intArray = {20, 30, 40, 50, 60, 10};
        testMethod.searchNumber(10, intArray);
        System.out.println();

        /*
         *
         * 可变参数列表作为方法参数的重载问题(查看先调用哪一个)
         *
         * public void getSum(int... n) 返回 + a + b = (a+b)
         * public void getSum(int a, int b) 返回 a + b = (a+b)
         */
        testMethod.getSum(10, 20);

    }

}
