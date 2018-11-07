package Autumn_2019.bytedance_interview;

import java.util.HashMap;
import java.util.Map;

/**
 * 数组的度（LeetCode）
 * @author JasonRen
 * @since 2018/11/7 9:12 PM
 */
public class Main7 {
    public static void main(String[] args) {
        //示例1
        int[] nums1 = {1, 2, 2, 3, 1};
        System.out.println(findShortestSubArray(nums1));

        //示例2
        int[] nums2 = {1,2,2,3,1,4,2};
        System.out.println(findShortestSubArray(nums2));
    }
    public static int findShortestSubArray(int[] nums) {
        int n = nums.length, res = Integer.MAX_VALUE, degree = 0;
        Map<Integer, Integer> countMap = new HashMap<>(), startIndex = new HashMap<>();
        for (int i = 0; i < n; i++) {
            countMap.put(nums[i], countMap.getOrDefault(nums[i],0) + 1);
            if (!startIndex.containsKey(nums[i])) startIndex.put(nums[i], i);
            if (countMap.get(nums[i]) == degree) {
                res = Math.min(res, i - startIndex.get(nums[i]) + 1);
            } else if (countMap.get(nums[i]) > degree) {
                res = i - startIndex.get(nums[i]) + 1;
                degree = countMap.get(nums[i]);
            }
        }
        return res;
    }
}
