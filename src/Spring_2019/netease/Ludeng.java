package Spring_2019.netease;


import java.util.Scanner;

public class Ludeng {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.valueOf(sc.nextLine());
        for(int i = 0; i < n; i++){
            String len = sc.nextLine();
            String road = sc.nextLine();
            System.out.println(helper(road));
        }


    }


    public static int helper(String road){
        int ret = 0;
        for(int i = 0; i < road.length(); i++){
            if(road.charAt(i) == '.')
                ret++;
            else
                continue;
            i += 2;

        }
        return ret;
    }
}
