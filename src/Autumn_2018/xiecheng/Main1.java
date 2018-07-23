package Autumn_2018.xiecheng;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		int N = Integer.parseInt(in.nextLine().trim());
		int[] array = new int[N];
		for(int i = 0; i < N; ++i){
			array[i] = Integer.parseInt(in.nextLine().trim());
		}
		System.out.println(firstMissingPositive(array));
	}
	 public static int firstMissingPositive(int[] A) {
        int i = 0;
        while(i < A.length){
            if(A[i] == i+1 || A[i] <= 0 || A[i] > A.length) i++;
            else if(A[A[i]-1] != A[i]) swap(A, i, A[i]-1);
            else i++;
        }
        i = 0;
        while(i < A.length && A[i] == i+1) i++;
        return i+1;
    }
	    
	  public static void swap(int[] A, int i, int j){
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
}
