package Autumn_2018.netease;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner in =new Scanner(System.in);
       int x  = in.nextInt();
       int f = in.nextInt();
       int d = in.nextInt();
       int p = in.nextInt();
  

      int dayfee = x + p;
      int restmon = d - f * x;
      int ret = f; 
      ret = ret + (int)Math.ceil(restmon/dayfee);
      System.out.println(ret);
	}

}
