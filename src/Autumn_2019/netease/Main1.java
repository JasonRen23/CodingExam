package Autumn_2019.netease;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * @author JasonRen
 * @since 2018/8/11 下午4:01
 */
public class Main1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Queue<Integer> t = new LinkedList<>();
        long answer = 0;
        long gain = 0;
        long temp_gain = 0;
        for (int i = 0; i < n; i++) {
            int ti = sc.nextInt();
            if (ti == 1) {
                answer += a[i];
            } else {
                if (!t.isEmpty()){
                    if ( (i -  t.peek() >= k)) {
                        gain = Math.max(gain, temp_gain);
                        while (!t.isEmpty() && (i -  t.peek() >= k)){
                            temp_gain -= a[t.peek()];
                            t.poll();
                        }
                    }
                }
                temp_gain += a[i];
                t.offer(i);
            }


        }

        answer += gain;
        System.out.println(answer);
    }
}
