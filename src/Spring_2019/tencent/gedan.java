package Spring_2019.tencent;

import java.util.Scanner;

public class gedan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int A = sc.nextInt(); //歌的第一种长度
        int X = sc.nextInt(); //数量
        int B = sc.nextInt(); //歌的第二种长度
        int Y = sc.nextInt(); //数量

        int[][] dp = new int[X + Y + 1][K + 1];

        for(int i = 0; i < X + Y + 1; i++)
            dp[i][0] = 1;

        for(int i = 1; i < X + Y +1; i++){
            for(int j = 1; j <= K; j++){
                if(i <= X){
                    if(j >= A) dp[i][j] = (dp[i - 1][j] + dp[i - 1][j - A]) % 1000000007;
                    else dp[i][j] = dp[i - 1][j] % 1000000007;
                }
                else if(i <= X + Y){
                    if(j >= B) dp[i][j] = (dp[i - 1][j] + dp[i - 1][j - B]) % 1000000007;
                    else dp[i][j] = dp[i - 1][j] % 1000000007;
                }
            }
        }
        System.out.println(dp[X + Y][K]);
    }
}
