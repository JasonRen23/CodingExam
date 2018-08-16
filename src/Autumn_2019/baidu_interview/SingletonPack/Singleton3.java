package Autumn_2019.baidu_interview.SingletonPack;

/**
 * @author : JasonRen
 * @date : 2018/08/16
 * @email : zhicheng_ren@163.com
 */
public class Singleton3 {
    private static Singleton3 instance;
    private Singleton3() {}
    public static synchronized Singleton3 getInstance() {
        if (instance == null) {
            instance = new Singleton3();
        }
        return instance;
    }
}
