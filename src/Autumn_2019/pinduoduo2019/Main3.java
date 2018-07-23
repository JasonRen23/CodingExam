package Autumn_2019.pinduoduo2019;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author : JasonRen
 * @date : 2018-07-22 下午7:49
 * @email : zhicheng_ren@163.com
 */
public class Main3 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String dataLine = in.nextLine();
        String[] arr1 = dataLine.split(" ");
        List<Integer> integerList = new ArrayList<>();
        int countHundread = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i].equals("100")){
                countHundread++;
                continue;
            }
            integerList.add(Integer.valueOf(arr1[i]));
        }
        int[] arr




    }
}
