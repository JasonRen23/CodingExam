package Autumn_2019.alibaba;

import java.util.ArrayList;
import java.util.Scanner;

public class Main1 {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        while (N-- > 0) {
            list.add(in.nextInt());
        }
        System.out.println(fun(list));
    }


    public static int fun(ArrayList<Integer> list) {
        if (list.size() < 3) {
            return 0;
        }
        int res = 0;
        for (int i = 1; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                double a = list.get(0), b = list.get(i), c = list.get(j);
                boolean flag;
                if (b - a == c - b || c / b == b / a) {
                    flag = b - a == c - b ? true : false; //标记等差或等比
                    double index = flag ? (b - a) : (b / a); //比值或差值
                    ArrayList<Integer> temp = (ArrayList<Integer>) list.clone();   //找出j位置后符合条件的值
                    for (int k = j + 1; k < temp.size(); ) {
                        int x = temp.get(k);
                        if ((flag && x - c == index) || (!flag && x / c == index)) { //等差或等比
                            c = x; //更新最后一个位置的值
                            temp.remove(k);
                        } else {
                            k++;
                        }
                    }

                    temp.remove(0);
                    temp.remove(i - 1);
                    temp.remove(j - 2);    //a,b,c三个值不进入下层递归
                    if (temp.size() == 0) {
                        res += list.size() / 3;
                    } else {
                        res += (list.size() - temp.size()) / 3 * fun(temp); //递归剩下的数组
                    }
                } else
                    continue;
            }
        }
        return res;
    }}


