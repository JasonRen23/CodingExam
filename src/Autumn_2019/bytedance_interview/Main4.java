package Autumn_2019.bytedance_interview;

/**
 * 两个升序数组，找出第k小的数字
 * @author JasonRen
 * @since 2018/10/26 1:04 AM
 */
public class Main4 {
    public static void main(String[] args) {
        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4};
        System.out.println(findKth(nums1, 0, nums2,0, 4));
    }
    private static int findKth(int[] A, int ai, int[] B, int bi, int k) {
        //always assume that A's length is shorter than B
        if (A.length - ai > B.length - bi)
            return findKth(B, bi, A, ai, k);
        if (A.length - ai == 0) return B[bi + k - 1];
        if (k == 1) return Math.min(A[ai], B[bi]);

        //divide k into two parts
        int k1 = Math.min(k / 2, A.length - ai), k2 = k - k1;
        if (A[ai + k1 - 1] < B[bi + k2 - 1])
            return findKth(A, ai + k1, B, bi, k - k1);
        else if (A[ai + k1 - 1] > B[bi + k2 - 1])
            return findKth(A, ai, B, bi + k2, k - k2);
        else
            return A[ai + k1 - 1];
    }
}
