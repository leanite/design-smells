package encapsulation.deficient.before;

public class Demo {
    public static void main(String[] args) {
        // ...
        Person person = new Person();
        person.age = 18;

        if (person.age >= 0) {
            // ...
        }
    }
}
