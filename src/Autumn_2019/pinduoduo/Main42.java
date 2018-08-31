package Autumn_2019.pinduoduo;

import java.util.HashMap;
import java.util.Scanner;

//100%
public class Main42 {
    Scanner sc = new Scanner(System.in);
    int n;
    int l;
    int flag;
    int[][] vis;
    String[] str = new String[2005];
    HashMap<String, Integer> mp = new HashMap<>(2005);
    char[] ans;

    void slove() {
        n = sc.nextInt();
        l = sc.nextInt();
        flag = 0;
        ans = new char[l];
        vis = new int[l][26];
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            for (int j = 0; j < l; j++) {
                vis[j][s.charAt(j) - 'A'] = 1;
            }
            mp.put(s, mp.getOrDefault(s, 0) + 1);
        }
        dfs(0);
        if (flag == 0) System.out.println("-");
    }

    void dfs(int len) {
        if (flag == 1) return;
        if (len == l) {
            String s = new String(ans);
            if (!mp.containsKey(s)) {
                System.out.println(s);
                flag = 1;
            }
            return;
        }
        for (int i = 0; i < 26; i++) {
            if (vis[len][i] == 1) {
                ans[len] = (char) ('A' + i);
                dfs(len + 1);
            }
        }
    }

    public static void main(String[] args) {
        new Main42().slove();
    }
}
