package Autumn_2018.netease;

/**
 * @author JasonRen
 * @since 2018/8/11 下午1:47
 */

import java.util.Scanner;

/**
 * 重排数列
 * <p>
 * 小易有一个长度为N的正整数数列A = {A[1], A[2], A[3]..., A[N]}。
 * 牛博士给小易出了一个难题:
 * 对数列A进行重新排列,使数列A满足所有的A[i] * A[i + 1](1 ≤ i ≤ N - 1)都是4的倍数。
 * 小易现在需要判断一个数列是否可以重排之后满足牛博士的要求。
 * 输入描述:
 * 输入的第一行为数列的个数t(1 ≤ t ≤ 10),
 * 接下来每两行描述一个数列A,第一行为数列长度n(1 ≤ n ≤ 10^5)
 * 第二行为n个正整数A[i](1 ≤ A[i] ≤ 10^9)
 * <p>
 * <p>
 * 输出描述:
 * 对于每个数列输出一行表示是否可以满足牛博士要求,如果可以输出Yes,否则输出No。
 * <p>
 * 输入例子1:
 * 2
 * 3
 * 1 10 100
 * 4
 * 1 2 3 4
 * <p>
 * 输出例子1:
 * Yes
 * No
 */
public class Main5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long n1, n4;
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            n1 = 0;
            n4 = 0;
            for (int j = 0; j < n; j++) {
                long num = sc.nextLong();
                if (num % 4 == 0)
                    n4++;
                else if (num % 2 != 0)
                    n1++;
            }

            if (n4 >= n1 || (n4 >= n1 - 1 && (n4 + n1) == n))
                System.out.println("Yes");
            else
                System.out.println("No");


        }
    }
}
