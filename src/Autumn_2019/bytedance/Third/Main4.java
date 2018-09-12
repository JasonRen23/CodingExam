package Autumn_2019.bytedance.Third;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] data = new int[N];
        for (int i = 0; i < N; i++) {
            data[i] = sc.nextInt();
        }
        System.out.println(validate(data));
    }

    public static int validate(int[] data) {
        if (data == null || data.length == 0) return 0;
        int i = 0;
        while (i < data.length) {
            int cur = data[i++];
            int bytes = 0;
            for (int j = 7; j >= 3; j--) {
                if ((cur & (1 << j)) != 0) bytes++;
                else break;
            }
            if (bytes > 4 || bytes == 1) return 0;
            while (bytes - 1 > 0) {
                if (i >= data.length || (data[i] & (1 << 7)) == 0 || (data[i] & (1 << 6)) != 0) {
                    return 0;
                }
                bytes--;
                i++;
            }
        }
        return 1;
    }
}
