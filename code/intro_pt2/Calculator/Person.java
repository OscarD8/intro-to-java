package intro_pt2.Calculator;

public class Person
{
    private String name;
    private int age;

    public Person(String name, int age) {
        validateName(name);
        validateAge(age);
        this.age = age;
        this.name = name;
    }

    private void validateName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name must not be null or empty.");
        }
        if (name.length() > 40) {
            throw new IllegalArgumentException("Name must not exceed 40 characters.");
        }
    }

    private void validateAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age must not be negative.");
        }
        if (age > 120) {
            throw new IllegalArgumentException("Age must not exceed 120.");
        }
    }
}
