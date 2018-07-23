package Spring_2019.netease;

import java.util.Scanner;

public class NiuNiuNaoZhong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] h = new int[N];
        int[] m = new int[N];
        for(int i = 0; i < N; i++){
            h[i] = sc.nextInt();
            m[i] = sc.nextInt();
        }

        int X = sc.nextInt();
        int a = sc.nextInt(), b = sc.nextInt();
        int ans1 = 0, ans2 = 0, temp1, temp2;

        for(int i = 0; i < N; i++){
            temp1 = m[i] + X;
            temp2 = h[i] + temp1 / 60;//hour
            temp1 %= 60;              //min
            if(temp2 < a || (temp2 == a && temp1 <= b)){
                if(h[i] > ans1 || (h[i] == ans1 && m[i] > ans2)){
                    ans1 = h[i];
                    ans2 = m[i];
                }

            }
        }
        System.out.println(ans1 + " " + ans2);

    }
}