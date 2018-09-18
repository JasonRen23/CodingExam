package Autumn_2019.tencent;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            System.out.println(helper(a, b, c));
        }
    }

    public static String helper(int a, int b, int c) {
        for (int j = 1; j <= 100; j++) {

            if ((a * j) % b == c) {
                return "YES";
            }
        }
        return "NO";
    }
}

