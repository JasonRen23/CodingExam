package Autumn_2019.baidu_interview;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author : JasonRen
 * @date : 2018/08/16
 * @email : zhicheng_ren@163.com
 */
public class MedianFinder {
    private Queue<Integer> small, large;
    private boolean even = true;
    public MedianFinder() {
        small = new PriorityQueue<>();
        large = new PriorityQueue<>(Collections.reverseOrder());
    }

    public void addNum(int num) {
        if (even) {
            large.offer(num);
            small.offer(large.poll());
        } else {
            small.offer(num);
            large.offer(small.poll());
        }
        even = !even;
    }

    public double findMedian() {
        if (even) {
            return (small.peek() + large.peek()) / 2.0;
        } else {
            return small.peek();
        }
    }

    public static void main(String[] args) {
        MedianFinder mf = new MedianFinder();
        mf.addNum(1);
        mf.addNum(2);
        System.out.println(mf.findMedian());
        mf.addNum(3);
        System.out.println(mf.findMedian());
        mf.addNum(4);
        System.out.println(mf.findMedian());
    }
}
