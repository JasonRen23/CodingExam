package Spring_2019.huawei;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
//        char[] arr = str.toCharArray();
        System.out.println(longestPalindrome(str));
    }


    public static int longestPalindrome(String s) {
        if(s == null || s.length() == 0) return 0;
        int start = 0, end = 0;
        for(int i = 0; i < s.length(); ++i){
            int len1 = expand(s, i, i);
            int len2 = expand(s, i,i + 1);
            int len = Math.max(len1, len2);
            if(len > end - start + 1){
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return end - start + 1;
    }
    public static int expand(String s, int lo, int hi){
        while(lo >=0 && hi < s.length() && s.charAt(lo) == s.charAt(hi)){
            lo--;
            hi++;
        }
        return hi - lo - 1;
    }

}
