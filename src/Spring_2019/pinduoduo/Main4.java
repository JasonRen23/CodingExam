package Spring_2019.pinduoduo;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int max_index = 0, min_index = 0, dis = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0;i<k;i++){
            if(arr[i]<min){
                min = arr[i];
                min_index = i;
            }
            if(arr[i]>max){
                max = arr[i];
                max_index = i;
            }
        }

        dis = max - min;

        System.out.print(dis + " ");

        for(int i =1;i<=(n-k);i++){
            if((max_index!=0)&&(min_index!=0)){
                if(arr[i+k-1]<min){
                    min = arr[i+k-1];
                    min_index = k;
                }
                if(arr[i+k-1]>max){
                    max = arr[i+k-1];
                    max_index = k;
                }
                max_index--;
                min_index--;
            }
            else{
                min = Integer.MAX_VALUE;
                max = Integer.MIN_VALUE;
                for(int j = 0;j<k;j++){
                    if(arr[i+j]<min){
                        min = arr[i+j];
                        min_index = j;
                    }
                    if(arr[i+j]>max){
                        max = arr[i+j];
                        max_index = j;
                    }
                }
            }
            dis = max - min;
            System.out.print(dis);
            if(i != (n-k)){
                System.out.print(" ");
            }
        }


    }
}
