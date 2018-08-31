package Autumn_2019.pinduoduo;

import java.util.Scanner;

public class Main11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hp = sc.nextInt();
        int normal_attack = sc.nextInt();
        int buffer_attack = sc.nextInt();
        int turns_need = 0;

        if ((normal_attack * 2) >= buffer_attack) {
            turns_need = (hp + normal_attack - 1) / normal_attack;
        } else {
            turns_need = hp / buffer_attack;
            turns_need = turns_need * 2;
            int reserve = hp % buffer_attack;
            if (reserve > 0) {
                if (reserve <= normal_attack)
                    turns_need = turns_need + 1;
                else
                    turns_need = turns_need + 2;
            }
        }

        System.out.println(turns_need);
    }
}
