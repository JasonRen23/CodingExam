package Spring_2019.netease;

import java.util.Scanner;

public class ShuDui{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        if(k == 0) System.out.println((long) n * n);
        else {
            long ans = 0;
            for(int i = k + 1; i <= n; i++){
                ans += (n / i) * (i - k);
                if(n % i >= k) ans += n % i - k + 1;
            }
            System.out.println(ans);
        }

    }
}
