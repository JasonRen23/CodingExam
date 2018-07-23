package Autumn_2018.pingan;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in); 
		String row_x=String.valueOf(in.nextLine().trim());
		char[] a;
		
		a = row_x.toCharArray();
		int[] b = new int[a.length];

		int[] arr = {0,1,2,3,4,5,6,7,8,9};
		
		
		List<Integer> list = new ArrayList<Integer>();//0-9
		List<Integer> list2 = new ArrayList<Integer>();//duplicate
		for(int i = 0;i < arr.length; i++){

			list.add(arr[i]);
			
		}
		boolean flag = false;
		int index = 0;
		int number;
		for(int i = 0;i < a.length; i++){
			number = a[i]-'0';
//			System.out.println(number);
			
			if (!list2.contains(number)){
				list2.add(number);
				
				b[i] = number;
				
				for (int j = 0; j < list.size(); j++) { 
					  
					if (list.get(j) == number) { 
					  
						list.remove(j); 
					  
					break; 
				}	
			}
				
				
			}else{
				flag = true;
			}
			
			if(flag == true || i == a.length-1){
				index = i; 
				break;
			}
			
		}
		
		for(int j = index;j < a.length; j++){
			number = a[j]-'0';
//			System.out.println("index is"+index);
////			System.out.println(number);
//			System.out.println(list.toString());
			if(j == index){
				for(int i = 0; i < list.size(); i++){
					int num = list.get(i);
//					System.out.println("num is" + num);
					if(num > number){
						b[j] = num;
						list.remove(i);
						break;
					}
				}
			}else{
				b[j] = list.get(0);
			}
			
			
			
			
		}
		
	   for (int i = 0; i < b.length;i++){
		   System.out.print(b[i]);
	   }
	
		
		
	}
	
	
}
