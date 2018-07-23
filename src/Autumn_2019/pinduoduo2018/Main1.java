package Autumn_2019.pinduoduo2018;

import java.util.Scanner;

/**
 * @author : JasonRen
 * @date : 2018-07-22 下午4:02
 * @email : zhicheng_ren@163.com
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = in.nextInt();
            y[i] = in.nextInt();
        }
        int result = 0;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    result += isOneLine(x[i], y[i], x[j], y[j], x[k], y[k]) ? 0 : 1;
                }
            }
        }
        System.out.println(result);

    }

    public static boolean isOneLine(int x1, int y1, int x2, int y2, int x3, int y3){
        return (y3 - y2) * (x2 - x1) == (x3 - x2) * (y2 - y1);
    }

}
