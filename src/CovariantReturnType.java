

public class CovariantReturnType {

    public static void main(String[] args) {
        new B().get().message();
    }
}

class A {


    public A get() {
        return new A();
    }

}

class B extends A {


    public B get() {
        return new B();
    }

    public void message() {
        System.out.println("This is a example of covariant return type");
    }
}


