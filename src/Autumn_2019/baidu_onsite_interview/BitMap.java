package Autumn_2019.baidu_onsite_interview;

import java.util.Comparator;

public class BitMap {
    //保存数据
    private byte[] bits;

    //能够存储多少数据
    private int capacity;


    private BitMap(int capacity) {
        this.capacity = capacity;

        //1byte能存储8个数据，那么capacity数据需要多少个bit呢，capacity/8 + 1，右移3位相当于除以8
        bits = new byte[(capacity >> 3) + 1];
    }

    private void add(int num) {
        //num/8得到byte[]的index
        int arrayIndex = num >> 3;

        //num%8得到byte[index]的位置
        int position = num & 0x07;

        //将1左移position后，那个位置自然就是1，然后和以前的数据做|
        bits[arrayIndex] |= 1 << position;
    }

    private void clear(int num) {
        //num/8得到byte[]的index
        int arrayIndex = num >> 3;

        //num%8得到在byte[]的位置
        int position = num & 0x07;

        //将1左移position后，那个位置自然就是1，然后取反，再与当前值做与
        bits[arrayIndex] &= ~(1 << position);
    }

    private boolean contain(int num) {
        //num/8得到byte[]的index
        int arrayIndex = num >> 3;

        //num%8得到在byte[index]的位置
        int position = num & 0x07;

        //将1左移position后，那个位置自然就是1，然后和以前的位置做&，判断是否为0
        return (bits[arrayIndex] & (1 << position)) != 0;
    }

    public static void main(String[] args) {
        BitMap bitMap = new BitMap(100);
        bitMap.add(7);
        System.out.println("插入7成功");

        boolean isExist = bitMap.contain(7);
        System.out.println("7是否存在:" + isExist);

        bitMap.clear(7);

        isExist = bitMap.contain(7);
        System.out.println("7是否存在:" + isExist);

    }

}
