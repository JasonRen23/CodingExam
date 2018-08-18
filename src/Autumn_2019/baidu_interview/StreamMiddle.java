package Autumn_2019.baidu_interview;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class StreamMiddle {
    private boolean even = true;
    Queue<Integer> smallQueue;
    Queue<Integer> largeQueue;

    public StreamMiddle() {
        smallQueue = new PriorityQueue<>();
        largeQueue = new PriorityQueue<>(Collections.reverseOrder());
    }

    public void addNum(int num) {
        if (even) {
            largeQueue.offer(num);
            smallQueue.offer(largeQueue.poll());
        } else {
            smallQueue.offer(num);
            largeQueue.offer(smallQueue.poll());
        }
        even = !even;
    }

    public double findMedian() {
        if (even) {
            return (smallQueue.peek() + largeQueue.peek()) / 2.0;
        } else {
            return smallQueue.peek();
        }
    }


    public static void main(String[] args) {
        StreamMiddle streamMiddle = new StreamMiddle();
        streamMiddle.addNum(1);
        streamMiddle.addNum(2);
        System.out.println(streamMiddle.findMedian());
        streamMiddle.addNum(3);
        System.out.println(streamMiddle.findMedian());
        streamMiddle.addNum(4);
        System.out.println(streamMiddle.findMedian());

    }


}
