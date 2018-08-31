package Autumn_2019.pinduoduo;

import java.util.Scanner;

public class Main33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] vis = new int[9000005];
        a %= b;
        if (a == 0) {
            System.out.println(0 + " " + 0);
        } else {
            int x = 1;
            while (vis[a] == 0 && a != 0) {
                vis[a] = x++;
                a = a * 10;
                a %= b;
            }

            // System.out.println(Arrays.toString(vis));

            if (a == 0){
                System.out.println(x - 1 + " " + 0);
            } else {
                System.out.println(vis[a] - 1 + " " + (x - vis[a]));
            }
        }
    }
}
