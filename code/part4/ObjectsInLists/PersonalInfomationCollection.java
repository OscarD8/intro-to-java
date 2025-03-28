package part4.ObjectsInLists;

import java.util.Random;

public class PersonalInfomationCollection
{
    private static Random random = new Random();
    private String firstName;
    private String lastName;
    private String idNumber;

    public PersonalInfomationCollection(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        idFormat();
    }

    public void idFormat() {
        this.idNumber = String.format("%04d", random.nextInt(10000));
    }

    @Override
    public String toString() {
        return this.firstName + " " + this.lastName;
    }
}
