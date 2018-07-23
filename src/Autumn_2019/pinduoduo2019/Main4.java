package Autumn_2019.pinduoduo2019;

import java.util.Scanner;

/**
 * @author : JasonRen
 * @date : 2018-07-22 下午7:58
 * @email : zhicheng_ren@163.com
 */

public class Main4 {
    static final int maxn = 10000;
    static int n,sk;
    static int[][] bit = new int[15][maxn+5];
    static int[] num = new int[15];
    static int[] to = new int[maxn+5];
    static char[] S = new char[maxn+5],
    f = new char[maxn+5],
    ch = new char[maxn+5];
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] dataLine = in.nextLine().split(" ");
        n = Integer.valueOf(dataLine[0]);
        sk = Integer.valueOf(dataLine[1]);
        S = in.nextLine().toCharArray();

        for(int i=0; i<=10; i++) num[i] = 0;
        for(int i=0; i<n; i++) bit[S[i]-'0'][++num[S[i]-'0']]=i;
        int ans = Integer.MAX_VALUE;
        for(int v=0; v<10; v++)
        {
            for(int j=0; j<n; j++) to[j] = 0;
            int cost = work(v);
            if(cost<ans||(ans==cost&&(ch.toString().compareTo(f.toString()))<0)){
                ans = cost;
                for(int i=0;i<ch.length;i++){
                    f[i] = ch[i];
                }

            }
        }
        System.out.println(ans);
        System.out.println(String.valueOf(f).trim());



    }
    public static int work(int v){
        int cost = 0,cnt=0,s=1,l=v-1,r=v+1;

        while(s<=num[v]&&cnt<sk){
            to[bit[v][s]]=1;
            s++;
            cnt++;
        }

        for (int i = 0; i < S.length; i++) {
            ch[i] = S[i];
        }
        if(cnt==sk) return cost;
        while(cnt<sk)
        {
            s=1;
            while(r<10&&s<=num[r]&&cnt<sk){
                to[bit[r][s]]=1;
                s++;
                cnt++;
                cost+=r-v;
            } // 因为要最小序 所以先把数字大的改成v 字典序会变小

            if(l>=0) s=num[l];// 因为改变成v 会使字典序变大 所以这里要从下标在后面的开始改变
            while(l>=0&&s>=1&&cnt<sk){
                to[bit[l][s]]=1;
                s--;
                cnt++;
                cost+=v-l;
            }
            r++;
            l--;
        }
        for(int i=0; i<n; i++)
        {
            if(to[i] == 1) {
                ch[i] = (char)('0'+ v);
            }
        }
        return cost;
    }
}
