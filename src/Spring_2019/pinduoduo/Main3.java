package Spring_2019.pinduoduo;


import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x_i = new int[n];
        int[] y_i = new int[n];
        for(int i = 0; i < n; i++){
            x_i[i] = sc.nextInt();
            y_i[i] = sc.nextInt();
        }
        int count = 0;
        for(int i = 0; i < n - 2; i++){
            for(int j = i + 1; j < n - 1; j++){
                for(int k = j + 1; k < n; k++){
                    if((x_i[j]-x_i[i])*(y_i[k]-y_i[i])!=(x_i[k]-x_i[i])*(y_i[j]-y_i[i]))
                        count++;
                }

            }
        }


        System.out.println(count);
    }

}



