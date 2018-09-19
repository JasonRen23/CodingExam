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
            if (nums[i] > 0) //若该节点的入度大于出度说明是重要城市，入度加出度减
                cnt++;
        }
        System.out.println(cnt);
    }

    /**
     *
     * @param idx 此次dfs出度计算节点tar可达的某个节点，但出度并不计算在该节点上
     * @param tar 此次dfs的出度计算节点
     * @param vis dfs已经访问过的且已经计算过入度的节点
     */
    private static void dfs(boolean[][] nodes, int idx, int tar, int[] nums, boolean[] vis) {
        for (int i = 1; i < nodes.length; i++) {
            if (i != idx && nodes[idx][i] && !vis[i]) {
                nums[tar]--; //出度减
                nums[i]++;   //入度加
                vis[i] = true;
                dfs(nodes, i, tar, nums, vis);
            }
        }
    }
}
