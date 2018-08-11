package Autumn_2019.netease;

import java.util.Scanner;

/**
 * @author JasonRen
 * @since 2018/8/11 下午4:02
 */
public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long k = sc.nextLong();

        if (k > c(n, n + m)) {
            System.out.println(-1);
            return;
        }

        String ret = "";
        while (k > 1) {
            long combination = c(n - 1, (n + m - 1));
            if (k > combination) {
                System.out.print('z');
                k -= combination;
                m--;
                if (m == 0)
                    break;
            } else {
                // System.out.println('a');
                ret += 'a';
                n--;
                if (n == 0)
                    break;
            }
        }

        for (int i = 0; i < n; i++) {
            ret += 'a';
        }

        for (int i = 0; i < m; i++) {
            ret += 'z';
        }
        System.out.println(ret);

    }

    public static long factorial(long number) {
        if (number <= 1)
            return 1;
        else
            return number * factorial(number - 1);
    }

    public static int c(int up, int low) {
        if (low == 0) return 0;
        if (up == low) return 1;
        int ans = 1;
        for (int i = low; i >= (low - up + 1); --i) ans *= i;
        while (up != 0) ans /= up--;
        return ans;
    }


}
