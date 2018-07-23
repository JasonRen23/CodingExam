package Spring_2019.meituan;

import java.util.Scanner;

public class NumberChar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int[] used = new int[10];

        int digit = -1, min = Integer.MAX_VALUE;
        for(int i = 0; i < str.length(); i++){
            ++used[str.charAt(i) - '0'];
        }

        for(int i = 1; i < 10; i++){
            if(min > used[i]){
                min = used[i];
                digit = i;
            }
        }

        if(used[0] + 1 <= min){
            String ret = "1";
            for(int i = 0; i < min; i++){
                ret =  ret + "0";
            }
            System.out.println(ret);

        }else {
            String ret = "";
            for(int i = 0; i < min + 1; i++){
                ret = ret + String.valueOf(digit);
            }
            System.out.println(ret);
        }




    }
}
