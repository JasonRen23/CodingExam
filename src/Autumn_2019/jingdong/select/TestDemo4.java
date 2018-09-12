package Autumn_2019.jingdong.select;

public class TestDemo4 {
    public static void main(String[] args) {
        System.out.println(Test3.a);
    }
}

class Test3 {
    static {
        System.out.print("OK");
    }
    public static final String a = new String("JD");
}
