package Spring_2019.zhaohang2;

import java.util.Scanner;

public class Main3 {
    public static int GetUglyNumber(int index){
        if(index < 1){
            return 0;
        }
        int[] pUglyNumbers = new int[index];
        pUglyNumbers[0] = 1;
        int nextUglyIndex = 1;

        int pMultiply2 = 0;
        int pMultiply3 = 0;
        int pMultiply5 = 0;

        while (nextUglyIndex < index){
            int min = Min(pUglyNumbers[pMultiply2] * 2, pUglyNumbers[pMultiply3] * 3, pUglyNumbers[pMultiply5] * 5);
            pUglyNumbers[nextUglyIndex] = min;

            while (pUglyNumbers[pMultiply2] * 2 <= pUglyNumbers[nextUglyIndex])
                ++pMultiply2;
            while (pUglyNumbers[pMultiply3] * 3 <= pUglyNumbers[nextUglyIndex])
                ++pMultiply3;
            while (pUglyNumbers[pMultiply5] * 5 <= pUglyNumbers[nextUglyIndex])
                ++pMultiply5;

            ++nextUglyIndex;
        }
        int ugly = pUglyNumbers[nextUglyIndex - 1];

        return ugly;

    }
    public static int Min(int number1, int number2, int number3){
        int min = (number1 < number2) ? number1 : number2;
        min = (min < number3) ? min : number3;

        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(GetUglyNumber(num));
    }
}
