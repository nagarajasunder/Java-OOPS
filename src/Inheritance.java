public class Inheritance {

    public static void main(String[] args) {

        Manager man = new Manager(1, "Arjun", 50000);
        man.setBonus(5000);
        var staff = new Employee[3];
        staff[0] = man;
        staff[1] = new Employee(2, "Sudhan", 25000);
        staff[2] = new Employee(3, "Rahul", 20000);

        for (Employee e : staff) {
            System.out.println("The salary of " + e.getEmployeeName() + " is " + e.getSalary());
        }


    }


}

class Employee {
    private int employeeId;
    private String employeeName;
    private int salary;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        if (salary > 0) {
            this.salary = salary;
        }
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        if (employeeId > 0) {
            this.employeeId = employeeId;
        }
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        if (employeeName != null && employeeName.length() > 8) {
            this.employeeName = employeeName;
        }
    }

    public Employee(int empId, String eName, int salary) {
        setEmployeeId(empId);
        setEmployeeName(eName);
        setSalary(salary);
    }



}

class Manager extends Employee {


    private int bonus;

    public Manager(int empId, String eName, int Salary) {
        super(empId, eName, Salary);
    }


    public int getBonus() {
        return bonus;
    }


    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int getSalary() {
        return super.getSalary() + getBonus();
    }




}
