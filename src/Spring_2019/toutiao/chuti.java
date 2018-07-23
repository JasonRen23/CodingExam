package Spring_2019.toutiao;

import java.util.Arrays;
import java.util.Scanner;

public class chuti {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int n = Integer.valueOf(in.nextLine());


        int index = n / 3;
        int modRet = n % 3;


        System.out.println(modRet != 0 ? 3 * (index + 1) - n : 0);


    }
}
