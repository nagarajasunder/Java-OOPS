import java.util.ArrayList;
import java.util.List;

public class Generics {

    public static void main(String[] args) {


        Generics2<C> obj2 = new Generics2<>();
    }
}

class C implements Y {

    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }

    @Override
    public void method3() {

    }
}

class GenericsImpl<T extends Comparable<T>> {

    public void add(List<? extends Number> numbers) {
        for (Number n : numbers) {
            if (n instanceof Integer) {
                System.out.println("Integer " + n.intValue());
            } else if (n instanceof Float) {
                System.out.println("Float " + n.floatValue());
            } else if (n instanceof Double) {
                System.out.println("Double " + n.doubleValue());
            } else if (n instanceof Byte) {
                System.out.println("Byte " + n.byteValue());
            } else if (n instanceof Long) {
                System.out.println("Long " + n.longValue());
            }
        }
    }

    public void printList(List<? extends Number> list) {
        for (Number t : list) {
            System.out.println(t);
        }
    }

    public int countGreaterThan(T[] arr, T elem) {
        int ct = 0;
        for (T i : arr) {
            if (i.compareTo(elem) > 0) {
                ct++;
            }
        }

        return ct;
    }

    T val;

    public void add(Number n) {

    }


}

class Generics2<T extends X> {

    T val;

    public void temp(T val) {
        this.val = val;

    }

    public void temp2(List<? extends C> val)
    {
        val.get(0).method3();
    }

}

interface X {
    public void method1();

}


interface Y extends X {
    public void method2();

    public void method3();
}
