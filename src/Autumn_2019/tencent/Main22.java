package Autumn_2019.tencent;

import java.util.Scanner;

public class Main22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        boolean[][] nodes = new boolean[n + 1][n + 1];
        for (int i = 0; i < m; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            nodes[x][y] = true;
        }

        int[] nums = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            boolean[] vis = new boolean[n + 1];
            dfs(nodes, i, i, nums, vis);
        }

        int cnt = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0)
                cnt++;
        }
        System.out.println(cnt);
    }

    private static void dfs(boolean[][] nodes, int idx, int tar, int[] nums, boolean[] vis) {
        for (int i = 1; i < nodes.length; i++) {
            if (i != idx && nodes[idx][i] && !vis[i]) {
                nums[tar]--;
                nums[i]++;
                vis[i] = true;
                dfs(nodes, i, tar, nums, vis);
            }
        }
    }
}
