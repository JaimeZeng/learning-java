package com.imooc.java2020.week02;

/**
 * @author Jaime
 * @project_name learning-java
 * <p>
 * 冒泡排序
 */
public class Sections02BubbleSort {
    public static void main(String[] args) {
        int[] intArray = {34, 53, 56, 17, 89, 2, 23, 66, 88};
        // 增强型循环遍历数组
        // System.out.print("排序前数组元素为：");
        System.out.print("第 0 次排序后数组元素为：");
        for (int intNumber : intArray) {
            System.out.print(intNumber + " ");
        }
        System.out.println();

        int temp = 0;
        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray.length - i - 1; j++) {
                if (intArray[j] > intArray[j + 1]) {
                    temp = intArray[j];
                    intArray[j] = intArray[j + 1];
                    intArray[j + 1] = temp;
                }
            }
            System.out.print("第 " + (i + 1) + " 次排序后数组元素为：");
            for (int intNumber : intArray) {
                System.out.print(intNumber + " ");
            }
            System.out.println();
        }
    }
}
