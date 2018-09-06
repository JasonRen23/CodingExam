package Autumn_2019.meituan;

import java.util.Scanner;

/**
 * 作者：WAK
 * 链接：https://www.nowcoder.com/discuss/104554?type=0&order=0&pos=25&page=1
 * 来源：牛客网
 * <p>
 * 给定一张包含N个点、N-1条边的无向连通图，节点从1到N编号，每条边的长度均为1。假设你从1号节点出发并打算遍历所有节点，那么总路程至少是多少？
 * 输入
 * 第一行包含一个整数N，1≤N≤100000。
 * 接下来N-1行，每行包含两个整数X和Y，表示X号节点和Y号节点之间有一条边，1≤X，Y≤N。
 * 输出
 * 输出总路程的最小值。
 * 例子：
 * 输入：
 * 4
 * 1 2
 * 1 3
 * 3 4
 * 输出：
 * 4
 * 思路：走完所有节点类似于深度优先搜索，也就是说除了最后一条路径外，别的路径都经历了正着走，再返回
 * 的过程，也就是两遍，设最后一条路径为x，总分支数为n-1，总路径=2*(n-1-x)+x=2*n-2-x，当x最大时
 * 总路径最小，所以转化为求二叉树的深度。
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.valueOf(sc.nextLine());
        int[] lst = new int[100005];

        for (int i = 0; i < n - 1; i++) {
            String[] line = sc.nextLine().split(" ");
            int from = Integer.valueOf(line[0]);
            int to = Integer.valueOf(line[1]);
            lst[to] = lst[from] + 1;
        }

        int depth = 0;
        for (int i = 1; i <= n; i++) {
            depth = lst[i] > depth ? lst[i] : depth; //找到最大值
        }

        System.out.println(2 * (n - 1) - depth);


    }


}

