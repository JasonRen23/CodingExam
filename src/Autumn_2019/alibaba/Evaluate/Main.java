package Autumn_2019.alibaba.Evaluate;


import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * @author : JasonRen
 * @date : 2018/08/15
 * @email : zhicheng_ren@163.com
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer N = Integer.parseInt(sc.nextLine());
        Node[] arr = new Node[N];
        for (int i = 0; i < N; i++) {
            String[] line = sc.nextLine().split(",");
            Integer x = Integer.valueOf(line[0]);
            Integer y = Integer.valueOf(line[1]);
            arr[i] = new Node(x, y);
        }


        Arrays.sort(arr, new NodeComparator());
        int count = 0;
        for (int i = 1; i < N; i++) {
            count += Math.abs(arr[i].x - arr[i - 1].x);
            count += Math.abs(arr[i].y - arr[i - 1].y);
        }

        count += arr[0].x;
        count += arr[0].y;
        count += arr[N - 1].x;
        count += arr[N - 1].y;


        System.out.println(count);

    }


}

class Node {
    int x;
    int y;

    Node(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class NodeComparator implements Comparator<Node> {
    @Override
    public int compare(Node a, Node b) {
        if (a.x != b.x) {
            return b.x - a.x;
        } else {
            return b.y - a.y;
        }
    }
}