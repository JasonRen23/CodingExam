package Spring_2019.huawei;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main2 {
    static class Node{
        int value;
        List<Integer> list;
        public Node(int v){
            this.value = v;
            this.list = new ArrayList<>();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = Integer.parseInt(sc.nextLine());
        String[] liuCost = sc.nextLine().split(" ");
        String[] coinCost = sc.nextLine().split(" ");

        int n = liuCost.length;
        int[] liu = new int[n];
        int[] coin = new int[n];
        for(int i = 0; i < n; i++){
            liu[i] = Integer.parseInt(liuCost[i]);
            coin[i] = Integer.parseInt(coinCost[i]);
        }
//        int[][] dp = new int[liu.length][m + 1];
//        Node[][] dp = new Node[liu.length + 1][m + 1];
//        for(int i = 0; i < dp.length; i++){
//            for(int j = 0; j < dp[0].length; j++){
//                dp[i][j] = new Node(0);
//            }
//        }

//        for (int j = 1; j < m + 1; j++) {
//            if (j == liu[0]) {
//                dp[0][j].value = coin[0];
//                dp[0][j].list.add(1);
//            } else {
//                dp[0][j].value = 0;
////                dp[0][j].list.add(1);
//            }
//
//            for (int i = 0; i < liu.length; i++) {
//                if (j < liu[i]) {
//                    dp[i + 1][j].value = dp[i][j].value;
//                    dp[i + 1][j].list = dp[i][j].list;
//                } else {
//                    if(dp[i][j - liu[i]].value + coin[i] > dp[i][j].value){
//                        dp[i + 1][j].value = dp[i][j - liu[i]].value + coin[i];
//                        dp[i + 1][j].list.add(i + 1);
//                    }else {
//                        dp[i + 1][j].value = dp[i][j].value;
//                        dp[i + 1][j].list = dp[i][j].list;
//                    }
////                     = Math.max(dp[i - 1][j - liu[i]] + coin[i], dp[i - 1][j]);
//                }
//            }
//        }

//        int[] dp = new int[m + 1];
        Node[] dp = new Node[m + 1];
        for(int i = 0; i < m + 1; i++){
            dp[i] = new Node(0);
        }
        for (int i = 0; i < liu.length; i++) {
            for (int j = m; j > 0; j--) {
                if (j >= liu[i]) {
//                    dp[j] = Math.max(dp[j - liu[i]] + coin[i], dp[j - 1]);
                    if(dp[j - liu[i]].value + coin[i] > dp[j - 1].value){
                        dp[j].value = dp[j - liu[i]].value + coin[i];
                        dp[j].list.add(i + 1);
                    }else {
                        dp[j].value = dp[j - 1].value;
                        dp[j].list = dp[j - 1].list;
                    }

                }


            }
        }


        System.out.println(dp[m - 1].value);
        System.out.println(dp[m - 1].list);






//        List<List<Integer>> list = new ArrayList<>();
//        for(int i = 0; i < m + 1; i++){
//            list.add(new ArrayList<>());
//        }
//
//        for (int j = 1; j < m + 1; j++) {
//            if (j == liu[0]) {
//                dp[0][j] = coin[0];
//                list.get(j).add(1);
//            } else {
//                dp[0][j] = 0;
//            }
//            for (int i = 1; i < liu.length; i++) {
//                if (j < liu[i]) {
//                    dp[i][j] = dp[i - 1][j];
//                } else {
//                    if(dp[i - 1][j - liu[i]] + coin[i] > dp[i - 1][j]){
//                        dp[i][j] = dp[i - 1][j - liu[i]] + coin[i];
//                        list.get(j - liu[i]).add(i);
//                    }else {
//                        dp[i][j] = dp[i - 1][j];
//                    }
////                     = Math.max(dp[i - 1][j - liu[i]] + coin[i], dp[i - 1][j]);
//                }
//            }
//        }

//
//        System.out.println(dp[liu.length - 1][m]);
//        System.out.println(list.get(m));


//        System.out.println(dp[liu.length][m].value);
//        System.out.println(dp[liu.length][m].list);

    }


}
