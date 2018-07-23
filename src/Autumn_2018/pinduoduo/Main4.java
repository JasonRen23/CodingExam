package Autumn_2018.pinduoduo;

import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int k = in.nextInt();
		int L = in.nextInt();
		int R = in.nextInt();
		int[] array = new int[n];
		for(int i = 0; i < n; ++i){
			array[i] = in.nextInt();
		}
		System.out.println(lengthOfLIS(array));
	}
	
	public static int lengthOfLIS(int[] nums) {
	    int[] tails = new int[nums.length];
	    int size = 0;
	    for (int x : nums) {
	        int i = 0, j = size;
	        while (i != j) {
	            int m = (i + j) / 2;
	            if (tails[m] < x)
	                i = m + 1;
	            else
	                j = m;
	        }
	        tails[i] = x;
	        if (i == size) ++size;
	    }
	    return size;
	}
 static	int LCIS(int arr1[], int n, int arr2[], int m)
	{
	    // table[j] is going to store length of LCIS
	    // ending with arr2[j]. We initialize it as 0,
       int[] table = new int[m];
	    for (int j=0; j<m; j++)
	        table[j] = 0;
	 
	    // Traverse all elements of arr1[]
	    for (int i=0; i<n; i++)
	    {
	        // Initialize current length of LCIS
	        int current = 0;
	 
	        // For each element of arr1[], trvarse all
	        // elements of arr2[].
	        for (int j=0; j<m; j++)
	        {
	            // If both the array have same elements.
	            // Note that we don't break the loop here.
	            if (arr1[i] == arr2[j])
	                if (current + 1 > table[j])
	                    table[j] = current + 1;
	 
	            /* Now seek for previous smaller common
	               element for current element of arr1 */
	            if (arr1[i] > arr2[j])
	                if (table[j] > current)
	                    current = table[j];
	        }
	    }
	 
	    // The maximum value in table[] is out result
	    int result = 0;
	    for (int i=0; i<m; i++)
	        if (table[i] > result)
	           result = table[i];
	 
	    return result;
	}
	
}
