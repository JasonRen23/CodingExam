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
        int n = in.nextInt();
        //基数为4
        int base = 4;
        int exp = 1;
        while (n > base * exp){
            //减去每一轮的人数，轮数递增，找出最后一轮退出
            n = n - base * exp;
            exp = exp * 2;
        }
        int num = 0;
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < exp + 1; j++) {
                num = num + 1;
                //判断当前是谁在喝可乐
                if(num == n)
                    System.out.println(names[i - 1]);

            }
        }





    }

}
