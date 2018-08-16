package Autumn_2019.baidu_interview.Sort;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author : JasonRen
 * @date : 2018/08/16
 * @email : zhicheng_ren@163.com
 */
public class QuickSort<T extends Comparable<T>> extends Sort<T> {
    @Override
    public void sort(T[] nums) {
        sort(nums, 0, nums.length - 1);
    }

    private void sort(T[] nums, int l, int h) {
        if (h <= l) {
            return;
        }
        int j = partition(nums, l, h);
        sort(nums, l, j - 1);
        sort(nums, j + 1, h);
    }

    public void shuffle(T[] nums) {
        List<Comparable> list = Arrays.asList(nums);
        Collections.shuffle(list);
        list.toArray(nums);
    }

    private int partition(T[] nums, int l, int h) {
        int i = l, j = h + 1;
        T v = nums[l];
        while (true) {
            while (less(nums[++i], v) && i != h){}
            while (less(v, nums[--j]) && j != l){}
            if (i >= j){
                break;
            }
            swap(nums, i, j);
        }
        swap(nums, l, j);
        return j;
    }

    public static void main(String[] args) {
        Integer[] a = {2,6,1,3,5,4};
        QuickSort<Integer> obj = new QuickSort<>();
        System.out.println(Arrays.toString(a));
        obj.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
