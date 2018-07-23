package Autumn_2018.meituan;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		int N = in.nextInt();
		int[] nums = new int[N];
		for(int i = 0; i < N; ++i){
			nums[i] = in.nextInt();
		}
		int K = in.nextInt();
		
		System.out.println(checkSubarraySum(nums,K));
		

	}
	
	public static int checkSubarraySum(int[] nums, int k) {
        if(nums==null || nums.length < 1) {
            return 0;
        }
        if(nums.length == 1 && nums[0] % k == 0){
        	return 1;
        }
        int maxLen = 0;
        for(int i=0;i<nums.length;i++) {
            int sum=nums[i];
            for(int j=i+1;j<nums.length;j++) {
                sum += nums[j];
                if(sum==0 || (k!=0 && sum%k==0)) {
                	if(j - i > maxLen){
	            		maxLen = j - i;
	            	}
                }
            }
        }
        if(maxLen != 0){
        	return maxLen;
        }
        return 0;
   }
}
