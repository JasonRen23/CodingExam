package Autumn_2019.baidu_interview.SingletonPack;

/**
 * @author : JasonRen
 * @date : 2018/08/16
 * @email : zhicheng_ren@163.com
 */
public class Singleton4 {
    private volatile static Singleton4 instance;
    private Singleton4() {}
    public static Singleton4 getInstance() {
        if (instance == null) {
            synchronized (Singleton4.class) {
                if (instance == null) {
                    instance = new Singleton4();
                }
            }
        }
        return instance;
    }
}
