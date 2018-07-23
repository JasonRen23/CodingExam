package Spring_2019.jingdong;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Main3 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = Integer.valueOf(sc.nextLine());
        List<String> ret = new ArrayList<>();
        for(int index = 0; index < n; index++){
            String str = sc.nextLine();
//            ret.add(solve1(str));
            ret.add(solve2(str));
        }

            for(String s : ret){
                System.out.println(s);
            }

    }

    public static String solve1(String str){


            Stack<Character> st = new Stack<>();
            if(str.length() % 2 != 0){
                return "No";
            }
            if(str.length() == 2){
                if(str.charAt(0) == '(' && str.charAt(1) == ')'){
                    return "No";
                }
            }
            int i;
            boolean flag = false;
            int n = str.length();
            for(i = 0; i < n; i++) {
                if(str.charAt(i) == '(') {
                    st.push('(');
                } else {
                    if(!st.empty()) st.pop();
                    else {
                        if(flag) break;
                        flag = true;
                        st.push('(');
                    }
                }
            }

            if(i == n) {
                if(!flag) {
                    if(st.empty()) return "Yes";
                    else return "No";
                }
                else {
                    if(st.size() != 2) return "No";
                    else return "Yes";
                }
            }
            else return "No";

    }

    public static String solve2(String str){
        char[] chars = str.toCharArray();
        int lCnt = 0, rCnt = 0;
        for(char c : chars){
            if(c == '(') lCnt++;
            else rCnt++;
        }

        if(lCnt != rCnt) return "No";
        if(str.length() == 2){
            if(str.charAt(0) == '(' && str.charAt(1) == ')'){
                return "No";
            }
        }
        for(int i = 1; i < chars.length; i++){
            for(int j = 0; j < i; j++){
                swap(chars, i, j);
                if(isPalindrome(chars)) return "Yes";
                swap(chars, i, j);
            }
        }
        return "No";
    }

    private static boolean isPalindrome(char[] chars){
        int cnt = 0;
        for(char c : chars){
            if(c == '(') cnt++;
            else {
                if(cnt <= 0) return false;
                cnt--;
            }

        }
        return cnt == 0;
    }
    public static void swap(char[] str, int i, int j){
        char tmp = str[i];
        str[i] = str[j];
        str[j] = tmp;
    }



}

