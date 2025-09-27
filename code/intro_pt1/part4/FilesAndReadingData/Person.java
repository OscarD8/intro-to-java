package intro_pt1.part4.FilesAndReadingData;

public class Person
{
    private final String personName;
    private final int personAge;
    private String personIdentifier;

    public Person(String name, int age) {
        this.personName = name;
        this.personAge = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "personName='" + personName + '\'' +
                ", personAge=" + personAge + "}";
    }
}
