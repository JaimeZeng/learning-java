package com.imooc.java2020.week02;

import java.util.Scanner;

/**
 * 需求: 定义一个类，对数组中的数据进行管理。
 * 方法:
 * - 插入数据: `public int[] insertData(){}` (少接收一个数据，为在指定位置处插入数据做准备)
 * - 显示所有数据: `public void showData(int[] a, int length){}`
 * - 在指定位置处插入数据: `public void insertAtArray(int[] a, int n, int k){}`
 * - 查询能被 3 整除的数据: `public void diyThree(int[] a){}`
 * - 提示信息: `public void promptMessage(){}`
 *
 * @author Jaime
 * @project_name learning-java
 */
public class Sections05DataManage {

    /**
     * 从键盘接收数据存放到数组中，少接收一个数据，为在指定位置处插入数据做准备
     *
     * @return 存放接收到数据的数组
     */
    public int[] insertData() {
        int[] intArray = new int[10];
        Scanner sc = new Scanner(System.in);

        // int i = 0;
        // for (int number : intArray) {
        //     System.out.printf("请输入第 %2d 个数据：", (++i));
        //     number = sc.nextInt();
        // }
        for (int i = 0; i < intArray.length - 1; i++) {
            System.out.printf("请输入第 %2d 个数据：", (i + 1));
            try {
                intArray[i] = sc.nextInt();
            } catch (java.util.InputMismatchException e) {
                System.out.println("格式错误，请输入整数类型数据！");
                sc.next();
                --i;
            }
        }
        return intArray;
    }

    /**
     * 显示数组元素的内容
     *
     * @param intArray 数组
     * @param length   数组长度
     */
    public void showData(int[] intArray, int length) {
        for (int i = 0; i < length; i++) {
            System.out.print(intArray[i] + " ");
        }
        System.out.println();
    }

    /**
     * 在数组的指定位置处插入数据
     *
     * @param intArray 数组
     * @param n        插入的数据
     * @param k        数据插入的位置
     */
    public void insertAtArray(int[] intArray, int n, int k) {
        if (intArray.length - k >= 0) {
            System.arraycopy(intArray, k - 1, intArray, k, intArray.length - k);
        }
        intArray[k - 1] = n;
    }

    /**
     * 输出数组中能被 3 整除的数据
     *
     * @param intArray 数组
     */
    public void diyThree(int[] intArray) {
        int count = 0;
        StringBuilder outPut = new StringBuilder();
        for (int number : intArray) {
            if (number % 3 == 0) {
                count++;
                outPut.append(number).append(" ");
            }
        }
        if (count == 0) {
            System.out.println("数组中没有能被 3 整除的元素！");
        } else {
            System.out.println("数组中能被 3 整除的元素有：" + outPut);
        }

    }

    /**
     * 提示信息
     */
    public void promptMessage() {
        System.out.println("**********************************");
        System.out.println("* 1. 插入数据（初始化数组）");
        System.out.println("* 2. 显示所有数据（打印数组）");
        System.out.println("* 3. 在指定位置处插入数据");
        System.out.println("* 4. 查询能被 3 整除的数据");
        System.out.println("* 0. 退出程序");
        System.out.println("**********************************");
    }

    public static void main(String[] args) {
        Sections05DataManage dataManage = new Sections05DataManage();
        Scanner sc = new Scanner(System.in);
        int[] intArray = null;
        label:
        while (true) {
            dataManage.promptMessage();
            System.out.print("请输入对应操作的数字进行操作(0-4)：");
            int choice;
            try {
                choice = sc.nextInt();
            } catch (java.util.InputMismatchException e) {
                System.out.println("格式错误，请按照提示输入！");
                sc.next();
                continue;
            }

            switch (choice) {
                case 0:
                    System.out.println("即将退出程序...");
                    break label;
                case 1:
                    // System.out.println("插入数据（初始化数组）");
                    intArray = dataManage.insertData();
                    System.out.print("数组中所有元素为：");
                    dataManage.showData(intArray, intArray.length - 1);
                    break;
                case 2:
                    // System.out.println("显示所有数据（打印数组）");
                    if (intArray == null) {
                        System.out.println("还没有在数组中插入数据，未初始化数组，请重新选择！");
                    } else {
                        System.out.print("数组中所有元素为：");
                        dataManage.showData(intArray, (intArray[intArray.length - 1] == 0) ? intArray.length - 1 : intArray.length);
                    }
                    break;
                case 3:
                    // System.out.println("在指定位置处插入数据");
                    if (intArray == null) {
                        System.out.println("还没有在数组中插入数据，未初始化数组，请重新选择！");
                    } else {
                        System.out.print("请输入要插入的数据(整数类型)：");
                        int number;
                        int index;
                        try {
                            number = sc.nextInt();
                            System.out.print("请输入要插入数据的位置(1-10)：");
                            index = sc.nextInt();
                            if (index > intArray.length || index <= 0) {
                                System.out.println("格式错误，请按照提示输入！");
                                break;
                            }
                        } catch (java.util.InputMismatchException e) {
                            System.out.println("格式错误，请按照提示输入！");
                            sc.next();
                            break;
                        }
                        dataManage.insertAtArray(intArray, number, index);
                        dataManage.showData(intArray, intArray.length);
                    }
                    break;
                case 4:
                    // System.out.println("查询能被 3 整除的数据");
                    if (intArray == null) {
                        System.out.println("还没有在数组中插入数据，未初始化数组，请重新选择！");
                    } else {
                        dataManage.diyThree(intArray);
                    }
                    break;
                default:
            }
        }
    }
}
