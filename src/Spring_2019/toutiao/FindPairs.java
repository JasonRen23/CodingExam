package Spring_2019.toutiao;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindPairs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }

        System.out.println(findPairs_1(arr, k));
        System.out.println(findPairs_2(arr, k));
    }

    public static int findPairs_1(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k < 0) return 0;

        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int i : nums){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            if (k == 0){
                if (entry.getValue() >= 2){
                    count++;
                }
            }else{
                if (map.containsKey(entry.getKey() + k)){
                    count++;
                }
            }
        }
        return count;
    }

    public static int findPairs_2(int[] nums, int k){
        if (nums == null || nums.length == 0 || k < 0) return 0;
        Arrays.sort(nums);
        int ans = 0;
        for (int i = 0, j = 1; j < nums.length;) {
            if (j <= i || nums[i] + k > nums[j]) {
                j++;
            } else if (i > 0 && nums[i] == nums[i - 1] || nums[i] + k < nums[j]) {
                i++;
            } else {
                ans++;
                i++;
            }
        }
        return ans;
    }


}
