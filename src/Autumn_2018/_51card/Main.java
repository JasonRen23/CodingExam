package Autumn_2018._51card;


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String row_x=String.valueOf(in.nextLine().trim());
		String[] row_y=row_x.split(" ");
		char[] a;
		char[] b;
		a = row_y[0].toCharArray();
		b = row_y[1].toCharArray();
		mul(a, b);
//	 System.out.println(a);
//	 System.out.println(b);
	}

	
	public static void mul(char[] ch1, char[] ch2)  
	{  
	    int len1=ch1.length,len2=ch2.length;  
	    char[] ch3 = new char[1000009];  
	    int i,j,carry;  
	    for (i=0; i<1000009; i++)  
	        ch3[i]='\0';//=0  
	    for (i=0; i<len1; i++)  
	    {  
	        for (j=0; j<len2; j++)//�������asc�����128  
	        {  
	            ch3[i+j]=(char)(ch3[i+j]+(ch1[i]-'0')*(ch2[j]-'0'));//�������ַ��ͱ�ʾch3Ҫע��  
	            if (ch3[i+j]>9&&(i+j)>0)  
	            {  
	               ch3[i+j-1]+=ch3[i+j]/10;  
	               ch3[i+j]=(char)(ch3[i+j]%10);  
	            }  
	        }  
	    }  
	    for (i=len1+len2-1; i>0; --i)//��ֹ�����λʱ����9�����   
	    {  
	        if (ch3[i]>9)  
	        {  
	            ch3[i-1]=(char) (ch3[i-1]+ch3[i]/10);  
	            ch3[i]%=10;  
	        }  
	    }  
	  
	    if (ch3[0]>9)//if (ch[3]>99)  
	    {  
	        System.out.print((char)(ch3[0]/10)); 
	        ch3[0]=(char) (ch3[0]%10);  
	    }  
	    for (i=0; i<len1+len2-1; i++)  
	        System.out.print((char)(ch3[i]+48));  
	     
	}  
}
