package Spring_2019.jingdong;

import java.util.Scanner;
import java.util.Stack;

public class JD3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String[] strings = new String[N];
        for (int i = 0; i < N; i++) {
            strings[i] = scanner.next();
        }

        for (int i = 0; i < N; i++) {
            String input = strings[i];
            char[] chars = input.toCharArray();
            int lCnt = 0, rCnt = 0;
            for(char c : chars){
                if(c == '(') lCnt++;
                else rCnt++;
            }
            if(lCnt != rCnt) System.out.println("No");
            Stack<Character> stack = new Stack<>();
            for (int j = 0; j < input.length(); j++) {
                if (input.charAt(j) == '(') {
                    stack.push(input.charAt(i));
                    continue;
                }
                if (input.charAt(j) == ')') {
                    if (stack.isEmpty()) {
                        stack.push(input.charAt(i));
                        continue;
                    } else {
                        stack.pop();
                    }
                }
            }
            if (stack.size() == 2 || stack.size() == 0){
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }

}
