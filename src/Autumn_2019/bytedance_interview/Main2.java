package Autumn_2019.bytedance_interview;

/**
 * 给一个有序的数组（重复）和一个数target，找出数组中等于这个数的范围（第一个坐标和最后一个坐标）
 * @author JasonRen
 * @since 2018/10/25 12:35 AM
 */
public class Main2 {
    public static void main(String[] args) {
        int[] data = {2,3,3,3,4,5,7,9};
        System.out.println(binarySearchF(data, 3));
        System.out.println(binarySearchL(data, 3));
    }
    //找第一个坐标
    public static int binarySearchF(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        int start = 0, end = nums.length - 1;
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] >= target)
                end = mid;
            else
                start = mid;
        }
        if (nums[start] == target)
            return start;
        if (nums[end] == target)
            return end;
        return -1;
    }

    //找最后一个坐标
    public static int binarySearchL(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        int start = 0, end = nums.length - 1;
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] <= target)
                start = mid;
            else
                end = mid;
        }
        if (nums[end] == target)
            return end;
        if (nums[start] == target)
            return start;
        return -1;
    }
}
