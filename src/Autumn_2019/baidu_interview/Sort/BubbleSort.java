package Autumn_2019.baidu_interview.Sort;

import java.util.Arrays;

/**
 * @author : JasonRen
 * @date : 2018/08/16
 * @email : zhicheng_ren@163.com
 */
public class BubbleSort<T extends Comparable<T>> extends Sort<T>{
    @Override
    public void sort(T[] nums) {
        int N = nums.length;
        boolean hasSorted = false;
        for (int i = N - 1; i > 0 && !hasSorted; i--) {
            hasSorted = true;
            for (int j = 0; j < i; j++) {
                if (less(nums[j + 1], nums[j])) {
                    hasSorted = false;
                    swap(nums, j, j + 1);
                }
            }
        }
    }

    public static void main(String[] args) {
        Integer[] a = {2,6,1,3,5,4};
        BubbleSort<Integer> obj = new BubbleSort<>();
        System.out.println(Arrays.toString(a));
        obj.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
