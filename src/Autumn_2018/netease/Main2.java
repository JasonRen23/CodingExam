package Autumn_2018.netease;

import java.util.Scanner;

/**
 * 字符串碎片
 *
 * 一个由小写字母组成的字符串可以看成一些同一字母的最大碎片组成的。例如,"aaabbaaac"是由下面碎片组成的:'aaa','bb','c'。牛牛现在给定一个字符串,请你帮助计算这个字符串的所有碎片的平均长度是多少。
 *
 * 输入描述:
 * 输入包括一个字符串s,字符串s的长度length(1 ≤ length ≤ 50),s只含小写字母('a'-'z')
 *
 *
 * 输出描述:
 * 输出一个整数,表示所有碎片的平均长度,四舍五入保留两位小数。
 *
 * 如样例所示: s = "aaabbaaac"
 * 所有碎片的平均长度 = (3 + 2 + 3 + 1) / 4 = 2.25
 *
 * 输入例子1:
 * aaabbaaac
 *
 * 输出例子1:
 * 2.25
 */
public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        char[] arr = line.toCharArray();
        int len = arr.length;

        int ret = 0;
        int num = 0;
        int low = 0;
        int high = 1;

        while (high <= len - 1){
            if (arr[low] != arr[high]) {
                num += 1;
                ret += high - low;
                low = high;
            }
            high++;
        }

        ret += len - low;
        num += 1;

        System.out.printf("%.2f", (float)ret / num);


	}

}
