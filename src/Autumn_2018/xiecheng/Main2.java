package Autumn_2018.xiecheng;


import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		String str = in.nextLine();
		System.out.println(sub(str));
	}
	static String sub(String str){    
        StringBuffer result = new StringBuffer();    
        ArrayList<Character> list = new ArrayList<Character>();    
        char[] cs = str.toCharArray();    
        for(int i=0; i<cs.length; i++){    
            if(!list.contains(cs[i])){    
                result.append(cs[i]);    
                list.add(cs[i]);    
            }    
        }    
        return result.toString();    
    }    

}
