package Spring_2019.huawei;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine());
        String[] liuCost = sc.nextLine().split(" ");
        String[] coinCost = sc.nextLine().split(" ");

        int n = liuCost.length;
        int[] x = new int[n];
        int[] y = new int[n];
        for(int i = 0; i < n; i++){
            x[i] = Integer.parseInt(liuCost[i]);
            x[i] = Integer.parseInt(coinCost[i]);
        }
        int size=x.length;

        double[] value=new double[size];
        int[] tags=new int[size];
        for(int i=0;i<size;i++){
            value[i]=(double)y[i]/x[i];
            tags[i]=i;
        }
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(value[i]<value[j]){
                    double tmp=value[i];
                    value[i]=value[j];
                    value[j]=tmp;

                    int tag=tags[i];
                    tags[i]=tags[j];
                    tags[j]=tag;
                }
            }
        }
        for(int i=0;i<size;i++){
            if(x[tags[i]]<a){
                System.out.println(tags[i]);
                a=a-x[tags[i]];
            }
        }
    }
}