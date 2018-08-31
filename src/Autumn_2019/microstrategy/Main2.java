package Autumn_2019.microstrategy;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> num = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            num.add(sc.nextInt());
        }
        System.out.println(count(num));
    }

    static int count(List<Integer> numbers) {
        Map<Integer, Integer> map = new HashMap<>();
        int ret = 0;
        int temp;
        for (int i = 0; i < numbers.size(); i++) {
            temp = numbers.get(i);
            if(map.containsKey(temp) && map.get(temp) <= 1) {
                ret++;
            }
            map.put(temp, map.getOrDefault(temp, 0) + 1);

        }
        return ret;
    }
}
