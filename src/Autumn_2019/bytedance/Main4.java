package Autumn_2019.bytedance;

import java.util.Arrays;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2;
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        int index;
        index = Math.min(t, n);
        arr2 =new int[n * index];
        for (int i = 0; i < index; i++) {
            System.arraycopy(arr1, 0, arr2, i * n, n);
        }

        System.out.println(generateLIS(arr2, arr2.length));
    }



    public static int[] getDp(int[] arr, int n) {
        int[] dp = new int[n];
        int[] ends = new int[n];
        ends[0] = arr[0];
        dp[0] = 1;
        int right = 0;
        int l = 0;
        int r = 0;
        int m = 0;
        for (int i = 1; i < arr.length; i++) {
            l = 0;
            r = right;
            while (l <= r) {
                m = (l + r) / 2;
                if (arr[i] > ends[m]) {
                    l = m + 1;
                } else {
                    r = m - 1;
                }
            }
            right = Math.max(right, l);
            ends[l] = arr[i];
            dp[i] = l + 1;
        }
        return dp;
    }

    public static int generateLIS(int[] arr, int n) {
        int[] dp = getDp(arr, n);
        int len = 0;
        int index = 0;
        for (int i = 0; i < dp.length; i++) {
            if (dp[i] > len) {
                len = dp[i];
                index = i;
            }
        }
        int[] lis = new int[len];
        lis[--len] = arr[index];
        for (int i = index; i >= 0; i--) {
            if (arr[i] < arr[index] && dp[i] == dp[index] - 1) {
                lis[--len] = arr[i];
                index = i;
            }
        }
        return lis.length;
    }
}
