import org.w3c.dom.ls.LSOutput;

public class MethodOverriding {


    public static void main(String[] args) {

        Resource r1 = new Programmer(1, "Mitch", 8000);
        Resource r2 = new Lead(2, "Philip", 12000);

        System.out.println(r1.getBaseSalary());
        System.out.println(r2.getBaseSalary());
    }

}

class Resource {
    private final int resID, baseSalary;

    private final String resName;


    public Resource(int resId, String resName, int baseSalary) {
        this.resID = resId;
        this.resName = resName;
        this.baseSalary = baseSalary;
    }


    public int getResID() {
        return resID;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public String getResName() {
        return resName;
    }
}

class Programmer extends Resource {

    public Programmer(int resId, String resName, int baseSalary) {
        super(resId, resName, baseSalary);
    }

    public int getBaseSalary() {
        return super.getBaseSalary() + 2000;
    }
}

class Lead extends Resource {
    public Lead(int resId, String resName, int baseSalary) {
        super(resId, resName, baseSalary);
    }

    public int getBaseSalary() {
        return super.getBaseSalary() + 4000;
    }
}