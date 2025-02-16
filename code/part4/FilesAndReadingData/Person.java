package code.part4.FilesAndReadingData;

public class Person
{
    private String personName;
    private int personAge;
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
