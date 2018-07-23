package Autumn_2018.zhaohang;


import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		int N = Integer.parseInt(in.nextLine().trim());
		System.out.println(findStrobogrammatic(N));
	}
	
	

	    public static ArrayList<String> findStrobogrammatic(int n) {
	    	ArrayList<String> res = new ArrayList<>();
	        if(n <= 0) return res;
	        if(n == 1) {
	            res.add("0");
	            res.add("1");
	            res.add("8");
	            return res;
	        }
	        char[] arr = new char[n];
	        generator(arr, 0, n - 1, res);
	        return res;
	    }
	    private static void generator(char[] arr, int s, int e, ArrayList<String> ls){
	        if(s > e) {
	            ls.add(String.valueOf(arr));
	            return ;
	        }
	        char[][] allNum = {{'0','0'}, {'1','1'}, {'6','9'},{'8','8'}, {'9','6'}};
	        for(int i = (s == 0)? 1 : 0; i < (s == e ? 3 : 5); i++) {
	            arr[s] = allNum[i][0];
	            arr[e] = allNum[i][1];
	            generator(arr, s + 1, e - 1, ls);
	        }
	    }
	

	
}
