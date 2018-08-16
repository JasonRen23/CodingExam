package Autumn_2019.baidu_interview.SingletonPack;

/**
 * @author : JasonRen
 * @date : 2018/08/16
 * @email : zhicheng_ren@163.com
 */

//饿汉式，线程安全
public class Singleton1 {
    private static Singleton1 instance = new Singleton1();

    private Singleton1() {}
    private static Singleton1 getInstance() {
        return instance;
    }
}
