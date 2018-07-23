package Spring_2019.toutiao;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class StringPerformance {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int n = in.nextInt();

        System.out.println(findMin_1(n));
        System.out.println(findMin_2(n));
    }
    public static int findMin_1(int n){
        int[][] dp =new int[n + 1][n / 2 + 1];
        for(int i = 2; i < n + 1; i++){
            for(int j = 1; j < n / 2 + 1; j++)
                dp[i][j] = 0x3f3f3f;
            for(int j = 1; j <= i / 2; j++)
                dp[i][j] = Math.min(dp[i][j], dp[i - j][j] + 1);
            if(i % 2 == 1)
                continue;
            for(int j = 1; j <= i / 4; j++)
                dp[i][i / 2] = Math.min(dp[i][i / 2], dp[i / 2][j] + 1);
        }

        int min = 0x3f3f3f;


        for(int j = 1; j < n / 2 + 1; j++){
            if(dp[n][j] < min)
                min = dp[n][j];
        }
        return min;
    }

    public static int findMin_2(int n){
        Node start = new Node();
        start.s = 1; start.m = 1; start.count = 0;
        Queue<Node> queue = new LinkedList<>();
        queue.add(start);
        while (!queue.isEmpty()){
            Node node = queue.poll();
            if(node.s == n){
                return node.count;
            }else if(node.s < n){
                Node node1 = new Node();
                Node node2 = new Node();
                int count = ++node.count;
                node1.m = node.s; node1.s = node.s * 2; node1.count = count;
                node2.m = node.m; node2.s = node.s + node.m; node2.count = count;
                queue.add(node1);
                queue.add(node2);

            }
        }
        return -1;
    }


    static class Node{
        int m;
        int s;
        int count;

        public Node(){
            this.m = 0;
            this.s = 0;
            this.count = 0;
        }
    }
}
