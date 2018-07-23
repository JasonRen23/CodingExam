package Autumn_2018._51card;

import java.util.Scanner;

public class Main1 {  
    public static void main(String[] args) throws Exception {  
        Scanner in = new Scanner(System.in);  
        int n = in.nextInt();  
        if (n <= 0 && n > 20) {  
            System.out.println();  
        } else if (n > 0 && n <= 20) {  
            int[][] a = new int[30][2];  //��������У�һ��ԭ���ݣ�һ����ÿ�������ֵĴ���  
            for (int i = 0; i < n; i++)  
                a[i][0] = in.nextInt();  
            a[0][1] = 1;  
            for (int i = 1; i < n; i++) {  
                int num = 1;        //��¼���ݳ��ֵĴ���  
                if (a[i - 1][0] == a[i][0]) {  
                    num++;  
                }  
                a[i][1] = num;  
            }  
            int result = a[0][0];  
            int m = 1;  
            for (int i = 1; i < n; i++) {  
                if (m < a[i][1]) {  
                    result = a[i][0];  
                    m = a[i][1];  
                }  
            }  
            System.out.println(result);  
        }  
    }  
}  