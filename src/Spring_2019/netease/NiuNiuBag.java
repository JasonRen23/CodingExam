package Spring_2019.netease;



import Spring_2019.helper.Pair;

import java.util.*;


public class NiuNiuBag {
    static HashMap<Pair<Integer, Integer>, Integer> map = new HashMap<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int n = sc.nextInt();
        int w = sc.nextInt();
        int[] v = new int[n];
        for(int i = 0; i < n; i++)
            v[i] = sc.nextInt();
        System.out.println(helper(v, w, 0));
    }

    static int helper(int[] v, int w, int index){
        if(w < 0) return 0;
        if(index == v.length) return w >= 0 ? 1 : 0;
        Pair<Integer, Integer> status = new Pair<>(w, index);
        if(map.containsKey(status)) return map.get(status);
        int ret = helper(v, w, index + 1) + helper(v, w - v[index], index + 1);
        map.put(status, ret);
        return ret;
    }
}
