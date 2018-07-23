package Spring_2019.netease;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class AI {
    static class data{
        int row;
        int col;
        int cnt;

        public data(int row, int col, int cnt) {
            this.row = row;
            this.col = col;
            this.cnt = cnt;
        }
        public data(){
            this.row = 0;
            this.col = 0;
            this.cnt = 0;
        }
    }

    static Queue<data> queue = new LinkedList<>();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int r = in.nextInt();
        int c = in.nextInt();
        int[][] mat = new int[r][c];

        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                mat[i][j] = in.nextInt();
                if(mat[i][j] == 0){
                    data temp = new data(i ,j, 0);
                    queue.offer(temp);
                }else {
                    mat[i][j] = -1;
                }
            }
        }

        markZero(mat);

        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                System.out.print(mat[i][j]);
                if(j == c-1)continue;
                System.out.print(" ");
            }
            System.out.println();
        }


    }

    static void markZero(int[][] A){
        final int r = A.length;
        final int c = A[0].length;
        while (!queue.isEmpty()){
            data temp = queue.poll();
            if(temp.row + 1 < r){
                if(A[temp.row + 1][temp.col] == -1){
                    data toAdd = new data(temp.row + 1, temp.col, temp.cnt + 1);
                    A[temp.row + 1][temp.col] = temp.cnt + 1;
                    queue.offer(toAdd);
                }
            }

            if(temp.col + 1 < c){
                if(A[temp.row][temp.col + 1] == -1){
                    data toAdd = new data(temp.row, temp.col + 1, temp.cnt + 1);
                    A[temp.row][temp.col + 1] = temp.cnt + 1;
                    queue.offer(toAdd);
                }
            }
            if(temp.row - 1 >= 0){
                if(A[temp.row - 1][temp.col] == -1){
                    data toAdd = new data(temp.row - 1, temp.col, temp.cnt + 1);
                    A[temp.row - 1][temp.col] = temp.cnt + 1;
                    queue.offer(toAdd);
                }
            }
            if(temp.col - 1 >= 0){
                if(A[temp.row][temp.col - 1] == -1){
                    data toAdd = new data(temp.row, temp.col - 1, temp.cnt + 1);
                    A[temp.row][temp.col - 1] = temp.cnt + 1;
                    queue.offer(toAdd);
                }
            }
        }


    }


}
