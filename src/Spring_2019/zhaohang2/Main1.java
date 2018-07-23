package Spring_2019.zhaohang2;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int target = (1 + N) * N / 2;
        int sum = 0;
        for(int i = 1; i <= N; i++){
            sum += sc.nextInt();
        }
        System.out.println(target - sum);
    }
}
