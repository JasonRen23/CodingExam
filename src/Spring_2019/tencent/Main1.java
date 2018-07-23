package Spring_2019.tencent;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] line = sc.nextLine().split(" ");
        long n = Long.valueOf(line[0]);
        long m = Long.valueOf(line[1]);
        System.out.println(n * m / 2);
    }
}
