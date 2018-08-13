package Autumn_2019.pinduoduo2019;

import java.util.Arrays;
import java.util.Scanner;


/**
 * @author : JasonRen
 * @date : 2018-07-22 下午6:56
 * @email : zhicheng_ren@163.com
 */

/**
 * Input:
 * 4 3
 * acbd
 * bacd
 * bdca
 *
 * Output: 0
 *
 * Input:
 * 3 3
 * abc
 * bca
 * cab
 *
 * Output: -1
 *
 * Input:
 * 4 1
 * abac
 *
 * Output: -1
 *
 *
 *
 *
 */


public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), M = sc.nextInt();
        sc.nextLine();
        String[] strs = new String[M];
        for (int i = 0; i < M; i++) {
            strs[i] = sc.nextLine();
        }


        char[][] matrix = new char[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                matrix[i][j] = strs[j].charAt(i);
            }
        }

        String[] output = new String[N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                Arrays.sort(matrix[i]);
                output[i] = new String(matrix[i]);
            }
        }

        System.out.println(Arrays.toString(output));

        String str = output[0];
        int index = 0; //球王编号（索引）

        for (int i = 1; i < N; i++) {
            if (str.compareTo(output[i]) >= 0) {
                str = output[i];
                index = i;
            }
        }

        //处理候选球星中存在形同最高等级的情况
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            if (str.equals(output[i])) {
                cnt++;
            }
        }

        if (cnt > 1)
            index = -1;


        System.out.println(index);


    }
}
