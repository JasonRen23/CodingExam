package Autumn_2019.microstrategy.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();

        System.out.println(oddNumbers(l, r));
    }

    public static List<Integer> oddNumbers(int l, int r){
        int firstOdd = l % 2 == 1 ? l : l + 1;
        List<Integer> ret = new ArrayList<>();
        for (int i = firstOdd; i <= r; i = i + 2) {
            ret.add(i);
        }
        return ret;
    }
}
