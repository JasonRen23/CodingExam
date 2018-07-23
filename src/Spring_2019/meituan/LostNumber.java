package Spring_2019.meituan;

import java.math.BigInteger;
import java.util.Scanner;

public class LostNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[10001];
        int tmp;
        for(int i = 0; i < 9997; i++){
            tmp = in.nextInt();
            arr[tmp] = 1;
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= 10000; i++){
            if(arr[i] == 0)
                sb.append(i);
        }

        BigInteger num = new BigInteger(sb.toString());

        System.out.println(num.mod(BigInteger.valueOf(7)));


    }
}
