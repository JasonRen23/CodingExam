package Autumn_2019.pinduoduo2018;

import java.util.Scanner;

/**
 * @author : JasonRen
 * @date : 2018-07-22 下午4:33
 * @email : zhicheng_ren@163.com
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long fu1 = 0, fu2 = 0, z1 = 0, z2 = 0, z3 = 0;
        long t;

        for (int i = 0; i < n; i++) {
            t = in.nextInt();
            if(t < 0){
                if(t < fu1){
                    fu2 = fu1;
                    fu1 = t;
                }else if(t < fu2){
                    fu2 = t;
                }
            }else {
                if(t > z1){
                    z3 = z2;
                    z2 = z1;
                    z1 = t;
                }else if(t > z2){
                    z3 = z2;
                    z2 = t;
                }else if(t > z3){
                    z3 = t;
                }

            }
        }


        long result1 = z1 * z2 * z3;
        long result2 = fu1 * fu2 * z1;
        System.out.println(Math.max(result1, result2));

    }
}
