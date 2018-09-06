package Autumn_2019.ctrip;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        if (num < 0) {
            num = -num;
        }
        System.out.println(BitCount(num));
    }

    static long BitCount(long n) {
        long c = 0;
        for (c = 0; c < n; ++c) {
            n &= (n - 1); // 清除最低位的1
        }
        return c;
    }
}
