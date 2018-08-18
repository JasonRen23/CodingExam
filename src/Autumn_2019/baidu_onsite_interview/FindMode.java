package Autumn_2019.baidu_onsite_interview;

//寻找无序数组的众数，即出现次数大于N/2的数字
public class FindMode {
    public static int findMode(int[] num) {
        int count = 0;
        int candidate = 0;
        for (int i = 0; i < num.length; i++) {
            //目前得到的数出现次数为0时，更换另一个数
            if (count == 0) {
                candidate = num[i];
                count = 1;
            } else {
                if (candidate == num[i]) {
                    //相同+1
                    count++;
                } else {
                    //不同-1
                    count--;
                }
            }

        }


        count = 0;
        for (int i = 0; i < num.length; i++) {
            if (candidate == num[i]) {
                count++;
            }
        }

        if (count > num.length / 2) {
            return candidate;
        } else {
            return -1;
        }

    }


    public static void main(String[] args) {
        int[] num = {2, 3, 4, 3, 3, 4, 3, 3, 5};
        System.out.println(findMode(num));
    }
}
