package Spring_2019.jingdong;

import java.util.Scanner;

public class Main1 {
    public static long countSubstrings(String s){
        int len = s.length();

        // create a 2D array to store the count
        // of palindromic subsequence
        long[][] dp = new long[len + 1][len + 1];

        // Every single character of a string is a palindrome
        // subsequence
        for(int i = 0; i <len; i++)
            dp[i][i] = 1;

        for(int i = 2; i <= len; i++){

            for(int l = 0; l < len; l++){

                int r = l + i - 1;
                if(r < len){
                    if(s.charAt(l) == s.charAt(r))
                        // If first and last characters are same, then we
                        // consider it as palindrome subsequence and check
                        // for the rest subsequence (i+1, j), (i, j-1)
                        dp[l][r] = dp[l + 1][r] + dp[l][r - 1] + 1;
                    else
                        // check for rest sub-sequence and  remove common
                        // palindromic subsequences as they are counted
                        // twice when we do countPS(i+1, j) + countPS(i,j-1)
                        dp[l][r] = dp[l + 1][r] + dp[l][r - 1] - dp[l + 1][r - 1];
                }

             }

        }
        return dp[0][len - 1];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(countSubstrings(str));
    }
}
