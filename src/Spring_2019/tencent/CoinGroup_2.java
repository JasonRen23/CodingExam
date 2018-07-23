package Spring_2019.tencent;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CoinGroup_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final long n = Long.valueOf(in.nextLine());
        final char[] nn = Long.toBinaryString(n).toCharArray();
        int sum = 1;
        int ret = 1;
        List<Integer> zeros = countZeros(nn);
        for(int i = 0; i < zeros.size(); i++){
            ret += zeros.get(i) * sum;
            sum += ret;
        }
        System.out.println(ret);
    }
    public static List<Integer> countZeros(char[] x){
        int consecutive = 0;
        List<Integer> ret = new ArrayList<>();
        int n = x.length - 1;
        if(x[n] == '1')
            n = n - 1;
        while (n >= 0){
            if(x[n] == '0'){
                consecutive++;
            }else {
                ret.add(0, consecutive);
                consecutive = 0;
            }
            n--;
        }
        return ret;
    }
}
