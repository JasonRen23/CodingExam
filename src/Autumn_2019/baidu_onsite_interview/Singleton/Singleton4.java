package Autumn_2019.baidu_onsite_interview.Singleton;

public class Singleton4 {
    private static volatile Singleton4 sinlgeton4;

    private Singleton4() {}

    public static Singleton4 getInstance() {
        if (sinlgeton4 == null) {
            synchronized (Singleton4.class) {
                if (sinlgeton4 == null) {
                    sinlgeton4 = new Singleton4();
                }
            }
        }
        return sinlgeton4;
    }
}
