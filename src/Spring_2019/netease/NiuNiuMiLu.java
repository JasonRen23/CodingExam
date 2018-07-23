package Spring_2019.netease;

import java.util.Scanner;

public class NiuNiuMiLu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.valueOf(sc.nextLine());
        String direct = sc.nextLine();
        String str = "NESW";
        char[] map = str.toCharArray();
        int cur = 0;
        for(int i = 0; i < direct.length(); i++){
            if(direct.charAt(i) == 'L'){
                cur = cur - 1 < 0 ? map.length - 1 : cur - 1;
            }else {
                cur = cur + 1 > map.length - 1 ? 0 : cur + 1;
            }
        }
        System.out.println(map[cur]);
    }
}
