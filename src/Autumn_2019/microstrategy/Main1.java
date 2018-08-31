package Autumn_2019.microstrategy;

import java.util.*;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> a = new ArrayList<>();
        a.add("hello");
        a.add("ok");

        List<String> b = new ArrayList<>();
        b.add("of");
        b.add("bye");

        commonSubString(a, b);
    }

    static void commonSubString(List<String> a, List<String> b) {
        List< String> ret = new ArrayList<>();
        for (int i = 0; i < a.size(); i++) {
            if (findCommon(a.get(i), b.get(i))) {
                ret.add("YES");
            } else {
                ret.add("NO");
            }
        }
        for(String index : ret) {
            System.out.println(index);
        }

    }
    static boolean findCommon(String A, String B) {
        String str;
        if (A.length() < B.length()) {
            String temp = A;
            A = B;
            B = temp;
        }
        for (int i = B.length(); i > 0; i--) {
            for (int j = 0; j < i; j++) {
                str = B.substring(j, i);
                if (A.indexOf(str) != -1){
                    return true;
                }
            }
        }
        return false;
    }
}
