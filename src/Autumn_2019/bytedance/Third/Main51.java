package Autumn_2019.bytedance.Third;

import java.util.Scanner;

public class Main51 {
    static int k = 0;
    static int n, m, res;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        int[][] data = new int[m][2];
        for (int i = 0; i < m; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            data[i][0] = x;
            data[i][1] = y;
        }
        for (int i = 0; i < n; i++) {
            k = 0;
            if (dfs(i + 1, data, new boolean[n + 1])) {
                res++;
            }

        }
        System.out.println(res);
    }

    public static boolean dfs(int key, int[][] data, boolean[] dp) {
        k++;
        if (k == n) {
            return true;
        }
        dp[key] = true;
        for (int i = 0; i < m; i++) {
            if (data[i][1] == key && !dp[data[i][0]]) {
                if (dfs(data[i][0], data, dp)) {
                    return true;
                }
            }
        }
        return false;
    }
}
