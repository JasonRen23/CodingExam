package Autumn_2018.alibaba;
import java.util.*;

public class Main2 {

/** ������������������ʵ����ĿҪ��Ĺ��� **/
        /** ��Ȼ����Ҳ���Բ��������ģ����������ȫ�����Լ����뷨�� ^-^  **/
	public static int leastBricks(List < List < Integer >> wall) {
        HashMap < Integer, Integer > map = new HashMap < > ();
        for (List < Integer > row: wall) {
            int sum = 0;
            for (int i = 0; i < row.size() - 1; i++) {
                sum += row.get(i);
                if (map.containsKey(sum))
                    map.put(sum, map.get(sum) + 1);
                else
                    map.put(sum, 1);
            }
        }
        int res = wall.size();
        for (int key: map.keySet())
            res = Math.min(res, wall.size() - map.get(key));
        return res;
    }

        public static void main(String[] args){
            List<List<Integer>> vecvecRes = new ArrayList<List<Integer>>();
            List<Integer> list = new ArrayList<Integer>();
            Scanner in = new Scanner(System.in);
            int res=-1;

            int row = 0;


            row = Integer.parseInt(in.nextLine().trim());
            int i=0;
            while(i<row){

                int a =Integer.parseInt(in.nextLine().trim());
                if(a==0){
                    vecvecRes.add(list);
                    list=new ArrayList<Integer>();
                    i++;
                }else{
                    list.add(a);
                }

            }
            res= leastBricks(vecvecRes);

            System.out.print(res);

        }
    }