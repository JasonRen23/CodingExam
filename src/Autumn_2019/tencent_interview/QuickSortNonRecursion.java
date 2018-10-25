package Autumn_2019.tencent_interview;

import java.util.Stack;

/**
 * @author JasonRen
 * @since 2018/10/19 10:26 PM
 */
public class QuickSortNonRecursion {
    public static void main(String[] args) {

    }
    public void quicksort(int[] arr) {
        if (arr == null || arr.length == 1) return;
        //存放开始与结束索引
        Stack<Integer> st = new Stack<>();
        //压栈
        st.push(0);
        st.push(arr.length - 1);
        //利用循环里实现
        while (!st.empty()) {

        }

    }
    //找到轴心，进行交换
    public int partition(int[] nums, int l, int h) {
        int i = l, j = h + 1;
        int v = nums[l];
        while (true) {
            while (nums[++i] < v && i != h){}
            while (v < nums[--j] && j != l){}
            if (i >= j){
                break;
            }
            swap(nums, i, j);
        }
        swap(nums, l, j);
        return j;
    }
    public void swap(int[] data, int i, int j) {
        int temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }
}
