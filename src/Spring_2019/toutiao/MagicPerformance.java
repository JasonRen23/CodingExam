package Spring_2019.toutiao;

import java.util.Scanner;

public class MagicPerformance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int n = Integer.parseInt(sc.nextLine());
        final int m = Integer.parseInt(sc.nextLine());
        long[] a = new long[n];
        long[] b = new long[m];
        String[] strA = sc.nextLine().split(" ");
        String[] strB = sc.nextLine().split(" ");
        long sumA = 0, sumB = 0;
        for(int i = 0; i < n; i++){
            a[i] = Long.valueOf(strA[i]);
            sumA += a[i];
        }
        for(int j = 0; j < m; j++){
            b[j] = Long.valueOf(strB[j]);
            sumB += b[j];
        }



    }
}
