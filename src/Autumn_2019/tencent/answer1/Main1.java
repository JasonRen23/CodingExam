package Autumn_2019.tencent.answer1;

import java.util.Scanner;

/**
 * @author JasonRen
 * @since 2018/10/18 下午10:03
 */
public class Main1 {


    static int cnt = 0;

    static int[] prime = new int[1000006];

    //就是找出每个素数的最大此方什么时候会超过n,去超过n前面的那个，然后*相应的系数，
    // 因为最小公倍数其实就是进行质因数分解，看质因数的次方
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        prime(n);
        long ans = 2;
        for (int i = 0; i < cnt; i++) {
            int p = prime[i];
            long a = 1;
            while (a * p <= n) {
                a *= p;
            }
            long b = (n / a + 1) * a;
            ans = Math.max(b, ans);
        }
        System.out.println(ans);
    }

    /*notprime是一张表，false表示是素数，true表示不是素数
    prime是素数表，储存小于maxn的全部素数。*/
    private static void prime(int maxnum) {
        boolean[] notPrime = new boolean[maxnum + 1];
        notPrime[0] = notPrime[1] = true;
        int i, j;
        for (i = 2; i <= maxnum; i++) {
            if (!notPrime[i]) {
                prime[cnt++] = i;
                for (j = i + i; j <= maxnum; j += i) {
                    notPrime[j] = true;
                }
            }
        }
    }
}
