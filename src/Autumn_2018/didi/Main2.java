package Autumn_2018.didi;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		
		
		String arrayline_1=String.valueOf(in.nextLine().trim());
		String[] arrayline_2=arrayline_1.split(" ");
		
		int[] array = new int[arrayline_2.length];
		for(int i =0; i < arrayline_2.length; i ++) {
			
			array[i] = Integer.parseInt(arrayline_2[i]);

        }
		
		int k=0;
		k = Integer.parseInt(in.nextLine().trim());
		
		System.out.println(findKthLargest(array,k));
	}
	public static int partition(int[] nums, int low, int high){
		int pivot = nums[low];
		while(low<high){
			while(low<high && nums[high]>=pivot) high--;
			nums[low]=nums[high];
			while(low<high && nums[low]<=pivot) low++;
			nums[high] =nums[low];
		}
		nums[low]=pivot;
		return low;
	}
	public static int findKthLargest(int[] nums, int k) {
		k = nums.length-k;
		int low = 0;
		int high = nums.length-1;
		while(low < high){
	    	int pivotloc = partition(nums,low,high);
	    	if(pivotloc==k) 
	    		break;
	    	else if(k<pivotloc){
	    		high = pivotloc-1;
	    	}else if(k>pivotloc){
	    		low = pivotloc+1;
	    	}
		}
		return nums[k];
	}
}
