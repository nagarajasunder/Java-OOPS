public class PolyMorphism {

    public int sum(int a, int b) {
        return a + b;
    }

    public float sum(float a, float b) {
        return a + b;
    }

    public float sum(int a, float b) {
        return a + b;
    }

    public float sum(float a, int b) {
        return a + b;
    }


    public void print(Integer a) {
        System.out.println(a);
    }

    public void print(String a) {
        System.out.println(a);
    }

    public static void main(String[] args) {

        Integer a = null;

        PolyMorphism p = new PolyMorphism();
        p.print(a);
    }
}


