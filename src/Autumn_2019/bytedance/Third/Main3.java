package Autumn_2019.bytedance.Third;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        List<String> ans = new ArrayList<>();
        backtracking(ans, new char[line.length() + 4], line.toCharArray(), 0, 0, 0);
        System.out.println(ans.size());
    }

    private static void backtracking(List<String> ans, char[] path, char[] c, int len, int p, int count) {
        if (count == 4) {
            if (p == c.length)
                ans.add(String.valueOf(path, 0, path.length - 1));
            return;
        }

        for (int i = p, num = 0; i < c.length && i < p + 3; i++) {
            num = 10 * num + c[i] - '0';
            if (num > 255) break;
            path[len++] = c[i];
            path[len] = '.';
            backtracking(ans, path, c, len + 1, i + 1, count + 1);
            if (num == 0) break;
        }

    }
}
