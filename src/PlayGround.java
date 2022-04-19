class X {
    public final void finalMethod() {
        System.out.println("Final method from X");
    }

    private void display() {
        System.out.println("This is from X");
    }
}

class Y extends X {
    private void display() {
        System.out.println("This is from Y");
    }

}

public class PlayGround {


    public static void main(String[] args) {
        X obj = new Y();
        obj.finalMethod();
    }
}