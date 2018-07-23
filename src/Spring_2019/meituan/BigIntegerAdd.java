package Spring_2019.meituan;

import java.util.Scanner;

public class BigIntegerAdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String strLine = in.nextLine();
        String[] str = strLine.split(" ");

        if(!checkInput(str[0]) || !checkInput(str[1])){
            System.out.println("Error");
            return;
        }

        int carry = 0;
        StringBuilder sb = new StringBuilder();
        int i, j;
        for(i = Math.max(str[0].length() - 1, j = str[1].length() - 1); i >= 0 || j >= 0; i--, j--){
            int num1 = i >= 0 ? str[0].charAt(i) - '0' : 0;
            int num2 = j >= 0 ? str[1].charAt(j) - '0' : 0;
            int ret = (num1 + num2 + carry) % 10;
            carry = (num1 + num2 + carry) / 10;
            sb.append(ret);
        }



        if(carry != 0){
            sb.append(1);
        }
        sb.reverse();
        System.out.println(sb.toString());


    }

    public static boolean checkInput(String str){
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) > '9' || str.charAt(i) < '0'){
                return false;
            }
        }
        return true;
    }
}
