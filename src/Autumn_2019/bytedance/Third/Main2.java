package Autumn_2019.bytedance.Third;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int[][] matrix = new int[M][M];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < M; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println(numGroups(matrix));
    }

    static int n, m;

    public static int numGroups(int[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }
        n = grid.length;
        m = grid[0].length;
        int count = 0;
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                if (grid[i][j] == 1) {
                    DfsMarking(grid, i, j);
                    ++count;
                }

            }
        }
        return count;
    }

    private static void DfsMarking(int[][] grid, int i, int j) {
        if (i < 0 || j < 0 || i >= n || j >= m || grid[i][j] != 1) return;
        grid[i][j] = 0;
        DfsMarking(grid, i - 1, j);
        DfsMarking(grid, i + 1, j);
        DfsMarking(grid, i, j - 1);
        DfsMarking(grid, i, j + 1);
    }
}
