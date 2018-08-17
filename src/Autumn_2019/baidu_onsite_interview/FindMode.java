package Autumn_2019.baidu_onsite_interview;

//
public class FindMode {
    public static int findMode(int[] num) {
        int count = 0;
        int candidate = 0;
        for (int i = 0; i < num.length; i++) {
            if (count == 0) {
                candidate = num[i];
                count = 1;
            } else {
                if (candidate == num[i]) {
                    count++;
                } else {
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
