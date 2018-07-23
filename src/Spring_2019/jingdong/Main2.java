package Spring_2019.jingdong;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.valueOf(sc.nextLine());
        for(int i = 0; i < n; i++){
            long num = Long.valueOf(sc.nextLine());
            if(num % 2 != 0){
                System.out.println("No");
                continue;
            }
            long index = 1;

            while (num % 2 == 0){
                index = index * 2;
                num = num / 2;
            }
            System.out.println(num+ " " + index);
        }
    }
}
