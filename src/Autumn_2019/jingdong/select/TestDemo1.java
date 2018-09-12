package Autumn_2019.jingdong.select;

public class TestDemo1 {
    public static void main(String[] args) {
        System.out.println(Test2.a);
    }
}

class Test2 {
    public static final String a = new String("JD");

    static {
        System.out.print("OK");
    }
}
