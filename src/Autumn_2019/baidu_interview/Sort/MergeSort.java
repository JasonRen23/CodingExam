package Autumn_2019.baidu_interview.Sort;

import java.util.Arrays;

/**
 * @author : JasonRen
 * @date : 2018/08/16
 * @email : zhicheng_ren@163.com
 */
public class MergeSort<T extends Comparable<T>> extends Sort<T> {
    protected T[] aux;
    public void merge(T[] nums, int l, int m, int h) {
        int i = l, j = m + 1;
        for (int k = l; k <= h; k++) {
            aux[k] = nums[k];
        }

        for (int k = l; k <= h; k++) {
            if (l > m) {
                nums[k] = aux[j++];
            } else if (j > h) {
                nums[k] = aux[i++];
            } else if (aux[i].compareTo(aux[j]) <= 0) {
                nums[k] = aux[i++];
            } else {
                nums[k] = aux[j++];
            }


        }

    }

//    @Override
//    public void sort(T[] nums) {
//        aux = (T[]) new Comparable[nums.length];
//        sort(nums, 0, nums.length - 1);
//    }
//
//    public void sort(T[] nums, int l, int h) {
//        if (h <= l) {
//            return;
//        }
//        int mid = l + (h - l) / 2;
//        sort(nums, l, mid);
//        sort(nums, mid + 1, h);
//        if(nums[mid].compareTo(nums[mid + 1]) <= 0){
//            return;
//        }
//        merge(nums, l, mid, h);
//    }


    @Override
    public void sort(T[] nums) {
        int N = nums.length;
        aux = (T[]) new Comparable[N];

        for (int sz = 1; sz < N; sz += sz) {
            for (int lo = 0; lo < N - sz; lo += sz + sz) {
                merge(nums, lo, lo + sz - 1, Math.min(lo + sz + sz - 1, N - 1));
            }

        }
    }

    public static void main(String[] args) {
        Integer[] a = {2,6,1,3,5,4};
        MergeSort<Integer> obj = new MergeSort<>();
        System.out.println(Arrays.toString(a));
        obj.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
