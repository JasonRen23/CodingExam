package Autumn_2018.didi;


import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		String arrayline_1 = String.valueOf(in.nextLine().trim());
		String[] arrayline_2 = arrayline_1.split(" ");
		
		int[] array = new int[arrayline_2.length];
		for(int i = 0; i < array.length; ++i) {
			array[i] = Integer.parseInt(arrayline_2[i]);
        }
		System.out.println(addmaxSum(array));
	}
	
	public static int addmaxSum(int[] arr){
		
	int sum = arr[0];
	int maxSum = sum;
     for(int i = 1, len = arr.length; i < len; i++){
    	 if(sum <= 0){
    		 sum = arr[i];
    	}else {
		     sum += arr[i];
	    }
    	 
    	 maxSum = sum > maxSum ? sum : maxSum;
    	 System.out.println("maxsum="+maxSum);
     }

	    return maxSum;	
	
  }

}
