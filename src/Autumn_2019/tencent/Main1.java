package Autumn_2019.tencent;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m, max_gcd, max_in_n = 0;
        n = sc.nextInt();
        if (n == 1) {
            System.out.println(2);
            return;
        }
        if (n == 4) {
            System.out.println(8);
            return;
        }
        for (max_gcd = n; max_gcd > 1; max_gcd--) {
            int i;
            for (i = 2; (i * i) <= max_gcd; i++) {
                if ((max_gcd % i) == 0)
                    break;
            }
            if ((i * i) > max_gcd)
                break;
        }
        while (max_in_n <= n)
            max_in_n += max_gcd;
        m = 2 * (max_in_n - max_gcd);
        System.out.println(m);
    }
}
