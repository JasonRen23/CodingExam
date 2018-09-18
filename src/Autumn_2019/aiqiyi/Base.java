package Autumn_2019.aiqiyi;

public class Base {
    public static void main(String[] args) {
        int a = 6;
        int b = 0;
        try {
            System.out.println("try");
            a = a / b;
            throw new Exception();
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
        } catch (Exception e) {
            System.out.println("Exception");
        } finally {
            System.out.println("finally");
        }

        System.out.println("end");
    }
}
