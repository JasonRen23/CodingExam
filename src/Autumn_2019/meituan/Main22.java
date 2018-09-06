package Autumn_2019.meituan;

import java.util.Scanner;

public class Main22 {
    /**
     * 作者：WAK
     * 链接：https://www.nowcoder.com/discuss/104554?type=0&order=0&pos=25&page=1
     * 来源：牛客网
     *
     * 小明拿到了一个数列a1 , a2 , ... an ，小明想知道存在多少个区间[l,r]同时满足下列两个条件：
     * 1、r-l+1=k;
     * 2、在a l , a l+1,...ar中，存在一个数至少出现了 t 次。
     * 输出满足条件的区间个数。
     * 思路：
     * 先判断n和k的关系，若k>n，直接返回0，若k<n，再进行后续计算
     * 设置一维数组lst[10005]，保存数列中值出现次数
     * 设置count，保存ar-al中出现t次及以上数的个数
     * 设置num,保存区间数
     * 首先从0到n-k-1遍历一遍，对lst、count、num进行初始化
     * 然后将窗口向右滑动，每次从头去一个，从尾部添加一个，动态维护lst、count、num的值
     * 最后输出num的值即可
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int t = sc.nextInt();
        int[] arr = new int[n];
        int[] lst = new int[100005];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 0;
        int sum = 0;
        for (int i = 0; i < k; i++) {
            lst[arr[i]]++;
            if (lst[arr[i]] == t)
                count++;
        }

        if (count > 0)
            sum++;
        for (int i = 0; i < n - k; i++) {
            lst[arr[i]]--;
            if (lst[arr[i]] == t - 1)
                count--;
            lst[arr[i + k]]++;
            if (lst[arr[i + k]] == t)
                count++;
            if (count > 0)
                sum++;
        }

        System.out.println(sum);

    }
}
