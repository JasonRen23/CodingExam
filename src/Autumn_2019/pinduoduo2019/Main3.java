package Autumn_2019.pinduoduo2019;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author : JasonRen
 * @date : 2018-07-22 下午7:49
 * @email : zhicheng_ren@163.com
 */

//Input: 130 140 150 160
//Output: 2

//Input: 130 140 150 160 100 100 100
//Output: 3

//Input: 100 100 100 100 100 100 200 200 200
//Output: 4

public class Main3 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String dataLine = in.nextLine();
        String[] strArr = dataLine.split(" ");
        int[] arr = new int[strArr.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(strArr[i]);
        }

        Arrays.sort(arr);

        int count = 0, ret = 0;
        int low = 0, high = arr.length - 1;
        //预处理 去掉整数倍个100
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 100) {
                count++;
            } else
                break;
        }

        if (count >= 3) {
            ret = count / 3;
            low = ret * 3;

        }


        while (low < high) {
            if (arr[low] + arr[high] > 300) {
                high--;
                ret++;
            } else {
                low++;
                high--;
                ret++;
            }
        }


        System.out.println(ret);


    }
}
