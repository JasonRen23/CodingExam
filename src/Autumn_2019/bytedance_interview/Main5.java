package Autumn_2019.bytedance_interview;

/**
 * 寻找有序旋转数组的最小值
 * @author JasonRen
 * @since 2018/10/26 10:09 PM
 */
public class Main5 {
    public static void main(String[] args) {
        // 典型输入，单调升序的数组的一个旋转
        int[] array1 = {3, 4, 5, 1, 2};
        System.out.println(findRotateMin(array1));
        // 有重复数字，并且重复的数字刚好的最小的数字
        int[] array2 = {3, 4, 5, 1, 1, 2};
        System.out.println(findRotateMin(array2));
        // 有重复数字，但重复的数字不是第一个数字和最后一个数字
        int[] array3 = {3, 4, 5, 1, 2, 2};
        System.out.println(findRotateMin(array3));
        // 有重复的数字，并且重复的数字刚好是第一个数字和最后一个数字
        int[] array4 = {1, 0, 1, 1, 1};
        System.out.println(findRotateMin(array4));
        // 单调升序数组，旋转0个元素，也就是单调升序数组本身
        int[] array5 = {1, 2, 3, 4, 5};
        System.out.println(findRotateMin(array5));
        // 数组中只有一个数字
        int[] array6 = {2};
        System.out.println(findRotateMin(array6));
        // 数组中数字都相同
        int[] array7 = {1, 1, 1, 1, 1, 1, 1};
        System.out.println(findRotateMin(array7));
        System.out.println(findRotateMin(array6));
        // 输入NULL
        // System.out.println(findRotateMin(null));
    }
    public static int findRotateMin(int[] nums) {
        if(nums == null || nums.length == 0) {
            throw new RuntimeException("Invalid input.");
        }
        int lo = 0;
        int hi = nums.length - 1;
        int mid = lo;
        while (nums[lo] >= nums[hi]) {
            if (hi - lo == 1) {
                return nums[hi];
            }
            mid = lo + (hi - lo)  / 2;
            if (nums[mid] == nums[lo] && nums[hi] == nums[mid]) {
                return findMinInorder(nums, lo, hi);
            }
            if (nums[mid] >= nums[lo]){
                lo = mid;
            }
            else if (nums[mid] <= nums[hi]){
                hi = mid;
            }
        }
        return nums[mid];
    }
    public static int findMinInorder(int[] nums, int lo, int hi) {
        int ret = nums[lo];
        for (int i = lo; i <= hi; i++) {
            if (ret > nums[i])
                ret = nums[i];
        }
        return ret;
    }
}
