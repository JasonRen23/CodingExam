package Spring_2019.pinduoduo;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] line = sc.nextLine().split(":");
        int[] time = new int[2];
        time[0] = Integer.valueOf(line[0]);
        time[1] = Integer.valueOf(line[1]);
        if(time[0] > 12)
            time[0] = time[0] - 12;
        double angle = Math.abs(5.5 * time[1] - 30 * time[0]);
        if(angle >= 180)
            angle = 360 - angle;
        String points = String.valueOf(angle);
        String[] point = points.split("\\.");
        if(Integer.valueOf(point[0]) + Integer.valueOf(point[1]) > angle)
            System.out.println(angle);
        else
            System.out.println((int)angle);
    }
}
