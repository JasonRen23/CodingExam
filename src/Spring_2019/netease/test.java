package Spring_2019.netease;

public class test {
    public static void main(String[] args) {
        int[] dp = new int[21];
        dp[1] = dp[2] = 1;
        dp[3] = 2;
        for(int i = 4; i < dp.length; i++){
            dp[i] = dp[i - 1] + dp[i - 3];
        }
        System.out.println(dp[20]);
    }
}
