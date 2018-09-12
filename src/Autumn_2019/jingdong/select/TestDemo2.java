package Autumn_2019.jingdong.select;

import java.util.ArrayList;

public class TestDemo2 {
    public static ArrayList<String> list = new ArrayList<>();

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new TestDemo2().new MyThread();
        Thread t2 = new Thread(new TestDemo2().new MyRunnable());
        t1.setPriority(3);
        t2.setPriority(8);
        t1.start();
        t2.start();
        t2.join();

        for (int i = 0; i < 100000; i++) {
            i++;
        }
        list.add("main");

        t1.join();

        for (String s : list) {
            System.out.println(s);
        }

    }

    class MyThread extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < 100000; i++) {
                i++;
            }
            list.add("Thread1");
        }
    }

    class MyRunnable implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 100000; i++) {
                Thread.yield();
                i++;
            }
            list.add("Thread2");
        }
    }

}


