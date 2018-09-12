package Autumn_2019.jingdong.select;

public class TestDemo3 {
    public static void main(String[] args) {
        System.out.println(B.c);
    }
}

class A {
    static {
        System.out.println("A");
    }
}

class B extends A {
    static {
        System.out.println("B");
    }

    public final static String c = new String("C");
}

