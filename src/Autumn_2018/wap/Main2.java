package Autumn_2018.wap;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

import javax.print.attribute.standard.RequestingUserName;;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		int N = Integer.parseInt(in.nextLine().trim());
		String[] row_x = new String[N];
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		
		for(int i = 0; i < N; ++i){
			row_x[i]=String.valueOf(in.nextLine().trim());
		}
		
		for(int i = 0; i < N; ++i){
            String[] row_y=row_x[i].split(" ");
           
			if(row_y[0].equals("push_front")){
//				System.out.println("ok");
				Integer e = Integer.parseInt(row_y[1]);
				list.addFirst(e);
			}
			if(row_y[0].equals("push_back")){
//				System.out.println("ok");
				Integer e = Integer.parseInt(row_y[1]);
				list.addLast(e);
			}
			if(row_y[0].equals("max")){
				System.out.println(max(list));
			}
			if(row_y[0].equals("pop_front")){
				if(list.isEmpty()) System.out.println("Error"); 
				else{
					System.out.println(list.getFirst());
					list.removeFirst();
					
				}
			}
			if(row_y[0].equals("pop_back")){
				if(list.isEmpty()) System.out.println("Error");
				else{
					System.out.println(list.getLast());
					list.removeLast();
				}
			}
			if(row_y[0].equals("reverse")){
				reverse(list);
			}
		}
		

	}
	
	
	
	public static int max(LinkedList<Integer> list){
		Integer max = Collections.max(list);
		return max;
	}
	
	public static void reverse(LinkedList<Integer> list){
		Collections.reverse(list);
	
	}
	

}
