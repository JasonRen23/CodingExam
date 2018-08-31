package Autumn_2019.microstrategy.test;

import java.lang.reflect.Array;
import java.util.*;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> arr = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }
        int k = sc.nextInt();
        System.out.println(findNumber(arr, k));
    }

    public static String findNumber(List<Integer> arr, int k) {
        final Integer[] array = arr.toArray(new Integer[arr.size()]);
        Arrays.sort(array);
        if (Arrays.binarySearch(array, k) >= 0) {
            return "YES";
        }
        return "NO";
    }


}
