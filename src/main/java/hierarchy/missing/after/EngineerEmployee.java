package hierarchy.missing.after;

public class EngineerEmployee extends Employee {
    //...

    public EngineerEmployee(String name, Salary salary) {
        super(name, salary);
    }

    // ...

    @Override
    public float getMonthlySalary() {
        return salary.getBase();
    }
}
