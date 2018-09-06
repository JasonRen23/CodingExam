package Autumn_2019.meituan;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 82%
 */
public class Main21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int t = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 0;
        for (int i = 0; i <= arr.length - k; i++) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int j = i; j <= k + i - 1; j++) {
                map.put(arr[j], map.getOrDefault(arr[j], 0) + 1);

            }

            if (check(map, t)) {
                count++;
            }
        }
        System.out.println(count);

    }

    static boolean check(Map<Integer, Integer> map, int t) {
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() >= t){
                return true;
            }
        }
        return false;
    }
}
