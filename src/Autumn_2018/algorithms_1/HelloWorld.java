package Autumn_2018.algorithms_1;
import java.util.Scanner;
import edu.princeton.cs.algs4.TwoPersonZeroSumGame;
import java.util.*;
import java.util.Arrays; 
public class HelloWorld{
	      
	public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
	System.out.println("Please input your array:");
	
	 String inputString=in.next().toString();
	   String stringArray[]=inputString.split(",");
	   int num[]=new int[stringArray.length];
	   for(int i=0;i<stringArray.length;i++){
	    num[i]=Integer.parseInt(stringArray[i]);
	   	   }
	   
	HelloWorld sum=new HelloWorld();
	System.out.println(Arrays.toString(sum.twoSum(num, 6)));
	 /*for(int j = 0 ; j < sum.threeSum(num).size() ; j++)
     {
         int[] array =(int[])sum.threeSum(num).get(j);
         for(int i = 0; i < array.length ; i++)
         {
             System.out.print(array[i] + " ");
         }
     }*/
	}
	public int[] twoSum(int[] nums,int target){

	       if(nums==null||nums.length<2){
	       return null;
	       }
	      int max=nums[0];
	      int min=nums[0];
	      for(int i=1;i<nums.length;i++){
	       if(nums[i]>max){
	        max=nums[i];
	          }else if(nums[i]<min){
	         min=nums[i]; 
	          }
	      }
	       int start=Math.max(min,target-max);
	       int end=Math.min(max,target-min);
	        Integer[] buf=new Integer[end-start+1];
	         int[] res=new int[2];
	         for(int i=0;i<nums.length;i++){
	          if(nums[i]>=start&&nums[i]<=end){
	            if(target-nums[i]>=start&&target-nums[i]<=end&&buf[target-nums[i]-start]!=null){
	                 res[0]=buf[target-nums[i]-start];
	                 res[1]=i;
	                 break;
	                  }
	              buf[nums[i]-start]=i;
	             }
	           }

	return res;

	}
}
		    
		    
		    
