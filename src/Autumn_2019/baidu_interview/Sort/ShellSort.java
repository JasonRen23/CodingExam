package Autumn_2019.baidu_interview.Sort;

import java.util.Arrays;

/**
 * @author : JasonRen
 * @date : 2018/08/16
 * @email : zhicheng_ren@163.com
 */
public class ShellSort<T extends Comparable<T>> extends Sort<T> {
    @Override
    public void sort(T[] nums) {
        int N = nums.length;
        int h = 1;

        while (h < N / 3) {
            h = 3 * h + 1;
        }

        while (h >= 1) {
            for (int i = h; i < N; i++) {
                for (int j = i; j >= h && less(nums[j], nums[j - h]); j -= h) {
                    swap(nums, j, j - h);
                }
            }
            h = h / 3;
        }
    }

    public static void main(String[] args) {
        Integer[] a = {2, 6, 1, 3, 5, 4};
        ShellSort<Integer> obj = new ShellSort<>();
        System.out.println(Arrays.toString(a));
        obj.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
