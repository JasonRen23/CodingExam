package Spring_2019.paypal;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] fight = new int[N + 1];
        for(int i = 0; i < N + 1; i++){
            fight[i] = 1;
        }
        int[] a = new int[N - 1];
        int[] b = new int[N - 1];
        for(int i = 1; i <= N - 1; i++){
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            a[i - 1] = num1;
            b[i - 1] = num2;
            fight[num1]++;
            fight[num2]++;
        }

        int[] temp = Arrays.copyOf(fight, N + 1);
        Arrays.sort(fight);
        int max1 = fight[N], max2 = fight[N - 1];
        int index1 = 0;

        for(int i = 1; i <= N; i++){
            if(temp[i] == max1){
                index1 = i;
            }
        }

        Set<Integer> myset = new HashSet<>();
        for(int i = 0; i < N - 1; i++){
            if(a[i] == max1){
                myset.add(b[i]);
            }else if(b[i] == max1){
                myset.add(a[i]);
            }
        }

        int knife = 0;
        for(int i = 0; i < N - 1; i++){
            if(a[i] == max2){
                if(myset.contains(b[i])){
                    knife = b[i];
                }
            }else if(b[i] == max1){
                if(myset.contains(a[i])){
                    knife = a[i];
                }
            }
        }

        System.out.println(knife +" " + index1);


    }
}
