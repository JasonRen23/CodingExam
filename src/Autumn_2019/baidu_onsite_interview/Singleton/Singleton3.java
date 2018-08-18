package Autumn_2019.baidu_onsite_interview.Singleton;

//饿汉式，线程不安全
public class Singleton3 {
    private static Singleton3 singleton3 = new Singleton3();
    private Singleton3() {}
    public static Singleton3 getInstance() {
        return singleton3;
    }
}
