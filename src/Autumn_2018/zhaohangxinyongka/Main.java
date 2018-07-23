package Autumn_2018.zhaohangxinyongka;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
        String row_x=String.valueOf(in.nextLine().trim());
        String[] row_y=row_x.split(",");
        int[] num = new int[3];
        for(int j = 0; j < 3; j++) {
            num[j] = Integer.parseInt(row_y[j]);

        }
        System.out.println(num[0]);
        
	}

}
