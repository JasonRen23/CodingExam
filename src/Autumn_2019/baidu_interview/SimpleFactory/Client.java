package Autumn_2019.baidu_interview.SimpleFactory;

/**
 * @author : JasonRen
 * @date : 2018/08/16
 * @email : zhicheng_ren@163.com
 */
public class Client {
    public static void main(String[] args) {
        SimpleFactory simpleFactory = new SimpleFactory();
        Product product = simpleFactory.createProduct(1);
    }
}
