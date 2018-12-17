package hierarchy.missing.after;

public abstract class Employee {

    protected String name;
    protected Salary salary;
    // ...

    public Employee(String name, Salary salary) {
        this.name = name;
        this.salary = salary;
        // ...
    }

    // ...

    public abstract float getMonthlySalary();
}
