package Autumn_2019.pinduoduo2019;

import java.util.Scanner;

import static java.lang.Math.toIntExact;

/**
 * @author : JasonRen
 * @date : 2018-07-22 下午6:55
 * @email : zhicheng_ren@163.com
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] names = {"Alice", "Bob", "Cathy", "Dave"};
        long N = Long.valueOf(in.nextLine());
        if(N <= 4){
            System.out.println(names[toIntExact(N) - 1]);
        }else {
            int[] ret = helper(N);
            double level = Math.pow(2, ret[0]);
            int index = (int)(Math.ceil((double)ret[1]/level));
            System.out.println(names[index - 1]);
        }



    }
    public static int[] helper(long N){
        int[] ret = new int[2];
        for(int i = 0;;i++){
            if(N > 4 * Math.pow(2, i)){
                N -= 4 * Math.pow(2, i);
            }else{
                ret[0] = i;
                ret[1] = toIntExact(N);
                break;
            }
        }
        return ret;
    }


}
