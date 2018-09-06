package Autumn_2019.ctrip;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long target = sc.nextLong();
        Node[] nodes = new Node[N];
        for (int i = 0; i < N; i++) {
            int index = sc.nextInt();
            long lo = sc.nextLong();
            long hi = sc.nextLong();
            nodes[i] = new Node(index, lo, hi);
        }

        Arrays.sort(nodes, new Comparator<Node>() {
            @Override
            public int compare(final Node node1, final Node node2) {
                if (node1.lo < node2.lo) {
                    return -1;
                } else if (node1.lo == node2.lo) {
                    if (node1.hi < node2.hi) {
                        return -1;
                    } else if (node1.hi > node2.hi) {
                        return 1;
                    } else {
                        return 0;
                    }
                } else {
                    return 1;
                }
            }
        });

        int ret = binarySearch(nodes, target);
        if (ret != -1){
            System.out.println(ret);
        } else {
            System.out.println("null");
        }
    }


    public static int binarySearch(Node[] A, long target) {
        int lo = 0;
        int hi = A.length - 1;
        int mid;
        while (lo <= hi) {
            mid = lo + (hi - lo) / 2;
            if (A[mid].lo == target) {
                return mid;
            } else if (A[mid].lo < target) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }

        if (target >= A[lo - 1].lo && target <= A[lo - 1].hi) {
            return A[lo - 1].index;
        } else if (target >= A[lo].lo && target <= A[lo].hi) {
            return A[lo].index;
        } else if (target >= A[lo + 1].lo && target <= A[lo + 1].hi) {
            return A[lo + 1].index;
        } else {
            return -1;
        }
    }
}

class Node {
    int index;
    long lo;
    long hi;

    public Node(final int index, final long lo, final long hi) {
        this.index = index;
        this.lo = lo;
        this.hi = hi;
    }


}
