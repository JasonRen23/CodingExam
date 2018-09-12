package Autumn_2019.jingdong.select;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;

public class NotInitialization {
    public static void main(String[] args) {
        System.out.println(SubClass.value);
        ThreadPoolExecutor
    }
}
class SuperClass {
    static {
        System.out.println("SuperClass init!");
    }
    public final static int value = 123;
}

class SubClass extends SuperClass {
    static {
        System.out.println("SubClass init!");
    }
}

