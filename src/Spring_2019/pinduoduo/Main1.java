package Spring_2019.pinduoduo;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] low_i = new int[n];
        int[] high_i = new int[n];
        for(int i = 0; i < n; i++){
            low_i[i] = sc.nextInt();
            high_i[i] = sc.nextInt();
        }

    }
}
