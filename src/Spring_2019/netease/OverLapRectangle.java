package Spring_2019.netease;


import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class OverLapRectangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int n = sc.nextInt();
        final int maxn = 50 + 5;
        int[] X1 = new int[maxn];
        int[] Y1 = new int[maxn];
        int[] X2 = new int[maxn];
        int[] Y2 = new int[maxn];
        Set<Integer> xx = new TreeSet<>(), yy = new TreeSet<>();
        for(int i = 0; i < n; i++){
            X1[i] = sc.nextInt();
            xx.add(X1[i]);
        }
        for(int i = 0; i < n; i++){
            Y1[i] = sc.nextInt();
            yy.add(Y1[i]);
        }
        for(int i = 0; i < n; i++){
            X2[i] = sc.nextInt();
            xx.add(X2[i]);
        }
        for(int i = 0; i < n; i++){
            Y2[i] = sc.nextInt();
            yy.add(Y2[i]);
        }

        int ret = 1;
        for(int x : xx){
            for(int y : yy){
                int cnt = 0;
                for(int i = 0; i < n; i++){
                    if(X1[i] <= x && Y1[i] <= y && X2[i] > x && Y2[i] > y) cnt++;
                }
                ret = Math.max(ret, cnt);
            }
        }
        System.out.println(ret);

    }

}
