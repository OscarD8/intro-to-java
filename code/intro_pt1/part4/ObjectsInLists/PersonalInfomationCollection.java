package intro_pt1.part4.ObjectsInLists;

import java.util.Random;

public class PersonalInfomationCollection
{
    private static final Random random = new Random();
    private final String firstName;
    private final String lastName;
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
