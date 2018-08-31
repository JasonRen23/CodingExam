package Autumn_2019.ctrip_interview;

public class Singleton2 {
    private static volatile Singleton2 singleton;

    private Singleton2() {}

    private static Singleton2 getInstance() {
        if (singleton == null) {
            synchronized (Singleton2.class) {
                if (singleton == null) {
                    singleton = new Singleton2();
                }
            }
        }
        return singleton;
    }
}
