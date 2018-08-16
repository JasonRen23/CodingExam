package Autumn_2019.baidu;

/**
 * @author : JasonRen
 * @date : 2018/08/16
 * @email : zhicheng_ren@163.com
 */
public class Test {
    public static int binarySearch(int[] arr, int target) {
        //不在数组范围内
        if (target < arr[0] || target > arr[arr.length - 1]) {
            return -1;
        }
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                low++;
            } else {
                high--;
            }
        }

        //在数组范围内但是没有相等的数
        if (target != arr[low + 1]) {
            return -1;
        }

        return low + 1;


    }


    public static void main(String[] args) {
        int[] a = {1, 4, 6, 7};
        System.out.println(binarySearch(a, 4));
        System.out.println(binarySearch(a, 6));
        System.out.println(binarySearch(a, 8));
        System.out.println(binarySearch(a, 0));
        System.out.println(binarySearch(a, 5));


        int[] b = {3, 5, 8, 9};
        System.out.println(binarySearch(b, 8));
    }
}
