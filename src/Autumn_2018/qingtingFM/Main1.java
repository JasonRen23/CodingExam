package Autumn_2018.qingtingFM;


import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in); 
		String A = String.valueOf(in.nextLine().trim());
		String B = String.valueOf(in.nextLine().trim());
//		System.out.println(A);
//		System.out.println(B);
	    System.out.println(compare(A, B));
//			if(a[i] )
//		}
		
	}

	
	public static int compare(String verA, String verB) {
	    String[] levels1 = verA.split("\\.");
	    String[] levels2 = verB.split("\\.");
	    
	    int length = Math.max(levels1.length, levels2.length);
	    for (int i=0; i<length; i++) {
	    	Integer v1 = i < levels1.length ? Integer.parseInt(levels1[i]) : 0;
	    	Integer v2 = i < levels2.length ? Integer.parseInt(levels2[i]) : 0;
	    	int compare = v1.compareTo(v2);
	    	if (compare != 0) {
	    		return compare;
	    	}
	    }
	    
	    return 0;
	}


}

