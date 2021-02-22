package pub.zxj.java2020.week02;

/**
 * @author Jaime
 * @project_name learning-java
 * <p>
 * 一维数组练习
 */
public class Sections02ArrayDemo {
    public static void main(String[] args) {
        // 声明数组并初始化
        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // 遍历数组
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }
        System.out.println();

        // 增强型循环遍历数组
        for (int j : intArray) {
            System.out.print(j + " ");
        }
        System.out.println();

        // 查看数组元素
        System.out.println("数组中第一个元素为：" + intArray[0]);
        System.out.println("数组中最后一个元素为：" + intArray[9]);
        System.out.println("数组长度为：" + intArray.length);
        System.out.println("数组中最后一个元素为：" + intArray[intArray.length - 1]);
        System.out.println();


        //循环为数组赋值
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = i + 11;
        }
        System.out.print("重新赋值后的数组元素为：");
        for (int j : intArray) {
            System.out.print(j + " ");
        }
        System.out.println();

    }
}
