package Spring_2019.tencent;

import java.util.*;

public class IsSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int t = Integer.valueOf(sc.nextLine());
        List<String> ret  = new ArrayList<>();
        int index = 0;
        while (index++ < t){
            String rowx = sc.nextLine();
            String rowy = sc.nextLine();
            String[] row_x = rowx.split(" ");
            String[] row_y = rowy.split(" ");
            int[] x = new int[4];
            int[] y = new int[4];

            for(int i = 0; i < row_x.length; i++){
                x[i] = Integer.valueOf(row_x[i]);
                y[i] = Integer.valueOf(row_y[i]);
            }
            if(solve(x, y)){
                ret.add("Yes");
            }else {
                ret.add("No");
            }
        }
        for(int i = 0; i < ret.size(); i++){
            System.out.println(ret.get(i));
        }
    }

    public static boolean solve(int[] x, int[] y){
        double[] dd = new double[6];
        int index = 0;
        for(int i = 0; i < 3; i++){
            for(int j = i + 1; j < 4; j++){
                dd[index++] = dis(x, y, i, j);
            }
        }
        Map<Double, Integer> map = new HashMap<>();
        for(int i = 0; i < dd.length; i++){
            map.put(dd[i], map.getOrDefault(dd[i], 0) + 1);
        }
        if(map.size() != 2) return false;

        int iter = 0;
        int first = 0;
        int second = 0;
        for(Map.Entry<Double, Integer> entry : map.entrySet()){
            if(iter == 0) first = entry.getValue();
            else if(iter == 1) second = entry.getValue();
            iter++;
        }

        if((first == 2 && second == 4) || (first == 4 && second == 2))
            return true;

        return false;

    }

    public static double dis(int[] x, int[] y, int a, int b){
        return Math.sqrt((double)(x[a] - x[b]) * (x[a] - x[b]) + (y[a] - y[b]) * (y[a] - y[b]));
    }
}
