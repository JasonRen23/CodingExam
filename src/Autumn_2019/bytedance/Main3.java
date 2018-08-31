package Autumn_2019.bytedance;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.valueOf(sc.nextLine());
        List<String> ret = new ArrayList<>();
        for (int i = 0; i < t; i++) {
            int n = Integer.valueOf(sc.nextLine());
            String[] str = new String[n];
            for (int j = 0; j < n; j++) {
                str[j] = sc.nextLine();
            }
            boolean flag = false;
            for (int j = 0; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (str[j].length() == str[k].length()) {
                        if (isRotation(str[j], str[k])) {
                            ret.add("Yeah");
                            flag = true;
                            break;
                        }
                    }
                }
                if (flag)
                    break;
            }
            if (!flag) {
                ret.add("Sad");
            }


        }
        for (String str : ret) {
            System.out.println(str);
        }


    }

    public static String reverse(String s) {
        if (s == null || s.length() == 0)
            return s;
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }

    public static boolean isRotation(String s1, String s2) {

        String temp = s1 + s1;
        return (temp).contains(s2) || (temp).contains(reverse(s2));

    }

}
