package Autumn_2019.ctrip_interview;

public class Singleton1 {
    private static class SingletonHolder {
        private final static Singleton1 INSTANCE = new Singleton1();
    }
    private Singleton1() {}
    public static final Singleton1 getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
