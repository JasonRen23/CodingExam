package Autumn_2019.baidu_interview.SingletonPack;

/**
 * @author : JasonRen
 * @date : 2018/08/16
 * @email : zhicheng_ren@163.com
 */
public class Singleton5 {
    private static class SingletonHolder {
        private static final Singleton5 INSTANCE = new Singleton5();
    }
    private Singleton5() {}
    public static final Singleton5 getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
