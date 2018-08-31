package Autumn_2019.pinduoduo;

import java.util.Scanner;

public class Main21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] numLine = sc.nextLine().split(" ");
        int N = Integer.valueOf(numLine[0]);
        int M = Integer.valueOf(numLine[1]);

        char[][] board = new char[N][M];
        for (int i = 0; i < N; i++) {
            String line = sc.nextLine();
            char[] arr = line.toCharArray();
            board[i] = arr;
        }


        for (int i = 0; i < M; i++) {
            int cnt = 0;
            for (int j = 0; j < N; j++) {
                if (board[j][i] == 'o') {
                    board[j][i] = '.';
                    cnt++;
                } else if (board[j][i] == 'x') {
                    for (int k = 0; k < cnt; k++)
                        board[j - k - 1][i] = 'o';
                    cnt = 0;
                }
            }
        }


        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }

    }
}
