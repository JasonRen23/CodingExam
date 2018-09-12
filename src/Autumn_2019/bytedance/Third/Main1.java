package Autumn_2019.bytedance.Third;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        System.out.println(helper(line));
    }

    public static int helper(String s) {
        int i = 0, j = 0;
        int ret = 0;
        int[] mark = new int[128];
        while (j < s.length()) {
            char c = s.charAt(j);
            if (mark[c] > i) {
                if (j - i > ret)
                    ret = j - i;
                i = mark[c];
            } else {
                mark[c] = j + 1;
                j++;
            }
        }

        if(j - i > ret)
            ret = j- i;
        return ret;
    }
}
