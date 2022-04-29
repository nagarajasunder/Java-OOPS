import java.util.Iterator;

public class PeekingIterator implements Iterator<Integer> {

    public PeekingIterator(Iterator<Integer> iterator) {
        iterator.forEachRemaining(System.out::println);
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Integer next() {
        return null;
    }

    public static void main(String[] args)
    {

    }

}
