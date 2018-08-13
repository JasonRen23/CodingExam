package Autumn_2019.pinduoduo2019;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author : JasonRen
 * @date : 2018-07-23 下午3:15
 * @email : zhicheng_ren@163.com
 */
public class test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String str = sc.nextLine();
            String[] split = str.split(" ");
            int[] pack = new int[split.length];
            for (int i = 0; i < split.length; i++) {
                pack[i] = Integer.valueOf(split[i]);
            }
            Arrays.sort(pack);
            System.out.println(Car(pack));
        }
    }
    public static Integer Car(int[] packge){
        int i = 0, j= packge.length - 1, num = 0;
        while (i < j){
            if(packge[i] + packge[j] > 300){
                num++;
                j--;
            }else if(packge[i] + packge[j] <= 300){
                num++;
                j--;
                i++;
            }
        }
        if(i == j)
            num ++;
        return num;
    }
}
