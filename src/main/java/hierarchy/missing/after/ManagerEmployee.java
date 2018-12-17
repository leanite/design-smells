package hierarchy.missing.after;

public class ManagerEmployee extends Employee {
    //...

    public ManagerEmployee(String name, Salary salary) {
        super(name, salary);
    }

    // ...

    @Override
    public float getMonthlySalary() {
        return salary.getBase() + salary.getBonus();
    }
}
