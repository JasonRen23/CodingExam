package Autumn_2019.bytedance_interview;

/**
 * 给一个有序的数组（不重复）和一个数target，找出数组中这个数的下标；
 * @author JasonRen
 * @since 2018/10/4 下午7:18
 */
public class Main1 {
    public static void main(String[] args) {
        int[] data = {2,4,5,7,9};
        System.out.println(binarySearch(data, 5));
        System.out.println(binarySearch(data, 1));
    }
    public static int binarySearch(int[] data, int target) {
        int low = 0;
        int high = data.length - 1;
        int mid = 0;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (data[mid] == target)
                return mid;
            else if(data[mid] < target)
                low++;
            else
                high--;
        }
        return -1;
    }
}
