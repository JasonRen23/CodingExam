package Autumn_2019.jingdong;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            a[i] = x;
            b[i] = y;
            c[i] = z;
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (a[j] > a[i] && b[j] > b[i]
                && c[j] > c[i]) {
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);

    }
}
