package Autumn_2018.jingdong;


import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		String str = in.nextLine();
		System.out.println(shortestPalindrome(str));
	}
	public static int shortestPalindrome(String s) {
	    int i = 0, end = s.length() - 1, j = end; char chs[] = s.toCharArray();
	    while(i < j) {
	         if (chs[i] == chs[j]) {
	             i++; j--;
	         } else { 
	             i = 0; end--; j = end;
	         }
	    }
	    String shortest = new StringBuilder(s.substring(end+1)).reverse().toString() + s;
	    return shortest.length();
	}
}
