package Spring_2019.netease;



import java.util.*;

public class NiuFindJob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        Pair[] arr = new Pair[N];
        for(int i = 0; i < N; i++)
            arr[i] = new Pair(sc.nextInt(), sc.nextInt());

        Arrays.sort(arr, new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {
                return o1.di - o2.di;
            }
        });
        int[] ans = new int[N];
        ans[0] = arr[0].pi;
        for(int i = 1; i < arr.length; ++i){
            ans[i] = Math.max(arr[i].pi, ans[i - 1]);
        }



        for(int i = 0; i < M; i++){
            int target = sc.nextInt();
            int indexRet = binarySearch(arr, target);
            System.out.println(indexRet < 0 ? 0 : ans[indexRet]);
        }

    }

    public static int binarySearch(Pair[] A, int target){
        int lo = 0;
        int hi = A.length - 1;
        int mid;
        while (lo <= hi){
            mid = lo + (hi - lo) / 2;
            if(A[mid].di == target){
                return mid;
            }else if(A[mid].di < target){
                lo = mid + 1;
            }else {
                hi = mid - 1;
            }
        }
        return lo - 1;
    }

    static class Pair{
        public int di;
        public int pi;
        Pair(){
            di = 0;
            pi = 0;
        }
        Pair(int di, int pi){
            this.di = di;
            this.pi = pi;
        }
    }


}