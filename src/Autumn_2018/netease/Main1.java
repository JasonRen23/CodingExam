package Autumn_2018.netease;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
        String str = in.nextLine();
		int len=str.length();
		char[] num = new char[len];
		num = str.toCharArray();
	
		int[] sum =new int[100];
        int ret = 1;
		sum[0] = 1;
		for (int i=1;i<len;i++){
			if (num[i] != num[i-1])
	       {
	            sum[i]=sum[i-1]+1;
	            ret=Math.max(ret,sum[i]);
	         } else{
	        	 sum[i]=1;
	         }
		}
	       
	        System.out.println(ret); 	
	}

}
