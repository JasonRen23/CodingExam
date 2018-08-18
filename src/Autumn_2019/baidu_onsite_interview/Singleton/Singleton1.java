package Autumn_2019.baidu_onsite_interview.Singleton;

//懒汉式，线程不安全
public class Singleton1 {
    private static Singleton1 singleton1;
    private Singleton1(){}
    public static Singleton1 getInstance() {
        if (singleton1 == null) {
            singleton1 = new Singleton1();
        }
        return singleton1;
    }
}
