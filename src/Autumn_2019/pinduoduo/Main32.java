package Autumn_2019.pinduoduo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main32 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int z = a / b;
        int[] n = new int[10000];
        int[] leftArr = new int[10000]; //余数
        leftArr[0] = a % b;
        Boolean flag = false;
        int left, start = 0, end = 0;
        for (int i = 0; ; i++) {
            left = leftArr[i] * 10;
            n[i] = left / b;
            leftArr[i + 1] = left % b;
            for (int j = 0; j <= i; j++) {
                if (leftArr[i + 1] == leftArr[j]) {
                    flag = true;
                    start = j;
                    end = i + 1;
                }
            }
            if (flag) break;
        }

        List<Integer> ret = new ArrayList<>();
        // int len = r - l;
        StringBuilder stringBuilder = new StringBuilder();
        for (int k = start; k < end; k++)
            stringBuilder.append(String.valueOf(n[k]));
        if (stringBuilder.toString().equals("0")) {
            ret.add(start);
            ret.add(0);
        } else {
            ret.add(start);
            ret.add(stringBuilder.length());
        }

        System.out.println(ret.get(0) + " " + ret.get(1));



    }
}

