package encapsulation.deficient.after;

public class Person {
    // ...
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("age cannot be negative");
        }

        this.age = age;
    }
}
