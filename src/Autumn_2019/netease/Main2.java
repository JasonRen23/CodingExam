package Autumn_2019.netease;

import java.util.Scanner;

/**
 * 5
 * 2 7 3 4 9
 * 3
 * 1 25 11
 *
 * @author JasonRen
 * @since 2018/8/11 下午4:01
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] apple = new int[n];
        for (int i = 0; i < n; i++) {
            apple[i] = sc.nextInt();
        }

        long[] sum = new long[n];
        sum[0] = apple[0];
        for (int i = 1; i < n; i++) {
            sum[i] = sum[i - 1] + apple[i];
        }

        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            long q = sc.nextLong();
            System.out.println(binarySearch(sum, q) + 1);
        }



    }

    public static int binarySearch(long[] A, long target){
        int lo = 0;
        int hi = A.length - 1;
        int mid;
        while (lo <= hi){
            mid = lo + (hi - lo) / 2;
            if(A[mid] == target){
                return mid;
            }else if(A[mid] < target){
                lo = mid + 1;
            }else {
                hi = mid - 1;
            }
        }
        return lo;
    }

}
