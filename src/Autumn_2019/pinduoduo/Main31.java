package Autumn_2019.pinduoduo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        List<Integer> arr1 = new ArrayList<>();
        List<Integer> arr2 = new ArrayList<>();

        int first = -1;

        while (true) {
            arr1.add(a / b);
            int left = a % b;
            if (left == 0) break;

            first = arr2.indexOf(left);

            if (first >= 0) {
                break;
            } else {
                arr2.add(left);
            }

            a = left * 10;


        }

        List<Integer> ret = new ArrayList<>();
        if (first == -1) {
            ret.add(arr2.size());
        } else {
            ret.add(first);
        }

        StringBuilder rotate = new StringBuilder();
        boolean flag = false;

        for (int i = 1; i < arr1.size(); i++) {
            if (i == first + 1) {
                flag = true;
            }

            if (flag) {
                rotate.append(arr1.get(i));
            }
        }


        if (first >= 0) {
            ret.add(rotate.length());
        } else {
            ret.add(0);
        }


        System.out.println(ret.get(0) + " " + ret.get(1));

    }


}
