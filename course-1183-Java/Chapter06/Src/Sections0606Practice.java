/**
 * @author Jaime
 * @project_name learning-java
 */
public class Sections0606Practice {
    public static void main(String[] args) {
        // 定义一个整型数组，并赋初值
        int[] nums = new int[]{61, 23, 4, 74, 13, 148, 20};

        int max = nums[0];
        int min = nums[0];
        double sum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            max = ((max < nums[i]) ? nums[i] : max);
            min = ((min < nums[i]) ? min : nums[i]);
            sum += nums[i];
        }
        double avg = sum / nums.length;
        System.out.printf("数组中的最大值：%d\n数组中的最小值：%d\n数组中的平均值：%.1f", max, min, avg);

    }
}
