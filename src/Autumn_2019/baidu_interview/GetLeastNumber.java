package Autumn_2019.baidu_interview;

import java.util.*;

/**
 * @author : JasonRen
 * @date : 2018/08/16
 * @email : zhicheng_ren@163.com
 */
public class GetLeastNumber {
    public static List<Integer> getLeastNumbers(int[] a, int k) {
        List<Integer> ret = new ArrayList<>();
        if(a == null || k > a.length || a.length <= 0 || k < 0) {
            return ret;
        }

        Queue<Integer> maxHeap = new PriorityQueue<Integer>(k, Collections.reverseOrder());
        for (int i : a) {
            if (maxHeap.size() != k) {
                maxHeap.offer(i);
            } else {
                int max = maxHeap.peek();
                if (max > i) {
                    maxHeap.poll();
                    maxHeap.offer(i);
                }
            }
        }

        for (Integer integer : maxHeap) {
            ret.add(integer);
        }

        return ret;
    }

    public static void main(String[] args) {
        int[] data = {4,5,1,6,2,7,3,8};
        System.out.println("The first method: " + getLeastNumbers(data,5).toString());
    }
}
