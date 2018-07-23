package Spring_2019.tencent;

import java.math.BigInteger;
import java.util.HashMap;

import java.util.Scanner;

public class CoinGroup_1 {
    static HashMap<BigInteger, Long> memo = new HashMap<>();
    static final BigInteger TWO = BigInteger.valueOf(2);
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final BigInteger n = BigInteger.valueOf(Long.valueOf(in.nextLine()));
        System.out.println(helper(n));

    }

    public static long helper(BigInteger n){
        if(n.signum() == 0) return 1;
        long res = 0;
        if(memo.containsKey(n)){
            return memo.get(n);
        }
        if(n.remainder(TWO).signum() == 0){
            res += helper(n.divide(TWO));
            res += helper(n.subtract(TWO).divide(TWO));
        }else {
            res += helper(n.subtract(BigInteger.ONE).divide(TWO));
        }
        memo.put(n, res);
        return res;
    }


}
