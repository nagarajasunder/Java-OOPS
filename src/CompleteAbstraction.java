public class CompleteAbstraction {


}

interface Species {
    String sound();

    String feed();

}

interface x {
    default void display() {

    }
}

class B1 implements Species, x {

    @Override
    public void display() {

    }


    @Override
    public String sound() {
        return null;
    }

    @Override
    public String feed() {
        return null;
    }
}


