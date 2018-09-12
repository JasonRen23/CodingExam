package Autumn_2019.alibaba;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line1 = sc.nextLine();
        String line2 = sc.nextLine();

        String[] loc = line1.split(",");
        String[] shape = line2.split(",");
        Point targetPoint = new Point(Double.valueOf(loc[0]), Double.valueOf(loc[1]));
        List<Point> pointList = new ArrayList<>();

        for (int i = 0; i < shape.length; i = i + 2) {
            int index1 = i;
            int index2 = i + 1;
            Point point = new Point(Double.valueOf(shape[index1]), Double.valueOf(shape[index2]));
            pointList.add(point);
        }

        int dis = 0;
        for (int i = 1; i < pointList.size(); i++) {

        }


        if (helper2(targetPoint, pointList)) {
            System.out.println("yes,0");
        } else {
            System.out.println("no,1");
        }



    }


    public static boolean helper2(Point point, List<Point> list) {
        int crossing = 0;
        for (int i = 0; i < list.size(); i++) {
            if (point.equals(list.get(i)))
                return true;
        }
        for (int i = 0; i < list.size() - 1; i++) {
            double slope = (list.get(i + 1).getY() - list.get(i).getY()) / (list.get(i + 1).getX() - list.get(i).getX());
            boolean cond1 = (list.get(i).getX() <= point.getX()) && (point.getX() < list.get(i + 1).getX());
            boolean cond2 = (list.get(i + 1).getX() <= point.getX()) && (point.getX() < list.get(i).getX());
            boolean above = (point.getY() < slope * (point.getX() - list.get(i).getX()) + list.get(i).getY());

            if (cond1 || cond2 && above) crossing++;
        }
        return crossing % 2 != 0;
    }


    public static int dist(Point p, Point a, Point b) {
        double[] AB = new double[2];
        AB[0] = b.getX() - a.getX();
        AB[1] = b.getY() - a.getY();


        double[] AP = new double[2];
        AP[0] = p.getX() - a.getX();
        AP[1] = p.getY() - a.getY();

        double AB_AP = AB[0] * AP[0] + AB[1] * AP[1];
        double distAB2 = AB[0] * AB[0] + AB[1] * AB[1];
        double[] D = new double[2];
        D[0] = a.getX();
        D[1] = a.getY();
        if (distAB2 != 0) {
            double t = AB_AP / distAB2;
            if (t > 1) {
                D[0] = b.getX();
                D[1] = b.getY();
            } else if (t > 0) {
                D[0] = a.getX() + AB[0] * t;
                D[1] = a.getY() + AB[1] * t;
            } else {
                D[0] = a.getX();
                D[1] = a.getY();
            }
        }
        double[] AD = new double[2];
        AD[0] = p.getX() - a.getX();
        AD[1] = p.getY() - a.getY();
        return (int) Math.sqrt(AD[0] * AD[0] + AD[1] * AD[1]);
    }
}

class Point {
    public double x;
    public double y;

    public Point(final double x, final double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(final double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(final double y) {
        this.y = y;
    }

    public boolean equals(final Point point) {
        if (this.x == point.x && this.y == point.y)
            return true;
        return false;
    }
}
