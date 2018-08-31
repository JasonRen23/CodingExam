package Autumn_2019.pinduoduo;

import java.util.Scanner;

//95%
public class Main41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] numLine = sc.nextLine().split(" ");
        int n = Integer.valueOf(numLine[0]);
        int l = Integer.valueOf(numLine[1]);

        String[] words = new String[n];
        for (int i = 0; i < n; i++) {
            words[i] = sc.nextLine();
        }


        int different_colum = 0;
        int last_different_col = 0;
        String answer = "";
        char backup = 'Z' + 1;
        for (int i = 0; i < l; i++){
            int same = 1;
            char curr_char = 'Z' + 1;
            char sec_smal = 'Z' + 1;
            for (int j = 0; j < n; j++){
                if (words[j].charAt(i) < curr_char){
                    sec_smal = curr_char;
                    curr_char = words[j].charAt(i);
                }
                else{
                    if (words[j].charAt(i) == curr_char)
                        same++;
                    if (words[j].charAt(i) < sec_smal){
                        sec_smal = words[j].charAt(i);
                    }
                }
            }
            answer += curr_char;
            if (same != n){
                different_colum++;
                last_different_col = i;
                backup = sec_smal;
            }
        }
        if (different_colum > 1){
            for (int i = 0; i < n; i++){
                if (answer == words[i]){
                    // answer.charAt(last_different_col) = backup;
                    StringBuilder strBuilder = new StringBuilder(answer);
                    strBuilder.setCharAt(last_different_col, backup);
                    answer=strBuilder.toString();
                    break;
                }
            }
            System.out.println(answer);
        }
        else
            System.out.println("-");

        // int different_column = 0;
        // String answer = "";
        //
        // for (int i = 0; i < l; i++){
        //     int same = 1;
        //     char curr_char = 'Z' + 1;
        //     for (int j = 0; j < n; j++){
        //         if (words[j].charAt(i) < curr_char)
        //             curr_char = words[j].charAt(i);
        //         else if (words[j].charAt(i) == curr_char)
        //             same++;
        //     }
        //     answer += curr_char;
        //     if (same != n)
        //         different_column++;
        // }
        // if (different_column>1)
        //     System.out.println(answer);
        // else
        //     System.out.println("-");
    }
}
