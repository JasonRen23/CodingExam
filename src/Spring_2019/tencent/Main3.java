package Spring_2019.tencent;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main3 {
    static class Node{
        int time, level;
        Node(int time, int level){
            this.time = time;
            this.level = level;
        }
        Node(){
            this.time = 0;
            this.level = 0;
        }
    }

    static class cmp implements Comparator<Node>{
        @Override
        public int compare(Node a, Node b){
            if(a.time == b.time){
                return b.level - a.level;
            }
            return b.time - a.time;
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        Node[] task = new Node[m + 1];
        Node[] machine = new Node[n + 1];

        machine[0] = new Node(Integer.MAX_VALUE, Integer.MAX_VALUE);
        for (int i = 1; i <= n; i++)
        {
            int time = sc.nextInt();
            int level = sc.nextInt();
            machine[i] = new Node(time, level);

        }
        task[0] = new Node(Integer.MAX_VALUE, Integer.MAX_VALUE);
        for (int i = 1; i <= m; i++)
        {
            int time = sc.nextInt();
            int level = sc.nextInt();
            task[i] = new Node(time, level);

        }

        Arrays.sort(machine, new cmp());
        Arrays.sort(task, new cmp());

        int j = 1, cnt[] = new int[105], maxm = 0;
        long ans = 0;
        for (int i = 1; i <= m; i++){
            while (j <= n && task[i].time <= machine[j].time){
                cnt[machine[j].level]++;
                j++;
            }
            for (int k = task[i].level; k <= 100; k++){
                if (cnt[k] != 0){
                    maxm++;
                    ans += task[i].time * 200 + task[i].level * 3;
                    cnt[k]--;
                    break;
                }
            }
        }

        System.out.println(maxm + " " + ans);


    }
}
