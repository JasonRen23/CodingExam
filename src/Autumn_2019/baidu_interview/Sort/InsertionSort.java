package Autumn_2019.baidu_interview.Sort;

import java.util.Arrays;

/**
 * @author : JasonRen
 * @date : 2018/08/16
 * @email : zhicheng_ren@163.com
 */
public class InsertionSort<T extends Comparable<T>> extends Sort<T> {
    @Override
    public void sort(T[] nums) {
        int N = nums.length;
        for (int i = 1; i < N; i++) {
            for (int j = i; j > 0 && less(nums[j], nums[j - 1]); j--) {
                swap(nums, j, j - 1);
            }
        }
    }

    public static void sortQuick(int[] a) {
        int N = a.length;
        for (int i = 1; i < N; i++) {
            int tmp = a[i];
            int j;
            for (j = i; j > 0 && tmp < a[j - 1]; j--) {
                a[j] = a[j - 1];
            }
            a[j] = tmp;
        }
    }

    public static void main(String[] args) {
        Integer[] a = {2, 6, 1, 3, 5, 4};
        InsertionSort<Integer> obj = new InsertionSort<>();
        System.out.println(Arrays.toString(a));
        obj.sort(a);
        System.out.println(Arrays.toString(a));

        int[] b = {2, 6, 1, 3, 5, 4};
        System.out.println(Arrays.toString(b));
        sortQuick(b);
        System.out.println(Arrays.toString(b));


    }
}
