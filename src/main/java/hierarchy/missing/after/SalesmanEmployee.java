package hierarchy.missing.after;

public class SalesmanEmployee extends Employee {
    //...

    public SalesmanEmployee(String name, Salary salary) {
        super(name, salary);
    }

    // ...

    @Override
    public float getMonthlySalary() {
        return salary.getBase() + salary.getCommission();
    }
}
