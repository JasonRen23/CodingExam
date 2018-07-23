package Spring_2019.meituan;

import java.util.Scanner;

public class CoinChange {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int target = in.nextInt();
        int[] coins = {1, 5, 10, 20, 50, 100};

        System.out.println(helper(coins, target));


    }

    public static long helper(int[] moneys, int target){
        long[] dp = new long[target + 1];
        dp[0] = 1;
        for(int i = 0;i< moneys.length; i++){
            for(int j = 1;j <= target; j++){
                if(j >= moneys[i]){
                    dp[j] += dp[j-moneys[i]];
                }
            }
        }
        return dp[target];
    }


}
