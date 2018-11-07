package Autumn_2019.bytedance_interview;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * 一个无序数组求第K大数
 *
 * @author JasonRen
 * @since 2018/11/7 8:43 PM
 */
public class Main6 {
    public static void main(String[] args) {
        int[] arr = {45,67,33,21};
        System.out.println(findKth(arr,1));
    }

    public static int findKth(int[] arr, int k) {
        if (k > arr.length) {
            return -1;
        }
        //生成最大堆使用o2-o1,生成最小堆使用o1-o2, 并修改 e.compareTo(peek) 比较规则
        Queue<Integer> maxHeap = new PriorityQueue<>(k, (o1, o2) -> o1.compareTo(o2));
        for (int i : arr) {
            if (maxHeap.size() != k) {
                maxHeap.offer(i);
            } else {
                int max = maxHeap.peek();
                if (max < i) {
                    maxHeap.poll();
                    maxHeap.offer(i);
                }
            }
        }
        return maxHeap.peek();
    }
}
