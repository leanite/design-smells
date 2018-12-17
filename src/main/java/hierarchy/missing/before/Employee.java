package hierarchy.missing.before;

public class Employee {

    private Type type;
    private String name;
    private float baseSalary;
    private float commission;
    private float bonusSalary;
    // ...

    public Employee(Type type, String name, float baseSalary) {
        this.type = type;
        this.name = name;
        this.baseSalary = baseSalary;
        // ...
    }

    // ...

    public void setCommission(float commission) {
        this.commission = commission;
    }

    public void setBonusSalary(float bonusSalary) {
        this.bonusSalary = bonusSalary;
    }

    public float getSalary() {
        float total = 0f;

        switch (type) {
            case SALESMAN:
                total = baseSalary + commission;
                break;
            case ENGINEER:
                total = baseSalary;
                break;
            case MANAGER:
                total = baseSalary * bonusSalary;
                break;
        }

        return total;
    }

    public enum Type {
        SALESMAN,
        ENGINEER,
        MANAGER
    }
}
