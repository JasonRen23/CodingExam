package Autumn_2019.bytedance.LIS;

public class Method1 {
    public static void main(String[] args) {

    }
    public static int[] getdp1(int[] arr) {
        int [] dp = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j]) {
                    dp[i] = Math.max(dp[i], dp[i] + 1);
                }
            }
        }
        return dp;
    }
}
