package Autumn_2019.pinduoduo2018;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * @author : JasonRen
 * @date : 2018-07-22 下午4:52
 * @email : zhicheng_ren@163.com
 */

 class Node {
    int power;
    int food;
    Node(int power, int food){
        this.power = power;
        this.food = food;
    }
}



class PairComparator implements Comparator<Node> {

    public int compare(Node o1, Node o2) {
        return o2.power - o1.power;
    }
}
public class Main3 {


        public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        Node[] bears = new Node[n];
        int[] candy = new int[m];
        for (int i = 0; i < m; i++) {
            candy[i] = in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            bears[i] = new Node(in.nextInt(), in.nextInt());
        }

        Arrays.sort(candy);
        Arrays.sort(bears, new PairComparator());
        for (int i = m - 1; i >= 0; i--) {
            for (int j = 0; j < n; j++) {
                if(bears[j].food >= candy[i]){
                    bears[j].food -= candy[i];
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println(bears[i].food);
        }


    }
}
