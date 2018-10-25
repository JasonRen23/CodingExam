package Autumn_2019.aiqiyi;

import java.util.Scanner;

/**
 * @author JasonRen
 * @since 2018/9/28 下午8:13
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("helper1 result: " + helper1(n));
        System.out.println("helper2 result: " + helper2(n));

    }

    public static long helper1(int n) {
        if (n <= 2) return n + 1;

        long eat = 1;
        long noteat = 1;
        for (int i = 1; i < n; ++i) {
            long new_eat = noteat;
            long new_noteat = eat + noteat;
            eat = new_eat;
            noteat = new_noteat;
        }
        return eat + noteat;

    }

    //看成斐波那契数列，dp求解
    public static long helper2(int n) {
        if (n <= 2) return n + 1;
        long[] f = new long[n + 1];
        f[1] = 2;
        f[2] = 3;
        for (int i = 3; i <= n; i++) {
            f[i] = f[i - 1] + f[i - 2];
        }
        return f[n];
    }
}
