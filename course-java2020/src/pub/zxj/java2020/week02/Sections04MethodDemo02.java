package pub.zxj.java2020.week02;

/**
 * 数组作为方法参数
 * - `public void printArray(int[] arr){}`
 * - `public boolean search(int n,int[] arr){}`
 * - `public void bubbleSort(int[] intArray){}`
 *
 * @author Jaime
 * @project_name learning-java
 */
public class Sections04MethodDemo02 {

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
     * 查找数组中是否存在值为 n 的元素
     */
    public boolean searchValue(int n, int[] intArray) {
        boolean flag = false;
        for (int intNumber : intArray) {
            // flag = (intNumber == 100) ? true : false;
            if (intNumber == n) {
                flag = true;
                break;
            }
        }
        return flag;
    }

    /**
     * 对数组进行冒泡排序
     */
    public void bubbleSort(int[] intArray) {
        System.out.print("第 0 次排序后数组元素为：");
        printArray(intArray);

        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray.length - i - 1; j++) {
                if (intArray[j] > intArray[j + 1]) {
                    int temp = intArray[j];
                    intArray[j] = intArray[j + 1];
                    intArray[j + 1] = temp;
                }
            }
            System.out.printf("第 %d 次排序后数组元素为：", i);
            printArray(intArray);
            // for (int intNumber : intArray) {
            //     System.out.print(intNumber + " ");
            // }
            // System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] intArray = {66, 69, 56, 2, 35, 15, 100, 38, 95, 1};
        Sections04MethodDemo02 myMethodDemo = new Sections04MethodDemo02();
        System.out.print("数组中元素为：");
        myMethodDemo.printArray(intArray);
        System.out.println();

        myMethodDemo.bubbleSort(intArray);
        System.out.println();

        System.out.println("在数组中查找是否存在值为 100 的元素，结果：" +
                (myMethodDemo.searchValue(100, intArray) ? "找到了！" : "未找到！"));
    }
}
