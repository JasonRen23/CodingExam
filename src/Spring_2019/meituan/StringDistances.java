package Spring_2019.meituan;

import java.util.Scanner;

public class StringDistances {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String t = in.nextLine();

        final int len1 = s.length();
        final int len2 = t.length();



        int[] a = new int[len1 + 1];
        int[] b = new int[len1 + 1];

        for(int i = 1; i <= len1; i++){
            a[i] = a[i - 1];
            b[i] = b[i - 1];
            if(s.charAt(i - 1) == 'a')
                a[i]++;
            else
                b[i]++;
        }

        long sum = 0;
        for(int i = 1; i <= len2; i++){
            if(t.charAt(i - 1) == 'a'){
                sum += b[len1 - len2 + i] - b[i - 1];
            }else {
                sum += a[len1 - len2 + i] - a[i - 1];
            }
        }

        System.out.println(sum);
    }
}
