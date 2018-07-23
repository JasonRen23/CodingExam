package Spring_2019.netease;

import java.util.Scanner;

public class BeiSanZhengChu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int left = sc.nextInt();
        int right = sc.nextInt();
        int num = (right - left + 1) / 3;
        int ret = 2 * num;
        right -= 3 * num;
        while (left <= right){
            if(left % 3 != 1)
                ret++;
            left++;
        }
        System.out.println(ret);

    }
}
