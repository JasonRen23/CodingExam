package Autumn_2019.bytedance.Third;

import java.util.*;

public class Main52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] data = new int[m][2];
        for (int i = 0; i < m; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            data[i][0] = x;
            data[i][1] = y;
        }

        List<Set<Integer>> dp = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            dp.add(new HashSet<>());
        }
        for (int i = 0; i < m; i++) {
            dp.get(data[i][1] - 1).add(data[i][1] - 1);
            dp.get(data[i][1] - 1).add(data[i][0] - 1);
        }
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = 0; i < m; i++) {
                if (dp.get(data[i][1] - 1).addAll(dp.get(data[i][0] - 1))) {
                    flag = true;
                }
            }
        }

        int count = 0;
        for (Set set : dp) {
            if (set.size() == n) {
                count++;
            }
        }

        System.out.println(count);
    }
}
