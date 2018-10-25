package Autumn_2019.bytedance_interview;

/**
 * 数组中的最大连续子序列和
 * @author JasonRen
 * @since 2018/10/26 12:56 AM
 */
public class Main3 {
    public static void main(String[] args) {
        int[] a = { 1, -3, 7, 8, -4, 12, -10, 6 };
        System.out.println(maxSubSum(a));
    }
    public static int maxSubSum(int[] nums) {
        int maxSum = 0;
        int tempSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (tempSum > 0)
                tempSum += nums[i];
            else
                tempSum = nums[i];
            if (tempSum > maxSum) {
                maxSum = tempSum;
            }
        }
        return maxSum;
    }
}
