package Autumn_2019.baidu_interview.Sort;

/**
 * @author : JasonRen
 * @date : 2018/08/16
 * @email : zhicheng_ren@163.com
 */
public abstract class Sort<T extends Comparable<T>> {
    public abstract void sort(T[] nums);

    protected boolean less(T v, T w){
        return v.compareTo(w) < 0;
    }

    protected void swap(T[] a, int i, int j) {
        T t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}
