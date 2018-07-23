package Spring_2019.helper;

import java.util.HashSet;
import java.util.Set;

public class MyClass {
    Integer i;
    public MyClass(Integer y){
        i = y;
    }
    public boolean equals(MyClass c){
        return false;
    }
    @Override
    public boolean equals(Object o){
        return true;
    }
    @Override
    public int hashCode(){
        return 32;
    }
    public static void main(String[] args) {
        Set<MyClass> myset = new HashSet<>();
        myset.add(new MyClass(3));
        myset.add(new MyClass(4));
        myset.add(new MyClass(5));
        System.out.println(myset.size());
    }
}
