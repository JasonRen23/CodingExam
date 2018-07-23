package Spring_2019.zhaohang2;

import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(n < 0 ? getStep(n*(-1)) : getStep(n));

    }



    public static long getStep(long n){
        if(n < 4)
            return n;
        if(n % 2 == 0)
            return getStep(n / 2) + 1;
        else
            return Math.min(getStep((n - 1) / 2) + 2, getStep((n + 1) /2) + 2);
    }


}
