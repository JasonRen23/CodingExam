package Autumn_2019.jingdong;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            int[][] graph = new int[N][N];

            for (int j = 0; j < M; j++) {
                int x = sc.nextInt() - 1;
                int y = sc.nextInt() - 1;
                graph[x][y] = 1;
                graph[y][x] = 1;

            }

            int[] ret = new int[N];

            for (int j = 0; j < N; j++) {
                for (int k = 0; k < N; k++) {
                    if (graph[i][j] == 1)
                        ret[i]++;
                }
            }

            boolean flag = true;
            for (int j = 0; j < N; j++) {
                for (int k = j; k < N; k++) {
                    if (graph[j][k] == 0) {
                        if(ret[i] != ret[j]) {
                            flag = false;
                            break;
                        }
                    }
                }
                if (!flag) break;
            }
            if (!flag) {
                System.out.println("No");
            } else {
                System.out.println("Yes");
            }



        }
    }

    static boolean checkSame(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i])
                return false;
        }
        return true;
    }

    static boolean checkDupli(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 1 && b[i] == 1) {
                return true;
            }

        }
        return false;
    }
}
