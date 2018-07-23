package Autumn_2018.alibaba;


import java.util.*;


public class Main1 {
	 class UnionFind {
	        private int count = 0;
	        private int[] parent, rank;
	        
	        public UnionFind(int n) {
	            count = n;
	            parent = new int[n];
	            rank = new int[n];
	            for (int i = 0; i < n; i++) {
	                parent[i] = i;
	            }
	        }
	        public int find(int p) {
	        	while (p != parent[p]) {
	                parent[p] = parent[parent[p]];    // path compression by halving
	                p = parent[p];
	            }
	            return p;
	        }
	        public void union(int p, int q) {
	            int rootP = find(p);
	            int rootQ = find(q);
	            if (rootP == rootQ) return;
	            if (rank[rootQ] > rank[rootP]) {
	                parent[rootP] = rootQ;
	            }
	            else {
	                parent[rootQ] = rootP;
	                if (rank[rootP] == rank[rootQ]) {
	                    rank[rootP]++;
	                }
	            }
	            count--;
	        }
	        
	        public int count() {
	            return count;
	        }
	 }
/** ������������������ʵ����ĿҪ��Ĺ��� **/
 /** ��Ȼ����Ҳ���Բ��������ģ����������ȫ�����Լ����뷨�� ^-^  **/
  public  int findCircleNum(int[][] M) {

    	 
    	        int n = M.length;
    	        UnionFind uf = new UnionFind(n);
    	        for (int i = 0; i < n - 1; i++) {
    	            for (int j = i + 1; j < n; j++) {
    	                if (M[i][j] == 1) uf.union(i, j);
    	            }
    	        }
    	        return uf.count();
    	   
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int res;

        int _M_rows = 0;
        int _M_cols = 0;
        _M_rows = Integer.parseInt(in.nextLine().trim());
        _M_cols = Integer.parseInt(in.nextLine().trim());

        int[][] _M = new int[_M_rows][_M_cols];
        for(int _M_i=0; _M_i<_M_rows; _M_i++) {
            String row_x=String.valueOf(in.nextLine().trim());
            String[] row_y=row_x.split(",");
            for(int _M_j=0; _M_j<_M_cols; _M_j++) {
                _M[_M_i][_M_j] = Integer.parseInt(row_y[_M_j]);

            }
        }

        if(in.hasNextLine()) {
            in.nextLine();
        }
        Main1 haha = new Main1();
        res = haha.findCircleNum(_M);
        System.out.println(String.valueOf(res));

    }
}