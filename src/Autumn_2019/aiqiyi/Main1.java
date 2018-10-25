package Autumn_2019.aiqiyi;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author JasonRen
 * @since 2018/9/28 下午5:47
 */


public class Main1 {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] a = new int[N + 1];
        int sum = N;
        for (int i = 1; i < N + 1; i++) {
            a[i] = in.nextInt();
        }
        // System.out.println(helper1(a));

    }

    // private static int helper1(int[] a) {
    //     int N = a.length - 1;
    //     boolean[] b = new boolean[N + 1];
    //     Arrays.sort(a);
    //     int j = 1;
    //     int sum = N;
    //     while (boxNumber(j)) {
    //         sum--;
    //         j++;
    //     }
    //     System.out.println(sum);
    //     while (true) {
    //
    //     }
    //     for (int i = j + 1; i < N + 1; i++) {
    //         if (a[i] > a[j] && !b[i]) {
    //             b[i] = true;
    //
    //         }
    //     }
    // }
}