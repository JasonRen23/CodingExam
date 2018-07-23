package Spring_2019.tencent;


import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int K = in.nextInt();
        int len1 = in.nextInt();
        int num1 = in.nextInt();
        int len2 = in.nextInt();
        int num2 = in.nextInt();

        int[] coins = new int[num1 + num2];
        for(int i = 0; i < num1; i++)
            coins[i] = len1;

        for(int i = num1; i < num1 + num2; i++)
            coins[i] = len2;


//        int[] coin = {2,2,2,3,3,3};

        long[] dp = new long[K + 1];
        dp[0] = 1;
        for (int coin : coins) {
            for (int i = coin; i <= K; i++) {
                dp[i] += dp[i-coin];
            }
        }

        System.out.println(dp[K] % 1000000007);



    }

    public static long change(int amount, int[] coins) {
        long[] dp = new long[amount + 1];
        dp[0] = 1;
        for (int coin : coins) {
            for (int i = coin; i <= amount; i++) {
                dp[i] += dp[i-coin];
            }
        }
        return dp[amount];
    }

}
