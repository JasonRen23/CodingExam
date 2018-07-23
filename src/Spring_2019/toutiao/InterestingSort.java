package Spring_2019.toutiao;

import java.util.*;

public class InterestingSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        int[] arr = new int[N];
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
            map.put(arr[i], i);
        }
        int index = N, ret = 0;
        Arrays.sort(arr);
        for(int i = 0; i < N - 1; i++){
            if(map.get(arr[i]) > map.get(arr[i + 1])){
                map.put(arr[i + 1], index + 1);
                ret++;
            }

        }

        System.out.println(ret);
    }
}
