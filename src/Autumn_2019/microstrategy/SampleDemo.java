package Autumn_2019.microstrategy;

 class sample implements Runnable{
    private Thread t;
    private String threadName;

    public sample(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        while (true)
            System.out.println(threadName);
    }

    public void start() {
        if (t == null) {
            t = new Thread(this, threadName);
            t.start();
        }
    }


}

public class SampleDemo {
    public static void main(String[] args) {
        sample A = new sample("A");
        sample B = new sample("B");

        B.start();
        A.start();
    }
}

