package Autumn_2019.baidu_interview.SingletonPack;

/**
 * @author : JasonRen
 * @date : 2018/08/16
 * @email : zhicheng_ren@163.com
 */
//懒汉式，线程不安全
public class Singleton2 {
   private static Singleton2 instance;

   private Singleton2() {
    }

    public static Singleton2 getInstance() {
       if (instance == null) {
           instance = new Singleton2();
       }
       return instance;
    }

}
